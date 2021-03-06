/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import fixtures.http.models.Error;
import fixtures.http.models.ErrorException;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpServerFailures.
 */
public interface HttpServerFailures {
    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    Error head501();

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Error> head501Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    Observable<Error> head501Async();

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    Observable<ServiceResponse<Error>> head501WithServiceResponseAsync();

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    Error get501();

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Error> get501Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    Observable<Error> get501Async();

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    Observable<ServiceResponse<Error>> get501WithServiceResponseAsync();

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    Error post505();

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Error> post505Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    Observable<Error> post505Async();

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    Observable<ServiceResponse<Error>> post505WithServiceResponseAsync();
    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    Error post505(Boolean booleanValue);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Error> post505Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    Observable<Error> post505Async(Boolean booleanValue);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    Observable<ServiceResponse<Error>> post505WithServiceResponseAsync(Boolean booleanValue);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    Error delete505();

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Error> delete505Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    Observable<Error> delete505Async();

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    Observable<ServiceResponse<Error>> delete505WithServiceResponseAsync();
    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    Error delete505(Boolean booleanValue);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Error> delete505Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    Observable<Error> delete505Async(Boolean booleanValue);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    Observable<ServiceResponse<Error>> delete505WithServiceResponseAsync(Boolean booleanValue);

}
