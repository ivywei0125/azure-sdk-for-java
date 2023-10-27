// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.postgresqlflexibleserver.models.AuthConfig;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Backup;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CreateMode;
import com.azure.resourcemanager.postgresqlflexibleserver.models.DataEncryption;
import com.azure.resourcemanager.postgresqlflexibleserver.models.HighAvailability;
import com.azure.resourcemanager.postgresqlflexibleserver.models.MaintenanceWindow;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Network;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ReplicationRole;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ServerState;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ServerVersion;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Storage;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The properties of a server. */
@Fluent
public final class ServerProperties {
    /*
     * The administrator's login name of a server. Can only be specified when the server is being created (and is
     * required for creation).
     */
    @JsonProperty(value = "administratorLogin")
    private String administratorLogin;

    /*
     * The administrator login password (required for server creation).
     */
    @JsonProperty(value = "administratorLoginPassword")
    private String administratorLoginPassword;

    /*
     * PostgreSQL Server version.
     */
    @JsonProperty(value = "version")
    private ServerVersion version;

    /*
     * The minor version of the server.
     */
    @JsonProperty(value = "minorVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String minorVersion;

    /*
     * A state of a server that is visible to user.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private ServerState state;

    /*
     * The fully qualified domain name of a server.
     */
    @JsonProperty(value = "fullyQualifiedDomainName", access = JsonProperty.Access.WRITE_ONLY)
    private String fullyQualifiedDomainName;

    /*
     * Storage properties of a server.
     */
    @JsonProperty(value = "storage")
    private Storage storage;

    /*
     * AuthConfig properties of a server.
     */
    @JsonProperty(value = "authConfig")
    private AuthConfig authConfig;

    /*
     * Data encryption properties of a server.
     */
    @JsonProperty(value = "dataEncryption")
    private DataEncryption dataEncryption;

    /*
     * Backup properties of a server.
     */
    @JsonProperty(value = "backup")
    private Backup backup;

    /*
     * Network properties of a server. This Network property is required to be passed only in case you want the server
     * to be Private access server.
     */
    @JsonProperty(value = "network")
    private Network network;

    /*
     * High availability properties of a server.
     */
    @JsonProperty(value = "highAvailability")
    private HighAvailability highAvailability;

    /*
     * Maintenance window properties of a server.
     */
    @JsonProperty(value = "maintenanceWindow")
    private MaintenanceWindow maintenanceWindow;

    /*
     * The source server resource ID to restore from. It's required when 'createMode' is 'PointInTimeRestore' or
     * 'GeoRestore' or 'Replica'. This property is returned only for Replica server
     */
    @JsonProperty(value = "sourceServerResourceId")
    private String sourceServerResourceId;

    /*
     * Restore point creation time (ISO8601 format), specifying the time to restore from. It's required when
     * 'createMode' is 'PointInTimeRestore' or 'GeoRestore'.
     */
    @JsonProperty(value = "pointInTimeUTC")
    private OffsetDateTime pointInTimeUtc;

    /*
     * availability zone information of the server.
     */
    @JsonProperty(value = "availabilityZone")
    private String availabilityZone;

    /*
     * Replication role of the server
     */
    @JsonProperty(value = "replicationRole")
    private ReplicationRole replicationRole;

    /*
     * Replicas allowed for a server.
     */
    @JsonProperty(value = "replicaCapacity", access = JsonProperty.Access.WRITE_ONLY)
    private Integer replicaCapacity;

    /*
     * The mode to create a new PostgreSQL server.
     */
    @JsonProperty(value = "createMode")
    private CreateMode createMode;

    /** Creates an instance of ServerProperties class. */
    public ServerProperties() {
    }

    /**
     * Get the administratorLogin property: The administrator's login name of a server. Can only be specified when the
     * server is being created (and is required for creation).
     *
     * @return the administratorLogin value.
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the administratorLogin property: The administrator's login name of a server. Can only be specified when the
     * server is being created (and is required for creation).
     *
     * @param administratorLogin the administratorLogin value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the administratorLoginPassword property: The administrator login password (required for server creation).
     *
     * @return the administratorLoginPassword value.
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administratorLoginPassword property: The administrator login password (required for server creation).
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the version property: PostgreSQL Server version.
     *
     * @return the version value.
     */
    public ServerVersion version() {
        return this.version;
    }

    /**
     * Set the version property: PostgreSQL Server version.
     *
     * @param version the version value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withVersion(ServerVersion version) {
        this.version = version;
        return this;
    }

    /**
     * Get the minorVersion property: The minor version of the server.
     *
     * @return the minorVersion value.
     */
    public String minorVersion() {
        return this.minorVersion;
    }

    /**
     * Get the state property: A state of a server that is visible to user.
     *
     * @return the state value.
     */
    public ServerState state() {
        return this.state;
    }

    /**
     * Get the fullyQualifiedDomainName property: The fully qualified domain name of a server.
     *
     * @return the fullyQualifiedDomainName value.
     */
    public String fullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }

    /**
     * Get the storage property: Storage properties of a server.
     *
     * @return the storage value.
     */
    public Storage storage() {
        return this.storage;
    }

    /**
     * Set the storage property: Storage properties of a server.
     *
     * @param storage the storage value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withStorage(Storage storage) {
        this.storage = storage;
        return this;
    }

    /**
     * Get the authConfig property: AuthConfig properties of a server.
     *
     * @return the authConfig value.
     */
    public AuthConfig authConfig() {
        return this.authConfig;
    }

