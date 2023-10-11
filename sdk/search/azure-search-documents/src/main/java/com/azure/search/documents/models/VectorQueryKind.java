// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/** The kind of vector query being performed. */
public final class VectorQueryKind extends ExpandableStringEnum<VectorQueryKind> {
    /** Vector query where a raw vector value is provided. */
    public static final VectorQueryKind VECTOR = fromString("vector");

    /** Vector query where a text value that needs to be vectorized is provided. */
    public static final VectorQueryKind TEXT = fromString("text");

    /**
     * Creates a new instance of VectorQueryKind value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VectorQueryKind() {}

    /**
     * Creates or finds a VectorQueryKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VectorQueryKind.
     */
    public static VectorQueryKind fromString(String name) {
        return fromString(name, VectorQueryKind.class);
    }

    /**
     * Gets known VectorQueryKind values.
     *
     * @return known VectorQueryKind values.
     */
    public static Collection<VectorQueryKind> values() {
        return values(VectorQueryKind.class);
    }
}
