// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.managedprivateendpoints.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/**
 * Initializes a new instance of the ManagedPrivateEndpointsClient type.
 */
public final class ManagedPrivateEndpointsClientImpl {
    /**
     * The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     */
    private final String endpoint;

    /**
     * Gets The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
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
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * The ManagedPrivateEndpointsImpl object to access its operations.
     */
    private final ManagedPrivateEndpointsImpl managedPrivateEndpoints;

    /**
     * Gets the ManagedPrivateEndpointsImpl object to access its operations.
     * 
     * @return the ManagedPrivateEndpointsImpl object.
     */
    public ManagedPrivateEndpointsImpl getManagedPrivateEndpoints() {
        return this.managedPrivateEndpoints;
    }

    /**
     * Initializes an instance of ManagedPrivateEndpointsClient client.
     * 
     * @param endpoint The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     * @param apiVersion Api Version.
     */
    public ManagedPrivateEndpointsClientImpl(String endpoint, String apiVersion) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), endpoint, apiVersion);
    }

    /**
     * Initializes an instance of ManagedPrivateEndpointsClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     * @param apiVersion Api Version.
     */
    public ManagedPrivateEndpointsClientImpl(HttpPipeline httpPipeline, String endpoint, String apiVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, apiVersion);
    }

    /**
     * Initializes an instance of ManagedPrivateEndpointsClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     * @param apiVersion Api Version.
     */
    public ManagedPrivateEndpointsClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter,
        String endpoint, String apiVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.apiVersion = apiVersion;
        this.managedPrivateEndpoints = new ManagedPrivateEndpointsImpl(this);
    }
}
