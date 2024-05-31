// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.oracledatabase.fluent.models.DnsPrivateViewInner;

/**
 * An instance of this class provides access to all the operations defined in DnsPrivateViewsClient.
 */
public interface DnsPrivateViewsClient {
    /**
     * List DnsPrivateView resources by Location.
     * 
     * @param location The name of the Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DnsPrivateView list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DnsPrivateViewInner> listByLocation(String location);

    /**
     * List DnsPrivateView resources by Location.
     * 
     * @param location The name of the Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DnsPrivateView list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DnsPrivateViewInner> listByLocation(String location, Context context);

    /**
     * Get a DnsPrivateView.
     * 
     * @param location The name of the Azure region.
     * @param dnsprivateviewocid DnsPrivateView OCID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DnsPrivateView along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DnsPrivateViewInner> getWithResponse(String location, String dnsprivateviewocid, Context context);

    /**
     * Get a DnsPrivateView.
     * 
     * @param location The name of the Azure region.
     * @param dnsprivateviewocid DnsPrivateView OCID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DnsPrivateView.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DnsPrivateViewInner get(String location, String dnsprivateviewocid);
}
