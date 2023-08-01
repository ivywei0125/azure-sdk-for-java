// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.CommonDynamicMatchConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.IpAddressType;
import com.azure.resourcemanager.managednetworkfabric.models.IpGroupProperties;
import com.azure.resourcemanager.managednetworkfabric.models.PortGroupProperties;
import com.azure.resourcemanager.managednetworkfabric.models.VlanGroupProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CommonDynamicMatchConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CommonDynamicMatchConfiguration model =
            BinaryData
                .fromString(
                    "{\"ipGroups\":[{\"name\":\"cblembnkbwv\",\"ipAddressType\":\"IPv4\",\"ipPrefixes\":[\"ivqiheb\",\"tswbzuwfmd\"]}],\"vlanGroups\":[{\"name\":\"egizv\",\"vlans\":[\"elisdjub\",\"gbqi\",\"kxkbsazgakgacyr\"]},{\"name\":\"jdmspofapvuhryln\",\"vlans\":[\"rz\",\"bzjedmstk\",\"nlvxbcuii\"]}],\"portGroups\":[{\"name\":\"wfansnvpdi\",\"ports\":[\"kostbzbki\",\"buqny\",\"phzfylsgcrp\",\"bcunezzceze\"]},{\"name\":\"w\",\"ports\":[\"lwxjwetn\"]}]}")
                .toObject(CommonDynamicMatchConfiguration.class);
        Assertions.assertEquals("cblembnkbwv", model.ipGroups().get(0).name());
        Assertions.assertEquals(IpAddressType.IPV4, model.ipGroups().get(0).ipAddressType());
        Assertions.assertEquals("ivqiheb", model.ipGroups().get(0).ipPrefixes().get(0));
        Assertions.assertEquals("egizv", model.vlanGroups().get(0).name());
        Assertions.assertEquals("elisdjub", model.vlanGroups().get(0).vlans().get(0));
        Assertions.assertEquals("wfansnvpdi", model.portGroups().get(0).name());
        Assertions.assertEquals("kostbzbki", model.portGroups().get(0).ports().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CommonDynamicMatchConfiguration model =
            new CommonDynamicMatchConfiguration()
                .withIpGroups(
                    Arrays
                        .asList(
                            new IpGroupProperties()
                                .withName("cblembnkbwv")
                                .withIpAddressType(IpAddressType.IPV4)
                                .withIpPrefixes(Arrays.asList("ivqiheb", "tswbzuwfmd"))))
                .withVlanGroups(
                    Arrays
                        .asList(
                            new VlanGroupProperties()
                                .withName("egizv")
                                .withVlans(Arrays.asList("elisdjub", "gbqi", "kxkbsazgakgacyr")),
                            new VlanGroupProperties()
                                .withName("jdmspofapvuhryln")
                                .withVlans(Arrays.asList("rz", "bzjedmstk", "nlvxbcuii"))))
                .withPortGroups(
                    Arrays
                        .asList(
                            new PortGroupProperties()
                                .withName("wfansnvpdi")
                                .withPorts(Arrays.asList("kostbzbki", "buqny", "phzfylsgcrp", "bcunezzceze")),
                            new PortGroupProperties().withName("w").withPorts(Arrays.asList("lwxjwetn"))));
        model = BinaryData.fromObject(model).toObject(CommonDynamicMatchConfiguration.class);
        Assertions.assertEquals("cblembnkbwv", model.ipGroups().get(0).name());
        Assertions.assertEquals(IpAddressType.IPV4, model.ipGroups().get(0).ipAddressType());
        Assertions.assertEquals("ivqiheb", model.ipGroups().get(0).ipPrefixes().get(0));
        Assertions.assertEquals("egizv", model.vlanGroups().get(0).name());
        Assertions.assertEquals("elisdjub", model.vlanGroups().get(0).vlans().get(0));
        Assertions.assertEquals("wfansnvpdi", model.portGroups().get(0).name());
        Assertions.assertEquals("kostbzbki", model.portGroups().get(0).ports().get(0));
    }
}
