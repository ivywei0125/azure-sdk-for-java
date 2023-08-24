// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.CloudServicesNetworkInner;
import com.azure.resourcemanager.networkcloud.models.CloudServicesNetworkEnableDefaultEgressEndpoints;
import com.azure.resourcemanager.networkcloud.models.EgressEndpoint;
import com.azure.resourcemanager.networkcloud.models.EndpointDependency;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CloudServicesNetworkInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudServicesNetworkInner model =
            BinaryData
                .fromString(
                    "{\"extendedLocation\":{\"name\":\"yc\",\"type\":\"sne\"},\"properties\":{\"additionalEgressEndpoints\":[{\"category\":\"z\",\"endpoints\":[{\"domainName\":\"iachbo\",\"port\":7002170087466409923},{\"domainName\":\"nrosfqpte\",\"port\":6506464827830686255},{\"domainName\":\"vypyqrimzinpv\",\"port\":2981381234458568547},{\"domainName\":\"kirsoodqxhc\",\"port\":5435378937103352415}]},{\"category\":\"hjtckwhd\",\"endpoints\":[{\"domainName\":\"ifiyipjxsqwpgrj\",\"port\":7893656903308108535},{\"domainName\":\"rcjxvsnbyxqabn\",\"port\":3303160173676492784},{\"domainName\":\"cyshurzafbljjgp\",\"port\":1259856428819267216},{\"domainName\":\"c\",\"port\":3089454434341708656}]}],\"associatedResourceIds\":[\"vbqid\"],\"clusterId\":\"ajzyul\",\"detailedStatus\":\"Error\",\"detailedStatusMessage\":\"jkrlkhbzhfepg\",\"enableDefaultEgressEndpoints\":\"True\",\"enabledEgressEndpoints\":[{\"category\":\"zloc\",\"endpoints\":[{\"domainName\":\"c\",\"port\":7962236738241202360},{\"domainName\":\"rhhbcs\",\"port\":2260430368341825992}]},{\"category\":\"majtjaod\",\"endpoints\":[{\"domainName\":\"bnbdxkqpxokajion\",\"port\":1589043930460259001},{\"domainName\":\"xg\",\"port\":4171550668589423335},{\"domainName\":\"cp\",\"port\":8018866075965400544},{\"domainName\":\"aajrm\",\"port\":5608732709320879366}]},{\"category\":\"zrlovmclwhijcoej\",\"endpoints\":[{\"domainName\":\"bzaqsqsycbkbfk\",\"port\":6954441473774697621},{\"domainName\":\"kexxppof\",\"port\":8067111908299407616},{\"domainName\":\"c\",\"port\":1700907273913635795},{\"domainName\":\"ddtocjjxhvp\",\"port\":7583874860615513488}]}],\"hybridAksClustersAssociatedIds\":[\"dzxibqeojnxqbzvd\"],\"interfaceName\":\"t\",\"provisioningState\":\"Accepted\",\"virtualMachinesAssociatedIds\":[\"cbtwnpzaoqvuh\",\"hcffcyddglmjthjq\",\"wpyeicxmqciwqvh\"]},\"location\":\"ixuigdtopbobj\",\"tags\":{\"w\":\"m\"},\"id\":\"a\",\"name\":\"a\",\"type\":\"hrzayvvtpgvdf\"}")
                .toObject(CloudServicesNetworkInner.class);
        Assertions.assertEquals("ixuigdtopbobj", model.location());
        Assertions.assertEquals("m", model.tags().get("w"));
        Assertions.assertEquals("yc", model.extendedLocation().name());
        Assertions.assertEquals("sne", model.extendedLocation().type());
        Assertions.assertEquals("z", model.additionalEgressEndpoints().get(0).category());
        Assertions.assertEquals("iachbo", model.additionalEgressEndpoints().get(0).endpoints().get(0).domainName());
        Assertions
            .assertEquals(7002170087466409923L, model.additionalEgressEndpoints().get(0).endpoints().get(0).port());
        Assertions
            .assertEquals(CloudServicesNetworkEnableDefaultEgressEndpoints.TRUE, model.enableDefaultEgressEndpoints());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudServicesNetworkInner model =
            new CloudServicesNetworkInner()
                .withLocation("ixuigdtopbobj")
                .withTags(mapOf("w", "m"))
                .withExtendedLocation(new ExtendedLocation().withName("yc").withType("sne"))
                .withAdditionalEgressEndpoints(
                    Arrays
                        .asList(
                            new EgressEndpoint()
                                .withCategory("z")
                                .withEndpoints(
                                    Arrays
                                        .asList(
                                            new EndpointDependency()
                                                .withDomainName("iachbo")
                                                .withPort(7002170087466409923L),
                                            new EndpointDependency()
                                                .withDomainName("nrosfqpte")
                                                .withPort(6506464827830686255L),
                                            new EndpointDependency()
                                                .withDomainName("vypyqrimzinpv")
                                                .withPort(2981381234458568547L),
                                            new EndpointDependency()
                                                .withDomainName("kirsoodqxhc")
                                                .withPort(5435378937103352415L))),
                            new EgressEndpoint()
                                .withCategory("hjtckwhd")
                                .withEndpoints(
                                    Arrays
                                        .asList(
                                            new EndpointDependency()
                                                .withDomainName("ifiyipjxsqwpgrj")
                                                .withPort(7893656903308108535L),
                                            new EndpointDependency()
                                                .withDomainName("rcjxvsnbyxqabn")
                                                .withPort(3303160173676492784L),
                                            new EndpointDependency()
                                                .withDomainName("cyshurzafbljjgp")
                                                .withPort(1259856428819267216L),
                                            new EndpointDependency()
                                                .withDomainName("c")
                                                .withPort(3089454434341708656L)))))
                .withEnableDefaultEgressEndpoints(CloudServicesNetworkEnableDefaultEgressEndpoints.TRUE);
        model = BinaryData.fromObject(model).toObject(CloudServicesNetworkInner.class);
        Assertions.assertEquals("ixuigdtopbobj", model.location());
        Assertions.assertEquals("m", model.tags().get("w"));
        Assertions.assertEquals("yc", model.extendedLocation().name());
        Assertions.assertEquals("sne", model.extendedLocation().type());
        Assertions.assertEquals("z", model.additionalEgressEndpoints().get(0).category());
        Assertions.assertEquals("iachbo", model.additionalEgressEndpoints().get(0).endpoints().get(0).domainName());
        Assertions
            .assertEquals(7002170087466409923L, model.additionalEgressEndpoints().get(0).endpoints().get(0).port());
        Assertions
            .assertEquals(CloudServicesNetworkEnableDefaultEgressEndpoints.TRUE, model.enableDefaultEgressEndpoints());
    }

    // Use "Map.of" if available
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
