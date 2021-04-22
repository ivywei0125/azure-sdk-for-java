// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.labservices.fluent.models.OperationResultInner;

/** An instance of this class provides access to all the operations defined in OperationsClient. */
public interface OperationsClient {
    /**
     * Get operation.
     *
     * @param locationName The name of the location.
     * @param operationName The name of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationResultInner get(String locationName, String operationName);

    /**
     * Get operation.
     *
     * @param locationName The name of the location.
     * @param operationName The name of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OperationResultInner> getWithResponse(String locationName, String operationName, Context context);
}
