// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The identity of the Batch pool, if configured.
 */
@Immutable
public final class BatchPoolIdentity implements JsonSerializable<BatchPoolIdentity> {

    /*
     * The identity of the Batch pool, if configured. The list of user identities associated with the Batch pool. The
     * user identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/
     * userAssignedIdentities/{identityName}'.
     */
    @Generated
    private final BatchPoolIdentityType type;

    /*
     * The list of user identities associated with the Batch account. The user identity dictionary key references will
     * be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/
     * userAssignedIdentities/{identityName}'.
     */
    @Generated
    private List<UserAssignedIdentity> userAssignedIdentities;

    /**
     * Creates an instance of BatchPoolIdentity class.
     *
     * @param type the type value to set.
     */
    @Generated
    private BatchPoolIdentity(BatchPoolIdentityType type) {
        this.type = type;
    }

    /**
     * Get the type property: The identity of the Batch pool, if configured. The list of user identities associated with
     * the Batch pool. The user identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @return the type value.
     */
    @Generated
    public BatchPoolIdentityType getType() {
        return this.type;
    }

    /**
     * Get the userAssignedIdentities property: The list of user identities associated with the Batch account. The user
     * identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @return the userAssignedIdentities value.
     */
    @Generated
    public List<UserAssignedIdentity> getUserAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeArrayField("userAssignedIdentities", this.userAssignedIdentities,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchPoolIdentity from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchPoolIdentity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BatchPoolIdentity.
     */
    @Generated
    public static BatchPoolIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BatchPoolIdentityType type = null;
            List<UserAssignedIdentity> userAssignedIdentities = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("type".equals(fieldName)) {
                    type = BatchPoolIdentityType.fromString(reader.getString());
                } else if ("userAssignedIdentities".equals(fieldName)) {
                    userAssignedIdentities = reader.readArray(reader1 -> UserAssignedIdentity.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            BatchPoolIdentity deserializedBatchPoolIdentity = new BatchPoolIdentity(type);
            deserializedBatchPoolIdentity.userAssignedIdentities = userAssignedIdentities;
            return deserializedBatchPoolIdentity;
        });
    }
}
