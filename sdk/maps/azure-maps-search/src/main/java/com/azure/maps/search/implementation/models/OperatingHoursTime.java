// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.maps.search.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents a date and time.
 */
@Immutable
public final class OperatingHoursTime implements JsonSerializable<OperatingHoursTime> {

    /*
     * Represents current calendar date in POI time zone, e.g. "2019-02-07".
     */
    private String date;

    /*
     * Hours are in the 24 hour format in the local time of a POI; possible values are 0 - 23.
     */
    private Integer hour;

    /*
     * Minutes are in the local time of a POI; possible values are 0 - 59.
     */
    private Integer minute;

    /**
     * Creates an instance of OperatingHoursTime class.
     */
    private OperatingHoursTime() {
    }

    /**
     * Get the date property: Represents current calendar date in POI time zone, e.g. "2019-02-07".
     *
     * @return the date value.
     */
    public String getDate() {
        return this.date;
    }

    /**
     * Get the hour property: Hours are in the 24 hour format in the local time of a POI; possible values are 0 - 23.
     *
     * @return the hour value.
     */
    public Integer getHour() {
        return this.hour;
    }

    /**
     * Get the minute property: Minutes are in the local time of a POI; possible values are 0 - 59.
     *
     * @return the minute value.
     */
    public Integer getMinute() {
        return this.minute;
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
     * Reads an instance of OperatingHoursTime from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperatingHoursTime if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperatingHoursTime.
     */
    public static OperatingHoursTime fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperatingHoursTime deserializedOperatingHoursTime = new OperatingHoursTime();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("date".equals(fieldName)) {
                    deserializedOperatingHoursTime.date = reader.getString();
                } else if ("hour".equals(fieldName)) {
                    deserializedOperatingHoursTime.hour = reader.getNullable(JsonReader::getInt);
                } else if ("minute".equals(fieldName)) {
                    deserializedOperatingHoursTime.minute = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedOperatingHoursTime;
        });
    }

    /**
     * OperatingHoursTime Constructor
     *
     * @param date The date in the format of yyyy-mm-dd represented by a string
     * @param hour int representing the hour
     * @param minute int representing the minute
     */
    public OperatingHoursTime(String date, Integer hour, Integer minute) {
        this.date = date;
        this.hour = hour;
        this.minute = minute;
    }
}
