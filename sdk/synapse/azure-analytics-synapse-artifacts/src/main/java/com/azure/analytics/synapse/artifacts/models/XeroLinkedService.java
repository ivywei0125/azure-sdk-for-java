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
 * Xero Service linked service.
 */
@Fluent
public class XeroLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    private String type = "Xero";

    /*
     * Properties used to connect to Xero. It is mutually exclusive with any other properties in the linked service. Type: object.
     */
    private Object connectionProperties;

    /*
     * The endpoint of the Xero server. (i.e. api.xero.com)
     */
    private Object host;

    /*
     * The consumer key associated with the Xero application.
     */
    private SecretBase consumerKey;

    /*
     * The private key from the .pem file that was generated for your Xero private application. You must include all the text from the .pem file, including the Unix line endings(
     * ).
     */
    private SecretBase privateKey;

    /*
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     */
    private Object useEncryptedEndpoints;

    /*
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     */
    private Object useHostVerification;

    /*
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     */
    private Object usePeerVerification;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     */
    private Object encryptedCredential;

    /**
     * Creates an instance of XeroLinkedService class.
     */
    public XeroLinkedService() {
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
     * Get the connectionProperties property: Properties used to connect to Xero. It is mutually exclusive with any
     * other properties in the linked service. Type: object.
     * 
     * @return the connectionProperties value.
     */
    public Object getConnectionProperties() {
        return this.connectionProperties;
    }

    /**
     * Set the connectionProperties property: Properties used to connect to Xero. It is mutually exclusive with any
     * other properties in the linked service. Type: object.
     * 
     * @param connectionProperties the connectionProperties value to set.
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService setConnectionProperties(Object connectionProperties) {
        this.connectionProperties = connectionProperties;
        return this;
    }

    /**
     * Get the host property: The endpoint of the Xero server. (i.e. api.xero.com).
     * 
     * @return the host value.
     */
    public Object getHost() {
        return this.host;
    }

    /**
     * Set the host property: The endpoint of the Xero server. (i.e. api.xero.com).
     * 
     * @param host the host value to set.
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService setHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the consumerKey property: The consumer key associated with the Xero application.
     * 
     * @return the consumerKey value.
     */
    public SecretBase getConsumerKey() {
        return this.consumerKey;
    }

    /**
     * Set the consumerKey property: The consumer key associated with the Xero application.
     * 
     * @param consumerKey the consumerKey value to set.
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService setConsumerKey(SecretBase consumerKey) {
        this.consumerKey = consumerKey;
        return this;
    }

    /**
     * Get the privateKey property: The private key from the .pem file that was generated for your Xero private
     * application. You must include all the text from the .pem file, including the Unix line endings(
     * ).
     * 
     * @return the privateKey value.
     */
    public SecretBase getPrivateKey() {
        return this.privateKey;
    }

    /**
     * Set the privateKey property: The private key from the .pem file that was generated for your Xero private
     * application. You must include all the text from the .pem file, including the Unix line endings(
     * ).
     * 
     * @param privateKey the privateKey value to set.
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService setPrivateKey(SecretBase privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     * 
     * @return the useEncryptedEndpoints value.
     */
    public Object getUseEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     * 
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService setUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     * 
     * @return the useHostVerification value.
     */
    public Object getUseHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     * 
     * @param useHostVerification the useHostVerification value to set.
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService setUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     * 
     * @return the usePeerVerification value.
     */
    public Object getUsePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     * 
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService setUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
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
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XeroLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XeroLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XeroLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XeroLinkedService setAnnotations(List<Object> annotations) {
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
        if (connectionProperties != null
            || host != null
            || consumerKey != null
            || privateKey != null
            || useEncryptedEndpoints != null
            || useHostVerification != null
            || usePeerVerification != null
            || encryptedCredential != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeUntypedField("connectionProperties", this.connectionProperties);
            jsonWriter.writeUntypedField("host", this.host);
            jsonWriter.writeJsonField("consumerKey", this.consumerKey);
            jsonWriter.writeJsonField("privateKey", this.privateKey);
            jsonWriter.writeUntypedField("useEncryptedEndpoints", this.useEncryptedEndpoints);
            jsonWriter.writeUntypedField("useHostVerification", this.useHostVerification);
            jsonWriter.writeUntypedField("usePeerVerification", this.usePeerVerification);
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
     * Reads an instance of XeroLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of XeroLinkedService if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the XeroLinkedService.
     */
    public static XeroLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            XeroLinkedService deserializedXeroLinkedService = new XeroLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectVia".equals(fieldName)) {
                    deserializedXeroLinkedService.setConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedXeroLinkedService.setDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedXeroLinkedService.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedXeroLinkedService.setAnnotations(annotations);
                } else if ("type".equals(fieldName)) {
                    deserializedXeroLinkedService.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("connectionProperties".equals(fieldName)) {
                            deserializedXeroLinkedService.connectionProperties = reader.readUntyped();
                        } else if ("host".equals(fieldName)) {
                            deserializedXeroLinkedService.host = reader.readUntyped();
                        } else if ("consumerKey".equals(fieldName)) {
                            deserializedXeroLinkedService.consumerKey = SecretBase.fromJson(reader);
                        } else if ("privateKey".equals(fieldName)) {
                            deserializedXeroLinkedService.privateKey = SecretBase.fromJson(reader);
                        } else if ("useEncryptedEndpoints".equals(fieldName)) {
                            deserializedXeroLinkedService.useEncryptedEndpoints = reader.readUntyped();
                        } else if ("useHostVerification".equals(fieldName)) {
                            deserializedXeroLinkedService.useHostVerification = reader.readUntyped();
                        } else if ("usePeerVerification".equals(fieldName)) {
                            deserializedXeroLinkedService.usePeerVerification = reader.readUntyped();
                        } else if ("encryptedCredential".equals(fieldName)) {
                            deserializedXeroLinkedService.encryptedCredential = reader.readUntyped();
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
            deserializedXeroLinkedService.setAdditionalProperties(additionalProperties);

            return deserializedXeroLinkedService;
        });
    }
}
