// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The KqlScriptContentCurrentConnection model.
 */
@Fluent
public final class KqlScriptContentCurrentConnection implements JsonSerializable<KqlScriptContentCurrentConnection> {
    /*
     * The name property.
     */
    private String name;

    /*
     * The poolName property.
     */
    private String poolName;

    /*
     * The databaseName property.
     */
    private String databaseName;

    /*
     * The type property.
     */
    private String type;

    /**
     * Creates an instance of KqlScriptContentCurrentConnection class.
     */
    public KqlScriptContentCurrentConnection() {
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     * 
     * @param name the name value to set.
     * @return the KqlScriptContentCurrentConnection object itself.
     */
    public KqlScriptContentCurrentConnection setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the poolName property: The poolName property.
     * 
     * @return the poolName value.
     */
    public String getPoolName() {
        return this.poolName;
    }

    /**
     * Set the poolName property: The poolName property.
     * 
     * @param poolName the poolName value to set.
     * @return the KqlScriptContentCurrentConnection object itself.
     */
    public KqlScriptContentCurrentConnection setPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * Get the databaseName property: The databaseName property.
     * 
     * @return the databaseName value.
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: The databaseName property.
     * 
     * @param databaseName the databaseName value to set.
     * @return the KqlScriptContentCurrentConnection object itself.
     */
    public KqlScriptContentCurrentConnection setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: The type property.
     * 
     * @param type the type value to set.
     * @return the KqlScriptContentCurrentConnection object itself.
     */
    public KqlScriptContentCurrentConnection setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("poolName", this.poolName);
        jsonWriter.writeStringField("databaseName", this.databaseName);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KqlScriptContentCurrentConnection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KqlScriptContentCurrentConnection if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the KqlScriptContentCurrentConnection.
     */
    public static KqlScriptContentCurrentConnection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KqlScriptContentCurrentConnection deserializedKqlScriptContentCurrentConnection
                = new KqlScriptContentCurrentConnection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedKqlScriptContentCurrentConnection.name = reader.getString();
                } else if ("poolName".equals(fieldName)) {
                    deserializedKqlScriptContentCurrentConnection.poolName = reader.getString();
                } else if ("databaseName".equals(fieldName)) {
                    deserializedKqlScriptContentCurrentConnection.databaseName = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedKqlScriptContentCurrentConnection.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKqlScriptContentCurrentConnection;
        });
    }
}
