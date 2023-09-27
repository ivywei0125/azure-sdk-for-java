// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DynamicsCrmEntityDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DynamicsCrmEntityDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DynamicsCrmEntityDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"DynamicsCrmEntity\",\"typeProperties\":{\"entityName\":\"dataiwh\"},\"description\":\"cfjnc\",\"structure\":\"datadilo\",\"schema\":\"dataajwjuriarsbcll\",\"linkedServiceName\":{\"referenceName\":\"nhzcknjxizb\",\"parameters\":{\"mlxppdndzkfevuii\":\"dataygzkztxfexwacyy\",\"kcj\":\"dataiib\",\"nopm\":\"datatqdcizeqqfop\",\"xqlyoazyfbkmvl\":\"datatdsfh\"}},\"parameters\":{\"kvhyejth\":{\"type\":\"Bool\",\"defaultValue\":\"datajzsvmaigb\"},\"ergwlckihbam\":{\"type\":\"Float\",\"defaultValue\":\"datacb\"},\"zjwdizcr\":{\"type\":\"Array\",\"defaultValue\":\"dataokknpu\"},\"c\":{\"type\":\"Object\",\"defaultValue\":\"dataiujz\"}},\"annotations\":[\"datagkr\",\"dataw\",\"datasykkbxktxbbwl\",\"datanwzoknvu\"],\"folder\":{\"name\":\"lggbqaolgzub\"},\"\":{\"kmixwewzls\":\"datalkvggcmfnsffet\",\"bthhxmoevvude\":\"datagsmepnqvxgvoh\",\"nvwxqhpjhubohxv\":\"datapfhga\"}}")
                .toObject(DynamicsCrmEntityDataset.class);
        Assertions.assertEquals("cfjnc", model.description());
        Assertions.assertEquals("nhzcknjxizb", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("kvhyejth").type());
        Assertions.assertEquals("lggbqaolgzub", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DynamicsCrmEntityDataset model =
            new DynamicsCrmEntityDataset()
                .withDescription("cfjnc")
                .withStructure("datadilo")
                .withSchema("dataajwjuriarsbcll")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("nhzcknjxizb")
                        .withParameters(
                            mapOf(
                                "mlxppdndzkfevuii",
                                "dataygzkztxfexwacyy",
                                "kcj",
                                "dataiib",
                                "nopm",
                                "datatqdcizeqqfop",
                                "xqlyoazyfbkmvl",
                                "datatdsfh")))
                .withParameters(
                    mapOf(
                        "kvhyejth",
                        new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("datajzsvmaigb"),
                        "ergwlckihbam",
                        new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datacb"),
                        "zjwdizcr",
                        new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("dataokknpu"),
                        "c",
                        new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("dataiujz")))
                .withAnnotations(Arrays.asList("datagkr", "dataw", "datasykkbxktxbbwl", "datanwzoknvu"))
                .withFolder(new DatasetFolder().withName("lggbqaolgzub"))
                .withEntityName("dataiwh");
        model = BinaryData.fromObject(model).toObject(DynamicsCrmEntityDataset.class);
        Assertions.assertEquals("cfjnc", model.description());
        Assertions.assertEquals("nhzcknjxizb", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("kvhyejth").type());
        Assertions.assertEquals("lggbqaolgzub", model.folder().name());
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
