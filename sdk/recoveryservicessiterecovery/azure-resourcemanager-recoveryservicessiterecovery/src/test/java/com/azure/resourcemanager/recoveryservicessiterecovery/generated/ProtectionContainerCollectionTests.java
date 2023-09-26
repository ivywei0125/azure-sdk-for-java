// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ProtectionContainerInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ProtectionContainerCollection;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ProtectionContainerFabricSpecificDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ProtectionContainerProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ProtectionContainerCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProtectionContainerCollection model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"fabricFriendlyName\":\"lpbuxwgipwhonowk\",\"friendlyName\":\"hwankixzbinjepu\",\"fabricType\":\"mryw\",\"protectedItemCount\":2134987728,\"pairingStatus\":\"qftiy\",\"role\":\"rnkcqvyxlw\",\"fabricSpecificDetails\":{\"instanceType\":\"sicohoqqnwvlry\"}},\"location\":\"w\",\"id\":\"heun\",\"name\":\"mqhgyxzkonocuk\",\"type\":\"klyaxuconu\"},{\"properties\":{\"fabricFriendlyName\":\"fkbey\",\"friendlyName\":\"wrmjmwvvjektc\",\"fabricType\":\"enhwlrs\",\"protectedItemCount\":1160903159,\"pairingStatus\":\"pwvlqdq\",\"role\":\"iqylihkaetck\",\"fabricSpecificDetails\":{\"instanceType\":\"civfsnkymuctq\"}},\"location\":\"fbebrjcxer\",\"id\":\"uwutttxfvjrbi\",\"name\":\"phxepcyvahf\",\"type\":\"ljkyqxjvuuj\"},{\"properties\":{\"fabricFriendlyName\":\"dokgjl\",\"friendlyName\":\"oxgvclt\",\"fabricType\":\"sncghkjeszz\",\"protectedItemCount\":1537141479,\"pairingStatus\":\"htxfvgxbfsmxnehm\",\"role\":\"ec\",\"fabricSpecificDetails\":{\"instanceType\":\"debfqkkrbmpukgri\"}},\"location\":\"lzlfbxzpuz\",\"id\":\"cispnqzahmgkbr\",\"name\":\"yydhibnuqqk\",\"type\":\"ik\"},{\"properties\":{\"fabricFriendlyName\":\"gvtqagnbuynh\",\"friendlyName\":\"gg\",\"fabricType\":\"bfs\",\"protectedItemCount\":600405260,\"pairingStatus\":\"utrc\",\"role\":\"na\",\"fabricSpecificDetails\":{\"instanceType\":\"hj\"}},\"location\":\"nmpxttdb\",\"id\":\"rbnlankxmyskp\",\"name\":\"henbtkcxywnytn\",\"type\":\"synlqidybyxczfc\"}],\"nextLink\":\"aaxdbabphlwrq\"}")
                .toObject(ProtectionContainerCollection.class);
        Assertions.assertEquals("lpbuxwgipwhonowk", model.value().get(0).properties().fabricFriendlyName());
        Assertions.assertEquals("hwankixzbinjepu", model.value().get(0).properties().friendlyName());
        Assertions.assertEquals("mryw", model.value().get(0).properties().fabricType());
        Assertions.assertEquals(2134987728, model.value().get(0).properties().protectedItemCount());
        Assertions.assertEquals("qftiy", model.value().get(0).properties().pairingStatus());
        Assertions.assertEquals("rnkcqvyxlw", model.value().get(0).properties().role());
        Assertions.assertEquals("w", model.value().get(0).location());
        Assertions.assertEquals("aaxdbabphlwrq", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProtectionContainerCollection model =
            new ProtectionContainerCollection()
                .withValue(
                    Arrays
                        .asList(
                            new ProtectionContainerInner()
                                .withProperties(
                                    new ProtectionContainerProperties()
                                        .withFabricFriendlyName("lpbuxwgipwhonowk")
                                        .withFriendlyName("hwankixzbinjepu")
                                        .withFabricType("mryw")
                                        .withProtectedItemCount(2134987728)
                                        .withPairingStatus("qftiy")
                                        .withRole("rnkcqvyxlw")
                                        .withFabricSpecificDetails(new ProtectionContainerFabricSpecificDetails()))
                                .withLocation("w"),
                            new ProtectionContainerInner()
                                .withProperties(
                                    new ProtectionContainerProperties()
                                        .withFabricFriendlyName("fkbey")
                                        .withFriendlyName("wrmjmwvvjektc")
                                        .withFabricType("enhwlrs")
                                        .withProtectedItemCount(1160903159)
                                        .withPairingStatus("pwvlqdq")
                                        .withRole("iqylihkaetck")
                                        .withFabricSpecificDetails(new ProtectionContainerFabricSpecificDetails()))
                                .withLocation("fbebrjcxer"),
                            new ProtectionContainerInner()
                                .withProperties(
                                    new ProtectionContainerProperties()
                                        .withFabricFriendlyName("dokgjl")
                                        .withFriendlyName("oxgvclt")
                                        .withFabricType("sncghkjeszz")
                                        .withProtectedItemCount(1537141479)
                                        .withPairingStatus("htxfvgxbfsmxnehm")
                                        .withRole("ec")
                                        .withFabricSpecificDetails(new ProtectionContainerFabricSpecificDetails()))
                                .withLocation("lzlfbxzpuz"),
                            new ProtectionContainerInner()
                                .withProperties(
                                    new ProtectionContainerProperties()
                                        .withFabricFriendlyName("gvtqagnbuynh")
                                        .withFriendlyName("gg")
                                        .withFabricType("bfs")
                                        .withProtectedItemCount(600405260)
                                        .withPairingStatus("utrc")
                                        .withRole("na")
                                        .withFabricSpecificDetails(new ProtectionContainerFabricSpecificDetails()))
                                .withLocation("nmpxttdb")))
                .withNextLink("aaxdbabphlwrq");
        model = BinaryData.fromObject(model).toObject(ProtectionContainerCollection.class);
        Assertions.assertEquals("lpbuxwgipwhonowk", model.value().get(0).properties().fabricFriendlyName());
        Assertions.assertEquals("hwankixzbinjepu", model.value().get(0).properties().friendlyName());
        Assertions.assertEquals("mryw", model.value().get(0).properties().fabricType());
        Assertions.assertEquals(2134987728, model.value().get(0).properties().protectedItemCount());
        Assertions.assertEquals("qftiy", model.value().get(0).properties().pairingStatus());
        Assertions.assertEquals("rnkcqvyxlw", model.value().get(0).properties().role());
        Assertions.assertEquals("w", model.value().get(0).location());
        Assertions.assertEquals("aaxdbabphlwrq", model.nextLink());
    }
}
