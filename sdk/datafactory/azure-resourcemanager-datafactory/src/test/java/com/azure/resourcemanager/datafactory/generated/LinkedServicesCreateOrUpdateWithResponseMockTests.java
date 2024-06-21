// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.LinkedService;
import com.azure.resourcemanager.datafactory.models.LinkedServiceResource;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class LinkedServicesCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"type\":\"LinkedService\",\"connectVia\":{\"referenceName\":\"vbe\",\"parameters\":{\"zvpgttvykz\":\"datatk\",\"ikhbkcvpubvmsz\":\"datalktenbvpadoseqc\",\"sxncykfq\":\"datazrs\",\"gqctrvfpg\":\"databwes\"}},\"description\":\"l\",\"parameters\":{\"gthppoddnwhaokk\":{\"type\":\"Int\",\"defaultValue\":\"datavlgo\"},\"rqcga\":{\"type\":\"Object\",\"defaultValue\":\"datavimstbyaklfvc\"},\"mnfvbfjkvspxxbfq\":{\"type\":\"Object\",\"defaultValue\":\"dataofy\"}},\"annotations\":[\"datawjiuiryjdwdaocwq\",\"dataxwoqh\"],\"\":{\"hrencxo\":\"dataojiqtpbfcv\",\"cctuxxytmxjpku\":\"datatsdgnhlp\",\"yjnrjrtnk\":\"dataiafgbfkmqhzjsh\",\"w\":\"dataleurjynezp\"}},\"name\":\"cdvwnpt\",\"type\":\"iqeaugidsz\",\"etag\":\"tqsrtzgvwhjfu\",\"id\":\"pstvcqhzejbr\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        LinkedServiceResource response
            = manager.linkedServices()
                .define("gwriyxyelzm")
                .withExistingFactory("uuubtfxjpgjaynof", "yzpnta")
                .withProperties(new LinkedService()
                    .withConnectVia(new IntegrationRuntimeReference().withReferenceName("harucpkpm")
                        .withParameters(mapOf("ohkrqbgxhjbap", "datanwobkfu", "btlmpdrkgtlr", "datalluyhivlswipob")))
                    .withDescription("msaujxaogtwxgsw")
                    .withParameters(mapOf("ifs",
                        new ParameterSpecification().withType(ParameterType.BOOL)
                            .withDefaultValue("datawfaehryordinfwn"),
                        "ekfbufty",
                        new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("dataufuddtub")))
                    .withAnnotations(Arrays.asList("datalzlsskphwwnnj"))
                    .withAdditionalProperties(mapOf("type", "LinkedService")))
                .withIfMatch("yi")
                .create();

        Assertions.assertEquals("pstvcqhzejbr", response.id());
        Assertions.assertEquals("vbe", response.properties().connectVia().referenceName());
        Assertions.assertEquals("l", response.properties().description());
        Assertions.assertEquals(ParameterType.INT, response.properties().parameters().get("gthppoddnwhaokk").type());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
