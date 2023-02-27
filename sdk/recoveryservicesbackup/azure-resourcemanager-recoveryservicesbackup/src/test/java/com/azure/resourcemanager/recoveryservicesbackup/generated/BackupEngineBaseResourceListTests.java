// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupEngineBaseResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupEngineBase;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupEngineBaseResourceList;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BackupEngineBaseResourceListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupEngineBaseResourceList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"backupEngineType\":\"BackupEngineBase\",\"friendlyName\":\"hhkxbp\",\"backupManagementType\":\"AzureWorkload\",\"registrationStatus\":\"jhxxjyn\",\"backupEngineState\":\"divkrt\",\"healthStatus\":\"bxqz\",\"canReRegister\":false,\"backupEngineId\":\"fauvjfdxx\",\"dpmVersion\":\"e\",\"azureBackupAgentVersion\":\"t\",\"isAzureBackupAgentUpgradeAvailable\":true,\"isDpmUpgradeAvailable\":false},\"eTag\":\"qmcbxvwvxyslqbhs\",\"location\":\"xoblytkbl\",\"tags\":{\"rn\":\"wwwfbkr\",\"bfovasrruvwbhsq\":\"vshqjohxcr\",\"gjb\":\"sub\",\"rfbjf\":\"rxbpyb\"},\"id\":\"twss\",\"name\":\"t\",\"type\":\"tpvjzbexilzznfqq\"},{\"properties\":{\"backupEngineType\":\"BackupEngineBase\",\"friendlyName\":\"pmqtaru\",\"backupManagementType\":\"MAB\",\"registrationStatus\":\"kcjhwqytjrybnwj\",\"backupEngineState\":\"gdrjervnaenqpe\",\"healthStatus\":\"ndoygmifthnzdnd\",\"canReRegister\":true,\"backupEngineId\":\"ayqigynduhav\",\"dpmVersion\":\"lkthu\",\"azureBackupAgentVersion\":\"qolbgyc\",\"isAzureBackupAgentUpgradeAvailable\":true,\"isDpmUpgradeAvailable\":false},\"eTag\":\"ccymvaolpsslql\",\"location\":\"mmdnbbglzps\",\"tags\":{\"cwyhzdxssa\":\"d\",\"od\":\"bzmnvdfznud\",\"cblylpstdbhhxsr\":\"xzb\",\"erscdntne\":\"dzu\"},\"id\":\"fiwjmygtdssls\",\"name\":\"tmweriofzpyq\",\"type\":\"emwabnet\"},{\"properties\":{\"backupEngineType\":\"BackupEngineBase\",\"friendlyName\":\"szhedplvw\",\"backupManagementType\":\"Invalid\",\"registrationStatus\":\"mwmbes\",\"backupEngineState\":\"nkww\",\"healthStatus\":\"pjflcxogao\",\"canReRegister\":true,\"backupEngineId\":\"m\",\"dpmVersion\":\"ikvmkqzeqqk\",\"azureBackupAgentVersion\":\"tfz\",\"isAzureBackupAgentUpgradeAvailable\":false,\"isDpmUpgradeAvailable\":false},\"eTag\":\"ur\",\"location\":\"odkwobd\",\"tags\":{\"gqxndlkzgxhuripl\":\"tibqdxbxwakb\",\"bxmubyynt\":\"podxunkb\",\"tkoievseotgq\":\"lrb\",\"tmuwlauwzi\":\"l\"},\"id\":\"xbmp\",\"name\":\"cjefuzmu\",\"type\":\"pbttdum\"},{\"properties\":{\"backupEngineType\":\"BackupEngineBase\",\"friendlyName\":\"pxebmnzbt\",\"backupManagementType\":\"AzureSql\",\"registrationStatus\":\"glkfg\",\"backupEngineState\":\"dneu\",\"healthStatus\":\"fphsdyhtozfikdow\",\"canReRegister\":false,\"backupEngineId\":\"v\",\"dpmVersion\":\"xclvit\",\"azureBackupAgentVersion\":\"qzonosggbhcohf\",\"isAzureBackupAgentUpgradeAvailable\":false,\"isDpmUpgradeAvailable\":false},\"eTag\":\"ljuti\",\"location\":\"swacffgdkzz\",\"tags\":{\"a\":\"fvhqc\",\"uflrwd\":\"lvpnpp\",\"hgw\":\"hdlxyjrxsagafcn\",\"q\":\"apnedgfbcvkc\"},\"id\":\"pkeqdcvdrhvoo\",\"name\":\"sotbob\",\"type\":\"dopcjwvnh\"}],\"nextLink\":\"d\"}")
                .toObject(BackupEngineBaseResourceList.class);
        Assertions.assertEquals("d", model.nextLink());
        Assertions.assertEquals("xoblytkbl", model.value().get(0).location());
        Assertions.assertEquals("wwwfbkr", model.value().get(0).tags().get("rn"));
        Assertions.assertEquals("hhkxbp", model.value().get(0).properties().friendlyName());
        Assertions
            .assertEquals(
                BackupManagementType.AZURE_WORKLOAD, model.value().get(0).properties().backupManagementType());
        Assertions.assertEquals("jhxxjyn", model.value().get(0).properties().registrationStatus());
        Assertions.assertEquals("divkrt", model.value().get(0).properties().backupEngineState());
        Assertions.assertEquals("bxqz", model.value().get(0).properties().healthStatus());
        Assertions.assertEquals(false, model.value().get(0).properties().canReRegister());
        Assertions.assertEquals("fauvjfdxx", model.value().get(0).properties().backupEngineId());
        Assertions.assertEquals("e", model.value().get(0).properties().dpmVersion());
        Assertions.assertEquals("t", model.value().get(0).properties().azureBackupAgentVersion());
        Assertions.assertEquals(true, model.value().get(0).properties().isAzureBackupAgentUpgradeAvailable());
        Assertions.assertEquals(false, model.value().get(0).properties().isDpmUpgradeAvailable());
        Assertions.assertEquals("qmcbxvwvxyslqbhs", model.value().get(0).etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupEngineBaseResourceList model =
            new BackupEngineBaseResourceList()
                .withNextLink("d")
                .withValue(
                    Arrays
                        .asList(
                            new BackupEngineBaseResourceInner()
                                .withLocation("xoblytkbl")
                                .withTags(
                                    mapOf(
                                        "rn",
                                        "wwwfbkr",
                                        "bfovasrruvwbhsq",
                                        "vshqjohxcr",
                                        "gjb",
                                        "sub",
                                        "rfbjf",
                                        "rxbpyb"))
                                .withProperties(
                                    new BackupEngineBase()
                                        .withFriendlyName("hhkxbp")
                                        .withBackupManagementType(BackupManagementType.AZURE_WORKLOAD)
                                        .withRegistrationStatus("jhxxjyn")
                                        .withBackupEngineState("divkrt")
                                        .withHealthStatus("bxqz")
                                        .withCanReRegister(false)
                                        .withBackupEngineId("fauvjfdxx")
                                        .withDpmVersion("e")
                                        .withAzureBackupAgentVersion("t")
                                        .withIsAzureBackupAgentUpgradeAvailable(true)
                                        .withIsDpmUpgradeAvailable(false))
                                .withEtag("qmcbxvwvxyslqbhs"),
                            new BackupEngineBaseResourceInner()
                                .withLocation("mmdnbbglzps")
                                .withTags(
                                    mapOf(
                                        "cwyhzdxssa",
                                        "d",
                                        "od",
                                        "bzmnvdfznud",
                                        "cblylpstdbhhxsr",
                                        "xzb",
                                        "erscdntne",
                                        "dzu"))
                                .withProperties(
                                    new BackupEngineBase()
                                        .withFriendlyName("pmqtaru")
                                        .withBackupManagementType(BackupManagementType.MAB)
                                        .withRegistrationStatus("kcjhwqytjrybnwj")
                                        .withBackupEngineState("gdrjervnaenqpe")
                                        .withHealthStatus("ndoygmifthnzdnd")
                                        .withCanReRegister(true)
                                        .withBackupEngineId("ayqigynduhav")
                                        .withDpmVersion("lkthu")
                                        .withAzureBackupAgentVersion("qolbgyc")
                                        .withIsAzureBackupAgentUpgradeAvailable(true)
                                        .withIsDpmUpgradeAvailable(false))
                                .withEtag("ccymvaolpsslql"),
                            new BackupEngineBaseResourceInner()
                                .withLocation("odkwobd")
                                .withTags(
                                    mapOf(
                                        "gqxndlkzgxhuripl",
                                        "tibqdxbxwakb",
                                        "bxmubyynt",
                                        "podxunkb",
                                        "tkoievseotgq",
                                        "lrb",
                                        "tmuwlauwzi",
                                        "l"))
                                .withProperties(
                                    new BackupEngineBase()
                                        .withFriendlyName("szhedplvw")
                                        .withBackupManagementType(BackupManagementType.INVALID)
                                        .withRegistrationStatus("mwmbes")
                                        .withBackupEngineState("nkww")
                                        .withHealthStatus("pjflcxogao")
                                        .withCanReRegister(true)
                                        .withBackupEngineId("m")
                                        .withDpmVersion("ikvmkqzeqqk")
                                        .withAzureBackupAgentVersion("tfz")
                                        .withIsAzureBackupAgentUpgradeAvailable(false)
                                        .withIsDpmUpgradeAvailable(false))
                                .withEtag("ur"),
                            new BackupEngineBaseResourceInner()
                                .withLocation("swacffgdkzz")
                                .withTags(
                                    mapOf(
                                        "a",
                                        "fvhqc",
                                        "uflrwd",
                                        "lvpnpp",
                                        "hgw",
                                        "hdlxyjrxsagafcn",
                                        "q",
                                        "apnedgfbcvkc"))
                                .withProperties(
                                    new BackupEngineBase()
                                        .withFriendlyName("pxebmnzbt")
                                        .withBackupManagementType(BackupManagementType.AZURE_SQL)
                                        .withRegistrationStatus("glkfg")
                                        .withBackupEngineState("dneu")
                                        .withHealthStatus("fphsdyhtozfikdow")
                                        .withCanReRegister(false)
                                        .withBackupEngineId("v")
                                        .withDpmVersion("xclvit")
                                        .withAzureBackupAgentVersion("qzonosggbhcohf")
                                        .withIsAzureBackupAgentUpgradeAvailable(false)
                                        .withIsDpmUpgradeAvailable(false))
                                .withEtag("ljuti")));
        model = BinaryData.fromObject(model).toObject(BackupEngineBaseResourceList.class);
        Assertions.assertEquals("d", model.nextLink());
        Assertions.assertEquals("xoblytkbl", model.value().get(0).location());
        Assertions.assertEquals("wwwfbkr", model.value().get(0).tags().get("rn"));
        Assertions.assertEquals("hhkxbp", model.value().get(0).properties().friendlyName());
        Assertions
            .assertEquals(
                BackupManagementType.AZURE_WORKLOAD, model.value().get(0).properties().backupManagementType());
        Assertions.assertEquals("jhxxjyn", model.value().get(0).properties().registrationStatus());
        Assertions.assertEquals("divkrt", model.value().get(0).properties().backupEngineState());
        Assertions.assertEquals("bxqz", model.value().get(0).properties().healthStatus());
        Assertions.assertEquals(false, model.value().get(0).properties().canReRegister());
        Assertions.assertEquals("fauvjfdxx", model.value().get(0).properties().backupEngineId());
        Assertions.assertEquals("e", model.value().get(0).properties().dpmVersion());
        Assertions.assertEquals("t", model.value().get(0).properties().azureBackupAgentVersion());
        Assertions.assertEquals(true, model.value().get(0).properties().isAzureBackupAgentUpgradeAvailable());
        Assertions.assertEquals(false, model.value().get(0).properties().isDpmUpgradeAvailable());
        Assertions.assertEquals("qmcbxvwvxyslqbhs", model.value().get(0).etag());
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
