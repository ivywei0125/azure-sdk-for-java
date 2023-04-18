// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Organizations. */
public interface Organizations {
    /**
     * Fetch User API Key from internal database, if it was generated and stored while creating the Elasticsearch
     * Organization.
     *
     * @param body Email Id parameter of the User Organization, of which the API Key must be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the User Api Key created for the Organization associated with the User Email Id that was passed in the
     *     request along with {@link Response}.
     */
    Response<UserApiKeyResponse> getApiKeyWithResponse(UserEmailId body, Context context);

    /**
     * Fetch User API Key from internal database, if it was generated and stored while creating the Elasticsearch
     * Organization.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the User Api Key created for the Organization associated with the User Email Id that was passed in the
     *     request.
     */
    UserApiKeyResponse getApiKey();
}
