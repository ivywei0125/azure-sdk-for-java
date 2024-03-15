// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderForServersAwsOffering;
import com.azure.resourcemanager.security.models.DefenderForServersAwsOfferingArcAutoProvisioning;
import com.azure.resourcemanager.security.models.DefenderForServersAwsOfferingArcAutoProvisioningConfiguration;
import com.azure.resourcemanager.security.models.DefenderForServersAwsOfferingDefenderForServers;
import com.azure.resourcemanager.security.models.DefenderForServersAwsOfferingMdeAutoProvisioning;
import com.azure.resourcemanager.security.models.DefenderForServersAwsOfferingSubPlan;
import com.azure.resourcemanager.security.models.DefenderForServersAwsOfferingVaAutoProvisioning;
import com.azure.resourcemanager.security.models.DefenderForServersAwsOfferingVaAutoProvisioningConfiguration;
import com.azure.resourcemanager.security.models.DefenderForServersAwsOfferingVmScanners;
import com.azure.resourcemanager.security.models.DefenderForServersAwsOfferingVmScannersConfiguration;
import com.azure.resourcemanager.security.models.ScanningMode;
import com.azure.resourcemanager.security.models.SubPlan;
import com.azure.resourcemanager.security.models.Type;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DefenderForServersAwsOfferingTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderForServersAwsOffering model = BinaryData.fromString(
            "{\"offeringType\":\"DefenderForServersAws\",\"defenderForServers\":{\"cloudRoleArn\":\"ahneaoovtyjzt\"},\"arcAutoProvisioning\":{\"enabled\":true,\"cloudRoleArn\":\"lofzekfsrmaukl\",\"configuration\":{\"proxy\":\"cfocz\",\"privateLinkScope\":\"pejovt\"}},\"vaAutoProvisioning\":{\"enabled\":true,\"configuration\":{\"type\":\"TVM\"}},\"mdeAutoProvisioning\":{\"enabled\":false,\"configuration\":\"datarzaaoee\"},\"subPlan\":{\"type\":\"P2\"},\"vmScanners\":{\"enabled\":false,\"configuration\":{\"cloudRoleArn\":\"at\",\"scanningMode\":\"Default\",\"exclusionTags\":{\"n\":\"rxoxdjxl\",\"dolrndw\":\"ryyinz\"}}},\"description\":\"vxvzaledoyqxlun\"}")
            .toObject(DefenderForServersAwsOffering.class);
        Assertions.assertEquals("ahneaoovtyjzt", model.defenderForServers().cloudRoleArn());
        Assertions.assertEquals(true, model.arcAutoProvisioning().enabled());
        Assertions.assertEquals("lofzekfsrmaukl", model.arcAutoProvisioning().cloudRoleArn());
        Assertions.assertEquals("cfocz", model.arcAutoProvisioning().configuration().proxy());
        Assertions.assertEquals("pejovt", model.arcAutoProvisioning().configuration().privateLinkScope());
        Assertions.assertEquals(true, model.vaAutoProvisioning().enabled());
        Assertions.assertEquals(Type.TVM, model.vaAutoProvisioning().configuration().type());
        Assertions.assertEquals(false, model.mdeAutoProvisioning().enabled());
        Assertions.assertEquals(SubPlan.P2, model.subPlan().type());
        Assertions.assertEquals(false, model.vmScanners().enabled());
        Assertions.assertEquals("at", model.vmScanners().configuration().cloudRoleArn());
        Assertions.assertEquals(ScanningMode.DEFAULT, model.vmScanners().configuration().scanningMode());
        Assertions.assertEquals("rxoxdjxl", model.vmScanners().configuration().exclusionTags().get("n"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderForServersAwsOffering model = new DefenderForServersAwsOffering()
            .withDefenderForServers(
                new DefenderForServersAwsOfferingDefenderForServers().withCloudRoleArn("ahneaoovtyjzt"))
            .withArcAutoProvisioning(new DefenderForServersAwsOfferingArcAutoProvisioning().withEnabled(true)
                .withCloudRoleArn("lofzekfsrmaukl")
                .withConfiguration(new DefenderForServersAwsOfferingArcAutoProvisioningConfiguration()
                    .withProxy("cfocz").withPrivateLinkScope("pejovt")))
            .withVaAutoProvisioning(
                new DefenderForServersAwsOfferingVaAutoProvisioning().withEnabled(true).withConfiguration(
                    new DefenderForServersAwsOfferingVaAutoProvisioningConfiguration().withType(Type.TVM)))
            .withMdeAutoProvisioning(new DefenderForServersAwsOfferingMdeAutoProvisioning().withEnabled(false)
                .withConfiguration("datarzaaoee"))
            .withSubPlan(new DefenderForServersAwsOfferingSubPlan().withType(SubPlan.P2))
            .withVmScanners(new DefenderForServersAwsOfferingVmScanners().withEnabled(false)
                .withConfiguration(new DefenderForServersAwsOfferingVmScannersConfiguration().withCloudRoleArn("at")
                    .withScanningMode(ScanningMode.DEFAULT)
                    .withExclusionTags(mapOf("n", "rxoxdjxl", "dolrndw", "ryyinz"))));
        model = BinaryData.fromObject(model).toObject(DefenderForServersAwsOffering.class);
        Assertions.assertEquals("ahneaoovtyjzt", model.defenderForServers().cloudRoleArn());
        Assertions.assertEquals(true, model.arcAutoProvisioning().enabled());
        Assertions.assertEquals("lofzekfsrmaukl", model.arcAutoProvisioning().cloudRoleArn());
        Assertions.assertEquals("cfocz", model.arcAutoProvisioning().configuration().proxy());
        Assertions.assertEquals("pejovt", model.arcAutoProvisioning().configuration().privateLinkScope());
        Assertions.assertEquals(true, model.vaAutoProvisioning().enabled());
        Assertions.assertEquals(Type.TVM, model.vaAutoProvisioning().configuration().type());
        Assertions.assertEquals(false, model.mdeAutoProvisioning().enabled());
        Assertions.assertEquals(SubPlan.P2, model.subPlan().type());
        Assertions.assertEquals(false, model.vmScanners().enabled());
        Assertions.assertEquals("at", model.vmScanners().configuration().cloudRoleArn());
        Assertions.assertEquals(ScanningMode.DEFAULT, model.vmScanners().configuration().scanningMode());
        Assertions.assertEquals("rxoxdjxl", model.vmScanners().configuration().exclusionTags().get("n"));
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
