// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/** Simple policy schedule. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "schedulePolicyType")
@JsonTypeName("SimpleSchedulePolicy")
@Fluent
public final class SimpleSchedulePolicy extends SchedulePolicy {
    /*
     * Frequency of the schedule operation of this policy.
     */
    @JsonProperty(value = "scheduleRunFrequency")
    private ScheduleRunType scheduleRunFrequency;

    /*
     * List of days of week this schedule has to be run.
     */
    @JsonProperty(value = "scheduleRunDays")
    private List<DayOfWeek> scheduleRunDays;

    /*
     * List of times of day this schedule has to be run.
     */
    @JsonProperty(value = "scheduleRunTimes")
    private List<OffsetDateTime> scheduleRunTimes;

    /*
     * Hourly Schedule of this Policy
     */
    @JsonProperty(value = "hourlySchedule")
    private HourlySchedule hourlySchedule;

    /*
     * At every number weeks this schedule has to be run.
     */
    @JsonProperty(value = "scheduleWeeklyFrequency")
    private Integer scheduleWeeklyFrequency;

    /** Creates an instance of SimpleSchedulePolicy class. */
    public SimpleSchedulePolicy() {
    }

    /**
     * Get the scheduleRunFrequency property: Frequency of the schedule operation of this policy.
     *
     * @return the scheduleRunFrequency value.
     */
    public ScheduleRunType scheduleRunFrequency() {
        return this.scheduleRunFrequency;
    }

    /**
     * Set the scheduleRunFrequency property: Frequency of the schedule operation of this policy.
     *
     * @param scheduleRunFrequency the scheduleRunFrequency value to set.
     * @return the SimpleSchedulePolicy object itself.
     */
    public SimpleSchedulePolicy withScheduleRunFrequency(ScheduleRunType scheduleRunFrequency) {
        this.scheduleRunFrequency = scheduleRunFrequency;
        return this;
    }

    /**
     * Get the scheduleRunDays property: List of days of week this schedule has to be run.
     *
     * @return the scheduleRunDays value.
     */
    public List<DayOfWeek> scheduleRunDays() {
        return this.scheduleRunDays;
    }

    /**
     * Set the scheduleRunDays property: List of days of week this schedule has to be run.
     *
     * @param scheduleRunDays the scheduleRunDays value to set.
     * @return the SimpleSchedulePolicy object itself.
     */
    public SimpleSchedulePolicy withScheduleRunDays(List<DayOfWeek> scheduleRunDays) {
        this.scheduleRunDays = scheduleRunDays;
        return this;
    }

    /**
     * Get the scheduleRunTimes property: List of times of day this schedule has to be run.
     *
     * @return the scheduleRunTimes value.
     */
    public List<OffsetDateTime> scheduleRunTimes() {
        return this.scheduleRunTimes;
    }

    /**
     * Set the scheduleRunTimes property: List of times of day this schedule has to be run.
     *
     * @param scheduleRunTimes the scheduleRunTimes value to set.
     * @return the SimpleSchedulePolicy object itself.
     */
    public SimpleSchedulePolicy withScheduleRunTimes(List<OffsetDateTime> scheduleRunTimes) {
        this.scheduleRunTimes = scheduleRunTimes;
        return this;
    }

    /**
     * Get the hourlySchedule property: Hourly Schedule of this Policy.
     *
     * @return the hourlySchedule value.
     */
    public HourlySchedule hourlySchedule() {
        return this.hourlySchedule;
    }

    /**
     * Set the hourlySchedule property: Hourly Schedule of this Policy.
     *
     * @param hourlySchedule the hourlySchedule value to set.
     * @return the SimpleSchedulePolicy object itself.
     */
    public SimpleSchedulePolicy withHourlySchedule(HourlySchedule hourlySchedule) {
        this.hourlySchedule = hourlySchedule;
        return this;
    }

    /**
     * Get the scheduleWeeklyFrequency property: At every number weeks this schedule has to be run.
     *
     * @return the scheduleWeeklyFrequency value.
     */
    public Integer scheduleWeeklyFrequency() {
        return this.scheduleWeeklyFrequency;
    }

    /**
     * Set the scheduleWeeklyFrequency property: At every number weeks this schedule has to be run.
     *
     * @param scheduleWeeklyFrequency the scheduleWeeklyFrequency value to set.
     * @return the SimpleSchedulePolicy object itself.
     */
    public SimpleSchedulePolicy withScheduleWeeklyFrequency(Integer scheduleWeeklyFrequency) {
        this.scheduleWeeklyFrequency = scheduleWeeklyFrequency;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (hourlySchedule() != null) {
            hourlySchedule().validate();
        }
    }
}
