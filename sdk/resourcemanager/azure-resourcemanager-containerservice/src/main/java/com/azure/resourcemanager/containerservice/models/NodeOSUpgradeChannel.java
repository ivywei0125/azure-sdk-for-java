// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Collection;

/**
 * Node OS Upgrade Channel
 *
 * Manner in which the OS on your nodes is updated. The default is NodeImage.
 */
public final class NodeOSUpgradeChannel extends ExpandableStringEnum<NodeOSUpgradeChannel> {
    /**
     * Static value None for NodeOSUpgradeChannel.
     */
    public static final NodeOSUpgradeChannel NONE = fromString("None");

    /**
     * Static value Unmanaged for NodeOSUpgradeChannel.
     */
    public static final NodeOSUpgradeChannel UNMANAGED = fromString("Unmanaged");

    /**
     * Static value NodeImage for NodeOSUpgradeChannel.
     */
    public static final NodeOSUpgradeChannel NODE_IMAGE = fromString("NodeImage");

    /**
     * Static value SecurityPatch for NodeOSUpgradeChannel.
     */
    public static final NodeOSUpgradeChannel SECURITY_PATCH = fromString("SecurityPatch");

    /**
     * Creates a new instance of NodeOSUpgradeChannel value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NodeOSUpgradeChannel() {
    }

    /**
     * Creates or finds a NodeOSUpgradeChannel from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NodeOSUpgradeChannel.
     */
    @JsonCreator
    public static NodeOSUpgradeChannel fromString(String name) {
        return fromString(name, NodeOSUpgradeChannel.class);
    }

    /**
     * Gets known NodeOSUpgradeChannel values.
     *
     * @return known NodeOSUpgradeChannel values.
     */
    public static Collection<NodeOSUpgradeChannel> values() {
        return values(NodeOSUpgradeChannel.class);
    }
}
