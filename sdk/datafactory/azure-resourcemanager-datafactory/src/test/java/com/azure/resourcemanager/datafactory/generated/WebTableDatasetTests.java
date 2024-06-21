// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.WebTableDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class WebTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WebTableDataset model = BinaryData.fromString(
            "{\"type\":\"WebTable\",\"typeProperties\":{\"index\":\"dataawexizb\",\"path\":\"dataetji\"},\"description\":\"hpnbm\",\"structure\":\"datavvyxtvvxnakzi\",\"schema\":\"datakaybfmlngf\",\"linkedServiceName\":{\"referenceName\":\"hrmvla\",\"parameters\":{\"zblxna\":\"datajmwxn\",\"kovohwvpr\":\"datahsmfndcbsyhludzj\",\"cntjna\":\"datafdvtdurmdt\",\"twskkfkuyikmxhh\":\"datafhvqiias\"}},\"parameters\":{\"lfl\":{\"type\":\"String\",\"defaultValue\":\"datajkewriglbqtrefe\"},\"cvdefxonztpcjpt\":{\"type\":\"Int\",\"defaultValue\":\"dataffzw\"},\"h\":{\"type\":\"SecureString\",\"defaultValue\":\"dataqrcjqpzjvnpjr\"},\"viqehmdqvaol\":{\"type\":\"Float\",\"defaultValue\":\"datajbioag\"}},\"annotations\":[\"datadfs\",\"datavkjcim\",\"datarsvxphtjnhptj\"],\"folder\":{\"name\":\"dcyzhimmydtd\"},\"\":{\"prk\":\"datamizuzjdurgyzcsla\",\"gacnqp\":\"dataoyimxpggktteag\"}}")
            .toObject(WebTableDataset.class);
        Assertions.assertEquals("hpnbm", model.description());
        Assertions.assertEquals("hrmvla", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("lfl").type());
        Assertions.assertEquals("dcyzhimmydtd", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WebTableDataset model
            = new WebTableDataset().withDescription("hpnbm")
                .withStructure("datavvyxtvvxnakzi")
                .withSchema("datakaybfmlngf")
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("hrmvla")
                    .withParameters(mapOf("zblxna", "datajmwxn", "kovohwvpr", "datahsmfndcbsyhludzj", "cntjna",
                        "datafdvtdurmdt", "twskkfkuyikmxhh", "datafhvqiias")))
                .withParameters(
                    mapOf("lfl",
                        new ParameterSpecification().withType(ParameterType.STRING)
                            .withDefaultValue("datajkewriglbqtrefe"),
                        "cvdefxonztpcjpt",
                        new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("dataffzw"), "h",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING)
                            .withDefaultValue("dataqrcjqpzjvnpjr"),
                        "viqehmdqvaol",
                        new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datajbioag")))
                .withAnnotations(Arrays.asList("datadfs", "datavkjcim", "datarsvxphtjnhptj"))
                .withFolder(new DatasetFolder().withName("dcyzhimmydtd"))
                .withIndex("dataawexizb")
                .withPath("dataetji");
        model = BinaryData.fromObject(model).toObject(WebTableDataset.class);
        Assertions.assertEquals("hpnbm", model.description());
        Assertions.assertEquals("hrmvla", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("lfl").type());
        Assertions.assertEquals("dcyzhimmydtd", model.folder().name());
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
