// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The updatable properties of the AutonomousDatabase.
 */
@Fluent
public final class AutonomousDatabaseUpdateProperties {
    /*
     * Admin password.
     */
    @JsonProperty(value = "adminPassword")
    private String adminPassword;

    /*
     * The maintenance schedule type of the Autonomous Database Serverless.
     */
    @JsonProperty(value = "autonomousMaintenanceScheduleType")
    private AutonomousMaintenanceScheduleType autonomousMaintenanceScheduleType;

    /*
     * The compute amount (CPUs) available to the database.
     */
    @JsonProperty(value = "computeCount")
    private Float computeCount;

    /*
     * The number of CPU cores to be made available to the database.
     */
    @JsonProperty(value = "cpuCoreCount")
    private Integer cpuCoreCount;

    /*
     * Customer Contacts.
     */
    @JsonProperty(value = "customerContacts")
    private List<CustomerContact> customerContacts;

    /*
     * The quantity of data in the database, in terabytes.
     */
    @JsonProperty(value = "dataStorageSizeInTbs")
    private Integer dataStorageSizeInTbs;

    /*
     * The size, in gigabytes, of the data volume that will be created and attached to the database.
     */
    @JsonProperty(value = "dataStorageSizeInGbs")
    private Integer dataStorageSizeInGbs;

    /*
     * The user-friendly name for the Autonomous Database.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Indicates if auto scaling is enabled for the Autonomous Database CPU core count.
     */
    @JsonProperty(value = "isAutoScalingEnabled")
    private Boolean isAutoScalingEnabled;

    /*
     * Indicates if auto scaling is enabled for the Autonomous Database storage.
     */
    @JsonProperty(value = "isAutoScalingForStorageEnabled")
    private Boolean isAutoScalingForStorageEnabled;

    /*
     * The database OCID of the Disaster Recovery peer database, which is located in a different region from the current peer database.
     */
    @JsonProperty(value = "peerDbId")
    private String peerDbId;

    /*
     * Indicates whether the Autonomous Database has local or called in-region Data Guard enabled.
     */
    @JsonProperty(value = "isLocalDataGuardEnabled")
    private Boolean isLocalDataGuardEnabled;

    /*
     * Specifies if the Autonomous Database requires mTLS connections.
     */
    @JsonProperty(value = "isMtlsConnectionRequired")
    private Boolean isMtlsConnectionRequired;

    /*
     * The Oracle license model that applies to the Oracle Autonomous Database. The default is LICENSE_INCLUDED.
     */
    @JsonProperty(value = "licenseModel")
    private LicenseModel licenseModel;

    /*
     * The list of scheduled operations.
     */
    @JsonProperty(value = "scheduledOperations")
    private ScheduledOperationsTypeUpdate scheduledOperations;

    /*
     * The Oracle Database Edition that applies to the Autonomous databases.
     */
    @JsonProperty(value = "databaseEdition")
    private DatabaseEditionType databaseEdition;

    /*
     * Parameter that allows users to select an acceptable maximum data loss limit in seconds, up to which Automatic Failover will be triggered when necessary for a Local Autonomous Data Guard
     */
    @JsonProperty(value = "localAdgAutoFailoverMaxDataLossLimit")
    private Integer localAdgAutoFailoverMaxDataLossLimit;

    /*
     * Indicates the Autonomous Database mode.
     */
    @JsonProperty(value = "openMode")
    private OpenModeType openMode;

    /*
     * The Autonomous Database permission level.
     */
    @JsonProperty(value = "permissionLevel")
    private PermissionLevelType permissionLevel;

    /*
     * The Data Guard role of the Autonomous Container Database or Autonomous Database, if Autonomous Data Guard is enabled.
     */
    @JsonProperty(value = "role")
    private RoleType role;

    /*
     * Retention period, in days, for long-term backups
     */
    @JsonProperty(value = "backupRetentionPeriodInDays")
    private Integer backupRetentionPeriodInDays;

    /*
     * The client IP access control list (ACL). This is an array of CIDR notations and/or IP addresses. Values should be separate strings, separated by commas. Example: ['1.1.1.1','1.1.1.0/24','1.1.2.25']
     */
    @JsonProperty(value = "whitelistedIps")
    private List<String> whitelistedIps;

    /**
     * Creates an instance of AutonomousDatabaseUpdateProperties class.
     */
    public AutonomousDatabaseUpdateProperties() {
    }

