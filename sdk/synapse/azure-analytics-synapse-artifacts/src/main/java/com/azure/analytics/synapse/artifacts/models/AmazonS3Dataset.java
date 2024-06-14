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
 * A single Amazon Simple Storage Service (S3) object or a set of S3 objects.
 */
@Fluent
public class AmazonS3Dataset extends Dataset {
    /*
     * Type of dataset.
     */
    private String type = "AmazonS3Object";

    /*
     * The name of the Amazon S3 bucket. Type: string (or Expression with resultType string).
     */
    private Object bucketName;

    /*
     * The key of the Amazon S3 object. Type: string (or Expression with resultType string).
     */
    private Object key;

    /*
     * The prefix filter for the S3 object name. Type: string (or Expression with resultType string).
     */
    private Object prefix;

    /*
     * The version for the S3 object. Type: string (or Expression with resultType string).
     */
    private Object version;

    /*
     * The start of S3 object's modified datetime. Type: string (or Expression with resultType string).
     */
    private Object modifiedDatetimeStart;

    /*
     * The end of S3 object's modified datetime. Type: string (or Expression with resultType string).
     */
    private Object modifiedDatetimeEnd;

    /*
     * The format of files.
     */
    private DatasetStorageFormat format;

    /*
     * The data compression method used for the Amazon S3 object.
     */
    private DatasetCompression compression;

