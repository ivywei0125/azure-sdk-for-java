// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.spark.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The batch state.
 */
public final class LivyStates extends ExpandableStringEnum<LivyStates> {
    /**
     * Static value not_started for LivyStates.
     */
    public static final LivyStates NOT_STARTED = fromString("not_started");

    /**
     * Static value starting for LivyStates.
     */
    public static final LivyStates STARTING = fromString("starting");

    /**
     * Static value idle for LivyStates.
     */
    public static final LivyStates IDLE = fromString("idle");

    /**
     * Static value busy for LivyStates.
     */
    public static final LivyStates BUSY = fromString("busy");

    /**
     * Static value shutting_down for LivyStates.
     */
    public static final LivyStates SHUTTING_DOWN = fromString("shutting_down");

    /**
     * Static value error for LivyStates.
     */
    public static final LivyStates ERROR = fromString("error");

    /**
     * Static value dead for LivyStates.
     */
    public static final LivyStates DEAD = fromString("dead");

    /**
     * Static value killed for LivyStates.
     */
    public static final LivyStates KILLED = fromString("killed");

    /**
     * Static value success for LivyStates.
     */
    public static final LivyStates SUCCESS = fromString("success");

    /**
     * Static value running for LivyStates.
     */
    public static final LivyStates RUNNING = fromString("running");

    /**
     * Static value recovering for LivyStates.
     */
    public static final LivyStates RECOVERING = fromString("recovering");

    /**
     * Creates a new instance of LivyStates value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LivyStates() {
    }

    /**
     * Creates or finds a LivyStates from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LivyStates.
     */
    public static LivyStates fromString(String name) {
        return fromString(name, LivyStates.class);
    }

    /**
     * Gets known LivyStates values.
     * 
     * @return known LivyStates values.
     */
    public static Collection<LivyStates> values() {
        return values(LivyStates.class);
    }
}
