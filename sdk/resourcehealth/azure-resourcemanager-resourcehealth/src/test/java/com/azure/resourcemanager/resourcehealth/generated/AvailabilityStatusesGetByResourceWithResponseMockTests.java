// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.resourcehealth.ResourceHealthManager;
import com.azure.resourcemanager.resourcehealth.models.AvailabilityStateValues;
import com.azure.resourcemanager.resourcehealth.models.AvailabilityStatus;
import com.azure.resourcemanager.resourcehealth.models.ReasonChronicityTypes;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AvailabilityStatusesGetByResourceWithResponseMockTests {
    @Test
    public void testGetByResourceWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"id\":\"rtawcoezb\",\"name\":\"ubskhudygoookkq\",\"type\":\"jb\",\"location\":\"eorfm\",\"properties\":{\"availabilityState\":\"Degraded\",\"title\":\"qzfavyv\",\"summary\":\"qybaryeua\",\"detailedStatus\":\"kq\",\"reasonType\":\"qgzsles\",\"context\":\"bhernntiew\",\"category\":\"cv\",\"articleId\":\"uwrbehwagoh\",\"rootCauseAttributionTime\":\"2021-11-19T12:22:46Z\",\"healthEventType\":\"kmr\",\"healthEventCause\":\"mvvhmxtdrjfuta\",\"healthEventCategory\":\"ebjvewzcjzn\",\"healthEventId\":\"cpmguaadraufact\",\"resolutionETA\":\"2021-01-01T13:50:02Z\",\"occuredTime\":\"2021-03-01T13:31:29Z\",\"reasonChronicity\":\"Persistent\",\"reportedTime\":\"2021-02-27T13:49:15Z\",\"recentlyResolved\":{\"unavailableOccuredTime\":\"2021-03-14T01:25:46Z\",\"resolvedTime\":\"2021-02-20T11:59:59Z\",\"unavailableSummary\":\"s\"},\"recommendedActions\":[{\"action\":\"kulfg\",\"actionUrl\":\"qubkw\",\"_ActionUrl.Comment\":\"enr\",\"actionUrlText\":\"utujba\"},{\"action\":\"juohminyflnorw\",\"actionUrl\":\"uvwpklvxwmyg\",\"_ActionUrl.Comment\":\"pgpqchiszepnnb\",\"actionUrlText\":\"rxgibbd\"},{\"action\":\"confozauors\",\"actionUrl\":\"okwbqplh\",\"_ActionUrl.Comment\":\"nuuepzlrp\",\"actionUrlText\":\"zsoldwey\"},{\"action\":\"dunvmnnrwrbiorkt\",\"actionUrl\":\"ywjhhgdnhx\",\"_ActionUrl.Comment\":\"ivfomiloxgg\",\"actionUrlText\":\"fi\"}],\"serviceImpactingEvents\":[{\"eventStartTime\":\"2021-01-10T04:07:58Z\",\"eventStatusLastModifiedTime\":\"2021-02-15T07:57:44Z\",\"correlationId\":\"ofjchvcyyysf\",\"status\":{\"value\":\"tcubiipuipwoqonm\"},\"incidentProperties\":{\"title\":\"ekni\",\"service\":\"hqvcimpevfgmblr\",\"region\":\"lbywdxsm\",\"incidentType\":\"cwrwfs\"}},{\"eventStartTime\":\"2021-11-21T10:18:25Z\",\"eventStatusLastModifiedTime\":\"2021-01-04T01:05:07Z\",\"correlationId\":\"szqujizdvoq\",\"status\":{\"value\":\"byowbblgyavutp\"},\"incidentProperties\":{\"title\":\"oxoismsksbpim\",\"service\":\"oljxkcgx\",\"region\":\"xsffgcviz\",\"incidentType\":\"dwl\"}},{\"eventStartTime\":\"2021-04-04T23:05:36Z\",\"eventStatusLastModifiedTime\":\"2021-03-22T22:39:30Z\",\"correlationId\":\"pfgfbkjub\",\"status\":{\"value\":\"gkfmins\"},\"incidentProperties\":{\"title\":\"zfttsttktlahb\",\"service\":\"ctxtgzukxi\",\"region\":\"m\",\"incidentType\":\"gqqqxh\"}}]}}";

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

        ResourceHealthManager manager =
            ResourceHealthManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        AvailabilityStatus response =
            manager
                .availabilityStatuses()
                .getByResourceWithResponse("kdl", "wqfbumlkxtrqjfsm", "mbtxhwgf", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("rtawcoezb", response.id());
        Assertions.assertEquals("ubskhudygoookkq", response.name());
        Assertions.assertEquals("jb", response.type());
        Assertions.assertEquals("eorfm", response.location());
        Assertions.assertEquals(AvailabilityStateValues.DEGRADED, response.properties().availabilityState());
        Assertions.assertEquals("qzfavyv", response.properties().title());
        Assertions.assertEquals("qybaryeua", response.properties().summary());
        Assertions.assertEquals("kq", response.properties().detailedStatus());
        Assertions.assertEquals("qgzsles", response.properties().reasonType());
        Assertions.assertEquals("bhernntiew", response.properties().context());
        Assertions.assertEquals("cv", response.properties().category());
        Assertions.assertEquals("uwrbehwagoh", response.properties().articleId());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-11-19T12:22:46Z"), response.properties().rootCauseAttributionTime());
        Assertions.assertEquals("kmr", response.properties().healthEventType());
        Assertions.assertEquals("mvvhmxtdrjfuta", response.properties().healthEventCause());
        Assertions.assertEquals("ebjvewzcjzn", response.properties().healthEventCategory());
        Assertions.assertEquals("cpmguaadraufact", response.properties().healthEventId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-01T13:50:02Z"), response.properties().resolutionEta());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-01T13:31:29Z"), response.properties().occuredTime());
        Assertions.assertEquals(ReasonChronicityTypes.PERSISTENT, response.properties().reasonChronicity());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-27T13:49:15Z"), response.properties().reportedTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-03-14T01:25:46Z"),
                response.properties().recentlyResolved().unavailableOccuredTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-02-20T11:59:59Z"), response.properties().recentlyResolved().resolvedTime());
        Assertions.assertEquals("s", response.properties().recentlyResolved().unavailableSummary());
        Assertions.assertEquals("kulfg", response.properties().recommendedActions().get(0).action());
        Assertions.assertEquals("qubkw", response.properties().recommendedActions().get(0).actionUrl());
        Assertions.assertEquals("utujba", response.properties().recommendedActions().get(0).actionUrlText());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-01-10T04:07:58Z"),
                response.properties().serviceImpactingEvents().get(0).eventStartTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-02-15T07:57:44Z"),
                response.properties().serviceImpactingEvents().get(0).eventStatusLastModifiedTime());
        Assertions.assertEquals("ofjchvcyyysf", response.properties().serviceImpactingEvents().get(0).correlationId());
        Assertions
            .assertEquals("tcubiipuipwoqonm", response.properties().serviceImpactingEvents().get(0).status().value());
        Assertions
            .assertEquals("ekni", response.properties().serviceImpactingEvents().get(0).incidentProperties().title());
        Assertions
            .assertEquals(
                "hqvcimpevfgmblr",
                response.properties().serviceImpactingEvents().get(0).incidentProperties().service());
        Assertions
            .assertEquals(
                "lbywdxsm", response.properties().serviceImpactingEvents().get(0).incidentProperties().region());
        Assertions
            .assertEquals(
                "cwrwfs", response.properties().serviceImpactingEvents().get(0).incidentProperties().incidentType());
    }
}
