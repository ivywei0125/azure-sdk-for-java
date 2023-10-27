// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.netapp.models.CoolAccessRetrievalPolicy;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import com.azure.resourcemanager.netapp.models.SmbAccessBasedEnumeration;
import com.azure.resourcemanager.netapp.models.SmbNonBrowsable;
import com.azure.resourcemanager.netapp.models.VolumePatchPropertiesDataProtection;
import com.azure.resourcemanager.netapp.models.VolumePatchPropertiesExportPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Patchable volume properties. */
@Fluent
public final class VolumePatchProperties {
    /*
     * serviceLevel
     *
     * The service level of the file system
     */
    @JsonProperty(value = "serviceLevel")
    private ServiceLevel serviceLevel;

    /*
     * usageThreshold
     *
     * Maximum storage quota allowed for a file system in bytes. This is a soft quota used for alerting only. Minimum
     * size is 100 GiB. Upper limit is 100TiB, 500Tib for LargeVolume or 2400Tib for LargeVolume on exceptional basis.
     * Specified in bytes.
     */
    @JsonProperty(value = "usageThreshold")
    private Long usageThreshold;

    /*
     * exportPolicy
     *
     * Set of export policy rules
     */
    @JsonProperty(value = "exportPolicy")
    private VolumePatchPropertiesExportPolicy exportPolicy;

    /*
     * Maximum throughput in MiB/s that can be achieved by this volume and this will be accepted as input only for
     * manual qosType volume
     */
    @JsonProperty(value = "throughputMibps")
    private Float throughputMibps;

    /*
     * DataProtection
     *
     * DataProtection type volumes include an object containing details of the replication
     */
    @JsonProperty(value = "dataProtection")
    private VolumePatchPropertiesDataProtection dataProtection;

    /*
     * Specifies if default quota is enabled for the volume.
     */
    @JsonProperty(value = "isDefaultQuotaEnabled")
    private Boolean isDefaultQuotaEnabled;

    /*
     * Default user quota for volume in KiBs. If isDefaultQuotaEnabled is set, the minimum value of 4 KiBs applies .
     */
    @JsonProperty(value = "defaultUserQuotaInKiBs")
    private Long defaultUserQuotaInKiBs;

    /*
     * Default group quota for volume in KiBs. If isDefaultQuotaEnabled is set, the minimum value of 4 KiBs applies.
     */
    @JsonProperty(value = "defaultGroupQuotaInKiBs")
    private Long defaultGroupQuotaInKiBs;

    /*
     * UNIX permissions for NFS volume accepted in octal 4 digit format. First digit selects the set user ID(4), set
     * group ID (2) and sticky (1) attributes. Second digit selects permission for the owner of the file: read (4),
     * write (2) and execute (1). Third selects permissions for other users in the same group. the fourth for other
     * users not in the group. 0755 - gives read/write/execute permissions to owner and read/execute to group and other
     * users.
     */
    @JsonProperty(value = "unixPermissions")
    private String unixPermissions;

    /*
     * Specifies whether Cool Access(tiering) is enabled for the volume.
     */
    @JsonProperty(value = "coolAccess")
    private Boolean coolAccess;

    /*
     * Specifies the number of days after which data that is not accessed by clients will be tiered.
     */
    @JsonProperty(value = "coolnessPeriod")
    private Integer coolnessPeriod;

    /*
     * coolAccessRetrievalPolicy determines the data retrieval behavior from the cool tier to standard storage based on
     * the read pattern for cool access enabled volumes. The possible values for this field are:
     * Default - Data will be pulled from cool tier to standard storage on random reads. This policy is the default.
     * OnRead - All client-driven data read is pulled from cool tier to standard storage on both sequential and random
     * reads.
     * Never - No client-driven data is pulled from cool tier to standard storage.
     */
    @JsonProperty(value = "coolAccessRetrievalPolicy")
    private CoolAccessRetrievalPolicy coolAccessRetrievalPolicy;

    /*
     * If enabled (true) the volume will contain a read-only snapshot directory which provides access to each of the
     * volume's snapshots.
     */
    @JsonProperty(value = "snapshotDirectoryVisible")
    private Boolean snapshotDirectoryVisible;

    /*
     * smbAccessBasedEnumeration
     *
     * Enables access-based enumeration share property for SMB Shares. Only applicable for SMB/DualProtocol volume
     */
    @JsonProperty(value = "smbAccessBasedEnumeration")
    private SmbAccessBasedEnumeration smbAccessBasedEnumeration;

