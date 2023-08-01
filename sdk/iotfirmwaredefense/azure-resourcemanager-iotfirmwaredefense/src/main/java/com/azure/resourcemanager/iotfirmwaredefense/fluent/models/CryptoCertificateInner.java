// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.iotfirmwaredefense.models.CryptoCertificateEntity;
import com.azure.resourcemanager.iotfirmwaredefense.models.IsExpired;
import com.azure.resourcemanager.iotfirmwaredefense.models.IsSelfSigned;
import com.azure.resourcemanager.iotfirmwaredefense.models.IsShortKeySize;
import com.azure.resourcemanager.iotfirmwaredefense.models.IsWeakSignature;
import com.azure.resourcemanager.iotfirmwaredefense.models.PairedKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Crypto certificate properties. */
@Fluent
public final class CryptoCertificateInner {
    /*
     * ID for the certificate.
     */
    @JsonProperty(value = "cryptoCertId")
    private String cryptoCertId;

    /*
     * Name of the certificate.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Subject information of the certificate.
     */
    @JsonProperty(value = "subject")
    private CryptoCertificateEntity subject;

    /*
     * Issuer information of the certificate.
     */
    @JsonProperty(value = "issuer")
    private CryptoCertificateEntity issuer;

    /*
     * Issue date for the certificate.
     */
    @JsonProperty(value = "issuedDate")
    private OffsetDateTime issuedDate;

    /*
     * Expiration date for the certificate.
     */
    @JsonProperty(value = "expirationDate")
    private OffsetDateTime expirationDate;

    /*
     * Role of the certificate (Root CA, etc)
     */
    @JsonProperty(value = "role")
    private String role;

    /*
     * The signature algorithm used in the certificate.
     */
    @JsonProperty(value = "signatureAlgorithm")
    private String signatureAlgorithm;

    /*
     * Size of the certificate's key in bits
     */
    @JsonProperty(value = "keySize")
    private Long keySize;

    /*
     * Key algorithm used in the certificate.
     */
    @JsonProperty(value = "keyAlgorithm")
    private String keyAlgorithm;

    /*
     * Encoding used for the certificate.
     */
    @JsonProperty(value = "encoding")
    private String encoding;

    /*
     * Serial number of the certificate.
     */
    @JsonProperty(value = "serialNumber")
    private String serialNumber;

    /*
     * Fingerprint of the certificate.
     */
    @JsonProperty(value = "fingerprint")
    private String fingerprint;

    /*
     * List of functions the certificate can fulfill.
     */
    @JsonProperty(value = "usage")
    private List<String> usage;

