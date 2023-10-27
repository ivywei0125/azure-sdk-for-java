// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

import com.azure.resourcemanager.cdn.models.WafMetric;
import com.azure.resourcemanager.cdn.models.WafRankingType;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for LogAnalytics GetWafLogAnalyticsRankings. */
public final class LogAnalyticsGetWafLogAnalyticsRankingsSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/LogAnalytics_GetWafLogAnalyticsRankings.json
     */
    /**
     * Sample code: LogAnalytics_GetWafLogAnalyticsRankings.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void logAnalyticsGetWafLogAnalyticsRankings(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getLogAnalytics()
            .getWafLogAnalyticsRankingsWithResponse(
                "RG",
                "profile1",
                Arrays.asList(WafMetric.CLIENT_REQUEST_COUNT),
                OffsetDateTime.parse("2020-11-04T06:49:27.554Z"),
                OffsetDateTime.parse("2020-11-04T09:49:27.554Z"),
                5,
                Arrays.asList(WafRankingType.RULE_ID),
                null,
                null,
                com.azure.core.util.Context.NONE);
    }
}
