// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.fluent.models.DbServerInner;
import com.azure.resourcemanager.oracledatabase.models.DbServerProperties;

public final class DbServerInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DbServerInner model = BinaryData.fromString(
            "{\"properties\":{\"ocid\":\"xbvtvudu\",\"displayName\":\"cormr\",\"compartmentId\":\"qtvcofudflvkgj\",\"exadataInfrastructureId\":\"gdknnqv\",\"cpuCoreCount\":1989846717,\"dbServerPatchingDetails\":{\"estimatedPatchDuration\":185421372,\"patchingStatus\":\"MaintenanceInProgress\",\"timePatchingEnded\":\"2021-06-22T06:44:39Z\",\"timePatchingStarted\":\"2021-04-03T12:16:15Z\"},\"maxMemoryInGbs\":1449495124,\"dbNodeStorageSizeInGbs\":760670144,\"vmClusterIds\":[\"yc\",\"rauwjuetaebu\",\"u\"],\"dbNodeIds\":[\"ovsm\",\"l\",\"wabm\",\"oefki\"],\"lifecycleDetails\":\"vtpuqujmqlgk\",\"lifecycleState\":\"Deleting\",\"maxCpuCount\":1252448159,\"autonomousVmClusterIds\":[\"ongbjcnt\",\"jitcjedftwwaez\"],\"autonomousVirtualMachineIds\":[\"v\",\"c\",\"zfoqouicybxar\",\"gszufoxciqopid\"],\"maxDbNodeStorageInGbs\":1543353321,\"memorySizeInGbs\":1108967269,\"shape\":\"dhkha\",\"timeCreated\":\"2021-06-05T04:56:19Z\",\"provisioningState\":\"Succeeded\"},\"id\":\"bon\",\"name\":\"wntoegokdwbwh\",\"type\":\"szzcmrvexztv\"}")
            .toObject(DbServerInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DbServerInner model = new DbServerInner().withProperties(new DbServerProperties());
        model = BinaryData.fromObject(model).toObject(DbServerInner.class);
    }
}
