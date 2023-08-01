// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.jobrouter.models;

import java.util.List;
import java.util.Map;

/**
 * Request options to create a job with classification policy.
 * Job: A unit of work to be routed.
 */
public class CreateJobWithClassificationPolicyOptions {
    /**
     * The id of the job.
     */
    private final String id;

    /**
     * Reference to an external parent context, eg. call ID.
     */
    private String channelReference;

    /**
     * The channel identifier. eg. voice, chat, etc.
     */
    private final String channelId;

    /**
     * The Id of the Classification policy used for classifying a job.
     */
    private final String classificationPolicyId;

    /**
     * The Id of the Queue that this job is queued to.
     */
    private String queueId;

    /**
     * The priority of this job.
     */
    private Integer priority;

    /**
     * Reason code for cancelled or closed jobs.
     */
    private String dispositionCode;

    /**
     * A collection of manually specified label selectors, which a worker must
     * satisfy in order to process this job.
     */
    private List<RouterWorkerSelector> requestedWorkerSelectors;

    /**
     * A set of key/value pairs that are identifying attributes used by the
     * rules engines to make decisions.
     */
    private Map<String, LabelValue> labels;

    /**
     * A set of non-identifying attributes attached to this job.
     */
    private Map<String, LabelValue> tags;

    /**
     * Notes attached to a job, sorted by timestamp.
     */
    private List<RouterJobNote> notes;

    /*
     * The matchingMode property.
     */
    private RouterJobMatchingMode matchingMode;

    /**
     * Get the matchingMode property: The matchingMode property.
     *
     * @return the matchingMode value.
     */
    public RouterJobMatchingMode getMatchingMode() {
        return this.matchingMode;
    }

    /**
     * Set the matchingMode property: The matchingMode property.
     *
     * @param matchingMode the matchingMode value to set.
     * @return the RouterJobInternal object itself.
     */
    public CreateJobWithClassificationPolicyOptions setMatchingMode(RouterJobMatchingMode matchingMode) {
        this.matchingMode = matchingMode;
        return this;
    }

    /**
     * Constructor for CreateJobOptions.
     * @param id The id of the job.
     * @param channelId The channel identifier. eg. voice, chat, etc.
     * @param classificationPolicyId The Id of the classification Policy.
     */
    public CreateJobWithClassificationPolicyOptions(String id, String channelId, String classificationPolicyId) {
        this.id = id;
        this.channelId = channelId;
        this.classificationPolicyId = classificationPolicyId;
    }

    /**
     * Sets job priority.
     * @param priority The priority of this job.
     * @return this
     */
    public CreateJobWithClassificationPolicyOptions setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Sets channelReference.
     * @param channelReference Reference to an external parent context, eg. call ID.
     * @return this
     */
    public CreateJobWithClassificationPolicyOptions setChannelReference(String channelReference) {
        this.channelReference = channelReference;
        return this;
    }

    /**
     * Sets classificationPolicyId.
     * @param queueId The Id of a queue for the job.
     * @return this
     */
    public CreateJobWithClassificationPolicyOptions setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * Sets dispositionCode.
     * @param dispositionCode Reason code for cancelled or closed jobs.
     * @return this
     */
    public CreateJobWithClassificationPolicyOptions setDispositionCode(String dispositionCode) {
        this.dispositionCode = dispositionCode;
        return this;
    }

    /**
     * Sets requestedWorkerSelectors.
     * @param requestedWorkerSelectors A collection of manually specified label selectors, which a worker must
     *   satisfy in order to process this job.
     * @return this
     */
    public CreateJobWithClassificationPolicyOptions setRequestedWorkerSelectors(List<RouterWorkerSelector> requestedWorkerSelectors) {
        this.requestedWorkerSelectors = requestedWorkerSelectors;
        return this;
    }

    /**
     * Sets labels.
     * @param labels A set of key/value pairs that are identifying attributes used by the
     *   rules engines to make decisions.
     * @return this
     */
    public CreateJobWithClassificationPolicyOptions setLabels(Map<String, LabelValue> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Sets tags.
     * @param tags A set of non-identifying attributes attached to this job.
     * @return this
     */
    public CreateJobWithClassificationPolicyOptions setTags(Map<String, LabelValue> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Sets notes.
     * @param notes Notes attached to a job, sorted by timestamp.
     * @return this
     */
    public CreateJobWithClassificationPolicyOptions setNotes(List<RouterJobNote> notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Returns the id of RouterJob.
     * @return id.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Returns the reference to an external parent context, eg. call ID.
     * @return channelReference
     */
    public String getChannelReference() {
        return this.channelReference;
    }

    /**
     * Returns the channel identifier. eg. voice, chat, etc.
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * Returns the Id of the Classification policy used for classifying a job.
     * @return classificationPolicyId
     */
    public String getClassificationPolicyId() {
        return this.classificationPolicyId;
    }

    /**
     * Returns the Id of the Queue that this job is queued to.
     * @return queueId
     */
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * Returns the priority of this job.
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Returns the reason code for cancelled or closed jobs.
     * @return dispositionCode
     */
    public String getDispositionCode() {
        return this.dispositionCode;
    }

    /**
     * Returns the collection of manually specified label selectors that a worker must
     * satisfy in order to process a job.
     * @return requestedWorkerSelectors
     */
    public List<RouterWorkerSelector> getRequestedWorkerSelectors() {
        return this.requestedWorkerSelectors;
    }

    /**
     * A set of key/value pairs that are identifying attributes used by the
     * rules engines to make decisions.
     * @return labels
     */
    public Map<String, LabelValue> getLabels() {
        return this.labels;
    }

    /**
     * A set of non-identifying attributes attached to this job
     * @return tags
     */
    public Map<String, LabelValue> getTags() {
        return this.tags;
    }

    /**
     * Notes attached to a job, sorted by timestamp
     * @return note
     */
    public List<RouterJobNote> getNotes() {
        return this.notes;
    }
}
