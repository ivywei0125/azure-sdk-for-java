// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for GroupsOrderby. */
public final class GroupsOrderby extends ExpandableStringEnum<GroupsOrderby> {
    /** Static value id for GroupsOrderby. */
    public static final GroupsOrderby ID = fromString("id");

    /** Static value id desc for GroupsOrderby. */
    public static final GroupsOrderby ID_DESC = fromString("id desc");

    /** Static value deletedDateTime for GroupsOrderby. */
    public static final GroupsOrderby DELETED_DATE_TIME = fromString("deletedDateTime");

    /** Static value deletedDateTime desc for GroupsOrderby. */
    public static final GroupsOrderby DELETED_DATE_TIME_DESC = fromString("deletedDateTime desc");

    /**
     * Creates a new instance of GroupsOrderby value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public GroupsOrderby() {
    }

    /**
     * Creates or finds a GroupsOrderby from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GroupsOrderby.
     */
    @JsonCreator
    public static GroupsOrderby fromString(String name) {
        return fromString(name, GroupsOrderby.class);
    }

    /**
     * Gets known GroupsOrderby values.
     *
     * @return known GroupsOrderby values.
     */
    public static Collection<GroupsOrderby> values() {
        return values(GroupsOrderby.class);
    }
}
