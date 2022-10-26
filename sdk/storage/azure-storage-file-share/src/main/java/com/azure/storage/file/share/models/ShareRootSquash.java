// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ShareRootSquash. */
public enum ShareRootSquash {
    /** Enum value NoRootSquash. */
    NO_ROOT_SQUASH("NoRootSquash"),

    /** Enum value RootSquash. */
    ROOT_SQUASH("RootSquash"),

    /** Enum value AllSquash. */
    ALL_SQUASH("AllSquash");

    /** The actual serialized value for a ShareRootSquash instance. */
    private final String value;

    ShareRootSquash(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ShareRootSquash instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ShareRootSquash object, or null if unable to parse.
     */
    @JsonCreator
    public static ShareRootSquash fromString(String value) {
        if (value == null) {
            return null;
        }
        ShareRootSquash[] items = ShareRootSquash.values();
        for (ShareRootSquash item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
