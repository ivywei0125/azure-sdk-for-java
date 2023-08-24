// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.resourcemanager.appcontainers.fluent.models.JobExecutionInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of JobExecution. */
public interface JobExecution {
    /**
     * Gets the name property: Job execution Name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the id property: Job execution Id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the type property: Job Type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the status property: Current running State of the job.
     *
     * @return the status value.
     */
    JobExecutionRunningState status();

    /**
     * Gets the startTime property: Job execution start time.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: Job execution end time.
     *
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the template property: Job's execution container.
     *
     * @return the template value.
     */
    JobExecutionTemplate template();

    /**
     * Gets the inner com.azure.resourcemanager.appcontainers.fluent.models.JobExecutionInner object.
     *
     * @return the inner object.
     */
    JobExecutionInner innerModel();
}
