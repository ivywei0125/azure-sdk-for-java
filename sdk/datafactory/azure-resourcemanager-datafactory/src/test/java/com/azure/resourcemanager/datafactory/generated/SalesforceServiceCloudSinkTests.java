// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SalesforceServiceCloudSink;
import com.azure.resourcemanager.datafactory.models.SalesforceSinkWriteBehavior;
import org.junit.jupiter.api.Assertions;

public final class SalesforceServiceCloudSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceServiceCloudSink model =
            BinaryData
                .fromString(
                    "{\"type\":\"SalesforceServiceCloudSink\",\"writeBehavior\":\"Insert\",\"externalIdFieldName\":\"datamaaxzcdlnvu\",\"ignoreNullValues\":\"datascbzyhtb\",\"writeBatchSize\":\"dataycacoelvoy\",\"writeBatchTimeout\":\"datamxqalqqrymjwwox\",\"sinkRetryCount\":\"dataefellhdsgo\",\"sinkRetryWait\":\"datau\",\"maxConcurrentConnections\":\"datamalthcbvuvwdp\",\"disableMetricsCollection\":\"dataphnag\",\"\":{\"ml\":\"dataaxjmnbm\",\"vlrsfmtrmod\":\"dataqatswvtddpicwnb\",\"pqrke\":\"datanxerkaiikbpfaq\",\"uaez\":\"datah\"}}")
                .toObject(SalesforceServiceCloudSink.class);
        Assertions.assertEquals(SalesforceSinkWriteBehavior.INSERT, model.writeBehavior());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceServiceCloudSink model =
            new SalesforceServiceCloudSink()
                .withWriteBatchSize("dataycacoelvoy")
                .withWriteBatchTimeout("datamxqalqqrymjwwox")
                .withSinkRetryCount("dataefellhdsgo")
                .withSinkRetryWait("datau")
                .withMaxConcurrentConnections("datamalthcbvuvwdp")
                .withDisableMetricsCollection("dataphnag")
                .withWriteBehavior(SalesforceSinkWriteBehavior.INSERT)
                .withExternalIdFieldName("datamaaxzcdlnvu")
                .withIgnoreNullValues("datascbzyhtb");
        model = BinaryData.fromObject(model).toObject(SalesforceServiceCloudSink.class);
        Assertions.assertEquals(SalesforceSinkWriteBehavior.INSERT, model.writeBehavior());
    }
}
