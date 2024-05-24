// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Subresource type for vault AzureBackup, AzureBackup_secondary or AzureSiteRecovery.
 */
public final class VaultSubResourceType extends ExpandableStringEnum<VaultSubResourceType> {
    /**
     * Static value AzureBackup for VaultSubResourceType.
     */
    public static final VaultSubResourceType AZURE_BACKUP = fromString("AzureBackup");

    /**
     * Static value AzureBackup_secondary for VaultSubResourceType.
     */
    public static final VaultSubResourceType AZURE_BACKUP_SECONDARY = fromString("AzureBackup_secondary");

    /**
     * Static value AzureSiteRecovery for VaultSubResourceType.
     */
    public static final VaultSubResourceType AZURE_SITE_RECOVERY = fromString("AzureSiteRecovery");

    /**
     * Creates a new instance of VaultSubResourceType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VaultSubResourceType() {
    }

    /**
     * Creates or finds a VaultSubResourceType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VaultSubResourceType.
     */
    @JsonCreator
    public static VaultSubResourceType fromString(String name) {
        return fromString(name, VaultSubResourceType.class);
    }

    /**
     * Gets known VaultSubResourceType values.
     * 
     * @return known VaultSubResourceType values.
     */
    public static Collection<VaultSubResourceType> values() {
        return values(VaultSubResourceType.class);
    }
}
