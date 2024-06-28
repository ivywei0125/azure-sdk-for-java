// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.avs.fluent.models.WorkloadNetworkDnsServiceInner;
import java.io.IOException;
import java.util.List;

/**
 * The response of a WorkloadNetworkDnsService list operation.
 */
@Fluent
public final class WorkloadNetworkDnsServicesList implements JsonSerializable<WorkloadNetworkDnsServicesList> {
    /*
     * The WorkloadNetworkDnsService items on this page
     */
    private List<WorkloadNetworkDnsServiceInner> value;

    /*
     * The link to the next page of items
     */
    private String nextLink;

    /**
     * Creates an instance of WorkloadNetworkDnsServicesList class.
     */
    public WorkloadNetworkDnsServicesList() {
    }

    /**
     * Get the value property: The WorkloadNetworkDnsService items on this page.
     * 
     * @return the value value.
     */
    public List<WorkloadNetworkDnsServiceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The WorkloadNetworkDnsService items on this page.
     * 
     * @param value the value value to set.
     * @return the WorkloadNetworkDnsServicesList object itself.
     */
    public WorkloadNetworkDnsServicesList withValue(List<WorkloadNetworkDnsServiceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of items.
     * 
     * @param nextLink the nextLink value to set.
     * @return the WorkloadNetworkDnsServicesList object itself.
     */
    public WorkloadNetworkDnsServicesList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model WorkloadNetworkDnsServicesList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WorkloadNetworkDnsServicesList.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkloadNetworkDnsServicesList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkloadNetworkDnsServicesList if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WorkloadNetworkDnsServicesList.
     */
    public static WorkloadNetworkDnsServicesList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkloadNetworkDnsServicesList deserializedWorkloadNetworkDnsServicesList
                = new WorkloadNetworkDnsServicesList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<WorkloadNetworkDnsServiceInner> value
                        = reader.readArray(reader1 -> WorkloadNetworkDnsServiceInner.fromJson(reader1));
                    deserializedWorkloadNetworkDnsServicesList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedWorkloadNetworkDnsServicesList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkloadNetworkDnsServicesList;
        });
    }
}
