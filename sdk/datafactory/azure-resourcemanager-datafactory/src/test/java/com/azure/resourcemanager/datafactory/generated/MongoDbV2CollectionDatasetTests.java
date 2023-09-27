// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.MongoDbV2CollectionDataset;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MongoDbV2CollectionDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MongoDbV2CollectionDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"MongoDbV2Collection\",\"typeProperties\":{\"collection\":\"datael\"},\"description\":\"odpegq\",\"structure\":\"dataorchazrqoxzyh\",\"schema\":\"dataeqvhskbmpw\",\"linkedServiceName\":{\"referenceName\":\"slajgg\",\"parameters\":{\"hawkmibuydwi\":\"dataae\"}},\"parameters\":{\"u\":{\"type\":\"Int\",\"defaultValue\":\"dataupdyttqm\"},\"s\":{\"type\":\"Array\",\"defaultValue\":\"datal\"}},\"annotations\":[\"datahhtuqmtxynof\",\"dataqobfixngxebihe\"],\"folder\":{\"name\":\"kingiqcdolrpgu\"},\"\":{\"dafbncuy\":\"datalbsm\",\"fzxjzi\":\"dataeykcnhpplzh\",\"wnuwkkfzzetl\":\"dataucrln\",\"vwywjvrlgqpwwlzp\":\"datahdyxz\"}}")
                .toObject(MongoDbV2CollectionDataset.class);
        Assertions.assertEquals("odpegq", model.description());
        Assertions.assertEquals("slajgg", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("u").type());
        Assertions.assertEquals("kingiqcdolrpgu", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MongoDbV2CollectionDataset model =
            new MongoDbV2CollectionDataset()
                .withDescription("odpegq")
                .withStructure("dataorchazrqoxzyh")
                .withSchema("dataeqvhskbmpw")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("slajgg")
                        .withParameters(mapOf("hawkmibuydwi", "dataae")))
                .withParameters(
                    mapOf(
                        "u",
                        new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("dataupdyttqm"),
                        "s",
                        new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datal")))
                .withAnnotations(Arrays.asList("datahhtuqmtxynof", "dataqobfixngxebihe"))
                .withFolder(new DatasetFolder().withName("kingiqcdolrpgu"))
                .withCollection("datael");
        model = BinaryData.fromObject(model).toObject(MongoDbV2CollectionDataset.class);
        Assertions.assertEquals("odpegq", model.description());
        Assertions.assertEquals("slajgg", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("u").type());
        Assertions.assertEquals("kingiqcdolrpgu", model.folder().name());
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
