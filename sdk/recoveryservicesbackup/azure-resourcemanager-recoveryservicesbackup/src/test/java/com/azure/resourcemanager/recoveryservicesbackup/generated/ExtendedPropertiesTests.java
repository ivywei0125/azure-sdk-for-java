// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DiskExclusionProperties;
import com.azure.resourcemanager.recoveryservicesbackup.models.ExtendedProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ExtendedPropertiesTests {
    @Test
    public void testDeserialize() {
        ExtendedProperties model =
            BinaryData
                .fromString(
                    "{\"diskExclusionProperties\":{\"diskLunList\":[1393141923,901267810,1041320877],\"isInclusionList\":false},\"linuxVmApplicationName\":\"jfutacoebj\"}")
                .toObject(ExtendedProperties.class);
        Assertions.assertEquals(1393141923, model.diskExclusionProperties().diskLunList().get(0));
        Assertions.assertEquals(false, model.diskExclusionProperties().isInclusionList());
        Assertions.assertEquals("jfutacoebj", model.linuxVmApplicationName());
    }

    @Test
    public void testSerialize() {
        ExtendedProperties model =
            new ExtendedProperties()
                .withDiskExclusionProperties(
                    new DiskExclusionProperties()
                        .withDiskLunList(Arrays.asList(1393141923, 901267810, 1041320877))
                        .withIsInclusionList(false))
                .withLinuxVmApplicationName("jfutacoebj");
        model = BinaryData.fromObject(model).toObject(ExtendedProperties.class);
        Assertions.assertEquals(1393141923, model.diskExclusionProperties().diskLunList().get(0));
        Assertions.assertEquals(false, model.diskExclusionProperties().isInclusionList());
        Assertions.assertEquals("jfutacoebj", model.linuxVmApplicationName());
    }
}
