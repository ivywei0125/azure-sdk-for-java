// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.communication.jobrouter.implementation.JsonMergePatchHelper;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * A unit of work to be routed.
 */
@Fluent
public final class RouterJob implements JsonSerializable<RouterJob> {

    /*
     * The entity tag for this resource.
     */
    @Generated
    private String etag;

    /*
     * Id of a job.
     */
    @Generated
    private String id;

    /*
     * Reference to an external parent context, eg. call ID.
     */
    @Generated
    private String channelReference;

    /*
     * The status of the job.
     */
    @Generated
    private RouterJobStatus status;

    /*
     * Timestamp a job was queued in UTC.
     */
    @Generated
    private OffsetDateTime enqueuedAt;

    /*
     * The channel identifier. eg. voice, chat, etc.
     */
    @Generated
    private String channelId;

    /*
     * Id of a classification policy used for classifying this job.
     */
    @Generated
    private String classificationPolicyId;

    /*
     * Id of a queue that this job is queued to.
     */
    @Generated
    private String queueId;

    /*
     * Priority of this job. Value must be between -100 to 100.
     */
    @Generated
    private Integer priority;

    /*
     * Reason code for cancelled or closed jobs.
     */
    @Generated
    private String dispositionCode;

    /*
     * A collection of manually specified worker selectors, which a worker must satisfy in order to process this job.
     */
    @Generated
    private List<RouterWorkerSelector> requestedWorkerSelectors;

    /*
     * A collection of worker selectors attached by a classification policy, which a worker must satisfy in order to
     * process this job.
     */
    @Generated
    private List<RouterWorkerSelector> attachedWorkerSelectors;

    /*
     * A set of key/value pairs that are identifying attributes used by the rules engines to make decisions. Values must
     * be primitive values - number, string, boolean.
     */
    @Generated
    private Map<String, RouterValue> labels;

    /*
     * A collection of the assignments of the job. Key is AssignmentId.
     */
    @Generated
    private Map<String, RouterJobAssignment> assignments;

    /*
     * A set of non-identifying attributes attached to this job. Values must be primitive values - number, string,
     * boolean.
     */
    @Generated
    private Map<String, RouterValue> tags;

    /*
     * Notes attached to a job, sorted by timestamp.
     */
    @Generated
    private List<RouterJobNote> notes;

    /*
     * If set, job will be scheduled to be enqueued at a given time.
     */
    @Generated
    private OffsetDateTime scheduledAt;

    /*
     * If provided, will determine how job matching will be carried out. Default mode: QueueAndMatchMode.
     */
    @Generated
    private JobMatchingMode matchingMode;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    @Generated
    private boolean jsonMergePatch;

    @Generated
    private void serializeAsJsonMergePatch(boolean jsonMergePatch) {
        this.jsonMergePatch = jsonMergePatch;
    }

    static {
        JsonMergePatchHelper.setRouterJobAccessor(new JsonMergePatchHelper.RouterJobAccessor() {

            @Override
            public RouterJob prepareModelForJsonMergePatch(RouterJob model, boolean jsonMergePatchEnabled) {
                model.serializeAsJsonMergePatch(jsonMergePatchEnabled);
                return model;
            }

            @Override
            public boolean isJsonMergePatch(RouterJob model) {
                return model.jsonMergePatch;
            }
        });
    }

    /**
     * Creates an instance of RouterJob class.
     */
    @Generated
    public RouterJob() {
    }

    /**
     * Get the etag property: The entity tag for this resource.
     *
     * @return the etag value.
     */
    @Generated
    public String getEtag() {
        return this.etag;
    }

    /**
     * Get the id property: Id of a job.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the channelReference property: Reference to an external parent context, eg. call ID.
     *
     * @return the channelReference value.
     */
    @Generated
    public String getChannelReference() {
        return this.channelReference;
    }

    /**
     * Set the channelReference property: Reference to an external parent context, eg. call ID.
     *
     * @param channelReference the channelReference value to set.
     * @return the RouterJob object itself.
     */
    @Generated
    public RouterJob setChannelReference(String channelReference) {
        this.channelReference = channelReference;
        this.updatedProperties.add("channelReference");
        return this;
    }

    /**
     * Get the status property: The status of the job.
     *
     * @return the status value.
     */
    @Generated
    public RouterJobStatus getStatus() {
        return this.status;
    }

    /**
     * Get the enqueuedAt property: Timestamp a job was queued in UTC.
     *
     * @return the enqueuedAt value.
     */
    @Generated
    public OffsetDateTime getEnqueuedAt() {
        return this.enqueuedAt;
    }

