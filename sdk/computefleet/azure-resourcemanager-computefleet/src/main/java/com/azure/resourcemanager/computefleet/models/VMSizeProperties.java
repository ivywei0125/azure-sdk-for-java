// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifies VM Size Property settings on the virtual machine.
 */
@Fluent
public final class VMSizeProperties implements JsonSerializable<VMSizeProperties> {
    /*
     * Specifies the number of vCPUs available for the VM. When this property is not
     * specified in the request body the default behavior is to set it to the value of
     * vCPUs available for that VM size exposed in api response of [List all available
     * virtual machine sizes in a
     * region](https://docs.microsoft.com/en-us/rest/api/compute/resource-skus/list).
     */
    private Integer vCPUsAvailable;

    /*
     * Specifies the vCPU to physical core ratio. When this property is not specified
     * in the request body the default behavior is set to the value of vCPUsPerCore
     * for the VM Size exposed in api response of [List all available virtual machine
     * sizes in a
     * region](https://docs.microsoft.com/en-us/rest/api/compute/resource-skus/list).
     * **Setting this property to 1 also means that hyper-threading is disabled.**
     */
    private Integer vCPUsPerCore;

    /**
     * Creates an instance of VMSizeProperties class.
     */
    public VMSizeProperties() {
    }

    /**
     * Get the vCPUsAvailable property: Specifies the number of vCPUs available for the VM. When this property is not
     * specified in the request body the default behavior is to set it to the value of
     * vCPUs available for that VM size exposed in api response of [List all available
     * virtual machine sizes in a
     * region](https://docs.microsoft.com/en-us/rest/api/compute/resource-skus/list).
     * 
     * @return the vCPUsAvailable value.
     */
    public Integer vCPUsAvailable() {
        return this.vCPUsAvailable;
    }

    /**
     * Set the vCPUsAvailable property: Specifies the number of vCPUs available for the VM. When this property is not
     * specified in the request body the default behavior is to set it to the value of
     * vCPUs available for that VM size exposed in api response of [List all available
     * virtual machine sizes in a
     * region](https://docs.microsoft.com/en-us/rest/api/compute/resource-skus/list).
     * 
     * @param vCPUsAvailable the vCPUsAvailable value to set.
     * @return the VMSizeProperties object itself.
     */
    public VMSizeProperties withVCPUsAvailable(Integer vCPUsAvailable) {
        this.vCPUsAvailable = vCPUsAvailable;
        return this;
    }

    /**
     * Get the vCPUsPerCore property: Specifies the vCPU to physical core ratio. When this property is not specified
     * in the request body the default behavior is set to the value of vCPUsPerCore
     * for the VM Size exposed in api response of [List all available virtual machine
     * sizes in a
     * region](https://docs.microsoft.com/en-us/rest/api/compute/resource-skus/list).
     * **Setting this property to 1 also means that hyper-threading is disabled.**.
     * 
     * @return the vCPUsPerCore value.
     */
    public Integer vCPUsPerCore() {
        return this.vCPUsPerCore;
    }

    /**
     * Set the vCPUsPerCore property: Specifies the vCPU to physical core ratio. When this property is not specified
     * in the request body the default behavior is set to the value of vCPUsPerCore
     * for the VM Size exposed in api response of [List all available virtual machine
     * sizes in a
     * region](https://docs.microsoft.com/en-us/rest/api/compute/resource-skus/list).
     * **Setting this property to 1 also means that hyper-threading is disabled.**.
     * 
     * @param vCPUsPerCore the vCPUsPerCore value to set.
     * @return the VMSizeProperties object itself.
     */
    public VMSizeProperties withVCPUsPerCore(Integer vCPUsPerCore) {
        this.vCPUsPerCore = vCPUsPerCore;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("vCPUsAvailable", this.vCPUsAvailable);
        jsonWriter.writeNumberField("vCPUsPerCore", this.vCPUsPerCore);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VMSizeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VMSizeProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the VMSizeProperties.
     */
    public static VMSizeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VMSizeProperties deserializedVMSizeProperties = new VMSizeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("vCPUsAvailable".equals(fieldName)) {
                    deserializedVMSizeProperties.vCPUsAvailable = reader.getNullable(JsonReader::getInt);
                } else if ("vCPUsPerCore".equals(fieldName)) {
                    deserializedVMSizeProperties.vCPUsPerCore = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVMSizeProperties;
        });
    }
}
