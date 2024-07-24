// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies whether the Auxiliary sku is enabled for the Network Interface
 * resource.
 */
public final class NetworkInterfaceAuxiliarySku extends ExpandableStringEnum<NetworkInterfaceAuxiliarySku> {
    /**
     * Static value None for NetworkInterfaceAuxiliarySku.
     */
    public static final NetworkInterfaceAuxiliarySku NONE = fromString("None");

    /**
     * Static value A1 for NetworkInterfaceAuxiliarySku.
     */
    public static final NetworkInterfaceAuxiliarySku A1 = fromString("A1");

    /**
     * Static value A2 for NetworkInterfaceAuxiliarySku.
     */
    public static final NetworkInterfaceAuxiliarySku A2 = fromString("A2");

    /**
     * Static value A4 for NetworkInterfaceAuxiliarySku.
     */
    public static final NetworkInterfaceAuxiliarySku A4 = fromString("A4");

    /**
     * Static value A8 for NetworkInterfaceAuxiliarySku.
     */
    public static final NetworkInterfaceAuxiliarySku A8 = fromString("A8");

    /**
     * Creates a new instance of NetworkInterfaceAuxiliarySku value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NetworkInterfaceAuxiliarySku() {
    }

    /**
     * Creates or finds a NetworkInterfaceAuxiliarySku from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NetworkInterfaceAuxiliarySku.
     */
    public static NetworkInterfaceAuxiliarySku fromString(String name) {
        return fromString(name, NetworkInterfaceAuxiliarySku.class);
    }

    /**
     * Gets known NetworkInterfaceAuxiliarySku values.
     * 
     * @return known NetworkInterfaceAuxiliarySku values.
     */
    public static Collection<NetworkInterfaceAuxiliarySku> values() {
        return values(NetworkInterfaceAuxiliarySku.class);
    }
}
