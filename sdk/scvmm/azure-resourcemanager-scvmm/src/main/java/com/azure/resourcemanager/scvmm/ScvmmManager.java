// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm;

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
import com.azure.resourcemanager.scvmm.fluent.ScvmmClient;
import com.azure.resourcemanager.scvmm.implementation.AvailabilitySetsImpl;
import com.azure.resourcemanager.scvmm.implementation.CloudsImpl;
import com.azure.resourcemanager.scvmm.implementation.GuestAgentsImpl;
import com.azure.resourcemanager.scvmm.implementation.InventoryItemsImpl;
import com.azure.resourcemanager.scvmm.implementation.OperationsImpl;
import com.azure.resourcemanager.scvmm.implementation.ScvmmClientBuilder;
import com.azure.resourcemanager.scvmm.implementation.VirtualMachineInstancesImpl;
import com.azure.resourcemanager.scvmm.implementation.VirtualMachineTemplatesImpl;
import com.azure.resourcemanager.scvmm.implementation.VirtualNetworksImpl;
import com.azure.resourcemanager.scvmm.implementation.VmInstanceHybridIdentityMetadatasImpl;
import com.azure.resourcemanager.scvmm.implementation.VmmServersImpl;
import com.azure.resourcemanager.scvmm.models.AvailabilitySets;
import com.azure.resourcemanager.scvmm.models.Clouds;
import com.azure.resourcemanager.scvmm.models.GuestAgents;
import com.azure.resourcemanager.scvmm.models.InventoryItems;
import com.azure.resourcemanager.scvmm.models.Operations;
import com.azure.resourcemanager.scvmm.models.VirtualMachineInstances;
import com.azure.resourcemanager.scvmm.models.VirtualMachineTemplates;
import com.azure.resourcemanager.scvmm.models.VirtualNetworks;
import com.azure.resourcemanager.scvmm.models.VmInstanceHybridIdentityMetadatas;
import com.azure.resourcemanager.scvmm.models.VmmServers;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to ScvmmManager.
 * SCVMM Client.
 */
public final class ScvmmManager {
    private VirtualMachineInstances virtualMachineInstances;

    private GuestAgents guestAgents;

    private VmInstanceHybridIdentityMetadatas vmInstanceHybridIdentityMetadatas;

    private Operations operations;

    private AvailabilitySets availabilitySets;

    private Clouds clouds;

    private VirtualMachineTemplates virtualMachineTemplates;

    private VirtualNetworks virtualNetworks;

    private VmmServers vmmServers;

    private InventoryItems inventoryItems;

    private final ScvmmClient clientObject;

    private ScvmmManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject = new ScvmmClientBuilder().pipeline(httpPipeline)
            .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
            .subscriptionId(profile.getSubscriptionId())
            .defaultPollInterval(defaultPollInterval)
            .buildClient();
    }

    /**
     * Creates an instance of Scvmm service API entry point.
     * 
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Scvmm service API instance.
     */
    public static ScvmmManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of Scvmm service API entry point.
     * 
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the Scvmm service API instance.
     */
    public static ScvmmManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new ScvmmManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create ScvmmManager with optional configuration.
     * 
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new ScvmmManager.Configurable();
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
         * Creates an instance of Scvmm service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Scvmm service API instance.
         */
        public ScvmmManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder.append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.scvmm")
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
            return new ScvmmManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of VirtualMachineInstances.
     * 
     * @return Resource collection API of VirtualMachineInstances.
     */
    public VirtualMachineInstances virtualMachineInstances() {
        if (this.virtualMachineInstances == null) {
            this.virtualMachineInstances
                = new VirtualMachineInstancesImpl(clientObject.getVirtualMachineInstances(), this);
        }
        return virtualMachineInstances;
    }

    /**
     * Gets the resource collection API of GuestAgents.
     * 
     * @return Resource collection API of GuestAgents.
     */
    public GuestAgents guestAgents() {
        if (this.guestAgents == null) {
            this.guestAgents = new GuestAgentsImpl(clientObject.getGuestAgents(), this);
        }
        return guestAgents;
    }

    /**
     * Gets the resource collection API of VmInstanceHybridIdentityMetadatas.
     * 
     * @return Resource collection API of VmInstanceHybridIdentityMetadatas.
     */
    public VmInstanceHybridIdentityMetadatas vmInstanceHybridIdentityMetadatas() {
        if (this.vmInstanceHybridIdentityMetadatas == null) {
            this.vmInstanceHybridIdentityMetadatas
                = new VmInstanceHybridIdentityMetadatasImpl(clientObject.getVmInstanceHybridIdentityMetadatas(), this);
        }
        return vmInstanceHybridIdentityMetadatas;
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
     * Gets the resource collection API of AvailabilitySets. It manages AvailabilitySet.
     * 
     * @return Resource collection API of AvailabilitySets.
     */
    public AvailabilitySets availabilitySets() {
        if (this.availabilitySets == null) {
            this.availabilitySets = new AvailabilitySetsImpl(clientObject.getAvailabilitySets(), this);
        }
        return availabilitySets;
    }

    /**
     * Gets the resource collection API of Clouds. It manages Cloud.
     * 
     * @return Resource collection API of Clouds.
     */
    public Clouds clouds() {
        if (this.clouds == null) {
            this.clouds = new CloudsImpl(clientObject.getClouds(), this);
        }
        return clouds;
    }

    /**
     * Gets the resource collection API of VirtualMachineTemplates. It manages VirtualMachineTemplate.
     * 
     * @return Resource collection API of VirtualMachineTemplates.
     */
    public VirtualMachineTemplates virtualMachineTemplates() {
        if (this.virtualMachineTemplates == null) {
            this.virtualMachineTemplates
                = new VirtualMachineTemplatesImpl(clientObject.getVirtualMachineTemplates(), this);
        }
        return virtualMachineTemplates;
    }

    /**
     * Gets the resource collection API of VirtualNetworks. It manages VirtualNetwork.
     * 
     * @return Resource collection API of VirtualNetworks.
     */
    public VirtualNetworks virtualNetworks() {
        if (this.virtualNetworks == null) {
            this.virtualNetworks = new VirtualNetworksImpl(clientObject.getVirtualNetworks(), this);
        }
        return virtualNetworks;
    }

    /**
     * Gets the resource collection API of VmmServers. It manages VmmServer.
     * 
     * @return Resource collection API of VmmServers.
     */
    public VmmServers vmmServers() {
        if (this.vmmServers == null) {
            this.vmmServers = new VmmServersImpl(clientObject.getVmmServers(), this);
        }
        return vmmServers;
    }

    /**
     * Gets the resource collection API of InventoryItems. It manages InventoryItem.
     * 
     * @return Resource collection API of InventoryItems.
     */
    public InventoryItems inventoryItems() {
        if (this.inventoryItems == null) {
            this.inventoryItems = new InventoryItemsImpl(clientObject.getInventoryItems(), this);
        }
        return inventoryItems;
    }

    /**
     * Gets wrapped service client ScvmmClient providing direct access to the underlying auto-generated API
     * implementation, based on Azure REST API.
     * 
     * @return Wrapped service client ScvmmClient.
     */
    public ScvmmClient serviceClient() {
        return this.clientObject;
    }
}
