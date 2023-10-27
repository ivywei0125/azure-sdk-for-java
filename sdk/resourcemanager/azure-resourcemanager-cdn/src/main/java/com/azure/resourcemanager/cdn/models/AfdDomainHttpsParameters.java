// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JSON object that contains the properties to secure a domain. */
@Fluent
public final class AfdDomainHttpsParameters {
    /*
     * Defines the source of the SSL certificate.
     */
    @JsonProperty(value = "certificateType", required = true)
    private AfdCertificateType certificateType;

    /*
     * TLS protocol version that will be used for Https
     */
    @JsonProperty(value = "minimumTlsVersion")
    private AfdMinimumTlsVersion minimumTlsVersion;

    /*
     * Resource reference to the secret. ie. subs/rg/profile/secret
     */
    @JsonProperty(value = "secret")
    private ResourceReference secret;

    /** Creates an instance of AfdDomainHttpsParameters class. */
    public AfdDomainHttpsParameters() {
    }

    /**
     * Get the certificateType property: Defines the source of the SSL certificate.
     *
     * @return the certificateType value.
     */
    public AfdCertificateType certificateType() {
        return this.certificateType;
    }

    /**
     * Set the certificateType property: Defines the source of the SSL certificate.
     *
     * @param certificateType the certificateType value to set.
     * @return the AfdDomainHttpsParameters object itself.
     */
    public AfdDomainHttpsParameters withCertificateType(AfdCertificateType certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    /**
     * Get the minimumTlsVersion property: TLS protocol version that will be used for Https.
     *
     * @return the minimumTlsVersion value.
     */
    public AfdMinimumTlsVersion minimumTlsVersion() {
        return this.minimumTlsVersion;
    }

    /**
     * Set the minimumTlsVersion property: TLS protocol version that will be used for Https.
     *
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the AfdDomainHttpsParameters object itself.
     */
    public AfdDomainHttpsParameters withMinimumTlsVersion(AfdMinimumTlsVersion minimumTlsVersion) {
        this.minimumTlsVersion = minimumTlsVersion;
        return this;
    }

    /**
     * Get the secret property: Resource reference to the secret. ie. subs/rg/profile/secret.
     *
     * @return the secret value.
     */
    public ResourceReference secret() {
        return this.secret;
    }

    /**
     * Set the secret property: Resource reference to the secret. ie. subs/rg/profile/secret.
     *
     * @param secret the secret value to set.
     * @return the AfdDomainHttpsParameters object itself.
     */
    public AfdDomainHttpsParameters withSecret(ResourceReference secret) {
        this.secret = secret;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (certificateType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property certificateType in model AfdDomainHttpsParameters"));
        }
        if (secret() != null) {
            secret().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AfdDomainHttpsParameters.class);
}
