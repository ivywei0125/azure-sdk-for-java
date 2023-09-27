// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The connection mode used to access CosmosDB account. Type: string. */
public final class CosmosDbConnectionMode extends ExpandableStringEnum<CosmosDbConnectionMode> {
    /** Static value Gateway for CosmosDbConnectionMode. */
    public static final CosmosDbConnectionMode GATEWAY = fromString("Gateway");

    /** Static value Direct for CosmosDbConnectionMode. */
    public static final CosmosDbConnectionMode DIRECT = fromString("Direct");

    /**
     * Creates a new instance of CosmosDbConnectionMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CosmosDbConnectionMode() {
    }

    /**
     * Creates or finds a CosmosDbConnectionMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CosmosDbConnectionMode.
     */
    @JsonCreator
    public static CosmosDbConnectionMode fromString(String name) {
        return fromString(name, CosmosDbConnectionMode.class);
    }

    /**
     * Gets known CosmosDbConnectionMode values.
     *
     * @return known CosmosDbConnectionMode values.
     */
    public static Collection<CosmosDbConnectionMode> values() {
        return values(CosmosDbConnectionMode.class);
    }
}
