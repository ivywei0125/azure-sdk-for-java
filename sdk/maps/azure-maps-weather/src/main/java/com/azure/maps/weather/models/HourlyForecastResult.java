// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.maps.weather.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The HourlyForecastResult model.
 */
@Immutable
public final class HourlyForecastResult implements JsonSerializable<HourlyForecastResult> {

    /*
     * Forecast data for each returned hour.
     */
    private List<HourlyForecast> forecasts;

    /**
     * Set default HourlyForecastResult constructor to private
     */
    private HourlyForecastResult() {
    }

    /**
     * Get the forecasts property: Forecast data for each returned hour.
     *
     * @return the forecasts value.
     */
    public List<HourlyForecast> getForecasts() {
        return this.forecasts;
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
     * Reads an instance of HourlyForecastResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of HourlyForecastResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HourlyForecastResult.
     */
    public static HourlyForecastResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HourlyForecastResult deserializedHourlyForecastResult = new HourlyForecastResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("forecasts".equals(fieldName)) {
                    List<HourlyForecast> forecasts = reader.readArray(reader1 -> HourlyForecast.fromJson(reader1));
                    deserializedHourlyForecastResult.forecasts = forecasts;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedHourlyForecastResult;
        });
    }
}