    /**
     * Get the channelId property: The channel identifier. eg. voice, chat, etc.
     *
     * @return the channelId value.
     */
    @Generated
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * Set the channelId property: The channel identifier. eg. voice, chat, etc.
     *
     * @param channelId the channelId value to set.
     * @return the RouterJob object itself.
     */
    @Generated
    public RouterJob setChannelId(String channelId) {
        this.channelId = channelId;
        this.updatedProperties.add("channelId");
        return this;
    }

    /**
     * Get the classificationPolicyId property: Id of a classification policy used for classifying this job.
     *
     * @return the classificationPolicyId value.
     */
    @Generated
    public String getClassificationPolicyId() {
        return this.classificationPolicyId;
    }

    /**
     * Set the classificationPolicyId property: Id of a classification policy used for classifying this job.
     *
     * @param classificationPolicyId the classificationPolicyId value to set.
     * @return the RouterJob object itself.
     */
    @Generated
    public RouterJob setClassificationPolicyId(String classificationPolicyId) {
        this.classificationPolicyId = classificationPolicyId;
        this.updatedProperties.add("classificationPolicyId");
        return this;
    }

    /**
     * Get the queueId property: Id of a queue that this job is queued to.
     *
     * @return the queueId value.
     */
    @Generated
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * Set the queueId property: Id of a queue that this job is queued to.
     *
     * @param queueId the queueId value to set.
     * @return the RouterJob object itself.
     */
    @Generated
    public RouterJob setQueueId(String queueId) {
        this.queueId = queueId;
        this.updatedProperties.add("queueId");
        return this;
    }

    /**
     * Get the priority property: Priority of this job. Value must be between -100 to 100.
     *
     * @return the priority value.
     */
    @Generated
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of this job. Value must be between -100 to 100.
     *
     * @param priority the priority value to set.
     * @return the RouterJob object itself.
     */
    @Generated
    public RouterJob setPriority(Integer priority) {
        this.priority = priority;
        this.updatedProperties.add("priority");
        return this;
    }

    /**
     * Get the dispositionCode property: Reason code for cancelled or closed jobs.
     *
     * @return the dispositionCode value.
     */
    @Generated
    public String getDispositionCode() {
        return this.dispositionCode;
    }

    /**
     * Set the dispositionCode property: Reason code for cancelled or closed jobs.
     *
     * @param dispositionCode the dispositionCode value to set.
     * @return the RouterJob object itself.
     */
    @Generated
    public RouterJob setDispositionCode(String dispositionCode) {
        this.dispositionCode = dispositionCode;
        this.updatedProperties.add("dispositionCode");
        return this;
    }

    /**
     * Get the requestedWorkerSelectors property: A collection of manually specified worker selectors, which a worker
     * must satisfy in order to process this job.
     *
     * @return the requestedWorkerSelectors value.
     */
    @Generated
    public List<RouterWorkerSelector> getRequestedWorkerSelectors() {
        return this.requestedWorkerSelectors;
    }

    /**
     * Set the requestedWorkerSelectors property: A collection of manually specified worker selectors, which a worker
     * must satisfy in order to process this job.
     *
     * @param requestedWorkerSelectors the requestedWorkerSelectors value to set.
     * @return the RouterJob object itself.
     */
    @Generated
    public RouterJob setRequestedWorkerSelectors(List<RouterWorkerSelector> requestedWorkerSelectors) {
        this.requestedWorkerSelectors = requestedWorkerSelectors;
        this.updatedProperties.add("requestedWorkerSelectors");
        return this;
    }

    /**
     * Get the attachedWorkerSelectors property: A collection of worker selectors attached by a classification policy,
     * which a worker must satisfy in order to process this job.
     *
     * @return the attachedWorkerSelectors value.
     */
    @Generated
    public List<RouterWorkerSelector> getAttachedWorkerSelectors() {
        return this.attachedWorkerSelectors;
    }

    /**
     * Get the labels property: A set of key/value pairs that are identifying attributes used by the rules engines to
     * make decisions. Values must be primitive values - number, string, boolean.
     *
     * @return the labels value.
     */
    @Generated
    public Map<String, RouterValue> getLabels() {
        return this.labels;
    }

    /**
     * Set the labels property: A set of key/value pairs that are identifying attributes used by the rules engines to
     * make decisions. Values must be primitive values - number, string, boolean.
     *
     * @param labels the labels value to set.
     * @return the RouterJob object itself.
     */
    @Generated
    public RouterJob setLabels(Map<String, RouterValue> labels) {
        this.labels = labels;
        this.updatedProperties.add("labels");
        return this;
    }

