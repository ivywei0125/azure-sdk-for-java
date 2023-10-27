// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.XmlDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class XmlDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        XmlDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"Xml\",\"typeProperties\":{\"location\":{\"type\":\"DatasetLocation\",\"folderPath\":\"datarpnrehkunsbfjh\",\"fileName\":\"dataw\",\"\":{\"kgtzqnwqsttewu\":\"datavegeattb\",\"fjxflpditfno\":\"datacysje\",\"yuxlvrhprrv\":\"datap\",\"bs\":\"datawonleqflvtlr\"}},\"encodingName\":\"datahuy\",\"nullValue\":\"datan\",\"compression\":{\"type\":\"datattlnrjdszdb\",\"level\":\"dataiciqppo\",\"\":{\"uoxtfnressfepgck\":\"datapnewuhwfwjno\",\"ym\":\"datacjmgvsnvbtqdxfm\",\"jluqllbsupu\":\"datan\",\"zwhcukvb\":\"datadxckdl\"}}},\"description\":\"jjfdizhrjqf\",\"structure\":\"datayt\",\"schema\":\"dataly\",\"linkedServiceName\":{\"referenceName\":\"kcgn\",\"parameters\":{\"sxfai\":\"datarlcjiw\",\"rzxbarcbp\":\"datacwdgujjgnf\",\"ymjwenjcyt\":\"dataefzq\",\"auzmzivrtrfzhhe\":\"datasmfucrtfodqh\"}},\"parameters\":{\"swtvd\":{\"type\":\"Array\",\"defaultValue\":\"datadxdyyrudma\"}},\"annotations\":[\"dataqssgfenffdx\",\"datavwfqjch\"],\"folder\":{\"name\":\"r\"},\"\":{\"p\":\"datanxndmuvardlmzjo\"}}")
                .toObject(XmlDataset.class);
        Assertions.assertEquals("jjfdizhrjqf", model.description());
        Assertions.assertEquals("kcgn", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("swtvd").type());
        Assertions.assertEquals("r", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        XmlDataset model =
            new XmlDataset()
                .withDescription("jjfdizhrjqf")
                .withStructure("datayt")
                .withSchema("dataly")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("kcgn")
                        .withParameters(
                            mapOf(
                                "sxfai",
                                "datarlcjiw",
                                "rzxbarcbp",
                                "datacwdgujjgnf",
                                "ymjwenjcyt",
                                "dataefzq",
                                "auzmzivrtrfzhhe",
                                "datasmfucrtfodqh")))
                .withParameters(
                    mapOf(
                        "swtvd",
                        new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datadxdyyrudma")))
                .withAnnotations(Arrays.asList("dataqssgfenffdx", "datavwfqjch"))
                .withFolder(new DatasetFolder().withName("r"))
                .withLocation(
                    new DatasetLocation()
                        .withFolderPath("datarpnrehkunsbfjh")
                        .withFileName("dataw")
                        .withAdditionalProperties(mapOf("type", "DatasetLocation")))
                .withEncodingName("datahuy")
                .withNullValue("datan")
                .withCompression(
                    new DatasetCompression()
                        .withType("datattlnrjdszdb")
                        .withLevel("dataiciqppo")
                        .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(XmlDataset.class);
        Assertions.assertEquals("jjfdizhrjqf", model.description());
        Assertions.assertEquals("kcgn", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("swtvd").type());
        Assertions.assertEquals("r", model.folder().name());
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
