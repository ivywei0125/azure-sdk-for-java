// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SftpWriteSettings;
import org.junit.jupiter.api.Test;

public final class SftpWriteSettingsTests {
    @Test
    public void testDeserialize() {
        SftpWriteSettings model =
            BinaryData.fromString("{\"type\":\"SftpWriteSettings\",\"\":{}}").toObject(SftpWriteSettings.class);
    }

    @Test
    public void testSerialize() {
        SftpWriteSettings model = new SftpWriteSettings();
        model = BinaryData.fromObject(model).toObject(SftpWriteSettings.class);
    }
}
