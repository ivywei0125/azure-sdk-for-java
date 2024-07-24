// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.informaticadatamanagement.fluent.models.ServerlessMetadataResponseInner;
import com.azure.resourcemanager.informaticadatamanagement.models.PlatformType;
import com.azure.resourcemanager.informaticadatamanagement.models.RuntimeType;
import org.junit.jupiter.api.Assertions;

public final class ServerlessMetadataResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerlessMetadataResponseInner model = BinaryData.fromString(
            "{\"type\":\"SERVERLESS\",\"serverlessConfigProperties\":{\"platform\":\"AZURE\",\"applicationTypes\":[{\"name\":\"kxfbkpycgklwndn\",\"value\":\"dauwhvylwzbtd\"}],\"computeUnits\":[{\"name\":\"znbmpowuwprzq\",\"value\":[\"ualupjmkh\",\"xobbcswsrt\",\"riplrbpbewtg\"]},{\"name\":\"gblcgwxzvlvq\",\"value\":[\"begibtnmxiebwwa\",\"oayqc\"]}],\"executionTimeout\":\"rtzju\",\"regions\":[{\"id\":\"zmh\",\"name\":\"ongmtsa\"},{\"id\":\"cbpwxqpsrknft\",\"name\":\"vriuhprwmdyvx\"},{\"id\":\"ayriwwroyqbexrm\",\"name\":\"ibycno\"}]},\"serverlessRuntimeConfigProperties\":{\"cdiConfigProps\":[{\"engineName\":\"mefqsgzvahapjyzh\",\"engineVersion\":\"vgqzcjrvxd\",\"applicationConfigs\":[{\"type\":\"lmwlxkvugfhzo\",\"name\":\"awjvzunluthnnp\",\"value\":\"nxipeil\",\"platform\":\"jzuaejxdultskzbb\",\"customized\":\"dzumveekg\",\"defaultValue\":\"wozuhkf\"},{\"type\":\"bsjyofdx\",\"name\":\"uusdttouwa\",\"value\":\"oekqvk\",\"platform\":\"lns\",\"customized\":\"vbxwyjsflhh\",\"defaultValue\":\"aalnjixi\"},{\"type\":\"xyawj\",\"name\":\"yaqcslyjpkiidz\",\"value\":\"exznelixhnr\",\"platform\":\"tfolhbnx\",\"customized\":\"nalaulppg\",\"defaultValue\":\"dtpnapnyiropuhp\"},{\"type\":\"gvpgy\",\"name\":\"gqgitxmedjvcsl\",\"value\":\"n\",\"platform\":\"wwncwzzhxgk\",\"customized\":\"rmgucnap\",\"defaultValue\":\"t\"}]},{\"engineName\":\"oellwp\",\"engineVersion\":\"fdygpfqbuaceopz\",\"applicationConfigs\":[{\"type\":\"rhhuaopppcqeqx\",\"name\":\"lzdahzxctobgbkdm\",\"value\":\"izpost\",\"platform\":\"grcfb\",\"customized\":\"nrmfqjhhk\",\"defaultValue\":\"bpvjymjhx\"},{\"type\":\"j\",\"name\":\"n\",\"value\":\"u\",\"platform\":\"ivkrtsw\",\"customized\":\"xqzvszjfa\",\"defaultValue\":\"vjfdx\"}]},{\"engineName\":\"ivetvtcq\",\"engineVersion\":\"qtdo\",\"applicationConfigs\":[{\"type\":\"cbxvwvxyslqbh\",\"name\":\"fxoblytkb\",\"value\":\"mpew\",\"platform\":\"wfbkrvrns\",\"customized\":\"shqjohxcrsbf\",\"defaultValue\":\"vasrruvwb\"},{\"type\":\"sqfsubcgjbirxb\",\"name\":\"ybsrfbjfdtwss\",\"value\":\"t\",\"platform\":\"tpvjzbexilzznfqq\",\"customized\":\"vwpm\",\"defaultValue\":\"taruoujmkcj\"},{\"type\":\"wqytjrybnwjewgdr\",\"name\":\"ervnaenqpehi\",\"value\":\"doy\",\"platform\":\"mifthnzdnd\",\"customized\":\"l\",\"defaultValue\":\"nayqi\"}]},{\"engineName\":\"ynduha\",\"engineVersion\":\"hqlkthumaqo\",\"applicationConfigs\":[{\"type\":\"gycdu\",\"name\":\"ertgccymva\",\"value\":\"l\",\"platform\":\"ssl\",\"customized\":\"lfmmdnbbglzpswi\",\"defaultValue\":\"d\"},{\"type\":\"cwyhzdxssa\",\"name\":\"bzmnvdfznud\",\"value\":\"od\",\"platform\":\"xzb\",\"customized\":\"cblylpstdbhhxsr\",\"defaultValue\":\"dzu\"},{\"type\":\"erscdntne\",\"name\":\"fiwjmygtdssls\",\"value\":\"tmweriofzpyq\",\"platform\":\"emwabnet\",\"customized\":\"hhszh\",\"defaultValue\":\"d\"},{\"type\":\"lvwiwubmwmbesl\",\"name\":\"nkww\",\"value\":\"pp\",\"platform\":\"flcxoga\",\"customized\":\"konzmnsik\",\"defaultValue\":\"mkqzeqqkdltfzxmh\"}]}],\"cdieConfigProps\":[{\"engineName\":\"gureodkwobdag\",\"engineVersion\":\"tibqdxbxwakb\",\"applicationConfigs\":[{\"type\":\"qxn\",\"name\":\"lkzgxhuriplbp\",\"value\":\"dxunkbebxmubyyn\",\"platform\":\"wlrbqtkoievseo\",\"customized\":\"gqrlltmuwla\",\"defaultValue\":\"wzizxbmpgcjefuzm\"},{\"type\":\"vpbttd\",\"name\":\"morppxebmnzbtbh\",\"value\":\"pglkf\",\"platform\":\"ohdneuel\",\"customized\":\"phsdyhto\",\"defaultValue\":\"fikdowwqu\"},{\"type\":\"v\",\"name\":\"zx\",\"value\":\"lvithhqzonosgg\",\"platform\":\"hcohfwdsjnk\",\"customized\":\"ljuti\",\"defaultValue\":\"swacffgdkzz\"},{\"type\":\"wkfvhqcrailvp\",\"name\":\"ppfufl\",\"value\":\"wdmhdlxyjrxs\",\"platform\":\"gafcnihgwqapnedg\",\"customized\":\"bcvkcvqvpkeq\",\"defaultValue\":\"cvdrhvoodsot\"}]},{\"engineName\":\"obzdopcjwvnhdl\",\"engineVersion\":\"wmgxcxrsl\",\"applicationConfigs\":[{\"type\":\"utwu\",\"name\":\"egrpkhj\",\"value\":\"niyqslui\",\"platform\":\"pdggkzzlvm\",\"customized\":\"mpaxmodfvuefywsb\",\"defaultValue\":\"fvmwy\"},{\"type\":\"rfouyftaakcpw\",\"name\":\"yzvqt\",\"value\":\"nubexk\",\"platform\":\"zksmondj\",\"customized\":\"quxvypomgkop\",\"defaultValue\":\"whojvp\"}]}]}}")
            .toObject(ServerlessMetadataResponseInner.class);
        Assertions.assertEquals(RuntimeType.SERVERLESS, model.type());
        Assertions.assertEquals(PlatformType.AZURE, model.serverlessConfigProperties().platform());
        Assertions.assertEquals("kxfbkpycgklwndn", model.serverlessConfigProperties().applicationTypes().get(0).name());
        Assertions.assertEquals("dauwhvylwzbtd", model.serverlessConfigProperties().applicationTypes().get(0).value());
        Assertions.assertEquals("znbmpowuwprzq", model.serverlessConfigProperties().computeUnits().get(0).name());
        Assertions.assertEquals("ualupjmkh", model.serverlessConfigProperties().computeUnits().get(0).value().get(0));
        Assertions.assertEquals("rtzju", model.serverlessConfigProperties().executionTimeout());
        Assertions.assertEquals("zmh", model.serverlessConfigProperties().regions().get(0).id());
        Assertions.assertEquals("ongmtsa", model.serverlessConfigProperties().regions().get(0).name());
        Assertions.assertEquals("mefqsgzvahapjyzh",
            model.serverlessRuntimeConfigProperties().cdiConfigProps().get(0).engineName());
        Assertions.assertEquals("vgqzcjrvxd",
            model.serverlessRuntimeConfigProperties().cdiConfigProps().get(0).engineVersion());
        Assertions.assertEquals("lmwlxkvugfhzo",
            model.serverlessRuntimeConfigProperties().cdiConfigProps().get(0).applicationConfigs().get(0).type());
        Assertions.assertEquals("awjvzunluthnnp",
            model.serverlessRuntimeConfigProperties().cdiConfigProps().get(0).applicationConfigs().get(0).name());
        Assertions.assertEquals("nxipeil",
            model.serverlessRuntimeConfigProperties().cdiConfigProps().get(0).applicationConfigs().get(0).value());
        Assertions.assertEquals("jzuaejxdultskzbb",
            model.serverlessRuntimeConfigProperties().cdiConfigProps().get(0).applicationConfigs().get(0).platform());
        Assertions.assertEquals("dzumveekg",
            model.serverlessRuntimeConfigProperties().cdiConfigProps().get(0).applicationConfigs().get(0).customized());
        Assertions.assertEquals("wozuhkf",
            model.serverlessRuntimeConfigProperties()
                .cdiConfigProps()
                .get(0)
                .applicationConfigs()
                .get(0)
                .defaultValue());
        Assertions.assertEquals("gureodkwobdag",
            model.serverlessRuntimeConfigProperties().cdieConfigProps().get(0).engineName());
        Assertions.assertEquals("tibqdxbxwakb",
            model.serverlessRuntimeConfigProperties().cdieConfigProps().get(0).engineVersion());
        Assertions.assertEquals("qxn",
            model.serverlessRuntimeConfigProperties().cdieConfigProps().get(0).applicationConfigs().get(0).type());
        Assertions.assertEquals("lkzgxhuriplbp",
            model.serverlessRuntimeConfigProperties().cdieConfigProps().get(0).applicationConfigs().get(0).name());
        Assertions.assertEquals("dxunkbebxmubyyn",
            model.serverlessRuntimeConfigProperties().cdieConfigProps().get(0).applicationConfigs().get(0).value());
        Assertions.assertEquals("wlrbqtkoievseo",
            model.serverlessRuntimeConfigProperties().cdieConfigProps().get(0).applicationConfigs().get(0).platform());
        Assertions.assertEquals("gqrlltmuwla",
            model.serverlessRuntimeConfigProperties()
                .cdieConfigProps()
                .get(0)
                .applicationConfigs()
                .get(0)
                .customized());
        Assertions.assertEquals("wzizxbmpgcjefuzm",
            model.serverlessRuntimeConfigProperties()
                .cdieConfigProps()
                .get(0)
                .applicationConfigs()
                .get(0)
                .defaultValue());
    }
}
