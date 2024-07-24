// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.KubernetesStorageClassRestoreCriteria;
import org.junit.jupiter.api.Assertions;

public final class KubernetesStorageClassRestoreCriteriaTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        KubernetesStorageClassRestoreCriteria model = BinaryData.fromString(
            "{\"objectType\":\"KubernetesStorageClassRestoreCriteria\",\"selectedStorageClassName\":\"iyujviylwdshfs\",\"provisioner\":\"rbgyefry\"}")
            .toObject(KubernetesStorageClassRestoreCriteria.class);
        Assertions.assertEquals("iyujviylwdshfs", model.selectedStorageClassName());
        Assertions.assertEquals("rbgyefry", model.provisioner());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        KubernetesStorageClassRestoreCriteria model
            = new KubernetesStorageClassRestoreCriteria().withSelectedStorageClassName("iyujviylwdshfs")
                .withProvisioner("rbgyefry");
        model = BinaryData.fromObject(model).toObject(KubernetesStorageClassRestoreCriteria.class);
        Assertions.assertEquals("iyujviylwdshfs", model.selectedStorageClassName());
        Assertions.assertEquals("rbgyefry", model.provisioner());
    }
}
