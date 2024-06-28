// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * HCX Enterprise Site provisioning state.
 */
public final class HcxEnterpriseSiteProvisioningState extends ExpandableStringEnum<HcxEnterpriseSiteProvisioningState> {
    /**
     * Static value Succeeded for HcxEnterpriseSiteProvisioningState.
     */
    public static final HcxEnterpriseSiteProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for HcxEnterpriseSiteProvisioningState.
     */
    public static final HcxEnterpriseSiteProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Canceled for HcxEnterpriseSiteProvisioningState.
     */
    public static final HcxEnterpriseSiteProvisioningState CANCELED = fromString("Canceled");

    /**
     * Creates a new instance of HcxEnterpriseSiteProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public HcxEnterpriseSiteProvisioningState() {
    }

    /**
     * Creates or finds a HcxEnterpriseSiteProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding HcxEnterpriseSiteProvisioningState.
     */
    public static HcxEnterpriseSiteProvisioningState fromString(String name) {
        return fromString(name, HcxEnterpriseSiteProvisioningState.class);
    }

    /**
     * Gets known HcxEnterpriseSiteProvisioningState values.
     * 
     * @return known HcxEnterpriseSiteProvisioningState values.
     */
    public static Collection<HcxEnterpriseSiteProvisioningState> values() {
        return values(HcxEnterpriseSiteProvisioningState.class);
    }
}
