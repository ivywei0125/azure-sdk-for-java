// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation;

import com.azure.cosmos.implementation.AsyncDocumentClient.Builder;
import com.azure.cosmos.implementation.http.HttpRequest;
import com.azure.cosmos.models.CosmosItemRequestOptions;
import com.azure.cosmos.models.CosmosQueryRequestOptions;
import com.azure.cosmos.models.DedicatedGatewayRequestOptions;
import com.azure.cosmos.models.ModelBridgeInternal;
import com.azure.cosmos.models.PartitionKey;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RequestHeadersSpyWireTest extends TestSuiteBase {

    private static final String DOCUMENT_ID = UUID.randomUUID().toString();

    private Database createdDatabase;
    private DocumentCollection createdCollection;

    private SpyClientUnderTestFactory.ClientUnderTest client;

    public String getDocumentCollectionLink() {
        return TestUtils.getCollectionNameLink(createdDatabase.getId(), createdCollection.getId());
    }

    public String getDocumentLink() {
        return TestUtils.getDocumentNameLink(createdDatabase.getId(), createdCollection.getId(), DOCUMENT_ID);
    }

    @Factory(dataProvider = "clientBuilders")
    public RequestHeadersSpyWireTest(Builder clientBuilder) {
        super(clientBuilder);
    }

    @DataProvider(name="cacheBypassValues")
    public Object[][] cacheBypassValues()
    {
        Object [][] values = {{true}, {false}};
        return values;
    }

    @DataProvider(name = "maxIntegratedCacheStalenessDurationProviderQueryOptions")
    public static Object[][] maxIntegratedCacheStalenessDurationProviderQueryOptions() {

        String query = "Select * from r";

        DedicatedGatewayRequestOptions dedicatedOptions1 = new DedicatedGatewayRequestOptions();
        dedicatedOptions1.setMaxIntegratedCacheStaleness(Duration.ofMinutes(2));
        dedicatedOptions1.setIntegratedCacheBypassed(true);
        CosmosQueryRequestOptions options1 = new CosmosQueryRequestOptions();
        options1.setDedicatedGatewayRequestOptions(dedicatedOptions1);

        DedicatedGatewayRequestOptions dedicatedOptions2 = new DedicatedGatewayRequestOptions();
        dedicatedOptions2.setMaxIntegratedCacheStaleness(Duration.ofHours(5));
        dedicatedOptions2.setIntegratedCacheBypassed(false);
        CosmosQueryRequestOptions options2 = new CosmosQueryRequestOptions();
        options2.setDedicatedGatewayRequestOptions(dedicatedOptions2);

        DedicatedGatewayRequestOptions dedicatedOptions3 = new DedicatedGatewayRequestOptions();
        dedicatedOptions3.setMaxIntegratedCacheStaleness(Duration.ofSeconds(10));
        CosmosQueryRequestOptions options3 = new CosmosQueryRequestOptions();
        options3.setDedicatedGatewayRequestOptions(dedicatedOptions3);

        DedicatedGatewayRequestOptions dedicatedOptions4 = new DedicatedGatewayRequestOptions();
        dedicatedOptions4.setMaxIntegratedCacheStaleness(Duration.ofMillis(500));
        dedicatedOptions4.setIntegratedCacheBypassed(true);
        CosmosQueryRequestOptions options4 = new CosmosQueryRequestOptions();
        options4.setDedicatedGatewayRequestOptions(dedicatedOptions4);

        return new Object[][] {
            { options1, query },
            { options2, query },
            { options3, query },
            { options4, query },
        };
    }

    @DataProvider(name = "maxIntegratedCacheStalenessDurationProviderItemOptions")
    public static Object[][] maxIntegratedCacheStalenessDurationProviderItemOptions() {

        DedicatedGatewayRequestOptions dedicatedOptions1 = new DedicatedGatewayRequestOptions();
        dedicatedOptions1.setMaxIntegratedCacheStaleness(Duration.ofMinutes(2));
        dedicatedOptions1.setIntegratedCacheBypassed(true);
        CosmosItemRequestOptions options1 = new CosmosItemRequestOptions();
        options1.setDedicatedGatewayRequestOptions(dedicatedOptions1);

        DedicatedGatewayRequestOptions dedicatedOptions2 = new DedicatedGatewayRequestOptions();
        dedicatedOptions2.setMaxIntegratedCacheStaleness(Duration.ofHours(5));
        dedicatedOptions2.setIntegratedCacheBypassed(false);
        CosmosItemRequestOptions options2 = new CosmosItemRequestOptions();
        options2.setDedicatedGatewayRequestOptions(dedicatedOptions2);

        DedicatedGatewayRequestOptions dedicatedOptions3 = new DedicatedGatewayRequestOptions();
        dedicatedOptions3.setMaxIntegratedCacheStaleness(Duration.ofSeconds(10));
        CosmosItemRequestOptions options3 = new CosmosItemRequestOptions();
        options3.setDedicatedGatewayRequestOptions(dedicatedOptions3);

        DedicatedGatewayRequestOptions dedicatedOptions4 = new DedicatedGatewayRequestOptions();
        dedicatedOptions4.setMaxIntegratedCacheStaleness(Duration.ofMillis(500));
        dedicatedOptions4.setIntegratedCacheBypassed(true);
        CosmosItemRequestOptions options4 = new CosmosItemRequestOptions();
        options4.setDedicatedGatewayRequestOptions(dedicatedOptions4);

        return new Object[][] {
            { options1 },
            { options2 },
            { options3 },
            { options4 },
        };
    }

    @Test(dataProvider = "maxIntegratedCacheStalenessDurationProviderQueryOptions", groups = { "fast" }, timeOut =
        TIMEOUT)
    public void queryWithMaxIntegratedCacheStaleness(CosmosQueryRequestOptions options, String query) {
        String collectionLink = getDocumentCollectionLink();

        client.clearCapturedRequests();

        client.queryDocuments(
            collectionLink,
            query,
            TestUtils.createDummyQueryFeedOperationState(ResourceType.Document, OperationType.Query, options, client),
            Document.class).blockLast();

        List<HttpRequest> requests = client.getCapturedRequests();
        for (HttpRequest httpRequest : requests) {
            validateRequestHasDedicatedGatewayHeaders(httpRequest, options.getDedicatedGatewayRequestOptions());
        }
    }

    @Test(groups = { "fast" }, timeOut = TIMEOUT)
    public void queryWithMaxIntegratedCacheStalenessInNanoseconds() {
        DedicatedGatewayRequestOptions dedicatedOptions = new DedicatedGatewayRequestOptions();
        dedicatedOptions.setMaxIntegratedCacheStaleness(Duration.ofNanos(100));
        CosmosQueryRequestOptions cosmosQueryRequestOptions = new CosmosQueryRequestOptions();
        cosmosQueryRequestOptions.setDedicatedGatewayRequestOptions(dedicatedOptions);
        String query = "Select * from r";

        String collectionLink = getDocumentCollectionLink();

        client.clearCapturedRequests();

        QueryFeedOperationState state = TestUtils.createDummyQueryFeedOperationState(
            ResourceType.Document,
            OperationType.Query,
            cosmosQueryRequestOptions,
            client
        );

        assertThatThrownBy(() -> client
            .queryDocuments(collectionLink, query, state, Document.class)
            .blockLast())
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("MaxIntegratedCacheStaleness granularity is milliseconds");
    }

    @Test(groups = { "fast" }, timeOut = TIMEOUT)
    public void queryWithMaxIntegratedCacheStalenessInNegative() {
        DedicatedGatewayRequestOptions dedicatedOptions = new DedicatedGatewayRequestOptions();
        dedicatedOptions.setMaxIntegratedCacheStaleness(Duration.ofSeconds(-10));
        CosmosQueryRequestOptions cosmosQueryRequestOptions = new CosmosQueryRequestOptions();
        cosmosQueryRequestOptions.setDedicatedGatewayRequestOptions(dedicatedOptions);
        String query = "Select * from r";

        String collectionLink = getDocumentCollectionLink();

        QueryFeedOperationState state = TestUtils.createDummyQueryFeedOperationState(
            ResourceType.Document,
            OperationType.Query,
            cosmosQueryRequestOptions,
            client
        );

        client.clearCapturedRequests();

        assertThatThrownBy(() -> client
            .queryDocuments(collectionLink, query, state, Document.class)
            .blockLast())
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("MaxIntegratedCacheStaleness duration cannot be negative");
    }

    @Test(dataProvider = "maxIntegratedCacheStalenessDurationProviderItemOptions", groups = { "fast" }, timeOut =
        TIMEOUT)
    public void readItemWithMaxIntegratedCacheStaleness(CosmosItemRequestOptions cosmosItemRequestOptions) {
        String documentLink = getDocumentLink();

        client.clearCapturedRequests();

        RequestOptions requestOptions = ModelBridgeInternal.toRequestOptions(cosmosItemRequestOptions);
        requestOptions.setPartitionKey(new PartitionKey(DOCUMENT_ID));
        client.readDocument(documentLink, requestOptions).block();

        List<HttpRequest> requests = client.getCapturedRequests();
        for (HttpRequest httpRequest : requests) {
            validateRequestHasDedicatedGatewayHeaders(httpRequest,
                cosmosItemRequestOptions.getDedicatedGatewayRequestOptions());
        }
    }

    @Test(groups = { "fast" }, timeOut = TIMEOUT)
    public void readItemWithMaxIntegratedCacheStalenessInNanoseconds() {
        DedicatedGatewayRequestOptions dedicatedOptions = new DedicatedGatewayRequestOptions();
        dedicatedOptions.setMaxIntegratedCacheStaleness(Duration.ofNanos(100));
        CosmosItemRequestOptions cosmosItemRequestOptions = new CosmosItemRequestOptions();
        cosmosItemRequestOptions.setDedicatedGatewayRequestOptions(dedicatedOptions);

        String documentLink = getDocumentLink();

        client.clearCapturedRequests();
        RequestOptions requestOptions = ModelBridgeInternal.toRequestOptions(cosmosItemRequestOptions);
        requestOptions.setPartitionKey(new PartitionKey(DOCUMENT_ID));

        assertThatThrownBy(() -> client.readDocument(documentLink, requestOptions).block())
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("MaxIntegratedCacheStaleness granularity is milliseconds");
    }

    @Test(groups = { "fast" }, timeOut = TIMEOUT)
    public void readItemWithMaxIntegratedCacheStalenessInNegative() {
        DedicatedGatewayRequestOptions dedicatedOptions = new DedicatedGatewayRequestOptions();
        dedicatedOptions.setMaxIntegratedCacheStaleness(Duration.ofMillis(-500));
        CosmosItemRequestOptions cosmosItemRequestOptions = new CosmosItemRequestOptions();
        cosmosItemRequestOptions.setDedicatedGatewayRequestOptions(dedicatedOptions);

        String documentLink = getDocumentLink();

        client.clearCapturedRequests();
        RequestOptions requestOptions = ModelBridgeInternal.toRequestOptions(cosmosItemRequestOptions);
        requestOptions.setPartitionKey(new PartitionKey(DOCUMENT_ID));

        assertThatThrownBy(() -> client.readDocument(documentLink, requestOptions).block())
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("MaxIntegratedCacheStaleness duration cannot be negative");
    }

    @Ignore // This test has to be run against sqlx endpoint
    @Test(groups = { "fast" }, timeOut = TIMEOUT, dataProvider = "cacheBypassValues")
    public void readItemWithCacheBypass(boolean cacheBypass) {
        DedicatedGatewayRequestOptions dedicatedGatewayRequestOptions = new DedicatedGatewayRequestOptions();
        dedicatedGatewayRequestOptions.setMaxIntegratedCacheStaleness((Duration.ofMillis(500)));
        dedicatedGatewayRequestOptions.setIntegratedCacheBypassed(cacheBypass);
        CosmosItemRequestOptions cosmosItemRequestOptions = new CosmosItemRequestOptions();
        cosmosItemRequestOptions.setDedicatedGatewayRequestOptions(dedicatedGatewayRequestOptions);

        String documentLink = getDocumentLink();

        client.clearCapturedRequests();

        RequestOptions requestOptions = ModelBridgeInternal.toRequestOptions(cosmosItemRequestOptions);
        requestOptions.setPartitionKey(new PartitionKey(DOCUMENT_ID));
        ResourceResponse<Document> response = client.readDocument(documentLink, requestOptions).block();
        if (cacheBypass) {
            String responseHeader = response.getResponseHeaders().get("x-ms-cosmos-cache-bypass");
            assertThat(responseHeader).isNotNull();
            assertThat(Boolean.parseBoolean(responseHeader)).isTrue();
        }
        else {
            assertThat(response.getResponseHeaders().containsKey("x-ms-cosmos-cache-bypass")).isFalse();
        }
    }

    private void validateRequestHasDedicatedGatewayHeaders(HttpRequest httpRequest,
                                                           DedicatedGatewayRequestOptions options) {
        Map<String, String> headers = httpRequest.headers().toMap();
        if (headers.get(HttpConstants.HttpHeaders.IS_QUERY) != null) {
            assertThat(headers.containsKey(HttpConstants.HttpHeaders.DEDICATED_GATEWAY_PER_REQUEST_CACHE_STALENESS)).isTrue();
            String durationInMillis =
                headers.get(HttpConstants.HttpHeaders.DEDICATED_GATEWAY_PER_REQUEST_CACHE_STALENESS);
            assertThat(durationInMillis).isEqualTo(String.valueOf(options
                .getMaxIntegratedCacheStaleness()
                .toMillis()));
            if (options.isIntegratedCacheBypassed()) {
                assertThat(headers.containsKey(HttpConstants.HttpHeaders.DEDICATED_GATEWAY_PER_REQUEST_BYPASS_CACHE)).isTrue();
                String bypassIntegratedCache =
                    headers.get(HttpConstants.HttpHeaders.DEDICATED_GATEWAY_PER_REQUEST_BYPASS_CACHE);
                assertThat(bypassIntegratedCache).isEqualTo(String.valueOf(options.isIntegratedCacheBypassed()));
            } else {
                assertThat(headers.containsKey(HttpConstants.HttpHeaders.DEDICATED_GATEWAY_PER_REQUEST_BYPASS_CACHE)).isFalse();
            }
        }
    }

    @BeforeClass(groups = { "fast" }, timeOut = SETUP_TIMEOUT)
    public void before_DocumentQuerySpyWireContentTest() throws Exception {

        client = new SpyClientBuilder(this.clientBuilder()).build();

        createdDatabase = SHARED_DATABASE;
        createdCollection = SHARED_SINGLE_PARTITION_COLLECTION;
        truncateCollection(SHARED_SINGLE_PARTITION_COLLECTION);

        client.createDocument(getCollectionLink(createdCollection),
            getDocumentDefinition(), null, false).block();
    }

    @AfterClass(groups = { "fast" }, timeOut = SHUTDOWN_TIMEOUT, alwaysRun = true)
    public void afterClass() {
        safeClose(client);
    }

    private static Document getDocumentDefinition() {
        return new Document(String.format("{ "
                + "\"id\": \"%s\", "
                + "\"prop\" : %d, "
                + "\"mypk\": \"%s\", "
                + "\"sgmts\": [[6519456, 1471916863], [2498434, 1455671440]]"
                + "}"
            , DOCUMENT_ID, 0, DOCUMENT_ID));
    }
}
