// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.PacketCaptureFilter;
import com.azure.resourcemanager.network.models.PacketCaptureMachineScope;
import com.azure.resourcemanager.network.models.PacketCaptureSettings;
import com.azure.resourcemanager.network.models.PacketCaptureStorageLocation;
import com.azure.resourcemanager.network.models.PacketCaptureTargetType;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Information about packet capture session.
 */
@Fluent
public final class PacketCaptureResultInner {
    /*
     * Name of the packet capture session.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * ID of the packet capture operation.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Properties of the packet capture result.
     */
    @JsonProperty(value = "properties")
    private PacketCaptureResultProperties innerProperties;

    /**
     * Creates an instance of PacketCaptureResultInner class.
     */
    public PacketCaptureResultInner() {
    }

    /**
     * Get the name property: Name of the packet capture session.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: ID of the packet capture operation.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the innerProperties property: Properties of the packet capture result.
     * 
     * @return the innerProperties value.
     */
    private PacketCaptureResultProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: The provisioning state of the packet capture session.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the target property: The ID of the targeted resource, only AzureVM and AzureVMSS as target type are currently
     * supported.
     * 
     * @return the target value.
     */
    public String target() {
        return this.innerProperties() == null ? null : this.innerProperties().target();
    }

    /**
     * Set the target property: The ID of the targeted resource, only AzureVM and AzureVMSS as target type are currently
     * supported.
     * 
     * @param target the target value to set.
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withTarget(String target) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureResultProperties();
        }
        this.innerProperties().withTarget(target);
        return this;
    }

    /**
     * Get the scope property: A list of AzureVMSS instances which can be included or excluded to run packet capture. If
     * both included and excluded are empty, then the packet capture will run on all instances of AzureVMSS.
     * 
     * @return the scope value.
     */
    public PacketCaptureMachineScope scope() {
        return this.innerProperties() == null ? null : this.innerProperties().scope();
    }

    /**
     * Set the scope property: A list of AzureVMSS instances which can be included or excluded to run packet capture. If
     * both included and excluded are empty, then the packet capture will run on all instances of AzureVMSS.
     * 
     * @param scope the scope value to set.
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withScope(PacketCaptureMachineScope scope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureResultProperties();
        }
        this.innerProperties().withScope(scope);
        return this;
    }

    /**
     * Get the targetType property: Target type of the resource provided.
     * 
     * @return the targetType value.
     */
    public PacketCaptureTargetType targetType() {
        return this.innerProperties() == null ? null : this.innerProperties().targetType();
    }

    /**
     * Set the targetType property: Target type of the resource provided.
     * 
     * @param targetType the targetType value to set.
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withTargetType(PacketCaptureTargetType targetType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureResultProperties();
        }
        this.innerProperties().withTargetType(targetType);
        return this;
    }

    /**
     * Get the bytesToCapturePerPacket property: Number of bytes captured per packet, the remaining bytes are truncated.
     * 
     * @return the bytesToCapturePerPacket value.
     */
    public Long bytesToCapturePerPacket() {
        return this.innerProperties() == null ? null : this.innerProperties().bytesToCapturePerPacket();
    }

    /**
     * Set the bytesToCapturePerPacket property: Number of bytes captured per packet, the remaining bytes are truncated.
     * 
     * @param bytesToCapturePerPacket the bytesToCapturePerPacket value to set.
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withBytesToCapturePerPacket(Long bytesToCapturePerPacket) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureResultProperties();
        }
        this.innerProperties().withBytesToCapturePerPacket(bytesToCapturePerPacket);
        return this;
    }

    /**
     * Get the totalBytesPerSession property: Maximum size of the capture output.
     * 
     * @return the totalBytesPerSession value.
     */
    public Long totalBytesPerSession() {
        return this.innerProperties() == null ? null : this.innerProperties().totalBytesPerSession();
    }

    /**
     * Set the totalBytesPerSession property: Maximum size of the capture output.
     * 
     * @param totalBytesPerSession the totalBytesPerSession value to set.
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withTotalBytesPerSession(Long totalBytesPerSession) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureResultProperties();
        }
        this.innerProperties().withTotalBytesPerSession(totalBytesPerSession);
        return this;
    }

    /**
     * Get the timeLimitInSeconds property: Maximum duration of the capture session in seconds.
     * 
     * @return the timeLimitInSeconds value.
     */
    public Integer timeLimitInSeconds() {
        return this.innerProperties() == null ? null : this.innerProperties().timeLimitInSeconds();
    }

    /**
     * Set the timeLimitInSeconds property: Maximum duration of the capture session in seconds.
     * 
     * @param timeLimitInSeconds the timeLimitInSeconds value to set.
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withTimeLimitInSeconds(Integer timeLimitInSeconds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureResultProperties();
        }
        this.innerProperties().withTimeLimitInSeconds(timeLimitInSeconds);
        return this;
    }

    /**
     * Get the storageLocation property: The storage location for a packet capture session.
     * 
     * @return the storageLocation value.
     */
    public PacketCaptureStorageLocation storageLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().storageLocation();
    }

    /**
     * Set the storageLocation property: The storage location for a packet capture session.
     * 
     * @param storageLocation the storageLocation value to set.
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withStorageLocation(PacketCaptureStorageLocation storageLocation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureResultProperties();
        }
        this.innerProperties().withStorageLocation(storageLocation);
        return this;
    }

    /**
     * Get the filters property: A list of packet capture filters.
     * 
     * @return the filters value.
     */
    public List<PacketCaptureFilter> filters() {
        return this.innerProperties() == null ? null : this.innerProperties().filters();
    }

    /**
     * Set the filters property: A list of packet capture filters.
     * 
     * @param filters the filters value to set.
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withFilters(List<PacketCaptureFilter> filters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureResultProperties();
        }
        this.innerProperties().withFilters(filters);
        return this;
    }

    /**
     * Get the continuousCapture property: This continuous capture is a nullable boolean, which can hold 'null', 'true'
     * or 'false' value. If we do not pass this parameter, it would be consider as 'null', default value is 'null'.
     * 
     * @return the continuousCapture value.
     */
    public Boolean continuousCapture() {
        return this.innerProperties() == null ? null : this.innerProperties().continuousCapture();
    }

    /**
     * Set the continuousCapture property: This continuous capture is a nullable boolean, which can hold 'null', 'true'
     * or 'false' value. If we do not pass this parameter, it would be consider as 'null', default value is 'null'.
     * 
     * @param continuousCapture the continuousCapture value to set.
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withContinuousCapture(Boolean continuousCapture) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureResultProperties();
        }
        this.innerProperties().withContinuousCapture(continuousCapture);
        return this;
    }

    /**
     * Get the captureSettings property: The capture setting holds the 'FileCount', 'FileSizeInBytes',
     * 'SessionTimeLimitInSeconds' values.
     * 
     * @return the captureSettings value.
     */
    public PacketCaptureSettings captureSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().captureSettings();
    }

    /**
     * Set the captureSettings property: The capture setting holds the 'FileCount', 'FileSizeInBytes',
     * 'SessionTimeLimitInSeconds' values.
     * 
     * @param captureSettings the captureSettings value to set.
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withCaptureSettings(PacketCaptureSettings captureSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureResultProperties();
        }
        this.innerProperties().withCaptureSettings(captureSettings);
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
