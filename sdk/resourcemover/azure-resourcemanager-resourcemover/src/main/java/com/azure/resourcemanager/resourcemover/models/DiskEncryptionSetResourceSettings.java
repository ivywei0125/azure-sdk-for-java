// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Defines the disk encryption set resource settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resourceType")
@JsonTypeName("Microsoft.Compute/diskEncryptionSets")
@Fluent
public final class DiskEncryptionSetResourceSettings extends ResourceSettings {
    /** Creates an instance of DiskEncryptionSetResourceSettings class. */
    public DiskEncryptionSetResourceSettings() {
    }

    /** {@inheritDoc} */
    @Override
    public DiskEncryptionSetResourceSettings withTargetResourceName(String targetResourceName) {
        super.withTargetResourceName(targetResourceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DiskEncryptionSetResourceSettings withTargetResourceGroupName(String targetResourceGroupName) {
        super.withTargetResourceGroupName(targetResourceGroupName);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
