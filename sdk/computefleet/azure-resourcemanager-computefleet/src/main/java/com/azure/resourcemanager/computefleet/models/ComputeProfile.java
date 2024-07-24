// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Compute Profile to use for running user's workloads.
 */
@Fluent
public final class ComputeProfile implements JsonSerializable<ComputeProfile> {
    /*
     * Base Virtual Machine Profile Properties to be specified according to
     * "specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/{computeApiVersion}/virtualMachineScaleSet.json#/definitions/VirtualMachineScaleSetVMProfile"
     */
    private BaseVirtualMachineProfile baseVirtualMachineProfile;

    /*
     * Specifies the Microsoft.Compute API version to use when creating underlying Virtual Machine scale sets and
     * Virtual Machines.
     * The default value will be the latest supported computeApiVersion by Compute Fleet.
     */
    private String computeApiVersion;

    /*
     * Specifies the number of fault domains to use when creating the underlying VMSS.
     * A fault domain is a logical group of hardware within an Azure datacenter.
     * VMs in the same fault domain share a common power source and network switch.
     * If not specified, defaults to 1, which represents "Max Spreading" (using as many fault domains as possible).
     * This property cannot be updated.
     */
    private Integer platformFaultDomainCount;

    /**
     * Creates an instance of ComputeProfile class.
     */
    public ComputeProfile() {
    }

    /**
     * Get the baseVirtualMachineProfile property: Base Virtual Machine Profile Properties to be specified according to
     * "specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/{computeApiVersion}/virtualMachineScaleSet.json#/definitions/VirtualMachineScaleSetVMProfile".
     * 
     * @return the baseVirtualMachineProfile value.
     */
    public BaseVirtualMachineProfile baseVirtualMachineProfile() {
        return this.baseVirtualMachineProfile;
    }

    /**
     * Set the baseVirtualMachineProfile property: Base Virtual Machine Profile Properties to be specified according to
     * "specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/{computeApiVersion}/virtualMachineScaleSet.json#/definitions/VirtualMachineScaleSetVMProfile".
     * 
     * @param baseVirtualMachineProfile the baseVirtualMachineProfile value to set.
     * @return the ComputeProfile object itself.
     */
    public ComputeProfile withBaseVirtualMachineProfile(BaseVirtualMachineProfile baseVirtualMachineProfile) {
        this.baseVirtualMachineProfile = baseVirtualMachineProfile;
        return this;
    }

    /**
     * Get the computeApiVersion property: Specifies the Microsoft.Compute API version to use when creating underlying
     * Virtual Machine scale sets and Virtual Machines.
     * The default value will be the latest supported computeApiVersion by Compute Fleet.
     * 
     * @return the computeApiVersion value.
     */
    public String computeApiVersion() {
        return this.computeApiVersion;
    }

    /**
     * Set the computeApiVersion property: Specifies the Microsoft.Compute API version to use when creating underlying
     * Virtual Machine scale sets and Virtual Machines.
     * The default value will be the latest supported computeApiVersion by Compute Fleet.
     * 
     * @param computeApiVersion the computeApiVersion value to set.
     * @return the ComputeProfile object itself.
     */
    public ComputeProfile withComputeApiVersion(String computeApiVersion) {
        this.computeApiVersion = computeApiVersion;
        return this;
    }

    /**
     * Get the platformFaultDomainCount property: Specifies the number of fault domains to use when creating the
     * underlying VMSS.
     * A fault domain is a logical group of hardware within an Azure datacenter.
     * VMs in the same fault domain share a common power source and network switch.
     * If not specified, defaults to 1, which represents "Max Spreading" (using as many fault domains as possible).
     * This property cannot be updated.
     * 
     * @return the platformFaultDomainCount value.
     */
    public Integer platformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }

    /**
     * Set the platformFaultDomainCount property: Specifies the number of fault domains to use when creating the
     * underlying VMSS.
     * A fault domain is a logical group of hardware within an Azure datacenter.
     * VMs in the same fault domain share a common power source and network switch.
     * If not specified, defaults to 1, which represents "Max Spreading" (using as many fault domains as possible).
     * This property cannot be updated.
     * 
     * @param platformFaultDomainCount the platformFaultDomainCount value to set.
     * @return the ComputeProfile object itself.
     */
    public ComputeProfile withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        this.platformFaultDomainCount = platformFaultDomainCount;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (baseVirtualMachineProfile() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property baseVirtualMachineProfile in model ComputeProfile"));
        } else {
            baseVirtualMachineProfile().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ComputeProfile.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("baseVirtualMachineProfile", this.baseVirtualMachineProfile);
        jsonWriter.writeStringField("computeApiVersion", this.computeApiVersion);
        jsonWriter.writeNumberField("platformFaultDomainCount", this.platformFaultDomainCount);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ComputeProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ComputeProfile if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ComputeProfile.
     */
    public static ComputeProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ComputeProfile deserializedComputeProfile = new ComputeProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("baseVirtualMachineProfile".equals(fieldName)) {
                    deserializedComputeProfile.baseVirtualMachineProfile = BaseVirtualMachineProfile.fromJson(reader);
                } else if ("computeApiVersion".equals(fieldName)) {
                    deserializedComputeProfile.computeApiVersion = reader.getString();
                } else if ("platformFaultDomainCount".equals(fieldName)) {
                    deserializedComputeProfile.platformFaultDomainCount = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedComputeProfile;
        });
    }
}
