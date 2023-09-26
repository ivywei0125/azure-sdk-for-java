// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.A2AExtendedLocationDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.A2AFabricSpecificLocationDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.A2AZoneDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AzureFabricSpecificDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ExtendedLocation;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ExtendedLocationType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureFabricSpecificDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureFabricSpecificDetails model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"Azure\",\"location\":\"rrlkmdskjhhx\",\"containerIds\":[\"jfoxcxscvslxl\",\"uavkrmukm\"],\"zones\":[{\"source\":\"xett\",\"target\":\"lojfkqidnqto\"},{\"source\":\"jhqxc\",\"target\":\"htkbtnq\"},{\"source\":\"ngldmbiipsn\",\"target\":\"wl\"}],\"extendedLocations\":[{\"primaryExtendedLocation\":{\"name\":\"xhhllxricct\",\"type\":\"EdgeZone\"},\"recoveryExtendedLocation\":{\"name\":\"uqqoaj\",\"type\":\"EdgeZone\"}},{\"primaryExtendedLocation\":{\"name\":\"y\",\"type\":\"EdgeZone\"},\"recoveryExtendedLocation\":{\"name\":\"srwvaexhdctrce\",\"type\":\"EdgeZone\"}},{\"primaryExtendedLocation\":{\"name\":\"brupobehdmljza\",\"type\":\"EdgeZone\"},\"recoveryExtendedLocation\":{\"name\":\"me\",\"type\":\"EdgeZone\"}}],\"locationDetails\":[{\"initialPrimaryZone\":\"bn\",\"initialRecoveryZone\":\"phepifexleqirc\",\"initialPrimaryExtendedLocation\":{\"name\":\"cly\",\"type\":\"EdgeZone\"},\"initialRecoveryExtendedLocation\":{\"name\":\"x\",\"type\":\"EdgeZone\"},\"initialPrimaryFabricLocation\":\"jlvczu\",\"initialRecoveryFabricLocation\":\"ac\",\"primaryZone\":\"nettepdjxqeskoy\",\"recoveryZone\":\"iylpck\",\"primaryExtendedLocation\":{\"name\":\"wsedvesk\",\"type\":\"EdgeZone\"},\"recoveryExtendedLocation\":{\"name\":\"gqphrgfnzhctmjts\",\"type\":\"EdgeZone\"},\"primaryFabricLocation\":\"bcbcpz\",\"recoveryFabricLocation\":\"pzeqacdldtz\"},{\"initialPrimaryZone\":\"ypefcpczshnuqnda\",\"initialRecoveryZone\":\"upfkhuytuszxhmtv\",\"initialPrimaryExtendedLocation\":{\"name\":\"egw\",\"type\":\"EdgeZone\"},\"initialRecoveryExtendedLocation\":{\"name\":\"kvzwydw\",\"type\":\"EdgeZone\"},\"initialPrimaryFabricLocation\":\"aokgkskjivbsshaj\",\"initialRecoveryFabricLocation\":\"u\",\"primaryZone\":\"eexpgeumi\",\"recoveryZone\":\"wuit\",\"primaryExtendedLocation\":{\"name\":\"exyionofninbd\",\"type\":\"EdgeZone\"},\"recoveryExtendedLocation\":{\"name\":\"xcwqqrsmpc\",\"type\":\"EdgeZone\"},\"primaryFabricLocation\":\"rtugavbzbcyks\",\"recoveryFabricLocation\":\"mf\"},{\"initialPrimaryZone\":\"dr\",\"initialRecoveryZone\":\"fcmkr\",\"initialPrimaryExtendedLocation\":{\"name\":\"sjcwjjxsgmbawvif\",\"type\":\"EdgeZone\"},\"initialRecoveryExtendedLocation\":{\"name\":\"eci\",\"type\":\"EdgeZone\"},\"initialPrimaryFabricLocation\":\"cjxwkloozrvtxvcm\",\"initialRecoveryFabricLocation\":\"unlcpxxv\",\"primaryZone\":\"yeyng\",\"recoveryZone\":\"vrquv\",\"primaryExtendedLocation\":{\"name\":\"gglpmcrdcuelj\",\"type\":\"EdgeZone\"},\"recoveryExtendedLocation\":{\"name\":\"hxmfqryarvsxzqb\",\"type\":\"EdgeZone\"},\"primaryFabricLocation\":\"jkayspthzo\",\"recoveryFabricLocation\":\"btl\"},{\"initialPrimaryZone\":\"tgblioskkfmk\",\"initialRecoveryZone\":\"djxyxgbkkqvjcteo\",\"initialPrimaryExtendedLocation\":{\"name\":\"l\",\"type\":\"EdgeZone\"},\"initialRecoveryExtendedLocation\":{\"name\":\"skkzpxvjnzdpvo\",\"type\":\"EdgeZone\"},\"initialPrimaryFabricLocation\":\"hpcnabxzfsn\",\"initialRecoveryFabricLocation\":\"ytexvzilmhivzk\",\"primaryZone\":\"wncknr\",\"recoveryZone\":\"ajlskzptj\",\"primaryExtendedLocation\":{\"name\":\"lwe\",\"type\":\"EdgeZone\"},\"recoveryExtendedLocation\":{\"name\":\"rthxqlehmcg\",\"type\":\"EdgeZone\"},\"primaryFabricLocation\":\"inue\",\"recoveryFabricLocation\":\"kamvfe\"}]}")
                .toObject(AzureFabricSpecificDetails.class);
        Assertions.assertEquals("rrlkmdskjhhx", model.location());
        Assertions.assertEquals("jfoxcxscvslxl", model.containerIds().get(0));
        Assertions.assertEquals("xett", model.zones().get(0).source());
        Assertions.assertEquals("lojfkqidnqto", model.zones().get(0).target());
        Assertions.assertEquals("xhhllxricct", model.extendedLocations().get(0).primaryExtendedLocation().name());
        Assertions
            .assertEquals(
                ExtendedLocationType.EDGE_ZONE, model.extendedLocations().get(0).primaryExtendedLocation().type());
        Assertions.assertEquals("uqqoaj", model.extendedLocations().get(0).recoveryExtendedLocation().name());
        Assertions
            .assertEquals(
                ExtendedLocationType.EDGE_ZONE, model.extendedLocations().get(0).recoveryExtendedLocation().type());
        Assertions.assertEquals("bn", model.locationDetails().get(0).initialPrimaryZone());
        Assertions.assertEquals("phepifexleqirc", model.locationDetails().get(0).initialRecoveryZone());
        Assertions.assertEquals("cly", model.locationDetails().get(0).initialPrimaryExtendedLocation().name());
        Assertions
            .assertEquals(
                ExtendedLocationType.EDGE_ZONE, model.locationDetails().get(0).initialPrimaryExtendedLocation().type());
        Assertions.assertEquals("x", model.locationDetails().get(0).initialRecoveryExtendedLocation().name());
        Assertions
            .assertEquals(
                ExtendedLocationType.EDGE_ZONE,
                model.locationDetails().get(0).initialRecoveryExtendedLocation().type());
        Assertions.assertEquals("jlvczu", model.locationDetails().get(0).initialPrimaryFabricLocation());
        Assertions.assertEquals("ac", model.locationDetails().get(0).initialRecoveryFabricLocation());
        Assertions.assertEquals("nettepdjxqeskoy", model.locationDetails().get(0).primaryZone());
        Assertions.assertEquals("iylpck", model.locationDetails().get(0).recoveryZone());
        Assertions.assertEquals("wsedvesk", model.locationDetails().get(0).primaryExtendedLocation().name());
        Assertions
            .assertEquals(
                ExtendedLocationType.EDGE_ZONE, model.locationDetails().get(0).primaryExtendedLocation().type());
        Assertions.assertEquals("gqphrgfnzhctmjts", model.locationDetails().get(0).recoveryExtendedLocation().name());
        Assertions
            .assertEquals(
                ExtendedLocationType.EDGE_ZONE, model.locationDetails().get(0).recoveryExtendedLocation().type());
        Assertions.assertEquals("bcbcpz", model.locationDetails().get(0).primaryFabricLocation());
        Assertions.assertEquals("pzeqacdldtz", model.locationDetails().get(0).recoveryFabricLocation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureFabricSpecificDetails model =
            new AzureFabricSpecificDetails()
                .withLocation("rrlkmdskjhhx")
                .withContainerIds(Arrays.asList("jfoxcxscvslxl", "uavkrmukm"))
                .withZones(
                    Arrays
                        .asList(
                            new A2AZoneDetails().withSource("xett").withTarget("lojfkqidnqto"),
                            new A2AZoneDetails().withSource("jhqxc").withTarget("htkbtnq"),
                            new A2AZoneDetails().withSource("ngldmbiipsn").withTarget("wl")))
                .withExtendedLocations(
                    Arrays
                        .asList(
                            new A2AExtendedLocationDetails()
                                .withPrimaryExtendedLocation(
                                    new ExtendedLocation()
                                        .withName("xhhllxricct")
                                        .withType(ExtendedLocationType.EDGE_ZONE))
                                .withRecoveryExtendedLocation(
                                    new ExtendedLocation().withName("uqqoaj").withType(ExtendedLocationType.EDGE_ZONE)),
                            new A2AExtendedLocationDetails()
                                .withPrimaryExtendedLocation(
                                    new ExtendedLocation().withName("y").withType(ExtendedLocationType.EDGE_ZONE))
                                .withRecoveryExtendedLocation(
                                    new ExtendedLocation()
                                        .withName("srwvaexhdctrce")
                                        .withType(ExtendedLocationType.EDGE_ZONE)),
                            new A2AExtendedLocationDetails()
                                .withPrimaryExtendedLocation(
                                    new ExtendedLocation()
                                        .withName("brupobehdmljza")
                                        .withType(ExtendedLocationType.EDGE_ZONE))
                                .withRecoveryExtendedLocation(
                                    new ExtendedLocation().withName("me").withType(ExtendedLocationType.EDGE_ZONE))))
                .withLocationDetails(
                    Arrays
                        .asList(
                            new A2AFabricSpecificLocationDetails()
                                .withInitialPrimaryZone("bn")
                                .withInitialRecoveryZone("phepifexleqirc")
                                .withInitialPrimaryExtendedLocation(
                                    new ExtendedLocation().withName("cly").withType(ExtendedLocationType.EDGE_ZONE))
                                .withInitialRecoveryExtendedLocation(
                                    new ExtendedLocation().withName("x").withType(ExtendedLocationType.EDGE_ZONE))
                                .withInitialPrimaryFabricLocation("jlvczu")
                                .withInitialRecoveryFabricLocation("ac")
                                .withPrimaryZone("nettepdjxqeskoy")
                                .withRecoveryZone("iylpck")
                                .withPrimaryExtendedLocation(
                                    new ExtendedLocation()
                                        .withName("wsedvesk")
                                        .withType(ExtendedLocationType.EDGE_ZONE))
                                .withRecoveryExtendedLocation(
                                    new ExtendedLocation()
                                        .withName("gqphrgfnzhctmjts")
                                        .withType(ExtendedLocationType.EDGE_ZONE))
                                .withPrimaryFabricLocation("bcbcpz")
                                .withRecoveryFabricLocation("pzeqacdldtz"),
                            new A2AFabricSpecificLocationDetails()
                                .withInitialPrimaryZone("ypefcpczshnuqnda")
                                .withInitialRecoveryZone("upfkhuytuszxhmtv")
                                .withInitialPrimaryExtendedLocation(
                                    new ExtendedLocation().withName("egw").withType(ExtendedLocationType.EDGE_ZONE))
                                .withInitialRecoveryExtendedLocation(
                                    new ExtendedLocation().withName("kvzwydw").withType(ExtendedLocationType.EDGE_ZONE))
                                .withInitialPrimaryFabricLocation("aokgkskjivbsshaj")
                                .withInitialRecoveryFabricLocation("u")
                                .withPrimaryZone("eexpgeumi")
                                .withRecoveryZone("wuit")
                                .withPrimaryExtendedLocation(
                                    new ExtendedLocation()
                                        .withName("exyionofninbd")
                                        .withType(ExtendedLocationType.EDGE_ZONE))
                                .withRecoveryExtendedLocation(
                                    new ExtendedLocation()
                                        .withName("xcwqqrsmpc")
                                        .withType(ExtendedLocationType.EDGE_ZONE))
                                .withPrimaryFabricLocation("rtugavbzbcyks")
                                .withRecoveryFabricLocation("mf"),
                            new A2AFabricSpecificLocationDetails()
                                .withInitialPrimaryZone("dr")
                                .withInitialRecoveryZone("fcmkr")
                                .withInitialPrimaryExtendedLocation(
                                    new ExtendedLocation()
                                        .withName("sjcwjjxsgmbawvif")
                                        .withType(ExtendedLocationType.EDGE_ZONE))
                                .withInitialRecoveryExtendedLocation(
                                    new ExtendedLocation().withName("eci").withType(ExtendedLocationType.EDGE_ZONE))
                                .withInitialPrimaryFabricLocation("cjxwkloozrvtxvcm")
                                .withInitialRecoveryFabricLocation("unlcpxxv")
                                .withPrimaryZone("yeyng")
                                .withRecoveryZone("vrquv")
                                .withPrimaryExtendedLocation(
                                    new ExtendedLocation()
                                        .withName("gglpmcrdcuelj")
                                        .withType(ExtendedLocationType.EDGE_ZONE))
                                .withRecoveryExtendedLocation(
                                    new ExtendedLocation()
                                        .withName("hxmfqryarvsxzqb")
                                        .withType(ExtendedLocationType.EDGE_ZONE))
                                .withPrimaryFabricLocation("jkayspthzo")
                                .withRecoveryFabricLocation("btl"),
                            new A2AFabricSpecificLocationDetails()
                                .withInitialPrimaryZone("tgblioskkfmk")
                                .withInitialRecoveryZone("djxyxgbkkqvjcteo")
                                .withInitialPrimaryExtendedLocation(
                                    new ExtendedLocation().withName("l").withType(ExtendedLocationType.EDGE_ZONE))
                                .withInitialRecoveryExtendedLocation(
                                    new ExtendedLocation()
                                        .withName("skkzpxvjnzdpvo")
                                        .withType(ExtendedLocationType.EDGE_ZONE))
                                .withInitialPrimaryFabricLocation("hpcnabxzfsn")
                                .withInitialRecoveryFabricLocation("ytexvzilmhivzk")
                                .withPrimaryZone("wncknr")
                                .withRecoveryZone("ajlskzptj")
                                .withPrimaryExtendedLocation(
                                    new ExtendedLocation().withName("lwe").withType(ExtendedLocationType.EDGE_ZONE))
                                .withRecoveryExtendedLocation(
                                    new ExtendedLocation()
                                        .withName("rthxqlehmcg")
                                        .withType(ExtendedLocationType.EDGE_ZONE))
                                .withPrimaryFabricLocation("inue")
                                .withRecoveryFabricLocation("kamvfe")));
        model = BinaryData.fromObject(model).toObject(AzureFabricSpecificDetails.class);
        Assertions.assertEquals("rrlkmdskjhhx", model.location());
        Assertions.assertEquals("jfoxcxscvslxl", model.containerIds().get(0));
        Assertions.assertEquals("xett", model.zones().get(0).source());
        Assertions.assertEquals("lojfkqidnqto", model.zones().get(0).target());
        Assertions.assertEquals("xhhllxricct", model.extendedLocations().get(0).primaryExtendedLocation().name());
        Assertions
            .assertEquals(
                ExtendedLocationType.EDGE_ZONE, model.extendedLocations().get(0).primaryExtendedLocation().type());
        Assertions.assertEquals("uqqoaj", model.extendedLocations().get(0).recoveryExtendedLocation().name());
        Assertions
            .assertEquals(
                ExtendedLocationType.EDGE_ZONE, model.extendedLocations().get(0).recoveryExtendedLocation().type());
        Assertions.assertEquals("bn", model.locationDetails().get(0).initialPrimaryZone());
        Assertions.assertEquals("phepifexleqirc", model.locationDetails().get(0).initialRecoveryZone());
        Assertions.assertEquals("cly", model.locationDetails().get(0).initialPrimaryExtendedLocation().name());
        Assertions
            .assertEquals(
                ExtendedLocationType.EDGE_ZONE, model.locationDetails().get(0).initialPrimaryExtendedLocation().type());
        Assertions.assertEquals("x", model.locationDetails().get(0).initialRecoveryExtendedLocation().name());
        Assertions
            .assertEquals(
                ExtendedLocationType.EDGE_ZONE,
                model.locationDetails().get(0).initialRecoveryExtendedLocation().type());
        Assertions.assertEquals("jlvczu", model.locationDetails().get(0).initialPrimaryFabricLocation());
        Assertions.assertEquals("ac", model.locationDetails().get(0).initialRecoveryFabricLocation());
        Assertions.assertEquals("nettepdjxqeskoy", model.locationDetails().get(0).primaryZone());
        Assertions.assertEquals("iylpck", model.locationDetails().get(0).recoveryZone());
        Assertions.assertEquals("wsedvesk", model.locationDetails().get(0).primaryExtendedLocation().name());
        Assertions
            .assertEquals(
                ExtendedLocationType.EDGE_ZONE, model.locationDetails().get(0).primaryExtendedLocation().type());
        Assertions.assertEquals("gqphrgfnzhctmjts", model.locationDetails().get(0).recoveryExtendedLocation().name());
        Assertions
            .assertEquals(
                ExtendedLocationType.EDGE_ZONE, model.locationDetails().get(0).recoveryExtendedLocation().type());
        Assertions.assertEquals("bcbcpz", model.locationDetails().get(0).primaryFabricLocation());
        Assertions.assertEquals("pzeqacdldtz", model.locationDetails().get(0).recoveryFabricLocation());
    }
}
