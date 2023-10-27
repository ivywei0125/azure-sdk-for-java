// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.datadog.MicrosoftDatadogManager;
import com.azure.resourcemanager.datadog.models.FilteringTag;
import com.azure.resourcemanager.datadog.models.LogRules;
import com.azure.resourcemanager.datadog.models.MetricRules;
import com.azure.resourcemanager.datadog.models.MonitoringTagRules;
import com.azure.resourcemanager.datadog.models.MonitoringTagRulesProperties;
import com.azure.resourcemanager.datadog.models.TagAction;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class TagRulesCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"logRules\":{\"sendAadLogs\":true,\"sendSubscriptionLogs\":false,\"sendResourceLogs\":true,\"filteringTags\":[{\"name\":\"nayqi\",\"value\":\"nduhavhqlkthum\",\"action\":\"Exclude\"}]},\"metricRules\":{\"filteringTags\":[{\"name\":\"cdui\",\"value\":\"tgccymvaolpss\",\"action\":\"Exclude\"},{\"name\":\"mmdnbbglzps\",\"value\":\"ydmcwyhzdxssa\",\"action\":\"Exclude\"}]},\"automuting\":true},\"id\":\"dfznudaodv\",\"name\":\"zbn\",\"type\":\"blylpstdbh\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MicrosoftDatadogManager manager =
            MicrosoftDatadogManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        MonitoringTagRules response =
            manager
                .tagRules()
                .define("qzvszjf")
                .withExistingMonitor("xjyngudivk", "tswb")
                .withProperties(
                    new MonitoringTagRulesProperties()
                        .withLogRules(
                            new LogRules()
                                .withSendAadLogs(false)
                                .withSendSubscriptionLogs(false)
                                .withSendResourceLogs(false)
                                .withFilteringTags(
                                    Arrays
                                        .asList(
                                            new FilteringTag()
                                                .withName("cqaqtdoqmcbx")
                                                .withValue("vxysl")
                                                .withAction(TagAction.EXCLUDE),
                                            new FilteringTag()
                                                .withName("fxoblytkb")
                                                .withValue("pe")
                                                .withAction(TagAction.EXCLUDE),
                                            new FilteringTag()
                                                .withName("bkrvrnsvshqj")
                                                .withValue("xc")
                                                .withAction(TagAction.EXCLUDE))))
                        .withMetricRules(
                            new MetricRules()
                                .withFilteringTags(
                                    Arrays
                                        .asList(
                                            new FilteringTag()
                                                .withName("srruvwbhsqfsubcg")
                                                .withValue("irx")
                                                .withAction(TagAction.EXCLUDE),
                                            new FilteringTag()
                                                .withName("srfbjfdtwss")
                                                .withValue("ftpvjzbexil")
                                                .withAction(TagAction.INCLUDE),
                                            new FilteringTag()
                                                .withName("qqnvwpmq")
                                                .withValue("ruoujmk")
                                                .withAction(TagAction.INCLUDE))))
                        .withAutomuting(true))
                .create();

        Assertions.assertEquals(true, response.properties().logRules().sendAadLogs());
        Assertions.assertEquals(false, response.properties().logRules().sendSubscriptionLogs());
        Assertions.assertEquals(true, response.properties().logRules().sendResourceLogs());
        Assertions.assertEquals("nayqi", response.properties().logRules().filteringTags().get(0).name());
        Assertions.assertEquals("nduhavhqlkthum", response.properties().logRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.EXCLUDE, response.properties().logRules().filteringTags().get(0).action());
        Assertions.assertEquals("cdui", response.properties().metricRules().filteringTags().get(0).name());
        Assertions.assertEquals("tgccymvaolpss", response.properties().metricRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.EXCLUDE, response.properties().metricRules().filteringTags().get(0).action());
        Assertions.assertEquals(true, response.properties().automuting());
    }
}
