// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureBlobStorageReadSettings;

public final class AzureBlobStorageReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBlobStorageReadSettings model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureBlobStorageReadSettings\",\"recursive\":\"datan\",\"wildcardFolderPath\":\"datahrhcfeqjkac\",\"wildcardFileName\":\"datatnuckojqoxpw\",\"prefix\":\"datavfdosq\",\"fileListPath\":\"dataoyqbpzxushmlti\",\"enablePartitionDiscovery\":\"datacptvkbcykntdzze\",\"partitionRootPath\":\"datazpggsyeydctjnei\",\"deleteFilesAfterCompletion\":\"dataztlzbwbyvjispkgk\",\"modifiedDatetimeStart\":\"datapvbzmyo\",\"modifiedDatetimeEnd\":\"dataxstxsfztlvs\",\"maxConcurrentConnections\":\"datafshhc\",\"disableMetricsCollection\":\"datasowyhxwhdyfgtwx\",\"\":{\"im\":\"databzfiacmwmc\",\"tnolziohdxyuk\":\"datahrfmcjjxxwzdwmju\",\"sffpizef\":\"dataplfwykrpojen\",\"zcevf\":\"datajgblehxpeuahvxf\"}}")
                .toObject(AzureBlobStorageReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBlobStorageReadSettings model =
            new AzureBlobStorageReadSettings()
                .withMaxConcurrentConnections("datafshhc")
                .withDisableMetricsCollection("datasowyhxwhdyfgtwx")
                .withRecursive("datan")
                .withWildcardFolderPath("datahrhcfeqjkac")
                .withWildcardFileName("datatnuckojqoxpw")
                .withPrefix("datavfdosq")
                .withFileListPath("dataoyqbpzxushmlti")
                .withEnablePartitionDiscovery("datacptvkbcykntdzze")
                .withPartitionRootPath("datazpggsyeydctjnei")
                .withDeleteFilesAfterCompletion("dataztlzbwbyvjispkgk")
                .withModifiedDatetimeStart("datapvbzmyo")
                .withModifiedDatetimeEnd("dataxstxsfztlvs");
        model = BinaryData.fromObject(model).toObject(AzureBlobStorageReadSettings.class);
    }
}
