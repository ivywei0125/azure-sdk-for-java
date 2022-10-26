// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.ExecuteDataFlowActivityTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Execute data flow activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ExecuteDataFlow")
@Fluent
public final class ExecuteDataFlowActivity extends ExecutionActivity {
    /*
     * Execute data flow activity properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private ExecuteDataFlowActivityTypeProperties innerTypeProperties = new ExecuteDataFlowActivityTypeProperties();

    /** Creates an instance of ExecuteDataFlowActivity class. */
    public ExecuteDataFlowActivity() {
    }

    /**
     * Get the innerTypeProperties property: Execute data flow activity properties.
     *
     * @return the innerTypeProperties value.
     */
    private ExecuteDataFlowActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteDataFlowActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteDataFlowActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteDataFlowActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteDataFlowActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteDataFlowActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteDataFlowActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the dataFlow property: Data flow reference.
     *
     * @return the dataFlow value.
     */
    public DataFlowReference dataFlow() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().dataFlow();
    }

    /**
     * Set the dataFlow property: Data flow reference.
     *
     * @param dataFlow the dataFlow value to set.
     * @return the ExecuteDataFlowActivity object itself.
     */
    public ExecuteDataFlowActivity withDataFlow(DataFlowReference dataFlow) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteDataFlowActivityTypeProperties();
        }
        this.innerTypeProperties().withDataFlow(dataFlow);
        return this;
    }

    /**
     * Get the staging property: Staging info for execute data flow activity.
     *
     * @return the staging value.
     */
    public DataFlowStagingInfo staging() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().staging();
    }

    /**
     * Set the staging property: Staging info for execute data flow activity.
     *
     * @param staging the staging value to set.
     * @return the ExecuteDataFlowActivity object itself.
     */
    public ExecuteDataFlowActivity withStaging(DataFlowStagingInfo staging) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteDataFlowActivityTypeProperties();
        }
        this.innerTypeProperties().withStaging(staging);
        return this;
    }

    /**
     * Get the integrationRuntime property: The integration runtime reference.
     *
     * @return the integrationRuntime value.
     */
    public IntegrationRuntimeReference integrationRuntime() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().integrationRuntime();
    }

    /**
     * Set the integrationRuntime property: The integration runtime reference.
     *
     * @param integrationRuntime the integrationRuntime value to set.
     * @return the ExecuteDataFlowActivity object itself.
     */
    public ExecuteDataFlowActivity withIntegrationRuntime(IntegrationRuntimeReference integrationRuntime) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteDataFlowActivityTypeProperties();
        }
        this.innerTypeProperties().withIntegrationRuntime(integrationRuntime);
        return this;
    }

    /**
     * Get the compute property: Compute properties for data flow activity.
     *
     * @return the compute value.
     */
    public ExecuteDataFlowActivityTypePropertiesCompute compute() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().compute();
    }

    /**
     * Set the compute property: Compute properties for data flow activity.
     *
     * @param compute the compute value to set.
     * @return the ExecuteDataFlowActivity object itself.
     */
    public ExecuteDataFlowActivity withCompute(ExecuteDataFlowActivityTypePropertiesCompute compute) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteDataFlowActivityTypeProperties();
        }
        this.innerTypeProperties().withCompute(compute);
        return this;
    }

    /**
     * Get the traceLevel property: Trace level setting used for data flow monitoring output. Supported values are:
     * 'coarse', 'fine', and 'none'. Type: string (or Expression with resultType string).
     *
     * @return the traceLevel value.
     */
    public Object traceLevel() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().traceLevel();
    }

    /**
     * Set the traceLevel property: Trace level setting used for data flow monitoring output. Supported values are:
     * 'coarse', 'fine', and 'none'. Type: string (or Expression with resultType string).
     *
     * @param traceLevel the traceLevel value to set.
     * @return the ExecuteDataFlowActivity object itself.
     */
    public ExecuteDataFlowActivity withTraceLevel(Object traceLevel) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteDataFlowActivityTypeProperties();
        }
        this.innerTypeProperties().withTraceLevel(traceLevel);
        return this;
    }

    /**
     * Get the continueOnError property: Continue on error setting used for data flow execution. Enables processing to
     * continue if a sink fails. Type: boolean (or Expression with resultType boolean).
     *
     * @return the continueOnError value.
     */
    public Object continueOnError() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().continueOnError();
    }

    /**
     * Set the continueOnError property: Continue on error setting used for data flow execution. Enables processing to
     * continue if a sink fails. Type: boolean (or Expression with resultType boolean).
     *
     * @param continueOnError the continueOnError value to set.
     * @return the ExecuteDataFlowActivity object itself.
     */
    public ExecuteDataFlowActivity withContinueOnError(Object continueOnError) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteDataFlowActivityTypeProperties();
        }
        this.innerTypeProperties().withContinueOnError(continueOnError);
        return this;
    }

    /**
     * Get the runConcurrently property: Concurrent run setting used for data flow execution. Allows sinks with the same
     * save order to be processed concurrently. Type: boolean (or Expression with resultType boolean).
     *
     * @return the runConcurrently value.
     */
    public Object runConcurrently() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().runConcurrently();
    }

    /**
     * Set the runConcurrently property: Concurrent run setting used for data flow execution. Allows sinks with the same
     * save order to be processed concurrently. Type: boolean (or Expression with resultType boolean).
     *
     * @param runConcurrently the runConcurrently value to set.
     * @return the ExecuteDataFlowActivity object itself.
     */
    public ExecuteDataFlowActivity withRunConcurrently(Object runConcurrently) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteDataFlowActivityTypeProperties();
        }
        this.innerTypeProperties().withRunConcurrently(runConcurrently);
        return this;
    }

    /**
     * Get the sourceStagingConcurrency property: Specify number of parallel staging for sources applicable to the sink.
     * Type: integer (or Expression with resultType integer).
     *
     * @return the sourceStagingConcurrency value.
     */
    public Object sourceStagingConcurrency() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sourceStagingConcurrency();
    }

    /**
     * Set the sourceStagingConcurrency property: Specify number of parallel staging for sources applicable to the sink.
     * Type: integer (or Expression with resultType integer).
     *
     * @param sourceStagingConcurrency the sourceStagingConcurrency value to set.
     * @return the ExecuteDataFlowActivity object itself.
     */
    public ExecuteDataFlowActivity withSourceStagingConcurrency(Object sourceStagingConcurrency) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteDataFlowActivityTypeProperties();
        }
        this.innerTypeProperties().withSourceStagingConcurrency(sourceStagingConcurrency);
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
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model ExecuteDataFlowActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExecuteDataFlowActivity.class);
}
