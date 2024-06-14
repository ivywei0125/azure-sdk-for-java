// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap;

import com.azure.analytics.purview.datamap.implementation.DataMapClientImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.client.traits.ConfigurationTrait;
import com.azure.core.client.traits.EndpointTrait;
import com.azure.core.client.traits.HttpTrait;
import com.azure.core.client.traits.TokenCredentialTrait;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.builder.ClientBuilderUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.JacksonAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * A builder for creating a new instance of the DataMapClient type.
 */
@ServiceClientBuilder(
    serviceClients = {
        EntityClient.class,
        GlossaryClient.class,
        DiscoveryClient.class,
        LineageClient.class,
        RelationshipClient.class,
        TypeDefinitionClient.class,
        EntityAsyncClient.class,
        GlossaryAsyncClient.class,
        DiscoveryAsyncClient.class,
        LineageAsyncClient.class,
        RelationshipAsyncClient.class,
        TypeDefinitionAsyncClient.class })
public final class DataMapClientBuilder
    implements HttpTrait<DataMapClientBuilder>, ConfigurationTrait<DataMapClientBuilder>,
    TokenCredentialTrait<DataMapClientBuilder>, EndpointTrait<DataMapClientBuilder> {
    @Generated
    private static final String SDK_NAME = "name";

    @Generated
    private static final String SDK_VERSION = "version";

    @Generated
    private static final String[] DEFAULT_SCOPES = new String[] { "https://purview.azure.net/.default" };

    @Generated
    private static final Map<String, String> PROPERTIES
        = CoreUtils.getProperties("azure-analytics-purview-datamap.properties");

    @Generated
    private final List<HttpPipelinePolicy> pipelinePolicies;

    /**
     * Create an instance of the DataMapClientBuilder.
     */
    @Generated
    public DataMapClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The HTTP pipeline to send requests through.
     */
    @Generated
    private HttpPipeline pipeline;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public DataMapClientBuilder pipeline(HttpPipeline pipeline) {
        if (this.pipeline != null && pipeline == null) {
            LOGGER.atInfo().log("HttpPipeline is being set to 'null' when it was previously configured.");
        }
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    @Generated
    private HttpClient httpClient;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public DataMapClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    @Generated
    private HttpLogOptions httpLogOptions;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public DataMapClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The client options such as application ID and custom headers to set on a request.
     */
    @Generated
    private ClientOptions clientOptions;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public DataMapClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /*
     * The retry options to configure retry policy for failed requests.
     */
    @Generated
    private RetryOptions retryOptions;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public DataMapClientBuilder retryOptions(RetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public DataMapClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        Objects.requireNonNull(customPolicy, "'customPolicy' cannot be null.");
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /*
     * The configuration store that is used during construction of the service client.
     */
    @Generated
    private Configuration configuration;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public DataMapClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The TokenCredential used for authentication.
     */
    @Generated
    private TokenCredential tokenCredential;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public DataMapClientBuilder credential(TokenCredential tokenCredential) {
        this.tokenCredential = tokenCredential;
        return this;
    }

    /*
     * The service endpoint
     */
    @Generated
    private String endpoint;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public DataMapClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * Service version
     */
    @Generated
    private PurviewDataMapServiceVersion serviceVersion;

    /**
     * Sets Service version.
     * 
     * @param serviceVersion the serviceVersion value.
     * @return the DataMapClientBuilder.
     */
    @Generated
    public DataMapClientBuilder serviceVersion(PurviewDataMapServiceVersion serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if applicable.
     */
    @Generated
    private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     * 
     * @param retryPolicy the retryPolicy value.
     * @return the DataMapClientBuilder.
     */
    @Generated
    public DataMapClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Builds an instance of DataMapClientImpl with the provided parameters.
     * 
     * @return an instance of DataMapClientImpl.
     */
    @Generated
    private DataMapClientImpl buildInnerClient() {
        this.validateClient();
        HttpPipeline localPipeline = (pipeline != null) ? pipeline : createHttpPipeline();
        PurviewDataMapServiceVersion localServiceVersion
            = (serviceVersion != null) ? serviceVersion : PurviewDataMapServiceVersion.getLatest();
        DataMapClientImpl client = new DataMapClientImpl(localPipeline, JacksonAdapter.createDefaultSerializerAdapter(),
            this.endpoint, localServiceVersion);
        return client;
    }

    @Generated
    private void validateClient() {
        // This method is invoked from 'buildInnerClient'/'buildClient' method.
        // Developer can customize this method, to validate that the necessary conditions are met for the new client.
        Objects.requireNonNull(endpoint, "'endpoint' cannot be null.");
    }

    @Generated
    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration
            = (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        HttpLogOptions localHttpLogOptions = this.httpLogOptions == null ? new HttpLogOptions() : this.httpLogOptions;
        ClientOptions localClientOptions = this.clientOptions == null ? new ClientOptions() : this.clientOptions;
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        String clientName = PROPERTIES.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = PROPERTIES.getOrDefault(SDK_VERSION, "UnknownVersion");
        String applicationId = CoreUtils.getApplicationId(localClientOptions, localHttpLogOptions);
        policies.add(new UserAgentPolicy(applicationId, clientName, clientVersion, buildConfiguration));
        policies.add(new RequestIdPolicy());
        policies.add(new AddHeadersFromContextPolicy());
        HttpHeaders headers = CoreUtils.createHttpHeadersFromClientOptions(localClientOptions);
        if (headers != null) {
            policies.add(new AddHeadersPolicy(headers));
        }
        this.pipelinePolicies.stream()
            .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
            .forEach(p -> policies.add(p));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(ClientBuilderUtil.validateAndGetRetryPolicy(retryPolicy, retryOptions, new RetryPolicy()));
        policies.add(new AddDatePolicy());
        if (tokenCredential != null) {
            policies.add(new BearerTokenAuthenticationPolicy(tokenCredential, DEFAULT_SCOPES));
        }
        this.pipelinePolicies.stream()
            .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
            .forEach(p -> policies.add(p));
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(localHttpLogOptions));
        HttpPipeline httpPipeline = new HttpPipelineBuilder().policies(policies.toArray(new HttpPipelinePolicy[0]))
            .httpClient(httpClient)
            .clientOptions(localClientOptions)
            .build();
        return httpPipeline;
    }

    /**
     * Builds an instance of EntityAsyncClient class.
     * 
     * @return an instance of EntityAsyncClient.
     */
    @Generated
    public EntityAsyncClient buildEntityAsyncClient() {
        return new EntityAsyncClient(buildInnerClient().getEntities());
    }

    /**
     * Builds an instance of GlossaryAsyncClient class.
     * 
     * @return an instance of GlossaryAsyncClient.
     */
    @Generated
    public GlossaryAsyncClient buildGlossaryAsyncClient() {
        return new GlossaryAsyncClient(buildInnerClient().getGlossaries());
    }

    /**
     * Builds an instance of DiscoveryAsyncClient class.
     * 
     * @return an instance of DiscoveryAsyncClient.
     */
    @Generated
    public DiscoveryAsyncClient buildDiscoveryAsyncClient() {
        return new DiscoveryAsyncClient(buildInnerClient().getDiscoveries());
    }

    /**
     * Builds an instance of LineageAsyncClient class.
     * 
     * @return an instance of LineageAsyncClient.
     */
    @Generated
    public LineageAsyncClient buildLineageAsyncClient() {
        return new LineageAsyncClient(buildInnerClient().getLineages());
    }

    /**
     * Builds an instance of RelationshipAsyncClient class.
     * 
     * @return an instance of RelationshipAsyncClient.
     */
    @Generated
    public RelationshipAsyncClient buildRelationshipAsyncClient() {
        return new RelationshipAsyncClient(buildInnerClient().getRelationships());
    }

    /**
     * Builds an instance of TypeDefinitionAsyncClient class.
     * 
     * @return an instance of TypeDefinitionAsyncClient.
     */
    @Generated
    public TypeDefinitionAsyncClient buildTypeDefinitionAsyncClient() {
        return new TypeDefinitionAsyncClient(buildInnerClient().getTypeDefinitions());
    }

    /**
     * Builds an instance of EntityClient class.
     * 
     * @return an instance of EntityClient.
     */
    @Generated
    public EntityClient buildEntityClient() {
        return new EntityClient(buildInnerClient().getEntities());
    }

    /**
     * Builds an instance of GlossaryClient class.
     * 
     * @return an instance of GlossaryClient.
     */
    @Generated
    public GlossaryClient buildGlossaryClient() {
        return new GlossaryClient(buildInnerClient().getGlossaries());
    }

    /**
     * Builds an instance of DiscoveryClient class.
     * 
     * @return an instance of DiscoveryClient.
     */
    @Generated
    public DiscoveryClient buildDiscoveryClient() {
        return new DiscoveryClient(buildInnerClient().getDiscoveries());
    }

    /**
     * Builds an instance of LineageClient class.
     * 
     * @return an instance of LineageClient.
     */
    @Generated
    public LineageClient buildLineageClient() {
        return new LineageClient(buildInnerClient().getLineages());
    }

    /**
     * Builds an instance of RelationshipClient class.
     * 
     * @return an instance of RelationshipClient.
     */
    @Generated
    public RelationshipClient buildRelationshipClient() {
        return new RelationshipClient(buildInnerClient().getRelationships());
    }

    /**
     * Builds an instance of TypeDefinitionClient class.
     * 
     * @return an instance of TypeDefinitionClient.
     */
    @Generated
    public TypeDefinitionClient buildTypeDefinitionClient() {
        return new TypeDefinitionClient(buildInnerClient().getTypeDefinitions());
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataMapClientBuilder.class);
}
