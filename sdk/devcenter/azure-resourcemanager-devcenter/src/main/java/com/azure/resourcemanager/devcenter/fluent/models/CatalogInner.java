// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.devcenter.models.GitCatalog;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Represents a catalog. */
@Fluent
public final class CatalogInner extends ProxyResource {
    /*
     * Catalog properties.
     */
    @JsonProperty(value = "properties")
    private CatalogProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of CatalogInner class. */
    public CatalogInner() {
    }

    /**
     * Get the innerProperties property: Catalog properties.
     *
     * @return the innerProperties value.
     */
    private CatalogProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the lastSyncTime property: When the catalog was last synced.
     *
     * @return the lastSyncTime value.
     */
    public OffsetDateTime lastSyncTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastSyncTime();
    }

    /**
     * Get the gitHub property: Properties for a GitHub catalog type.
     *
     * @return the gitHub value.
     */
    public GitCatalog gitHub() {
        return this.innerProperties() == null ? null : this.innerProperties().gitHub();
    }

    /**
     * Set the gitHub property: Properties for a GitHub catalog type.
     *
     * @param gitHub the gitHub value to set.
     * @return the CatalogInner object itself.
     */
    public CatalogInner withGitHub(GitCatalog gitHub) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CatalogProperties();
        }
        this.innerProperties().withGitHub(gitHub);
        return this;
    }

    /**
     * Get the adoGit property: Properties for an Azure DevOps catalog type.
     *
     * @return the adoGit value.
     */
    public GitCatalog adoGit() {
        return this.innerProperties() == null ? null : this.innerProperties().adoGit();
    }

    /**
     * Set the adoGit property: Properties for an Azure DevOps catalog type.
     *
     * @param adoGit the adoGit value to set.
     * @return the CatalogInner object itself.
     */
    public CatalogInner withAdoGit(GitCatalog adoGit) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CatalogProperties();
        }
        this.innerProperties().withAdoGit(adoGit);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
