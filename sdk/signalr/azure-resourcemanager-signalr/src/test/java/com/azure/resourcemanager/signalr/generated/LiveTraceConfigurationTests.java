// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.LiveTraceCategory;
import com.azure.resourcemanager.signalr.models.LiveTraceConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LiveTraceConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LiveTraceConfiguration model =
            BinaryData
                .fromString(
                    "{\"enabled\":\"tezlwff\",\"categories\":[{\"name\":\"pjpqqmtedltmmji\",\"enabled\":\"eozphv\"},{\"name\":\"uyqncygupkvipmd\",\"enabled\":\"wx\"},{\"name\":\"pevzhfst\",\"enabled\":\"xhojuj\"},{\"name\":\"pelmcuvhixbjxyf\",\"enabled\":\"yl\"}]}")
                .toObject(LiveTraceConfiguration.class);
        Assertions.assertEquals("tezlwff", model.enabled());
        Assertions.assertEquals("pjpqqmtedltmmji", model.categories().get(0).name());
        Assertions.assertEquals("eozphv", model.categories().get(0).enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LiveTraceConfiguration model =
            new LiveTraceConfiguration()
                .withEnabled("tezlwff")
                .withCategories(
                    Arrays
                        .asList(
                            new LiveTraceCategory().withName("pjpqqmtedltmmji").withEnabled("eozphv"),
                            new LiveTraceCategory().withName("uyqncygupkvipmd").withEnabled("wx"),
                            new LiveTraceCategory().withName("pevzhfst").withEnabled("xhojuj"),
                            new LiveTraceCategory().withName("pelmcuvhixbjxyf").withEnabled("yl")));
        model = BinaryData.fromObject(model).toObject(LiveTraceConfiguration.class);
        Assertions.assertEquals("tezlwff", model.enabled());
        Assertions.assertEquals("pjpqqmtedltmmji", model.categories().get(0).name());
        Assertions.assertEquals("eozphv", model.categories().get(0).enabled());
    }
}
