// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow;

import com.azure.analytics.purview.workflow.implementation.WorkflowRunsImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the asynchronous PurviewWorkflowClient type. */
@ServiceClient(builder = WorkflowRunsClientBuilder.class, isAsync = true)
public final class WorkflowRunsAsyncClient {
    @Generated private final WorkflowRunsImpl serviceClient;

    /**
     * Initializes an instance of WorkflowRunsAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    WorkflowRunsAsyncClient(WorkflowRunsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * List workflow runs.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>viewMode</td><td>String</td><td>No</td><td>To filter user's workflow runs or view as admin.</td></tr>
     *     <tr><td>timeWindow</td><td>String</td><td>No</td><td>Time window of filtering items. Allowed values: "1d", "7d", "30d", "90d".</td></tr>
     *     <tr><td>orderby</td><td>String</td><td>No</td><td>The key word which used to sort the results. Allowed values: "status desc", "status asc", "requestor desc", "requestor asc", "startTime desc", "startTime asc", "createdTime desc", "createdTime asc".</td></tr>
     *     <tr><td>runStatuses</td><td>List&lt;String&gt;</td><td>No</td><td>Filter workflow runs by workflow run status. In the form of "," separated string.</td></tr>
     *     <tr><td>workflowIds</td><td>List&lt;String&gt;</td><td>No</td><td>Filter items by workflow id list. In the form of "," separated string.</td></tr>
     *     <tr><td>requestors</td><td>List&lt;String&gt;</td><td>No</td><td>Requestors' ids to filter. In the form of "," separated string.</td></tr>
     *     <tr><td>maxpagesize</td><td>Integer</td><td>No</td><td>The maximum page size to get the items at one time. The default value is 100.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     workflowId: String (Required)
     *     startTime: OffsetDateTime (Required)
     *     requestor: String (Required)
     *     userRequestId: String (Optional)
     *     runPayload (Required): {
     *         type: String(CreateTerm/UpdateTerm/DeleteTerm/ImportTerms/UpdateAsset/GrantDataAccess) (Required)
     *         targetValue: String (Required)
     *     }
     *     status: String(NotStarted/InProgress/Failed/Completed/Canceling/CancellationFailed/Canceled) (Required)
     *     endTime: OffsetDateTime (Optional)
     *     cancelTime: OffsetDateTime (Optional)
     *     cancelComment: String (Optional)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> list(RequestOptions requestOptions) {
        return this.serviceClient.listAsync(requestOptions);
    }
}
