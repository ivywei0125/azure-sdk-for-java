// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;
import java.util.Base64;

/** The PageBlobsUploadPagesFromURLHeaders model. */
@JacksonXmlRootElement(localName = "null")
@Fluent
public final class PageBlobsUploadPagesFromURLHeaders {
    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The x-ms-content-crc64 property.
     */
    @JsonProperty(value = "x-ms-content-crc64")
    private byte[] xMsContentCrc64;

    /*
     * The x-ms-blob-sequence-number property.
     */
    @JsonProperty(value = "x-ms-blob-sequence-number")
    private Long xMsBlobSequenceNumber;

    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-encryption-key-sha256 property.
     */
    @JsonProperty(value = "x-ms-encryption-key-sha256")
    private String xMsEncryptionKeySha256;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The x-ms-request-server-encrypted property.
     */
    @JsonProperty(value = "x-ms-request-server-encrypted")
    private Boolean xMsRequestServerEncrypted;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 date;

    /*
     * The Content-MD5 property.
     */
    @JsonProperty(value = "Content-MD5")
    private byte[] contentMD5;

    /*
     * The x-ms-encryption-scope property.
     */
    @JsonProperty(value = "x-ms-encryption-scope")
    private String xMsEncryptionScope;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of PageBlobsUploadPagesFromURLHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public PageBlobsUploadPagesFromURLHeaders(HttpHeaders rawHeaders) {
        this.xMsVersion = rawHeaders.getValue("x-ms-version");
        this.eTag = rawHeaders.getValue("ETag");
        String xMsContentCrc64 = rawHeaders.getValue("x-ms-content-crc64");
        if (xMsContentCrc64 != null) {
            this.xMsContentCrc64 = Base64.getDecoder().decode(xMsContentCrc64);
        }
        String xMsBlobSequenceNumber = rawHeaders.getValue("x-ms-blob-sequence-number");
        if (xMsBlobSequenceNumber != null) {
            this.xMsBlobSequenceNumber = Long.parseLong(xMsBlobSequenceNumber);
        }
        String lastModified = rawHeaders.getValue("Last-Modified");
        if (lastModified != null) {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        this.xMsEncryptionKeySha256 = rawHeaders.getValue("x-ms-encryption-key-sha256");
        this.xMsRequestId = rawHeaders.getValue("x-ms-request-id");
        String xMsRequestServerEncrypted = rawHeaders.getValue("x-ms-request-server-encrypted");
        if (xMsRequestServerEncrypted != null) {
            this.xMsRequestServerEncrypted = Boolean.parseBoolean(xMsRequestServerEncrypted);
        }
        String date = rawHeaders.getValue("Date");
        if (date != null) {
            this.date = new DateTimeRfc1123(date);
        }
        String contentMD5 = rawHeaders.getValue("Content-MD5");
        if (contentMD5 != null) {
            this.contentMD5 = Base64.getDecoder().decode(contentMD5);
        }
        this.xMsEncryptionScope = rawHeaders.getValue("x-ms-encryption-scope");
    }

    /**
     * Get the xMsVersion property: The x-ms-version property.
     *
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     *
     * @param xMsVersion the xMsVersion value to set.
     * @return the PageBlobsUploadPagesFromURLHeaders object itself.
     */
    public PageBlobsUploadPagesFromURLHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the eTag property: The ETag property.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     *
     * @param eTag the eTag value to set.
     * @return the PageBlobsUploadPagesFromURLHeaders object itself.
     */
    public PageBlobsUploadPagesFromURLHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the xMsContentCrc64 property: The x-ms-content-crc64 property.
     *
     * @return the xMsContentCrc64 value.
     */
    public byte[] getXMsContentCrc64() {
        return CoreUtils.clone(this.xMsContentCrc64);
    }

    /**
     * Set the xMsContentCrc64 property: The x-ms-content-crc64 property.
     *
     * @param xMsContentCrc64 the xMsContentCrc64 value to set.
     * @return the PageBlobsUploadPagesFromURLHeaders object itself.
     */
    public PageBlobsUploadPagesFromURLHeaders setXMsContentCrc64(byte[] xMsContentCrc64) {
        this.xMsContentCrc64 = CoreUtils.clone(xMsContentCrc64);
        return this;
    }

    /**
     * Get the xMsBlobSequenceNumber property: The x-ms-blob-sequence-number property.
     *
     * @return the xMsBlobSequenceNumber value.
     */
    public Long getXMsBlobSequenceNumber() {
        return this.xMsBlobSequenceNumber;
    }

    /**
     * Set the xMsBlobSequenceNumber property: The x-ms-blob-sequence-number property.
     *
     * @param xMsBlobSequenceNumber the xMsBlobSequenceNumber value to set.
     * @return the PageBlobsUploadPagesFromURLHeaders object itself.
     */
    public PageBlobsUploadPagesFromURLHeaders setXMsBlobSequenceNumber(Long xMsBlobSequenceNumber) {
        this.xMsBlobSequenceNumber = xMsBlobSequenceNumber;
        return this;
    }

    /**
     * Get the lastModified property: The Last-Modified property.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The Last-Modified property.
     *
     * @param lastModified the lastModified value to set.
     * @return the PageBlobsUploadPagesFromURLHeaders object itself.
     */
    public PageBlobsUploadPagesFromURLHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsEncryptionKeySha256 property: The x-ms-encryption-key-sha256 property.
     *
     * @return the xMsEncryptionKeySha256 value.
     */
    public String getXMsEncryptionKeySha256() {
        return this.xMsEncryptionKeySha256;
    }

    /**
     * Set the xMsEncryptionKeySha256 property: The x-ms-encryption-key-sha256 property.
     *
     * @param xMsEncryptionKeySha256 the xMsEncryptionKeySha256 value to set.
     * @return the PageBlobsUploadPagesFromURLHeaders object itself.
     */
    public PageBlobsUploadPagesFromURLHeaders setXMsEncryptionKeySha256(String xMsEncryptionKeySha256) {
        this.xMsEncryptionKeySha256 = xMsEncryptionKeySha256;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     *
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the PageBlobsUploadPagesFromURLHeaders object itself.
     */
    public PageBlobsUploadPagesFromURLHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsRequestServerEncrypted property: The x-ms-request-server-encrypted property.
     *
     * @return the xMsRequestServerEncrypted value.
     */
    public Boolean isXMsRequestServerEncrypted() {
        return this.xMsRequestServerEncrypted;
    }

    /**
     * Set the xMsRequestServerEncrypted property: The x-ms-request-server-encrypted property.
     *
     * @param xMsRequestServerEncrypted the xMsRequestServerEncrypted value to set.
     * @return the PageBlobsUploadPagesFromURLHeaders object itself.
     */
    public PageBlobsUploadPagesFromURLHeaders setXMsRequestServerEncrypted(Boolean xMsRequestServerEncrypted) {
        this.xMsRequestServerEncrypted = xMsRequestServerEncrypted;
        return this;
    }

    /**
     * Get the date property: The Date property.
     *
     * @return the date value.
     */
    public OffsetDateTime getDate() {
        if (this.date == null) {
            return null;
        }
        return this.date.getDateTime();
    }

    /**
     * Set the date property: The Date property.
     *
     * @param date the date value to set.
     * @return the PageBlobsUploadPagesFromURLHeaders object itself.
     */
    public PageBlobsUploadPagesFromURLHeaders setDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }

    /**
     * Get the contentMD5 property: The Content-MD5 property.
     *
     * @return the contentMD5 value.
     */
    public byte[] getContentMD5() {
        return CoreUtils.clone(this.contentMD5);
    }

    /**
     * Set the contentMD5 property: The Content-MD5 property.
     *
     * @param contentMD5 the contentMD5 value to set.
     * @return the PageBlobsUploadPagesFromURLHeaders object itself.
     */
    public PageBlobsUploadPagesFromURLHeaders setContentMD5(byte[] contentMD5) {
        this.contentMD5 = CoreUtils.clone(contentMD5);
        return this;
    }

    /**
     * Get the xMsEncryptionScope property: The x-ms-encryption-scope property.
     *
     * @return the xMsEncryptionScope value.
     */
    public String getXMsEncryptionScope() {
        return this.xMsEncryptionScope;
    }

    /**
     * Set the xMsEncryptionScope property: The x-ms-encryption-scope property.
     *
     * @param xMsEncryptionScope the xMsEncryptionScope value to set.
     * @return the PageBlobsUploadPagesFromURLHeaders object itself.
     */
    public PageBlobsUploadPagesFromURLHeaders setXMsEncryptionScope(String xMsEncryptionScope) {
        this.xMsEncryptionScope = xMsEncryptionScope;
        return this;
    }
}
