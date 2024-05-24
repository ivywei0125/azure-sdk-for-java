// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Parameters for creating an Azure Batch Job.
 */
@Fluent
public final class BatchJobCreateContent implements JsonSerializable<BatchJobCreateContent> {

    /*
     * A string that uniquely identifies the Job within the Account. The ID can contain any combination of alphanumeric
     * characters including hyphens and underscores, and cannot contain more than 64 characters. The ID is
     * case-preserving and case-insensitive (that is, you may not have two IDs within an Account that differ only by
     * case).
     */
    @Generated
    private final String id;

    /*
     * The display name for the Job. The display name need not be unique and can contain any Unicode characters up to a
     * maximum length of 1024.
     */
    @Generated
    private String displayName;

    /*
     * Whether Tasks in the Job can define dependencies on each other. The default is false.
     */
    @Generated
    private Boolean usesTaskDependencies;

    /*
     * The priority of the Job. Priority values can range from -1000 to 1000, with -1000 being the lowest priority and
     * 1000 being the highest priority. The default value is 0.
     */
    @Generated
    private Integer priority;

    /*
     * Whether Tasks in this job can be preempted by other high priority jobs. If the value is set to True, other high
     * priority jobs submitted to the system will take precedence and will be able requeue tasks from this job. You can
     * update a job's allowTaskPreemption after it has been created using the update job API.
     */
    @Generated
    private Boolean allowTaskPreemption;

    /*
     * The maximum number of tasks that can be executed in parallel for the job. The value of maxParallelTasks must be
     * -1 or greater than 0 if specified. If not specified, the default value is -1, which means there's no limit to the
     * number of tasks that can be run at once. You can update a job's maxParallelTasks after it has been created using
     * the update job API.
     */
    @Generated
    private Integer maxParallelTasks;

    /*
     * The execution constraints for the Job.
     */
    @Generated
    private BatchJobConstraints constraints;

    /*
     * Details of a Job Manager Task to be launched when the Job is started. If the Job does not specify a Job Manager
     * Task, the user must explicitly add Tasks to the Job. If the Job does specify a Job Manager Task, the Batch
     * service creates the Job Manager Task when the Job is created, and will try to schedule the Job Manager Task
     * before scheduling other Tasks in the Job. The Job Manager Task's typical purpose is to control and/or monitor Job
     * execution, for example by deciding what additional Tasks to run, determining when the work is complete, etc.
     * (However, a Job Manager Task is not restricted to these activities - it is a fully-fledged Task in the system and
     * perform whatever actions are required for the Job.) For example, a Job Manager Task might download a file
     * specified as a parameter, analyze the contents of that file and submit additional Tasks based on those contents.
     */
    @Generated
    private BatchJobManagerTask jobManagerTask;

    /*
     * The Job Preparation Task. If a Job has a Job Preparation Task, the Batch service will run the Job Preparation
     * Task on a Node before starting any Tasks of that Job on that Compute Node.
     */
    @Generated
    private BatchJobPreparationTask jobPreparationTask;

    /*
     * The Job Release Task. A Job Release Task cannot be specified without also specifying a Job Preparation Task for
     * the Job. The Batch service runs the Job Release Task on the Nodes that have run the Job Preparation Task. The
     * primary purpose of the Job Release Task is to undo changes to Compute Nodes made by the Job Preparation Task.
     * Example activities include deleting local files, or shutting down services that were started as part of Job
     * preparation.
     */
    @Generated
    private BatchJobReleaseTask jobReleaseTask;

    /*
     * The list of common environment variable settings. These environment variables are set for all Tasks in the Job
     * (including the Job Manager, Job Preparation and Job Release Tasks). Individual Tasks can override an environment
     * setting specified here by specifying the same setting name with a different value.
     */
    @Generated
    private List<EnvironmentSetting> commonEnvironmentSettings;

    /*
     * The Pool on which the Batch service runs the Job's Tasks.
     */
    @Generated
    private final BatchPoolInfo poolInfo;

