// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity snowflake sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SnowflakeSink")
@Fluent
public final class SnowflakeSink extends CopySink {
    /*
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "preCopyScript")
    private Object preCopyScript;

    /*
     * Snowflake import settings.
     */
    @JsonProperty(value = "importSettings")
    private SnowflakeImportCopyCommand importSettings;

    /** Creates an instance of SnowflakeSink class. */
    public SnowflakeSink() {
    }

    /**
     * Get the preCopyScript property: SQL pre-copy script. Type: string (or Expression with resultType string).
     *
     * @return the preCopyScript value.
     */
    public Object preCopyScript() {
        return this.preCopyScript;
    }

    /**
     * Set the preCopyScript property: SQL pre-copy script. Type: string (or Expression with resultType string).
     *
     * @param preCopyScript the preCopyScript value to set.
     * @return the SnowflakeSink object itself.
     */
    public SnowflakeSink withPreCopyScript(Object preCopyScript) {
        this.preCopyScript = preCopyScript;
        return this;
    }

    /**
     * Get the importSettings property: Snowflake import settings.
     *
     * @return the importSettings value.
     */
    public SnowflakeImportCopyCommand importSettings() {
        return this.importSettings;
    }

    /**
     * Set the importSettings property: Snowflake import settings.
     *
     * @param importSettings the importSettings value to set.
     * @return the SnowflakeSink object itself.
     */
    public SnowflakeSink withImportSettings(SnowflakeImportCopyCommand importSettings) {
        this.importSettings = importSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SnowflakeSink withWriteBatchSize(Object writeBatchSize) {
        super.withWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SnowflakeSink withWriteBatchTimeout(Object writeBatchTimeout) {
        super.withWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SnowflakeSink withSinkRetryCount(Object sinkRetryCount) {
        super.withSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SnowflakeSink withSinkRetryWait(Object sinkRetryWait) {
        super.withSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SnowflakeSink withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SnowflakeSink withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
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
        if (importSettings() != null) {
            importSettings().validate();
        }
    }
}
