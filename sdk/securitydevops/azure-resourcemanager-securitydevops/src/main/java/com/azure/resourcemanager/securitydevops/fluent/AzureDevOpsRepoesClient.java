// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.securitydevops.fluent.models.AzureDevOpsRepoInner;

/** An instance of this class provides access to all the operations defined in AzureDevOpsRepoesClient. */
public interface AzureDevOpsRepoesClient {
    /**
     * The listByConnector operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureDevOpsConnectorName Name of the AzureDevOps Connector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureDevOpsRepoInner> listByConnector(String resourceGroupName, String azureDevOpsConnectorName);

    /**
     * The listByConnector operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureDevOpsConnectorName Name of the AzureDevOps Connector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureDevOpsRepoInner> listByConnector(
        String resourceGroupName, String azureDevOpsConnectorName, Context context);

    /**
     * The list operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureDevOpsConnectorName Name of the AzureDevOps Connector.
     * @param azureDevOpsOrgName Name of the AzureDevOps Org.
     * @param azureDevOpsProjectName Name of the AzureDevOps Project.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureDevOpsRepoInner> list(
        String resourceGroupName,
        String azureDevOpsConnectorName,
        String azureDevOpsOrgName,
        String azureDevOpsProjectName);

    /**
     * The list operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureDevOpsConnectorName Name of the AzureDevOps Connector.
     * @param azureDevOpsOrgName Name of the AzureDevOps Org.
     * @param azureDevOpsProjectName Name of the AzureDevOps Project.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureDevOpsRepoInner> list(
        String resourceGroupName,
        String azureDevOpsConnectorName,
        String azureDevOpsOrgName,
        String azureDevOpsProjectName,
        Context context);

    /**
     * Returns a monitored AzureDevOps Project resource for a given ID.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureDevOpsConnectorName Name of the AzureDevOps Connector.
     * @param azureDevOpsOrgName Name of the AzureDevOps Org.
     * @param azureDevOpsProjectName Name of the AzureDevOps Project.
     * @param azureDevOpsRepoName Name of the AzureDevOps Repo.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure DevOps Repo Proxy Resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AzureDevOpsRepoInner> getWithResponse(
        String resourceGroupName,
        String azureDevOpsConnectorName,
        String azureDevOpsOrgName,
        String azureDevOpsProjectName,
        String azureDevOpsRepoName,
        Context context);

    /**
     * Returns a monitored AzureDevOps Project resource for a given ID.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureDevOpsConnectorName Name of the AzureDevOps Connector.
     * @param azureDevOpsOrgName Name of the AzureDevOps Org.
     * @param azureDevOpsProjectName Name of the AzureDevOps Project.
     * @param azureDevOpsRepoName Name of the AzureDevOps Repo.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure DevOps Repo Proxy Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureDevOpsRepoInner get(
        String resourceGroupName,
        String azureDevOpsConnectorName,
        String azureDevOpsOrgName,
        String azureDevOpsProjectName,
        String azureDevOpsRepoName);

    /**
     * Updates an Azure DevOps Repo.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureDevOpsConnectorName Name of the AzureDevOps Connector.
     * @param azureDevOpsOrgName Name of the AzureDevOps Org.
     * @param azureDevOpsProjectName Name of the AzureDevOps Project.
     * @param azureDevOpsRepoName Name of the AzureDevOps Repo.
     * @param azureDevOpsRepo Azure DevOps Repo resource payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of azure DevOps Repo Proxy Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AzureDevOpsRepoInner>, AzureDevOpsRepoInner> beginCreateOrUpdate(
        String resourceGroupName,
        String azureDevOpsConnectorName,
        String azureDevOpsOrgName,
        String azureDevOpsProjectName,
        String azureDevOpsRepoName,
        AzureDevOpsRepoInner azureDevOpsRepo);

    /**
     * Updates an Azure DevOps Repo.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureDevOpsConnectorName Name of the AzureDevOps Connector.
     * @param azureDevOpsOrgName Name of the AzureDevOps Org.
     * @param azureDevOpsProjectName Name of the AzureDevOps Project.
     * @param azureDevOpsRepoName Name of the AzureDevOps Repo.
     * @param azureDevOpsRepo Azure DevOps Repo resource payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of azure DevOps Repo Proxy Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AzureDevOpsRepoInner>, AzureDevOpsRepoInner> beginCreateOrUpdate(
        String resourceGroupName,
        String azureDevOpsConnectorName,
        String azureDevOpsOrgName,
        String azureDevOpsProjectName,
        String azureDevOpsRepoName,
        AzureDevOpsRepoInner azureDevOpsRepo,
        Context context);

    /**
     * Updates an Azure DevOps Repo.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureDevOpsConnectorName Name of the AzureDevOps Connector.
     * @param azureDevOpsOrgName Name of the AzureDevOps Org.
     * @param azureDevOpsProjectName Name of the AzureDevOps Project.
     * @param azureDevOpsRepoName Name of the AzureDevOps Repo.
     * @param azureDevOpsRepo Azure DevOps Repo resource payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure DevOps Repo Proxy Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureDevOpsRepoInner createOrUpdate(
        String resourceGroupName,
        String azureDevOpsConnectorName,
        String azureDevOpsOrgName,
        String azureDevOpsProjectName,
        String azureDevOpsRepoName,
        AzureDevOpsRepoInner azureDevOpsRepo);

    /**
     * Updates an Azure DevOps Repo.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureDevOpsConnectorName Name of the AzureDevOps Connector.
     * @param azureDevOpsOrgName Name of the AzureDevOps Org.
     * @param azureDevOpsProjectName Name of the AzureDevOps Project.
     * @param azureDevOpsRepoName Name of the AzureDevOps Repo.
     * @param azureDevOpsRepo Azure DevOps Repo resource payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure DevOps Repo Proxy Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureDevOpsRepoInner createOrUpdate(
        String resourceGroupName,
        String azureDevOpsConnectorName,
        String azureDevOpsOrgName,
        String azureDevOpsProjectName,
        String azureDevOpsRepoName,
        AzureDevOpsRepoInner azureDevOpsRepo,
        Context context);

    /**
     * Update monitored AzureDevOps Project details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureDevOpsConnectorName Name of the AzureDevOps Connector.
     * @param azureDevOpsOrgName Name of the AzureDevOps Org.
     * @param azureDevOpsProjectName Name of the AzureDevOps Project.
     * @param azureDevOpsRepoName Name of the AzureDevOps Repo.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of azure DevOps Repo Proxy Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AzureDevOpsRepoInner>, AzureDevOpsRepoInner> beginUpdate(
        String resourceGroupName,
        String azureDevOpsConnectorName,
        String azureDevOpsOrgName,
        String azureDevOpsProjectName,
        String azureDevOpsRepoName);

    /**
     * Update monitored AzureDevOps Project details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureDevOpsConnectorName Name of the AzureDevOps Connector.
     * @param azureDevOpsOrgName Name of the AzureDevOps Org.
     * @param azureDevOpsProjectName Name of the AzureDevOps Project.
     * @param azureDevOpsRepoName Name of the AzureDevOps Repo.
     * @param azureDevOpsRepo Azure DevOps Org resource payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of azure DevOps Repo Proxy Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AzureDevOpsRepoInner>, AzureDevOpsRepoInner> beginUpdate(
        String resourceGroupName,
        String azureDevOpsConnectorName,
        String azureDevOpsOrgName,
        String azureDevOpsProjectName,
        String azureDevOpsRepoName,
        AzureDevOpsRepoInner azureDevOpsRepo,
        Context context);

    /**
     * Update monitored AzureDevOps Project details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureDevOpsConnectorName Name of the AzureDevOps Connector.
     * @param azureDevOpsOrgName Name of the AzureDevOps Org.
     * @param azureDevOpsProjectName Name of the AzureDevOps Project.
     * @param azureDevOpsRepoName Name of the AzureDevOps Repo.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure DevOps Repo Proxy Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureDevOpsRepoInner update(
        String resourceGroupName,
        String azureDevOpsConnectorName,
        String azureDevOpsOrgName,
        String azureDevOpsProjectName,
        String azureDevOpsRepoName);

    /**
     * Update monitored AzureDevOps Project details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureDevOpsConnectorName Name of the AzureDevOps Connector.
     * @param azureDevOpsOrgName Name of the AzureDevOps Org.
     * @param azureDevOpsProjectName Name of the AzureDevOps Project.
     * @param azureDevOpsRepoName Name of the AzureDevOps Repo.
     * @param azureDevOpsRepo Azure DevOps Org resource payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure DevOps Repo Proxy Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureDevOpsRepoInner update(
        String resourceGroupName,
        String azureDevOpsConnectorName,
        String azureDevOpsOrgName,
        String azureDevOpsProjectName,
        String azureDevOpsRepoName,
        AzureDevOpsRepoInner azureDevOpsRepo,
        Context context);
}
