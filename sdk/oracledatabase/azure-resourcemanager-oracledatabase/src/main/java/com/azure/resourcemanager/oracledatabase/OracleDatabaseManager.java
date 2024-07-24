// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.oracledatabase.fluent.OracleDatabaseResourceManager;
import com.azure.resourcemanager.oracledatabase.implementation.AutonomousDatabaseBackupsImpl;
import com.azure.resourcemanager.oracledatabase.implementation.AutonomousDatabaseCharacterSetsImpl;
import com.azure.resourcemanager.oracledatabase.implementation.AutonomousDatabaseNationalCharacterSetsImpl;
import com.azure.resourcemanager.oracledatabase.implementation.AutonomousDatabasesImpl;
import com.azure.resourcemanager.oracledatabase.implementation.AutonomousDatabaseVersionsImpl;
import com.azure.resourcemanager.oracledatabase.implementation.CloudExadataInfrastructuresImpl;
import com.azure.resourcemanager.oracledatabase.implementation.CloudVmClustersImpl;
import com.azure.resourcemanager.oracledatabase.implementation.DbNodesImpl;
import com.azure.resourcemanager.oracledatabase.implementation.DbServersImpl;
import com.azure.resourcemanager.oracledatabase.implementation.DbSystemShapesImpl;
import com.azure.resourcemanager.oracledatabase.implementation.DnsPrivateViewsImpl;
import com.azure.resourcemanager.oracledatabase.implementation.DnsPrivateZonesImpl;
import com.azure.resourcemanager.oracledatabase.implementation.GiVersionsImpl;
import com.azure.resourcemanager.oracledatabase.implementation.OperationsImpl;
import com.azure.resourcemanager.oracledatabase.implementation.OracleDatabaseResourceManagerBuilder;
import com.azure.resourcemanager.oracledatabase.implementation.OracleSubscriptionsImpl;
import com.azure.resourcemanager.oracledatabase.implementation.SystemVersionsImpl;
import com.azure.resourcemanager.oracledatabase.implementation.VirtualNetworkAddressesImpl;
import com.azure.resourcemanager.oracledatabase.models.AutonomousDatabaseBackups;
import com.azure.resourcemanager.oracledatabase.models.AutonomousDatabaseCharacterSets;
import com.azure.resourcemanager.oracledatabase.models.AutonomousDatabaseNationalCharacterSets;
import com.azure.resourcemanager.oracledatabase.models.AutonomousDatabases;
import com.azure.resourcemanager.oracledatabase.models.AutonomousDatabaseVersions;
import com.azure.resourcemanager.oracledatabase.models.CloudExadataInfrastructures;
import com.azure.resourcemanager.oracledatabase.models.CloudVmClusters;
import com.azure.resourcemanager.oracledatabase.models.DbNodes;
import com.azure.resourcemanager.oracledatabase.models.DbServers;
import com.azure.resourcemanager.oracledatabase.models.DbSystemShapes;
import com.azure.resourcemanager.oracledatabase.models.DnsPrivateViews;
import com.azure.resourcemanager.oracledatabase.models.DnsPrivateZones;
import com.azure.resourcemanager.oracledatabase.models.GiVersions;
import com.azure.resourcemanager.oracledatabase.models.Operations;
import com.azure.resourcemanager.oracledatabase.models.OracleSubscriptions;
import com.azure.resourcemanager.oracledatabase.models.SystemVersions;
import com.azure.resourcemanager.oracledatabase.models.VirtualNetworkAddresses;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to OracleDatabaseManager.
 */
public final class OracleDatabaseManager {
    private Operations operations;

    private AutonomousDatabases autonomousDatabases;

    private CloudExadataInfrastructures cloudExadataInfrastructures;

    private CloudVmClusters cloudVmClusters;

    private AutonomousDatabaseCharacterSets autonomousDatabaseCharacterSets;

    private AutonomousDatabaseNationalCharacterSets autonomousDatabaseNationalCharacterSets;

    private AutonomousDatabaseVersions autonomousDatabaseVersions;

    private DbSystemShapes dbSystemShapes;

    private DnsPrivateViews dnsPrivateViews;

    private DnsPrivateZones dnsPrivateZones;

    private GiVersions giVersions;

    private SystemVersions systemVersions;

    private OracleSubscriptions oracleSubscriptions;

    private AutonomousDatabaseBackups autonomousDatabaseBackups;

    private DbServers dbServers;

    private DbNodes dbNodes;

    private VirtualNetworkAddresses virtualNetworkAddresses;

    private final OracleDatabaseResourceManager clientObject;

