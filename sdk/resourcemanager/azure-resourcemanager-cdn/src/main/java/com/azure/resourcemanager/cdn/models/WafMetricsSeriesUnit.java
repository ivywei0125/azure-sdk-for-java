// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WafMetricsSeriesUnit. */
public final class WafMetricsSeriesUnit extends ExpandableStringEnum<WafMetricsSeriesUnit> {
    /** Static value count for WafMetricsSeriesUnit. */
    public static final WafMetricsSeriesUnit COUNT = fromString("count");

    /**
     * Creates a new instance of WafMetricsSeriesUnit value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public WafMetricsSeriesUnit() {
    }

    /**
     * Creates or finds a WafMetricsSeriesUnit from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WafMetricsSeriesUnit.
     */
    @JsonCreator
    public static WafMetricsSeriesUnit fromString(String name) {
        return fromString(name, WafMetricsSeriesUnit.class);
    }

    /**
     * Gets known WafMetricsSeriesUnit values.
     *
     * @return known WafMetricsSeriesUnit values.
     */
    public static Collection<WafMetricsSeriesUnit> values() {
        return values(WafMetricsSeriesUnit.class);
    }
}
