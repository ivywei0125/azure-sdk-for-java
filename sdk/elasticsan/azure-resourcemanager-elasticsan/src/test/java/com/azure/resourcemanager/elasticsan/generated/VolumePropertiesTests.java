// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.fluent.models.VolumeProperties;
import com.azure.resourcemanager.elasticsan.models.ManagedByInfo;
import com.azure.resourcemanager.elasticsan.models.SourceCreationData;
import com.azure.resourcemanager.elasticsan.models.VolumeCreateOption;
import org.junit.jupiter.api.Assertions;

public final class VolumePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumeProperties model =
            BinaryData
                .fromString(
                    "{\"volumeId\":\"ukgri\",\"creationData\":{\"createSource\":\"None\",\"sourceId\":\"fbxzpuzycisp\"},\"sizeGiB\":1357175486164499901,\"storageTarget\":{\"targetIqn\":\"mgkbrpyydhibn\",\"targetPortalHostname\":\"qkpikadrgvtqagnb\",\"targetPortalPort\":855671205,\"provisioningState\":\"Creating\",\"status\":\"Invalid\"},\"managedBy\":{\"resourceId\":\"ebf\"},\"provisioningState\":\"Succeeded\"}")
                .toObject(VolumeProperties.class);
        Assertions.assertEquals(VolumeCreateOption.NONE, model.creationData().createSource());
        Assertions.assertEquals("fbxzpuzycisp", model.creationData().sourceId());
        Assertions.assertEquals(1357175486164499901L, model.sizeGiB());
        Assertions.assertEquals("ebf", model.managedBy().resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumeProperties model =
            new VolumeProperties()
                .withCreationData(
                    new SourceCreationData().withCreateSource(VolumeCreateOption.NONE).withSourceId("fbxzpuzycisp"))
                .withSizeGiB(1357175486164499901L)
                .withManagedBy(new ManagedByInfo().withResourceId("ebf"));
        model = BinaryData.fromObject(model).toObject(VolumeProperties.class);
        Assertions.assertEquals(VolumeCreateOption.NONE, model.creationData().createSource());
        Assertions.assertEquals("fbxzpuzycisp", model.creationData().sourceId());
        Assertions.assertEquals(1357175486164499901L, model.sizeGiB());
        Assertions.assertEquals("ebf", model.managedBy().resourceId());
    }
}
