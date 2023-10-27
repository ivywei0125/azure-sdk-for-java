// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SparkObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SparkObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SparkObjectDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"SparkObject\",\"typeProperties\":{\"tableName\":\"datandmtqvmkmzvag\",\"table\":\"datafblsxyfqgtodg\",\"schema\":\"datalefmizdcsr\"},\"description\":\"bnasgfyxhsxcg\",\"structure\":\"datam\",\"schema\":\"datapqcnxs\",\"linkedServiceName\":{\"referenceName\":\"ehojvmazu\",\"parameters\":{\"hpdnc\":\"datapiuu\",\"h\":\"datakqrgiv\"}},\"parameters\":{\"uyrgcaygumqeo\":{\"type\":\"Bool\",\"defaultValue\":\"datalyhbjfnmmibgwc\"},\"sawha\":{\"type\":\"Float\",\"defaultValue\":\"datareud\"},\"zmfk\":{\"type\":\"Float\",\"defaultValue\":\"datas\"},\"k\":{\"type\":\"Int\",\"defaultValue\":\"datag\"}},\"annotations\":[\"datakcge\",\"datanubr\"],\"folder\":{\"name\":\"fkxnwt\"},\"\":{\"iwap\":\"dataoeqcrjvcjskqsfn\",\"nh\":\"dataunhdikatzmtuv\",\"ibxl\":\"datatjk\",\"u\":\"datazlvkcm\"}}")
                .toObject(SparkObjectDataset.class);
        Assertions.assertEquals("bnasgfyxhsxcg", model.description());
        Assertions.assertEquals("ehojvmazu", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("uyrgcaygumqeo").type());
        Assertions.assertEquals("fkxnwt", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SparkObjectDataset model =
            new SparkObjectDataset()
                .withDescription("bnasgfyxhsxcg")
                .withStructure("datam")
                .withSchema("datapqcnxs")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("ehojvmazu")
                        .withParameters(mapOf("hpdnc", "datapiuu", "h", "datakqrgiv")))
                .withParameters(
                    mapOf(
                        "uyrgcaygumqeo",
                        new ParameterSpecification()
                            .withType(ParameterType.BOOL)
                            .withDefaultValue("datalyhbjfnmmibgwc"),
                        "sawha",
                        new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datareud"),
                        "zmfk",
                        new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datas"),
                        "k",
                        new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datag")))
                .withAnnotations(Arrays.asList("datakcge", "datanubr"))
                .withFolder(new DatasetFolder().withName("fkxnwt"))
                .withTableName("datandmtqvmkmzvag")
                .withTable("datafblsxyfqgtodg")
                .withSchemaTypePropertiesSchema("datalefmizdcsr");
        model = BinaryData.fromObject(model).toObject(SparkObjectDataset.class);
        Assertions.assertEquals("bnasgfyxhsxcg", model.description());
        Assertions.assertEquals("ehojvmazu", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("uyrgcaygumqeo").type());
        Assertions.assertEquals("fkxnwt", model.folder().name());
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
