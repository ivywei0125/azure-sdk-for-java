// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The authentication options for Azure OpenAI On Your Data.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = OnYourDataAuthenticationOptions.class)
@JsonTypeName("OnYourDataAuthenticationOptions")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "APIKey", value = OnYourDataApiKeyAuthenticationOptions.class),
    @JsonSubTypes.Type(name = "ConnectionString", value = OnYourDataConnectionStringAuthenticationOptions.class),
    @JsonSubTypes.Type(name = "KeyAndKeyId", value = OnYourDataKeyAndKeyIdAuthenticationOptions.class),
    @JsonSubTypes.Type(
        name = "SystemAssignedManagedIdentity",
        value = OnYourDataSystemAssignedManagedIdentityAuthenticationOptions.class),
    @JsonSubTypes.Type(
        name = "UserAssignedManagedIdentity",
        value = OnYourDataUserAssignedManagedIdentityAuthenticationOptions.class) })
@Immutable
public class OnYourDataAuthenticationOptions {

    /**
     * Creates an instance of OnYourDataAuthenticationOptions class.
     */
    @Generated
    public OnYourDataAuthenticationOptions() {
    }
}
