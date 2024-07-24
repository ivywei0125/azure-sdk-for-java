// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.informaticadatamanagement.models.CompanyDetails;
import org.junit.jupiter.api.Assertions;

public final class CompanyDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CompanyDetails model = BinaryData.fromString(
            "{\"companyName\":\"wbnguitnwui\",\"officeAddress\":\"a\",\"country\":\"ufizuckyf\",\"domain\":\"rfidfvzwdz\",\"business\":\"tymw\",\"numberOfEmployees\":396497881}")
            .toObject(CompanyDetails.class);
        Assertions.assertEquals("wbnguitnwui", model.companyName());
        Assertions.assertEquals("a", model.officeAddress());
        Assertions.assertEquals("ufizuckyf", model.country());
        Assertions.assertEquals("rfidfvzwdz", model.domain());
        Assertions.assertEquals("tymw", model.business());
        Assertions.assertEquals(396497881, model.numberOfEmployees());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CompanyDetails model = new CompanyDetails().withCompanyName("wbnguitnwui")
            .withOfficeAddress("a")
            .withCountry("ufizuckyf")
            .withDomain("rfidfvzwdz")
            .withBusiness("tymw")
            .withNumberOfEmployees(396497881);
        model = BinaryData.fromObject(model).toObject(CompanyDetails.class);
        Assertions.assertEquals("wbnguitnwui", model.companyName());
        Assertions.assertEquals("a", model.officeAddress());
        Assertions.assertEquals("ufizuckyf", model.country());
        Assertions.assertEquals("rfidfvzwdz", model.domain());
        Assertions.assertEquals("tymw", model.business());
        Assertions.assertEquals(396497881, model.numberOfEmployees());
    }
}
