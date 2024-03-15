// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ExcelSource;
import com.azure.resourcemanager.datafactory.models.StoreReadSettings;
import java.util.HashMap;
import java.util.Map;

public final class ExcelSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExcelSource model = BinaryData.fromString(
            "{\"type\":\"ExcelSource\",\"storeSettings\":{\"type\":\"StoreReadSettings\",\"maxConcurrentConnections\":\"datanpdjomd\",\"disableMetricsCollection\":\"datadwosjxywwvilkyht\",\"\":{\"jgsjmcybrp\":\"datayhdb\",\"uuhdk\":\"datajenbxtkghrrx\",\"yxnhu\":\"datakizyx\",\"zyrpdxygfpqxseme\":\"datajwipfryivpe\"}},\"additionalColumns\":\"datapdmm\",\"sourceRetryCount\":\"dataft\",\"sourceRetryWait\":\"dataqe\",\"maxConcurrentConnections\":\"datajopotefek\",\"disableMetricsCollection\":\"datamg\",\"\":{\"dkvhui\":\"datawidnrd\",\"hwbead\":\"datadyhodisypgapfd\"}}")
            .toObject(ExcelSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExcelSource model = new ExcelSource().withSourceRetryCount("dataft").withSourceRetryWait("dataqe")
            .withMaxConcurrentConnections("datajopotefek").withDisableMetricsCollection("datamg")
            .withStoreSettings(new StoreReadSettings().withMaxConcurrentConnections("datanpdjomd")
                .withDisableMetricsCollection("datadwosjxywwvilkyht")
                .withAdditionalProperties(mapOf("type", "StoreReadSettings")))
            .withAdditionalColumns("datapdmm");
        model = BinaryData.fromObject(model).toObject(ExcelSource.class);
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
