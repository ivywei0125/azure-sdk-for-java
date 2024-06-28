// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Defines the resource properties.
 */
@Fluent
public final class NetworkProfile implements JsonSerializable<NetworkProfile> {
    /*
     * Gets or sets the list of network interfaces associated with the virtual machine.
     */
    private List<NetworkInterface> networkInterfaces;

    /**
     * Creates an instance of NetworkProfile class.
     */
    public NetworkProfile() {
    }

    /**
     * Get the networkInterfaces property: Gets or sets the list of network interfaces associated with the virtual
     * machine.
     * 
     * @return the networkInterfaces value.
     */
    public List<NetworkInterface> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Set the networkInterfaces property: Gets or sets the list of network interfaces associated with the virtual
     * machine.
     * 
     * @param networkInterfaces the networkInterfaces value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withNetworkInterfaces(List<NetworkInterface> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkInterfaces() != null) {
            networkInterfaces().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("networkInterfaces", this.networkInterfaces,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkProfile if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkProfile.
     */
    public static NetworkProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkProfile deserializedNetworkProfile = new NetworkProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("networkInterfaces".equals(fieldName)) {
                    List<NetworkInterface> networkInterfaces
                        = reader.readArray(reader1 -> NetworkInterface.fromJson(reader1));
                    deserializedNetworkProfile.networkInterfaces = networkInterfaces;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkProfile;
        });
    }
}
