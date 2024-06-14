// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * The azure table storage linked service.
 */
@Fluent
public class AzureTableStorageLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    private String type = "AzureTableStorage";

    /*
     * The connection string. It is mutually exclusive with sasUri property. Type: string, SecureString or AzureKeyVaultSecretReference.
     */
    private Object connectionString;

    /*
     * The Azure key vault secret reference of accountKey in connection string.
     */
    private AzureKeyVaultSecretReference accountKey;

    /*
     * SAS URI of the Azure Storage resource. It is mutually exclusive with connectionString property. Type: string, SecureString or AzureKeyVaultSecretReference.
     */
    private Object sasUri;

    /*
     * The Azure key vault secret reference of sasToken in sas uri.
     */
    private AzureKeyVaultSecretReference sasToken;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     */
    private String encryptedCredential;

    /**
     * Creates an instance of AzureTableStorageLinkedService class.
     */
    public AzureTableStorageLinkedService() {
    }

    /**
     * Get the type property: Type of linked service.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the connectionString property: The connection string. It is mutually exclusive with sasUri property. Type:
     * string, SecureString or AzureKeyVaultSecretReference.
     * 
     * @return the connectionString value.
     */
    public Object getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string. It is mutually exclusive with sasUri property. Type:
     * string, SecureString or AzureKeyVaultSecretReference.
     * 
     * @param connectionString the connectionString value to set.
     * @return the AzureTableStorageLinkedService object itself.
     */
    public AzureTableStorageLinkedService setConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the accountKey property: The Azure key vault secret reference of accountKey in connection string.
     * 
     * @return the accountKey value.
     */
    public AzureKeyVaultSecretReference getAccountKey() {
        return this.accountKey;
    }

    /**
     * Set the accountKey property: The Azure key vault secret reference of accountKey in connection string.
     * 
     * @param accountKey the accountKey value to set.
     * @return the AzureTableStorageLinkedService object itself.
     */
    public AzureTableStorageLinkedService setAccountKey(AzureKeyVaultSecretReference accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get the sasUri property: SAS URI of the Azure Storage resource. It is mutually exclusive with connectionString
     * property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     * @return the sasUri value.
     */
    public Object getSasUri() {
        return this.sasUri;
    }

    /**
     * Set the sasUri property: SAS URI of the Azure Storage resource. It is mutually exclusive with connectionString
     * property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     * @param sasUri the sasUri value to set.
     * @return the AzureTableStorageLinkedService object itself.
     */
    public AzureTableStorageLinkedService setSasUri(Object sasUri) {
        this.sasUri = sasUri;
        return this;
    }

    /**
     * Get the sasToken property: The Azure key vault secret reference of sasToken in sas uri.
     * 
     * @return the sasToken value.
     */
    public AzureKeyVaultSecretReference getSasToken() {
        return this.sasToken;
    }

    /**
     * Set the sasToken property: The Azure key vault secret reference of sasToken in sas uri.
     * 
     * @param sasToken the sasToken value to set.
     * @return the AzureTableStorageLinkedService object itself.
     */
    public AzureTableStorageLinkedService setSasToken(AzureKeyVaultSecretReference sasToken) {
        this.sasToken = sasToken;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @return the encryptedCredential value.
     */
    public String getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureTableStorageLinkedService object itself.
     */
    public AzureTableStorageLinkedService setEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureTableStorageLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureTableStorageLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureTableStorageLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureTableStorageLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("connectVia", getConnectVia());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeMapField("parameters", getParameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", getAnnotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeStringField("type", this.type);
        if (connectionString != null
            || accountKey != null
            || sasUri != null
            || sasToken != null
            || encryptedCredential != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeUntypedField("connectionString", this.connectionString);
            jsonWriter.writeJsonField("accountKey", this.accountKey);
            jsonWriter.writeUntypedField("sasUri", this.sasUri);
            jsonWriter.writeJsonField("sasToken", this.sasToken);
            jsonWriter.writeStringField("encryptedCredential", this.encryptedCredential);
            jsonWriter.writeEndObject();
        }
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureTableStorageLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureTableStorageLinkedService if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureTableStorageLinkedService.
     */
    public static AzureTableStorageLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureTableStorageLinkedService deserializedAzureTableStorageLinkedService
                = new AzureTableStorageLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectVia".equals(fieldName)) {
                    deserializedAzureTableStorageLinkedService
                        .setConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedAzureTableStorageLinkedService.setDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedAzureTableStorageLinkedService.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedAzureTableStorageLinkedService.setAnnotations(annotations);
                } else if ("type".equals(fieldName)) {
                    deserializedAzureTableStorageLinkedService.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("connectionString".equals(fieldName)) {
                            deserializedAzureTableStorageLinkedService.connectionString = reader.readUntyped();
                        } else if ("accountKey".equals(fieldName)) {
                            deserializedAzureTableStorageLinkedService.accountKey
                                = AzureKeyVaultSecretReference.fromJson(reader);
                        } else if ("sasUri".equals(fieldName)) {
                            deserializedAzureTableStorageLinkedService.sasUri = reader.readUntyped();
                        } else if ("sasToken".equals(fieldName)) {
                            deserializedAzureTableStorageLinkedService.sasToken
                                = AzureKeyVaultSecretReference.fromJson(reader);
                        } else if ("encryptedCredential".equals(fieldName)) {
                            deserializedAzureTableStorageLinkedService.encryptedCredential = reader.getString();
                        } else {
                            reader.skipChildren();
                        }
                    }
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedAzureTableStorageLinkedService.setAdditionalProperties(additionalProperties);

            return deserializedAzureTableStorageLinkedService;
        });
    }
}
