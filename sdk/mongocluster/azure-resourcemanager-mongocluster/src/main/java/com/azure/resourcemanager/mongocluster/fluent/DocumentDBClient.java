// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for DocumentDBClient class.
 */
public interface DocumentDBClient {
    /**
     * Gets Server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Version parameter.
     * 
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The ID of the target subscription. The value must be an UUID.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the MongoClustersClient object to access its operations.
     * 
     * @return the MongoClustersClient object.
     */
    MongoClustersClient getMongoClusters();

    /**
     * Gets the FirewallRulesClient object to access its operations.
     * 
     * @return the FirewallRulesClient object.
     */
    FirewallRulesClient getFirewallRules();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     * 
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the PrivateLinksClient object to access its operations.
     * 
     * @return the PrivateLinksClient object.
     */
    PrivateLinksClient getPrivateLinks();
}