    /**
     * Get the assignments property: A collection of the assignments of the job. Key is AssignmentId.
     *
     * @return the assignments value.
     */
    @Generated
    public Map<String, RouterJobAssignment> getAssignments() {
        return this.assignments;
    }

    /**
     * Get the tags property: A set of non-identifying attributes attached to this job. Values must be primitive values
     * - number, string, boolean.
     *
     * @return the tags value.
     */
    @Generated
    public Map<String, RouterValue> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: A set of non-identifying attributes attached to this job. Values must be primitive values
     * - number, string, boolean.
     *
     * @param tags the tags value to set.
     * @return the RouterJob object itself.
     */
    @Generated
    public RouterJob setTags(Map<String, RouterValue> tags) {
        this.tags = tags;
        this.updatedProperties.add("tags");
        return this;
    }

    /**
     * Get the notes property: Notes attached to a job, sorted by timestamp.
     *
     * @return the notes value.
     */
    @Generated
    public List<RouterJobNote> getNotes() {
        return this.notes;
    }

    /**
     * Set the notes property: Notes attached to a job, sorted by timestamp.
     *
     * @param notes the notes value to set.
     * @return the RouterJob object itself.
     */
    @Generated
    public RouterJob setNotes(List<RouterJobNote> notes) {
        this.notes = notes;
        this.updatedProperties.add("notes");
        return this;
    }

    /**
     * Get the scheduledAt property: If set, job will be scheduled to be enqueued at a given time.
     *
     * @return the scheduledAt value.
     */
    @Generated
    public OffsetDateTime getScheduledAt() {
        return this.scheduledAt;
    }

    /**
     * Get the matchingMode property: If provided, will determine how job matching will be carried out. Default mode:
     * QueueAndMatchMode.
     *
     * @return the matchingMode value.
     */
    @Generated
    public JobMatchingMode getMatchingMode() {
        return this.matchingMode;
    }