    /*
     * The action the Batch service should take when all Tasks in the Job are in the completed state. Note that if a Job
     * contains no Tasks, then all Tasks are considered complete. This option is therefore most commonly used with a Job
     * Manager task; if you want to use automatic Job termination without a Job Manager, you should initially set
     * onAllTasksComplete to noaction and update the Job properties to set onAllTasksComplete to terminatejob once you
     * have finished adding Tasks. The default is noaction.
     */
    @Generated
    private OnAllBatchTasksComplete onAllTasksComplete;

    /*
     * The action the Batch service should take when any Task in the Job fails. A Task is considered to have failed if
     * has a failureInfo. A failureInfo is set if the Task completes with a non-zero exit code after exhausting its
     * retry count, or if there was an error starting the Task, for example due to a resource file download error. The
     * default is noaction.
     */
    @Generated
    private OnBatchTaskFailure onTaskFailure;

    /*
     * The network configuration for the Job.
     */
    @Generated
    private BatchJobNetworkConfiguration networkConfiguration;

    /*
     * A list of name-value pairs associated with the Job as metadata. The Batch service does not assign any meaning to
     * metadata; it is solely for the use of user code.
     */
    @Generated
    private List<MetadataItem> metadata;

    /**
     * Creates an instance of BatchJobCreateContent class.
     *
     * @param id the id value to set.
     * @param poolInfo the poolInfo value to set.
     */
    @Generated
    public BatchJobCreateContent(String id, BatchPoolInfo poolInfo) {
        this.id = id;
        this.poolInfo = poolInfo;
    }

    /**
     * Get the id property: A string that uniquely identifies the Job within the Account. The ID can contain any
     * combination of alphanumeric characters including hyphens and underscores, and cannot contain more than 64
     * characters. The ID is case-preserving and case-insensitive (that is, you may not have two IDs within an Account
     * that differ only by case).
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the displayName property: The display name for the Job. The display name need not be unique and can contain
     * any Unicode characters up to a maximum length of 1024.
     *
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name for the Job. The display name need not be unique and can contain
     * any Unicode characters up to a maximum length of 1024.
     *
     * @param displayName the displayName value to set.
     * @return the BatchJobCreateContent object itself.
     */
    @Generated
    public BatchJobCreateContent setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the usesTaskDependencies property: Whether Tasks in the Job can define dependencies on each other. The
     * default is false.
     *
     * @return the usesTaskDependencies value.
     */
    @Generated
    public Boolean isUsesTaskDependencies() {
        return this.usesTaskDependencies;
    }

    /**
     * Set the usesTaskDependencies property: Whether Tasks in the Job can define dependencies on each other. The
     * default is false.
     *
     * @param usesTaskDependencies the usesTaskDependencies value to set.
     * @return the BatchJobCreateContent object itself.
     */
    @Generated
    public BatchJobCreateContent setUsesTaskDependencies(Boolean usesTaskDependencies) {
        this.usesTaskDependencies = usesTaskDependencies;
        return this;
    }

    /**
     * Get the priority property: The priority of the Job. Priority values can range from -1000 to 1000, with -1000
     * being the lowest priority and 1000 being the highest priority. The default value is 0.
     *
     * @return the priority value.
     */
    @Generated
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Set the priority property: The priority of the Job. Priority values can range from -1000 to 1000, with -1000
     * being the lowest priority and 1000 being the highest priority. The default value is 0.
     *
     * @param priority the priority value to set.
     * @return the BatchJobCreateContent object itself.
     */
    @Generated
    public BatchJobCreateContent setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the allowTaskPreemption property: Whether Tasks in this job can be preempted by other high priority jobs. If
     * the value is set to True, other high priority jobs submitted to the system will take precedence and will be able
     * requeue tasks from this job. You can update a job's allowTaskPreemption after it has been created using the
     * update job API.
     *
     * @return the allowTaskPreemption value.
     */
    @Generated
    public Boolean isAllowTaskPreemption() {
        return this.allowTaskPreemption;
    }

    /**
     * Set the allowTaskPreemption property: Whether Tasks in this job can be preempted by other high priority jobs. If
     * the value is set to True, other high priority jobs submitted to the system will take precedence and will be able
     * requeue tasks from this job. You can update a job's allowTaskPreemption after it has been created using the
     * update job API.
     *
     * @param allowTaskPreemption the allowTaskPreemption value to set.
     * @return the BatchJobCreateContent object itself.
     */
    @Generated
    public BatchJobCreateContent setAllowTaskPreemption(Boolean allowTaskPreemption) {
        this.allowTaskPreemption = allowTaskPreemption;
        return this;
    }

