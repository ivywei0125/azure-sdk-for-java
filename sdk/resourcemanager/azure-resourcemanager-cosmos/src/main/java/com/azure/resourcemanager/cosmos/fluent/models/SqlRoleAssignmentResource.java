// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Cosmos DB SQL Role Assignment resource object. */
@Fluent
public final class SqlRoleAssignmentResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlRoleAssignmentResource.class);

    /*
     * The unique identifier for the associated Role Definition.
     */
    @JsonProperty(value = "roleDefinitionId")
    private String roleDefinitionId;

    /*
     * The data plane resource path for which access is being granted through
     * this Role Assignment.
     */
    @JsonProperty(value = "scope")
    private String scope;

    /*
     * The unique identifier for the associated AAD principal in the AAD graph
     * to which access is being granted through this Role Assignment. Tenant ID
     * for the principal is inferred using the tenant associated with the
     * subscription.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /**
     * Get the roleDefinitionId property: The unique identifier for the associated Role Definition.
     *
     * @return the roleDefinitionId value.
     */
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }

    /**
     * Set the roleDefinitionId property: The unique identifier for the associated Role Definition.
     *
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the SqlRoleAssignmentResource object itself.
     */
    public SqlRoleAssignmentResource withRoleDefinitionId(String roleDefinitionId) {
        this.roleDefinitionId = roleDefinitionId;
        return this;
    }

    /**
     * Get the scope property: The data plane resource path for which access is being granted through this Role
     * Assignment.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The data plane resource path for which access is being granted through this Role
     * Assignment.
     *
     * @param scope the scope value to set.
     * @return the SqlRoleAssignmentResource object itself.
     */
    public SqlRoleAssignmentResource withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the principalId property: The unique identifier for the associated AAD principal in the AAD graph to which
     * access is being granted through this Role Assignment. Tenant ID for the principal is inferred using the tenant
     * associated with the subscription.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The unique identifier for the associated AAD principal in the AAD graph to which
     * access is being granted through this Role Assignment. Tenant ID for the principal is inferred using the tenant
     * associated with the subscription.
     *
     * @param principalId the principalId value to set.
     * @return the SqlRoleAssignmentResource object itself.
     */
    public SqlRoleAssignmentResource withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
