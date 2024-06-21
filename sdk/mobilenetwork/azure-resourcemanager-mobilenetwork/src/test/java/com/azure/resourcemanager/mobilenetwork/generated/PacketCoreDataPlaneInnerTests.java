// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCoreDataPlaneInner;
import com.azure.resourcemanager.mobilenetwork.models.InterfaceProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PacketCoreDataPlaneInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PacketCoreDataPlaneInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Accepted\",\"userPlaneAccessInterface\":{\"name\":\"cskfcktqumiekk\",\"ipv4Address\":\"zikhl\",\"ipv4Subnet\":\"jhdgqggebdunyga\",\"ipv4Gateway\":\"idb\",\"vlanId\":1233334035,\"ipv4AddressList\":[\"xllrxcyjm\",\"a\"],\"bfdIpv4Endpoints\":[\"varmywdmj\",\"jqbjhhy\",\"xrwlyc\",\"duhpk\"]},\"userPlaneAccessVirtualIpv4Addresses\":[\"ymareqnajxqugj\",\"ky\"]},\"location\":\"beddgssofw\",\"tags\":{\"rmnjijpx\":\"qal\",\"byxbaaabjy\":\"cqqudf\",\"zrtuzq\":\"ayffim\",\"fdnw\":\"gsexne\"},\"id\":\"wmewzsyy\",\"name\":\"euzsoi\",\"type\":\"judpfrxt\"}")
            .toObject(PacketCoreDataPlaneInner.class);
        Assertions.assertEquals("beddgssofw", model.location());
        Assertions.assertEquals("qal", model.tags().get("rmnjijpx"));
        Assertions.assertEquals("cskfcktqumiekk", model.userPlaneAccessInterface().name());
        Assertions.assertEquals("zikhl", model.userPlaneAccessInterface().ipv4Address());
        Assertions.assertEquals("jhdgqggebdunyga", model.userPlaneAccessInterface().ipv4Subnet());
        Assertions.assertEquals("idb", model.userPlaneAccessInterface().ipv4Gateway());
        Assertions.assertEquals(1233334035, model.userPlaneAccessInterface().vlanId());
        Assertions.assertEquals("xllrxcyjm", model.userPlaneAccessInterface().ipv4AddressList().get(0));
        Assertions.assertEquals("varmywdmj", model.userPlaneAccessInterface().bfdIpv4Endpoints().get(0));
        Assertions.assertEquals("ymareqnajxqugj", model.userPlaneAccessVirtualIpv4Addresses().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PacketCoreDataPlaneInner model = new PacketCoreDataPlaneInner().withLocation("beddgssofw")
            .withTags(mapOf("rmnjijpx", "qal", "byxbaaabjy", "cqqudf", "zrtuzq", "ayffim", "fdnw", "gsexne"))
            .withUserPlaneAccessInterface(new InterfaceProperties().withName("cskfcktqumiekk")
                .withIpv4Address("zikhl")
                .withIpv4Subnet("jhdgqggebdunyga")
                .withIpv4Gateway("idb")
                .withVlanId(1233334035)
                .withIpv4AddressList(Arrays.asList("xllrxcyjm", "a"))
                .withBfdIpv4Endpoints(Arrays.asList("varmywdmj", "jqbjhhy", "xrwlyc", "duhpk")))
            .withUserPlaneAccessVirtualIpv4Addresses(Arrays.asList("ymareqnajxqugj", "ky"));
        model = BinaryData.fromObject(model).toObject(PacketCoreDataPlaneInner.class);
        Assertions.assertEquals("beddgssofw", model.location());
        Assertions.assertEquals("qal", model.tags().get("rmnjijpx"));
        Assertions.assertEquals("cskfcktqumiekk", model.userPlaneAccessInterface().name());
        Assertions.assertEquals("zikhl", model.userPlaneAccessInterface().ipv4Address());
        Assertions.assertEquals("jhdgqggebdunyga", model.userPlaneAccessInterface().ipv4Subnet());
        Assertions.assertEquals("idb", model.userPlaneAccessInterface().ipv4Gateway());
        Assertions.assertEquals(1233334035, model.userPlaneAccessInterface().vlanId());
        Assertions.assertEquals("xllrxcyjm", model.userPlaneAccessInterface().ipv4AddressList().get(0));
        Assertions.assertEquals("varmywdmj", model.userPlaneAccessInterface().bfdIpv4Endpoints().get(0));
        Assertions.assertEquals("ymareqnajxqugj", model.userPlaneAccessVirtualIpv4Addresses().get(0));
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
