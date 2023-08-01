// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimPolicyInner;
import com.azure.resourcemanager.mobilenetwork.models.Ambr;
import com.azure.resourcemanager.mobilenetwork.models.DataNetworkConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.DataNetworkResourceId;
import com.azure.resourcemanager.mobilenetwork.models.PduSessionType;
import com.azure.resourcemanager.mobilenetwork.models.PreemptionCapability;
import com.azure.resourcemanager.mobilenetwork.models.PreemptionVulnerability;
import com.azure.resourcemanager.mobilenetwork.models.ServiceResourceId;
import com.azure.resourcemanager.mobilenetwork.models.SliceConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.SliceResourceId;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SimPolicyInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SimPolicyInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Unknown\",\"siteProvisioningState\":{\"bsdshmkxmaehvbbx\":\"Provisioned\",\"iplt\":\"NotApplicable\"},\"ueAmbr\":{\"uplink\":\"n\",\"downlink\":\"tbaxk\"},\"defaultSlice\":{\"id\":\"xywr\"},\"rfspIndex\":1619197472,\"registrationTimer\":479149992,\"sliceConfigurations\":[{\"slice\":{\"id\":\"yhpluodpvruudlgz\"},\"defaultDataNetwork\":{\"id\":\"bth\"},\"dataNetworkConfigurations\":[{\"dataNetwork\":{\"id\":\"tgk\"},\"sessionAmbr\":{\"uplink\":\"stvdxeclz\",\"downlink\":\"dqbcvhzlhplod\"},\"5qi\":1140864864,\"allocationAndRetentionPriorityLevel\":1592538634,\"preemptionCapability\":\"MayPreempt\",\"preemptionVulnerability\":\"NotPreemptable\",\"defaultSessionType\":\"IPv6\",\"additionalAllowedSessionTypes\":[\"IPv4\",\"IPv6\"],\"allowedServices\":[{\"id\":\"qjfsmlmbtxhw\"},{\"id\":\"fwsrtawcoezbrhu\"}],\"maximumNumberOfBufferedPackets\":518235624},{\"dataNetwork\":{\"id\":\"hud\"},\"sessionAmbr\":{\"uplink\":\"goo\",\"downlink\":\"kkqfqjbvle\"},\"5qi\":1730138654,\"allocationAndRetentionPriorityLevel\":1618097313,\"preemptionCapability\":\"MayPreempt\",\"preemptionVulnerability\":\"NotPreemptable\",\"defaultSessionType\":\"IPv4\",\"additionalAllowedSessionTypes\":[\"IPv4\",\"IPv6\",\"IPv6\"],\"allowedServices\":[{\"id\":\"qqybarye\"},{\"id\":\"ayjkqa\"}],\"maximumNumberOfBufferedPackets\":2002865497}]},{\"slice\":{\"id\":\"zslesjcbher\"},\"defaultDataNetwork\":{\"id\":\"ntiew\"},\"dataNetworkConfigurations\":[{\"dataNetwork\":{\"id\":\"cv\"},\"sessionAmbr\":{\"uplink\":\"quwrbehwag\",\"downlink\":\"hbuffkmrq\"},\"5qi\":226189444,\"allocationAndRetentionPriorityLevel\":1393141923,\"preemptionCapability\":\"NotPreempt\",\"preemptionVulnerability\":\"NotPreemptable\",\"defaultSessionType\":\"IPv6\",\"additionalAllowedSessionTypes\":[\"IPv4\",\"IPv4\"],\"allowedServices\":[{\"id\":\"oe\"},{\"id\":\"jvewzcjznmwcp\"},{\"id\":\"guaadraufactkahz\"}],\"maximumNumberOfBufferedPackets\":1219742698}]},{\"slice\":{\"id\":\"jjziuxxpsh\"},\"defaultDataNetwork\":{\"id\":\"eekulfgslqubkwd\"},\"dataNetworkConfigurations\":[{\"dataNetwork\":{\"id\":\"nrdsutujbazpjuoh\"},\"sessionAmbr\":{\"uplink\":\"inyflnorwmduvwp\",\"downlink\":\"lvxwmyg\"},\"5qi\":1521698279,\"allocationAndRetentionPriorityLevel\":181907688,\"preemptionCapability\":\"NotPreempt\",\"preemptionVulnerability\":\"NotPreemptable\",\"defaultSessionType\":\"IPv4\",\"additionalAllowedSessionTypes\":[\"IPv4\",\"IPv4\"],\"allowedServices\":[{\"id\":\"jcrxgibbdaxcon\"},{\"id\":\"ozauorsukokwb\"},{\"id\":\"plhlvnuuepzlrp\"},{\"id\":\"wzsoldweyuqdunv\"}],\"maximumNumberOfBufferedPackets\":221136034}]},{\"slice\":{\"id\":\"rwrbi\"},\"defaultDataNetwork\":{\"id\":\"rk\"},\"dataNetworkConfigurations\":[{\"dataNetwork\":{\"id\":\"lywjhh\"},\"sessionAmbr\":{\"uplink\":\"dnhxmsi\",\"downlink\":\"fomiloxgg\"},\"5qi\":524951220,\"allocationAndRetentionPriorityLevel\":75081100,\"preemptionCapability\":\"MayPreempt\",\"preemptionVulnerability\":\"NotPreemptable\",\"defaultSessionType\":\"IPv6\",\"additionalAllowedSessionTypes\":[\"IPv4\",\"IPv4\",\"IPv6\"],\"allowedServices\":[{\"id\":\"vcyy\"},{\"id\":\"s\"},{\"id\":\"gdotcubiipuipwo\"}],\"maximumNumberOfBufferedPackets\":1120696384},{\"dataNetwork\":{\"id\":\"macjekn\"},\"sessionAmbr\":{\"uplink\":\"zshq\",\"downlink\":\"cimpevfg\"},\"5qi\":910650574,\"allocationAndRetentionPriorityLevel\":1947593422,\"preemptionCapability\":\"NotPreempt\",\"preemptionVulnerability\":\"NotPreemptable\",\"defaultSessionType\":\"IPv4\",\"additionalAllowedSessionTypes\":[\"IPv6\",\"IPv4\",\"IPv4\"],\"allowedServices\":[{\"id\":\"wrwfscjfnyns\"},{\"id\":\"qujizdvo\"}],\"maximumNumberOfBufferedPackets\":918297012},{\"dataNetwork\":{\"id\":\"ibyowbblgyavutp\"},\"sessionAmbr\":{\"uplink\":\"hjoxo\",\"downlink\":\"smsks\"},\"5qi\":791689891,\"allocationAndRetentionPriorityLevel\":1015646968,\"preemptionCapability\":\"NotPreempt\",\"preemptionVulnerability\":\"Preemptable\",\"defaultSessionType\":\"IPv6\",\"additionalAllowedSessionTypes\":[\"IPv6\",\"IPv4\",\"IPv4\",\"IPv6\"],\"allowedServices\":[{\"id\":\"ffgcvizqz\"},{\"id\":\"wlvwlyoupf\"},{\"id\":\"fbkjubdyhgkfmi\"}],\"maximumNumberOfBufferedPackets\":87584157}]}]},\"location\":\"wzf\",\"tags\":{\"ctxtgzukxi\":\"ttktlahbq\",\"xrxc\":\"mmqtgqqqxhr\",\"azivjlfrqttbajl\":\"juisavokqdzf\"},\"id\":\"atnwxyiopi\",\"name\":\"kqqfk\",\"type\":\"vscx\"}")
                .toObject(SimPolicyInner.class);
        Assertions.assertEquals("wzf", model.location());
        Assertions.assertEquals("ttktlahbq", model.tags().get("ctxtgzukxi"));
        Assertions.assertEquals("n", model.ueAmbr().uplink());
        Assertions.assertEquals("tbaxk", model.ueAmbr().downlink());
        Assertions.assertEquals("xywr", model.defaultSlice().id());
        Assertions.assertEquals(1619197472, model.rfspIndex());
        Assertions.assertEquals(479149992, model.registrationTimer());
        Assertions.assertEquals("yhpluodpvruudlgz", model.sliceConfigurations().get(0).slice().id());
        Assertions.assertEquals("bth", model.sliceConfigurations().get(0).defaultDataNetwork().id());
        Assertions
            .assertEquals(
                "tgk", model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).dataNetwork().id());
        Assertions
            .assertEquals(
                "stvdxeclz",
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).sessionAmbr().uplink());
        Assertions
            .assertEquals(
                "dqbcvhzlhplod",
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).sessionAmbr().downlink());
        Assertions
            .assertEquals(1140864864, model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).fiveQi());
        Assertions
            .assertEquals(
                1592538634,
                model
                    .sliceConfigurations()
                    .get(0)
                    .dataNetworkConfigurations()
                    .get(0)
                    .allocationAndRetentionPriorityLevel());
        Assertions
            .assertEquals(
                PreemptionCapability.MAY_PREEMPT,
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).preemptionCapability());
        Assertions
            .assertEquals(
                PreemptionVulnerability.NOT_PREEMPTABLE,
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).preemptionVulnerability());
        Assertions
            .assertEquals(
                PduSessionType.IPV6,
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).defaultSessionType());
        Assertions
            .assertEquals(
                PduSessionType.IPV4,
                model
                    .sliceConfigurations()
                    .get(0)
                    .dataNetworkConfigurations()
                    .get(0)
                    .additionalAllowedSessionTypes()
                    .get(0));
        Assertions
            .assertEquals(
                "qjfsmlmbtxhw",
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).allowedServices().get(0).id());
        Assertions
            .assertEquals(
                518235624,
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).maximumNumberOfBufferedPackets());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SimPolicyInner model =
            new SimPolicyInner()
                .withLocation("wzf")
                .withTags(mapOf("ctxtgzukxi", "ttktlahbq", "xrxc", "mmqtgqqqxhr", "azivjlfrqttbajl", "juisavokqdzf"))
                .withUeAmbr(new Ambr().withUplink("n").withDownlink("tbaxk"))
                .withDefaultSlice(new SliceResourceId().withId("xywr"))
                .withRfspIndex(1619197472)
                .withRegistrationTimer(479149992)
                .withSliceConfigurations(
                    Arrays
                        .asList(
                            new SliceConfiguration()
                                .withSlice(new SliceResourceId().withId("yhpluodpvruudlgz"))
                                .withDefaultDataNetwork(new DataNetworkResourceId().withId("bth"))
                                .withDataNetworkConfigurations(
                                    Arrays
                                        .asList(
                                            new DataNetworkConfiguration()
                                                .withDataNetwork(new DataNetworkResourceId().withId("tgk"))
                                                .withSessionAmbr(
                                                    new Ambr().withUplink("stvdxeclz").withDownlink("dqbcvhzlhplod"))
                                                .withFiveQi(1140864864)
                                                .withAllocationAndRetentionPriorityLevel(1592538634)
                                                .withPreemptionCapability(PreemptionCapability.MAY_PREEMPT)
                                                .withPreemptionVulnerability(PreemptionVulnerability.NOT_PREEMPTABLE)
                                                .withDefaultSessionType(PduSessionType.IPV6)
                                                .withAdditionalAllowedSessionTypes(
                                                    Arrays.asList(PduSessionType.IPV4, PduSessionType.IPV6))
                                                .withAllowedServices(
                                                    Arrays
                                                        .asList(
                                                            new ServiceResourceId().withId("qjfsmlmbtxhw"),
                                                            new ServiceResourceId().withId("fwsrtawcoezbrhu")))
                                                .withMaximumNumberOfBufferedPackets(518235624),
                                            new DataNetworkConfiguration()
                                                .withDataNetwork(new DataNetworkResourceId().withId("hud"))
                                                .withSessionAmbr(
                                                    new Ambr().withUplink("goo").withDownlink("kkqfqjbvle"))
                                                .withFiveQi(1730138654)
                                                .withAllocationAndRetentionPriorityLevel(1618097313)
                                                .withPreemptionCapability(PreemptionCapability.MAY_PREEMPT)
                                                .withPreemptionVulnerability(PreemptionVulnerability.NOT_PREEMPTABLE)
                                                .withDefaultSessionType(PduSessionType.IPV4)
                                                .withAdditionalAllowedSessionTypes(
                                                    Arrays
                                                        .asList(
                                                            PduSessionType.IPV4,
                                                            PduSessionType.IPV6,
                                                            PduSessionType.IPV6))
                                                .withAllowedServices(
                                                    Arrays
                                                        .asList(
                                                            new ServiceResourceId().withId("qqybarye"),
                                                            new ServiceResourceId().withId("ayjkqa")))
                                                .withMaximumNumberOfBufferedPackets(2002865497))),
                            new SliceConfiguration()
                                .withSlice(new SliceResourceId().withId("zslesjcbher"))
                                .withDefaultDataNetwork(new DataNetworkResourceId().withId("ntiew"))
                                .withDataNetworkConfigurations(
                                    Arrays
                                        .asList(
                                            new DataNetworkConfiguration()
                                                .withDataNetwork(new DataNetworkResourceId().withId("cv"))
                                                .withSessionAmbr(
                                                    new Ambr().withUplink("quwrbehwag").withDownlink("hbuffkmrq"))
                                                .withFiveQi(226189444)
                                                .withAllocationAndRetentionPriorityLevel(1393141923)
                                                .withPreemptionCapability(PreemptionCapability.NOT_PREEMPT)
                                                .withPreemptionVulnerability(PreemptionVulnerability.NOT_PREEMPTABLE)
                                                .withDefaultSessionType(PduSessionType.IPV6)
                                                .withAdditionalAllowedSessionTypes(
                                                    Arrays.asList(PduSessionType.IPV4, PduSessionType.IPV4))
                                                .withAllowedServices(
                                                    Arrays
                                                        .asList(
                                                            new ServiceResourceId().withId("oe"),
                                                            new ServiceResourceId().withId("jvewzcjznmwcp"),
                                                            new ServiceResourceId().withId("guaadraufactkahz")))
                                                .withMaximumNumberOfBufferedPackets(1219742698))),
                            new SliceConfiguration()
                                .withSlice(new SliceResourceId().withId("jjziuxxpsh"))
                                .withDefaultDataNetwork(new DataNetworkResourceId().withId("eekulfgslqubkwd"))
                                .withDataNetworkConfigurations(
                                    Arrays
                                        .asList(
                                            new DataNetworkConfiguration()
                                                .withDataNetwork(new DataNetworkResourceId().withId("nrdsutujbazpjuoh"))
                                                .withSessionAmbr(
                                                    new Ambr().withUplink("inyflnorwmduvwp").withDownlink("lvxwmyg"))
                                                .withFiveQi(1521698279)
                                                .withAllocationAndRetentionPriorityLevel(181907688)
                                                .withPreemptionCapability(PreemptionCapability.NOT_PREEMPT)
                                                .withPreemptionVulnerability(PreemptionVulnerability.NOT_PREEMPTABLE)
                                                .withDefaultSessionType(PduSessionType.IPV4)
                                                .withAdditionalAllowedSessionTypes(
                                                    Arrays.asList(PduSessionType.IPV4, PduSessionType.IPV4))
                                                .withAllowedServices(
                                                    Arrays
                                                        .asList(
                                                            new ServiceResourceId().withId("jcrxgibbdaxcon"),
                                                            new ServiceResourceId().withId("ozauorsukokwb"),
                                                            new ServiceResourceId().withId("plhlvnuuepzlrp"),
                                                            new ServiceResourceId().withId("wzsoldweyuqdunv")))
                                                .withMaximumNumberOfBufferedPackets(221136034))),
                            new SliceConfiguration()
                                .withSlice(new SliceResourceId().withId("rwrbi"))
                                .withDefaultDataNetwork(new DataNetworkResourceId().withId("rk"))
                                .withDataNetworkConfigurations(
                                    Arrays
                                        .asList(
                                            new DataNetworkConfiguration()
                                                .withDataNetwork(new DataNetworkResourceId().withId("lywjhh"))
                                                .withSessionAmbr(
                                                    new Ambr().withUplink("dnhxmsi").withDownlink("fomiloxgg"))
                                                .withFiveQi(524951220)
                                                .withAllocationAndRetentionPriorityLevel(75081100)
                                                .withPreemptionCapability(PreemptionCapability.MAY_PREEMPT)
                                                .withPreemptionVulnerability(PreemptionVulnerability.NOT_PREEMPTABLE)
                                                .withDefaultSessionType(PduSessionType.IPV6)
                                                .withAdditionalAllowedSessionTypes(
                                                    Arrays
                                                        .asList(
                                                            PduSessionType.IPV4,
                                                            PduSessionType.IPV4,
                                                            PduSessionType.IPV6))
                                                .withAllowedServices(
                                                    Arrays
                                                        .asList(
                                                            new ServiceResourceId().withId("vcyy"),
                                                            new ServiceResourceId().withId("s"),
                                                            new ServiceResourceId().withId("gdotcubiipuipwo")))
                                                .withMaximumNumberOfBufferedPackets(1120696384),
                                            new DataNetworkConfiguration()
                                                .withDataNetwork(new DataNetworkResourceId().withId("macjekn"))
                                                .withSessionAmbr(new Ambr().withUplink("zshq").withDownlink("cimpevfg"))
                                                .withFiveQi(910650574)
                                                .withAllocationAndRetentionPriorityLevel(1947593422)
                                                .withPreemptionCapability(PreemptionCapability.NOT_PREEMPT)
                                                .withPreemptionVulnerability(PreemptionVulnerability.NOT_PREEMPTABLE)
                                                .withDefaultSessionType(PduSessionType.IPV4)
                                                .withAdditionalAllowedSessionTypes(
                                                    Arrays
                                                        .asList(
                                                            PduSessionType.IPV6,
                                                            PduSessionType.IPV4,
                                                            PduSessionType.IPV4))
                                                .withAllowedServices(
                                                    Arrays
                                                        .asList(
                                                            new ServiceResourceId().withId("wrwfscjfnyns"),
                                                            new ServiceResourceId().withId("qujizdvo")))
                                                .withMaximumNumberOfBufferedPackets(918297012),
                                            new DataNetworkConfiguration()
                                                .withDataNetwork(new DataNetworkResourceId().withId("ibyowbblgyavutp"))
                                                .withSessionAmbr(new Ambr().withUplink("hjoxo").withDownlink("smsks"))
                                                .withFiveQi(791689891)
                                                .withAllocationAndRetentionPriorityLevel(1015646968)
                                                .withPreemptionCapability(PreemptionCapability.NOT_PREEMPT)
                                                .withPreemptionVulnerability(PreemptionVulnerability.PREEMPTABLE)
                                                .withDefaultSessionType(PduSessionType.IPV6)
                                                .withAdditionalAllowedSessionTypes(
                                                    Arrays
                                                        .asList(
                                                            PduSessionType.IPV6,
                                                            PduSessionType.IPV4,
                                                            PduSessionType.IPV4,
                                                            PduSessionType.IPV6))
                                                .withAllowedServices(
                                                    Arrays
                                                        .asList(
                                                            new ServiceResourceId().withId("ffgcvizqz"),
                                                            new ServiceResourceId().withId("wlvwlyoupf"),
                                                            new ServiceResourceId().withId("fbkjubdyhgkfmi")))
                                                .withMaximumNumberOfBufferedPackets(87584157)))));
        model = BinaryData.fromObject(model).toObject(SimPolicyInner.class);
        Assertions.assertEquals("wzf", model.location());
        Assertions.assertEquals("ttktlahbq", model.tags().get("ctxtgzukxi"));
        Assertions.assertEquals("n", model.ueAmbr().uplink());
        Assertions.assertEquals("tbaxk", model.ueAmbr().downlink());
        Assertions.assertEquals("xywr", model.defaultSlice().id());
        Assertions.assertEquals(1619197472, model.rfspIndex());
        Assertions.assertEquals(479149992, model.registrationTimer());
        Assertions.assertEquals("yhpluodpvruudlgz", model.sliceConfigurations().get(0).slice().id());
        Assertions.assertEquals("bth", model.sliceConfigurations().get(0).defaultDataNetwork().id());
        Assertions
            .assertEquals(
                "tgk", model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).dataNetwork().id());
        Assertions
            .assertEquals(
                "stvdxeclz",
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).sessionAmbr().uplink());
        Assertions
            .assertEquals(
                "dqbcvhzlhplod",
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).sessionAmbr().downlink());
        Assertions
            .assertEquals(1140864864, model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).fiveQi());
        Assertions
            .assertEquals(
                1592538634,
                model
                    .sliceConfigurations()
                    .get(0)
                    .dataNetworkConfigurations()
                    .get(0)
                    .allocationAndRetentionPriorityLevel());
        Assertions
            .assertEquals(
                PreemptionCapability.MAY_PREEMPT,
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).preemptionCapability());
        Assertions
            .assertEquals(
                PreemptionVulnerability.NOT_PREEMPTABLE,
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).preemptionVulnerability());
        Assertions
            .assertEquals(
                PduSessionType.IPV6,
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).defaultSessionType());
        Assertions
            .assertEquals(
                PduSessionType.IPV4,
                model
                    .sliceConfigurations()
                    .get(0)
                    .dataNetworkConfigurations()
                    .get(0)
                    .additionalAllowedSessionTypes()
                    .get(0));
        Assertions
            .assertEquals(
                "qjfsmlmbtxhw",
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).allowedServices().get(0).id());
        Assertions
            .assertEquals(
                518235624,
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).maximumNumberOfBufferedPackets());
    }

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
