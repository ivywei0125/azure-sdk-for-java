// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Operation mode of the operation: Import, Export, or PolybaseImport. */
public final class OperationMode extends ExpandableStringEnum<OperationMode> {
    /** Static value PolybaseImport for OperationMode. */
    public static final OperationMode POLYBASE_IMPORT = fromString("PolybaseImport");

    /** Static value Import for OperationMode. */
    public static final OperationMode IMPORT = fromString("Import");

    /** Static value Export for OperationMode. */
    public static final OperationMode EXPORT = fromString("Export");

    /**
     * Creates or finds a OperationMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperationMode.
     */
    @JsonCreator
    public static OperationMode fromString(String name) {
        return fromString(name, OperationMode.class);
    }

    /**
     * Gets known OperationMode values.
     *
     * @return known OperationMode values.
     */
    public static Collection<OperationMode> values() {
        return values(OperationMode.class);
    }
}