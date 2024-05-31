// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp;

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
import com.azure.resourcemanager.netapp.fluent.NetAppManagementClient;
import com.azure.resourcemanager.netapp.implementation.AccountsImpl;
import com.azure.resourcemanager.netapp.implementation.BackupPoliciesImpl;
import com.azure.resourcemanager.netapp.implementation.BackupsImpl;
import com.azure.resourcemanager.netapp.implementation.BackupsUnderAccountsImpl;
import com.azure.resourcemanager.netapp.implementation.BackupsUnderBackupVaultsImpl;
import com.azure.resourcemanager.netapp.implementation.BackupsUnderVolumesImpl;
import com.azure.resourcemanager.netapp.implementation.BackupVaultsImpl;
import com.azure.resourcemanager.netapp.implementation.NetAppManagementClientBuilder;
import com.azure.resourcemanager.netapp.implementation.NetAppResourceQuotaLimitsImpl;
import com.azure.resourcemanager.netapp.implementation.NetAppResourceRegionInfosImpl;
import com.azure.resourcemanager.netapp.implementation.NetAppResourcesImpl;
import com.azure.resourcemanager.netapp.implementation.OperationsImpl;
import com.azure.resourcemanager.netapp.implementation.PoolsImpl;
import com.azure.resourcemanager.netapp.implementation.SnapshotPoliciesImpl;
import com.azure.resourcemanager.netapp.implementation.SnapshotsImpl;
import com.azure.resourcemanager.netapp.implementation.SubvolumesImpl;
import com.azure.resourcemanager.netapp.implementation.VolumeGroupsImpl;
import com.azure.resourcemanager.netapp.implementation.VolumeQuotaRulesImpl;
import com.azure.resourcemanager.netapp.implementation.VolumesImpl;
import com.azure.resourcemanager.netapp.models.Accounts;
import com.azure.resourcemanager.netapp.models.BackupPolicies;
import com.azure.resourcemanager.netapp.models.Backups;
import com.azure.resourcemanager.netapp.models.BackupsUnderAccounts;
import com.azure.resourcemanager.netapp.models.BackupsUnderBackupVaults;
import com.azure.resourcemanager.netapp.models.BackupsUnderVolumes;
import com.azure.resourcemanager.netapp.models.BackupVaults;
import com.azure.resourcemanager.netapp.models.NetAppResourceQuotaLimits;
import com.azure.resourcemanager.netapp.models.NetAppResourceRegionInfos;
import com.azure.resourcemanager.netapp.models.NetAppResources;
import com.azure.resourcemanager.netapp.models.Operations;
import com.azure.resourcemanager.netapp.models.Pools;
import com.azure.resourcemanager.netapp.models.SnapshotPolicies;
import com.azure.resourcemanager.netapp.models.Snapshots;
import com.azure.resourcemanager.netapp.models.Subvolumes;
import com.azure.resourcemanager.netapp.models.VolumeGroups;
import com.azure.resourcemanager.netapp.models.VolumeQuotaRules;
import com.azure.resourcemanager.netapp.models.Volumes;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to NetAppFilesManager.
 * Microsoft NetApp Files Azure Resource Provider specification.
 */
public final class NetAppFilesManager {
    private Operations operations;

    private NetAppResources netAppResources;

    private NetAppResourceQuotaLimits netAppResourceQuotaLimits;

    private NetAppResourceRegionInfos netAppResourceRegionInfos;

    private Accounts accounts;

    private Pools pools;

    private Volumes volumes;

    private Snapshots snapshots;

    private SnapshotPolicies snapshotPolicies;

    private BackupPolicies backupPolicies;

    private VolumeQuotaRules volumeQuotaRules;

    private VolumeGroups volumeGroups;

    private Subvolumes subvolumes;

    private Backups backups;

    private BackupVaults backupVaults;

    private BackupsUnderBackupVaults backupsUnderBackupVaults;

    private BackupsUnderVolumes backupsUnderVolumes;

    private BackupsUnderAccounts backupsUnderAccounts;

