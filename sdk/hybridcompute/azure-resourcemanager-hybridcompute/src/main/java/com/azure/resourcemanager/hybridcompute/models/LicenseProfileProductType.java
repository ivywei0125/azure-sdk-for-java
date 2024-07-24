// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The product type of the license.
 */
public final class LicenseProfileProductType extends ExpandableStringEnum<LicenseProfileProductType> {
    /**
     * Static value WindowsServer for LicenseProfileProductType.
     */
    public static final LicenseProfileProductType WINDOWS_SERVER = fromString("WindowsServer");

    /**
     * Static value WindowsIoTEnterprise for LicenseProfileProductType.
     */
    public static final LicenseProfileProductType WINDOWS_IO_TENTERPRISE = fromString("WindowsIoTEnterprise");

    /**
     * Creates a new instance of LicenseProfileProductType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LicenseProfileProductType() {
    }

    /**
     * Creates or finds a LicenseProfileProductType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LicenseProfileProductType.
     */
    public static LicenseProfileProductType fromString(String name) {
        return fromString(name, LicenseProfileProductType.class);
    }

    /**
     * Gets known LicenseProfileProductType values.
     * 
     * @return known LicenseProfileProductType values.
     */
    public static Collection<LicenseProfileProductType> values() {
        return values(LicenseProfileProductType.class);
    }
}
