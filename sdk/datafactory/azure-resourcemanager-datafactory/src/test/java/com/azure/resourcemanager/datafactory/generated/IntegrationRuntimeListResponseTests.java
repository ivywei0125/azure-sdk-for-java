// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeResourceInner;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntime;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeListResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IntegrationRuntimeListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeListResponse model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"type\":\"IntegrationRuntime\",\"description\":\"hkaetcktvfc\",\"\":{\"jf\":\"datasnkymuctq\",\"fuwutttxf\":\"dataebrjcxe\",\"hfnljkyq\":\"datajrbirphxepcyv\"}},\"name\":\"vuujq\",\"type\":\"dokgjl\",\"etag\":\"oxgvclt\",\"id\":\"sncghkjeszz\"},{\"properties\":{\"type\":\"IntegrationRuntime\",\"description\":\"ijhtxf\",\"\":{\"xnehmpvec\":\"databfs\"}},\"name\":\"odebfqkkrbmpu\",\"type\":\"riwflzlfb\",\"etag\":\"puz\",\"id\":\"ispnqzahmgkbrp\"},{\"properties\":{\"type\":\"IntegrationRuntime\",\"description\":\"dhibnuq\",\"\":{\"drgvtqagn\":\"dataik\",\"mebf\":\"datauynhijg\"}},\"name\":\"arbu\",\"type\":\"cvpnazzmhjrunmpx\",\"etag\":\"dbhrbnlankxm\",\"id\":\"k\"},{\"properties\":{\"type\":\"IntegrationRuntime\",\"description\":\"henbtkcxywnytn\",\"\":{\"lhaaxdbabp\":\"datanlqidybyxczf\"}},\"name\":\"wrqlfktsthsuco\",\"type\":\"nyyazttbtwwrqpue\",\"etag\":\"kzywbiex\",\"id\":\"eyueaxibxujwb\"}],\"nextLink\":\"walm\"}")
                .toObject(IntegrationRuntimeListResponse.class);
        Assertions.assertEquals("sncghkjeszz", model.value().get(0).id());
        Assertions.assertEquals("hkaetcktvfc", model.value().get(0).properties().description());
        Assertions.assertEquals("walm", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeListResponse model =
            new IntegrationRuntimeListResponse()
                .withValue(
                    Arrays
                        .asList(
                            new IntegrationRuntimeResourceInner()
                                .withId("sncghkjeszz")
                                .withProperties(
                                    new IntegrationRuntime()
                                        .withDescription("hkaetcktvfc")
                                        .withAdditionalProperties(mapOf("type", "IntegrationRuntime"))),
                            new IntegrationRuntimeResourceInner()
                                .withId("ispnqzahmgkbrp")
                                .withProperties(
                                    new IntegrationRuntime()
                                        .withDescription("ijhtxf")
                                        .withAdditionalProperties(mapOf("type", "IntegrationRuntime"))),
                            new IntegrationRuntimeResourceInner()
                                .withId("k")
                                .withProperties(
                                    new IntegrationRuntime()
                                        .withDescription("dhibnuq")
                                        .withAdditionalProperties(mapOf("type", "IntegrationRuntime"))),
                            new IntegrationRuntimeResourceInner()
                                .withId("eyueaxibxujwb")
                                .withProperties(
                                    new IntegrationRuntime()
                                        .withDescription("henbtkcxywnytn")
                                        .withAdditionalProperties(mapOf("type", "IntegrationRuntime")))))
                .withNextLink("walm");
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeListResponse.class);
        Assertions.assertEquals("sncghkjeszz", model.value().get(0).id());
        Assertions.assertEquals("hkaetcktvfc", model.value().get(0).properties().description());
        Assertions.assertEquals("walm", model.nextLink());
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
