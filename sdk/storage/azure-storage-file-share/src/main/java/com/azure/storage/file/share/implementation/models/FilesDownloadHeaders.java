// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.HeaderCollection;
import com.azure.core.http.HttpHeader;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.storage.file.share.models.CopyStatusType;
import com.azure.storage.file.share.models.LeaseDurationType;
import com.azure.storage.file.share.models.LeaseStateType;
import com.azure.storage.file.share.models.LeaseStatusType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/** The FilesDownloadHeaders model. */
@JacksonXmlRootElement(localName = "null")
@Fluent
public final class FilesDownloadHeaders {
    /*
     * The x-ms-file-id property.
     */
    @JsonProperty(value = "x-ms-file-id")
    private String xMsFileId;

    /*
     * The x-ms-lease-status property.
     */
    @JsonProperty(value = "x-ms-lease-status")
    private LeaseStatusType xMsLeaseStatus;

    /*
     * The x-ms-file-creation-time property.
     */
    @JsonProperty(value = "x-ms-file-creation-time")
    private OffsetDateTime xMsFileCreationTime;

    /*
     * The Content-Range property.
     */
    @JsonProperty(value = "Content-Range")
    private String contentRange;

    /*
     * The x-ms-lease-state property.
     */
    @JsonProperty(value = "x-ms-lease-state")
    private LeaseStateType xMsLeaseState;

    /*
     * The x-ms-content-md5 property.
     */
    @JsonProperty(value = "x-ms-content-md5")
    private byte[] xMsContentMd5;

    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-file-attributes property.
     */
    @JsonProperty(value = "x-ms-file-attributes")
    private String xMsFileAttributes;

    /*
     * The Content-Encoding property.
     */
    @JsonProperty(value = "Content-Encoding")
    private String contentEncoding;

    /*
     * The x-ms-copy-status-description property.
     */
    @JsonProperty(value = "x-ms-copy-status-description")
    private String xMsCopyStatusDescription;

    /*
     * The x-ms-lease-duration property.
     */
    @JsonProperty(value = "x-ms-lease-duration")
    private LeaseDurationType xMsLeaseDuration;

    /*
     * The Content-Length property.
     */
    @JsonProperty(value = "Content-Length")
    private Long contentLength;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The Content-Type property.
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The x-ms-file-permission-key property.
     */
    @JsonProperty(value = "x-ms-file-permission-key")
    private String xMsFilePermissionKey;

    /*
     * The x-ms-copy-id property.
     */
    @JsonProperty(value = "x-ms-copy-id")
    private String xMsCopyId;

    /*
     * The x-ms-copy-source property.
     */
    @JsonProperty(value = "x-ms-copy-source")
    private String xMsCopySource;

    /*
     * The x-ms-copy-progress property.
     */
    @JsonProperty(value = "x-ms-copy-progress")
    private String xMsCopyProgress;

    /*
     * The x-ms-meta- property.
     */
    @HeaderCollection("x-ms-meta-")
    private Map<String, String> xMsMeta;

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
     * The Accept-Ranges property.
     */
    @JsonProperty(value = "Accept-Ranges")
    private String acceptRanges;

    /*
     * The x-ms-copy-completion-time property.
     */
    @JsonProperty(value = "x-ms-copy-completion-time")
    private DateTimeRfc1123 xMsCopyCompletionTime;

    /*
     * The x-ms-server-encrypted property.
     */
    @JsonProperty(value = "x-ms-server-encrypted")
    private Boolean xMsServerEncrypted;

    /*
     * The Cache-Control property.
     */
    @JsonProperty(value = "Cache-Control")
    private String cacheControl;

    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The Content-Disposition property.
     */
    @JsonProperty(value = "Content-Disposition")
    private String contentDisposition;

    /*
     * The x-ms-file-change-time property.
     */
    @JsonProperty(value = "x-ms-file-change-time")
    private OffsetDateTime xMsFileChangeTime;

    /*
     * The x-ms-file-parent-id property.
     */
    @JsonProperty(value = "x-ms-file-parent-id")
    private String xMsFileParentId;

    /*
     * The x-ms-copy-status property.
     */
    @JsonProperty(value = "x-ms-copy-status")
    private CopyStatusType xMsCopyStatus;

    /*
     * The Content-Language property.
     */
    @JsonProperty(value = "Content-Language")
    private String contentLanguage;

