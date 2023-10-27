// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CustomDataset;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CustomDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"CustomDataset\",\"typeProperties\":\"datafgufjnbx\",\"description\":\"mwdukinhl\",\"structure\":\"datagde\",\"schema\":\"datakzou\",\"linkedServiceName\":{\"referenceName\":\"vewwpzrdwcgldo\",\"parameters\":{\"dxfhhht\":\"dataa\",\"qtdn\":\"datast\",\"dshvvf\":\"datackkpl\"}},\"parameters\":{\"zrqnjxm\":{\"type\":\"Int\",\"defaultValue\":\"datayijjimhi\"},\"hqld\":{\"type\":\"String\",\"defaultValue\":\"dataduydwnwgru\"},\"i\":{\"type\":\"Array\",\"defaultValue\":\"datamnswxiexqwqnghx\"},\"qtny\":{\"type\":\"Array\",\"defaultValue\":\"dataujrxgunnqgyp\"}},\"annotations\":[\"datae\",\"dataqmvyumgmmuebsnzn\",\"datagsqufmjxcyo\"],\"folder\":{\"name\":\"cazisvbrqgcyjpg\"},\"\":{\"tbgblxbuibrvjzta\":\"datapkwonrzpghlr\"}}")
                .toObject(CustomDataset.class);
        Assertions.assertEquals("mwdukinhl", model.description());
        Assertions.assertEquals("vewwpzrdwcgldo", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("zrqnjxm").type());
        Assertions.assertEquals("cazisvbrqgcyjpg", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomDataset model =
            new CustomDataset()
                .withDescription("mwdukinhl")
                .withStructure("datagde")
                .withSchema("datakzou")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("vewwpzrdwcgldo")
                        .withParameters(mapOf("dxfhhht", "dataa", "qtdn", "datast", "dshvvf", "datackkpl")))
                .withParameters(
                    mapOf(
                        "zrqnjxm",
                        new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datayijjimhi"),
                        "hqld",
                        new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("dataduydwnwgru"),
                        "i",
                        new ParameterSpecification()
                            .withType(ParameterType.ARRAY)
                            .withDefaultValue("datamnswxiexqwqnghx"),
                        "qtny",
                        new ParameterSpecification()
                            .withType(ParameterType.ARRAY)
                            .withDefaultValue("dataujrxgunnqgyp")))
                .withAnnotations(Arrays.asList("datae", "dataqmvyumgmmuebsnzn", "datagsqufmjxcyo"))
                .withFolder(new DatasetFolder().withName("cazisvbrqgcyjpg"))
                .withTypeProperties("datafgufjnbx");
        model = BinaryData.fromObject(model).toObject(CustomDataset.class);
        Assertions.assertEquals("mwdukinhl", model.description());
        Assertions.assertEquals("vewwpzrdwcgldo", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("zrqnjxm").type());
        Assertions.assertEquals("cazisvbrqgcyjpg", model.folder().name());
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
