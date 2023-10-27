// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.selfhelp.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.selfhelp.models.CheckNameAvailabilityRequest;

/** An instance of this class provides access to all the operations defined in CheckNameAvailabilitiesClient. */
public interface CheckNameAvailabilitiesClient {
    /**
     * This API is used to check the uniqueness of a resource name used for a diagnostic, troubleshooter or solutions.
     *
     * @param scope This is an extension resource provider and only resource level extension is supported at the moment.
     * @param checkNameAvailabilityRequest The required parameters for availability check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for whether the requested resource name is available or not along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameAvailabilityResponseInner> postWithResponse(
        String scope, CheckNameAvailabilityRequest checkNameAvailabilityRequest, Context context);

    /**
     * This API is used to check the uniqueness of a resource name used for a diagnostic, troubleshooter or solutions.
     *
     * @param scope This is an extension resource provider and only resource level extension is supported at the moment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for whether the requested resource name is available or not.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameAvailabilityResponseInner post(String scope);
}
