// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CommonDataServiceForAppsEntityDataset;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CommonDataServiceForAppsEntityDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CommonDataServiceForAppsEntityDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"CommonDataServiceForAppsEntity\",\"typeProperties\":{\"entityName\":\"datagxnwfmzvztau\"},\"description\":\"pamqxfcssanybz\",\"structure\":\"datahvdfe\",\"schema\":\"datayj\",\"linkedServiceName\":{\"referenceName\":\"v\",\"parameters\":{\"nzxezriwgo\":\"datalywkhookj\"}},\"parameters\":{\"ap\":{\"type\":\"Bool\",\"defaultValue\":\"dataqksa\"},\"benwsdfp\":{\"type\":\"SecureString\",\"defaultValue\":\"datacit\"},\"pmvzpireszya\":{\"type\":\"Int\",\"defaultValue\":\"dataahlfrcqk\"},\"cjjlwkyeahhhut\":{\"type\":\"Float\",\"defaultValue\":\"datamlbmfggeokfe\"}},\"annotations\":[\"datanrfcqu\",\"datam\",\"dataihpinow\"],\"folder\":{\"name\":\"jpxp\"},\"\":{\"lgbbfjmdgjvxlh\":\"datadwyqqidqi\",\"eftyaphqeofytl\":\"datapm\",\"qvjfdgfqpmquxpjh\":\"datanlowmcmcqixuanc\",\"dcio\":\"datafaar\"}}")
                .toObject(CommonDataServiceForAppsEntityDataset.class);
        Assertions.assertEquals("pamqxfcssanybz", model.description());
        Assertions.assertEquals("v", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("ap").type());
        Assertions.assertEquals("jpxp", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CommonDataServiceForAppsEntityDataset model =
            new CommonDataServiceForAppsEntityDataset()
                .withDescription("pamqxfcssanybz")
                .withStructure("datahvdfe")
                .withSchema("datayj")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("v")
                        .withParameters(mapOf("nzxezriwgo", "datalywkhookj")))
                .withParameters(
                    mapOf(
                        "ap",
                        new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("dataqksa"),
                        "benwsdfp",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING).withDefaultValue("datacit"),
                        "pmvzpireszya",
                        new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("dataahlfrcqk"),
                        "cjjlwkyeahhhut",
                        new ParameterSpecification()
                            .withType(ParameterType.FLOAT)
                            .withDefaultValue("datamlbmfggeokfe")))
                .withAnnotations(Arrays.asList("datanrfcqu", "datam", "dataihpinow"))
                .withFolder(new DatasetFolder().withName("jpxp"))
                .withEntityName("datagxnwfmzvztau");
        model = BinaryData.fromObject(model).toObject(CommonDataServiceForAppsEntityDataset.class);
        Assertions.assertEquals("pamqxfcssanybz", model.description());
        Assertions.assertEquals("v", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("ap").type());
        Assertions.assertEquals("jpxp", model.folder().name());
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
