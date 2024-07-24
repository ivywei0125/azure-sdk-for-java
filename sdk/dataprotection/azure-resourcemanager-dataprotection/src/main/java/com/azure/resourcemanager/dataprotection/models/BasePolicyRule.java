// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * BasePolicyRule
 * 
 * BasePolicy Rule.
 */
@Fluent
public class BasePolicyRule implements JsonSerializable<BasePolicyRule> {
    /*
     * The objectType property.
     */
    private String objectType = "BasePolicyRule";

    /*
     * The name property.
     */
    private String name;

    /**
     * Creates an instance of BasePolicyRule class.
     */
    public BasePolicyRule() {
    }

    /**
     * Get the objectType property: The objectType property.
     * 
     * @return the objectType value.
     */
    public String objectType() {
        return this.objectType;
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     * 
     * @param name the name value to set.
     * @return the BasePolicyRule object itself.
     */
    public BasePolicyRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model BasePolicyRule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BasePolicyRule.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("objectType", this.objectType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BasePolicyRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BasePolicyRule if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BasePolicyRule.
     */
    public static BasePolicyRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("objectType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("AzureBackupRule".equals(discriminatorValue)) {
                    return AzureBackupRule.fromJson(readerToUse.reset());
                } else if ("AzureRetentionRule".equals(discriminatorValue)) {
                    return AzureRetentionRule.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static BasePolicyRule fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BasePolicyRule deserializedBasePolicyRule = new BasePolicyRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedBasePolicyRule.name = reader.getString();
                } else if ("objectType".equals(fieldName)) {
                    deserializedBasePolicyRule.objectType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBasePolicyRule;
        });
    }
}
