// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.network.models.AdminRule;
import com.azure.resourcemanager.network.models.ChildResource;
import com.azure.resourcemanager.network.models.DefaultAdminRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Network base admin rule. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = BaseAdminRuleInner.class)
@JsonTypeName("BaseAdminRule")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Custom", value = AdminRule.class),
    @JsonSubTypes.Type(name = "Default", value = DefaultAdminRule.class)
})
@Immutable
public class BaseAdminRuleInner extends ChildResource {
    /*
     * The system metadata related to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of BaseAdminRuleInner class. */
    public BaseAdminRuleInner() {
    }

    /**
     * Get the systemData property: The system metadata related to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
