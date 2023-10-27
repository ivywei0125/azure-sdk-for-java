// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Confidence of the search result. */
public final class Confidence extends ExpandableStringEnum<Confidence> {
    /** Static value Low for Confidence. */
    public static final Confidence LOW = fromString("Low");

    /** Static value Medium for Confidence. */
    public static final Confidence MEDIUM = fromString("Medium");

    /** Static value High for Confidence. */
    public static final Confidence HIGH = fromString("High");

    /**
     * Creates a new instance of Confidence value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Confidence() {
    }

    /**
     * Creates or finds a Confidence from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Confidence.
     */
    @JsonCreator
    public static Confidence fromString(String name) {
        return fromString(name, Confidence.class);
    }

    /**
     * Gets known Confidence values.
     *
     * @return known Confidence values.
     */
    public static Collection<Confidence> values() {
        return values(Confidence.class);
    }
}
