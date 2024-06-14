// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * The SubscriptionFeatureRegistrationProperties model.
 */
@Fluent
public final class SubscriptionFeatureRegistrationProperties {
    /*
     * The tenantId.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * The subscriptionId.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /*
     * The featureName.
     */
    @JsonProperty(value = "featureName", access = JsonProperty.Access.WRITE_ONLY)
    private String featureName;

    /*
     * The featureDisplayName.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * The providerNamespace.
     */
    @JsonProperty(value = "providerNamespace", access = JsonProperty.Access.WRITE_ONLY)
    private String providerNamespace;

    /*
     * The state.
     */
    @JsonProperty(value = "state")
    private SubscriptionFeatureRegistrationState state;

    /*
     * Authorization Profile
     */
    @JsonProperty(value = "authorizationProfile")
    private AuthorizationProfile authorizationProfile;

    /*
     * Key-value pairs for meta data.
     */
    @JsonProperty(value = "metadata")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> metadata;

    /*
     * The feature release date.
     */
    @JsonProperty(value = "releaseDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime releaseDate;

    /*
     * The feature registration date.
     */
    @JsonProperty(value = "registrationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime registrationDate;

    /*
     * The feature documentation link.
     */
    @JsonProperty(value = "documentationLink", access = JsonProperty.Access.WRITE_ONLY)
    private String documentationLink;

    /*
     * The feature approval type.
     */
    @JsonProperty(value = "approvalType", access = JsonProperty.Access.WRITE_ONLY)
    private SubscriptionFeatureRegistrationApprovalType approvalType;

    /*
     * Indicates whether feature should be displayed in Portal.
     */
    @JsonProperty(value = "shouldFeatureDisplayInPortal")
    private Boolean shouldFeatureDisplayInPortal;

    /*
     * The feature description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Creates an instance of SubscriptionFeatureRegistrationProperties class.
     */
    public SubscriptionFeatureRegistrationProperties() {
    }

    /**
     * Get the tenantId property: The tenantId.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the subscriptionId property: The subscriptionId.
     * 
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the featureName property: The featureName.
     * 
     * @return the featureName value.
     */
    public String featureName() {
        return this.featureName;
    }

    /**
     * Get the displayName property: The featureDisplayName.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the providerNamespace property: The providerNamespace.
     * 
     * @return the providerNamespace value.
     */
    public String providerNamespace() {
        return this.providerNamespace;
    }

    /**
     * Get the state property: The state.
     * 
     * @return the state value.
     */
    public SubscriptionFeatureRegistrationState state() {
        return this.state;
    }

    /**
     * Set the state property: The state.
     * 
     * @param state the state value to set.
     * @return the SubscriptionFeatureRegistrationProperties object itself.
     */
    public SubscriptionFeatureRegistrationProperties withState(SubscriptionFeatureRegistrationState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the authorizationProfile property: Authorization Profile.
     * 
     * @return the authorizationProfile value.
     */
    public AuthorizationProfile authorizationProfile() {
        return this.authorizationProfile;
    }

    /**
     * Set the authorizationProfile property: Authorization Profile.
     * 
     * @param authorizationProfile the authorizationProfile value to set.
     * @return the SubscriptionFeatureRegistrationProperties object itself.
     */
    public SubscriptionFeatureRegistrationProperties
        withAuthorizationProfile(AuthorizationProfile authorizationProfile) {
        this.authorizationProfile = authorizationProfile;
        return this;
    }

    /**
     * Get the metadata property: Key-value pairs for meta data.
     * 
     * @return the metadata value.
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Key-value pairs for meta data.
     * 
     * @param metadata the metadata value to set.
     * @return the SubscriptionFeatureRegistrationProperties object itself.
     */
    public SubscriptionFeatureRegistrationProperties withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the releaseDate property: The feature release date.
     * 
     * @return the releaseDate value.
     */
    public OffsetDateTime releaseDate() {
        return this.releaseDate;
    }

    /**
     * Get the registrationDate property: The feature registration date.
     * 
     * @return the registrationDate value.
     */
    public OffsetDateTime registrationDate() {
        return this.registrationDate;
    }

    /**
     * Get the documentationLink property: The feature documentation link.
     * 
     * @return the documentationLink value.
     */
    public String documentationLink() {
        return this.documentationLink;
    }

    /**
     * Get the approvalType property: The feature approval type.
     * 
     * @return the approvalType value.
     */
    public SubscriptionFeatureRegistrationApprovalType approvalType() {
        return this.approvalType;
    }

    /**
     * Get the shouldFeatureDisplayInPortal property: Indicates whether feature should be displayed in Portal.
     * 
     * @return the shouldFeatureDisplayInPortal value.
     */
    public Boolean shouldFeatureDisplayInPortal() {
        return this.shouldFeatureDisplayInPortal;
    }

    /**
     * Set the shouldFeatureDisplayInPortal property: Indicates whether feature should be displayed in Portal.
     * 
     * @param shouldFeatureDisplayInPortal the shouldFeatureDisplayInPortal value to set.
     * @return the SubscriptionFeatureRegistrationProperties object itself.
     */
    public SubscriptionFeatureRegistrationProperties
        withShouldFeatureDisplayInPortal(Boolean shouldFeatureDisplayInPortal) {
        this.shouldFeatureDisplayInPortal = shouldFeatureDisplayInPortal;
        return this;
    }

    /**
     * Get the description property: The feature description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The feature description.
     * 
     * @param description the description value to set.
     * @return the SubscriptionFeatureRegistrationProperties object itself.
     */
    public SubscriptionFeatureRegistrationProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (authorizationProfile() != null) {
            authorizationProfile().validate();
        }
    }
}
