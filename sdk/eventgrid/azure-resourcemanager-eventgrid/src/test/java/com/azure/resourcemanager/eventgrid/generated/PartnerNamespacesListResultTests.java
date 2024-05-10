// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.PartnerNamespaceInner;
import com.azure.resourcemanager.eventgrid.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.models.IpActionType;
import com.azure.resourcemanager.eventgrid.models.PartnerNamespacesListResult;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicRoutingMode;
import com.azure.resourcemanager.eventgrid.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.models.TlsVersion;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PartnerNamespacesListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PartnerNamespacesListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"privateEndpointConnections\":[{\"properties\":{},\"id\":\"frddgamquhiosrsj\",\"name\":\"ivfcdisyirnx\",\"type\":\"hcz\"},{\"properties\":{},\"id\":\"rxzbujr\",\"name\":\"rhqvwrevkh\",\"type\":\"nlnzonzlrpi\"},{\"properties\":{},\"id\":\"wncvjtszcofiz\",\"name\":\"htd\",\"type\":\"gbjkvreljeamur\"}],\"provisioningState\":\"Updating\",\"partnerRegistrationFullyQualifiedId\":\"ov\",\"minimumTlsVersionAllowed\":\"1.2\",\"endpoint\":\"shcxlpmjerbdk\",\"publicNetworkAccess\":\"Disabled\",\"inboundIpRules\":[{\"ipMask\":\"zozsdbccxjmonfdg\",\"action\":\"Allow\"}],\"disableLocalAuth\":true,\"partnerTopicRoutingMode\":\"SourceEventAttribute\"},\"location\":\"w\",\"tags\":{\"qjctzenkeif\":\"v\",\"xcudchxgsr\":\"zhmkdasvflyh\",\"lvizb\":\"oldforobw\",\"dxe\":\"hfovvacqpbtu\"},\"id\":\"zab\",\"name\":\"elawumu\",\"type\":\"slzkwrrwoycqu\"},{\"properties\":{\"privateEndpointConnections\":[{\"properties\":{},\"id\":\"hnomdrkywuh\",\"name\":\"svfuurutlwexxwl\",\"type\":\"lniexz\"},{\"properties\":{},\"id\":\"zpgepqty\",\"name\":\"bwwpgdakchzy\",\"type\":\"lixqnrkcxkjibn\"},{\"properties\":{},\"id\":\"ysux\",\"name\":\"wq\",\"type\":\"ntvlwijpsttexo\"},{\"properties\":{},\"id\":\"pwcyyufmhr\",\"name\":\"nc\",\"type\":\"wmqs\"}],\"provisioningState\":\"Canceled\",\"partnerRegistrationFullyQualifiedId\":\"qzhlctddunq\",\"minimumTlsVersionAllowed\":\"1.2\",\"endpoint\":\"pchrqbn\",\"publicNetworkAccess\":\"Enabled\",\"inboundIpRules\":[{\"ipMask\":\"gydcw\",\"action\":\"Allow\"},{\"ipMask\":\"umvq\",\"action\":\"Allow\"},{\"ipMask\":\"hrraiouaubrj\",\"action\":\"Allow\"},{\"ipMask\":\"xfuojrn\",\"action\":\"Allow\"}],\"disableLocalAuth\":true,\"partnerTopicRoutingMode\":\"SourceEventAttribute\"},\"location\":\"sccbiuimzd\",\"tags\":{\"fdvruz\":\"dfqwmkyoq\",\"hpc\":\"lzo\",\"fdgugeyzi\":\"fnmdxotn\",\"jee\":\"grkyuizabsnmfpph\"},\"id\":\"yhyhsgzfczb\",\"name\":\"omfgbeglqgleohib\",\"type\":\"tnluankrr\"},{\"properties\":{\"privateEndpointConnections\":[{\"properties\":{},\"id\":\"btijvacvbm\",\"name\":\"z\",\"type\":\"qqxlajr\"},{\"properties\":{},\"id\":\"xaceve\",\"name\":\"jkuyxoafgaoq\",\"type\":\"tfaeyl\"},{\"properties\":{},\"id\":\"mfgvxirpghriypo\",\"name\":\"eyhlqhykprl\",\"type\":\"yznuciqd\"}],\"provisioningState\":\"Deleting\",\"partnerRegistrationFullyQualifiedId\":\"iitdfuxt\",\"minimumTlsVersionAllowed\":\"1.0\",\"endpoint\":\"ibmi\",\"publicNetworkAccess\":\"Enabled\",\"inboundIpRules\":[{\"ipMask\":\"tgnljhnmgixhcmav\",\"action\":\"Allow\"},{\"ipMask\":\"udorh\",\"action\":\"Allow\"},{\"ipMask\":\"prot\",\"action\":\"Allow\"},{\"ipMask\":\"ndm\",\"action\":\"Allow\"}],\"disableLocalAuth\":false,\"partnerTopicRoutingMode\":\"ChannelNameHeader\"},\"location\":\"k\",\"tags\":{\"tzfjltf\":\"gorbmftpm\",\"opv\":\"nzcyjtotp\"},\"id\":\"bdb\",\"name\":\"qgqqihedsvqwthmk\",\"type\":\"ibcysihsgqc\"},{\"properties\":{\"privateEndpointConnections\":[{\"properties\":{},\"id\":\"sdtmcdzs\",\"name\":\"fcohdxbzlmcmu\",\"type\":\"pcvhdbevwqqxeys\"},{\"properties\":{},\"id\":\"nqzi\",\"name\":\"kfkbgbzbowxeqocl\",\"type\":\"mygvkzqkj\"}],\"provisioningState\":\"Deleting\",\"partnerRegistrationFullyQualifiedId\":\"bzefezr\",\"minimumTlsVersionAllowed\":\"1.0\",\"endpoint\":\"urtleipqxb\",\"publicNetworkAccess\":\"Disabled\",\"inboundIpRules\":[{\"ipMask\":\"zvd\",\"action\":\"Allow\"},{\"ipMask\":\"ixz\",\"action\":\"Allow\"},{\"ipMask\":\"odawopqhewjptmcg\",\"action\":\"Allow\"},{\"ipMask\":\"t\",\"action\":\"Allow\"}],\"disableLocalAuth\":false,\"partnerTopicRoutingMode\":\"ChannelNameHeader\"},\"location\":\"utmzlbiojlvfhrbb\",\"tags\":{\"yurmochpprprs\":\"qvcww\",\"ayzejnhlbkpbz\":\"mo\",\"a\":\"cpilj\",\"chndbnwie\":\"zv\"},\"id\":\"olewjwi\",\"name\":\"ubwefqs\",\"type\":\"ap\"}],\"nextLink\":\"tf\"}")
            .toObject(PartnerNamespacesListResult.class);
        Assertions.assertEquals("w", model.value().get(0).location());
        Assertions.assertEquals("v", model.value().get(0).tags().get("qjctzenkeif"));
        Assertions.assertEquals("ov", model.value().get(0).partnerRegistrationFullyQualifiedId());
        Assertions.assertEquals(TlsVersion.ONE_TWO, model.value().get(0).minimumTlsVersionAllowed());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.value().get(0).publicNetworkAccess());
        Assertions.assertEquals("zozsdbccxjmonfdg", model.value().get(0).inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.value().get(0).inboundIpRules().get(0).action());
        Assertions.assertEquals(true, model.value().get(0).disableLocalAuth());
        Assertions.assertEquals(PartnerTopicRoutingMode.SOURCE_EVENT_ATTRIBUTE,
            model.value().get(0).partnerTopicRoutingMode());
        Assertions.assertEquals("tf", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PartnerNamespacesListResult model = new PartnerNamespacesListResult().withValue(Arrays.asList(
            new PartnerNamespaceInner().withLocation("w")
                .withTags(mapOf("qjctzenkeif", "v", "xcudchxgsr", "zhmkdasvflyh", "lvizb", "oldforobw", "dxe",
                    "hfovvacqpbtu"))
                .withPartnerRegistrationFullyQualifiedId("ov")
                .withMinimumTlsVersionAllowed(TlsVersion.ONE_TWO)
                .withPublicNetworkAccess(PublicNetworkAccess.DISABLED)
                .withInboundIpRules(
                    Arrays.asList(new InboundIpRule().withIpMask("zozsdbccxjmonfdg").withAction(IpActionType.ALLOW)))
                .withDisableLocalAuth(true)
                .withPartnerTopicRoutingMode(PartnerTopicRoutingMode.SOURCE_EVENT_ATTRIBUTE),
            new PartnerNamespaceInner().withLocation("sccbiuimzd")
                .withTags(
                    mapOf("fdvruz", "dfqwmkyoq", "hpc", "lzo", "fdgugeyzi", "fnmdxotn", "jee", "grkyuizabsnmfpph"))
                .withPartnerRegistrationFullyQualifiedId("qzhlctddunq")
                .withMinimumTlsVersionAllowed(TlsVersion.ONE_TWO)
                .withPublicNetworkAccess(PublicNetworkAccess.ENABLED)
                .withInboundIpRules(
                    Arrays.asList(new InboundIpRule().withIpMask("gydcw").withAction(IpActionType.ALLOW),
                        new InboundIpRule().withIpMask("umvq").withAction(IpActionType.ALLOW),
                        new InboundIpRule().withIpMask("hrraiouaubrj").withAction(IpActionType.ALLOW),
                        new InboundIpRule().withIpMask("xfuojrn").withAction(IpActionType.ALLOW)))
                .withDisableLocalAuth(true)
                .withPartnerTopicRoutingMode(PartnerTopicRoutingMode.SOURCE_EVENT_ATTRIBUTE),
            new PartnerNamespaceInner().withLocation("k")
                .withTags(mapOf("tzfjltf", "gorbmftpm", "opv", "nzcyjtotp"))
                .withPartnerRegistrationFullyQualifiedId("iitdfuxt")
                .withMinimumTlsVersionAllowed(TlsVersion.ONE_ZERO)
                .withPublicNetworkAccess(PublicNetworkAccess.ENABLED)
                .withInboundIpRules(
                    Arrays.asList(new InboundIpRule().withIpMask("tgnljhnmgixhcmav").withAction(IpActionType.ALLOW),
                        new InboundIpRule().withIpMask("udorh").withAction(IpActionType.ALLOW),
                        new InboundIpRule().withIpMask("prot").withAction(IpActionType.ALLOW),
                        new InboundIpRule().withIpMask("ndm").withAction(IpActionType.ALLOW)))
                .withDisableLocalAuth(false)
                .withPartnerTopicRoutingMode(PartnerTopicRoutingMode.CHANNEL_NAME_HEADER),
            new PartnerNamespaceInner().withLocation("utmzlbiojlvfhrbb")
                .withTags(mapOf("yurmochpprprs", "qvcww", "ayzejnhlbkpbz", "mo", "a", "cpilj", "chndbnwie", "zv"))
                .withPartnerRegistrationFullyQualifiedId("bzefezr")
                .withMinimumTlsVersionAllowed(TlsVersion.ONE_ZERO)
                .withPublicNetworkAccess(PublicNetworkAccess.DISABLED)
                .withInboundIpRules(Arrays.asList(new InboundIpRule().withIpMask("zvd").withAction(IpActionType.ALLOW),
                    new InboundIpRule().withIpMask("ixz").withAction(IpActionType.ALLOW),
                    new InboundIpRule().withIpMask("odawopqhewjptmcg").withAction(IpActionType.ALLOW),
                    new InboundIpRule().withIpMask("t").withAction(IpActionType.ALLOW)))
                .withDisableLocalAuth(false)
                .withPartnerTopicRoutingMode(PartnerTopicRoutingMode.CHANNEL_NAME_HEADER)))
            .withNextLink("tf");
        model = BinaryData.fromObject(model).toObject(PartnerNamespacesListResult.class);
        Assertions.assertEquals("w", model.value().get(0).location());
        Assertions.assertEquals("v", model.value().get(0).tags().get("qjctzenkeif"));
        Assertions.assertEquals("ov", model.value().get(0).partnerRegistrationFullyQualifiedId());
        Assertions.assertEquals(TlsVersion.ONE_TWO, model.value().get(0).minimumTlsVersionAllowed());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.value().get(0).publicNetworkAccess());
        Assertions.assertEquals("zozsdbccxjmonfdg", model.value().get(0).inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.value().get(0).inboundIpRules().get(0).action());
        Assertions.assertEquals(true, model.value().get(0).disableLocalAuth());
        Assertions.assertEquals(PartnerTopicRoutingMode.SOURCE_EVENT_ATTRIBUTE,
            model.value().get(0).partnerTopicRoutingMode());
        Assertions.assertEquals("tf", model.nextLink());
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