    /*
     * The x-ms-file-last-write-time property.
     */
    @JsonProperty(value = "x-ms-file-last-write-time")
    private OffsetDateTime xMsFileLastWriteTime;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of FilesDownloadHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public FilesDownloadHeaders(HttpHeaders rawHeaders) {
        this.xMsFileId = rawHeaders.getValue("x-ms-file-id");
        String xMsLeaseStatus = rawHeaders.getValue("x-ms-lease-status");
        if (xMsLeaseStatus != null) {
            this.xMsLeaseStatus = LeaseStatusType.fromString(xMsLeaseStatus);
        }
        String xMsFileCreationTime = rawHeaders.getValue("x-ms-file-creation-time");
        if (xMsFileCreationTime != null) {
            this.xMsFileCreationTime = OffsetDateTime.parse(xMsFileCreationTime);
        }
        this.contentRange = rawHeaders.getValue("Content-Range");
        String xMsLeaseState = rawHeaders.getValue("x-ms-lease-state");
        if (xMsLeaseState != null) {
            this.xMsLeaseState = LeaseStateType.fromString(xMsLeaseState);
        }
        String xMsContentMd5 = rawHeaders.getValue("x-ms-content-md5");
        if (xMsContentMd5 != null) {
            this.xMsContentMd5 = Base64.getDecoder().decode(xMsContentMd5);
        }
        String lastModified = rawHeaders.getValue("Last-Modified");
        if (lastModified != null) {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        this.xMsFileAttributes = rawHeaders.getValue("x-ms-file-attributes");
        this.contentEncoding = rawHeaders.getValue("Content-Encoding");
        this.xMsCopyStatusDescription = rawHeaders.getValue("x-ms-copy-status-description");
        String xMsLeaseDuration = rawHeaders.getValue("x-ms-lease-duration");
        if (xMsLeaseDuration != null) {
            this.xMsLeaseDuration = LeaseDurationType.fromString(xMsLeaseDuration);
        }
        String contentLength = rawHeaders.getValue("Content-Length");
        if (contentLength != null) {
            this.contentLength = Long.parseLong(contentLength);
        }
        this.xMsRequestId = rawHeaders.getValue("x-ms-request-id");
        this.contentType = rawHeaders.getValue("Content-Type");
        this.xMsVersion = rawHeaders.getValue("x-ms-version");
        this.xMsFilePermissionKey = rawHeaders.getValue("x-ms-file-permission-key");
        this.xMsCopyId = rawHeaders.getValue("x-ms-copy-id");
        this.xMsCopySource = rawHeaders.getValue("x-ms-copy-source");
        this.xMsCopyProgress = rawHeaders.getValue("x-ms-copy-progress");
        String date = rawHeaders.getValue("Date");
        if (date != null) {
            this.date = new DateTimeRfc1123(date);
        }
        String contentMD5 = rawHeaders.getValue("Content-MD5");
        if (contentMD5 != null) {
            this.contentMD5 = Base64.getDecoder().decode(contentMD5);
        }
        this.acceptRanges = rawHeaders.getValue("Accept-Ranges");
        String xMsCopyCompletionTime = rawHeaders.getValue("x-ms-copy-completion-time");
        if (xMsCopyCompletionTime != null) {
            this.xMsCopyCompletionTime = new DateTimeRfc1123(xMsCopyCompletionTime);
        }
        String xMsServerEncrypted = rawHeaders.getValue("x-ms-server-encrypted");
        if (xMsServerEncrypted != null) {
            this.xMsServerEncrypted = Boolean.parseBoolean(xMsServerEncrypted);
        }
        this.cacheControl = rawHeaders.getValue("Cache-Control");
        this.eTag = rawHeaders.getValue("ETag");
        this.contentDisposition = rawHeaders.getValue("Content-Disposition");
        String xMsFileChangeTime = rawHeaders.getValue("x-ms-file-change-time");
        if (xMsFileChangeTime != null) {
            this.xMsFileChangeTime = OffsetDateTime.parse(xMsFileChangeTime);
        }
        this.xMsFileParentId = rawHeaders.getValue("x-ms-file-parent-id");
        String xMsCopyStatus = rawHeaders.getValue("x-ms-copy-status");
        if (xMsCopyStatus != null) {
            this.xMsCopyStatus = CopyStatusType.fromString(xMsCopyStatus);
        }
        this.contentLanguage = rawHeaders.getValue("Content-Language");
        String xMsFileLastWriteTime = rawHeaders.getValue("x-ms-file-last-write-time");
        if (xMsFileLastWriteTime != null) {
            this.xMsFileLastWriteTime = OffsetDateTime.parse(xMsFileLastWriteTime);
        }
        Map<String, String> xMsMetaHeaderCollection = new HashMap<>();

        for (HttpHeader header : rawHeaders) {
            String headerName = header.getName();
            if (headerName.startsWith("x-ms-meta-")) {
                xMsMetaHeaderCollection.put(headerName.substring(10), header.getValue());
            }
        }

        this.xMsMeta = xMsMetaHeaderCollection;
    }

    /**
     * Get the xMsFileId property: The x-ms-file-id property.
     *
     * @return the xMsFileId value.
     */
    public String getXMsFileId() {
        return this.xMsFileId;
    }

    /**
     * Set the xMsFileId property: The x-ms-file-id property.
     *
     * @param xMsFileId the xMsFileId value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsFileId(String xMsFileId) {
        this.xMsFileId = xMsFileId;
        return this;
    }

    /**
     * Get the xMsLeaseStatus property: The x-ms-lease-status property.
     *
     * @return the xMsLeaseStatus value.
     */
    public LeaseStatusType getXMsLeaseStatus() {
        return this.xMsLeaseStatus;
    }

    /**
     * Set the xMsLeaseStatus property: The x-ms-lease-status property.
     *
     * @param xMsLeaseStatus the xMsLeaseStatus value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsLeaseStatus(LeaseStatusType xMsLeaseStatus) {
        this.xMsLeaseStatus = xMsLeaseStatus;
        return this;
    }

    /**
     * Get the xMsFileCreationTime property: The x-ms-file-creation-time property.
     *
     * @return the xMsFileCreationTime value.
     */
    public OffsetDateTime getXMsFileCreationTime() {
        return this.xMsFileCreationTime;
    }

    /**
     * Set the xMsFileCreationTime property: The x-ms-file-creation-time property.
     *
     * @param xMsFileCreationTime the xMsFileCreationTime value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsFileCreationTime(OffsetDateTime xMsFileCreationTime) {
        this.xMsFileCreationTime = xMsFileCreationTime;
        return this;
    }

    /**
     * Get the contentRange property: The Content-Range property.
     *
     * @return the contentRange value.
     */
    public String getContentRange() {
        return this.contentRange;
    }

    /**
     * Set the contentRange property: The Content-Range property.
     *
     * @param contentRange the contentRange value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setContentRange(String contentRange) {
        this.contentRange = contentRange;
        return this;
    }

    /**
     * Get the xMsLeaseState property: The x-ms-lease-state property.
     *
     * @return the xMsLeaseState value.
     */
    public LeaseStateType getXMsLeaseState() {
        return this.xMsLeaseState;
    }

    /**
     * Set the xMsLeaseState property: The x-ms-lease-state property.
     *
     * @param xMsLeaseState the xMsLeaseState value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsLeaseState(LeaseStateType xMsLeaseState) {
        this.xMsLeaseState = xMsLeaseState;
        return this;
    }

    /**
     * Get the xMsContentMd5 property: The x-ms-content-md5 property.
     *
     * @return the xMsContentMd5 value.
     */
    public byte[] getXMsContentMd5() {
        return CoreUtils.clone(this.xMsContentMd5);
    }

    /**
     * Set the xMsContentMd5 property: The x-ms-content-md5 property.
     *
     * @param xMsContentMd5 the xMsContentMd5 value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsContentMd5(byte[] xMsContentMd5) {
        this.xMsContentMd5 = CoreUtils.clone(xMsContentMd5);
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
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsFileAttributes property: The x-ms-file-attributes property.
     *
     * @return the xMsFileAttributes value.
     */
    public String getXMsFileAttributes() {
        return this.xMsFileAttributes;
    }

    /**
     * Set the xMsFileAttributes property: The x-ms-file-attributes property.
     *
     * @param xMsFileAttributes the xMsFileAttributes value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsFileAttributes(String xMsFileAttributes) {
        this.xMsFileAttributes = xMsFileAttributes;
        return this;
    }

    /**
     * Get the contentEncoding property: The Content-Encoding property.
     *
     * @return the contentEncoding value.
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding property: The Content-Encoding property.
     *
     * @param contentEncoding the contentEncoding value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the xMsCopyStatusDescription property: The x-ms-copy-status-description property.
     *
     * @return the xMsCopyStatusDescription value.
     */
    public String getXMsCopyStatusDescription() {
        return this.xMsCopyStatusDescription;
    }

    /**
     * Set the xMsCopyStatusDescription property: The x-ms-copy-status-description property.
     *
     * @param xMsCopyStatusDescription the xMsCopyStatusDescription value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsCopyStatusDescription(String xMsCopyStatusDescription) {
        this.xMsCopyStatusDescription = xMsCopyStatusDescription;
        return this;
    }

    /**
     * Get the xMsLeaseDuration property: The x-ms-lease-duration property.
     *
     * @return the xMsLeaseDuration value.
     */
    public LeaseDurationType getXMsLeaseDuration() {
        return this.xMsLeaseDuration;
    }

    /**
     * Set the xMsLeaseDuration property: The x-ms-lease-duration property.
     *
     * @param xMsLeaseDuration the xMsLeaseDuration value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsLeaseDuration(LeaseDurationType xMsLeaseDuration) {
        this.xMsLeaseDuration = xMsLeaseDuration;
        return this;
    }

    /**
     * Get the contentLength property: The Content-Length property.
     *
     * @return the contentLength value.
     */
    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: The Content-Length property.
     *
     * @param contentLength the contentLength value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setContentLength(Long contentLength) {
        this.contentLength = contentLength;
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
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the contentType property: The Content-Type property.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The Content-Type property.
     *
     * @param contentType the contentType value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setContentType(String contentType) {
        this.contentType = contentType;
        return this;
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
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsFilePermissionKey property: The x-ms-file-permission-key property.
     *
     * @return the xMsFilePermissionKey value.
     */
    public String getXMsFilePermissionKey() {
        return this.xMsFilePermissionKey;
    }

    /**
     * Set the xMsFilePermissionKey property: The x-ms-file-permission-key property.
     *
     * @param xMsFilePermissionKey the xMsFilePermissionKey value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsFilePermissionKey(String xMsFilePermissionKey) {
        this.xMsFilePermissionKey = xMsFilePermissionKey;
        return this;
    }

    /**
     * Get the xMsCopyId property: The x-ms-copy-id property.
     *
     * @return the xMsCopyId value.
     */
    public String getXMsCopyId() {
        return this.xMsCopyId;
    }

    /**
     * Set the xMsCopyId property: The x-ms-copy-id property.
     *
     * @param xMsCopyId the xMsCopyId value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsCopyId(String xMsCopyId) {
        this.xMsCopyId = xMsCopyId;
        return this;
    }

    /**
     * Get the xMsCopySource property: The x-ms-copy-source property.
     *
     * @return the xMsCopySource value.
     */
    public String getXMsCopySource() {
        return this.xMsCopySource;
    }

    /**
     * Set the xMsCopySource property: The x-ms-copy-source property.
     *
     * @param xMsCopySource the xMsCopySource value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsCopySource(String xMsCopySource) {
        this.xMsCopySource = xMsCopySource;
        return this;
    }

    /**
     * Get the xMsCopyProgress property: The x-ms-copy-progress property.
     *
     * @return the xMsCopyProgress value.
     */
    public String getXMsCopyProgress() {
        return this.xMsCopyProgress;
    }

    /**
     * Set the xMsCopyProgress property: The x-ms-copy-progress property.
     *
     * @param xMsCopyProgress the xMsCopyProgress value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsCopyProgress(String xMsCopyProgress) {
        this.xMsCopyProgress = xMsCopyProgress;
        return this;
    }

    /**
     * Get the xMsMeta property: The x-ms-meta- property.
     *
     * @return the xMsMeta value.
     */
    public Map<String, String> getXMsMeta() {
        return this.xMsMeta;
    }

    /**
     * Set the xMsMeta property: The x-ms-meta- property.
     *
     * @param xMsMeta the xMsMeta value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsMeta(Map<String, String> xMsMeta) {
        this.xMsMeta = xMsMeta;
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
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setDate(OffsetDateTime date) {
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
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setContentMD5(byte[] contentMD5) {
        this.contentMD5 = CoreUtils.clone(contentMD5);
        return this;
    }

    /**
     * Get the acceptRanges property: The Accept-Ranges property.
     *
     * @return the acceptRanges value.
     */
    public String getAcceptRanges() {
        return this.acceptRanges;
    }

    /**
     * Set the acceptRanges property: The Accept-Ranges property.
     *
     * @param acceptRanges the acceptRanges value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setAcceptRanges(String acceptRanges) {
        this.acceptRanges = acceptRanges;
        return this;
    }

    /**
     * Get the xMsCopyCompletionTime property: The x-ms-copy-completion-time property.
     *
     * @return the xMsCopyCompletionTime value.
     */
    public OffsetDateTime getXMsCopyCompletionTime() {
        if (this.xMsCopyCompletionTime == null) {
            return null;
        }
        return this.xMsCopyCompletionTime.getDateTime();
    }

    /**
     * Set the xMsCopyCompletionTime property: The x-ms-copy-completion-time property.
     *
     * @param xMsCopyCompletionTime the xMsCopyCompletionTime value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsCopyCompletionTime(OffsetDateTime xMsCopyCompletionTime) {
        if (xMsCopyCompletionTime == null) {
            this.xMsCopyCompletionTime = null;
        } else {
            this.xMsCopyCompletionTime = new DateTimeRfc1123(xMsCopyCompletionTime);
        }
        return this;
    }

    /**
     * Get the xMsServerEncrypted property: The x-ms-server-encrypted property.
     *
     * @return the xMsServerEncrypted value.
     */
    public Boolean isXMsServerEncrypted() {
        return this.xMsServerEncrypted;
    }

    /**
     * Set the xMsServerEncrypted property: The x-ms-server-encrypted property.
     *
     * @param xMsServerEncrypted the xMsServerEncrypted value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsServerEncrypted(Boolean xMsServerEncrypted) {
        this.xMsServerEncrypted = xMsServerEncrypted;
        return this;
    }

    /**
     * Get the cacheControl property: The Cache-Control property.
     *
     * @return the cacheControl value.
     */
    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * Set the cacheControl property: The Cache-Control property.
     *
     * @param cacheControl the cacheControl value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
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
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the contentDisposition property: The Content-Disposition property.
     *
     * @return the contentDisposition value.
     */
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition property: The Content-Disposition property.
     *
     * @param contentDisposition the contentDisposition value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get the xMsFileChangeTime property: The x-ms-file-change-time property.
     *
     * @return the xMsFileChangeTime value.
     */
    public OffsetDateTime getXMsFileChangeTime() {
        return this.xMsFileChangeTime;
    }

    /**
     * Set the xMsFileChangeTime property: The x-ms-file-change-time property.
     *
     * @param xMsFileChangeTime the xMsFileChangeTime value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsFileChangeTime(OffsetDateTime xMsFileChangeTime) {
        this.xMsFileChangeTime = xMsFileChangeTime;
        return this;
    }

    /**
     * Get the xMsFileParentId property: The x-ms-file-parent-id property.
     *
     * @return the xMsFileParentId value.
     */
    public String getXMsFileParentId() {
        return this.xMsFileParentId;
    }

    /**
     * Set the xMsFileParentId property: The x-ms-file-parent-id property.
     *
     * @param xMsFileParentId the xMsFileParentId value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsFileParentId(String xMsFileParentId) {
        this.xMsFileParentId = xMsFileParentId;
        return this;
    }

    /**
     * Get the xMsCopyStatus property: The x-ms-copy-status property.
     *
     * @return the xMsCopyStatus value.
     */
    public CopyStatusType getXMsCopyStatus() {
        return this.xMsCopyStatus;
    }

    /**
     * Set the xMsCopyStatus property: The x-ms-copy-status property.
     *
     * @param xMsCopyStatus the xMsCopyStatus value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsCopyStatus(CopyStatusType xMsCopyStatus) {
        this.xMsCopyStatus = xMsCopyStatus;
        return this;
    }

    /**
     * Get the contentLanguage property: The Content-Language property.
     *
     * @return the contentLanguage value.
     */
    public String getContentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Set the contentLanguage property: The Content-Language property.
     *
     * @param contentLanguage the contentLanguage value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * Get the xMsFileLastWriteTime property: The x-ms-file-last-write-time property.
     *
     * @return the xMsFileLastWriteTime value.
     */
    public OffsetDateTime getXMsFileLastWriteTime() {
        return this.xMsFileLastWriteTime;
    }

    /**
     * Set the xMsFileLastWriteTime property: The x-ms-file-last-write-time property.
     *
     * @param xMsFileLastWriteTime the xMsFileLastWriteTime value to set.
     * @return the FilesDownloadHeaders object itself.
     */
    public FilesDownloadHeaders setXMsFileLastWriteTime(OffsetDateTime xMsFileLastWriteTime) {
        this.xMsFileLastWriteTime = xMsFileLastWriteTime;
        return this;
    }
}
