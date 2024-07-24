// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.informaticadatamanagement.models.PlatformType;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessConfigProperties;
import org.junit.jupiter.api.Assertions;

public final class ServerlessConfigPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerlessConfigProperties model = BinaryData.fromString(
            "{\"platform\":\"AZURE\",\"applicationTypes\":[{\"name\":\"smocmbq\",\"value\":\"vmkcx\"},{\"name\":\"apvhelxprgly\",\"value\":\"dd\"}],\"computeUnits\":[{\"name\":\"cuejrjxgci\",\"value\":[\"rhos\"]},{\"name\":\"dqrhzoymib\",\"value\":[\"yiba\"]},{\"name\":\"fluszdtm\",\"value\":[\"wofyyvoqacpiexp\",\"tg\",\"wbwo\"]},{\"name\":\"washr\",\"value\":[\"kcnqxwbpo\",\"ulpiuj\"]}],\"executionTimeout\":\"asipqiio\",\"regions\":[{\"id\":\"erpqlpqwcciuqg\",\"name\":\"butauvfb\"},{\"id\":\"uwhhmhykojoxafn\",\"name\":\"lpichk\"},{\"id\":\"mkcdyhbpkkpwdre\",\"name\":\"ovvqfovljxywsu\"}]}")
            .toObject(ServerlessConfigProperties.class);
        Assertions.assertEquals(PlatformType.AZURE, model.platform());
        Assertions.assertEquals("smocmbq", model.applicationTypes().get(0).name());
        Assertions.assertEquals("vmkcx", model.applicationTypes().get(0).value());
        Assertions.assertEquals("cuejrjxgci", model.computeUnits().get(0).name());
        Assertions.assertEquals("rhos", model.computeUnits().get(0).value().get(0));
        Assertions.assertEquals("asipqiio", model.executionTimeout());
        Assertions.assertEquals("erpqlpqwcciuqg", model.regions().get(0).id());
        Assertions.assertEquals("butauvfb", model.regions().get(0).name());
    }
}
