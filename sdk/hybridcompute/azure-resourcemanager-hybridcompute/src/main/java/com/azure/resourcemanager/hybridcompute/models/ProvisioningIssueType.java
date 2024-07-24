// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Type of provisioning issue.
 */
public final class ProvisioningIssueType extends ExpandableStringEnum<ProvisioningIssueType> {
    /**
     * Static value MissingPerimeterConfiguration for ProvisioningIssueType.
     */
    public static final ProvisioningIssueType MISSING_PERIMETER_CONFIGURATION
        = fromString("MissingPerimeterConfiguration");

    /**
     * Static value MissingIdentityConfiguration for ProvisioningIssueType.
     */
    public static final ProvisioningIssueType MISSING_IDENTITY_CONFIGURATION
        = fromString("MissingIdentityConfiguration");

    /**
     * Static value ConfigurationPropagationFailure for ProvisioningIssueType.
     */
    public static final ProvisioningIssueType CONFIGURATION_PROPAGATION_FAILURE
        = fromString("ConfigurationPropagationFailure");

    /**
     * Static value Other for ProvisioningIssueType.
     */
    public static final ProvisioningIssueType OTHER = fromString("Other");

    /**
     * Creates a new instance of ProvisioningIssueType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProvisioningIssueType() {
    }

    /**
     * Creates or finds a ProvisioningIssueType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ProvisioningIssueType.
     */
    public static ProvisioningIssueType fromString(String name) {
        return fromString(name, ProvisioningIssueType.class);
    }

    /**
     * Gets known ProvisioningIssueType values.
     * 
     * @return known ProvisioningIssueType values.
     */
    public static Collection<ProvisioningIssueType> values() {
        return values(ProvisioningIssueType.class);
    }
}
