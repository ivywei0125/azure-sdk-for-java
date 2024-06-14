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
 * Azure Data Lake Analytics linked service.
 */
@Fluent
public class AzureDataLakeAnalyticsLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    private String type = "AzureDataLakeAnalytics";

    /*
     * The Azure Data Lake Analytics account name. Type: string (or Expression with resultType string).
     */
    private Object accountName;

    /*
     * The ID of the application used to authenticate against the Azure Data Lake Analytics account. Type: string (or Expression with resultType string).
     */
    private Object servicePrincipalId;

    /*
     * The Key of the application used to authenticate against the Azure Data Lake Analytics account.
     */
    private SecretBase servicePrincipalKey;

    /*
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     */
    private Object tenant;

    /*
     * Data Lake Analytics account subscription ID (if different from Data Factory account). Type: string (or Expression with resultType string).
     */
    private Object subscriptionId;

    /*
     * Data Lake Analytics account resource group name (if different from Data Factory account). Type: string (or Expression with resultType string).
     */
    private Object resourceGroupName;

    /*
     * Azure Data Lake Analytics URI Type: string (or Expression with resultType string).
     */
    private Object dataLakeAnalyticsUri;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     */
    private Object encryptedCredential;

    /**
     * Creates an instance of AzureDataLakeAnalyticsLinkedService class.
     */
    public AzureDataLakeAnalyticsLinkedService() {
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
     * Get the accountName property: The Azure Data Lake Analytics account name. Type: string (or Expression with
     * resultType string).
     * 
     * @return the accountName value.
     */
    public Object getAccountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: The Azure Data Lake Analytics account name. Type: string (or Expression with
     * resultType string).
     * 
     * @param accountName the accountName value to set.
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService setAccountName(Object accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the application used to authenticate against the Azure Data Lake
     * Analytics account. Type: string (or Expression with resultType string).
     * 
     * @return the servicePrincipalId value.
     */
    public Object getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The ID of the application used to authenticate against the Azure Data Lake
     * Analytics account. Type: string (or Expression with resultType string).
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService setServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The Key of the application used to authenticate against the Azure Data Lake
     * Analytics account.
     * 
     * @return the servicePrincipalKey value.
     */
    public SecretBase getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The Key of the application used to authenticate against the Azure Data Lake
     * Analytics account.
     * 
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService setServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     * 
     * @return the tenant value.
     */
    public Object getTenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     * 
     * @param tenant the tenant value to set.
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService setTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the subscriptionId property: Data Lake Analytics account subscription ID (if different from Data Factory
     * account). Type: string (or Expression with resultType string).
     * 
     * @return the subscriptionId value.
     */
    public Object getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Data Lake Analytics account subscription ID (if different from Data Factory
     * account). Type: string (or Expression with resultType string).
     * 
     * @param subscriptionId the subscriptionId value to set.
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService setSubscriptionId(Object subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroupName property: Data Lake Analytics account resource group name (if different from Data
     * Factory account). Type: string (or Expression with resultType string).
     * 
     * @return the resourceGroupName value.
     */
    public Object getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName property: Data Lake Analytics account resource group name (if different from Data
     * Factory account). Type: string (or Expression with resultType string).
     * 
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService setResourceGroupName(Object resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the dataLakeAnalyticsUri property: Azure Data Lake Analytics URI Type: string (or Expression with resultType
     * string).
     * 
     * @return the dataLakeAnalyticsUri value.
     */
    public Object getDataLakeAnalyticsUri() {
        return this.dataLakeAnalyticsUri;
    }

    /**
     * Set the dataLakeAnalyticsUri property: Azure Data Lake Analytics URI Type: string (or Expression with resultType
     * string).
     * 
     * @param dataLakeAnalyticsUri the dataLakeAnalyticsUri value to set.
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService setDataLakeAnalyticsUri(Object dataLakeAnalyticsUri) {
        this.dataLakeAnalyticsUri = dataLakeAnalyticsUri;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataLakeAnalyticsLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataLakeAnalyticsLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataLakeAnalyticsLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataLakeAnalyticsLinkedService setAnnotations(List<Object> annotations) {
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
        if (accountName != null
            || servicePrincipalId != null
            || servicePrincipalKey != null
            || tenant != null
            || subscriptionId != null
            || resourceGroupName != null
            || dataLakeAnalyticsUri != null
            || encryptedCredential != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeUntypedField("accountName", this.accountName);
            jsonWriter.writeUntypedField("servicePrincipalId", this.servicePrincipalId);
            jsonWriter.writeJsonField("servicePrincipalKey", this.servicePrincipalKey);
            jsonWriter.writeUntypedField("tenant", this.tenant);
            jsonWriter.writeUntypedField("subscriptionId", this.subscriptionId);
            jsonWriter.writeUntypedField("resourceGroupName", this.resourceGroupName);
            jsonWriter.writeUntypedField("dataLakeAnalyticsUri", this.dataLakeAnalyticsUri);
            jsonWriter.writeUntypedField("encryptedCredential", this.encryptedCredential);
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
     * Reads an instance of AzureDataLakeAnalyticsLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureDataLakeAnalyticsLinkedService if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureDataLakeAnalyticsLinkedService.
     */
    public static AzureDataLakeAnalyticsLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureDataLakeAnalyticsLinkedService deserializedAzureDataLakeAnalyticsLinkedService
                = new AzureDataLakeAnalyticsLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectVia".equals(fieldName)) {
                    deserializedAzureDataLakeAnalyticsLinkedService
                        .setConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedAzureDataLakeAnalyticsLinkedService.setDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedAzureDataLakeAnalyticsLinkedService.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedAzureDataLakeAnalyticsLinkedService.setAnnotations(annotations);
                } else if ("type".equals(fieldName)) {
                    deserializedAzureDataLakeAnalyticsLinkedService.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("accountName".equals(fieldName)) {
                            deserializedAzureDataLakeAnalyticsLinkedService.accountName = reader.readUntyped();
                        } else if ("servicePrincipalId".equals(fieldName)) {
                            deserializedAzureDataLakeAnalyticsLinkedService.servicePrincipalId = reader.readUntyped();
                        } else if ("servicePrincipalKey".equals(fieldName)) {
                            deserializedAzureDataLakeAnalyticsLinkedService.servicePrincipalKey
                                = SecretBase.fromJson(reader);
                        } else if ("tenant".equals(fieldName)) {
                            deserializedAzureDataLakeAnalyticsLinkedService.tenant = reader.readUntyped();
                        } else if ("subscriptionId".equals(fieldName)) {
                            deserializedAzureDataLakeAnalyticsLinkedService.subscriptionId = reader.readUntyped();
                        } else if ("resourceGroupName".equals(fieldName)) {
                            deserializedAzureDataLakeAnalyticsLinkedService.resourceGroupName = reader.readUntyped();
                        } else if ("dataLakeAnalyticsUri".equals(fieldName)) {
                            deserializedAzureDataLakeAnalyticsLinkedService.dataLakeAnalyticsUri = reader.readUntyped();
                        } else if ("encryptedCredential".equals(fieldName)) {
                            deserializedAzureDataLakeAnalyticsLinkedService.encryptedCredential = reader.readUntyped();
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
            deserializedAzureDataLakeAnalyticsLinkedService.setAdditionalProperties(additionalProperties);

            return deserializedAzureDataLakeAnalyticsLinkedService;
        });
    }
}