    /**
     * Get the adminPassword property: Admin password.
     * 
     * @return the adminPassword value.
     */
    public String adminPassword() {
        return this.adminPassword;
    }

    /**
     * Set the adminPassword property: Admin password.
     * 
     * @param adminPassword the adminPassword value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties withAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
        return this;
    }

    /**
     * Get the autonomousMaintenanceScheduleType property: The maintenance schedule type of the Autonomous Database
     * Serverless.
     * 
     * @return the autonomousMaintenanceScheduleType value.
     */
    public AutonomousMaintenanceScheduleType autonomousMaintenanceScheduleType() {
        return this.autonomousMaintenanceScheduleType;
    }

    /**
     * Set the autonomousMaintenanceScheduleType property: The maintenance schedule type of the Autonomous Database
     * Serverless.
     * 
     * @param autonomousMaintenanceScheduleType the autonomousMaintenanceScheduleType value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties
        withAutonomousMaintenanceScheduleType(AutonomousMaintenanceScheduleType autonomousMaintenanceScheduleType) {
        this.autonomousMaintenanceScheduleType = autonomousMaintenanceScheduleType;
        return this;
    }

    /**
     * Get the computeCount property: The compute amount (CPUs) available to the database.
     * 
     * @return the computeCount value.
     */
    public Float computeCount() {
        return this.computeCount;
    }

    /**
     * Set the computeCount property: The compute amount (CPUs) available to the database.
     * 
     * @param computeCount the computeCount value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties withComputeCount(Float computeCount) {
        this.computeCount = computeCount;
        return this;
    }

    /**
     * Get the cpuCoreCount property: The number of CPU cores to be made available to the database.
     * 
     * @return the cpuCoreCount value.
     */
    public Integer cpuCoreCount() {
        return this.cpuCoreCount;
    }

    /**
     * Set the cpuCoreCount property: The number of CPU cores to be made available to the database.
     * 
     * @param cpuCoreCount the cpuCoreCount value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties withCpuCoreCount(Integer cpuCoreCount) {
        this.cpuCoreCount = cpuCoreCount;
        return this;
    }

    /**
     * Get the customerContacts property: Customer Contacts.
     * 
     * @return the customerContacts value.
     */
    public List<CustomerContact> customerContacts() {
        return this.customerContacts;
    }

    /**
     * Set the customerContacts property: Customer Contacts.
     * 
     * @param customerContacts the customerContacts value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties withCustomerContacts(List<CustomerContact> customerContacts) {
        this.customerContacts = customerContacts;
        return this;
    }

    /**
     * Get the dataStorageSizeInTbs property: The quantity of data in the database, in terabytes.
     * 
     * @return the dataStorageSizeInTbs value.
     */
    public Integer dataStorageSizeInTbs() {
        return this.dataStorageSizeInTbs;
    }

    /**
     * Set the dataStorageSizeInTbs property: The quantity of data in the database, in terabytes.
     * 
     * @param dataStorageSizeInTbs the dataStorageSizeInTbs value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties withDataStorageSizeInTbs(Integer dataStorageSizeInTbs) {
        this.dataStorageSizeInTbs = dataStorageSizeInTbs;
        return this;
    }

    /**
     * Get the dataStorageSizeInGbs property: The size, in gigabytes, of the data volume that will be created and
     * attached to the database.
     * 
     * @return the dataStorageSizeInGbs value.
     */
    public Integer dataStorageSizeInGbs() {
        return this.dataStorageSizeInGbs;
    }

    /**
     * Set the dataStorageSizeInGbs property: The size, in gigabytes, of the data volume that will be created and
     * attached to the database.
     * 
     * @param dataStorageSizeInGbs the dataStorageSizeInGbs value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties withDataStorageSizeInGbs(Integer dataStorageSizeInGbs) {
        this.dataStorageSizeInGbs = dataStorageSizeInGbs;
        return this;
    }

    /**
     * Get the displayName property: The user-friendly name for the Autonomous Database.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The user-friendly name for the Autonomous Database.
     * 
     * @param displayName the displayName value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the isAutoScalingEnabled property: Indicates if auto scaling is enabled for the Autonomous Database CPU core
     * count.
     * 
     * @return the isAutoScalingEnabled value.
     */
    public Boolean isAutoScalingEnabled() {
        return this.isAutoScalingEnabled;
    }

