// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SftpWriteSettings;

public final class SftpWriteSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SftpWriteSettings model =
            BinaryData
                .fromString(
                    "{\"type\":\"SftpWriteSettings\",\"operationTimeout\":\"dataxzzhldaxvir\",\"useTempFileRename\":\"datawacfqnw\",\"maxConcurrentConnections\":\"datab\",\"disableMetricsCollection\":\"datagi\",\"copyBehavior\":\"datazrpqe\",\"\":{\"a\":\"dataldvxcjjhjnpa\"}}")
                .toObject(SftpWriteSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SftpWriteSettings model =
            new SftpWriteSettings()
                .withMaxConcurrentConnections("datab")
                .withDisableMetricsCollection("datagi")
                .withCopyBehavior("datazrpqe")
                .withOperationTimeout("dataxzzhldaxvir")
                .withUseTempFileRename("datawacfqnw");
        model = BinaryData.fromObject(model).toObject(SftpWriteSettings.class);
    }
}
