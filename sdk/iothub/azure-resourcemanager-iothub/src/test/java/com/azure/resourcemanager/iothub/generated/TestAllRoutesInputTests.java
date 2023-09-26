// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.RoutingMessage;
import com.azure.resourcemanager.iothub.models.RoutingSource;
import com.azure.resourcemanager.iothub.models.RoutingTwin;
import com.azure.resourcemanager.iothub.models.RoutingTwinProperties;
import com.azure.resourcemanager.iothub.models.TestAllRoutesInput;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TestAllRoutesInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TestAllRoutesInput model =
            BinaryData
                .fromString(
                    "{\"routingSource\":\"TwinChangeEvents\",\"message\":{\"body\":\"rruvwbhsq\",\"appProperties\":{\"bsrfbj\":\"bcgjbirxbp\",\"otftpvjzbexilz\":\"dtws\",\"qtaruoujmkcjhwq\":\"nfqqnvwp\"},\"systemProperties\":{\"bnw\":\"r\",\"enq\":\"ewgdrjervn\",\"ndoygmifthnzdnd\":\"eh\",\"nayqi\":\"l\"}},\"twin\":{\"tags\":\"dataduhavhqlkt\",\"properties\":{\"desired\":\"dataaqolbgycduiertg\",\"reported\":\"datay\"}}}")
                .toObject(TestAllRoutesInput.class);
        Assertions.assertEquals(RoutingSource.TWIN_CHANGE_EVENTS, model.routingSource());
        Assertions.assertEquals("rruvwbhsq", model.message().body());
        Assertions.assertEquals("bcgjbirxbp", model.message().appProperties().get("bsrfbj"));
        Assertions.assertEquals("r", model.message().systemProperties().get("bnw"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TestAllRoutesInput model =
            new TestAllRoutesInput()
                .withRoutingSource(RoutingSource.TWIN_CHANGE_EVENTS)
                .withMessage(
                    new RoutingMessage()
                        .withBody("rruvwbhsq")
                        .withAppProperties(
                            mapOf("bsrfbj", "bcgjbirxbp", "otftpvjzbexilz", "dtws", "qtaruoujmkcjhwq", "nfqqnvwp"))
                        .withSystemProperties(
                            mapOf("bnw", "r", "enq", "ewgdrjervn", "ndoygmifthnzdnd", "eh", "nayqi", "l")))
                .withTwin(
                    new RoutingTwin()
                        .withTags("dataduhavhqlkt")
                        .withProperties(
                            new RoutingTwinProperties().withDesired("dataaqolbgycduiertg").withReported("datay")));
        model = BinaryData.fromObject(model).toObject(TestAllRoutesInput.class);
        Assertions.assertEquals(RoutingSource.TWIN_CHANGE_EVENTS, model.routingSource());
        Assertions.assertEquals("rruvwbhsq", model.message().body());
        Assertions.assertEquals("bcgjbirxbp", model.message().appProperties().get("bsrfbj"));
        Assertions.assertEquals("r", model.message().systemProperties().get("bnw"));
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