    /**
     * Set the isAutoScalingEnabled property: Indicates if auto scaling is enabled for the Autonomous Database CPU core
     * count.
     * 
     * @param isAutoScalingEnabled the isAutoScalingEnabled value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties withIsAutoScalingEnabled(Boolean isAutoScalingEnabled) {
        this.isAutoScalingEnabled = isAutoScalingEnabled;
        return this;
    }

    /**
     * Get the isAutoScalingForStorageEnabled property: Indicates if auto scaling is enabled for the Autonomous Database
     * storage.
     * 
     * @return the isAutoScalingForStorageEnabled value.
     */
    public Boolean isAutoScalingForStorageEnabled() {
        return this.isAutoScalingForStorageEnabled;
    }

    /**
     * Set the isAutoScalingForStorageEnabled property: Indicates if auto scaling is enabled for the Autonomous Database
     * storage.
     * 
     * @param isAutoScalingForStorageEnabled the isAutoScalingForStorageEnabled value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties
        withIsAutoScalingForStorageEnabled(Boolean isAutoScalingForStorageEnabled) {
        this.isAutoScalingForStorageEnabled = isAutoScalingForStorageEnabled;
        return this;
    }

    /**
     * Get the peerDbId property: The database OCID of the Disaster Recovery peer database, which is located in a
     * different region from the current peer database.
     * 
     * @return the peerDbId value.
     */
    public String peerDbId() {
        return this.peerDbId;
    }

    /**
     * Set the peerDbId property: The database OCID of the Disaster Recovery peer database, which is located in a
     * different region from the current peer database.
     * 
     * @param peerDbId the peerDbId value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties withPeerDbId(String peerDbId) {
        this.peerDbId = peerDbId;
        return this;
    }

    /**
     * Get the isLocalDataGuardEnabled property: Indicates whether the Autonomous Database has local or called in-region
     * Data Guard enabled.
     * 
     * @return the isLocalDataGuardEnabled value.
     */
    public Boolean isLocalDataGuardEnabled() {
        return this.isLocalDataGuardEnabled;
    }

    /**
     * Set the isLocalDataGuardEnabled property: Indicates whether the Autonomous Database has local or called in-region
     * Data Guard enabled.
     * 
     * @param isLocalDataGuardEnabled the isLocalDataGuardEnabled value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties withIsLocalDataGuardEnabled(Boolean isLocalDataGuardEnabled) {
        this.isLocalDataGuardEnabled = isLocalDataGuardEnabled;
        return this;
    }

    /**
     * Get the isMtlsConnectionRequired property: Specifies if the Autonomous Database requires mTLS connections.
     * 
     * @return the isMtlsConnectionRequired value.
     */
    public Boolean isMtlsConnectionRequired() {
        return this.isMtlsConnectionRequired;
    }

    /**
     * Set the isMtlsConnectionRequired property: Specifies if the Autonomous Database requires mTLS connections.
     * 
     * @param isMtlsConnectionRequired the isMtlsConnectionRequired value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties withIsMtlsConnectionRequired(Boolean isMtlsConnectionRequired) {
        this.isMtlsConnectionRequired = isMtlsConnectionRequired;
        return this;
    }

    /**
     * Get the licenseModel property: The Oracle license model that applies to the Oracle Autonomous Database. The
     * default is LICENSE_INCLUDED.
     * 
     * @return the licenseModel value.
     */
    public LicenseModel licenseModel() {
        return this.licenseModel;
    }

    /**
     * Set the licenseModel property: The Oracle license model that applies to the Oracle Autonomous Database. The
     * default is LICENSE_INCLUDED.
     * 
     * @param licenseModel the licenseModel value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties withLicenseModel(LicenseModel licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * Get the scheduledOperations property: The list of scheduled operations.
     * 
     * @return the scheduledOperations value.
     */
    public ScheduledOperationsTypeUpdate scheduledOperations() {
        return this.scheduledOperations;
    }

    /**
     * Set the scheduledOperations property: The list of scheduled operations.
     * 
     * @param scheduledOperations the scheduledOperations value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties
        withScheduledOperations(ScheduledOperationsTypeUpdate scheduledOperations) {
        this.scheduledOperations = scheduledOperations;
        return this;
    }

    /**
     * Get the databaseEdition property: The Oracle Database Edition that applies to the Autonomous databases.
     * 
     * @return the databaseEdition value.
     */
    public DatabaseEditionType databaseEdition() {
        return this.databaseEdition;
    }