    private OracleDatabaseManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject = new OracleDatabaseResourceManagerBuilder().pipeline(httpPipeline)
            .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
            .subscriptionId(profile.getSubscriptionId())
            .defaultPollInterval(defaultPollInterval)
            .buildClient();
    }

    /**
     * Creates an instance of OracleDatabase service API entry point.
     * 
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the OracleDatabase service API instance.
     */
    public static OracleDatabaseManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of OracleDatabase service API entry point.
     * 
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the OracleDatabase service API instance.
     */
    public static OracleDatabaseManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new OracleDatabaseManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create OracleDatabaseManager with optional configuration.
     * 
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new OracleDatabaseManager.Configurable();
    }

    /**
     * The Configurable allowing configurations to be set.
     */
    public static final class Configurable {
        private static final ClientLogger LOGGER = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private RetryOptions retryOptions;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the retry options for the HTTP pipeline retry policy.
         * <p>
         * This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
         *
         * @param retryOptions the retry options for the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryOptions(RetryOptions retryOptions) {
            this.retryOptions = Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval
                = Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of OracleDatabase service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the OracleDatabase service API instance.
         */
        public OracleDatabaseManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder.append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.oracledatabase")
                .append("/")
                .append("1.0.0");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder.append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                if (retryOptions != null) {
                    retryPolicy = new RetryPolicy(retryOptions);
                } else {
                    retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
                }
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new AddHeadersFromContextPolicy());
            policies.add(new RequestIdPolicy());
            policies.addAll(this.policies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies.addAll(this.policies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline = new HttpPipelineBuilder().httpClient(httpClient)
                .policies(policies.toArray(new HttpPipelinePolicy[0]))
                .build();
            return new OracleDatabaseManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of Operations.
     * 
     * @return Resource collection API of Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * Gets the resource collection API of AutonomousDatabases. It manages AutonomousDatabase.
     * 
     * @return Resource collection API of AutonomousDatabases.
     */
    public AutonomousDatabases autonomousDatabases() {
        if (this.autonomousDatabases == null) {
            this.autonomousDatabases = new AutonomousDatabasesImpl(clientObject.getAutonomousDatabases(), this);
        }
        return autonomousDatabases;
    }

    /**
     * Gets the resource collection API of CloudExadataInfrastructures. It manages CloudExadataInfrastructure.
     * 
     * @return Resource collection API of CloudExadataInfrastructures.
     */
    public CloudExadataInfrastructures cloudExadataInfrastructures() {
        if (this.cloudExadataInfrastructures == null) {
            this.cloudExadataInfrastructures
                = new CloudExadataInfrastructuresImpl(clientObject.getCloudExadataInfrastructures(), this);
        }
        return cloudExadataInfrastructures;
    }

    /**
     * Gets the resource collection API of CloudVmClusters. It manages CloudVmCluster.
     * 
     * @return Resource collection API of CloudVmClusters.
     */
    public CloudVmClusters cloudVmClusters() {
        if (this.cloudVmClusters == null) {
            this.cloudVmClusters = new CloudVmClustersImpl(clientObject.getCloudVmClusters(), this);
        }
        return cloudVmClusters;
    }

    /**
     * Gets the resource collection API of AutonomousDatabaseCharacterSets.
     * 
     * @return Resource collection API of AutonomousDatabaseCharacterSets.
     */
    public AutonomousDatabaseCharacterSets autonomousDatabaseCharacterSets() {
        if (this.autonomousDatabaseCharacterSets == null) {
            this.autonomousDatabaseCharacterSets
                = new AutonomousDatabaseCharacterSetsImpl(clientObject.getAutonomousDatabaseCharacterSets(), this);
        }
        return autonomousDatabaseCharacterSets;
    }

    /**
     * Gets the resource collection API of AutonomousDatabaseNationalCharacterSets.
     * 
     * @return Resource collection API of AutonomousDatabaseNationalCharacterSets.
     */
    public AutonomousDatabaseNationalCharacterSets autonomousDatabaseNationalCharacterSets() {
        if (this.autonomousDatabaseNationalCharacterSets == null) {
            this.autonomousDatabaseNationalCharacterSets = new AutonomousDatabaseNationalCharacterSetsImpl(
                clientObject.getAutonomousDatabaseNationalCharacterSets(), this);
        }
        return autonomousDatabaseNationalCharacterSets;
    }

    /**
     * Gets the resource collection API of AutonomousDatabaseVersions.
     * 
     * @return Resource collection API of AutonomousDatabaseVersions.
     */
    public AutonomousDatabaseVersions autonomousDatabaseVersions() {
        if (this.autonomousDatabaseVersions == null) {
            this.autonomousDatabaseVersions
                = new AutonomousDatabaseVersionsImpl(clientObject.getAutonomousDatabaseVersions(), this);
        }
        return autonomousDatabaseVersions;
    }

    /**
     * Gets the resource collection API of DbSystemShapes.
     * 
     * @return Resource collection API of DbSystemShapes.
     */
    public DbSystemShapes dbSystemShapes() {
        if (this.dbSystemShapes == null) {
            this.dbSystemShapes = new DbSystemShapesImpl(clientObject.getDbSystemShapes(), this);
        }
        return dbSystemShapes;
    }

    /**
     * Gets the resource collection API of DnsPrivateViews.
     * 
     * @return Resource collection API of DnsPrivateViews.
     */
    public DnsPrivateViews dnsPrivateViews() {
        if (this.dnsPrivateViews == null) {
            this.dnsPrivateViews = new DnsPrivateViewsImpl(clientObject.getDnsPrivateViews(), this);
        }
        return dnsPrivateViews;
    }

    /**
     * Gets the resource collection API of DnsPrivateZones.
     * 
     * @return Resource collection API of DnsPrivateZones.
     */
    public DnsPrivateZones dnsPrivateZones() {
        if (this.dnsPrivateZones == null) {
            this.dnsPrivateZones = new DnsPrivateZonesImpl(clientObject.getDnsPrivateZones(), this);
        }
        return dnsPrivateZones;
    }

    /**
     * Gets the resource collection API of GiVersions.
     * 
     * @return Resource collection API of GiVersions.
     */
    public GiVersions giVersions() {
        if (this.giVersions == null) {
            this.giVersions = new GiVersionsImpl(clientObject.getGiVersions(), this);
        }
        return giVersions;
    }

    /**
     * Gets the resource collection API of SystemVersions.
     * 
     * @return Resource collection API of SystemVersions.
     */
    public SystemVersions systemVersions() {
        if (this.systemVersions == null) {
            this.systemVersions = new SystemVersionsImpl(clientObject.getSystemVersions(), this);
        }
        return systemVersions;
    }

    /**
     * Gets the resource collection API of OracleSubscriptions.
     * 
     * @return Resource collection API of OracleSubscriptions.
     */
    public OracleSubscriptions oracleSubscriptions() {
        if (this.oracleSubscriptions == null) {
            this.oracleSubscriptions = new OracleSubscriptionsImpl(clientObject.getOracleSubscriptions(), this);
        }
        return oracleSubscriptions;
    }

    /**
     * Gets the resource collection API of AutonomousDatabaseBackups. It manages AutonomousDatabaseBackup.
     * 
     * @return Resource collection API of AutonomousDatabaseBackups.
     */
    public AutonomousDatabaseBackups autonomousDatabaseBackups() {
        if (this.autonomousDatabaseBackups == null) {
            this.autonomousDatabaseBackups
                = new AutonomousDatabaseBackupsImpl(clientObject.getAutonomousDatabaseBackups(), this);
        }
        return autonomousDatabaseBackups;
    }

    /**
     * Gets the resource collection API of DbServers.
     * 
     * @return Resource collection API of DbServers.
     */
    public DbServers dbServers() {
        if (this.dbServers == null) {
            this.dbServers = new DbServersImpl(clientObject.getDbServers(), this);
        }
        return dbServers;
    }

    /**
     * Gets the resource collection API of DbNodes.
     * 
     * @return Resource collection API of DbNodes.
     */
    public DbNodes dbNodes() {
        if (this.dbNodes == null) {
            this.dbNodes = new DbNodesImpl(clientObject.getDbNodes(), this);
        }
        return dbNodes;
    }

    /**
     * Gets the resource collection API of VirtualNetworkAddresses. It manages VirtualNetworkAddress.
     * 
     * @return Resource collection API of VirtualNetworkAddresses.
     */
    public VirtualNetworkAddresses virtualNetworkAddresses() {
        if (this.virtualNetworkAddresses == null) {
            this.virtualNetworkAddresses
                = new VirtualNetworkAddressesImpl(clientObject.getVirtualNetworkAddresses(), this);
        }
        return virtualNetworkAddresses;
    }

    /**
     * Gets wrapped service client OracleDatabaseResourceManager providing direct access to the underlying
     * auto-generated API implementation, based on Azure REST API.
     * 
     * @return Wrapped service client OracleDatabaseResourceManager.
     */
    public OracleDatabaseResourceManager serviceClient() {
        return this.clientObject;
    }
}
