// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This class is used to send blob details after exporting jobs.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "objectType",
    defaultImpl = ExportJobsOperationResultInfo.class,
    visible = true)
@JsonTypeName("ExportJobsOperationResultInfo")
@Fluent
public final class ExportJobsOperationResultInfo extends OperationResultInfoBase {
    /*
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     */
    @JsonTypeId
    @JsonProperty(value = "objectType", required = true)
    private String objectType = "ExportJobsOperationResultInfo";

    /*
     * URL of the blob into which the serialized string of list of jobs is exported.
     */
    @JsonProperty(value = "blobUrl")
    private String blobUrl;

    /*
     * SAS key to access the blob. It expires in 15 mins.
     */
    @JsonProperty(value = "blobSasKey")
    private String blobSasKey;

    /*
     * URL of the blob into which the ExcelFile is uploaded.
     */
    @JsonProperty(value = "excelFileBlobUrl")
    private String excelFileBlobUrl;

    /*
     * SAS key to access the blob. It expires in 15 mins.
     */
    @JsonProperty(value = "excelFileBlobSasKey")
    private String excelFileBlobSasKey;

    /**
     * Creates an instance of ExportJobsOperationResultInfo class.
     */
    public ExportJobsOperationResultInfo() {
    }

    /**
     * Get the objectType property: This property will be used as the discriminator for deciding the specific types in
     * the polymorphic chain of types.
     * 
     * @return the objectType value.
     */
    @Override
    public String objectType() {
        return this.objectType;
    }

    /**
     * Get the blobUrl property: URL of the blob into which the serialized string of list of jobs is exported.
     * 
     * @return the blobUrl value.
     */
    public String blobUrl() {
        return this.blobUrl;
    }

    /**
     * Set the blobUrl property: URL of the blob into which the serialized string of list of jobs is exported.
     * 
     * @param blobUrl the blobUrl value to set.
     * @return the ExportJobsOperationResultInfo object itself.
     */
    public ExportJobsOperationResultInfo withBlobUrl(String blobUrl) {
        this.blobUrl = blobUrl;
        return this;
    }

    /**
     * Get the blobSasKey property: SAS key to access the blob. It expires in 15 mins.
     * 
     * @return the blobSasKey value.
     */
    public String blobSasKey() {
        return this.blobSasKey;
    }

    /**
     * Set the blobSasKey property: SAS key to access the blob. It expires in 15 mins.
     * 
     * @param blobSasKey the blobSasKey value to set.
     * @return the ExportJobsOperationResultInfo object itself.
     */
    public ExportJobsOperationResultInfo withBlobSasKey(String blobSasKey) {
        this.blobSasKey = blobSasKey;
        return this;
    }

    /**
     * Get the excelFileBlobUrl property: URL of the blob into which the ExcelFile is uploaded.
     * 
     * @return the excelFileBlobUrl value.
     */
    public String excelFileBlobUrl() {
        return this.excelFileBlobUrl;
    }

    /**
     * Set the excelFileBlobUrl property: URL of the blob into which the ExcelFile is uploaded.
     * 
     * @param excelFileBlobUrl the excelFileBlobUrl value to set.
     * @return the ExportJobsOperationResultInfo object itself.
     */
    public ExportJobsOperationResultInfo withExcelFileBlobUrl(String excelFileBlobUrl) {
        this.excelFileBlobUrl = excelFileBlobUrl;
        return this;
    }

    /**
     * Get the excelFileBlobSasKey property: SAS key to access the blob. It expires in 15 mins.
     * 
     * @return the excelFileBlobSasKey value.
     */
    public String excelFileBlobSasKey() {
        return this.excelFileBlobSasKey;
    }

    /**
     * Set the excelFileBlobSasKey property: SAS key to access the blob. It expires in 15 mins.
     * 
     * @param excelFileBlobSasKey the excelFileBlobSasKey value to set.
     * @return the ExportJobsOperationResultInfo object itself.
     */
    public ExportJobsOperationResultInfo withExcelFileBlobSasKey(String excelFileBlobSasKey) {
        this.excelFileBlobSasKey = excelFileBlobSasKey;
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
    }
}
