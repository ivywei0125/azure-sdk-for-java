// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for RecordingStateInternal.
 */
public final class RecordingStateInternal extends ExpandableStringEnum<RecordingStateInternal> {
    /**
     * Static value active for RecordingStateInternal.
     */
    public static final RecordingStateInternal ACTIVE = fromString("active");

    /**
     * Static value inactive for RecordingStateInternal.
     */
    public static final RecordingStateInternal INACTIVE = fromString("inactive");

    /**
     * Creates a new instance of RecordingStateInternal value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RecordingStateInternal() {
    }

    /**
     * Creates or finds a RecordingStateInternal from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RecordingStateInternal.
     */
    public static RecordingStateInternal fromString(String name) {
        return fromString(name, RecordingStateInternal.class);
    }

    /**
     * Gets known RecordingStateInternal values.
     * 
     * @return known RecordingStateInternal values.
     */
    public static Collection<RecordingStateInternal> values() {
        return values(RecordingStateInternal.class);
    }
}
