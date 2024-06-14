// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.informaticadatamanagement.models.OfferDetails;
import org.junit.jupiter.api.Assertions;

public final class OfferDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OfferDetails model = BinaryData.fromString(
            "{\"publisherId\":\"jczdzevndh\",\"offerId\":\"rwpdappdsbdkvwrw\",\"planId\":\"feusnhut\",\"planName\":\"eltmrldhugjzzdat\",\"termUnit\":\"hocdgeab\",\"termId\":\"gphuticndvka\"}")
            .toObject(OfferDetails.class);
        Assertions.assertEquals("jczdzevndh", model.publisherId());
        Assertions.assertEquals("rwpdappdsbdkvwrw", model.offerId());
        Assertions.assertEquals("feusnhut", model.planId());
        Assertions.assertEquals("eltmrldhugjzzdat", model.planName());
        Assertions.assertEquals("hocdgeab", model.termUnit());
        Assertions.assertEquals("gphuticndvka", model.termId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OfferDetails model = new OfferDetails().withPublisherId("jczdzevndh")
            .withOfferId("rwpdappdsbdkvwrw")
            .withPlanId("feusnhut")
            .withPlanName("eltmrldhugjzzdat")
            .withTermUnit("hocdgeab")
            .withTermId("gphuticndvka");
        model = BinaryData.fromObject(model).toObject(OfferDetails.class);
        Assertions.assertEquals("jczdzevndh", model.publisherId());
        Assertions.assertEquals("rwpdappdsbdkvwrw", model.offerId());
        Assertions.assertEquals("feusnhut", model.planId());
        Assertions.assertEquals("eltmrldhugjzzdat", model.planName());
        Assertions.assertEquals("hocdgeab", model.termUnit());
        Assertions.assertEquals("gphuticndvka", model.termId());
    }
}