    /*
     * smbNonBrowsable
     *
     * Enables non-browsable property for SMB Shares. Only applicable for SMB/DualProtocol volume
     */
    @JsonProperty(value = "smbNonBrowsable")
    private SmbNonBrowsable smbNonBrowsable;

    /** Creates an instance of VolumePatchProperties class. */
    public VolumePatchProperties() {
    }

    /**
     * Get the serviceLevel property: serviceLevel
     *
     * <p>The service level of the file system.
     *
     * @return the serviceLevel value.
     */
    public ServiceLevel serviceLevel() {
        return this.serviceLevel;
    }

    /**
     * Set the serviceLevel property: serviceLevel
     *
     * <p>The service level of the file system.
     *
     * @param serviceLevel the serviceLevel value to set.
     * @return the VolumePatchProperties object itself.
     */
    public VolumePatchProperties withServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
        return this;
    }

    /**
     * Get the usageThreshold property: usageThreshold
     *
     * <p>Maximum storage quota allowed for a file system in bytes. This is a soft quota used for alerting only. Minimum
     * size is 100 GiB. Upper limit is 100TiB, 500Tib for LargeVolume or 2400Tib for LargeVolume on exceptional basis.
     * Specified in bytes.
     *
     * @return the usageThreshold value.
     */
    public Long usageThreshold() {
        return this.usageThreshold;
    }

    /**
     * Set the usageThreshold property: usageThreshold
     *
     * <p>Maximum storage quota allowed for a file system in bytes. This is a soft quota used for alerting only. Minimum
     * size is 100 GiB. Upper limit is 100TiB, 500Tib for LargeVolume or 2400Tib for LargeVolume on exceptional basis.
     * Specified in bytes.
     *
     * @param usageThreshold the usageThreshold value to set.
     * @return the VolumePatchProperties object itself.
     */
    public VolumePatchProperties withUsageThreshold(Long usageThreshold) {
        this.usageThreshold = usageThreshold;
        return this;
    }

    /**
     * Get the exportPolicy property: exportPolicy
     *
     * <p>Set of export policy rules.
     *
     * @return the exportPolicy value.
     */
    public VolumePatchPropertiesExportPolicy exportPolicy() {
        return this.exportPolicy;
    }

    /**
     * Set the exportPolicy property: exportPolicy
     *
     * <p>Set of export policy rules.
     *
     * @param exportPolicy the exportPolicy value to set.
     * @return the VolumePatchProperties object itself.
     */
    public VolumePatchProperties withExportPolicy(VolumePatchPropertiesExportPolicy exportPolicy) {
        this.exportPolicy = exportPolicy;
        return this;
    }

    /**
     * Get the throughputMibps property: Maximum throughput in MiB/s that can be achieved by this volume and this will
     * be accepted as input only for manual qosType volume.
     *
     * @return the throughputMibps value.
     */
    public Float throughputMibps() {
        return this.throughputMibps;
    }

    /**
     * Set the throughputMibps property: Maximum throughput in MiB/s that can be achieved by this volume and this will
     * be accepted as input only for manual qosType volume.
     *
     * @param throughputMibps the throughputMibps value to set.
     * @return the VolumePatchProperties object itself.
     */
    public VolumePatchProperties withThroughputMibps(Float throughputMibps) {
        this.throughputMibps = throughputMibps;
        return this;
    }

    /**
     * Get the dataProtection property: DataProtection
     *
     * <p>DataProtection type volumes include an object containing details of the replication.
     *
     * @return the dataProtection value.
     */
    public VolumePatchPropertiesDataProtection dataProtection() {
        return this.dataProtection;
    }

    /**
     * Set the dataProtection property: DataProtection
     *
     * <p>DataProtection type volumes include an object containing details of the replication.
     *
     * @param dataProtection the dataProtection value to set.
     * @return the VolumePatchProperties object itself.
     */
    public VolumePatchProperties withDataProtection(VolumePatchPropertiesDataProtection dataProtection) {
        this.dataProtection = dataProtection;
        return this;
    }

    /**
     * Get the isDefaultQuotaEnabled property: Specifies if default quota is enabled for the volume.
     *
     * @return the isDefaultQuotaEnabled value.
     */
    public Boolean isDefaultQuotaEnabled() {
        return this.isDefaultQuotaEnabled;
    }

    /**
     * Set the isDefaultQuotaEnabled property: Specifies if default quota is enabled for the volume.
     *
     * @param isDefaultQuotaEnabled the isDefaultQuotaEnabled value to set.
     * @return the VolumePatchProperties object itself.
     */
    public VolumePatchProperties withIsDefaultQuotaEnabled(Boolean isDefaultQuotaEnabled) {
        this.isDefaultQuotaEnabled = isDefaultQuotaEnabled;
        return this;
    }

    /**
     * Get the defaultUserQuotaInKiBs property: Default user quota for volume in KiBs. If isDefaultQuotaEnabled is set,
     * the minimum value of 4 KiBs applies .
     *
     * @return the defaultUserQuotaInKiBs value.
     */
    public Long defaultUserQuotaInKiBs() {
        return this.defaultUserQuotaInKiBs;
    }

    /**
     * Set the defaultUserQuotaInKiBs property: Default user quota for volume in KiBs. If isDefaultQuotaEnabled is set,
     * the minimum value of 4 KiBs applies .
     *
     * @param defaultUserQuotaInKiBs the defaultUserQuotaInKiBs value to set.
     * @return the VolumePatchProperties object itself.
     */
    public VolumePatchProperties withDefaultUserQuotaInKiBs(Long defaultUserQuotaInKiBs) {
        this.defaultUserQuotaInKiBs = defaultUserQuotaInKiBs;
        return this;
    }

    /**
     * Get the defaultGroupQuotaInKiBs property: Default group quota for volume in KiBs. If isDefaultQuotaEnabled is
     * set, the minimum value of 4 KiBs applies.
     *
     * @return the defaultGroupQuotaInKiBs value.
     */
    public Long defaultGroupQuotaInKiBs() {
        return this.defaultGroupQuotaInKiBs;
    }

    /**
     * Set the defaultGroupQuotaInKiBs property: Default group quota for volume in KiBs. If isDefaultQuotaEnabled is
     * set, the minimum value of 4 KiBs applies.
     *
     * @param defaultGroupQuotaInKiBs the defaultGroupQuotaInKiBs value to set.
     * @return the VolumePatchProperties object itself.
     */
    public VolumePatchProperties withDefaultGroupQuotaInKiBs(Long defaultGroupQuotaInKiBs) {
        this.defaultGroupQuotaInKiBs = defaultGroupQuotaInKiBs;
        return this;
    }

    /**
     * Get the unixPermissions property: UNIX permissions for NFS volume accepted in octal 4 digit format. First digit
     * selects the set user ID(4), set group ID (2) and sticky (1) attributes. Second digit selects permission for the
     * owner of the file: read (4), write (2) and execute (1). Third selects permissions for other users in the same
     * group. the fourth for other users not in the group. 0755 - gives read/write/execute permissions to owner and
     * read/execute to group and other users.
     *
     * @return the unixPermissions value.
     */
    public String unixPermissions() {
        return this.unixPermissions;
    }

    /**
     * Set the unixPermissions property: UNIX permissions for NFS volume accepted in octal 4 digit format. First digit
     * selects the set user ID(4), set group ID (2) and sticky (1) attributes. Second digit selects permission for the
     * owner of the file: read (4), write (2) and execute (1). Third selects permissions for other users in the same
     * group. the fourth for other users not in the group. 0755 - gives read/write/execute permissions to owner and
     * read/execute to group and other users.
     *
     * @param unixPermissions the unixPermissions value to set.
     * @return the VolumePatchProperties object itself.
     */
    public VolumePatchProperties withUnixPermissions(String unixPermissions) {
        this.unixPermissions = unixPermissions;
        return this;
    }

    /**
     * Get the coolAccess property: Specifies whether Cool Access(tiering) is enabled for the volume.
     *
     * @return the coolAccess value.
     */
    public Boolean coolAccess() {
        return this.coolAccess;
    }

    /**
     * Set the coolAccess property: Specifies whether Cool Access(tiering) is enabled for the volume.
     *
     * @param coolAccess the coolAccess value to set.
     * @return the VolumePatchProperties object itself.
     */
    public VolumePatchProperties withCoolAccess(Boolean coolAccess) {
        this.coolAccess = coolAccess;
        return this;
    }

    /**
     * Get the coolnessPeriod property: Specifies the number of days after which data that is not accessed by clients
     * will be tiered.
     *
     * @return the coolnessPeriod value.
     */
    public Integer coolnessPeriod() {
        return this.coolnessPeriod;
    }

    /**
     * Set the coolnessPeriod property: Specifies the number of days after which data that is not accessed by clients
     * will be tiered.
     *
     * @param coolnessPeriod the coolnessPeriod value to set.
     * @return the VolumePatchProperties object itself.
     */
    public VolumePatchProperties withCoolnessPeriod(Integer coolnessPeriod) {
        this.coolnessPeriod = coolnessPeriod;
        return this;
    }

    /**
     * Get the coolAccessRetrievalPolicy property: coolAccessRetrievalPolicy determines the data retrieval behavior from
     * the cool tier to standard storage based on the read pattern for cool access enabled volumes. The possible values
     * for this field are: Default - Data will be pulled from cool tier to standard storage on random reads. This policy
     * is the default. OnRead - All client-driven data read is pulled from cool tier to standard storage on both
     * sequential and random reads. Never - No client-driven data is pulled from cool tier to standard storage.
     *
     * @return the coolAccessRetrievalPolicy value.
     */
    public CoolAccessRetrievalPolicy coolAccessRetrievalPolicy() {
        return this.coolAccessRetrievalPolicy;
    }

    /**
     * Set the coolAccessRetrievalPolicy property: coolAccessRetrievalPolicy determines the data retrieval behavior from
     * the cool tier to standard storage based on the read pattern for cool access enabled volumes. The possible values
     * for this field are: Default - Data will be pulled from cool tier to standard storage on random reads. This policy
     * is the default. OnRead - All client-driven data read is pulled from cool tier to standard storage on both
     * sequential and random reads. Never - No client-driven data is pulled from cool tier to standard storage.
     *
     * @param coolAccessRetrievalPolicy the coolAccessRetrievalPolicy value to set.
     * @return the VolumePatchProperties object itself.
     */
    public VolumePatchProperties withCoolAccessRetrievalPolicy(CoolAccessRetrievalPolicy coolAccessRetrievalPolicy) {
        this.coolAccessRetrievalPolicy = coolAccessRetrievalPolicy;
        return this;
    }

    /**
     * Get the snapshotDirectoryVisible property: If enabled (true) the volume will contain a read-only snapshot
     * directory which provides access to each of the volume's snapshots.
     *
     * @return the snapshotDirectoryVisible value.
     */
    public Boolean snapshotDirectoryVisible() {
        return this.snapshotDirectoryVisible;
    }

    /**
     * Set the snapshotDirectoryVisible property: If enabled (true) the volume will contain a read-only snapshot
     * directory which provides access to each of the volume's snapshots.
     *
     * @param snapshotDirectoryVisible the snapshotDirectoryVisible value to set.
     * @return the VolumePatchProperties object itself.
     */
    public VolumePatchProperties withSnapshotDirectoryVisible(Boolean snapshotDirectoryVisible) {
        this.snapshotDirectoryVisible = snapshotDirectoryVisible;
        return this;
    }

    /**
     * Get the smbAccessBasedEnumeration property: smbAccessBasedEnumeration
     *
     * <p>Enables access-based enumeration share property for SMB Shares. Only applicable for SMB/DualProtocol volume.
     *
     * @return the smbAccessBasedEnumeration value.
     */
    public SmbAccessBasedEnumeration smbAccessBasedEnumeration() {
        return this.smbAccessBasedEnumeration;
    }

    /**
     * Set the smbAccessBasedEnumeration property: smbAccessBasedEnumeration
     *
     * <p>Enables access-based enumeration share property for SMB Shares. Only applicable for SMB/DualProtocol volume.
     *
     * @param smbAccessBasedEnumeration the smbAccessBasedEnumeration value to set.
     * @return the VolumePatchProperties object itself.
     */
    public VolumePatchProperties withSmbAccessBasedEnumeration(SmbAccessBasedEnumeration smbAccessBasedEnumeration) {
        this.smbAccessBasedEnumeration = smbAccessBasedEnumeration;
        return this;
    }

    /**
     * Get the smbNonBrowsable property: smbNonBrowsable
     *
     * <p>Enables non-browsable property for SMB Shares. Only applicable for SMB/DualProtocol volume.
     *
     * @return the smbNonBrowsable value.
     */
    public SmbNonBrowsable smbNonBrowsable() {
        return this.smbNonBrowsable;
    }

    /**
     * Set the smbNonBrowsable property: smbNonBrowsable
     *
     * <p>Enables non-browsable property for SMB Shares. Only applicable for SMB/DualProtocol volume.
     *
     * @param smbNonBrowsable the smbNonBrowsable value to set.
     * @return the VolumePatchProperties object itself.
     */
    public VolumePatchProperties withSmbNonBrowsable(SmbNonBrowsable smbNonBrowsable) {
        this.smbNonBrowsable = smbNonBrowsable;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (exportPolicy() != null) {
            exportPolicy().validate();
        }
        if (dataProtection() != null) {
            dataProtection().validate();
        }
    }
}
