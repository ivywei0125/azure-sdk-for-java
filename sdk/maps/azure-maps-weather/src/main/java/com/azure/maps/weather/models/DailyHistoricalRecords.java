// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The DailyHistoricalRecords model.
 */
@Fluent
public final class DailyHistoricalRecords implements JsonSerializable<DailyHistoricalRecords> {

    /*
     * Date and time of the current observation displayed in ISO 8601 format, for example, 2019-10-27T19:39:57-08:00.
     */
    private OffsetDateTime timestamp;

    /*
     * Temperature value.
     */
    private WeatherValueYearMaxMinAvg temperature;

    /*
     * Maximum amount of precipitation (liquid equivalent) that has fallen.
     */
    private WeatherValueYearMax precipitation;

    /*
     * Maximum snowfall.
     */
    private WeatherValueYearMax snowfall;

    /**
     * Set default DailyHistoricalRecords constructor to private
     */
    private DailyHistoricalRecords() {
    }

    /**
     * Get the timestamp property: Date and time of the current observation displayed in ISO 8601 format, for example,
     * 2019-10-27T19:39:57-08:00.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Get the temperature property: Temperature value.
     *
     * @return the temperature value.
     */
    public WeatherValueYearMaxMinAvg getTemperature() {
        return this.temperature;
    }

    /**
     * Get the precipitation property: Maximum amount of precipitation (liquid equivalent) that has fallen.
     *
     * @return the precipitation value.
     */
    public WeatherValueYearMax getPrecipitation() {
        return this.precipitation;
    }

    /**
     * Get the snowfall property: Maximum snowfall.
     *
     * @return the snowfall value.
     */
    public WeatherValueYearMax getSnowfall() {
        return this.snowfall;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("date",
            this.timestamp == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.timestamp));
        jsonWriter.writeJsonField("temperature", this.temperature);
        jsonWriter.writeJsonField("precipitation", this.precipitation);
        jsonWriter.writeJsonField("snowfall", this.snowfall);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DailyHistoricalRecords from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DailyHistoricalRecords if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DailyHistoricalRecords.
     */
    public static DailyHistoricalRecords fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DailyHistoricalRecords deserializedDailyHistoricalRecords = new DailyHistoricalRecords();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("date".equals(fieldName)) {
                    deserializedDailyHistoricalRecords.timestamp
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("temperature".equals(fieldName)) {
                    deserializedDailyHistoricalRecords.temperature = WeatherValueYearMaxMinAvg.fromJson(reader);
                } else if ("precipitation".equals(fieldName)) {
                    deserializedDailyHistoricalRecords.precipitation = WeatherValueYearMax.fromJson(reader);
                } else if ("snowfall".equals(fieldName)) {
                    deserializedDailyHistoricalRecords.snowfall = WeatherValueYearMax.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedDailyHistoricalRecords;
        });
    }
}