    /**
     * Set the authConfig property: AuthConfig properties of a server.
     *
     * @param authConfig the authConfig value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withAuthConfig(AuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }

    /**
     * Get the dataEncryption property: Data encryption properties of a server.
     *
     * @return the dataEncryption value.
     */
    public DataEncryption dataEncryption() {
        return this.dataEncryption;
    }

    /**
     * Set the dataEncryption property: Data encryption properties of a server.
     *
     * @param dataEncryption the dataEncryption value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withDataEncryption(DataEncryption dataEncryption) {
        this.dataEncryption = dataEncryption;
        return this;
    }

    /**
     * Get the backup property: Backup properties of a server.
     *
     * @return the backup value.
     */
    public Backup backup() {
        return this.backup;
    }

    /**
     * Set the backup property: Backup properties of a server.
     *
     * @param backup the backup value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withBackup(Backup backup) {
        this.backup = backup;
        return this;
    }

    /**
     * Get the network property: Network properties of a server. This Network property is required to be passed only in
     * case you want the server to be Private access server.
     *
     * @return the network value.
     */
    public Network network() {
        return this.network;
    }

    /**
     * Set the network property: Network properties of a server. This Network property is required to be passed only in
     * case you want the server to be Private access server.
     *
     * @param network the network value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withNetwork(Network network) {
        this.network = network;
        return this;
    }

    /**
     * Get the highAvailability property: High availability properties of a server.
     *
     * @return the highAvailability value.
     */
    public HighAvailability highAvailability() {
        return this.highAvailability;
    }

    /**
     * Set the highAvailability property: High availability properties of a server.
     *
     * @param highAvailability the highAvailability value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withHighAvailability(HighAvailability highAvailability) {
        this.highAvailability = highAvailability;
        return this;
    }

    /**
     * Get the maintenanceWindow property: Maintenance window properties of a server.
     *
     * @return the maintenanceWindow value.
     */
    public MaintenanceWindow maintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * Set the maintenanceWindow property: Maintenance window properties of a server.
     *
     * @param maintenanceWindow the maintenanceWindow value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }

    /**
     * Get the sourceServerResourceId property: The source server resource ID to restore from. It's required when
     * 'createMode' is 'PointInTimeRestore' or 'GeoRestore' or 'Replica'. This property is returned only for Replica
     * server.
     *
     * @return the sourceServerResourceId value.
     */
    public String sourceServerResourceId() {
        return this.sourceServerResourceId;
    }

    /**
     * Set the sourceServerResourceId property: The source server resource ID to restore from. It's required when
     * 'createMode' is 'PointInTimeRestore' or 'GeoRestore' or 'Replica'. This property is returned only for Replica
     * server.
     *
     * @param sourceServerResourceId the sourceServerResourceId value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withSourceServerResourceId(String sourceServerResourceId) {
        this.sourceServerResourceId = sourceServerResourceId;
        return this;
    }

    /**
     * Get the pointInTimeUtc property: Restore point creation time (ISO8601 format), specifying the time to restore
     * from. It's required when 'createMode' is 'PointInTimeRestore' or 'GeoRestore'.
     *
     * @return the pointInTimeUtc value.
     */
    public OffsetDateTime pointInTimeUtc() {
        return this.pointInTimeUtc;
    }

    /**
     * Set the pointInTimeUtc property: Restore point creation time (ISO8601 format), specifying the time to restore
     * from. It's required when 'createMode' is 'PointInTimeRestore' or 'GeoRestore'.
     *
     * @param pointInTimeUtc the pointInTimeUtc value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withPointInTimeUtc(OffsetDateTime pointInTimeUtc) {
        this.pointInTimeUtc = pointInTimeUtc;
        return this;
    }

    /**
     * Get the availabilityZone property: availability zone information of the server.
     *
     * @return the availabilityZone value.
     */
    public String availabilityZone() {
        return this.availabilityZone;
    }

    /**
     * Set the availabilityZone property: availability zone information of the server.
     *
     * @param availabilityZone the availabilityZone value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Get the replicationRole property: Replication role of the server.
     *
     * @return the replicationRole value.
     */
    public ReplicationRole replicationRole() {
        return this.replicationRole;
    }

    /**
     * Set the replicationRole property: Replication role of the server.
     *
     * @param replicationRole the replicationRole value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withReplicationRole(ReplicationRole replicationRole) {
        this.replicationRole = replicationRole;
        return this;
    }

    /**
     * Get the replicaCapacity property: Replicas allowed for a server.
     *
     * @return the replicaCapacity value.
     */
    public Integer replicaCapacity() {
        return this.replicaCapacity;
    }

    /**
     * Get the createMode property: The mode to create a new PostgreSQL server.
     *
     * @return the createMode value.
     */
    public CreateMode createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: The mode to create a new PostgreSQL server.
     *
     * @param createMode the createMode value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withCreateMode(CreateMode createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storage() != null) {
            storage().validate();
        }
        if (authConfig() != null) {
            authConfig().validate();
        }
        if (dataEncryption() != null) {
            dataEncryption().validate();
        }
        if (backup() != null) {
            backup().validate();
        }
        if (network() != null) {
            network().validate();
        }
        if (highAvailability() != null) {
            highAvailability().validate();
        }
        if (maintenanceWindow() != null) {
            maintenanceWindow().validate();
        }
    }
}
