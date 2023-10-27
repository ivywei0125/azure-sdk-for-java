// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpdate;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpgradeSpec;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpgradeType;
import com.azure.resourcemanager.containerservicefleet.models.NodeImageSelection;
import com.azure.resourcemanager.containerservicefleet.models.NodeImageSelectionType;
import com.azure.resourcemanager.containerservicefleet.models.UpdateGroup;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRun;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRunStrategy;
import com.azure.resourcemanager.containerservicefleet.models.UpdateStage;
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

public final class UpdateRunsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"updateStrategyId\":\"fz\",\"strategy\":{\"stages\":[{\"name\":\"xxbuyq\",\"groups\":[{\"name\":\"feqztppriol\"},{\"name\":\"or\"},{\"name\":\"altol\"}],\"afterStageWaitInSeconds\":136991246}]},\"managedClusterUpdate\":{\"upgrade\":{\"type\":\"NodeImageOnly\",\"kubernetesVersion\":\"obqwcsdbnwdcfh\"},\"nodeImageSelection\":{\"type\":\"Consistent\"}},\"status\":{\"status\":{\"startTime\":\"2021-01-17T20:42:13Z\",\"completedTime\":\"2021-04-24T11:58:07Z\",\"state\":\"Running\"},\"stages\":[{\"status\":{},\"name\":\"nvxbvt\",\"groups\":[{}],\"afterStageWaitStatus\":{}},{\"status\":{},\"name\":\"cormr\",\"groups\":[{},{},{},{}],\"afterStageWaitStatus\":{}},{\"status\":{},\"name\":\"ofudflvkgju\",\"groups\":[{},{},{}],\"afterStageWaitStatus\":{}},{\"status\":{},\"name\":\"qvsaznqntorud\",\"groups\":[{},{}],\"afterStageWaitStatus\":{}}],\"nodeImageSelection\":{\"selectedNodeImageVersions\":[{},{},{}]}}},\"eTag\":\"c\",\"id\":\"auwjuetaebu\",\"name\":\"u\",\"type\":\"dmovsm\"}";

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

        ContainerServiceFleetManager manager =
            ContainerServiceFleetManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        UpdateRun response =
            manager
                .updateRuns()
                .define("hky")
                .withExistingFleet("duhpk", "kgymareqnajxqug")
                .withUpdateStrategyId("dgssofwqmzqal")
                .withStrategy(
                    new UpdateRunStrategy()
                        .withStages(
                            Arrays
                                .asList(
                                    new UpdateStage()
                                        .withName("njijpxacqqudf")
                                        .withGroups(
                                            Arrays
                                                .asList(
                                                    new UpdateGroup().withName("xbaaabjyv"),
                                                    new UpdateGroup().withName("yffimrzrtuzqogs"),
                                                    new UpdateGroup().withName("xnevfdnwn"),
                                                    new UpdateGroup().withName("mewzsyyc")))
                                        .withAfterStageWaitInSeconds(1576556557),
                                    new UpdateStage()
                                        .withName("soibjudpfrx")
                                        .withGroups(
                                            Arrays
                                                .asList(
                                                    new UpdateGroup().withName("hzv"),
                                                    new UpdateGroup().withName("ytdw"),
                                                    new UpdateGroup().withName("qbrqubpaxhexiili"),
                                                    new UpdateGroup().withName("pdtii")))
                                        .withAfterStageWaitInSeconds(1443311228),
                                    new UpdateStage()
                                        .withName("d")
                                        .withGroups(
                                            Arrays
                                                .asList(
                                                    new UpdateGroup().withName("xoruzfgsquyfxrx"),
                                                    new UpdateGroup().withName("l"),
                                                    new UpdateGroup().withName("ptramxj")))
                                        .withAfterStageWaitInSeconds(576385447),
                                    new UpdateStage()
                                        .withName("lwnwxuqlcvydyp")
                                        .withGroups(
                                            Arrays
                                                .asList(
                                                    new UpdateGroup().withName("ooaojkniodkooebw"),
                                                    new UpdateGroup().withName("ujhemmsbvdkcrodt"),
                                                    new UpdateGroup().withName("infwjlfltkacjve"),
                                                    new UpdateGroup().withName("kdlfoa")))
                                        .withAfterStageWaitInSeconds(1662630957))))
                .withManagedClusterUpdate(
                    new ManagedClusterUpdate()
                        .withUpgrade(
                            new ManagedClusterUpgradeSpec()
                                .withType(ManagedClusterUpgradeType.FULL)
                                .withKubernetesVersion("pagao"))
                        .withNodeImageSelection(new NodeImageSelection().withType(NodeImageSelectionType.CONSISTENT)))
                .withIfMatch("yhmlwpaztzp")
                .withIfNoneMatch("fn")
                .create();

        Assertions.assertEquals("fz", response.updateStrategyId());
        Assertions.assertEquals("xxbuyq", response.strategy().stages().get(0).name());
        Assertions.assertEquals("feqztppriol", response.strategy().stages().get(0).groups().get(0).name());
        Assertions.assertEquals(136991246, response.strategy().stages().get(0).afterStageWaitInSeconds());
        Assertions
            .assertEquals(ManagedClusterUpgradeType.NODE_IMAGE_ONLY, response.managedClusterUpdate().upgrade().type());
        Assertions.assertEquals("obqwcsdbnwdcfh", response.managedClusterUpdate().upgrade().kubernetesVersion());
        Assertions
            .assertEquals(
                NodeImageSelectionType.CONSISTENT, response.managedClusterUpdate().nodeImageSelection().type());
    }
}
