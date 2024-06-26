// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The secrets related to disk job. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobSecretsType")
@JsonTypeName("DataBoxDisk")
@Immutable
public final class DataBoxDiskJobSecrets extends JobSecrets {
    /*
     * Contains the list of secrets object for that device.
     */
    @JsonProperty(value = "diskSecrets", access = JsonProperty.Access.WRITE_ONLY)
    private List<DiskSecret> diskSecrets;

    /*
     * PassKey for the disk Job.
     */
    @JsonProperty(value = "passKey", access = JsonProperty.Access.WRITE_ONLY)
    private String passKey;

    /*
     * Whether passkey was provided by user.
     */
    @JsonProperty(value = "isPasskeyUserDefined", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isPasskeyUserDefined;

    /** Creates an instance of DataBoxDiskJobSecrets class. */
    public DataBoxDiskJobSecrets() {
    }

    /**
     * Get the diskSecrets property: Contains the list of secrets object for that device.
     *
     * @return the diskSecrets value.
     */
    public List<DiskSecret> diskSecrets() {
        return this.diskSecrets;
    }

    /**
     * Get the passKey property: PassKey for the disk Job.
     *
     * @return the passKey value.
     */
    public String passKey() {
        return this.passKey;
    }

    /**
     * Get the isPasskeyUserDefined property: Whether passkey was provided by user.
     *
     * @return the isPasskeyUserDefined value.
     */
    public Boolean isPasskeyUserDefined() {
        return this.isPasskeyUserDefined;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (diskSecrets() != null) {
            diskSecrets().forEach(e -> e.validate());
        }
    }
}
