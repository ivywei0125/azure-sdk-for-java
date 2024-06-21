// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents a phone number capability offering.
 */
@Immutable
public final class PhoneNumberOffering implements JsonSerializable<PhoneNumberOffering> {
    /*
     * Represents the number type of the offering.
     */
    private PhoneNumberType phoneNumberType;

    /*
     * Represents the assignment type of the offering.
     */
    private PhoneNumberAssignmentType assignmentType;

    /*
     * Capabilities of a phone number.
     */
    private PhoneNumberCapabilities availableCapabilities;

    /*
     * The incurred cost for a single phone number.
     */
    private PhoneNumberCost cost;

    /**
     * Creates an instance of PhoneNumberOffering class.
     */
    public PhoneNumberOffering() {
    }

    /**
     * Get the phoneNumberType property: Represents the number type of the offering.
     * 
     * @return the phoneNumberType value.
     */
    public PhoneNumberType getPhoneNumberType() {
        return this.phoneNumberType;
    }

    /**
     * Get the assignmentType property: Represents the assignment type of the offering.
     * 
     * @return the assignmentType value.
     */
    public PhoneNumberAssignmentType getAssignmentType() {
        return this.assignmentType;
    }

    /**
     * Get the availableCapabilities property: Capabilities of a phone number.
     * 
     * @return the availableCapabilities value.
     */
    public PhoneNumberCapabilities getAvailableCapabilities() {
        return this.availableCapabilities;
    }

    /**
     * Get the cost property: The incurred cost for a single phone number.
     * 
     * @return the cost value.
     */
    public PhoneNumberCost getCost() {
        return this.cost;
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
     * Reads an instance of PhoneNumberOffering from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PhoneNumberOffering if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PhoneNumberOffering.
     */
    public static PhoneNumberOffering fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PhoneNumberOffering deserializedPhoneNumberOffering = new PhoneNumberOffering();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("cost".equals(fieldName)) {
                    deserializedPhoneNumberOffering.cost = PhoneNumberCost.fromJson(reader);
                } else if ("phoneNumberType".equals(fieldName)) {
                    deserializedPhoneNumberOffering.phoneNumberType = PhoneNumberType.fromString(reader.getString());
                } else if ("assignmentType".equals(fieldName)) {
                    deserializedPhoneNumberOffering.assignmentType
                        = PhoneNumberAssignmentType.fromString(reader.getString());
                } else if ("availableCapabilities".equals(fieldName)) {
                    deserializedPhoneNumberOffering.availableCapabilities = PhoneNumberCapabilities.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPhoneNumberOffering;
        });
    }
}
