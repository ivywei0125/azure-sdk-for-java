// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the subnet.
 */
@Fluent
public final class Subnet implements JsonSerializable<Subnet> {
    /*
     * Represents address prefix.
     */
    private String addressPrefix;

    /**
     * Creates an instance of Subnet class.
     */
    public Subnet() {
    }

    /**
     * Get the addressPrefix property: Represents address prefix.
     * 
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: Represents address prefix.
     * 
     * @param addressPrefix the addressPrefix value to set.
     * @return the Subnet object itself.
     */
    public Subnet withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
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
        jsonWriter.writeStringField("addressPrefix", this.addressPrefix);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Subnet from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Subnet if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Subnet.
     */
    public static Subnet fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Subnet deserializedSubnet = new Subnet();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("addressPrefix".equals(fieldName)) {
                    deserializedSubnet.addressPrefix = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSubnet;
        });
    }
}
