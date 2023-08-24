// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.defendereasm.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.defendereasm.fluent.models.LabelResourceInner;

/** An immutable client-side representation of LabelResource. */
public interface LabelResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the displayName property: Label display name.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the color property: Label color.
     *
     * @return the color value.
     */
    String color();

    /**
     * Gets the provisioningState property: Resource provisioning state.
     *
     * @return the provisioningState value.
     */
    ResourceState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.defendereasm.fluent.models.LabelResourceInner object.
     *
     * @return the inner object.
     */
    LabelResourceInner innerModel();
}
