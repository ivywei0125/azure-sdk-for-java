// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.resourcemanager.networkcloud.models.AdministratorConfiguration;
import com.azure.resourcemanager.networkcloud.models.AgentOptions;
import com.azure.resourcemanager.networkcloud.models.AgentPoolMode;
import com.azure.resourcemanager.networkcloud.models.AgentPoolUpgradeSettings;
import com.azure.resourcemanager.networkcloud.models.AttachedNetworkConfiguration;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.HugepagesSize;
import com.azure.resourcemanager.networkcloud.models.KubernetesLabel;
import com.azure.resourcemanager.networkcloud.models.KubernetesPluginType;
import com.azure.resourcemanager.networkcloud.models.L2NetworkAttachmentConfiguration;
import com.azure.resourcemanager.networkcloud.models.L3NetworkAttachmentConfiguration;
import com.azure.resourcemanager.networkcloud.models.L3NetworkConfigurationIpamEnabled;
import com.azure.resourcemanager.networkcloud.models.SshPublicKey;
import com.azure.resourcemanager.networkcloud.models.TrunkedNetworkAttachmentConfiguration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for AgentPools CreateOrUpdate. */
public final class AgentPoolsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2023-05-01-preview/examples/AgentPools_Create.json
     */
    /**
     * Sample code: Create or update Kubernetes cluster agent pool.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void createOrUpdateKubernetesClusterAgentPool(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .agentPools()
            .define("agentPoolName")
            .withRegion("location")
            .withExistingKubernetesCluster("resourceGroupName", "kubernetesClusterName")
            .withCount(3L)
            .withMode(AgentPoolMode.SYSTEM)
            .withVmSkuName("NC_M16_v1")
            .withTags(mapOf("key1", "myvalue1", "key2", "myvalue2"))
            .withExtendedLocation(
                new ExtendedLocation()
                    .withName(
                        "/subscriptions/123e4567-e89b-12d3-a456-426655440000/resourceGroups/resourceGroupName/providers/Microsoft.ExtendedLocation/customLocations/clusterExtendedLocationName")
                    .withType("CustomLocation"))
            .withAdministratorConfiguration(
                new AdministratorConfiguration()
                    .withAdminUsername("azure")
                    .withSshPublicKeys(Arrays.asList(new SshPublicKey().withKeyData("fakeTokenPlaceholder"))))
            .withAgentOptions(new AgentOptions().withHugepagesCount(96L).withHugepagesSize(HugepagesSize.ONEG))
            .withAttachedNetworkConfiguration(
                new AttachedNetworkConfiguration()
                    .withL2Networks(
                        Arrays
                            .asList(
                                new L2NetworkAttachmentConfiguration()
                                    .withNetworkId(
                                        "/subscriptions/123e4567-e89b-12d3-a456-426655440000/resourceGroups/resourceGroupName/providers/Microsoft.NetworkCloud/l2Networks/l2NetworkName")
                                    .withPluginType(KubernetesPluginType.DPDK)))
                    .withL3Networks(
                        Arrays
                            .asList(
                                new L3NetworkAttachmentConfiguration()
                                    .withIpamEnabled(L3NetworkConfigurationIpamEnabled.FALSE)
                                    .withNetworkId(
                                        "/subscriptions/123e4567-e89b-12d3-a456-426655440000/resourceGroups/resourceGroupName/providers/Microsoft.NetworkCloud/l3Networks/l3NetworkName")
                                    .withPluginType(KubernetesPluginType.SRIOV)))
                    .withTrunkedNetworks(
                        Arrays
                            .asList(
                                new TrunkedNetworkAttachmentConfiguration()
                                    .withNetworkId(
                                        "/subscriptions/123e4567-e89b-12d3-a456-426655440000/resourceGroups/resourceGroupName/providers/Microsoft.NetworkCloud/trunkedNetworks/trunkedNetworkName")
                                    .withPluginType(KubernetesPluginType.MACVLAN))))
            .withAvailabilityZones(Arrays.asList("1", "2", "3"))
            .withLabels(Arrays.asList(new KubernetesLabel().withKey("fakeTokenPlaceholder").withValue("true")))
            .withTaints(Arrays.asList(new KubernetesLabel().withKey("fakeTokenPlaceholder").withValue("true")))
            .withUpgradeSettings(new AgentPoolUpgradeSettings().withMaxSurge("1"))
            .create();
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
