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
 * The Teradata database dataset.
 */
@Fluent
public class TeradataTableDataset extends Dataset {
    /*
     * Type of dataset.
     */
    private String type = "TeradataTable";

    /*
     * The database name of Teradata. Type: string (or Expression with resultType string).
     */
    private Object database;

    /*
     * The table name of Teradata. Type: string (or Expression with resultType string).
     */
    private Object table;

    /**
     * Creates an instance of TeradataTableDataset class.
     */
    public TeradataTableDataset() {
    }

    /**
     * Get the type property: Type of dataset.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the database property: The database name of Teradata. Type: string (or Expression with resultType string).
     * 
     * @return the database value.
     */
    public Object getDatabase() {
        return this.database;
    }

    /**
     * Set the database property: The database name of Teradata. Type: string (or Expression with resultType string).
     * 
     * @param database the database value to set.
     * @return the TeradataTableDataset object itself.
     */
    public TeradataTableDataset setDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get the table property: The table name of Teradata. Type: string (or Expression with resultType string).
     * 
     * @return the table value.
     */
    public Object getTable() {
        return this.table;
    }

    /**
     * Set the table property: The table name of Teradata. Type: string (or Expression with resultType string).
     * 
     * @param table the table value to set.
     * @return the TeradataTableDataset object itself.
     */
    public TeradataTableDataset setTable(Object table) {
        this.table = table;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeradataTableDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeradataTableDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeradataTableDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeradataTableDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeradataTableDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeradataTableDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeradataTableDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("linkedServiceName", getLinkedServiceName());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeUntypedField("structure", getStructure());
        jsonWriter.writeUntypedField("schema", getSchema());
        jsonWriter.writeMapField("parameters", getParameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", getAnnotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeJsonField("folder", getFolder());
        jsonWriter.writeStringField("type", this.type);
        if (database != null || table != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeUntypedField("database", this.database);
            jsonWriter.writeUntypedField("table", this.table);
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
     * Reads an instance of TeradataTableDataset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TeradataTableDataset if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TeradataTableDataset.
     */
    public static TeradataTableDataset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TeradataTableDataset deserializedTeradataTableDataset = new TeradataTableDataset();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedTeradataTableDataset.setLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedTeradataTableDataset.setDescription(reader.getString());
                } else if ("structure".equals(fieldName)) {
                    deserializedTeradataTableDataset.setStructure(reader.readUntyped());
                } else if ("schema".equals(fieldName)) {
                    deserializedTeradataTableDataset.setSchema(reader.readUntyped());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedTeradataTableDataset.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedTeradataTableDataset.setAnnotations(annotations);
                } else if ("folder".equals(fieldName)) {
                    deserializedTeradataTableDataset.setFolder(DatasetFolder.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedTeradataTableDataset.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("database".equals(fieldName)) {
                            deserializedTeradataTableDataset.database = reader.readUntyped();
                        } else if ("table".equals(fieldName)) {
                            deserializedTeradataTableDataset.table = reader.readUntyped();
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
            deserializedTeradataTableDataset.setAdditionalProperties(additionalProperties);

            return deserializedTeradataTableDataset;
        });
    }
}
