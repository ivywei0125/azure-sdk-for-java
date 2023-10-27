// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of rule. */
public final class ApprovalMode extends ExpandableStringEnum<ApprovalMode> {
    /** Static value SingleStage for ApprovalMode. */
    public static final ApprovalMode SINGLE_STAGE = fromString("SingleStage");

    /** Static value Serial for ApprovalMode. */
    public static final ApprovalMode SERIAL = fromString("Serial");

    /** Static value Parallel for ApprovalMode. */
    public static final ApprovalMode PARALLEL = fromString("Parallel");

    /** Static value NoApproval for ApprovalMode. */
    public static final ApprovalMode NO_APPROVAL = fromString("NoApproval");

    /**
     * Creates a new instance of ApprovalMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ApprovalMode() {
    }

    /**
     * Creates or finds a ApprovalMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApprovalMode.
     */
    @JsonCreator
    public static ApprovalMode fromString(String name) {
        return fromString(name, ApprovalMode.class);
    }

    /**
     * Gets known ApprovalMode values.
     *
     * @return known ApprovalMode values.
     */
    public static Collection<ApprovalMode> values() {
        return values(ApprovalMode.class);
    }
}
