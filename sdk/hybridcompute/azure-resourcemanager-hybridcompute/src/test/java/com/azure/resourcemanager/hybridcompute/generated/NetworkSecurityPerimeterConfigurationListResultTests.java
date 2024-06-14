// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.NetworkSecurityPerimeterConfigurationListResult;

public final class NetworkSecurityPerimeterConfigurationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkSecurityPerimeterConfigurationListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"jlfrq\",\"provisioningIssues\":[{\"name\":\"jlkatnwxy\",\"properties\":{}},{\"name\":\"id\",\"properties\":{}}],\"networkSecurityPerimeter\":{\"id\":\"kuvscxkdm\",\"perimeterGuid\":\"govibrxkpmloazu\",\"location\":\"ocbgoorbteoyb\"},\"resourceAssociation\":{\"name\":\"xakvvjgslor\",\"accessMode\":\"learning\"},\"profile\":{\"name\":\"wwtkg\",\"accessRulesVersion\":583525950,\"accessRules\":[{},{},{},{}],\"diagnosticSettingsVersion\":2104896567,\"enabledLogCategories\":[\"yvudtjuewbci\",\"xuuwhcj\",\"xccybvpa\"]}},\"id\":\"akkud\",\"name\":\"px\",\"type\":\"wjplma\"}],\"nextLink\":\"tcyohpfkyrk\"}")
            .toObject(NetworkSecurityPerimeterConfigurationListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkSecurityPerimeterConfigurationListResult model = new NetworkSecurityPerimeterConfigurationListResult();
        model = BinaryData.fromObject(model).toObject(NetworkSecurityPerimeterConfigurationListResult.class);
    }
}
