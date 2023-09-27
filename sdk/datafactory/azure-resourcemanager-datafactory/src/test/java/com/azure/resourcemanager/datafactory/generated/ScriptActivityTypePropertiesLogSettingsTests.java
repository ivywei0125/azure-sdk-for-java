// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.LogLocationSettings;
import com.azure.resourcemanager.datafactory.models.ScriptActivityLogDestination;
import com.azure.resourcemanager.datafactory.models.ScriptActivityTypePropertiesLogSettings;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ScriptActivityTypePropertiesLogSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScriptActivityTypePropertiesLogSettings model =
            BinaryData
                .fromString(
                    "{\"logDestination\":\"ExternalStore\",\"logLocationSettings\":{\"linkedServiceName\":{\"referenceName\":\"jaqyiy\",\"parameters\":{\"upyivq\":\"dataejufack\",\"bperkeyhybc\":\"dataczxyzlxowgzt\",\"jqrnuo\":\"dataxurdfzynfm\",\"tzeauifc\":\"datam\"}},\"path\":\"datarutfvzdo\"}}")
                .toObject(ScriptActivityTypePropertiesLogSettings.class);
        Assertions.assertEquals(ScriptActivityLogDestination.EXTERNAL_STORE, model.logDestination());
        Assertions.assertEquals("jaqyiy", model.logLocationSettings().linkedServiceName().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScriptActivityTypePropertiesLogSettings model =
            new ScriptActivityTypePropertiesLogSettings()
                .withLogDestination(ScriptActivityLogDestination.EXTERNAL_STORE)
                .withLogLocationSettings(
                    new LogLocationSettings()
                        .withLinkedServiceName(
                            new LinkedServiceReference()
                                .withReferenceName("jaqyiy")
                                .withParameters(
                                    mapOf(
                                        "upyivq",
                                        "dataejufack",
                                        "bperkeyhybc",
                                        "dataczxyzlxowgzt",
                                        "jqrnuo",
                                        "dataxurdfzynfm",
                                        "tzeauifc",
                                        "datam")))
                        .withPath("datarutfvzdo"));
        model = BinaryData.fromObject(model).toObject(ScriptActivityTypePropertiesLogSettings.class);
        Assertions.assertEquals(ScriptActivityLogDestination.EXTERNAL_STORE, model.logDestination());
        Assertions.assertEquals("jaqyiy", model.logLocationSettings().linkedServiceName().referenceName());
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
