// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.hybridcompute.models.EsuEligibility;
import com.azure.resourcemanager.hybridcompute.models.EsuKey;
import com.azure.resourcemanager.hybridcompute.models.EsuKeyState;
import com.azure.resourcemanager.hybridcompute.models.EsuServerType;
import com.azure.resourcemanager.hybridcompute.models.LicenseProfileArmEsuPropertiesWithoutAssignedLicense;
import java.io.IOException;
import java.util.List;

/**
 * Describes the properties of a License Profile ARM model.
 */
@Fluent
public final class LicenseProfileArmEsuProperties extends LicenseProfileArmEsuPropertiesWithoutAssignedLicense {
    /*
     * The resource id of the license.
     */
    private String assignedLicense;

    /*
     * The guid id of the license.
     */
    private String assignedLicenseImmutableId;

    /*
     * The list of ESU keys.
     */
    private List<EsuKey> esuKeys;

    /*
     * The type of the Esu servers.
     */
    private EsuServerType serverType;

    /*
     * Indicates the eligibility state of Esu.
     */
    private EsuEligibility esuEligibility;

    /*
     * Indicates whether there is an ESU Key currently active for the machine.
     */
    private EsuKeyState esuKeyState;

    /**
     * Creates an instance of LicenseProfileArmEsuProperties class.
     */
    public LicenseProfileArmEsuProperties() {
    }

    /**
     * Get the assignedLicense property: The resource id of the license.
     * 
     * @return the assignedLicense value.
     */
    public String assignedLicense() {
        return this.assignedLicense;
    }

    /**
     * Set the assignedLicense property: The resource id of the license.
     * 
     * @param assignedLicense the assignedLicense value to set.
     * @return the LicenseProfileArmEsuProperties object itself.
     */
    public LicenseProfileArmEsuProperties withAssignedLicense(String assignedLicense) {
        this.assignedLicense = assignedLicense;
        return this;
    }

    /**
     * Get the assignedLicenseImmutableId property: The guid id of the license.
     * 
     * @return the assignedLicenseImmutableId value.
     */
    @Override
    public String assignedLicenseImmutableId() {
        return this.assignedLicenseImmutableId;
    }

    /**
     * Get the esuKeys property: The list of ESU keys.
     * 
     * @return the esuKeys value.
     */
    @Override
    public List<EsuKey> esuKeys() {
        return this.esuKeys;
    }

    /**
     * Get the serverType property: The type of the Esu servers.
     * 
     * @return the serverType value.
     */
    @Override
    public EsuServerType serverType() {
        return this.serverType;
    }

    /**
     * Get the esuEligibility property: Indicates the eligibility state of Esu.
     * 
     * @return the esuEligibility value.
     */
    @Override
    public EsuEligibility esuEligibility() {
        return this.esuEligibility;
    }

    /**
     * Get the esuKeyState property: Indicates whether there is an ESU Key currently active for the machine.
     * 
     * @return the esuKeyState value.
     */
    @Override
    public EsuKeyState esuKeyState() {
        return this.esuKeyState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("assignedLicense", this.assignedLicense);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LicenseProfileArmEsuProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LicenseProfileArmEsuProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LicenseProfileArmEsuProperties.
     */
    public static LicenseProfileArmEsuProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LicenseProfileArmEsuProperties deserializedLicenseProfileArmEsuProperties
                = new LicenseProfileArmEsuProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("assignedLicenseImmutableId".equals(fieldName)) {
                    deserializedLicenseProfileArmEsuProperties.assignedLicenseImmutableId = reader.getString();
                } else if ("esuKeys".equals(fieldName)) {
                    List<EsuKey> esuKeys = reader.readArray(reader1 -> EsuKey.fromJson(reader1));
                    deserializedLicenseProfileArmEsuProperties.esuKeys = esuKeys;
                } else if ("serverType".equals(fieldName)) {
                    deserializedLicenseProfileArmEsuProperties.serverType
                        = EsuServerType.fromString(reader.getString());
                } else if ("esuEligibility".equals(fieldName)) {
                    deserializedLicenseProfileArmEsuProperties.esuEligibility
                        = EsuEligibility.fromString(reader.getString());
                } else if ("esuKeyState".equals(fieldName)) {
                    deserializedLicenseProfileArmEsuProperties.esuKeyState = EsuKeyState.fromString(reader.getString());
                } else if ("assignedLicense".equals(fieldName)) {
                    deserializedLicenseProfileArmEsuProperties.assignedLicense = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLicenseProfileArmEsuProperties;
        });
    }
}