    /**
     * Set the databaseEdition property: The Oracle Database Edition that applies to the Autonomous databases.
     * 
     * @param databaseEdition the databaseEdition value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties withDatabaseEdition(DatabaseEditionType databaseEdition) {
        this.databaseEdition = databaseEdition;
        return this;
    }

    /**
     * Get the localAdgAutoFailoverMaxDataLossLimit property: Parameter that allows users to select an acceptable
     * maximum data loss limit in seconds, up to which Automatic Failover will be triggered when necessary for a Local
     * Autonomous Data Guard.
     * 
     * @return the localAdgAutoFailoverMaxDataLossLimit value.
     */
    public Integer localAdgAutoFailoverMaxDataLossLimit() {
        return this.localAdgAutoFailoverMaxDataLossLimit;
    }

    /**
     * Set the localAdgAutoFailoverMaxDataLossLimit property: Parameter that allows users to select an acceptable
     * maximum data loss limit in seconds, up to which Automatic Failover will be triggered when necessary for a Local
     * Autonomous Data Guard.
     * 
     * @param localAdgAutoFailoverMaxDataLossLimit the localAdgAutoFailoverMaxDataLossLimit value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties
        withLocalAdgAutoFailoverMaxDataLossLimit(Integer localAdgAutoFailoverMaxDataLossLimit) {
        this.localAdgAutoFailoverMaxDataLossLimit = localAdgAutoFailoverMaxDataLossLimit;
        return this;
    }

    /**
     * Get the openMode property: Indicates the Autonomous Database mode.
     * 
     * @return the openMode value.
     */
    public OpenModeType openMode() {
        return this.openMode;
    }

    /**
     * Set the openMode property: Indicates the Autonomous Database mode.
     * 
     * @param openMode the openMode value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties withOpenMode(OpenModeType openMode) {
        this.openMode = openMode;
        return this;
    }

    /**
     * Get the permissionLevel property: The Autonomous Database permission level.
     * 
     * @return the permissionLevel value.
     */
    public PermissionLevelType permissionLevel() {
        return this.permissionLevel;
    }

    /**
     * Set the permissionLevel property: The Autonomous Database permission level.
     * 
     * @param permissionLevel the permissionLevel value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties withPermissionLevel(PermissionLevelType permissionLevel) {
        this.permissionLevel = permissionLevel;
        return this;
    }

    /**
     * Get the role property: The Data Guard role of the Autonomous Container Database or Autonomous Database, if
     * Autonomous Data Guard is enabled.
     * 
     * @return the role value.
     */
    public RoleType role() {
        return this.role;
    }

    /**
     * Set the role property: The Data Guard role of the Autonomous Container Database or Autonomous Database, if
     * Autonomous Data Guard is enabled.
     * 
     * @param role the role value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties withRole(RoleType role) {
        this.role = role;
        return this;
    }

    /**
     * Get the backupRetentionPeriodInDays property: Retention period, in days, for long-term backups.
     * 
     * @return the backupRetentionPeriodInDays value.
     */
    public Integer backupRetentionPeriodInDays() {
        return this.backupRetentionPeriodInDays;
    }

    /**
     * Set the backupRetentionPeriodInDays property: Retention period, in days, for long-term backups.
     * 
     * @param backupRetentionPeriodInDays the backupRetentionPeriodInDays value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties withBackupRetentionPeriodInDays(Integer backupRetentionPeriodInDays) {
        this.backupRetentionPeriodInDays = backupRetentionPeriodInDays;
        return this;
    }

    /**
     * Get the whitelistedIps property: The client IP access control list (ACL). This is an array of CIDR notations
     * and/or IP addresses. Values should be separate strings, separated by commas. Example:
     * ['1.1.1.1','1.1.1.0/24','1.1.2.25'].
     * 
     * @return the whitelistedIps value.
     */
    public List<String> whitelistedIps() {
        return this.whitelistedIps;
    }

    /**
     * Set the whitelistedIps property: The client IP access control list (ACL). This is an array of CIDR notations
     * and/or IP addresses. Values should be separate strings, separated by commas. Example:
     * ['1.1.1.1','1.1.1.0/24','1.1.2.25'].
     * 
     * @param whitelistedIps the whitelistedIps value to set.
     * @return the AutonomousDatabaseUpdateProperties object itself.
     */
    public AutonomousDatabaseUpdateProperties withWhitelistedIps(List<String> whitelistedIps) {
        this.whitelistedIps = whitelistedIps;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (customerContacts() != null) {
            customerContacts().forEach(e -> e.validate());
        }
        if (scheduledOperations() != null) {
            scheduledOperations().validate();
        }
    }
}
