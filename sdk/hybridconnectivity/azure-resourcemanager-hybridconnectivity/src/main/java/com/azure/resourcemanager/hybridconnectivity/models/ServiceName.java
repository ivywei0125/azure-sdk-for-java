// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridconnectivity.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Name of the service. */
public final class ServiceName extends ExpandableStringEnum<ServiceName> {
    /** Static value SSH for ServiceName. */
    public static final ServiceName SSH = fromString("SSH");

    /** Static value WAC for ServiceName. */
    public static final ServiceName WAC = fromString("WAC");

    /**
     * Creates a new instance of ServiceName value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ServiceName() {
    }

    /**
     * Creates or finds a ServiceName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServiceName.
     */
    @JsonCreator
    public static ServiceName fromString(String name) {
        return fromString(name, ServiceName.class);
    }

    /**
     * Gets known ServiceName values.
     *
     * @return known ServiceName values.
     */
    public static Collection<ServiceName> values() {
        return values(ServiceName.class);
    }
}
