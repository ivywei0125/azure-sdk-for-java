// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.translation.document.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Definition for the input batch translation request.
 */
@Fluent
public final class BatchRequest {

    /*
     * Source of the input documents
     */
    @Generated
    @JsonProperty(value = "source")
    private final SourceInput source;

    /*
     * Location of the destination for the output
     */
    @Generated
    @JsonProperty(value = "targets")
    private final List<TargetInput> targets;

    /*
     * Storage type of the input documents source string
     */
    @Generated
    @JsonProperty(value = "storageType")
    private StorageInputType storageType;

    /**
     * Creates an instance of BatchRequest class.
     *
     * @param source the source value to set.
     * @param targets the targets value to set.
     */
    @Generated
    @JsonCreator
    public BatchRequest(@JsonProperty(value = "source") SourceInput source,
        @JsonProperty(value = "targets") List<TargetInput> targets) {
        this.source = source;
        this.targets = targets;
    }

    /**
     * Get the source property: Source of the input documents.
     *
     * @return the source value.
     */
    @Generated
    public SourceInput getSource() {
        return this.source;
    }

    /**
     * Get the targets property: Location of the destination for the output.
     *
     * @return the targets value.
     */
    @Generated
    public List<TargetInput> getTargets() {
        return this.targets;
    }

    /**
     * Get the storageType property: Storage type of the input documents source string.
     *
     * @return the storageType value.
     */
    @Generated
    public StorageInputType getStorageType() {
        return this.storageType;
    }

    /**
     * Set the storageType property: Storage type of the input documents source string.
     *
     * @param storageType the storageType value to set.
     * @return the BatchRequest object itself.
     */
    @Generated
    public BatchRequest setStorageType(StorageInputType storageType) {
        this.storageType = storageType;
        return this;
    }
}
