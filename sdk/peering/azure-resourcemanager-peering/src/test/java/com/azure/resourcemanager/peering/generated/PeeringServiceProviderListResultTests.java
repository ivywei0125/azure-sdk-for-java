// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.peering.fluent.models.PeeringServiceProviderInner;
import com.azure.resourcemanager.peering.models.PeeringServiceProviderListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PeeringServiceProviderListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PeeringServiceProviderListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"serviceProviderName\":\"isxyawjoyaqcslyj\",\"peeringLocations\":[]},\"id\":\"iidzyexzne\",\"name\":\"ixhnrztf\",\"type\":\"lhbnxkna\"},{\"properties\":{\"serviceProviderName\":\"lp\",\"peeringLocations\":[]},\"id\":\"gdtpnapnyiro\",\"name\":\"uhpigvp\",\"type\":\"ylgqgitxmedjvcsl\"},{\"properties\":{\"serviceProviderName\":\"wwncwzzhxgk\",\"peeringLocations\":[]},\"id\":\"mgucna\",\"name\":\"kteo\",\"type\":\"llwptfdy\"},{\"properties\":{\"serviceProviderName\":\"qbuaceopzfqr\",\"peeringLocations\":[]},\"id\":\"uaopppcqeq\",\"name\":\"ol\",\"type\":\"dahzxctobg\"}],\"nextLink\":\"dmoizpostmg\"}")
                .toObject(PeeringServiceProviderListResult.class);
        Assertions.assertEquals("isxyawjoyaqcslyj", model.value().get(0).serviceProviderName());
        Assertions.assertEquals("dmoizpostmg", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PeeringServiceProviderListResult model =
            new PeeringServiceProviderListResult()
                .withValue(
                    Arrays
                        .asList(
                            new PeeringServiceProviderInner()
                                .withServiceProviderName("isxyawjoyaqcslyj")
                                .withPeeringLocations(Arrays.asList()),
                            new PeeringServiceProviderInner()
                                .withServiceProviderName("lp")
                                .withPeeringLocations(Arrays.asList()),
                            new PeeringServiceProviderInner()
                                .withServiceProviderName("wwncwzzhxgk")
                                .withPeeringLocations(Arrays.asList()),
                            new PeeringServiceProviderInner()
                                .withServiceProviderName("qbuaceopzfqr")
                                .withPeeringLocations(Arrays.asList())))
                .withNextLink("dmoizpostmg");
        model = BinaryData.fromObject(model).toObject(PeeringServiceProviderListResult.class);
        Assertions.assertEquals("isxyawjoyaqcslyj", model.value().get(0).serviceProviderName());
        Assertions.assertEquals("dmoizpostmg", model.nextLink());
    }
}