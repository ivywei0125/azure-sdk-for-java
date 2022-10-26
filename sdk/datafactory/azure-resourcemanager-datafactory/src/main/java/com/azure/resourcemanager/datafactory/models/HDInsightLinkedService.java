// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.HDInsightLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** HDInsight linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HDInsight")
@Fluent
public final class HDInsightLinkedService extends LinkedService {
    /*
     * HDInsight linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private HDInsightLinkedServiceTypeProperties innerTypeProperties = new HDInsightLinkedServiceTypeProperties();

    /** Creates an instance of HDInsightLinkedService class. */
    public HDInsightLinkedService() {
    }

    /**
     * Get the innerTypeProperties property: HDInsight linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private HDInsightLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the clusterUri property: HDInsight cluster URI. Type: string (or Expression with resultType string).
     *
     * @return the clusterUri value.
     */
    public Object clusterUri() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().clusterUri();
    }

    /**
     * Set the clusterUri property: HDInsight cluster URI. Type: string (or Expression with resultType string).
     *
     * @param clusterUri the clusterUri value to set.
     * @return the HDInsightLinkedService object itself.
     */
    public HDInsightLinkedService withClusterUri(Object clusterUri) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withClusterUri(clusterUri);
        return this;
    }

    /**
     * Get the username property: HDInsight cluster user name. Type: string (or Expression with resultType string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().username();
    }

    /**
     * Set the username property: HDInsight cluster user name. Type: string (or Expression with resultType string).
     *
     * @param username the username value to set.
     * @return the HDInsightLinkedService object itself.
     */
    public HDInsightLinkedService withUsername(Object username) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: HDInsight cluster password.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: HDInsight cluster password.
     *
     * @param password the password value to set.
     * @return the HDInsightLinkedService object itself.
     */
    public HDInsightLinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
        return this;
    }

    /**
     * Get the linkedServiceName property: The Azure Storage linked service reference.
     *
     * @return the linkedServiceName value.
     */
    public LinkedServiceReference linkedServiceName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().linkedServiceName();
    }

    /**
     * Set the linkedServiceName property: The Azure Storage linked service reference.
     *
     * @param linkedServiceName the linkedServiceName value to set.
     * @return the HDInsightLinkedService object itself.
     */
    public HDInsightLinkedService withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * Get the hcatalogLinkedServiceName property: A reference to the Azure SQL linked service that points to the
     * HCatalog database.
     *
     * @return the hcatalogLinkedServiceName value.
     */
    public LinkedServiceReference hcatalogLinkedServiceName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().hcatalogLinkedServiceName();
    }

    /**
     * Set the hcatalogLinkedServiceName property: A reference to the Azure SQL linked service that points to the
     * HCatalog database.
     *
     * @param hcatalogLinkedServiceName the hcatalogLinkedServiceName value to set.
     * @return the HDInsightLinkedService object itself.
     */
    public HDInsightLinkedService withHcatalogLinkedServiceName(LinkedServiceReference hcatalogLinkedServiceName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withHcatalogLinkedServiceName(hcatalogLinkedServiceName);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the HDInsightLinkedService object itself.
     */
    public HDInsightLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Get the isEspEnabled property: Specify if the HDInsight is created with ESP (Enterprise Security Package). Type:
     * Boolean.
     *
     * @return the isEspEnabled value.
     */
    public Object isEspEnabled() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().isEspEnabled();
    }

    /**
     * Set the isEspEnabled property: Specify if the HDInsight is created with ESP (Enterprise Security Package). Type:
     * Boolean.
     *
     * @param isEspEnabled the isEspEnabled value to set.
     * @return the HDInsightLinkedService object itself.
     */
    public HDInsightLinkedService withIsEspEnabled(Object isEspEnabled) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withIsEspEnabled(isEspEnabled);
        return this;
    }

    /**
     * Get the fileSystem property: Specify the FileSystem if the main storage for the HDInsight is ADLS Gen2. Type:
     * string (or Expression with resultType string).
     *
     * @return the fileSystem value.
     */
    public Object fileSystem() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().fileSystem();
    }

    /**
     * Set the fileSystem property: Specify the FileSystem if the main storage for the HDInsight is ADLS Gen2. Type:
     * string (or Expression with resultType string).
     *
     * @param fileSystem the fileSystem value to set.
     * @return the HDInsightLinkedService object itself.
     */
    public HDInsightLinkedService withFileSystem(Object fileSystem) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withFileSystem(fileSystem);
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
                        "Missing required property innerTypeProperties in model HDInsightLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HDInsightLinkedService.class);
}
