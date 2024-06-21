// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ResponsysSource;

public final class ResponsysSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResponsysSource model = BinaryData.fromString(
            "{\"type\":\"ResponsysSource\",\"query\":\"dataskdzs\",\"queryTimeout\":\"datahvzgliu\",\"additionalColumns\":\"datactgsdxjxkddxo\",\"sourceRetryCount\":\"datalprsrkennnyyvv\",\"sourceRetryWait\":\"datasad\",\"maxConcurrentConnections\":\"datamnjtfplgxcjr\",\"disableMetricsCollection\":\"datab\",\"\":{\"iyycoflj\":\"dataisfjamgnpeosu\"}}")
            .toObject(ResponsysSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResponsysSource model = new ResponsysSource().withSourceRetryCount("datalprsrkennnyyvv")
            .withSourceRetryWait("datasad")
            .withMaxConcurrentConnections("datamnjtfplgxcjr")
            .withDisableMetricsCollection("datab")
            .withQueryTimeout("datahvzgliu")
            .withAdditionalColumns("datactgsdxjxkddxo")
            .withQuery("dataskdzs");
        model = BinaryData.fromObject(model).toObject(ResponsysSource.class);
    }
}
