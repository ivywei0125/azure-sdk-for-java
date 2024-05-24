// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The storage profile of the VMSS.
 */
@Fluent
public final class StorageProfile {
    /*
     * The Azure SKU name of the machines in the pool.
     */
    @JsonProperty(value = "osDiskStorageAccountType")
    private OsDiskStorageAccountType osDiskStorageAccountType;

    /*
     * A list of empty data disks to attach.
     */
    @JsonProperty(value = "dataDisks")
    private List<DataDisk> dataDisks;

    /**
     * Creates an instance of StorageProfile class.
     */
    public StorageProfile() {
    }

    /**
     * Get the osDiskStorageAccountType property: The Azure SKU name of the machines in the pool.
     * 
     * @return the osDiskStorageAccountType value.
     */
    public OsDiskStorageAccountType osDiskStorageAccountType() {
        return this.osDiskStorageAccountType;
    }

    /**
     * Set the osDiskStorageAccountType property: The Azure SKU name of the machines in the pool.
     * 
     * @param osDiskStorageAccountType the osDiskStorageAccountType value to set.
     * @return the StorageProfile object itself.
     */
    public StorageProfile withOsDiskStorageAccountType(OsDiskStorageAccountType osDiskStorageAccountType) {
        this.osDiskStorageAccountType = osDiskStorageAccountType;
        return this;
    }

    /**
     * Get the dataDisks property: A list of empty data disks to attach.
     * 
     * @return the dataDisks value.
     */
    public List<DataDisk> dataDisks() {
        return this.dataDisks;
    }

    /**
     * Set the dataDisks property: A list of empty data disks to attach.
     * 
     * @param dataDisks the dataDisks value to set.
     * @return the StorageProfile object itself.
     */
    public StorageProfile withDataDisks(List<DataDisk> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataDisks() != null) {
            dataDisks().forEach(e -> e.validate());
        }
    }
}
