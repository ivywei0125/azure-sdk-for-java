// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A skill that uses text analytics for key phrase extraction.
 */
@Fluent
public final class KeyPhraseExtractionSkill extends SearchIndexerSkill {
    /*
     * A URI fragment specifying the type of skill.
     */
    private String odataType = "#Microsoft.Skills.Text.KeyPhraseExtractionSkill";

    /*
     * A value indicating which language code to use. Default is `en`.
     */
    private KeyPhraseExtractionSkillLanguage defaultLanguageCode;

    /*
     * A number indicating how many key phrases to return. If absent, all identified key phrases will be returned.
     */
    private Integer maxKeyPhraseCount;

    /*
     * The version of the model to use when calling the Text Analytics service. It will default to the latest available
     * when not specified. We recommend you do not specify this value unless absolutely necessary.
     */
    private String modelVersion;

    /**
     * Creates an instance of KeyPhraseExtractionSkill class.
     * 
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     */
    public KeyPhraseExtractionSkill(List<InputFieldMappingEntry> inputs, List<OutputFieldMappingEntry> outputs) {
        super(inputs, outputs);
    }

    /**
     * Get the odataType property: A URI fragment specifying the type of skill.
     * 
     * @return the odataType value.
     */
    @Override
    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Get the defaultLanguageCode property: A value indicating which language code to use. Default is `en`.
     * 
     * @return the defaultLanguageCode value.
     */
    public KeyPhraseExtractionSkillLanguage getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * Set the defaultLanguageCode property: A value indicating which language code to use. Default is `en`.
     * 
     * @param defaultLanguageCode the defaultLanguageCode value to set.
     * @return the KeyPhraseExtractionSkill object itself.
     */
    public KeyPhraseExtractionSkill setDefaultLanguageCode(KeyPhraseExtractionSkillLanguage defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }

    /**
     * Get the maxKeyPhraseCount property: A number indicating how many key phrases to return. If absent, all identified
     * key phrases will be returned.
     * 
     * @return the maxKeyPhraseCount value.
     */
    public Integer getMaxKeyPhraseCount() {
        return this.maxKeyPhraseCount;
    }

    /**
     * Set the maxKeyPhraseCount property: A number indicating how many key phrases to return. If absent, all identified
     * key phrases will be returned.
     * 
     * @param maxKeyPhraseCount the maxKeyPhraseCount value to set.
     * @return the KeyPhraseExtractionSkill object itself.
     */
    public KeyPhraseExtractionSkill setMaxKeyPhraseCount(Integer maxKeyPhraseCount) {
        this.maxKeyPhraseCount = maxKeyPhraseCount;
        return this;
    }

    /**
     * Get the modelVersion property: The version of the model to use when calling the Text Analytics service. It will
     * default to the latest available when not specified. We recommend you do not specify this value unless absolutely
     * necessary.
     * 
     * @return the modelVersion value.
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * Set the modelVersion property: The version of the model to use when calling the Text Analytics service. It will
     * default to the latest available when not specified. We recommend you do not specify this value unless absolutely
     * necessary.
     * 
     * @param modelVersion the modelVersion value to set.
     * @return the KeyPhraseExtractionSkill object itself.
     */
    public KeyPhraseExtractionSkill setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyPhraseExtractionSkill setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyPhraseExtractionSkill setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyPhraseExtractionSkill setContext(String context) {
        super.setContext(context);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("inputs", getInputs(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("outputs", getOutputs(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeStringField("context", getContext());
        jsonWriter.writeStringField("@odata.type", this.odataType);
        jsonWriter.writeStringField("defaultLanguageCode",
            this.defaultLanguageCode == null ? null : this.defaultLanguageCode.toString());
        jsonWriter.writeNumberField("maxKeyPhraseCount", this.maxKeyPhraseCount);
        jsonWriter.writeStringField("modelVersion", this.modelVersion);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeyPhraseExtractionSkill from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyPhraseExtractionSkill if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the KeyPhraseExtractionSkill.
     */
    public static KeyPhraseExtractionSkill fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean inputsFound = false;
            List<InputFieldMappingEntry> inputs = null;
            boolean outputsFound = false;
            List<OutputFieldMappingEntry> outputs = null;
            String name = null;
            String description = null;
            String context = null;
            String odataType = "#Microsoft.Skills.Text.KeyPhraseExtractionSkill";
            KeyPhraseExtractionSkillLanguage defaultLanguageCode = null;
            Integer maxKeyPhraseCount = null;
            String modelVersion = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("inputs".equals(fieldName)) {
                    inputs = reader.readArray(reader1 -> InputFieldMappingEntry.fromJson(reader1));
                    inputsFound = true;
                } else if ("outputs".equals(fieldName)) {
                    outputs = reader.readArray(reader1 -> OutputFieldMappingEntry.fromJson(reader1));
                    outputsFound = true;
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("description".equals(fieldName)) {
                    description = reader.getString();
                } else if ("context".equals(fieldName)) {
                    context = reader.getString();
                } else if ("@odata.type".equals(fieldName)) {
                    odataType = reader.getString();
                } else if ("defaultLanguageCode".equals(fieldName)) {
                    defaultLanguageCode = KeyPhraseExtractionSkillLanguage.fromString(reader.getString());
                } else if ("maxKeyPhraseCount".equals(fieldName)) {
                    maxKeyPhraseCount = reader.getNullable(JsonReader::getInt);
                } else if ("modelVersion".equals(fieldName)) {
                    modelVersion = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            if (inputsFound && outputsFound) {
                KeyPhraseExtractionSkill deserializedKeyPhraseExtractionSkill
                    = new KeyPhraseExtractionSkill(inputs, outputs);
                deserializedKeyPhraseExtractionSkill.setName(name);
                deserializedKeyPhraseExtractionSkill.setDescription(description);
                deserializedKeyPhraseExtractionSkill.setContext(context);
                deserializedKeyPhraseExtractionSkill.odataType = odataType;
                deserializedKeyPhraseExtractionSkill.defaultLanguageCode = defaultLanguageCode;
                deserializedKeyPhraseExtractionSkill.maxKeyPhraseCount = maxKeyPhraseCount;
                deserializedKeyPhraseExtractionSkill.modelVersion = modelVersion;

                return deserializedKeyPhraseExtractionSkill;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!inputsFound) {
                missingProperties.add("inputs");
            }
            if (!outputsFound) {
                missingProperties.add("outputs");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
