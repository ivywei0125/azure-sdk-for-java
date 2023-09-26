// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageDiskExclusionInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageDiskSignatureExclusionOptions;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageEnableProtectionInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageVolumeExclusionOptions;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class InMageEnableProtectionInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageEnableProtectionInput model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"InMage\",\"vmFriendlyName\":\"lng\",\"masterTargetId\":\"gnhrkombcdtajdo\",\"processServerId\":\"ggorwjoqt\",\"retentionDrive\":\"otpvclp\",\"runAsAccountId\":\"yrlmwkptsk\",\"multiVmGroupId\":\"xjgvh\",\"multiVmGroupName\":\"ccbmkakm\",\"datastoreName\":\"okbputm\",\"diskExclusionInput\":{\"volumeOptions\":[{\"volumeLabel\":\"akmlwktfowzkroyr\",\"onlyExcludeIfSingleVolume\":\"r\"},{\"volumeLabel\":\"lzqjimejtgzjxx\",\"onlyExcludeIfSingleVolume\":\"e\"}],\"diskSignatureOptions\":[{\"diskSignature\":\"qloiwyayyziv\"},{\"diskSignature\":\"itcdqlhchwhrk\"},{\"diskSignature\":\"l\"},{\"diskSignature\":\"fibfiplhx\"}]},\"disksToInclude\":[\"mycjowlyey\"]}")
                .toObject(InMageEnableProtectionInput.class);
        Assertions.assertEquals("lng", model.vmFriendlyName());
        Assertions.assertEquals("gnhrkombcdtajdo", model.masterTargetId());
        Assertions.assertEquals("ggorwjoqt", model.processServerId());
        Assertions.assertEquals("otpvclp", model.retentionDrive());
        Assertions.assertEquals("yrlmwkptsk", model.runAsAccountId());
        Assertions.assertEquals("xjgvh", model.multiVmGroupId());
        Assertions.assertEquals("ccbmkakm", model.multiVmGroupName());
        Assertions.assertEquals("okbputm", model.datastoreName());
        Assertions.assertEquals("akmlwktfowzkroyr", model.diskExclusionInput().volumeOptions().get(0).volumeLabel());
        Assertions.assertEquals("r", model.diskExclusionInput().volumeOptions().get(0).onlyExcludeIfSingleVolume());
        Assertions
            .assertEquals("qloiwyayyziv", model.diskExclusionInput().diskSignatureOptions().get(0).diskSignature());
        Assertions.assertEquals("mycjowlyey", model.disksToInclude().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageEnableProtectionInput model =
            new InMageEnableProtectionInput()
                .withVmFriendlyName("lng")
                .withMasterTargetId("gnhrkombcdtajdo")
                .withProcessServerId("ggorwjoqt")
                .withRetentionDrive("otpvclp")
                .withRunAsAccountId("yrlmwkptsk")
                .withMultiVmGroupId("xjgvh")
                .withMultiVmGroupName("ccbmkakm")
                .withDatastoreName("okbputm")
                .withDiskExclusionInput(
                    new InMageDiskExclusionInput()
                        .withVolumeOptions(
                            Arrays
                                .asList(
                                    new InMageVolumeExclusionOptions()
                                        .withVolumeLabel("akmlwktfowzkroyr")
                                        .withOnlyExcludeIfSingleVolume("r"),
                                    new InMageVolumeExclusionOptions()
                                        .withVolumeLabel("lzqjimejtgzjxx")
                                        .withOnlyExcludeIfSingleVolume("e")))
                        .withDiskSignatureOptions(
                            Arrays
                                .asList(
                                    new InMageDiskSignatureExclusionOptions().withDiskSignature("qloiwyayyziv"),
                                    new InMageDiskSignatureExclusionOptions().withDiskSignature("itcdqlhchwhrk"),
                                    new InMageDiskSignatureExclusionOptions().withDiskSignature("l"),
                                    new InMageDiskSignatureExclusionOptions().withDiskSignature("fibfiplhx"))))
                .withDisksToInclude(Arrays.asList("mycjowlyey"));
        model = BinaryData.fromObject(model).toObject(InMageEnableProtectionInput.class);
        Assertions.assertEquals("lng", model.vmFriendlyName());
        Assertions.assertEquals("gnhrkombcdtajdo", model.masterTargetId());
        Assertions.assertEquals("ggorwjoqt", model.processServerId());
        Assertions.assertEquals("otpvclp", model.retentionDrive());
        Assertions.assertEquals("yrlmwkptsk", model.runAsAccountId());
        Assertions.assertEquals("xjgvh", model.multiVmGroupId());
        Assertions.assertEquals("ccbmkakm", model.multiVmGroupName());
        Assertions.assertEquals("okbputm", model.datastoreName());
        Assertions.assertEquals("akmlwktfowzkroyr", model.diskExclusionInput().volumeOptions().get(0).volumeLabel());
        Assertions.assertEquals("r", model.diskExclusionInput().volumeOptions().get(0).onlyExcludeIfSingleVolume());
        Assertions
            .assertEquals("qloiwyayyziv", model.diskExclusionInput().diskSignatureOptions().get(0).diskSignature());
        Assertions.assertEquals("mycjowlyey", model.disksToInclude().get(0));
    }
}
