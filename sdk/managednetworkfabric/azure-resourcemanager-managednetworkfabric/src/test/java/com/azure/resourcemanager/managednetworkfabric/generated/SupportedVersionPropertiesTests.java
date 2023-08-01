// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.SupportedVersionProperties;
import org.junit.jupiter.api.Assertions;

public final class SupportedVersionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SupportedVersionProperties model =
            BinaryData
                .fromString(
                    "{\"version\":\"vorbalkjnbk\",\"vendorOsVersion\":\"h\",\"vendorFirmwareVersion\":\"tqstqkqsygxiyne\",\"isDefault\":\"False\"}")
                .toObject(SupportedVersionProperties.class);
        Assertions.assertEquals("vorbalkjnbk", model.version());
        Assertions.assertEquals("h", model.vendorOsVersion());
        Assertions.assertEquals("tqstqkqsygxiyne", model.vendorFirmwareVersion());
        Assertions.assertEquals(BooleanEnumProperty.FALSE, model.isDefault());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SupportedVersionProperties model =
            new SupportedVersionProperties()
                .withVersion("vorbalkjnbk")
                .withVendorOsVersion("h")
                .withVendorFirmwareVersion("tqstqkqsygxiyne")
                .withIsDefault(BooleanEnumProperty.FALSE);
        model = BinaryData.fromObject(model).toObject(SupportedVersionProperties.class);
        Assertions.assertEquals("vorbalkjnbk", model.version());
        Assertions.assertEquals("h", model.vendorOsVersion());
        Assertions.assertEquals("tqstqkqsygxiyne", model.vendorFirmwareVersion());
        Assertions.assertEquals(BooleanEnumProperty.FALSE, model.isDefault());
    }
}
