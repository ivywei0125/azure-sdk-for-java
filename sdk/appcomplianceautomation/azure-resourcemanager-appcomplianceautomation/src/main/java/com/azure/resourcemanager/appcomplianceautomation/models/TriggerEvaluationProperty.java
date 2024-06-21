// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Trigger evaluation response.
 */
@Immutable
public final class TriggerEvaluationProperty implements JsonSerializable<TriggerEvaluationProperty> {
    /*
     * The time when the evaluation is triggered.
     */
    private OffsetDateTime triggerTime;

    /*
     * The time when the evaluation is end.
     */
    private OffsetDateTime evaluationEndTime;

    /*
     * List of resource ids to be evaluated
     */
    private List<String> resourceIds;

    /*
     * List of quick assessments
     */
    private List<QuickAssessment> quickAssessments;

    /**
     * Creates an instance of TriggerEvaluationProperty class.
     */
    private TriggerEvaluationProperty() {
    }

    /**
     * Get the triggerTime property: The time when the evaluation is triggered.
     * 
     * @return the triggerTime value.
     */
    public OffsetDateTime triggerTime() {
        return this.triggerTime;
    }

    /**
     * Get the evaluationEndTime property: The time when the evaluation is end.
     * 
     * @return the evaluationEndTime value.
     */
    public OffsetDateTime evaluationEndTime() {
        return this.evaluationEndTime;
    }

    /**
     * Get the resourceIds property: List of resource ids to be evaluated.
     * 
     * @return the resourceIds value.
     */
    public List<String> resourceIds() {
        return this.resourceIds;
    }

    /**
     * Get the quickAssessments property: List of quick assessments.
     * 
     * @return the quickAssessments value.
     */
    public List<QuickAssessment> quickAssessments() {
        return this.quickAssessments;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (quickAssessments() != null) {
            quickAssessments().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("resourceIds", this.resourceIds, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("quickAssessments", this.quickAssessments,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TriggerEvaluationProperty from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TriggerEvaluationProperty if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TriggerEvaluationProperty.
     */
    public static TriggerEvaluationProperty fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TriggerEvaluationProperty deserializedTriggerEvaluationProperty = new TriggerEvaluationProperty();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("triggerTime".equals(fieldName)) {
                    deserializedTriggerEvaluationProperty.triggerTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("evaluationEndTime".equals(fieldName)) {
                    deserializedTriggerEvaluationProperty.evaluationEndTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("resourceIds".equals(fieldName)) {
                    List<String> resourceIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedTriggerEvaluationProperty.resourceIds = resourceIds;
                } else if ("quickAssessments".equals(fieldName)) {
                    List<QuickAssessment> quickAssessments
                        = reader.readArray(reader1 -> QuickAssessment.fromJson(reader1));
                    deserializedTriggerEvaluationProperty.quickAssessments = quickAssessments;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTriggerEvaluationProperty;
        });
    }
}
