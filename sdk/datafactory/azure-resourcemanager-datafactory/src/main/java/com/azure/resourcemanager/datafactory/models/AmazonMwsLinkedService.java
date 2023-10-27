// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.AmazonMwsLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Amazon Marketplace Web Service linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AmazonMWS")
@Fluent
public final class AmazonMwsLinkedService extends LinkedService {
    /*
     * Amazon Marketplace Web Service linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private AmazonMwsLinkedServiceTypeProperties innerTypeProperties = new AmazonMwsLinkedServiceTypeProperties();

    /** Creates an instance of AmazonMwsLinkedService class. */
    public AmazonMwsLinkedService() {
    }

    /**
     * Get the innerTypeProperties property: Amazon Marketplace Web Service linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private AmazonMwsLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonMwsLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonMwsLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonMwsLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonMwsLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the endpoint property: The endpoint of the Amazon MWS server, (i.e. mws.amazonservices.com).
     *
     * @return the endpoint value.
     */
    public Object endpoint() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().endpoint();
    }

    /**
     * Set the endpoint property: The endpoint of the Amazon MWS server, (i.e. mws.amazonservices.com).
     *
     * @param endpoint the endpoint value to set.
     * @return the AmazonMwsLinkedService object itself.
     */
    public AmazonMwsLinkedService withEndpoint(Object endpoint) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonMwsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEndpoint(endpoint);
        return this;
    }

    /**
     * Get the marketplaceId property: The Amazon Marketplace ID you want to retrieve data from. To retrieve data from
     * multiple Marketplace IDs, separate them with a comma (,). (i.e. A2EUQ1WTGCTBG2).
     *
     * @return the marketplaceId value.
     */
    public Object marketplaceId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().marketplaceId();
    }

    /**
     * Set the marketplaceId property: The Amazon Marketplace ID you want to retrieve data from. To retrieve data from
     * multiple Marketplace IDs, separate them with a comma (,). (i.e. A2EUQ1WTGCTBG2).
     *
     * @param marketplaceId the marketplaceId value to set.
     * @return the AmazonMwsLinkedService object itself.
     */
    public AmazonMwsLinkedService withMarketplaceId(Object marketplaceId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonMwsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withMarketplaceId(marketplaceId);
        return this;
    }

    /**
     * Get the sellerId property: The Amazon seller ID.
     *
     * @return the sellerId value.
     */
    public Object sellerId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sellerId();
    }

    /**
     * Set the sellerId property: The Amazon seller ID.
     *
     * @param sellerId the sellerId value to set.
     * @return the AmazonMwsLinkedService object itself.
     */
    public AmazonMwsLinkedService withSellerId(Object sellerId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonMwsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSellerId(sellerId);
        return this;
    }

    /**
     * Get the mwsAuthToken property: The Amazon MWS authentication token.
     *
     * @return the mwsAuthToken value.
     */
    public SecretBase mwsAuthToken() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().mwsAuthToken();
    }

    /**
     * Set the mwsAuthToken property: The Amazon MWS authentication token.
     *
     * @param mwsAuthToken the mwsAuthToken value to set.
     * @return the AmazonMwsLinkedService object itself.
     */
    public AmazonMwsLinkedService withMwsAuthToken(SecretBase mwsAuthToken) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonMwsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withMwsAuthToken(mwsAuthToken);
        return this;
    }

    /**
     * Get the accessKeyId property: The access key id used to access data.
     *
     * @return the accessKeyId value.
     */
    public Object accessKeyId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accessKeyId();
    }

    /**
     * Set the accessKeyId property: The access key id used to access data.
     *
     * @param accessKeyId the accessKeyId value to set.
     * @return the AmazonMwsLinkedService object itself.
     */
    public AmazonMwsLinkedService withAccessKeyId(Object accessKeyId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonMwsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * Get the secretKey property: The secret key used to access data.
     *
     * @return the secretKey value.
     */
    public SecretBase secretKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().secretKey();
    }

    /**
     * Set the secretKey property: The secret key used to access data.
     *
     * @param secretKey the secretKey value to set.
     * @return the AmazonMwsLinkedService object itself.
     */
    public AmazonMwsLinkedService withSecretKey(SecretBase secretKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonMwsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSecretKey(secretKey);
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     *
     * @return the useEncryptedEndpoints value.
     */
    public Object useEncryptedEndpoints() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().useEncryptedEndpoints();
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     *
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the AmazonMwsLinkedService object itself.
     */
    public AmazonMwsLinkedService withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonMwsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUseEncryptedEndpoints(useEncryptedEndpoints);
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     *
     * @return the useHostVerification value.
     */
    public Object useHostVerification() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().useHostVerification();
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     *
     * @param useHostVerification the useHostVerification value to set.
     * @return the AmazonMwsLinkedService object itself.
     */
    public AmazonMwsLinkedService withUseHostVerification(Object useHostVerification) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonMwsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUseHostVerification(useHostVerification);
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     *
     * @return the usePeerVerification value.
     */
    public Object usePeerVerification() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().usePeerVerification();
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     *
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the AmazonMwsLinkedService object itself.
     */
    public AmazonMwsLinkedService withUsePeerVerification(Object usePeerVerification) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonMwsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsePeerVerification(usePeerVerification);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     *
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AmazonMwsLinkedService object itself.
     */
    public AmazonMwsLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonMwsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model AmazonMwsLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AmazonMwsLinkedService.class);
}
