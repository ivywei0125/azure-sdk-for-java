// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.fluent.models.IntegrationAccountInner;
import com.azure.resourcemanager.logic.models.IntegrationAccountSku;
import com.azure.resourcemanager.logic.models.IntegrationAccountSkuName;
import com.azure.resourcemanager.logic.models.ResourceReference;
import com.azure.resourcemanager.logic.models.WorkflowState;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IntegrationAccountInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationAccountInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"integrationServiceEnvironment\":{\"id\":\"yhrfouyftaakcpw\",\"name\":\"zvqtmnubexkp\",\"type\":\"smond\"},\"state\":\"Enabled\"},\"sku\":{\"name\":\"NotSpecified\"},\"location\":\"vypomgkopkwho\",\"tags\":{\"mocmbqfqvmk\":\"ajqgxy\",\"helxprglya\":\"xozap\",\"kcbcue\":\"dd\"},\"id\":\"rjxgciqib\",\"name\":\"hos\",\"type\":\"sdqrhzoymibmrq\"}")
                .toObject(IntegrationAccountInner.class);
        Assertions.assertEquals("vypomgkopkwho", model.location());
        Assertions.assertEquals("ajqgxy", model.tags().get("mocmbqfqvmk"));
        Assertions.assertEquals(IntegrationAccountSkuName.NOT_SPECIFIED, model.sku().name());
        Assertions.assertEquals("yhrfouyftaakcpw", model.integrationServiceEnvironment().id());
        Assertions.assertEquals(WorkflowState.ENABLED, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationAccountInner model =
            new IntegrationAccountInner()
                .withLocation("vypomgkopkwho")
                .withTags(mapOf("mocmbqfqvmk", "ajqgxy", "helxprglya", "xozap", "kcbcue", "dd"))
                .withSku(new IntegrationAccountSku().withName(IntegrationAccountSkuName.NOT_SPECIFIED))
                .withIntegrationServiceEnvironment(new ResourceReference().withId("yhrfouyftaakcpw"))
                .withState(WorkflowState.ENABLED);
        model = BinaryData.fromObject(model).toObject(IntegrationAccountInner.class);
        Assertions.assertEquals("vypomgkopkwho", model.location());
        Assertions.assertEquals("ajqgxy", model.tags().get("mocmbqfqvmk"));
        Assertions.assertEquals(IntegrationAccountSkuName.NOT_SPECIFIED, model.sku().name());
        Assertions.assertEquals("yhrfouyftaakcpw", model.integrationServiceEnvironment().id());
        Assertions.assertEquals(WorkflowState.ENABLED, model.state());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
