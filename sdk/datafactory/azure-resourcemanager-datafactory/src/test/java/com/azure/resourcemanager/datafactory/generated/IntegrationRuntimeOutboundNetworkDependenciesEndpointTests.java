// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeOutboundNetworkDependenciesEndpoint;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IntegrationRuntimeOutboundNetworkDependenciesEndpointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeOutboundNetworkDependenciesEndpoint model =
            BinaryData
                .fromString("{\"domainName\":\"vfadmws\",\"endpointDetails\":[{\"port\":1913869945}]}")
                .toObject(IntegrationRuntimeOutboundNetworkDependenciesEndpoint.class);
        Assertions.assertEquals("vfadmws", model.domainName());
        Assertions.assertEquals(1913869945, model.endpointDetails().get(0).port());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeOutboundNetworkDependenciesEndpoint model =
            new IntegrationRuntimeOutboundNetworkDependenciesEndpoint()
                .withDomainName("vfadmws")
                .withEndpointDetails(
                    Arrays
                        .asList(
                            new IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails().withPort(1913869945)));
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeOutboundNetworkDependenciesEndpoint.class);
        Assertions.assertEquals("vfadmws", model.domainName());
        Assertions.assertEquals(1913869945, model.endpointDetails().get(0).port());
    }
}
