// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.OutboundNetworkDependenciesEndpointInner;
import com.azure.resourcemanager.kusto.models.EndpointDependency;
import com.azure.resourcemanager.kusto.models.EndpointDetail;
import com.azure.resourcemanager.kusto.models.OutboundNetworkDependenciesEndpointListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OutboundNetworkDependenciesEndpointListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OutboundNetworkDependenciesEndpointListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"category\":\"fvpdbo\",\"endpoints\":[{\"domainName\":\"zsjqlh\",\"endpointDetails\":[{}]},{\"domainName\":\"bdeibqipqk\",\"endpointDetails\":[{},{}]},{\"domainName\":\"ndzwmkrefa\",\"endpointDetails\":[{},{},{},{}]},{\"domainName\":\"rwkq\",\"endpointDetails\":[{},{}]}],\"provisioningState\":\"Moving\"},\"etag\":\"j\",\"id\":\"jivfxzsjabib\",\"name\":\"ystawfsdjpvkvp\",\"type\":\"jxbkzbzkdvn\"}],\"nextLink\":\"abudurgk\"}")
                .toObject(OutboundNetworkDependenciesEndpointListResult.class);
        Assertions.assertEquals("fvpdbo", model.value().get(0).category());
        Assertions.assertEquals("zsjqlh", model.value().get(0).endpoints().get(0).domainName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OutboundNetworkDependenciesEndpointListResult model =
            new OutboundNetworkDependenciesEndpointListResult()
                .withValue(
                    Arrays
                        .asList(
                            new OutboundNetworkDependenciesEndpointInner()
                                .withCategory("fvpdbo")
                                .withEndpoints(
                                    Arrays
                                        .asList(
                                            new EndpointDependency()
                                                .withDomainName("zsjqlh")
                                                .withEndpointDetails(Arrays.asList(new EndpointDetail())),
                                            new EndpointDependency()
                                                .withDomainName("bdeibqipqk")
                                                .withEndpointDetails(
                                                    Arrays.asList(new EndpointDetail(), new EndpointDetail())),
                                            new EndpointDependency()
                                                .withDomainName("ndzwmkrefa")
                                                .withEndpointDetails(
                                                    Arrays
                                                        .asList(
                                                            new EndpointDetail(),
                                                            new EndpointDetail(),
                                                            new EndpointDetail(),
                                                            new EndpointDetail())),
                                            new EndpointDependency()
                                                .withDomainName("rwkq")
                                                .withEndpointDetails(
                                                    Arrays.asList(new EndpointDetail(), new EndpointDetail()))))));
        model = BinaryData.fromObject(model).toObject(OutboundNetworkDependenciesEndpointListResult.class);
        Assertions.assertEquals("fvpdbo", model.value().get(0).category());
        Assertions.assertEquals("zsjqlh", model.value().get(0).endpoints().get(0).domainName());
    }
}