    /**
     * Get the maxParallelTasks property: The maximum number of tasks that can be executed in parallel for the job. The
     * value of maxParallelTasks must be -1 or greater than 0 if specified. If not specified, the default value is -1,
     * which means there's no limit to the number of tasks that can be run at once. You can update a job's
     * maxParallelTasks after it has been created using the update job API.
     *
     * @return the maxParallelTasks value.
     */
    @Generated
    public Integer getMaxParallelTasks() {
        return this.maxParallelTasks;
    }

    /**
     * Set the maxParallelTasks property: The maximum number of tasks that can be executed in parallel for the job. The
     * value of maxParallelTasks must be -1 or greater than 0 if specified. If not specified, the default value is -1,
     * which means there's no limit to the number of tasks that can be run at once. You can update a job's
     * maxParallelTasks after it has been created using the update job API.
     *
     * @param maxParallelTasks the maxParallelTasks value to set.
     * @return the BatchJobCreateContent object itself.
     */
    @Generated
    public BatchJobCreateContent setMaxParallelTasks(Integer maxParallelTasks) {
        this.maxParallelTasks = maxParallelTasks;
        return this;
    }

    /**
     * Get the constraints property: The execution constraints for the Job.
     *
     * @return the constraints value.
     */
    @Generated
    public BatchJobConstraints getConstraints() {
        return this.constraints;
    }

