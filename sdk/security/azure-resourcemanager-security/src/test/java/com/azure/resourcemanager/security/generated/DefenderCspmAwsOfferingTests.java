// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderCspmAwsOffering;
import com.azure.resourcemanager.security.models.DefenderCspmAwsOfferingCiem;
import com.azure.resourcemanager.security.models.DefenderCspmAwsOfferingCiemDiscovery;
import com.azure.resourcemanager.security.models.DefenderCspmAwsOfferingCiemOidc;
import com.azure.resourcemanager.security.models.DefenderCspmAwsOfferingDataSensitivityDiscovery;
import com.azure.resourcemanager.security.models.DefenderCspmAwsOfferingDatabasesDspm;
import com.azure.resourcemanager.security.models.DefenderCspmAwsOfferingMdcContainersAgentlessDiscoveryK8S;
import com.azure.resourcemanager.security.models.DefenderCspmAwsOfferingMdcContainersImageAssessment;
import com.azure.resourcemanager.security.models.DefenderCspmAwsOfferingVmScanners;
import com.azure.resourcemanager.security.models.DefenderCspmAwsOfferingVmScannersConfiguration;
import com.azure.resourcemanager.security.models.ScanningMode;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DefenderCspmAwsOfferingTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderCspmAwsOffering model = BinaryData.fromString(
            "{\"offeringType\":\"DefenderCspmAws\",\"vmScanners\":{\"enabled\":false,\"configuration\":{\"cloudRoleArn\":\"tgawphnskiv\",\"scanningMode\":\"Default\",\"exclusionTags\":{\"qbdiuycsbskowkr\":\"cumecsaaqg\",\"owiuasfgq\":\"hzhrbkhtm\"}}},\"dataSensitivityDiscovery\":{\"enabled\":true,\"cloudRoleArn\":\"faimqvdruozk\"},\"databasesDspm\":{\"enabled\":false,\"cloudRoleArn\":\"oehgfmqmskkixvlz\"},\"ciem\":{\"ciemDiscovery\":{\"cloudRoleArn\":\"hpevasynt\"},\"ciemOidc\":{\"cloudRoleArn\":\"yielb\",\"azureActiveDirectoryAppName\":\"vvbq\"}},\"mdcContainersImageAssessment\":{\"enabled\":false,\"cloudRoleArn\":\"ecqxgiqasifubns\"},\"mdcContainersAgentlessDiscoveryK8s\":{\"enabled\":true,\"cloudRoleArn\":\"wqpjnxjkhtupsvy\"},\"description\":\"weuiyx\"}")
            .toObject(DefenderCspmAwsOffering.class);
        Assertions.assertEquals(false, model.vmScanners().enabled());
        Assertions.assertEquals("tgawphnskiv", model.vmScanners().configuration().cloudRoleArn());
        Assertions.assertEquals(ScanningMode.DEFAULT, model.vmScanners().configuration().scanningMode());
        Assertions.assertEquals("cumecsaaqg",
            model.vmScanners().configuration().exclusionTags().get("qbdiuycsbskowkr"));
        Assertions.assertEquals(true, model.dataSensitivityDiscovery().enabled());
        Assertions.assertEquals("faimqvdruozk", model.dataSensitivityDiscovery().cloudRoleArn());
        Assertions.assertEquals(false, model.databasesDspm().enabled());
        Assertions.assertEquals("oehgfmqmskkixvlz", model.databasesDspm().cloudRoleArn());
        Assertions.assertEquals("hpevasynt", model.ciem().ciemDiscovery().cloudRoleArn());
        Assertions.assertEquals("yielb", model.ciem().ciemOidc().cloudRoleArn());
        Assertions.assertEquals("vvbq", model.ciem().ciemOidc().azureActiveDirectoryAppName());
        Assertions.assertEquals(false, model.mdcContainersImageAssessment().enabled());
        Assertions.assertEquals("ecqxgiqasifubns", model.mdcContainersImageAssessment().cloudRoleArn());
        Assertions.assertEquals(true, model.mdcContainersAgentlessDiscoveryK8S().enabled());
        Assertions.assertEquals("wqpjnxjkhtupsvy", model.mdcContainersAgentlessDiscoveryK8S().cloudRoleArn());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderCspmAwsOffering model = new DefenderCspmAwsOffering()
            .withVmScanners(new DefenderCspmAwsOfferingVmScanners().withEnabled(false)
                .withConfiguration(new DefenderCspmAwsOfferingVmScannersConfiguration().withCloudRoleArn("tgawphnskiv")
                    .withScanningMode(ScanningMode.DEFAULT)
                    .withExclusionTags(mapOf("qbdiuycsbskowkr", "cumecsaaqg", "owiuasfgq", "hzhrbkhtm"))))
            .withDataSensitivityDiscovery(new DefenderCspmAwsOfferingDataSensitivityDiscovery().withEnabled(true)
                .withCloudRoleArn("faimqvdruozk"))
            .withDatabasesDspm(
                new DefenderCspmAwsOfferingDatabasesDspm().withEnabled(false).withCloudRoleArn("oehgfmqmskkixvlz"))
            .withCiem(new DefenderCspmAwsOfferingCiem()
                .withCiemDiscovery(new DefenderCspmAwsOfferingCiemDiscovery().withCloudRoleArn("hpevasynt"))
                .withCiemOidc(new DefenderCspmAwsOfferingCiemOidc().withCloudRoleArn("yielb")
                    .withAzureActiveDirectoryAppName("vvbq")))
            .withMdcContainersImageAssessment(new DefenderCspmAwsOfferingMdcContainersImageAssessment()
                .withEnabled(false).withCloudRoleArn("ecqxgiqasifubns"))
            .withMdcContainersAgentlessDiscoveryK8S(new DefenderCspmAwsOfferingMdcContainersAgentlessDiscoveryK8S()
                .withEnabled(true).withCloudRoleArn("wqpjnxjkhtupsvy"));
        model = BinaryData.fromObject(model).toObject(DefenderCspmAwsOffering.class);
        Assertions.assertEquals(false, model.vmScanners().enabled());
        Assertions.assertEquals("tgawphnskiv", model.vmScanners().configuration().cloudRoleArn());
        Assertions.assertEquals(ScanningMode.DEFAULT, model.vmScanners().configuration().scanningMode());
        Assertions.assertEquals("cumecsaaqg",
            model.vmScanners().configuration().exclusionTags().get("qbdiuycsbskowkr"));
        Assertions.assertEquals(true, model.dataSensitivityDiscovery().enabled());
        Assertions.assertEquals("faimqvdruozk", model.dataSensitivityDiscovery().cloudRoleArn());
        Assertions.assertEquals(false, model.databasesDspm().enabled());
        Assertions.assertEquals("oehgfmqmskkixvlz", model.databasesDspm().cloudRoleArn());
        Assertions.assertEquals("hpevasynt", model.ciem().ciemDiscovery().cloudRoleArn());
        Assertions.assertEquals("yielb", model.ciem().ciemOidc().cloudRoleArn());
        Assertions.assertEquals("vvbq", model.ciem().ciemOidc().azureActiveDirectoryAppName());
        Assertions.assertEquals(false, model.mdcContainersImageAssessment().enabled());
        Assertions.assertEquals("ecqxgiqasifubns", model.mdcContainersImageAssessment().cloudRoleArn());
        Assertions.assertEquals(true, model.mdcContainersAgentlessDiscoveryK8S().enabled());
        Assertions.assertEquals("wqpjnxjkhtupsvy", model.mdcContainersAgentlessDiscoveryK8S().cloudRoleArn());
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
