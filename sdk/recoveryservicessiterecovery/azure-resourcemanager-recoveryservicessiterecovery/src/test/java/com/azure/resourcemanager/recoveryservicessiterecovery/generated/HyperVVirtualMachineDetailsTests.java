// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.DiskDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.HyperVVirtualMachineDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.OSDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PresenceStatus;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class HyperVVirtualMachineDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HyperVVirtualMachineDetails model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"HyperVVirtualMachine\",\"sourceItemId\":\"igglclwalhvub\",\"generation\":\"zphetxdqcm\",\"osDetails\":{\"osType\":\"ajqzj\",\"productType\":\"lecxbibiwks\",\"osEdition\":\"gyxs\",\"oSVersion\":\"pzvoikv\",\"oSMajorVersion\":\"wczfzwushlcx\",\"oSMinorVersion\":\"lalhhezpfkiss\"},\"diskDetails\":[{\"maxSizeMB\":8933439553335588786,\"vhdType\":\"aoq\",\"vhdId\":\"gpto\",\"vhdName\":\"jq\"},{\"maxSizeMB\":8153507398057204968,\"vhdType\":\"nlrtbfijzz\",\"vhdId\":\"o\",\"vhdName\":\"olbuauktwieope\"},{\"maxSizeMB\":6227229278544049294,\"vhdType\":\"dwrswyiljpi\",\"vhdId\":\"gxyxyauxredd\",\"vhdName\":\"mcnltmwytkujsqyc\"}],\"hasPhysicalDisk\":\"NotPresent\",\"hasFibreChannelAdapter\":\"Present\",\"hasSharedVhd\":\"Present\",\"hyperVHostId\":\"qgpwbmwhr\"}")
                .toObject(HyperVVirtualMachineDetails.class);
        Assertions.assertEquals("igglclwalhvub", model.sourceItemId());
        Assertions.assertEquals("zphetxdqcm", model.generation());
        Assertions.assertEquals("ajqzj", model.osDetails().osType());
        Assertions.assertEquals("lecxbibiwks", model.osDetails().productType());
        Assertions.assertEquals("gyxs", model.osDetails().osEdition());
        Assertions.assertEquals("pzvoikv", model.osDetails().oSVersion());
        Assertions.assertEquals("wczfzwushlcx", model.osDetails().oSMajorVersion());
        Assertions.assertEquals("lalhhezpfkiss", model.osDetails().oSMinorVersion());
        Assertions.assertEquals(8933439553335588786L, model.diskDetails().get(0).maxSizeMB());
        Assertions.assertEquals("aoq", model.diskDetails().get(0).vhdType());
        Assertions.assertEquals("gpto", model.diskDetails().get(0).vhdId());
        Assertions.assertEquals("jq", model.diskDetails().get(0).vhdName());
        Assertions.assertEquals(PresenceStatus.NOT_PRESENT, model.hasPhysicalDisk());
        Assertions.assertEquals(PresenceStatus.PRESENT, model.hasFibreChannelAdapter());
        Assertions.assertEquals(PresenceStatus.PRESENT, model.hasSharedVhd());
        Assertions.assertEquals("qgpwbmwhr", model.hyperVHostId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HyperVVirtualMachineDetails model =
            new HyperVVirtualMachineDetails()
                .withSourceItemId("igglclwalhvub")
                .withGeneration("zphetxdqcm")
                .withOsDetails(
                    new OSDetails()
                        .withOsType("ajqzj")
                        .withProductType("lecxbibiwks")
                        .withOsEdition("gyxs")
                        .withOSVersion("pzvoikv")
                        .withOSMajorVersion("wczfzwushlcx")
                        .withOSMinorVersion("lalhhezpfkiss"))
                .withDiskDetails(
                    Arrays
                        .asList(
                            new DiskDetails()
                                .withMaxSizeMB(8933439553335588786L)
                                .withVhdType("aoq")
                                .withVhdId("gpto")
                                .withVhdName("jq"),
                            new DiskDetails()
                                .withMaxSizeMB(8153507398057204968L)
                                .withVhdType("nlrtbfijzz")
                                .withVhdId("o")
                                .withVhdName("olbuauktwieope"),
                            new DiskDetails()
                                .withMaxSizeMB(6227229278544049294L)
                                .withVhdType("dwrswyiljpi")
                                .withVhdId("gxyxyauxredd")
                                .withVhdName("mcnltmwytkujsqyc")))
                .withHasPhysicalDisk(PresenceStatus.NOT_PRESENT)
                .withHasFibreChannelAdapter(PresenceStatus.PRESENT)
                .withHasSharedVhd(PresenceStatus.PRESENT)
                .withHyperVHostId("qgpwbmwhr");
        model = BinaryData.fromObject(model).toObject(HyperVVirtualMachineDetails.class);
        Assertions.assertEquals("igglclwalhvub", model.sourceItemId());
        Assertions.assertEquals("zphetxdqcm", model.generation());
        Assertions.assertEquals("ajqzj", model.osDetails().osType());
        Assertions.assertEquals("lecxbibiwks", model.osDetails().productType());
        Assertions.assertEquals("gyxs", model.osDetails().osEdition());
        Assertions.assertEquals("pzvoikv", model.osDetails().oSVersion());
        Assertions.assertEquals("wczfzwushlcx", model.osDetails().oSMajorVersion());
        Assertions.assertEquals("lalhhezpfkiss", model.osDetails().oSMinorVersion());
        Assertions.assertEquals(8933439553335588786L, model.diskDetails().get(0).maxSizeMB());
        Assertions.assertEquals("aoq", model.diskDetails().get(0).vhdType());
        Assertions.assertEquals("gpto", model.diskDetails().get(0).vhdId());
        Assertions.assertEquals("jq", model.diskDetails().get(0).vhdName());
        Assertions.assertEquals(PresenceStatus.NOT_PRESENT, model.hasPhysicalDisk());
        Assertions.assertEquals(PresenceStatus.PRESENT, model.hasFibreChannelAdapter());
        Assertions.assertEquals(PresenceStatus.PRESENT, model.hasSharedVhd());
        Assertions.assertEquals("qgpwbmwhr", model.hyperVHostId());
    }
}
