// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.VpnGatewayNatRuleInner;
import com.azure.resourcemanager.network.models.VpnNatRuleMapping;
import com.azure.resourcemanager.network.models.VpnNatRuleMode;
import com.azure.resourcemanager.network.models.VpnNatRuleType;
import java.util.Arrays;

/**
 * Samples for NatRules CreateOrUpdate.
 */
public final class NatRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/NatRulePut.json
     */
    /**
     * Sample code: NatRulePut.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void natRulePut(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getNatRules()
            .createOrUpdate("rg1", "gateway1", "natRule1", new VpnGatewayNatRuleInner()
                .withTypePropertiesType(VpnNatRuleType.STATIC)
                .withMode(VpnNatRuleMode.EGRESS_SNAT)
                .withInternalMappings(Arrays.asList(new VpnNatRuleMapping().withAddressSpace("10.4.0.0/24")))
                .withExternalMappings(Arrays.asList(new VpnNatRuleMapping().withAddressSpace("192.168.21.0/24")))
                .withIpConfigurationId(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworkGateways/cloudnet1-VNG/ipConfigurations/default"),
                com.azure.core.util.Context.NONE);
    }
}
