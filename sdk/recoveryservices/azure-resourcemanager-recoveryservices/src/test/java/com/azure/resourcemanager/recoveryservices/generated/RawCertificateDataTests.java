// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.AuthType;
import com.azure.resourcemanager.recoveryservices.models.RawCertificateData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RawCertificateDataTests {
    @Test
    public void testDeserialize() {
        RawCertificateData model = BinaryData.fromString("{\"authType\":\"AAD\"}").toObject(RawCertificateData.class);
        Assertions.assertEquals(AuthType.AAD, model.authType());
    }

    @Test
    public void testSerialize() {
        RawCertificateData model = new RawCertificateData().withAuthType(AuthType.AAD);
        model = BinaryData.fromObject(model).toObject(RawCertificateData.class);
        Assertions.assertEquals(AuthType.AAD, model.authType());
    }
}