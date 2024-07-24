// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.hybridcompute.models.AccessRuleDirection;
import java.io.IOException;
import java.util.List;

/**
 * Properties of an access rule.
 */
@Immutable
public final class AccessRuleProperties implements JsonSerializable<AccessRuleProperties> {
    /*
     * Direction of the access rule.
     */
    private AccessRuleDirection direction;

    /*
     * Address prefixes that are allowed access.
     */
    private List<String> addressPrefixes;

    /**
     * Creates an instance of AccessRuleProperties class.
     */
    public AccessRuleProperties() {
    }

    /**
     * Get the direction property: Direction of the access rule.
     * 
     * @return the direction value.
     */
    public AccessRuleDirection direction() {
        return this.direction;
    }

    /**
     * Get the addressPrefixes property: Address prefixes that are allowed access.
     * 
     * @return the addressPrefixes value.
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AccessRuleProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AccessRuleProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AccessRuleProperties.
     */
    public static AccessRuleProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AccessRuleProperties deserializedAccessRuleProperties = new AccessRuleProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("direction".equals(fieldName)) {
                    deserializedAccessRuleProperties.direction = AccessRuleDirection.fromString(reader.getString());
                } else if ("addressPrefixes".equals(fieldName)) {
                    List<String> addressPrefixes = reader.readArray(reader1 -> reader1.getString());
                    deserializedAccessRuleProperties.addressPrefixes = addressPrefixes;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAccessRuleProperties;
        });
    }
}
