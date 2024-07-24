// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.eventhubs.fluent.ApplicationGroupsClient;
import com.azure.resourcemanager.eventhubs.fluent.ClustersClient;
import com.azure.resourcemanager.eventhubs.fluent.ConfigurationsClient;
import com.azure.resourcemanager.eventhubs.fluent.ConsumerGroupsClient;
import com.azure.resourcemanager.eventhubs.fluent.DisasterRecoveryConfigsClient;
import com.azure.resourcemanager.eventhubs.fluent.EventHubManagementClient;
import com.azure.resourcemanager.eventhubs.fluent.EventHubsClient;
import com.azure.resourcemanager.eventhubs.fluent.NamespacesClient;
import com.azure.resourcemanager.eventhubs.fluent.NetworkSecurityPerimeterConfigurationsClient;
import com.azure.resourcemanager.eventhubs.fluent.NetworkSecurityPerimeterConfigurationsOperationsClient;
import com.azure.resourcemanager.eventhubs.fluent.OperationsClient;
import com.azure.resourcemanager.eventhubs.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.eventhubs.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.eventhubs.fluent.SchemaRegistriesClient;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;

import java.time.Duration;

/**
 * Initializes a new instance of the EventHubManagementClientImpl type.
 */
@ServiceClient(builder = EventHubManagementClientBuilder.class)
public final class EventHubManagementClientImpl extends AzureServiceClient implements EventHubManagementClient {
    /**
     * Subscription credentials that uniquely identify a Microsoft Azure subscription. The subscription ID forms part of
     * the URI for every service call.
     */
    private final String subscriptionId;

    /**
     * Gets Subscription credentials that uniquely identify a Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * server parameter.
     */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Api Version.
     */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * The default poll interval for long-running operation.
     */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /**
     * The ClustersClient object to access its operations.
     */
    private final ClustersClient clusters;

    /**
     * Gets the ClustersClient object to access its operations.
     *
     * @return the ClustersClient object.
     */
    public ClustersClient getClusters() {
        return this.clusters;
    }

    /**
     * The NamespacesClient object to access its operations.
     */
    private final NamespacesClient namespaces;

    /**
     * Gets the NamespacesClient object to access its operations.
     *
     * @return the NamespacesClient object.
     */
    public NamespacesClient getNamespaces() {
        return this.namespaces;
    }

    /**
     * The PrivateEndpointConnectionsClient object to access its operations.
     */
    private final PrivateEndpointConnectionsClient privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    public PrivateEndpointConnectionsClient getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * The PrivateLinkResourcesClient object to access its operations.
     */
    private final PrivateLinkResourcesClient privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    public PrivateLinkResourcesClient getPrivateLinkResources() {
        return this.privateLinkResources;
    }

    /**
     * The NetworkSecurityPerimeterConfigurationsClient object to access its operations.
     */
    private final NetworkSecurityPerimeterConfigurationsClient networkSecurityPerimeterConfigurations;

    /**
     * Gets the NetworkSecurityPerimeterConfigurationsClient object to access its operations.
     *
     * @return the NetworkSecurityPerimeterConfigurationsClient object.
     */
    public NetworkSecurityPerimeterConfigurationsClient getNetworkSecurityPerimeterConfigurations() {
        return this.networkSecurityPerimeterConfigurations;
    }

    /**
     * The NetworkSecurityPerimeterConfigurationsOperationsClient object to access its operations.
     */
    private final NetworkSecurityPerimeterConfigurationsOperationsClient networkSecurityPerimeterConfigurationsOperations;

    /**
     * Gets the NetworkSecurityPerimeterConfigurationsOperationsClient object to access its operations.
     *
     * @return the NetworkSecurityPerimeterConfigurationsOperationsClient object.
     */
    public NetworkSecurityPerimeterConfigurationsOperationsClient
        getNetworkSecurityPerimeterConfigurationsOperations() {
        return this.networkSecurityPerimeterConfigurationsOperations;
    }

    /**
     * The ConfigurationsClient object to access its operations.
     */
    private final ConfigurationsClient configurations;

    /**
     * Gets the ConfigurationsClient object to access its operations.
     *
     * @return the ConfigurationsClient object.
     */
    public ConfigurationsClient getConfigurations() {
        return this.configurations;
    }

    /**
     * The DisasterRecoveryConfigsClient object to access its operations.
     */
    private final DisasterRecoveryConfigsClient disasterRecoveryConfigs;

    /**
     * Gets the DisasterRecoveryConfigsClient object to access its operations.
     *
     * @return the DisasterRecoveryConfigsClient object.
     */
    public DisasterRecoveryConfigsClient getDisasterRecoveryConfigs() {
        return this.disasterRecoveryConfigs;
    }

    /**
     * The EventHubsClient object to access its operations.
     */
    private final EventHubsClient eventHubs;

    /**
     * Gets the EventHubsClient object to access its operations.
     *
     * @return the EventHubsClient object.
     */
    public EventHubsClient getEventHubs() {
        return this.eventHubs;
    }

    /**
     * The ConsumerGroupsClient object to access its operations.
     */
    private final ConsumerGroupsClient consumerGroups;

    /**
     * Gets the ConsumerGroupsClient object to access its operations.
     *
     * @return the ConsumerGroupsClient object.
     */
    public ConsumerGroupsClient getConsumerGroups() {
        return this.consumerGroups;
    }

    /**
     * The OperationsClient object to access its operations.
     */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /**
     * The SchemaRegistriesClient object to access its operations.
     */
    private final SchemaRegistriesClient schemaRegistries;

    /**
     * Gets the SchemaRegistriesClient object to access its operations.
     *
     * @return the SchemaRegistriesClient object.
     */
    public SchemaRegistriesClient getSchemaRegistries() {
        return this.schemaRegistries;
    }

    /**
     * The ApplicationGroupsClient object to access its operations.
     */
    private final ApplicationGroupsClient applicationGroups;

    /**
     * Gets the ApplicationGroupsClient object to access its operations.
     *
     * @return the ApplicationGroupsClient object.
     */
    public ApplicationGroupsClient getApplicationGroups() {
        return this.applicationGroups;
    }

    /**
     * Initializes an instance of EventHubManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId Subscription credentials that uniquely identify a Microsoft Azure subscription. The
     * subscription ID forms part of the URI for every service call.
     * @param endpoint server parameter.
     */
    EventHubManagementClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter,
        Duration defaultPollInterval, AzureEnvironment environment, String subscriptionId, String endpoint) {
        super(httpPipeline, serializerAdapter, environment);
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2024-01-01";
        this.clusters = new ClustersClientImpl(this);
        this.namespaces = new NamespacesClientImpl(this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsClientImpl(this);
        this.privateLinkResources = new PrivateLinkResourcesClientImpl(this);
        this.networkSecurityPerimeterConfigurations = new NetworkSecurityPerimeterConfigurationsClientImpl(this);
        this.networkSecurityPerimeterConfigurationsOperations
            = new NetworkSecurityPerimeterConfigurationsOperationsClientImpl(this);
        this.configurations = new ConfigurationsClientImpl(this);
        this.disasterRecoveryConfigs = new DisasterRecoveryConfigsClientImpl(this);
        this.eventHubs = new EventHubsClientImpl(this);
        this.consumerGroups = new ConsumerGroupsClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.schemaRegistries = new SchemaRegistriesClientImpl(this);
        this.applicationGroups = new ApplicationGroupsClientImpl(this);
    }
}
