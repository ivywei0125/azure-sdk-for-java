// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The lineage relation with GUID of the from and to entity.
 */
@Immutable
public final class LineageRelation implements JsonSerializable<LineageRelation> {
    /*
     * The GUID of from-entity.
     */
    @Generated
    private String fromEntityId;

    /*
     * The GUID of relationship.
     */
    @Generated
    private String relationshipId;

    /*
     * The GUID of to-entity.
     */
    @Generated
    private String toEntityId;

    /**
     * Creates an instance of LineageRelation class.
     */
    @Generated
    private LineageRelation() {
    }

    /**
     * Get the fromEntityId property: The GUID of from-entity.
     * 
     * @return the fromEntityId value.
     */
    @Generated
    public String getFromEntityId() {
        return this.fromEntityId;
    }

    /**
     * Get the relationshipId property: The GUID of relationship.
     * 
     * @return the relationshipId value.
     */
    @Generated
    public String getRelationshipId() {
        return this.relationshipId;
    }

    /**
     * Get the toEntityId property: The GUID of to-entity.
     * 
     * @return the toEntityId value.
     */
    @Generated
    public String getToEntityId() {
        return this.toEntityId;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("fromEntityId", this.fromEntityId);
        jsonWriter.writeStringField("relationshipId", this.relationshipId);
        jsonWriter.writeStringField("toEntityId", this.toEntityId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LineageRelation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LineageRelation if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LineageRelation.
     */
    @Generated
    public static LineageRelation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LineageRelation deserializedLineageRelation = new LineageRelation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("fromEntityId".equals(fieldName)) {
                    deserializedLineageRelation.fromEntityId = reader.getString();
                } else if ("relationshipId".equals(fieldName)) {
                    deserializedLineageRelation.relationshipId = reader.getString();
                } else if ("toEntityId".equals(fieldName)) {
                    deserializedLineageRelation.toEntityId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLineageRelation;
        });
    }
}
