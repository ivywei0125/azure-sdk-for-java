// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Generic distribution object.
 */
@Fluent
public class ImageTemplateDistributor implements JsonSerializable<ImageTemplateDistributor> {
    /*
     * Type of distribution.
     */
    private String type = "ImageTemplateDistributor";

    /*
     * The name to be used for the associated RunOutput.
     */
    private String runOutputName;

    /*
     * Tags that will be applied to the artifact once it has been created/updated by the distributor.
     */
    private Map<String, String> artifactTags;

    /**
     * Creates an instance of ImageTemplateDistributor class.
     */
    public ImageTemplateDistributor() {
    }

    /**
     * Get the type property: Type of distribution.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the runOutputName property: The name to be used for the associated RunOutput.
     * 
     * @return the runOutputName value.
     */
    public String runOutputName() {
        return this.runOutputName;
    }

    /**
     * Set the runOutputName property: The name to be used for the associated RunOutput.
     * 
     * @param runOutputName the runOutputName value to set.
     * @return the ImageTemplateDistributor object itself.
     */
    public ImageTemplateDistributor withRunOutputName(String runOutputName) {
        this.runOutputName = runOutputName;
        return this;
    }

    /**
     * Get the artifactTags property: Tags that will be applied to the artifact once it has been created/updated by the
     * distributor.
     * 
     * @return the artifactTags value.
     */
    public Map<String, String> artifactTags() {
        return this.artifactTags;
    }

    /**
     * Set the artifactTags property: Tags that will be applied to the artifact once it has been created/updated by the
     * distributor.
     * 
     * @param artifactTags the artifactTags value to set.
     * @return the ImageTemplateDistributor object itself.
     */
    public ImageTemplateDistributor withArtifactTags(Map<String, String> artifactTags) {
        this.artifactTags = artifactTags;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (runOutputName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property runOutputName in model ImageTemplateDistributor"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ImageTemplateDistributor.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("runOutputName", this.runOutputName);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeMapField("artifactTags", this.artifactTags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImageTemplateDistributor from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImageTemplateDistributor if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ImageTemplateDistributor.
     */
    public static ImageTemplateDistributor fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("ManagedImage".equals(discriminatorValue)) {
                    return ImageTemplateManagedImageDistributor.fromJson(readerToUse.reset());
                } else if ("SharedImage".equals(discriminatorValue)) {
                    return ImageTemplateSharedImageDistributor.fromJson(readerToUse.reset());
                } else if ("VHD".equals(discriminatorValue)) {
                    return ImageTemplateVhdDistributor.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static ImageTemplateDistributor fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ImageTemplateDistributor deserializedImageTemplateDistributor = new ImageTemplateDistributor();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("runOutputName".equals(fieldName)) {
                    deserializedImageTemplateDistributor.runOutputName = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedImageTemplateDistributor.type = reader.getString();
                } else if ("artifactTags".equals(fieldName)) {
                    Map<String, String> artifactTags = reader.readMap(reader1 -> reader1.getString());
                    deserializedImageTemplateDistributor.artifactTags = artifactTags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedImageTemplateDistributor;
        });
    }
}
