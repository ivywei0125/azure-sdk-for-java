// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of WorkspacePurges. */
public interface WorkspacePurges {
    /**
     * Purges data in an Log Analytics workspace by a set of user-defined filters.
     *
     * <p>In order to manage system resources, purge requests are throttled at 50 requests per hour. You should batch
     * the execution of purge requests by sending a single command whose predicate includes all user identities that
     * require purging. Use the in operator to specify multiple identities. You should run the query prior to using for
     * a purge request to verify that the results are expected. Log Analytics only supports purge operations required
     * for compliance with GDPR. The Log Analytics product team reserves the right to reject requests for purge
     * operations that are not for the purpose of GDPR compliance. In the event of a dispute, please create a support
     * ticket.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param body Describes the body of a request to purge data in a single table of an Log Analytics Workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing operationId for a specific purge action.
     */
    Response<WorkspacePurgeResponse> purgeWithResponse(
        String resourceGroupName, String workspaceName, WorkspacePurgeBody body, Context context);

    /**
     * Purges data in an Log Analytics workspace by a set of user-defined filters.
     *
     * <p>In order to manage system resources, purge requests are throttled at 50 requests per hour. You should batch
     * the execution of purge requests by sending a single command whose predicate includes all user identities that
     * require purging. Use the in operator to specify multiple identities. You should run the query prior to using for
     * a purge request to verify that the results are expected. Log Analytics only supports purge operations required
     * for compliance with GDPR. The Log Analytics product team reserves the right to reject requests for purge
     * operations that are not for the purpose of GDPR compliance. In the event of a dispute, please create a support
     * ticket.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param body Describes the body of a request to purge data in a single table of an Log Analytics Workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing operationId for a specific purge action.
     */
    WorkspacePurgeResponse purge(String resourceGroupName, String workspaceName, WorkspacePurgeBody body);

    /**
     * Gets status of an ongoing purge operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param purgeId In a purge status request, this is the Id of the operation the status of which is returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return status of an ongoing purge operation along with {@link Response}.
     */
    Response<WorkspacePurgeStatusResponse> getPurgeStatusWithResponse(
        String resourceGroupName, String workspaceName, String purgeId, Context context);

    /**
     * Gets status of an ongoing purge operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param purgeId In a purge status request, this is the Id of the operation the status of which is returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return status of an ongoing purge operation.
     */
    WorkspacePurgeStatusResponse getPurgeStatus(String resourceGroupName, String workspaceName, String purgeId);
}
