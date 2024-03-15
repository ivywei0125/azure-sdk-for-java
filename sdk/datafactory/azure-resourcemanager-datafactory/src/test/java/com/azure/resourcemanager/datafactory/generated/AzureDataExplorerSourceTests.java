// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureDataExplorerSource;

public final class AzureDataExplorerSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureDataExplorerSource model = BinaryData.fromString(
            "{\"type\":\"AzureDataExplorerSource\",\"query\":\"dataqebtrps\",\"noTruncation\":\"datawtlocseybvtgcozn\",\"queryTimeout\":\"dataqxckrnkuuotlymy\",\"additionalColumns\":\"datagmrkxkmtuynugptf\",\"sourceRetryCount\":\"dataisvfh\",\"sourceRetryWait\":\"dataqqshbipzhuhu\",\"maxConcurrentConnections\":\"datazjsezgphip\",\"disableMetricsCollection\":\"dataoqldnhwdfxgec\",\"\":{\"bhsnimompxd\":\"datakdb\",\"fbdmoawhbdxxnm\":\"datamp\",\"iocqoydqyzhfny\":\"dataxz\",\"skt\":\"datagbwdsaqwywayjin\"}}")
            .toObject(AzureDataExplorerSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureDataExplorerSource model
            = new AzureDataExplorerSource().withSourceRetryCount("dataisvfh").withSourceRetryWait("dataqqshbipzhuhu")
                .withMaxConcurrentConnections("datazjsezgphip").withDisableMetricsCollection("dataoqldnhwdfxgec")
                .withQuery("dataqebtrps").withNoTruncation("datawtlocseybvtgcozn")
                .withQueryTimeout("dataqxckrnkuuotlymy").withAdditionalColumns("datagmrkxkmtuynugptf");
        model = BinaryData.fromObject(model).toObject(AzureDataExplorerSource.class);
    }
}
