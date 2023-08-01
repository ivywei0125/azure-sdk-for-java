// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.resourcemanager.elasticsan.fluent.models.PrivateLinkResourceListResultInner;
import java.util.List;

/** An immutable client-side representation of PrivateLinkResourceListResult. */
public interface PrivateLinkResourceListResult {
    /**
     * Gets the value property: Array of private link resources.
     *
     * @return the value value.
     */
    List<PrivateLinkResource> value();

    /**
     * Gets the nextLink property: URI to fetch the next section of the paginated response.
     *
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.elasticsan.fluent.models.PrivateLinkResourceListResultInner object.
     *
     * @return the inner object.
     */
    PrivateLinkResourceListResultInner innerModel();
}