    /*
     * List of files paths for this certificate
     */
    @JsonProperty(value = "filePaths", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> filePaths;

    /*
     * A matching paired private key.
     */
    @JsonProperty(value = "pairedKey")
    private PairedKey pairedKey;

    /*
     * Indicates if the certificate is expired.
     */
    @JsonProperty(value = "isExpired")
    private IsExpired isExpired;

    /*
     * Indicates if the certificate was self-signed.
     */
    @JsonProperty(value = "isSelfSigned")
    private IsSelfSigned isSelfSigned;

    /*
     * Indicates the signature algorithm used is insecure.
     */
    @JsonProperty(value = "isWeakSignature")
    private IsWeakSignature isWeakSignature;

    /*
     * Indicates the certificate's key size is considered too small to be secure for the key algorithm.
     */
    @JsonProperty(value = "isShortKeySize")
    private IsShortKeySize isShortKeySize;

    /** Creates an instance of CryptoCertificateInner class. */
    public CryptoCertificateInner() {
    }

    /**
     * Get the cryptoCertId property: ID for the certificate.
     *
     * @return the cryptoCertId value.
     */
    public String cryptoCertId() {
        return this.cryptoCertId;
    }

    /**
     * Set the cryptoCertId property: ID for the certificate.
     *
     * @param cryptoCertId the cryptoCertId value to set.
     * @return the CryptoCertificateInner object itself.
     */
    public CryptoCertificateInner withCryptoCertId(String cryptoCertId) {
        this.cryptoCertId = cryptoCertId;
        return this;
    }

    /**
     * Get the name property: Name of the certificate.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the certificate.
     *
     * @param name the name value to set.
     * @return the CryptoCertificateInner object itself.
     */
    public CryptoCertificateInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the subject property: Subject information of the certificate.
     *
     * @return the subject value.
     */
    public CryptoCertificateEntity subject() {
        return this.subject;
    }

    /**
     * Set the subject property: Subject information of the certificate.
     *
     * @param subject the subject value to set.
     * @return the CryptoCertificateInner object itself.
     */
    public CryptoCertificateInner withSubject(CryptoCertificateEntity subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get the issuer property: Issuer information of the certificate.
     *
     * @return the issuer value.
     */
    public CryptoCertificateEntity issuer() {
        return this.issuer;
    }

    /**
     * Set the issuer property: Issuer information of the certificate.
     *
     * @param issuer the issuer value to set.
     * @return the CryptoCertificateInner object itself.
     */
    public CryptoCertificateInner withIssuer(CryptoCertificateEntity issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Get the issuedDate property: Issue date for the certificate.
     *
     * @return the issuedDate value.
     */
    public OffsetDateTime issuedDate() {
        return this.issuedDate;
    }

    /**
     * Set the issuedDate property: Issue date for the certificate.
     *
     * @param issuedDate the issuedDate value to set.
     * @return the CryptoCertificateInner object itself.
     */
    public CryptoCertificateInner withIssuedDate(OffsetDateTime issuedDate) {
        this.issuedDate = issuedDate;
        return this;
    }

    /**
     * Get the expirationDate property: Expiration date for the certificate.
     *
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Set the expirationDate property: Expiration date for the certificate.
     *
     * @param expirationDate the expirationDate value to set.
     * @return the CryptoCertificateInner object itself.
     */
    public CryptoCertificateInner withExpirationDate(OffsetDateTime expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * Get the role property: Role of the certificate (Root CA, etc).
     *
     * @return the role value.
     */
    public String role() {
        return this.role;
    }

    /**
     * Set the role property: Role of the certificate (Root CA, etc).
     *
     * @param role the role value to set.
     * @return the CryptoCertificateInner object itself.
     */
    public CryptoCertificateInner withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * Get the signatureAlgorithm property: The signature algorithm used in the certificate.
     *
     * @return the signatureAlgorithm value.
     */
    public String signatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    /**
     * Set the signatureAlgorithm property: The signature algorithm used in the certificate.
     *
     * @param signatureAlgorithm the signatureAlgorithm value to set.
     * @return the CryptoCertificateInner object itself.
     */
    public CryptoCertificateInner withSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }

    /**
     * Get the keySize property: Size of the certificate's key in bits.
     *
     * @return the keySize value.
     */
    public Long keySize() {
        return this.keySize;
    }

    /**
     * Set the keySize property: Size of the certificate's key in bits.
     *
     * @param keySize the keySize value to set.
     * @return the CryptoCertificateInner object itself.
     */
    public CryptoCertificateInner withKeySize(Long keySize) {
        this.keySize = keySize;
        return this;
    }

    /**
     * Get the keyAlgorithm property: Key algorithm used in the certificate.
     *
     * @return the keyAlgorithm value.
     */
    public String keyAlgorithm() {
        return this.keyAlgorithm;
    }

    /**
     * Set the keyAlgorithm property: Key algorithm used in the certificate.
     *
     * @param keyAlgorithm the keyAlgorithm value to set.
     * @return the CryptoCertificateInner object itself.
     */
    public CryptoCertificateInner withKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
        return this;
    }

    /**
     * Get the encoding property: Encoding used for the certificate.
     *
     * @return the encoding value.
     */
    public String encoding() {
        return this.encoding;
    }

    /**
     * Set the encoding property: Encoding used for the certificate.
     *
     * @param encoding the encoding value to set.
     * @return the CryptoCertificateInner object itself.
     */
    public CryptoCertificateInner withEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * Get the serialNumber property: Serial number of the certificate.
     *
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Set the serialNumber property: Serial number of the certificate.
     *
     * @param serialNumber the serialNumber value to set.
     * @return the CryptoCertificateInner object itself.
     */
    public CryptoCertificateInner withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * Get the fingerprint property: Fingerprint of the certificate.
     *
     * @return the fingerprint value.
     */
    public String fingerprint() {
        return this.fingerprint;
    }

    /**
     * Set the fingerprint property: Fingerprint of the certificate.
     *
     * @param fingerprint the fingerprint value to set.
     * @return the CryptoCertificateInner object itself.
     */
    public CryptoCertificateInner withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    /**
     * Get the usage property: List of functions the certificate can fulfill.
     *
     * @return the usage value.
     */
    public List<String> usage() {
        return this.usage;
    }

    /**
     * Set the usage property: List of functions the certificate can fulfill.
     *
     * @param usage the usage value to set.
     * @return the CryptoCertificateInner object itself.
     */
    public CryptoCertificateInner withUsage(List<String> usage) {
        this.usage = usage;
        return this;
    }

    /**
     * Get the filePaths property: List of files paths for this certificate.
     *
     * @return the filePaths value.
     */
    public List<String> filePaths() {
        return this.filePaths;
    }

    /**
     * Get the pairedKey property: A matching paired private key.
     *
     * @return the pairedKey value.
     */
    public PairedKey pairedKey() {
        return this.pairedKey;
    }

    /**
     * Set the pairedKey property: A matching paired private key.
     *
     * @param pairedKey the pairedKey value to set.
     * @return the CryptoCertificateInner object itself.
     */
    public CryptoCertificateInner withPairedKey(PairedKey pairedKey) {
        this.pairedKey = pairedKey;
        return this;
    }

    /**
     * Get the isExpired property: Indicates if the certificate is expired.
     *
     * @return the isExpired value.
     */
    public IsExpired isExpired() {
        return this.isExpired;
    }

    /**
     * Set the isExpired property: Indicates if the certificate is expired.
     *
     * @param isExpired the isExpired value to set.
     * @return the CryptoCertificateInner object itself.
     */
    public CryptoCertificateInner withIsExpired(IsExpired isExpired) {
        this.isExpired = isExpired;
        return this;
    }

    /**
     * Get the isSelfSigned property: Indicates if the certificate was self-signed.
     *
     * @return the isSelfSigned value.
     */
    public IsSelfSigned isSelfSigned() {
        return this.isSelfSigned;
    }

    /**
     * Set the isSelfSigned property: Indicates if the certificate was self-signed.
     *
     * @param isSelfSigned the isSelfSigned value to set.
     * @return the CryptoCertificateInner object itself.
     */
    public CryptoCertificateInner withIsSelfSigned(IsSelfSigned isSelfSigned) {
        this.isSelfSigned = isSelfSigned;
        return this;
    }

    /**
     * Get the isWeakSignature property: Indicates the signature algorithm used is insecure.
     *
     * @return the isWeakSignature value.
     */
    public IsWeakSignature isWeakSignature() {
        return this.isWeakSignature;
    }

    /**
     * Set the isWeakSignature property: Indicates the signature algorithm used is insecure.
     *
     * @param isWeakSignature the isWeakSignature value to set.
     * @return the CryptoCertificateInner object itself.
     */
    public CryptoCertificateInner withIsWeakSignature(IsWeakSignature isWeakSignature) {
        this.isWeakSignature = isWeakSignature;
        return this;
    }

    /**
     * Get the isShortKeySize property: Indicates the certificate's key size is considered too small to be secure for
     * the key algorithm.
     *
     * @return the isShortKeySize value.
     */
    public IsShortKeySize isShortKeySize() {
        return this.isShortKeySize;
    }

    /**
     * Set the isShortKeySize property: Indicates the certificate's key size is considered too small to be secure for
     * the key algorithm.
     *
     * @param isShortKeySize the isShortKeySize value to set.
     * @return the CryptoCertificateInner object itself.
     */
    public CryptoCertificateInner withIsShortKeySize(IsShortKeySize isShortKeySize) {
        this.isShortKeySize = isShortKeySize;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subject() != null) {
            subject().validate();
        }
        if (issuer() != null) {
            issuer().validate();
        }
        if (pairedKey() != null) {
            pairedKey().validate();
        }
    }
}
