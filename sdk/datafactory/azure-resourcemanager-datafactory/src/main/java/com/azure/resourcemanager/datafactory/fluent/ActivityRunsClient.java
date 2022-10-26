// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.fluent.models.ActivityRunsQueryResponseInner;
import com.azure.resourcemanager.datafactory.models.RunFilterParameters;

/** An instance of this class provides access to all the operations defined in ActivityRunsClient. */
public interface ActivityRunsClient {
    /**
     * Query activity runs based on input filter conditions.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @param filterParameters Parameters to filter the activity runs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list activity runs along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ActivityRunsQueryResponseInner> queryByPipelineRunWithResponse(
        String resourceGroupName,
        String factoryName,
        String runId,
        RunFilterParameters filterParameters,
        Context context);

    /**
     * Query activity runs based on input filter conditions.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @param filterParameters Parameters to filter the activity runs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list activity runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ActivityRunsQueryResponseInner queryByPipelineRun(
        String resourceGroupName, String factoryName, String runId, RunFilterParameters filterParameters);
}
