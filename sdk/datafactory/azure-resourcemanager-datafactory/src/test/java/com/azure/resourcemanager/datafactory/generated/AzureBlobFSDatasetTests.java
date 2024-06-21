// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureBlobFSDataset;
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

public final class AzureBlobFSDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBlobFSDataset model = BinaryData.fromString(
            "{\"type\":\"AzureBlobFSFile\",\"typeProperties\":{\"folderPath\":\"datamdrcjlvkrkegtyc\",\"fileName\":\"datappiyxlzmiyddeeqz\",\"format\":{\"type\":\"DatasetStorageFormat\",\"serializer\":\"databm\",\"deserializer\":\"datas\",\"\":{\"trlq\":\"datauetbapfczew\",\"pirgzxvbczwhy\":\"datapxyazk\"}},\"compression\":{\"type\":\"databthmsritj\",\"level\":\"dataiggrunoz\",\"\":{\"krfihscjv\":\"dataaljthoivsdwsn\"}}},\"description\":\"mhzbhwahfbwih\",\"structure\":\"datanx\",\"schema\":\"datavynuqqkotauratn\",\"linkedServiceName\":{\"referenceName\":\"cppfzsclefyrle\",\"parameters\":{\"n\":\"dataqlmfdg\",\"fleev\":\"databuypwovvv\",\"pxrl\":\"dataoqayrehjuqwv\"}},\"parameters\":{\"qzlxn\":{\"type\":\"Object\",\"defaultValue\":\"datahacen\"}},\"annotations\":[\"databfonfdbgmkfwmj\",\"datawtewf\",\"dataxwyrkbrehzlr\"],\"folder\":{\"name\":\"pcha\"},\"\":{\"rieikmwlaoklfnis\":\"dataeplrajubowuywevt\"}}")
            .toObject(AzureBlobFSDataset.class);
        Assertions.assertEquals("mhzbhwahfbwih", model.description());
        Assertions.assertEquals("cppfzsclefyrle", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("qzlxn").type());
        Assertions.assertEquals("pcha", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBlobFSDataset model = new AzureBlobFSDataset().withDescription("mhzbhwahfbwih")
            .withStructure("datanx")
            .withSchema("datavynuqqkotauratn")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("cppfzsclefyrle")
                .withParameters(mapOf("n", "dataqlmfdg", "fleev", "databuypwovvv", "pxrl", "dataoqayrehjuqwv")))
            .withParameters(mapOf("qzlxn",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datahacen")))
            .withAnnotations(Arrays.asList("databfonfdbgmkfwmj", "datawtewf", "dataxwyrkbrehzlr"))
            .withFolder(new DatasetFolder().withName("pcha"))
            .withFolderPath("datamdrcjlvkrkegtyc")
            .withFileName("datappiyxlzmiyddeeqz")
            .withFormat(new DatasetStorageFormat().withSerializer("databm")
                .withDeserializer("datas")
                .withAdditionalProperties(mapOf("type", "DatasetStorageFormat")))
            .withCompression(new DatasetCompression().withType("databthmsritj")
                .withLevel("dataiggrunoz")
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(AzureBlobFSDataset.class);
        Assertions.assertEquals("mhzbhwahfbwih", model.description());
        Assertions.assertEquals("cppfzsclefyrle", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("qzlxn").type());
        Assertions.assertEquals("pcha", model.folder().name());
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