    /**
     * Set the constraints property: The execution constraints for the Job.
     *
     * @param constraints the constraints value to set.
     * @return the BatchJobCreateContent object itself.
     */
    @Generated
    public BatchJobCreateContent setConstraints(BatchJobConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Get the jobManagerTask property: Details of a Job Manager Task to be launched when the Job is started. If the Job
     * does not specify a Job Manager Task, the user must explicitly add Tasks to the Job. If the Job does specify a Job
     * Manager Task, the Batch service creates the Job Manager Task when the Job is created, and will try to schedule
     * the Job Manager Task before scheduling other Tasks in the Job. The Job Manager Task's typical purpose is to
     * control and/or monitor Job execution, for example by deciding what additional Tasks to run, determining when the
     * work is complete, etc. (However, a Job Manager Task is not restricted to these activities - it is a fully-fledged
     * Task in the system and perform whatever actions are required for the Job.) For example, a Job Manager Task might
     * download a file specified as a parameter, analyze the contents of that file and submit additional Tasks based on
     * those contents.
     *
     * @return the jobManagerTask value.
     */
    @Generated
    public BatchJobManagerTask getJobManagerTask() {
        return this.jobManagerTask;
    }

    /**
     * Set the jobManagerTask property: Details of a Job Manager Task to be launched when the Job is started. If the Job
     * does not specify a Job Manager Task, the user must explicitly add Tasks to the Job. If the Job does specify a Job
     * Manager Task, the Batch service creates the Job Manager Task when the Job is created, and will try to schedule
     * the Job Manager Task before scheduling other Tasks in the Job. The Job Manager Task's typical purpose is to
     * control and/or monitor Job execution, for example by deciding what additional Tasks to run, determining when the
     * work is complete, etc. (However, a Job Manager Task is not restricted to these activities - it is a fully-fledged
     * Task in the system and perform whatever actions are required for the Job.) For example, a Job Manager Task might
     * download a file specified as a parameter, analyze the contents of that file and submit additional Tasks based on
     * those contents.
     *
     * @param jobManagerTask the jobManagerTask value to set.
     * @return the BatchJobCreateContent object itself.
     */
    @Generated
    public BatchJobCreateContent setJobManagerTask(BatchJobManagerTask jobManagerTask) {
        this.jobManagerTask = jobManagerTask;
        return this;
    }

    /**
     * Get the jobPreparationTask property: The Job Preparation Task. If a Job has a Job Preparation Task, the Batch
     * service will run the Job Preparation Task on a Node before starting any Tasks of that Job on that Compute Node.
     *
     * @return the jobPreparationTask value.
     */
    @Generated
    public BatchJobPreparationTask getJobPreparationTask() {
        return this.jobPreparationTask;
    }

    /**
     * Set the jobPreparationTask property: The Job Preparation Task. If a Job has a Job Preparation Task, the Batch
     * service will run the Job Preparation Task on a Node before starting any Tasks of that Job on that Compute Node.
     *
     * @param jobPreparationTask the jobPreparationTask value to set.
     * @return the BatchJobCreateContent object itself.
     */
    @Generated
    public BatchJobCreateContent setJobPreparationTask(BatchJobPreparationTask jobPreparationTask) {
        this.jobPreparationTask = jobPreparationTask;
        return this;
    }

    /**
     * Get the jobReleaseTask property: The Job Release Task. A Job Release Task cannot be specified without also
     * specifying a Job Preparation Task for the Job. The Batch service runs the Job Release Task on the Nodes that have
     * run the Job Preparation Task. The primary purpose of the Job Release Task is to undo changes to Compute Nodes
     * made by the Job Preparation Task. Example activities include deleting local files, or shutting down services that
     * were started as part of Job preparation.
     *
     * @return the jobReleaseTask value.
     */
    @Generated
    public BatchJobReleaseTask getJobReleaseTask() {
        return this.jobReleaseTask;
    }

    /**
     * Set the jobReleaseTask property: The Job Release Task. A Job Release Task cannot be specified without also
     * specifying a Job Preparation Task for the Job. The Batch service runs the Job Release Task on the Nodes that have
     * run the Job Preparation Task. The primary purpose of the Job Release Task is to undo changes to Compute Nodes
     * made by the Job Preparation Task. Example activities include deleting local files, or shutting down services that
     * were started as part of Job preparation.
     *
     * @param jobReleaseTask the jobReleaseTask value to set.
     * @return the BatchJobCreateContent object itself.
     */
    @Generated
    public BatchJobCreateContent setJobReleaseTask(BatchJobReleaseTask jobReleaseTask) {
        this.jobReleaseTask = jobReleaseTask;
        return this;
    }

    /**
     * Get the commonEnvironmentSettings property: The list of common environment variable settings. These environment
     * variables are set for all Tasks in the Job (including the Job Manager, Job Preparation and Job Release Tasks).
     * Individual Tasks can override an environment setting specified here by specifying the same setting name with a
     * different value.
     *
     * @return the commonEnvironmentSettings value.
     */
    @Generated
    public List<EnvironmentSetting> getCommonEnvironmentSettings() {
        return this.commonEnvironmentSettings;
    }

    /**
     * Set the commonEnvironmentSettings property: The list of common environment variable settings. These environment
     * variables are set for all Tasks in the Job (including the Job Manager, Job Preparation and Job Release Tasks).
     * Individual Tasks can override an environment setting specified here by specifying the same setting name with a
     * different value.
     *
     * @param commonEnvironmentSettings the commonEnvironmentSettings value to set.
     * @return the BatchJobCreateContent object itself.
     */
    @Generated
    public BatchJobCreateContent setCommonEnvironmentSettings(List<EnvironmentSetting> commonEnvironmentSettings) {
        this.commonEnvironmentSettings = commonEnvironmentSettings;
        return this;
    }

    /**
     * Get the poolInfo property: The Pool on which the Batch service runs the Job's Tasks.
     *
     * @return the poolInfo value.
     */
    @Generated
    public BatchPoolInfo getPoolInfo() {
        return this.poolInfo;
    }

    /**
     * Get the onAllTasksComplete property: The action the Batch service should take when all Tasks in the Job are in
     * the completed state. Note that if a Job contains no Tasks, then all Tasks are considered complete. This option is
     * therefore most commonly used with a Job Manager task; if you want to use automatic Job termination without a Job
     * Manager, you should initially set onAllTasksComplete to noaction and update the Job properties to set
     * onAllTasksComplete to terminatejob once you have finished adding Tasks. The default is noaction.
     *
     * @return the onAllTasksComplete value.
     */
    @Generated
    public OnAllBatchTasksComplete getOnAllTasksComplete() {
        return this.onAllTasksComplete;
    }

    /**
     * Set the onAllTasksComplete property: The action the Batch service should take when all Tasks in the Job are in
     * the completed state. Note that if a Job contains no Tasks, then all Tasks are considered complete. This option is
     * therefore most commonly used with a Job Manager task; if you want to use automatic Job termination without a Job
     * Manager, you should initially set onAllTasksComplete to noaction and update the Job properties to set
     * onAllTasksComplete to terminatejob once you have finished adding Tasks. The default is noaction.
     *
     * @param onAllTasksComplete the onAllTasksComplete value to set.
     * @return the BatchJobCreateContent object itself.
     */
    @Generated
    public BatchJobCreateContent setOnAllTasksComplete(OnAllBatchTasksComplete onAllTasksComplete) {
        this.onAllTasksComplete = onAllTasksComplete;
        return this;
    }

    /**
     * Get the onTaskFailure property: The action the Batch service should take when any Task in the Job fails. A Task
     * is considered to have failed if has a failureInfo. A failureInfo is set if the Task completes with a non-zero
     * exit code after exhausting its retry count, or if there was an error starting the Task, for example due to a
     * resource file download error. The default is noaction.
     *
     * @return the onTaskFailure value.
     */
    @Generated
    public OnBatchTaskFailure getOnTaskFailure() {
        return this.onTaskFailure;
    }

    /**
     * Set the onTaskFailure property: The action the Batch service should take when any Task in the Job fails. A Task
     * is considered to have failed if has a failureInfo. A failureInfo is set if the Task completes with a non-zero
     * exit code after exhausting its retry count, or if there was an error starting the Task, for example due to a
     * resource file download error. The default is noaction.
     *
     * @param onTaskFailure the onTaskFailure value to set.
     * @return the BatchJobCreateContent object itself.
     */
    @Generated
    public BatchJobCreateContent setOnTaskFailure(OnBatchTaskFailure onTaskFailure) {
        this.onTaskFailure = onTaskFailure;
        return this;
    }

    /**
     * Get the networkConfiguration property: The network configuration for the Job.
     *
     * @return the networkConfiguration value.
     */
    @Generated
    public BatchJobNetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * Set the networkConfiguration property: The network configuration for the Job.
     *
     * @param networkConfiguration the networkConfiguration value to set.
     * @return the BatchJobCreateContent object itself.
     */
    @Generated
    public BatchJobCreateContent setNetworkConfiguration(BatchJobNetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * Get the metadata property: A list of name-value pairs associated with the Job as metadata. The Batch service does
     * not assign any meaning to metadata; it is solely for the use of user code.
     *
     * @return the metadata value.
     */
    @Generated
    public List<MetadataItem> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: A list of name-value pairs associated with the Job as metadata. The Batch service does
     * not assign any meaning to metadata; it is solely for the use of user code.
     *
     * @param metadata the metadata value to set.
     * @return the BatchJobCreateContent object itself.
     */
    @Generated
    public BatchJobCreateContent setMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeJsonField("poolInfo", this.poolInfo);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeBooleanField("usesTaskDependencies", this.usesTaskDependencies);
        jsonWriter.writeNumberField("priority", this.priority);
        jsonWriter.writeBooleanField("allowTaskPreemption", this.allowTaskPreemption);
        jsonWriter.writeNumberField("maxParallelTasks", this.maxParallelTasks);
        jsonWriter.writeJsonField("constraints", this.constraints);
        jsonWriter.writeJsonField("jobManagerTask", this.jobManagerTask);
        jsonWriter.writeJsonField("jobPreparationTask", this.jobPreparationTask);
        jsonWriter.writeJsonField("jobReleaseTask", this.jobReleaseTask);
        jsonWriter.writeArrayField("commonEnvironmentSettings", this.commonEnvironmentSettings,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("onAllTasksComplete",
            this.onAllTasksComplete == null ? null : this.onAllTasksComplete.toString());
        jsonWriter.writeStringField("onTaskFailure", this.onTaskFailure == null ? null : this.onTaskFailure.toString());
        jsonWriter.writeJsonField("networkConfiguration", this.networkConfiguration);
        jsonWriter.writeArrayField("metadata", this.metadata, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchJobCreateContent from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchJobCreateContent if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BatchJobCreateContent.
     */
    @Generated
    public static BatchJobCreateContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            BatchPoolInfo poolInfo = null;
            String displayName = null;
            Boolean usesTaskDependencies = null;
            Integer priority = null;
            Boolean allowTaskPreemption = null;
            Integer maxParallelTasks = null;
            BatchJobConstraints constraints = null;
            BatchJobManagerTask jobManagerTask = null;
            BatchJobPreparationTask jobPreparationTask = null;
            BatchJobReleaseTask jobReleaseTask = null;
            List<EnvironmentSetting> commonEnvironmentSettings = null;
            OnAllBatchTasksComplete onAllTasksComplete = null;
            OnBatchTaskFailure onTaskFailure = null;
            BatchJobNetworkConfiguration networkConfiguration = null;
            List<MetadataItem> metadata = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("poolInfo".equals(fieldName)) {
                    poolInfo = BatchPoolInfo.fromJson(reader);
                } else if ("displayName".equals(fieldName)) {
                    displayName = reader.getString();
                } else if ("usesTaskDependencies".equals(fieldName)) {
                    usesTaskDependencies = reader.getNullable(JsonReader::getBoolean);
                } else if ("priority".equals(fieldName)) {
                    priority = reader.getNullable(JsonReader::getInt);
                } else if ("allowTaskPreemption".equals(fieldName)) {
                    allowTaskPreemption = reader.getNullable(JsonReader::getBoolean);
                } else if ("maxParallelTasks".equals(fieldName)) {
                    maxParallelTasks = reader.getNullable(JsonReader::getInt);
                } else if ("constraints".equals(fieldName)) {
                    constraints = BatchJobConstraints.fromJson(reader);
                } else if ("jobManagerTask".equals(fieldName)) {
                    jobManagerTask = BatchJobManagerTask.fromJson(reader);
                } else if ("jobPreparationTask".equals(fieldName)) {
                    jobPreparationTask = BatchJobPreparationTask.fromJson(reader);
                } else if ("jobReleaseTask".equals(fieldName)) {
                    jobReleaseTask = BatchJobReleaseTask.fromJson(reader);
                } else if ("commonEnvironmentSettings".equals(fieldName)) {
                    commonEnvironmentSettings = reader.readArray(reader1 -> EnvironmentSetting.fromJson(reader1));
                } else if ("onAllTasksComplete".equals(fieldName)) {
                    onAllTasksComplete = OnAllBatchTasksComplete.fromString(reader.getString());
                } else if ("onTaskFailure".equals(fieldName)) {
                    onTaskFailure = OnBatchTaskFailure.fromString(reader.getString());
                } else if ("networkConfiguration".equals(fieldName)) {
                    networkConfiguration = BatchJobNetworkConfiguration.fromJson(reader);
                } else if ("metadata".equals(fieldName)) {
                    metadata = reader.readArray(reader1 -> MetadataItem.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            BatchJobCreateContent deserializedBatchJobCreateContent = new BatchJobCreateContent(id, poolInfo);
            deserializedBatchJobCreateContent.displayName = displayName;
            deserializedBatchJobCreateContent.usesTaskDependencies = usesTaskDependencies;
            deserializedBatchJobCreateContent.priority = priority;
            deserializedBatchJobCreateContent.allowTaskPreemption = allowTaskPreemption;
            deserializedBatchJobCreateContent.maxParallelTasks = maxParallelTasks;
            deserializedBatchJobCreateContent.constraints = constraints;
            deserializedBatchJobCreateContent.jobManagerTask = jobManagerTask;
            deserializedBatchJobCreateContent.jobPreparationTask = jobPreparationTask;
            deserializedBatchJobCreateContent.jobReleaseTask = jobReleaseTask;
            deserializedBatchJobCreateContent.commonEnvironmentSettings = commonEnvironmentSettings;
            deserializedBatchJobCreateContent.onAllTasksComplete = onAllTasksComplete;
            deserializedBatchJobCreateContent.onTaskFailure = onTaskFailure;
            deserializedBatchJobCreateContent.networkConfiguration = networkConfiguration;
            deserializedBatchJobCreateContent.metadata = metadata;
            return deserializedBatchJobCreateContent;
        });
    }
}
