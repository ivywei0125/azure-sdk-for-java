// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Activity to get metadata of dataset.
 */
@Fluent
public class GetMetadataActivity extends ExecutionActivity {
    /*
     * Type of activity.
     */
    private String type = "GetMetadata";

    /*
     * GetMetadata activity dataset reference.
     */
    private DatasetReference dataset;

    /*
     * Fields of metadata to get from dataset.
     */
    private List<Object> fieldList;

    /*
     * GetMetadata activity store settings.
     */
    private StoreReadSettings storeSettings;

    /*
     * GetMetadata activity format settings.
     */
    private FormatReadSettings formatSettings;

    /**
     * Creates an instance of GetMetadataActivity class.
     */
    public GetMetadataActivity() {
    }

    /**
     * Get the type property: Type of activity.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the dataset property: GetMetadata activity dataset reference.
     * 
     * @return the dataset value.
     */
    public DatasetReference getDataset() {
        return this.dataset;
    }

    /**
     * Set the dataset property: GetMetadata activity dataset reference.
     * 
     * @param dataset the dataset value to set.
     * @return the GetMetadataActivity object itself.
     */
    public GetMetadataActivity setDataset(DatasetReference dataset) {
        this.dataset = dataset;
        return this;
    }

    /**
     * Get the fieldList property: Fields of metadata to get from dataset.
     * 
     * @return the fieldList value.
     */
    public List<Object> getFieldList() {
        return this.fieldList;
    }

    /**
     * Set the fieldList property: Fields of metadata to get from dataset.
     * 
     * @param fieldList the fieldList value to set.
     * @return the GetMetadataActivity object itself.
     */
    public GetMetadataActivity setFieldList(List<Object> fieldList) {
        this.fieldList = fieldList;
        return this;
    }

    /**
     * Get the storeSettings property: GetMetadata activity store settings.
     * 
     * @return the storeSettings value.
     */
    public StoreReadSettings getStoreSettings() {
        return this.storeSettings;
    }

    /**
     * Set the storeSettings property: GetMetadata activity store settings.
     * 
     * @param storeSettings the storeSettings value to set.
     * @return the GetMetadataActivity object itself.
     */
    public GetMetadataActivity setStoreSettings(StoreReadSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get the formatSettings property: GetMetadata activity format settings.
     * 
     * @return the formatSettings value.
     */
    public FormatReadSettings getFormatSettings() {
        return this.formatSettings;
    }

    /**
     * Set the formatSettings property: GetMetadata activity format settings.
     * 
     * @param formatSettings the formatSettings value to set.
     * @return the GetMetadataActivity object itself.
     */
    public GetMetadataActivity setFormatSettings(FormatReadSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetMetadataActivity setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetMetadataActivity setPolicy(ActivityPolicy policy) {
        super.setPolicy(policy);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetMetadataActivity setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetMetadataActivity setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetMetadataActivity setState(ActivityState state) {
        super.setState(state);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetMetadataActivity setOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.setOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetMetadataActivity setDependsOn(List<ActivityDependency> dependsOn) {
        super.setDependsOn(dependsOn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetMetadataActivity setUserProperties(List<UserProperty> userProperties) {
        super.setUserProperties(userProperties);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeStringField("state", getState() == null ? null : getState().toString());
        jsonWriter.writeStringField("onInactiveMarkAs",
            getOnInactiveMarkAs() == null ? null : getOnInactiveMarkAs().toString());
        jsonWriter.writeArrayField("dependsOn", getDependsOn(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("userProperties", getUserProperties(),
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("linkedServiceName", getLinkedServiceName());
        jsonWriter.writeJsonField("policy", getPolicy());
        jsonWriter.writeStringField("type", this.type);
        if (dataset != null || fieldList != null || storeSettings != null || formatSettings != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeJsonField("dataset", this.dataset);
            jsonWriter.writeArrayField("fieldList", this.fieldList, (writer, element) -> writer.writeUntyped(element));
            jsonWriter.writeJsonField("storeSettings", this.storeSettings);
            jsonWriter.writeJsonField("formatSettings", this.formatSettings);
            jsonWriter.writeEndObject();
        }
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GetMetadataActivity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GetMetadataActivity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GetMetadataActivity.
     */
    public static GetMetadataActivity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GetMetadataActivity deserializedGetMetadataActivity = new GetMetadataActivity();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedGetMetadataActivity.setName(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedGetMetadataActivity.setDescription(reader.getString());
                } else if ("state".equals(fieldName)) {
                    deserializedGetMetadataActivity.setState(ActivityState.fromString(reader.getString()));
                } else if ("onInactiveMarkAs".equals(fieldName)) {
                    deserializedGetMetadataActivity
                        .setOnInactiveMarkAs(ActivityOnInactiveMarkAs.fromString(reader.getString()));
                } else if ("dependsOn".equals(fieldName)) {
                    List<ActivityDependency> dependsOn
                        = reader.readArray(reader1 -> ActivityDependency.fromJson(reader1));
                    deserializedGetMetadataActivity.setDependsOn(dependsOn);
                } else if ("userProperties".equals(fieldName)) {
                    List<UserProperty> userProperties = reader.readArray(reader1 -> UserProperty.fromJson(reader1));
                    deserializedGetMetadataActivity.setUserProperties(userProperties);
                } else if ("linkedServiceName".equals(fieldName)) {
                    deserializedGetMetadataActivity.setLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("policy".equals(fieldName)) {
                    deserializedGetMetadataActivity.setPolicy(ActivityPolicy.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedGetMetadataActivity.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("dataset".equals(fieldName)) {
                            deserializedGetMetadataActivity.dataset = DatasetReference.fromJson(reader);
                        } else if ("fieldList".equals(fieldName)) {
                            List<Object> fieldList = reader.readArray(reader1 -> reader1.readUntyped());
                            deserializedGetMetadataActivity.fieldList = fieldList;
                        } else if ("storeSettings".equals(fieldName)) {
                            deserializedGetMetadataActivity.storeSettings = StoreReadSettings.fromJson(reader);
                        } else if ("formatSettings".equals(fieldName)) {
                            deserializedGetMetadataActivity.formatSettings = FormatReadSettings.fromJson(reader);
                        } else {
                            reader.skipChildren();
                        }
                    }
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedGetMetadataActivity.setAdditionalProperties(additionalProperties);

            return deserializedGetMetadataActivity;
        });
    }
}
