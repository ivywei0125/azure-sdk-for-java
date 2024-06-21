// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureDataLakeStoreDataset;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DatasetStorageFormat;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureDataLakeStoreDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureDataLakeStoreDataset model = BinaryData.fromString(
            "{\"type\":\"AzureDataLakeStoreFile\",\"typeProperties\":{\"folderPath\":\"dataxessmvrk\",\"fileName\":\"datasqeq\",\"format\":{\"type\":\"DatasetStorageFormat\",\"serializer\":\"dataxm\",\"deserializer\":\"dataesbrujbjpppktl\",\"\":{\"hieatnejr\":\"databfm\"}},\"compression\":{\"type\":\"datainzqplgtkiho\",\"level\":\"datakzsrz\",\"\":{\"sckhbmc\":\"datajilzfbpntogke\"}}},\"description\":\"moyfxx\",\"structure\":\"dataykuqdnd\",\"schema\":\"dataykhkg\",\"linkedServiceName\":{\"referenceName\":\"apvd\",\"parameters\":{\"rnrnjrcufmbgacnr\":\"datapeerscd\",\"eubkqiqmlf\":\"datafdtncmspsanma\",\"skkqjmxptuei\":\"datahlq\"}},\"parameters\":{\"mrpahuuonj\":{\"type\":\"Object\",\"defaultValue\":\"datawdr\"}},\"annotations\":[\"dataukguehvvp\",\"datajoegcjojlleuidp\"],\"folder\":{\"name\":\"nvhgnhtmeplh\"},\"\":{\"ummmkvavucgji\":\"databap\"}}")
            .toObject(AzureDataLakeStoreDataset.class);
        Assertions.assertEquals("moyfxx", model.description());
        Assertions.assertEquals("apvd", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("mrpahuuonj").type());
        Assertions.assertEquals("nvhgnhtmeplh", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureDataLakeStoreDataset model = new AzureDataLakeStoreDataset().withDescription("moyfxx")
            .withStructure("dataykuqdnd")
            .withSchema("dataykhkg")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("apvd")
                .withParameters(mapOf("rnrnjrcufmbgacnr", "datapeerscd", "eubkqiqmlf", "datafdtncmspsanma",
                    "skkqjmxptuei", "datahlq")))
            .withParameters(mapOf("mrpahuuonj",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datawdr")))
            .withAnnotations(Arrays.asList("dataukguehvvp", "datajoegcjojlleuidp"))
            .withFolder(new DatasetFolder().withName("nvhgnhtmeplh"))
            .withFolderPath("dataxessmvrk")
            .withFileName("datasqeq")
            .withFormat(new DatasetStorageFormat().withSerializer("dataxm")
                .withDeserializer("dataesbrujbjpppktl")
                .withAdditionalProperties(mapOf("type", "DatasetStorageFormat")))
            .withCompression(new DatasetCompression().withType("datainzqplgtkiho")
                .withLevel("datakzsrz")
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(AzureDataLakeStoreDataset.class);
        Assertions.assertEquals("moyfxx", model.description());
        Assertions.assertEquals("apvd", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("mrpahuuonj").type());
        Assertions.assertEquals("nvhgnhtmeplh", model.folder().name());
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