    /**
     * Creates an instance of AmazonS3Dataset class.
     */
    public AmazonS3Dataset() {
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
     * Get the bucketName property: The name of the Amazon S3 bucket. Type: string (or Expression with resultType
     * string).
     * 
     * @return the bucketName value.
     */
    public Object getBucketName() {
        return this.bucketName;
    }

    /**
     * Set the bucketName property: The name of the Amazon S3 bucket. Type: string (or Expression with resultType
     * string).
     * 
     * @param bucketName the bucketName value to set.
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset setBucketName(Object bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Get the key property: The key of the Amazon S3 object. Type: string (or Expression with resultType string).
     * 
     * @return the key value.
     */
    public Object getKey() {
        return this.key;
    }

    /**
     * Set the key property: The key of the Amazon S3 object. Type: string (or Expression with resultType string).
     * 
     * @param key the key value to set.
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset setKey(Object key) {
        this.key = key;
        return this;
    }

    /**
     * Get the prefix property: The prefix filter for the S3 object name. Type: string (or Expression with resultType
     * string).
     * 
     * @return the prefix value.
     */
    public Object getPrefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: The prefix filter for the S3 object name. Type: string (or Expression with resultType
     * string).
     * 
     * @param prefix the prefix value to set.
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset setPrefix(Object prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the version property: The version for the S3 object. Type: string (or Expression with resultType string).
     * 
     * @return the version value.
     */
    public Object getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version for the S3 object. Type: string (or Expression with resultType string).
     * 
     * @param version the version value to set.
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset setVersion(Object version) {
        this.version = version;
        return this;
    }

    /**
     * Get the modifiedDatetimeStart property: The start of S3 object's modified datetime. Type: string (or Expression
     * with resultType string).
     * 
     * @return the modifiedDatetimeStart value.
     */
    public Object getModifiedDatetimeStart() {
        return this.modifiedDatetimeStart;
    }

    /**
     * Set the modifiedDatetimeStart property: The start of S3 object's modified datetime. Type: string (or Expression
     * with resultType string).
     * 
     * @param modifiedDatetimeStart the modifiedDatetimeStart value to set.
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset setModifiedDatetimeStart(Object modifiedDatetimeStart) {
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        return this;
    }

    /**
     * Get the modifiedDatetimeEnd property: The end of S3 object's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @return the modifiedDatetimeEnd value.
     */
    public Object getModifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd;
    }

    /**
     * Set the modifiedDatetimeEnd property: The end of S3 object's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @param modifiedDatetimeEnd the modifiedDatetimeEnd value to set.
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset setModifiedDatetimeEnd(Object modifiedDatetimeEnd) {
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        return this;
    }

    /**
     * Get the format property: The format of files.
     * 
     * @return the format value.
     */
    public DatasetStorageFormat getFormat() {
        return this.format;
    }

    /**
     * Set the format property: The format of files.
     * 
     * @param format the format value to set.
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset setFormat(DatasetStorageFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the compression property: The data compression method used for the Amazon S3 object.
     * 
     * @return the compression value.
     */
    public DatasetCompression getCompression() {
        return this.compression;
    }

    /**
     * Set the compression property: The data compression method used for the Amazon S3 object.
     * 
     * @param compression the compression value to set.
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset setCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmazonS3Dataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmazonS3Dataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmazonS3Dataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmazonS3Dataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmazonS3Dataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmazonS3Dataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmazonS3Dataset setFolder(DatasetFolder folder) {
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
        if (bucketName != null
            || key != null
            || prefix != null
            || version != null
            || modifiedDatetimeStart != null
            || modifiedDatetimeEnd != null
            || format != null
            || compression != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeUntypedField("bucketName", this.bucketName);
            jsonWriter.writeUntypedField("key", this.key);
            jsonWriter.writeUntypedField("prefix", this.prefix);
            jsonWriter.writeUntypedField("version", this.version);
            jsonWriter.writeUntypedField("modifiedDatetimeStart", this.modifiedDatetimeStart);
            jsonWriter.writeUntypedField("modifiedDatetimeEnd", this.modifiedDatetimeEnd);
            jsonWriter.writeJsonField("format", this.format);
            jsonWriter.writeJsonField("compression", this.compression);
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
     * Reads an instance of AmazonS3Dataset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AmazonS3Dataset if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AmazonS3Dataset.
     */
    public static AmazonS3Dataset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AmazonS3Dataset deserializedAmazonS3Dataset = new AmazonS3Dataset();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedAmazonS3Dataset.setLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedAmazonS3Dataset.setDescription(reader.getString());
                } else if ("structure".equals(fieldName)) {
                    deserializedAmazonS3Dataset.setStructure(reader.readUntyped());
                } else if ("schema".equals(fieldName)) {
                    deserializedAmazonS3Dataset.setSchema(reader.readUntyped());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedAmazonS3Dataset.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedAmazonS3Dataset.setAnnotations(annotations);
                } else if ("folder".equals(fieldName)) {
                    deserializedAmazonS3Dataset.setFolder(DatasetFolder.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedAmazonS3Dataset.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("bucketName".equals(fieldName)) {
                            deserializedAmazonS3Dataset.bucketName = reader.readUntyped();
                        } else if ("key".equals(fieldName)) {
                            deserializedAmazonS3Dataset.key = reader.readUntyped();
                        } else if ("prefix".equals(fieldName)) {
                            deserializedAmazonS3Dataset.prefix = reader.readUntyped();
                        } else if ("version".equals(fieldName)) {
                            deserializedAmazonS3Dataset.version = reader.readUntyped();
                        } else if ("modifiedDatetimeStart".equals(fieldName)) {
                            deserializedAmazonS3Dataset.modifiedDatetimeStart = reader.readUntyped();
                        } else if ("modifiedDatetimeEnd".equals(fieldName)) {
                            deserializedAmazonS3Dataset.modifiedDatetimeEnd = reader.readUntyped();
                        } else if ("format".equals(fieldName)) {
                            deserializedAmazonS3Dataset.format = DatasetStorageFormat.fromJson(reader);
                        } else if ("compression".equals(fieldName)) {
                            deserializedAmazonS3Dataset.compression = DatasetCompression.fromJson(reader);
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
            deserializedAmazonS3Dataset.setAdditionalProperties(additionalProperties);

            return deserializedAmazonS3Dataset;
        });
    }
}
