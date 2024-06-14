// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.informaticadatamanagement.models.ApplicationConfigs;
import com.azure.resourcemanager.informaticadatamanagement.models.CdiConfigProps;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimeConfigPropertiesUpdate;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServerlessRuntimeConfigPropertiesUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerlessRuntimeConfigPropertiesUpdate model = BinaryData.fromString(
            "{\"cdiConfigProps\":[{\"engineName\":\"ebwnujhe\",\"engineVersion\":\"msbvdkcrodtjinf\",\"applicationConfigs\":[{\"type\":\"lfltka\",\"name\":\"jvefkdlfoakggkfp\",\"value\":\"gaowpulpqblylsyx\",\"platform\":\"qjnsjervtia\",\"customized\":\"xsdszuempsb\",\"defaultValue\":\"kfzbeyvpnqicvi\"},{\"type\":\"v\",\"name\":\"jjxd\",\"value\":\"rbuukzclewyhmlwp\",\"platform\":\"ztzp\",\"customized\":\"fn\",\"defaultValue\":\"ckw\"},{\"type\":\"fz\",\"name\":\"whxxbuyqax\",\"value\":\"feqztppriol\",\"platform\":\"or\",\"customized\":\"altol\",\"defaultValue\":\"ncwsob\"},{\"type\":\"wcsdbnwdcfhucq\",\"name\":\"pfuvglsbjjca\",\"value\":\"vxb\",\"platform\":\"t\",\"customized\":\"udutnco\",\"defaultValue\":\"mr\"}]},{\"engineName\":\"xqtvcofu\",\"engineVersion\":\"f\",\"applicationConfigs\":[{\"type\":\"kgjubgdknnqvsazn\",\"name\":\"n\",\"value\":\"orudsgsa\",\"platform\":\"mkycgra\",\"customized\":\"wjue\",\"defaultValue\":\"aeburuvdmo\"}]},{\"engineName\":\"s\",\"engineVersion\":\"zlxwabmqoefkifr\",\"applicationConfigs\":[{\"type\":\"puqujmqlgkfbtn\",\"name\":\"oaongbjc\",\"value\":\"tujitcjedft\",\"platform\":\"waezkojvd\",\"customized\":\"pzfoqoui\",\"defaultValue\":\"ybxarzgszu\"},{\"type\":\"oxciqopidoamcio\",\"name\":\"hkh\",\"value\":\"zxkhnzbonlwnto\",\"platform\":\"gokdwbwhks\",\"customized\":\"zcmrvexztvb\",\"defaultValue\":\"qgsfraoyzkoow\"}]}],\"cdieConfigProps\":[{\"engineName\":\"nguxawqaldsy\",\"engineVersion\":\"uximerqfobw\",\"applicationConfigs\":[{\"type\":\"nkbykutwpfhp\",\"name\":\"gmhrskdsnfdsdoak\",\"value\":\"tdlmkkzevd\",\"platform\":\"hewpusdsttwv\",\"customized\":\"gvbbejdcng\",\"defaultValue\":\"qmoa\"},{\"type\":\"ufgmjzrwrdg\",\"name\":\"twaenuuzko\",\"value\":\"bminrfdwoyuhhzi\",\"platform\":\"iefozbhdmsml\",\"customized\":\"zqhof\",\"defaultValue\":\"rmaequ\"},{\"type\":\"ah\",\"name\":\"icslfaoq\",\"value\":\"piyylhalnswhccsp\",\"platform\":\"kaivwit\",\"customized\":\"scywuggwoluhc\",\"defaultValue\":\"bwemhairs\"},{\"type\":\"rgzdwmsweyp\",\"name\":\"w\",\"value\":\"xggicccnxqhuexmk\",\"platform\":\"tlstvlzywem\",\"customized\":\"zrncsdt\",\"defaultValue\":\"lusiy\"}]},{\"engineName\":\"bsfgytguslfea\",\"engineVersion\":\"cy\",\"applicationConfigs\":[{\"type\":\"ukyhejhzis\",\"name\":\"gfpelolppvksrpqv\",\"value\":\"jzraehtwdwrf\",\"platform\":\"swibyr\",\"customized\":\"dl\",\"defaultValue\":\"h\"},{\"type\":\"hfwpracstwit\",\"name\":\"khevxccedc\",\"value\":\"nmdyodnwzxl\",\"platform\":\"jc\",\"customized\":\"nhltiugcxn\",\"defaultValue\":\"vvwxqi\"},{\"type\":\"y\",\"name\":\"unyowxwl\",\"value\":\"djrkvfgbvfvpd\",\"platform\":\"odacizs\",\"customized\":\"q\",\"defaultValue\":\"hkr\"}]},{\"engineName\":\"ibdeibq\",\"engineVersion\":\"p\",\"applicationConfigs\":[{\"type\":\"ghvxndzwmkrefa\",\"name\":\"pjorwkqnyhg\",\"value\":\"ij\",\"platform\":\"jivfxzsjabib\",\"customized\":\"ystawfsdjpvkvp\",\"defaultValue\":\"jxbkzbzkdvn\"}]},{\"engineName\":\"jabudurgkakmo\",\"engineVersion\":\"zhjjklffhmouwq\",\"applicationConfigs\":[{\"type\":\"zrfze\",\"name\":\"yebizikayuh\",\"value\":\"lbjbsyb\",\"platform\":\"qwrvtldgmfp\",\"customized\":\"vm\",\"defaultValue\":\"ipaslthaqfxssmwu\"}]}]}")
            .toObject(ServerlessRuntimeConfigPropertiesUpdate.class);
        Assertions.assertEquals("ebwnujhe", model.cdiConfigProps().get(0).engineName());
        Assertions.assertEquals("msbvdkcrodtjinf", model.cdiConfigProps().get(0).engineVersion());
        Assertions.assertEquals("lfltka", model.cdiConfigProps().get(0).applicationConfigs().get(0).type());
        Assertions.assertEquals("jvefkdlfoakggkfp", model.cdiConfigProps().get(0).applicationConfigs().get(0).name());
        Assertions.assertEquals("gaowpulpqblylsyx", model.cdiConfigProps().get(0).applicationConfigs().get(0).value());
        Assertions.assertEquals("qjnsjervtia", model.cdiConfigProps().get(0).applicationConfigs().get(0).platform());
        Assertions.assertEquals("xsdszuempsb", model.cdiConfigProps().get(0).applicationConfigs().get(0).customized());
        Assertions.assertEquals("kfzbeyvpnqicvi",
            model.cdiConfigProps().get(0).applicationConfigs().get(0).defaultValue());
        Assertions.assertEquals("nguxawqaldsy", model.cdieConfigProps().get(0).engineName());
        Assertions.assertEquals("uximerqfobw", model.cdieConfigProps().get(0).engineVersion());
        Assertions.assertEquals("nkbykutwpfhp", model.cdieConfigProps().get(0).applicationConfigs().get(0).type());
        Assertions.assertEquals("gmhrskdsnfdsdoak", model.cdieConfigProps().get(0).applicationConfigs().get(0).name());
        Assertions.assertEquals("tdlmkkzevd", model.cdieConfigProps().get(0).applicationConfigs().get(0).value());
        Assertions.assertEquals("hewpusdsttwv", model.cdieConfigProps().get(0).applicationConfigs().get(0).platform());
        Assertions.assertEquals("gvbbejdcng", model.cdieConfigProps().get(0).applicationConfigs().get(0).customized());
        Assertions.assertEquals("qmoa", model.cdieConfigProps().get(0).applicationConfigs().get(0).defaultValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServerlessRuntimeConfigPropertiesUpdate model = new ServerlessRuntimeConfigPropertiesUpdate()
            .withCdiConfigProps(Arrays.asList(
                new CdiConfigProps().withEngineName("ebwnujhe")
                    .withEngineVersion("msbvdkcrodtjinf")
                    .withApplicationConfigs(Arrays.asList(
                        new ApplicationConfigs().withType("lfltka")
                            .withName("jvefkdlfoakggkfp")
                            .withValue("gaowpulpqblylsyx")
                            .withPlatform("qjnsjervtia")
                            .withCustomized("xsdszuempsb")
                            .withDefaultValue("kfzbeyvpnqicvi"),
                        new ApplicationConfigs().withType("v")
                            .withName("jjxd")
                            .withValue("rbuukzclewyhmlwp")
                            .withPlatform("ztzp")
                            .withCustomized("fn")
                            .withDefaultValue("ckw"),
                        new ApplicationConfigs().withType("fz")
                            .withName("whxxbuyqax")
                            .withValue("feqztppriol")
                            .withPlatform("or")
                            .withCustomized("altol")
                            .withDefaultValue("ncwsob"),
                        new ApplicationConfigs().withType("wcsdbnwdcfhucq")
                            .withName("pfuvglsbjjca")
                            .withValue("vxb")
                            .withPlatform("t")
                            .withCustomized("udutnco")
                            .withDefaultValue("mr"))),
                new CdiConfigProps().withEngineName("xqtvcofu")
                    .withEngineVersion("f")
                    .withApplicationConfigs(Arrays.asList(new ApplicationConfigs().withType("kgjubgdknnqvsazn")
                        .withName("n")
                        .withValue("orudsgsa")
                        .withPlatform("mkycgra")
                        .withCustomized("wjue")
                        .withDefaultValue("aeburuvdmo"))),
                new CdiConfigProps().withEngineName("s")
                    .withEngineVersion("zlxwabmqoefkifr")
                    .withApplicationConfigs(Arrays.asList(
                        new ApplicationConfigs().withType("puqujmqlgkfbtn")
                            .withName("oaongbjc")
                            .withValue("tujitcjedft")
                            .withPlatform("waezkojvd")
                            .withCustomized("pzfoqoui")
                            .withDefaultValue("ybxarzgszu"),
                        new ApplicationConfigs().withType("oxciqopidoamcio")
                            .withName("hkh")
                            .withValue("zxkhnzbonlwnto")
                            .withPlatform("gokdwbwhks")
                            .withCustomized("zcmrvexztvb")
                            .withDefaultValue("qgsfraoyzkoow")))))
            .withCdieConfigProps(Arrays.asList(
                new CdiConfigProps().withEngineName("nguxawqaldsy")
                    .withEngineVersion("uximerqfobw")
                    .withApplicationConfigs(Arrays.asList(
                        new ApplicationConfigs().withType("nkbykutwpfhp")
                            .withName("gmhrskdsnfdsdoak")
                            .withValue("tdlmkkzevd")
                            .withPlatform("hewpusdsttwv")
                            .withCustomized("gvbbejdcng")
                            .withDefaultValue("qmoa"),
                        new ApplicationConfigs().withType("ufgmjzrwrdg")
                            .withName("twaenuuzko")
                            .withValue("bminrfdwoyuhhzi")
                            .withPlatform("iefozbhdmsml")
                            .withCustomized("zqhof")
                            .withDefaultValue("rmaequ"),
                        new ApplicationConfigs().withType("ah")
                            .withName("icslfaoq")
                            .withValue("piyylhalnswhccsp")
                            .withPlatform("kaivwit")
                            .withCustomized("scywuggwoluhc")
                            .withDefaultValue("bwemhairs"),
                        new ApplicationConfigs().withType("rgzdwmsweyp")
                            .withName("w")
                            .withValue("xggicccnxqhuexmk")
                            .withPlatform("tlstvlzywem")
                            .withCustomized("zrncsdt")
                            .withDefaultValue("lusiy"))),
                new CdiConfigProps().withEngineName("bsfgytguslfea")
                    .withEngineVersion("cy")
                    .withApplicationConfigs(Arrays.asList(
                        new ApplicationConfigs().withType("ukyhejhzis")
                            .withName("gfpelolppvksrpqv")
                            .withValue("jzraehtwdwrf")
                            .withPlatform("swibyr")
                            .withCustomized("dl")
                            .withDefaultValue("h"),
                        new ApplicationConfigs().withType("hfwpracstwit")
                            .withName("khevxccedc")
                            .withValue("nmdyodnwzxl")
                            .withPlatform("jc")
                            .withCustomized("nhltiugcxn")
                            .withDefaultValue("vvwxqi"),
                        new ApplicationConfigs().withType("y")
                            .withName("unyowxwl")
                            .withValue("djrkvfgbvfvpd")
                            .withPlatform("odacizs")
                            .withCustomized("q")
                            .withDefaultValue("hkr"))),
                new CdiConfigProps().withEngineName("ibdeibq")
                    .withEngineVersion("p")
                    .withApplicationConfigs(Arrays.asList(new ApplicationConfigs().withType("ghvxndzwmkrefa")
                        .withName("pjorwkqnyhg")
                        .withValue("ij")
                        .withPlatform("jivfxzsjabib")
                        .withCustomized("ystawfsdjpvkvp")
                        .withDefaultValue("jxbkzbzkdvn"))),
                new CdiConfigProps().withEngineName("jabudurgkakmo")
                    .withEngineVersion("zhjjklffhmouwq")
                    .withApplicationConfigs(Arrays.asList(new ApplicationConfigs().withType("zrfze")
                        .withName("yebizikayuh")
                        .withValue("lbjbsyb")
                        .withPlatform("qwrvtldgmfp")
                        .withCustomized("vm")
                        .withDefaultValue("ipaslthaqfxssmwu")))));
        model = BinaryData.fromObject(model).toObject(ServerlessRuntimeConfigPropertiesUpdate.class);
        Assertions.assertEquals("ebwnujhe", model.cdiConfigProps().get(0).engineName());
        Assertions.assertEquals("msbvdkcrodtjinf", model.cdiConfigProps().get(0).engineVersion());
        Assertions.assertEquals("lfltka", model.cdiConfigProps().get(0).applicationConfigs().get(0).type());
        Assertions.assertEquals("jvefkdlfoakggkfp", model.cdiConfigProps().get(0).applicationConfigs().get(0).name());
        Assertions.assertEquals("gaowpulpqblylsyx", model.cdiConfigProps().get(0).applicationConfigs().get(0).value());
        Assertions.assertEquals("qjnsjervtia", model.cdiConfigProps().get(0).applicationConfigs().get(0).platform());
        Assertions.assertEquals("xsdszuempsb", model.cdiConfigProps().get(0).applicationConfigs().get(0).customized());
        Assertions.assertEquals("kfzbeyvpnqicvi",
            model.cdiConfigProps().get(0).applicationConfigs().get(0).defaultValue());
        Assertions.assertEquals("nguxawqaldsy", model.cdieConfigProps().get(0).engineName());
        Assertions.assertEquals("uximerqfobw", model.cdieConfigProps().get(0).engineVersion());
        Assertions.assertEquals("nkbykutwpfhp", model.cdieConfigProps().get(0).applicationConfigs().get(0).type());
        Assertions.assertEquals("gmhrskdsnfdsdoak", model.cdieConfigProps().get(0).applicationConfigs().get(0).name());
        Assertions.assertEquals("tdlmkkzevd", model.cdieConfigProps().get(0).applicationConfigs().get(0).value());
        Assertions.assertEquals("hewpusdsttwv", model.cdieConfigProps().get(0).applicationConfigs().get(0).platform());
        Assertions.assertEquals("gvbbejdcng", model.cdieConfigProps().get(0).applicationConfigs().get(0).customized());
        Assertions.assertEquals("qmoa", model.cdieConfigProps().get(0).applicationConfigs().get(0).defaultValue());
    }
}
