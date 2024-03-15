// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Office365Source;

public final class Office365SourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Office365Source model = BinaryData.fromString(
            "{\"type\":\"Office365Source\",\"allowedGroups\":\"datacugchtwxifudlrxb\",\"userScopeFilterUri\":\"dataftpvgmqzitc\",\"dateFilterColumn\":\"datamlltas\",\"startTime\":\"dataqsf\",\"endTime\":\"datae\",\"outputColumns\":\"dataveg\",\"sourceRetryCount\":\"databmyvgmbirvv\",\"sourceRetryWait\":\"databqxisavktuxw\",\"maxConcurrentConnections\":\"datal\",\"disableMetricsCollection\":\"databridagwuvcdymoqv\",\"\":{\"agvuioxjwzt\":\"datarynziudmhedhryg\",\"cv\":\"datafotllf\",\"zz\":\"datafnbccffs\"}}")
            .toObject(Office365Source.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Office365Source model = new Office365Source().withSourceRetryCount("databmyvgmbirvv")
            .withSourceRetryWait("databqxisavktuxw").withMaxConcurrentConnections("datal")
            .withDisableMetricsCollection("databridagwuvcdymoqv").withAllowedGroups("datacugchtwxifudlrxb")
            .withUserScopeFilterUri("dataftpvgmqzitc").withDateFilterColumn("datamlltas").withStartTime("dataqsf")
            .withEndTime("datae").withOutputColumns("dataveg");
        model = BinaryData.fromObject(model).toObject(Office365Source.class);
    }
}
