// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents metadata describing the operator of a phone number. */
@Immutable
public final class OperatorDetails {
    /*
     * Name of the phone operator
     */
    @JsonProperty(value = "name", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Mobile Network Code
     */
    @JsonProperty(value = "mobileNetworkCode", access = JsonProperty.Access.WRITE_ONLY)
    private String mobileNetworkCode;

    /*
     * Mobile Country Code
     */
    @JsonProperty(value = "mobileCountryCode", access = JsonProperty.Access.WRITE_ONLY)
    private String mobileCountryCode;

    /**
     * Get the name property: Name of the phone operator.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the mobileNetworkCode property: Mobile Network Code.
     *
     * @return the mobileNetworkCode value.
     */
    public String getMobileNetworkCode() {
        return this.mobileNetworkCode;
    }

    /**
     * Get the mobileCountryCode property: Mobile Country Code.
     *
     * @return the mobileCountryCode value.
     */
    public String getMobileCountryCode() {
        return this.mobileCountryCode;
    }
}
