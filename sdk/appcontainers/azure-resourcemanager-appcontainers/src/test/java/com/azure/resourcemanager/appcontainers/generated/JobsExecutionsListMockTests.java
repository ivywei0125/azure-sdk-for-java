// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.appcontainers.ContainerAppsApiManager;
import com.azure.resourcemanager.appcontainers.models.JobExecution;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class JobsExecutionsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"name\":\"lfg\",\"id\":\"nnnoytz\",\"type\":\"sewxigpxvkqm\",\"status\":\"Running\",\"startTime\":\"2021-07-26T17:50:31Z\",\"endTime\":\"2021-01-19T22:27:27Z\",\"template\":{\"containers\":[{\"image\":\"ify\",\"name\":\"zeyuubeidszl\",\"command\":[\"oithg\"],\"args\":[\"fltgvdiho\",\"nkrxwetwkdrcy\"],\"env\":[{},{},{}],\"resources\":{\"cpu\":90.34799204771788,\"memory\":\"uzdqumoenod\",\"ephemeralStorage\":\"ienhqhskndnelq\"}}],\"initContainers\":[{\"image\":\"lknwfoanniyop\",\"name\":\"xivcnrlyxnu\",\"command\":[\"p\",\"blkwqpatvbqs\",\"tcjb\",\"tvivuzqym\"],\"args\":[\"wogtgitsq\"],\"env\":[{},{}],\"resources\":{\"cpu\":25.130681898907213,\"memory\":\"banf\",\"ephemeralStorage\":\"ds\"}},{\"image\":\"mxeatkdbmwnrdjy\",\"name\":\"q\",\"command\":[\"omhjrmkuhm\",\"xljalfihc\",\"mobcan\",\"de\"],\"args\":[\"cwg\",\"xf\",\"vaknokzwjj\",\"r\"],\"env\":[{},{},{}],\"resources\":{\"cpu\":55.14214526010209,\"memory\":\"yfytpq\",\"ephemeralStorage\":\"x\"}},{\"image\":\"m\",\"name\":\"jivyqlkjuv\",\"command\":[\"msl\",\"oyovwz\",\"bpqvybefg\"],\"args\":[\"nokcv\"],\"env\":[{},{},{},{}],\"resources\":{\"cpu\":75.35469796285636,\"memory\":\"vcuartrhun\",\"ephemeralStorage\":\"iryky\"}}]}}]}";

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

        ContainerAppsApiManager manager =
            ContainerAppsApiManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<JobExecution> response =
            manager.jobsExecutions().list("sykvwjtqpke", "myltj", "rspxklur", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("lfg", response.iterator().next().name());
        Assertions.assertEquals("nnnoytz", response.iterator().next().id());
        Assertions.assertEquals("sewxigpxvkqm", response.iterator().next().type());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-26T17:50:31Z"), response.iterator().next().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-19T22:27:27Z"), response.iterator().next().endTime());
        Assertions.assertEquals("ify", response.iterator().next().template().containers().get(0).image());
        Assertions.assertEquals("zeyuubeidszl", response.iterator().next().template().containers().get(0).name());
        Assertions.assertEquals("oithg", response.iterator().next().template().containers().get(0).command().get(0));
        Assertions.assertEquals("fltgvdiho", response.iterator().next().template().containers().get(0).args().get(0));
        Assertions
            .assertEquals(
                90.34799204771788D, response.iterator().next().template().containers().get(0).resources().cpu());
        Assertions
            .assertEquals(
                "uzdqumoenod", response.iterator().next().template().containers().get(0).resources().memory());
        Assertions.assertEquals("lknwfoanniyop", response.iterator().next().template().initContainers().get(0).image());
        Assertions.assertEquals("xivcnrlyxnu", response.iterator().next().template().initContainers().get(0).name());
        Assertions.assertEquals("p", response.iterator().next().template().initContainers().get(0).command().get(0));
        Assertions
            .assertEquals("wogtgitsq", response.iterator().next().template().initContainers().get(0).args().get(0));
        Assertions
            .assertEquals(
                25.130681898907213D, response.iterator().next().template().initContainers().get(0).resources().cpu());
        Assertions
            .assertEquals("banf", response.iterator().next().template().initContainers().get(0).resources().memory());
    }
}
