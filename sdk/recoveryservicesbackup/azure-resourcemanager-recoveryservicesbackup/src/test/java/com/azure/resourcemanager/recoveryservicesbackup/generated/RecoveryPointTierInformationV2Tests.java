// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierInformationV2;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierType;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPointTierInformationV2Tests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPointTierInformationV2 model =
            BinaryData
                .fromString(
                    "{\"type\":\"ArchivedRP\",\"status\":\"Rehydrated\",\"extendedInfo\":{\"twly\":\"wahfbousnfepgfew\",\"limmbcxf\":\"gncxykxhdj\",\"pxtgqscjav\":\"bcporxvxcjzhqizx\"}}")
                .toObject(RecoveryPointTierInformationV2.class);
        Assertions.assertEquals(RecoveryPointTierType.ARCHIVED_RP, model.type());
        Assertions.assertEquals(RecoveryPointTierStatus.REHYDRATED, model.status());
        Assertions.assertEquals("wahfbousnfepgfew", model.extendedInfo().get("twly"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPointTierInformationV2 model =
            new RecoveryPointTierInformationV2()
                .withType(RecoveryPointTierType.ARCHIVED_RP)
                .withStatus(RecoveryPointTierStatus.REHYDRATED)
                .withExtendedInfo(
                    mapOf("twly", "wahfbousnfepgfew", "limmbcxf", "gncxykxhdj", "pxtgqscjav", "bcporxvxcjzhqizx"));
        model = BinaryData.fromObject(model).toObject(RecoveryPointTierInformationV2.class);
        Assertions.assertEquals(RecoveryPointTierType.ARCHIVED_RP, model.type());
        Assertions.assertEquals(RecoveryPointTierStatus.REHYDRATED, model.status());
        Assertions.assertEquals("wahfbousnfepgfew", model.extendedInfo().get("twly"));
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
