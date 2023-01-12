// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.HighAvailability;
import com.azure.resourcemanager.postgresqlflexibleserver.models.HighAvailabilityMode;
import org.junit.jupiter.api.Assertions;

public final class HighAvailabilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HighAvailability model =
            BinaryData
                .fromString(
                    "{\"mode\":\"SameZone\",\"state\":\"FailingOver\",\"standbyAvailabilityZone\":\"xvnmicykvceov\"}")
                .toObject(HighAvailability.class);
        Assertions.assertEquals(HighAvailabilityMode.SAME_ZONE, model.mode());
        Assertions.assertEquals("xvnmicykvceov", model.standbyAvailabilityZone());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HighAvailability model =
            new HighAvailability()
                .withMode(HighAvailabilityMode.SAME_ZONE)
                .withStandbyAvailabilityZone("xvnmicykvceov");
        model = BinaryData.fromObject(model).toObject(HighAvailability.class);
        Assertions.assertEquals(HighAvailabilityMode.SAME_ZONE, model.mode());
        Assertions.assertEquals("xvnmicykvceov", model.standbyAvailabilityZone());
    }
}