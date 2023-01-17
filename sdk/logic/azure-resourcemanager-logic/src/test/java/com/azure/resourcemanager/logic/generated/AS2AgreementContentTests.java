// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.AS2AgreementContent;
import com.azure.resourcemanager.logic.models.AS2OneWayAgreement;
import com.azure.resourcemanager.logic.models.AS2ProtocolSettings;
import com.azure.resourcemanager.logic.models.BusinessIdentity;
import org.junit.jupiter.api.Assertions;

public final class AS2AgreementContentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AS2AgreementContent model =
            BinaryData
                .fromString(
                    "{\"receiveAgreement\":{\"senderBusinessIdentity\":{\"qualifier\":\"omi\",\"value\":\"ox\"},\"receiverBusinessIdentity\":{\"qualifier\":\"gdufiqnd\",\"value\":\"euzaof\"},\"protocolSettings\":{}},\"sendAgreement\":{\"senderBusinessIdentity\":{\"qualifier\":\"chvcyyysfgdo\",\"value\":\"cubiipuipw\"},\"receiverBusinessIdentity\":{\"qualifier\":\"qonmacj\",\"value\":\"k\"},\"protocolSettings\":{}}}")
                .toObject(AS2AgreementContent.class);
        Assertions.assertEquals("omi", model.receiveAgreement().senderBusinessIdentity().qualifier());
        Assertions.assertEquals("ox", model.receiveAgreement().senderBusinessIdentity().value());
        Assertions.assertEquals("gdufiqnd", model.receiveAgreement().receiverBusinessIdentity().qualifier());
        Assertions.assertEquals("euzaof", model.receiveAgreement().receiverBusinessIdentity().value());
        Assertions.assertEquals("chvcyyysfgdo", model.sendAgreement().senderBusinessIdentity().qualifier());
        Assertions.assertEquals("cubiipuipw", model.sendAgreement().senderBusinessIdentity().value());
        Assertions.assertEquals("qonmacj", model.sendAgreement().receiverBusinessIdentity().qualifier());
        Assertions.assertEquals("k", model.sendAgreement().receiverBusinessIdentity().value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AS2AgreementContent model =
            new AS2AgreementContent()
                .withReceiveAgreement(
                    new AS2OneWayAgreement()
                        .withSenderBusinessIdentity(new BusinessIdentity().withQualifier("omi").withValue("ox"))
                        .withReceiverBusinessIdentity(
                            new BusinessIdentity().withQualifier("gdufiqnd").withValue("euzaof"))
                        .withProtocolSettings(new AS2ProtocolSettings()))
                .withSendAgreement(
                    new AS2OneWayAgreement()
                        .withSenderBusinessIdentity(
                            new BusinessIdentity().withQualifier("chvcyyysfgdo").withValue("cubiipuipw"))
                        .withReceiverBusinessIdentity(new BusinessIdentity().withQualifier("qonmacj").withValue("k"))
                        .withProtocolSettings(new AS2ProtocolSettings()));
        model = BinaryData.fromObject(model).toObject(AS2AgreementContent.class);
        Assertions.assertEquals("omi", model.receiveAgreement().senderBusinessIdentity().qualifier());
        Assertions.assertEquals("ox", model.receiveAgreement().senderBusinessIdentity().value());
        Assertions.assertEquals("gdufiqnd", model.receiveAgreement().receiverBusinessIdentity().qualifier());
        Assertions.assertEquals("euzaof", model.receiveAgreement().receiverBusinessIdentity().value());
        Assertions.assertEquals("chvcyyysfgdo", model.sendAgreement().senderBusinessIdentity().qualifier());
        Assertions.assertEquals("cubiipuipw", model.sendAgreement().senderBusinessIdentity().value());
        Assertions.assertEquals("qonmacj", model.sendAgreement().receiverBusinessIdentity().qualifier());
        Assertions.assertEquals("k", model.sendAgreement().receiverBusinessIdentity().value());
    }
}