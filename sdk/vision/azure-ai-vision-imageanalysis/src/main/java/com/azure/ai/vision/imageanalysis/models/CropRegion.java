// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.imageanalysis.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A region at the desired aspect ratio that can be used as image thumbnail.
 * The region preserves as much content as possible from the analyzed image, with priority given to detected faces.
 */
@Immutable
public final class CropRegion implements JsonSerializable<CropRegion> {

    /*
     * The aspect ratio of the crop region.
     * Aspect ratio is calculated by dividing the width of the region in pixels by its height in pixels.
     * The aspect ratio will be in the range 0.75 to 1.8 (inclusive) if provided by the developer during the analyze
     * call.
     * Otherwise, it will be in the range 0.5 to 2.0 (inclusive).
     */
    @Generated
    private final double aspectRatio;

    /*
     * The bounding box of the region.
     */
    @Generated
    private final ImageBoundingBox boundingBox;

    /**
     * Creates an instance of CropRegion class.
     *
     * @param aspectRatio the aspectRatio value to set.
     * @param boundingBox the boundingBox value to set.
     */
    @Generated
    private CropRegion(double aspectRatio, ImageBoundingBox boundingBox) {
        this.aspectRatio = aspectRatio;
        this.boundingBox = boundingBox;
    }

    /**
     * Get the aspectRatio property: The aspect ratio of the crop region.
     * Aspect ratio is calculated by dividing the width of the region in pixels by its height in pixels.
     * The aspect ratio will be in the range 0.75 to 1.8 (inclusive) if provided by the developer during the analyze
     * call.
     * Otherwise, it will be in the range 0.5 to 2.0 (inclusive).
     *
     * @return the aspectRatio value.
     */
    @Generated
    public double getAspectRatio() {
        return this.aspectRatio;
    }

    /**
     * Get the boundingBox property: The bounding box of the region.
     *
     * @return the boundingBox value.
     */
    @Generated
    public ImageBoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeDoubleField("aspectRatio", this.aspectRatio);
        jsonWriter.writeJsonField("boundingBox", this.boundingBox);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CropRegion from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CropRegion if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CropRegion.
     */
    @Generated
    public static CropRegion fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            double aspectRatio = 0.0;
            ImageBoundingBox boundingBox = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("aspectRatio".equals(fieldName)) {
                    aspectRatio = reader.getDouble();
                } else if ("boundingBox".equals(fieldName)) {
                    boundingBox = ImageBoundingBox.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new CropRegion(aspectRatio, boundingBox);
        });
    }
}
