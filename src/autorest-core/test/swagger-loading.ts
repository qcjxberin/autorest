import { suite, test, slow, timeout, skip, only } from "mocha-typescript";
import * as assert from "assert";

import { AutoRestConfigurationManager } from "../lib/configuration/configuration";
import { DataStore } from "../lib/data-store/data-store";
import { LoadLiterateSwagger } from "../lib/pipeline/swagger-loader";
import { CreateConfiguration } from "../legacyCli";
import { LoadLiterateSwaggers, ComposeSwaggers } from "../lib/pipeline/swagger-loader";

@suite class SwaggerLoading {
  @test @timeout(0) async "external reference resolving"() {
    const dataStore = new DataStore();
    const swaggerFile = await LoadLiterateSwagger(
      dataStore.CreateScope("input").AsFileScopeReadThrough(),
      "https://raw.githubusercontent.com/Azure/azure-rest-api-specs/master/arm-network/2016-12-01/swagger/applicationGateway.json",
      dataStore.CreateScope("work"));
    const swaggerObj = await swaggerFile.ReadObject<any>();

    // check presence of SubResource (imported from "./network.json")
    assert.strictEqual(swaggerObj.definitions.SubResource != null, true);
  }

  @test @timeout(0) async "composite Swagger"() {
    const dataStore = new DataStore();

    const config = await CreateConfiguration("file:///", dataStore.CreateScope("input").AsFileScopeReadThrough(),
      [
        "-i", "https://raw.githubusercontent.com/Azure/azure-rest-api-specs/master/arm-network/compositeNetworkClient.json",
        "-m", "CompositeSwagger"
      ]);
    assert.strictEqual(config["input-file"].length, 16);

    // load Swaggers
    const configMgr = new AutoRestConfigurationManager(config, "file:///config.yaml")
    const swaggers = await LoadLiterateSwaggers(
      dataStore.CreateScope("input").AsFileScopeReadThrough(),
      configMgr.inputFileUris, dataStore.CreateScope("loader"));

    // compose Swaggers
    const swagger = await ComposeSwaggers({}, swaggers, dataStore.CreateScope("compose"), true);
  }
}