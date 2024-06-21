// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.GoogleBigQueryV2Source;

public final class GoogleBigQueryV2SourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GoogleBigQueryV2Source model = BinaryData.fromString(
            "{\"type\":\"GoogleBigQueryV2Source\",\"query\":\"datajwiz\",\"queryTimeout\":\"dataifz\",\"additionalColumns\":\"dataxtykjrdxlximvr\",\"sourceRetryCount\":\"datajja\",\"sourceRetryWait\":\"dataaskullvtsauj\",\"maxConcurrentConnections\":\"datahtz\",\"disableMetricsCollection\":\"datazqrpfhzxkjyg\",\"\":{\"jcozbnmthxcm\":\"datadgwdha\",\"exn\":\"dataq\",\"msmzykpnjgi\":\"datapvox\"}}")
            .toObject(GoogleBigQueryV2Source.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GoogleBigQueryV2Source model = new GoogleBigQueryV2Source().withSourceRetryCount("datajja")
            .withSourceRetryWait("dataaskullvtsauj")
            .withMaxConcurrentConnections("datahtz")
            .withDisableMetricsCollection("datazqrpfhzxkjyg")
            .withQueryTimeout("dataifz")
            .withAdditionalColumns("dataxtykjrdxlximvr")
            .withQuery("datajwiz");
        model = BinaryData.fromObject(model).toObject(GoogleBigQueryV2Source.class);
    }
}