    /**
     * Set the matchingMode property: If provided, will determine how job matching will be carried out. Default mode:
     * QueueAndMatchMode.
     *
     * @param matchingMode the matchingMode value to set.
     * @return the RouterJob object itself.
     */
    @Generated
    public RouterJob setMatchingMode(JobMatchingMode matchingMode) {
        this.matchingMode = matchingMode;
        this.updatedProperties.add("matchingMode");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (jsonMergePatch) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("channelReference", this.channelReference);
            jsonWriter.writeStringField("channelId", this.channelId);
            jsonWriter.writeStringField("classificationPolicyId", this.classificationPolicyId);
            jsonWriter.writeStringField("queueId", this.queueId);
            jsonWriter.writeNumberField("priority", this.priority);
            jsonWriter.writeStringField("dispositionCode", this.dispositionCode);
            jsonWriter.writeArrayField("requestedWorkerSelectors", this.requestedWorkerSelectors,
                (writer, element) -> writer.writeJson(element));
            jsonWriter.writeMapField("labels", this.labels, (writer, element) -> writer.writeJson(element));
            jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeJson(element));
            jsonWriter.writeArrayField("notes", this.notes, (writer, element) -> writer.writeJson(element));
            jsonWriter.writeJsonField("matchingMode", this.matchingMode);
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (updatedProperties.contains("channelReference")) {
            if (this.channelReference == null) {
                jsonWriter.writeNullField("channelReference");
            } else {
                jsonWriter.writeStringField("channelReference", this.channelReference);
            }
        }
        if (updatedProperties.contains("channelId")) {
            if (this.channelId == null) {
                jsonWriter.writeNullField("channelId");
            } else {
                jsonWriter.writeStringField("channelId", this.channelId);
            }
        }
        if (updatedProperties.contains("classificationPolicyId")) {
            if (this.classificationPolicyId == null) {
                jsonWriter.writeNullField("classificationPolicyId");
            } else {
                jsonWriter.writeStringField("classificationPolicyId", this.classificationPolicyId);
            }
        }
        if (updatedProperties.contains("queueId")) {
            if (this.queueId == null) {
                jsonWriter.writeNullField("queueId");
            } else {
                jsonWriter.writeStringField("queueId", this.queueId);
            }
        }
        if (updatedProperties.contains("priority")) {
            if (this.priority == null) {
                jsonWriter.writeNullField("priority");
            } else {
                jsonWriter.writeNumberField("priority", this.priority);
            }
        }
        if (updatedProperties.contains("dispositionCode")) {
            if (this.dispositionCode == null) {
                jsonWriter.writeNullField("dispositionCode");
            } else {
                jsonWriter.writeStringField("dispositionCode", this.dispositionCode);
            }
        }
        if (updatedProperties.contains("requestedWorkerSelectors")) {
            if (this.requestedWorkerSelectors == null) {
                jsonWriter.writeNullField("requestedWorkerSelectors");
            } else {
                jsonWriter.writeArrayField("requestedWorkerSelectors", this.requestedWorkerSelectors,
                    (writer, element) -> writer.writeJson(element));
            }
        }
        if (updatedProperties.contains("labels")) {
            if (this.labels == null) {
                jsonWriter.writeNullField("labels");
            } else {
                jsonWriter.writeMapField("labels", this.labels, (writer, element) -> writer.writeJson(element));
            }
        }
        if (updatedProperties.contains("tags")) {
            if (this.tags == null) {
                jsonWriter.writeNullField("tags");
            } else {
                jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeJson(element));
            }
        }
        if (updatedProperties.contains("notes")) {
            if (this.notes == null) {
                jsonWriter.writeNullField("notes");
            } else {
                jsonWriter.writeArrayField("notes", this.notes, (writer, element) -> writer.writeJson(element));
            }
        }
        if (updatedProperties.contains("matchingMode")) {
            if (this.matchingMode == null) {
                jsonWriter.writeNullField("matchingMode");
            } else {
                JsonMergePatchHelper.getJobMatchingModeAccessor()
                    .prepareModelForJsonMergePatch(this.matchingMode, true);
                jsonWriter.writeJsonField("matchingMode", this.matchingMode);
                JsonMergePatchHelper.getJobMatchingModeAccessor()
                    .prepareModelForJsonMergePatch(this.matchingMode, false);
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RouterJob from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RouterJob if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RouterJob.
     */
    @Generated
    public static RouterJob fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RouterJob deserializedRouterJob = new RouterJob();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("etag".equals(fieldName)) {
                    deserializedRouterJob.etag = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedRouterJob.id = reader.getString();
                } else if ("channelReference".equals(fieldName)) {
                    deserializedRouterJob.channelReference = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedRouterJob.status = RouterJobStatus.fromString(reader.getString());
                } else if ("enqueuedAt".equals(fieldName)) {
                    deserializedRouterJob.enqueuedAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("channelId".equals(fieldName)) {
                    deserializedRouterJob.channelId = reader.getString();
                } else if ("classificationPolicyId".equals(fieldName)) {
                    deserializedRouterJob.classificationPolicyId = reader.getString();
                } else if ("queueId".equals(fieldName)) {
                    deserializedRouterJob.queueId = reader.getString();
                } else if ("priority".equals(fieldName)) {
                    deserializedRouterJob.priority = reader.getNullable(JsonReader::getInt);
                } else if ("dispositionCode".equals(fieldName)) {
                    deserializedRouterJob.dispositionCode = reader.getString();
                } else if ("requestedWorkerSelectors".equals(fieldName)) {
                    List<RouterWorkerSelector> requestedWorkerSelectors
                        = reader.readArray(reader1 -> RouterWorkerSelector.fromJson(reader1));
                    deserializedRouterJob.requestedWorkerSelectors = requestedWorkerSelectors;
                } else if ("attachedWorkerSelectors".equals(fieldName)) {
                    List<RouterWorkerSelector> attachedWorkerSelectors
                        = reader.readArray(reader1 -> RouterWorkerSelector.fromJson(reader1));
                    deserializedRouterJob.attachedWorkerSelectors = attachedWorkerSelectors;
                } else if ("labels".equals(fieldName)) {
                    Map<String, RouterValue> labels = reader.readMap(reader1 -> RouterValue.fromJson(reader1));
                    deserializedRouterJob.labels = labels;
                } else if ("assignments".equals(fieldName)) {
                    Map<String, RouterJobAssignment> assignments
                        = reader.readMap(reader1 -> RouterJobAssignment.fromJson(reader1));
                    deserializedRouterJob.assignments = assignments;
                } else if ("tags".equals(fieldName)) {
                    Map<String, RouterValue> tags = reader.readMap(reader1 -> RouterValue.fromJson(reader1));
                    deserializedRouterJob.tags = tags;
                } else if ("notes".equals(fieldName)) {
                    List<RouterJobNote> notes = reader.readArray(reader1 -> RouterJobNote.fromJson(reader1));
                    deserializedRouterJob.notes = notes;
                } else if ("scheduledAt".equals(fieldName)) {
                    deserializedRouterJob.scheduledAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("matchingMode".equals(fieldName)) {
                    deserializedRouterJob.matchingMode = JobMatchingMode.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedRouterJob;
        });
    }
}
