// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.CapacityPoolInner;
import com.azure.resourcemanager.netapp.models.CapacityPoolList;
import com.azure.resourcemanager.netapp.models.EncryptionType;
import com.azure.resourcemanager.netapp.models.QosType;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CapacityPoolListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CapacityPoolList model = BinaryData.fromString(
            "{\"value\":[{\"etag\":\"xywpmueefjzwfqkq\",\"properties\":{\"poolId\":\"ids\",\"size\":7570837536586623824,\"serviceLevel\":\"Ultra\",\"provisioningState\":\"bglaocqxtccm\",\"totalThroughputMibps\":63.202667,\"utilizedThroughputMibps\":10.141272,\"qosType\":\"Auto\",\"coolAccess\":true,\"encryptionType\":\"Double\"},\"location\":\"xv\",\"tags\":{\"zntxhdz\":\"dw\"},\"id\":\"lrqjbhckfr\",\"name\":\"hrxsbk\",\"type\":\"vpycanuzbp\"},{\"etag\":\"afkuwb\",\"properties\":{\"poolId\":\"nwbmeh\",\"size\":5146449711958438241,\"serviceLevel\":\"Ultra\",\"provisioningState\":\"jusrtslhspk\",\"totalThroughputMibps\":72.538994,\"utilizedThroughputMibps\":68.91014,\"qosType\":\"Auto\",\"coolAccess\":true,\"encryptionType\":\"Double\"},\"location\":\"vt\",\"tags\":{\"c\":\"mqkrhahvljuahaqu\",\"aex\":\"hmdua\",\"vxpvgomz\":\"pvfadmwsrcr\"},\"id\":\"fmisg\",\"name\":\"bnbbeldawkz\",\"type\":\"ali\"},{\"etag\":\"rqhakauha\",\"properties\":{\"poolId\":\"sfwxosowzxc\",\"size\":2516732809766062265,\"serviceLevel\":\"StandardZRS\",\"provisioningState\":\"ooxdjebwpuc\",\"totalThroughputMibps\":83.48158,\"utilizedThroughputMibps\":65.76169,\"qosType\":\"Manual\",\"coolAccess\":false,\"encryptionType\":\"Single\"},\"location\":\"civyhzceuo\",\"tags\":{\"ueiotwmcdyt\":\"rw\",\"it\":\"x\",\"hniskxfbkpyc\":\"nrjawgqwg\"},\"id\":\"klwndnhjdauwhv\",\"name\":\"l\",\"type\":\"zbtd\"}],\"nextLink\":\"ujznb\"}")
            .toObject(CapacityPoolList.class);
        Assertions.assertEquals("xv", model.value().get(0).location());
        Assertions.assertEquals("dw", model.value().get(0).tags().get("zntxhdz"));
        Assertions.assertEquals(7570837536586623824L, model.value().get(0).size());
        Assertions.assertEquals(ServiceLevel.ULTRA, model.value().get(0).serviceLevel());
        Assertions.assertEquals(QosType.AUTO, model.value().get(0).qosType());
        Assertions.assertEquals(true, model.value().get(0).coolAccess());
        Assertions.assertEquals(EncryptionType.DOUBLE, model.value().get(0).encryptionType());
        Assertions.assertEquals("ujznb", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CapacityPoolList model = new CapacityPoolList().withValue(Arrays.asList(
            new CapacityPoolInner().withLocation("xv")
                .withTags(mapOf("zntxhdz", "dw"))
                .withSize(7570837536586623824L)
                .withServiceLevel(ServiceLevel.ULTRA)
                .withQosType(QosType.AUTO)
                .withCoolAccess(true)
                .withEncryptionType(EncryptionType.DOUBLE),
            new CapacityPoolInner().withLocation("vt")
                .withTags(mapOf("c", "mqkrhahvljuahaqu", "aex", "hmdua", "vxpvgomz", "pvfadmwsrcr"))
                .withSize(5146449711958438241L)
                .withServiceLevel(ServiceLevel.ULTRA)
                .withQosType(QosType.AUTO)
                .withCoolAccess(true)
                .withEncryptionType(EncryptionType.DOUBLE),
            new CapacityPoolInner().withLocation("civyhzceuo")
                .withTags(mapOf("ueiotwmcdyt", "rw", "it", "x", "hniskxfbkpyc", "nrjawgqwg"))
                .withSize(2516732809766062265L)
                .withServiceLevel(ServiceLevel.STANDARD_ZRS)
                .withQosType(QosType.MANUAL)
                .withCoolAccess(false)
                .withEncryptionType(EncryptionType.SINGLE)))
            .withNextLink("ujznb");
        model = BinaryData.fromObject(model).toObject(CapacityPoolList.class);
        Assertions.assertEquals("xv", model.value().get(0).location());
        Assertions.assertEquals("dw", model.value().get(0).tags().get("zntxhdz"));
        Assertions.assertEquals(7570837536586623824L, model.value().get(0).size());
        Assertions.assertEquals(ServiceLevel.ULTRA, model.value().get(0).serviceLevel());
        Assertions.assertEquals(QosType.AUTO, model.value().get(0).qosType());
        Assertions.assertEquals(true, model.value().get(0).coolAccess());
        Assertions.assertEquals(EncryptionType.DOUBLE, model.value().get(0).encryptionType());
        Assertions.assertEquals("ujznb", model.nextLink());
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
