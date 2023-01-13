// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databoxedge.models.AlertList;

public final class AlertListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AlertList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"title\":\"ualhbxxhejj\",\"alertType\":\"v\",\"appearedAtDateTime\":\"2021-10-15T07:07:10Z\",\"recommendation\":\"wdslfhotwmcy\",\"severity\":\"Informational\",\"detailedInformation\":{}},\"id\":\"jnpg\",\"name\":\"cftadeh\",\"type\":\"nltyfsoppusuesnz\"}],\"nextLink\":\"ej\"}")
                .toObject(AlertList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AlertList model = new AlertList();
        model = BinaryData.fromObject(model).toObject(AlertList.class);
    }
}