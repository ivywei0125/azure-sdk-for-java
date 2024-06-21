// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.models.Ambr;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.azure.resourcemanager.mobilenetwork.models.SiteProvisioningState;
import com.azure.resourcemanager.mobilenetwork.models.SliceConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.SliceResourceId;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * SIM policy properties. Must be created in the same location as its parent mobile network.
 */
@Fluent
public final class SimPolicyPropertiesFormat {
    /*
     * The provisioning state of the SIM policy resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * A dictionary of sites to the provisioning state of this SIM policy on that site.
     */
    @JsonProperty(value = "siteProvisioningState", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, SiteProvisioningState> siteProvisioningState;

    /*
     * Aggregate maximum bit rate across all non-GBR QoS flows of all PDU sessions of a given UE. See 3GPP TS23.501 section 5.7.2.6 for a full description of the UE-AMBR.
     */
    @JsonProperty(value = "ueAmbr", required = true)
    private Ambr ueAmbr;

    /*
     * The default slice to use if the UE does not explicitly specify it. This slice must exist in the `sliceConfigurations` map. The slice must be in the same location as the SIM policy.
     */
    @JsonProperty(value = "defaultSlice", required = true)
    private SliceResourceId defaultSlice;

    /*
     * RAT/Frequency Selection Priority Index, defined in 3GPP TS 36.413. This is an optional setting and by default is unspecified.
     */
    @JsonProperty(value = "rfspIndex")
    private Integer rfspIndex;

    /*
     * UE periodic registration update timer (5G) or UE periodic tracking area update timer (4G), in seconds.
     */
    @JsonProperty(value = "registrationTimer")
    private Integer registrationTimer;

    /*
     * The allowed slices and the settings to use for them. The list must not contain duplicate items and must contain at least one item.
     */
    @JsonProperty(value = "sliceConfigurations", required = true)
    private List<SliceConfiguration> sliceConfigurations;

    /**
     * Creates an instance of SimPolicyPropertiesFormat class.
     */
    public SimPolicyPropertiesFormat() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the SIM policy resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the siteProvisioningState property: A dictionary of sites to the provisioning state of this SIM policy on
     * that site.
     * 
     * @return the siteProvisioningState value.
     */
    public Map<String, SiteProvisioningState> siteProvisioningState() {
        return this.siteProvisioningState;
    }

    /**
     * Get the ueAmbr property: Aggregate maximum bit rate across all non-GBR QoS flows of all PDU sessions of a given
     * UE. See 3GPP TS23.501 section 5.7.2.6 for a full description of the UE-AMBR.
     * 
     * @return the ueAmbr value.
     */
    public Ambr ueAmbr() {
        return this.ueAmbr;
    }

    /**
     * Set the ueAmbr property: Aggregate maximum bit rate across all non-GBR QoS flows of all PDU sessions of a given
     * UE. See 3GPP TS23.501 section 5.7.2.6 for a full description of the UE-AMBR.
     * 
     * @param ueAmbr the ueAmbr value to set.
     * @return the SimPolicyPropertiesFormat object itself.
     */
    public SimPolicyPropertiesFormat withUeAmbr(Ambr ueAmbr) {
        this.ueAmbr = ueAmbr;
        return this;
    }

    /**
     * Get the defaultSlice property: The default slice to use if the UE does not explicitly specify it. This slice must
     * exist in the `sliceConfigurations` map. The slice must be in the same location as the SIM policy.
     * 
     * @return the defaultSlice value.
     */
    public SliceResourceId defaultSlice() {
        return this.defaultSlice;
    }

    /**
     * Set the defaultSlice property: The default slice to use if the UE does not explicitly specify it. This slice must
     * exist in the `sliceConfigurations` map. The slice must be in the same location as the SIM policy.
     * 
     * @param defaultSlice the defaultSlice value to set.
     * @return the SimPolicyPropertiesFormat object itself.
     */
    public SimPolicyPropertiesFormat withDefaultSlice(SliceResourceId defaultSlice) {
        this.defaultSlice = defaultSlice;
        return this;
    }

    /**
     * Get the rfspIndex property: RAT/Frequency Selection Priority Index, defined in 3GPP TS 36.413. This is an
     * optional setting and by default is unspecified.
     * 
     * @return the rfspIndex value.
     */
    public Integer rfspIndex() {
        return this.rfspIndex;
    }

    /**
     * Set the rfspIndex property: RAT/Frequency Selection Priority Index, defined in 3GPP TS 36.413. This is an
     * optional setting and by default is unspecified.
     * 
     * @param rfspIndex the rfspIndex value to set.
     * @return the SimPolicyPropertiesFormat object itself.
     */
    public SimPolicyPropertiesFormat withRfspIndex(Integer rfspIndex) {
        this.rfspIndex = rfspIndex;
        return this;
    }

    /**
     * Get the registrationTimer property: UE periodic registration update timer (5G) or UE periodic tracking area
     * update timer (4G), in seconds.
     * 
     * @return the registrationTimer value.
     */
    public Integer registrationTimer() {
        return this.registrationTimer;
    }

    /**
     * Set the registrationTimer property: UE periodic registration update timer (5G) or UE periodic tracking area
     * update timer (4G), in seconds.
     * 
     * @param registrationTimer the registrationTimer value to set.
     * @return the SimPolicyPropertiesFormat object itself.
     */
    public SimPolicyPropertiesFormat withRegistrationTimer(Integer registrationTimer) {
        this.registrationTimer = registrationTimer;
        return this;
    }

    /**
     * Get the sliceConfigurations property: The allowed slices and the settings to use for them. The list must not
     * contain duplicate items and must contain at least one item.
     * 
     * @return the sliceConfigurations value.
     */
    public List<SliceConfiguration> sliceConfigurations() {
        return this.sliceConfigurations;
    }

    /**
     * Set the sliceConfigurations property: The allowed slices and the settings to use for them. The list must not
     * contain duplicate items and must contain at least one item.
     * 
     * @param sliceConfigurations the sliceConfigurations value to set.
     * @return the SimPolicyPropertiesFormat object itself.
     */
    public SimPolicyPropertiesFormat withSliceConfigurations(List<SliceConfiguration> sliceConfigurations) {
        this.sliceConfigurations = sliceConfigurations;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ueAmbr() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property ueAmbr in model SimPolicyPropertiesFormat"));
        } else {
            ueAmbr().validate();
        }
        if (defaultSlice() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property defaultSlice in model SimPolicyPropertiesFormat"));
        } else {
            defaultSlice().validate();
        }
        if (sliceConfigurations() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sliceConfigurations in model SimPolicyPropertiesFormat"));
        } else {
            sliceConfigurations().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SimPolicyPropertiesFormat.class);
}
