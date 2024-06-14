// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the Informatica organization.
 */
@Fluent
public final class InformaticaProperties {
    /*
     * Organization id
     */
    @JsonProperty(value = "organizationId")
    private String organizationId;

    /*
     * Organization name
     */
    @JsonProperty(value = "organizationName")
    private String organizationName;

    /*
     * Informatica organization region
     */
    @JsonProperty(value = "informaticaRegion")
    private String informaticaRegion;

    /*
     * Single sing on URL for informatica organization
     */
    @JsonProperty(value = "singleSignOnUrl")
    private String singleSignOnUrl;

    /**
     * Creates an instance of InformaticaProperties class.
     */
    public InformaticaProperties() {
    }

    /**
     * Get the organizationId property: Organization id.
     * 
     * @return the organizationId value.
     */
    public String organizationId() {
        return this.organizationId;
    }

    /**
     * Set the organizationId property: Organization id.
     * 
     * @param organizationId the organizationId value to set.
     * @return the InformaticaProperties object itself.
     */
    public InformaticaProperties withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * Get the organizationName property: Organization name.
     * 
     * @return the organizationName value.
     */
    public String organizationName() {
        return this.organizationName;
    }

    /**
     * Set the organizationName property: Organization name.
     * 
     * @param organizationName the organizationName value to set.
     * @return the InformaticaProperties object itself.
     */
    public InformaticaProperties withOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * Get the informaticaRegion property: Informatica organization region.
     * 
     * @return the informaticaRegion value.
     */
    public String informaticaRegion() {
        return this.informaticaRegion;
    }

    /**
     * Set the informaticaRegion property: Informatica organization region.
     * 
     * @param informaticaRegion the informaticaRegion value to set.
     * @return the InformaticaProperties object itself.
     */
    public InformaticaProperties withInformaticaRegion(String informaticaRegion) {
        this.informaticaRegion = informaticaRegion;
        return this;
    }

    /**
     * Get the singleSignOnUrl property: Single sing on URL for informatica organization.
     * 
     * @return the singleSignOnUrl value.
     */
    public String singleSignOnUrl() {
        return this.singleSignOnUrl;
    }

    /**
     * Set the singleSignOnUrl property: Single sing on URL for informatica organization.
     * 
     * @param singleSignOnUrl the singleSignOnUrl value to set.
     * @return the InformaticaProperties object itself.
     */
    public InformaticaProperties withSingleSignOnUrl(String singleSignOnUrl) {
        this.singleSignOnUrl = singleSignOnUrl;
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
