// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Defines a data change detection policy that captures changes using the Integrated Change Tracking feature of Azure
 * SQL Database.
 */
@Immutable
public final class SqlIntegratedChangeTrackingPolicy extends DataChangeDetectionPolicy {
    /*
     * A URI fragment specifying the type of data change detection policy.
     */
    private String odataType = "#Microsoft.Azure.Search.SqlIntegratedChangeTrackingPolicy";

    /**
     * Creates an instance of SqlIntegratedChangeTrackingPolicy class.
     */
    public SqlIntegratedChangeTrackingPolicy() {
    }

    /**
     * Get the odataType property: A URI fragment specifying the type of data change detection policy.
     * 
     * @return the odataType value.
     */
    @Override
    public String getOdataType() {
        return this.odataType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", this.odataType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SqlIntegratedChangeTrackingPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SqlIntegratedChangeTrackingPolicy if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SqlIntegratedChangeTrackingPolicy.
     */
    public static SqlIntegratedChangeTrackingPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SqlIntegratedChangeTrackingPolicy deserializedSqlIntegratedChangeTrackingPolicy
                = new SqlIntegratedChangeTrackingPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("@odata.type".equals(fieldName)) {
                    deserializedSqlIntegratedChangeTrackingPolicy.odataType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSqlIntegratedChangeTrackingPolicy;
        });
    }
}