    private final NetAppManagementClient clientObject;

    private NetAppFilesManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject = new NetAppManagementClientBuilder().pipeline(httpPipeline)
            .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
            .subscriptionId(profile.getSubscriptionId())
            .defaultPollInterval(defaultPollInterval)
            .buildClient();
    }

    /**
     * Creates an instance of NetAppFiles service API entry point.
     * 
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the NetAppFiles service API instance.
     */
    public static NetAppFilesManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of NetAppFiles service API entry point.
     * 
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the NetAppFiles service API instance.
     */
    public static NetAppFilesManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new NetAppFilesManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create NetAppFilesManager with optional configuration.
     * 
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new NetAppFilesManager.Configurable();
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
         * Creates an instance of NetAppFiles service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the NetAppFiles service API instance.
         */
        public NetAppFilesManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder.append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.netapp")
                .append("/")
                .append("2.0.0");
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
            return new NetAppFilesManager(httpPipeline, profile, defaultPollInterval);
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
     * Gets the resource collection API of NetAppResources.
     * 
     * @return Resource collection API of NetAppResources.
     */
    public NetAppResources netAppResources() {
        if (this.netAppResources == null) {
            this.netAppResources = new NetAppResourcesImpl(clientObject.getNetAppResources(), this);
        }
        return netAppResources;
    }

    /**
     * Gets the resource collection API of NetAppResourceQuotaLimits.
     * 
     * @return Resource collection API of NetAppResourceQuotaLimits.
     */
    public NetAppResourceQuotaLimits netAppResourceQuotaLimits() {
        if (this.netAppResourceQuotaLimits == null) {
            this.netAppResourceQuotaLimits
                = new NetAppResourceQuotaLimitsImpl(clientObject.getNetAppResourceQuotaLimits(), this);
        }
        return netAppResourceQuotaLimits;
    }

    /**
     * Gets the resource collection API of NetAppResourceRegionInfos.
     * 
     * @return Resource collection API of NetAppResourceRegionInfos.
     */
    public NetAppResourceRegionInfos netAppResourceRegionInfos() {
        if (this.netAppResourceRegionInfos == null) {
            this.netAppResourceRegionInfos
                = new NetAppResourceRegionInfosImpl(clientObject.getNetAppResourceRegionInfos(), this);
        }
        return netAppResourceRegionInfos;
    }

    /**
     * Gets the resource collection API of Accounts. It manages NetAppAccount.
     * 
     * @return Resource collection API of Accounts.
     */
    public Accounts accounts() {
        if (this.accounts == null) {
            this.accounts = new AccountsImpl(clientObject.getAccounts(), this);
        }
        return accounts;
    }

    /**
     * Gets the resource collection API of Pools. It manages CapacityPool.
     * 
     * @return Resource collection API of Pools.
     */
    public Pools pools() {
        if (this.pools == null) {
            this.pools = new PoolsImpl(clientObject.getPools(), this);
        }
        return pools;
    }

    /**
     * Gets the resource collection API of Volumes. It manages Volume.
     * 
     * @return Resource collection API of Volumes.
     */
    public Volumes volumes() {
        if (this.volumes == null) {
            this.volumes = new VolumesImpl(clientObject.getVolumes(), this);
        }
        return volumes;
    }

    /**
     * Gets the resource collection API of Snapshots. It manages Snapshot.
     * 
     * @return Resource collection API of Snapshots.
     */
    public Snapshots snapshots() {
        if (this.snapshots == null) {
            this.snapshots = new SnapshotsImpl(clientObject.getSnapshots(), this);
        }
        return snapshots;
    }

    /**
     * Gets the resource collection API of SnapshotPolicies. It manages SnapshotPolicy.
     * 
     * @return Resource collection API of SnapshotPolicies.
     */
    public SnapshotPolicies snapshotPolicies() {
        if (this.snapshotPolicies == null) {
            this.snapshotPolicies = new SnapshotPoliciesImpl(clientObject.getSnapshotPolicies(), this);
        }
        return snapshotPolicies;
    }

    /**
     * Gets the resource collection API of BackupPolicies. It manages BackupPolicy.
     * 
     * @return Resource collection API of BackupPolicies.
     */
    public BackupPolicies backupPolicies() {
        if (this.backupPolicies == null) {
            this.backupPolicies = new BackupPoliciesImpl(clientObject.getBackupPolicies(), this);
        }
        return backupPolicies;
    }

    /**
     * Gets the resource collection API of VolumeQuotaRules. It manages VolumeQuotaRule.
     * 
     * @return Resource collection API of VolumeQuotaRules.
     */
    public VolumeQuotaRules volumeQuotaRules() {
        if (this.volumeQuotaRules == null) {
            this.volumeQuotaRules = new VolumeQuotaRulesImpl(clientObject.getVolumeQuotaRules(), this);
        }
        return volumeQuotaRules;
    }

    /**
     * Gets the resource collection API of VolumeGroups. It manages VolumeGroupDetails.
     * 
     * @return Resource collection API of VolumeGroups.
     */
    public VolumeGroups volumeGroups() {
        if (this.volumeGroups == null) {
            this.volumeGroups = new VolumeGroupsImpl(clientObject.getVolumeGroups(), this);
        }
        return volumeGroups;
    }

    /**
     * Gets the resource collection API of Subvolumes. It manages SubvolumeInfo.
     * 
     * @return Resource collection API of Subvolumes.
     */
    public Subvolumes subvolumes() {
        if (this.subvolumes == null) {
            this.subvolumes = new SubvolumesImpl(clientObject.getSubvolumes(), this);
        }
        return subvolumes;
    }

    /**
     * Gets the resource collection API of Backups. It manages Backup.
     * 
     * @return Resource collection API of Backups.
     */
    public Backups backups() {
        if (this.backups == null) {
            this.backups = new BackupsImpl(clientObject.getBackups(), this);
        }
        return backups;
    }

    /**
     * Gets the resource collection API of BackupVaults. It manages BackupVault.
     * 
     * @return Resource collection API of BackupVaults.
     */
    public BackupVaults backupVaults() {
        if (this.backupVaults == null) {
            this.backupVaults = new BackupVaultsImpl(clientObject.getBackupVaults(), this);
        }
        return backupVaults;
    }

    /**
     * Gets the resource collection API of BackupsUnderBackupVaults.
     * 
     * @return Resource collection API of BackupsUnderBackupVaults.
     */
    public BackupsUnderBackupVaults backupsUnderBackupVaults() {
        if (this.backupsUnderBackupVaults == null) {
            this.backupsUnderBackupVaults
                = new BackupsUnderBackupVaultsImpl(clientObject.getBackupsUnderBackupVaults(), this);
        }
        return backupsUnderBackupVaults;
    }

    /**
     * Gets the resource collection API of BackupsUnderVolumes.
     * 
     * @return Resource collection API of BackupsUnderVolumes.
     */
    public BackupsUnderVolumes backupsUnderVolumes() {
        if (this.backupsUnderVolumes == null) {
            this.backupsUnderVolumes = new BackupsUnderVolumesImpl(clientObject.getBackupsUnderVolumes(), this);
        }
        return backupsUnderVolumes;
    }

    /**
     * Gets the resource collection API of BackupsUnderAccounts.
     * 
     * @return Resource collection API of BackupsUnderAccounts.
     */
    public BackupsUnderAccounts backupsUnderAccounts() {
        if (this.backupsUnderAccounts == null) {
            this.backupsUnderAccounts = new BackupsUnderAccountsImpl(clientObject.getBackupsUnderAccounts(), this);
        }
        return backupsUnderAccounts;
    }

    /**
     * Gets wrapped service client NetAppManagementClient providing direct access to the underlying auto-generated API
     * implementation, based on Azure REST API.
     * 
     * @return Wrapped service client NetAppManagementClient.
     */
    public NetAppManagementClient serviceClient() {
        return this.clientObject;
    }
}
