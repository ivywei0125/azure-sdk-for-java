// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.OracleCloudStorageReadSettings;

public final class OracleCloudStorageReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OracleCloudStorageReadSettings model =
            BinaryData
                .fromString(
                    "{\"type\":\"OracleCloudStorageReadSettings\",\"recursive\":\"datauazoblxxks\",\"wildcardFolderPath\":\"datatiz\",\"wildcardFileName\":\"datavihg\",\"prefix\":\"datadolodfodokh\",\"fileListPath\":\"datag\",\"enablePartitionDiscovery\":\"datadhlnar\",\"partitionRootPath\":\"datauoa\",\"deleteFilesAfterCompletion\":\"datairiccuyqtjvrz\",\"modifiedDatetimeStart\":\"datagmgfa\",\"modifiedDatetimeEnd\":\"datab\",\"maxConcurrentConnections\":\"dataaenvpzd\",\"disableMetricsCollection\":\"datapizgaujvc\",\"\":{\"trkdno\":\"dataybxorrceomsqar\"}}")
                .toObject(OracleCloudStorageReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OracleCloudStorageReadSettings model =
            new OracleCloudStorageReadSettings()
                .withMaxConcurrentConnections("dataaenvpzd")
                .withDisableMetricsCollection("datapizgaujvc")
                .withRecursive("datauazoblxxks")
                .withWildcardFolderPath("datatiz")
                .withWildcardFileName("datavihg")
                .withPrefix("datadolodfodokh")
                .withFileListPath("datag")
                .withEnablePartitionDiscovery("datadhlnar")
                .withPartitionRootPath("datauoa")
                .withDeleteFilesAfterCompletion("datairiccuyqtjvrz")
                .withModifiedDatetimeStart("datagmgfa")
                .withModifiedDatetimeEnd("datab");
        model = BinaryData.fromObject(model).toObject(OracleCloudStorageReadSettings.class);
    }
}
