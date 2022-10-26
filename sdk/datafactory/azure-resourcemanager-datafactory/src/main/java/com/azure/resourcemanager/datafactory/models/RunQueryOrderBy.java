// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An object to provide order by options for listing runs. */
@Fluent
public final class RunQueryOrderBy {
    /*
     * Parameter name to be used for order by. The allowed parameters to order by for pipeline runs are PipelineName,
     * RunStart, RunEnd and Status; for activity runs are ActivityName, ActivityRunStart, ActivityRunEnd and Status;
     * for trigger runs are TriggerName, TriggerRunTimestamp and Status.
     */
    @JsonProperty(value = "orderBy", required = true)
    private RunQueryOrderByField orderBy;

    /*
     * Sorting order of the parameter.
     */
    @JsonProperty(value = "order", required = true)
    private RunQueryOrder order;

    /** Creates an instance of RunQueryOrderBy class. */
    public RunQueryOrderBy() {
    }

    /**
     * Get the orderBy property: Parameter name to be used for order by. The allowed parameters to order by for pipeline
     * runs are PipelineName, RunStart, RunEnd and Status; for activity runs are ActivityName, ActivityRunStart,
     * ActivityRunEnd and Status; for trigger runs are TriggerName, TriggerRunTimestamp and Status.
     *
     * @return the orderBy value.
     */
    public RunQueryOrderByField orderBy() {
        return this.orderBy;
    }

    /**
     * Set the orderBy property: Parameter name to be used for order by. The allowed parameters to order by for pipeline
     * runs are PipelineName, RunStart, RunEnd and Status; for activity runs are ActivityName, ActivityRunStart,
     * ActivityRunEnd and Status; for trigger runs are TriggerName, TriggerRunTimestamp and Status.
     *
     * @param orderBy the orderBy value to set.
     * @return the RunQueryOrderBy object itself.
     */
    public RunQueryOrderBy withOrderBy(RunQueryOrderByField orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Get the order property: Sorting order of the parameter.
     *
     * @return the order value.
     */
    public RunQueryOrder order() {
        return this.order;
    }

    /**
     * Set the order property: Sorting order of the parameter.
     *
     * @param order the order value to set.
     * @return the RunQueryOrderBy object itself.
     */
    public RunQueryOrderBy withOrder(RunQueryOrder order) {
        this.order = order;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (orderBy() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property orderBy in model RunQueryOrderBy"));
        }
        if (order() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property order in model RunQueryOrderBy"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RunQueryOrderBy.class);
}
