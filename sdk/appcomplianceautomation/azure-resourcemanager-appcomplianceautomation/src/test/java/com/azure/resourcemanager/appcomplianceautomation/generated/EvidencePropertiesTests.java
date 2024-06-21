// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcomplianceautomation.models.EvidenceProperties;
import com.azure.resourcemanager.appcomplianceautomation.models.EvidenceType;
import org.junit.jupiter.api.Assertions;

public final class EvidencePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EvidenceProperties model = BinaryData.fromString(
            "{\"evidenceType\":\"Data\",\"filePath\":\"htldwk\",\"extraData\":\"xuutkncwscwsv\",\"controlId\":\"otogtwrupqs\",\"responsibilityId\":\"nmic\",\"provisioningState\":\"Failed\"}")
            .toObject(EvidenceProperties.class);
        Assertions.assertEquals(EvidenceType.DATA, model.evidenceType());
        Assertions.assertEquals("htldwk", model.filePath());
        Assertions.assertEquals("xuutkncwscwsv", model.extraData());
        Assertions.assertEquals("otogtwrupqs", model.controlId());
        Assertions.assertEquals("nmic", model.responsibilityId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EvidenceProperties model = new EvidenceProperties().withEvidenceType(EvidenceType.DATA)
            .withFilePath("htldwk")
            .withExtraData("xuutkncwscwsv")
            .withControlId("otogtwrupqs")
            .withResponsibilityId("nmic");
        model = BinaryData.fromObject(model).toObject(EvidenceProperties.class);
        Assertions.assertEquals(EvidenceType.DATA, model.evidenceType());
        Assertions.assertEquals("htldwk", model.filePath());
        Assertions.assertEquals("xuutkncwscwsv", model.extraData());
        Assertions.assertEquals("otogtwrupqs", model.controlId());
        Assertions.assertEquals("nmic", model.responsibilityId());
    }
}
