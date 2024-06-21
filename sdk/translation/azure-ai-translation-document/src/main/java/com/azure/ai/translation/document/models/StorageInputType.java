// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.translation.document.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Storage type of the input documents source string.
 */
public final class StorageInputType extends ExpandableStringEnum<StorageInputType> {

    /**
     * Folder storage input type.
     */
    @Generated
    public static final StorageInputType FOLDER = fromString("Folder");

    /**
     * File storage input type.
     */
    @Generated
    public static final StorageInputType FILE = fromString("File");

    /**
     * Creates a new instance of StorageInputType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public StorageInputType() {
    }

    /**
     * Creates or finds a StorageInputType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StorageInputType.
     */
    @Generated
    @JsonCreator
    public static StorageInputType fromString(String name) {
        return fromString(name, StorageInputType.class);
    }

    /**
     * Gets known StorageInputType values.
     *
     * @return known StorageInputType values.
     */
    @Generated
    public static Collection<StorageInputType> values() {
        return values(StorageInputType.class);
    }
}
