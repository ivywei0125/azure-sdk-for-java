// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The DiscoGroup model. */
@Immutable
public final class DiscoGroup {

    /*
     * The system generated unique id for the resource.
     */
    @Generated
    @JsonProperty(value = "id")
    private String id;

    /*
     * The caller provided unique name for the resource.
     */
    @Generated
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The name that can be used for display purposes.
     */
    @Generated
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The description for a disco group.
     */
    @Generated
    @JsonProperty(value = "description")
    private String description;

    /*
     * The tier for the disco group which will affect the algorithm used for the disco runs in this group.
     */
    @Generated
    @JsonProperty(value = "tier")
    private String tier;

    /*
     * The frequency at which the disco group is supposed to be rerun in milliseconds.
     */
    @Generated
    @JsonProperty(value = "frequencyMilliseconds")
    private Long frequencyMilliseconds;

    /*
     * The list of seeds used for the disco group runs.
     */
    @Generated
    @JsonProperty(value = "seeds")
    private List<DiscoSource> seeds;

    /*
     * The list of names used for the disco group runs.
     */
    @Generated
    @JsonProperty(value = "names")
    private List<String> names;

    /*
     * The list of excludes used for the disco group runs, aka assets to exclude from the discovery algorithm.
     */
    @Generated
    @JsonProperty(value = "excludes")
    private List<DiscoSource> excludes;

    /*
     * The latest run of this disco group with some limited information, null if the group has never been run.
     */
    @Generated
    @JsonProperty(value = "latestRun")
    private DiscoRunResult latestRun;

    /*
     * The date for the disco group was created.
     */
    @Generated
    @JsonProperty(value = "createdDate")
    private OffsetDateTime createdDate;

    /*
     * The unique identifier for the disco template used for the disco group creation.
     */
    @Generated
    @JsonProperty(value = "templateId")
    private String templateId;

    /** Creates an instance of DiscoGroup class. */
    @Generated
    private DiscoGroup() {}

    /**
     * Get the id property: The system generated unique id for the resource.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: The caller provided unique name for the resource.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the displayName property: The name that can be used for display purposes.
     *
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Get the description property: The description for a disco group.
     *
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the tier property: The tier for the disco group which will affect the algorithm used for the disco runs in
     * this group.
     *
     * @return the tier value.
     */
    @Generated
    public String getTier() {
        return this.tier;
    }

    /**
     * Get the frequencyMilliseconds property: The frequency at which the disco group is supposed to be rerun in
     * milliseconds.
     *
     * @return the frequencyMilliseconds value.
     */
    @Generated
    public Long getFrequencyMilliseconds() {
        return this.frequencyMilliseconds;
    }

    /**
     * Get the seeds property: The list of seeds used for the disco group runs.
     *
     * @return the seeds value.
     */
    @Generated
    public List<DiscoSource> getSeeds() {
        return this.seeds;
    }

    /**
     * Get the names property: The list of names used for the disco group runs.
     *
     * @return the names value.
     */
    @Generated
    public List<String> getNames() {
        return this.names;
    }

    /**
     * Get the excludes property: The list of excludes used for the disco group runs, aka assets to exclude from the
     * discovery algorithm.
     *
     * @return the excludes value.
     */
    @Generated
    public List<DiscoSource> getExcludes() {
        return this.excludes;
    }

    /**
     * Get the latestRun property: The latest run of this disco group with some limited information, null if the group
     * has never been run.
     *
     * @return the latestRun value.
     */
    @Generated
    public DiscoRunResult getLatestRun() {
        return this.latestRun;
    }

    /**
     * Get the createdDate property: The date for the disco group was created.
     *
     * @return the createdDate value.
     */
    @Generated
    public OffsetDateTime getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Get the templateId property: The unique identifier for the disco template used for the disco group creation.
     *
     * @return the templateId value.
     */
    @Generated
    public String getTemplateId() {
        return this.templateId;
    }
}
