// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSapHanaPointInTimeRestoreRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.OverwriteOptions;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.SnapshotRestoreParameters;
import com.azure.resourcemanager.recoveryservicesbackup.models.TargetRestoreInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.UserAssignedIdentityProperties;
import com.azure.resourcemanager.recoveryservicesbackup.models.UserAssignedManagedIdentityDetails;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureWorkloadSapHanaPointInTimeRestoreRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureWorkloadSapHanaPointInTimeRestoreRequest model = BinaryData.fromString(
            "{\"objectType\":\"AzureWorkloadSAPHanaPointInTimeRestoreRequest\",\"pointInTime\":\"2021-11-12T14:00:05Z\",\"recoveryType\":\"AlternateLocation\",\"sourceResourceId\":\"slhhxudbxv\",\"propertyBag\":{\"ud\":\"tnsi\",\"mes\":\"z\"},\"targetInfo\":{\"overwriteOption\":\"Overwrite\",\"containerId\":\"agzrcxfa\",\"databaseName\":\"cfxwmdbox\",\"targetDirectoryForFileRestore\":\"gsftufqobrjlnacg\"},\"recoveryMode\":\"Invalid\",\"targetResourceGroupName\":\"nhxk\",\"userAssignedManagedIdentityDetails\":{\"identityArmId\":\"ytnrzvuljraae\",\"identityName\":\"nok\",\"userAssignedIdentityProperties\":{\"clientId\":\"kkjqnvbroylaxxu\",\"principalId\":\"disdosfjbjsvgj\"}},\"snapshotRestoreParameters\":{\"skipAttachAndMount\":false,\"logPointInTimeForDBRecovery\":\"vyc\"},\"targetVirtualMachineId\":\"dclxgc\",\"resourceGuardOperationRequests\":[\"fnwmbtmvpdvj\"]}")
            .toObject(AzureWorkloadSapHanaPointInTimeRestoreRequest.class);
        Assertions.assertEquals("fnwmbtmvpdvj", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(RecoveryType.ALTERNATE_LOCATION, model.recoveryType());
        Assertions.assertEquals("slhhxudbxv", model.sourceResourceId());
        Assertions.assertEquals("tnsi", model.propertyBag().get("ud"));
        Assertions.assertEquals(OverwriteOptions.OVERWRITE, model.targetInfo().overwriteOption());
        Assertions.assertEquals("agzrcxfa", model.targetInfo().containerId());
        Assertions.assertEquals("cfxwmdbox", model.targetInfo().databaseName());
        Assertions.assertEquals("gsftufqobrjlnacg", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.INVALID, model.recoveryMode());
        Assertions.assertEquals("nhxk", model.targetResourceGroupName());
        Assertions.assertEquals("ytnrzvuljraae", model.userAssignedManagedIdentityDetails().identityArmId());
        Assertions.assertEquals("nok", model.userAssignedManagedIdentityDetails().identityName());
        Assertions.assertEquals("kkjqnvbroylaxxu",
            model.userAssignedManagedIdentityDetails().userAssignedIdentityProperties().clientId());
        Assertions.assertEquals("disdosfjbjsvgj",
            model.userAssignedManagedIdentityDetails().userAssignedIdentityProperties().principalId());
        Assertions.assertEquals(false, model.snapshotRestoreParameters().skipAttachAndMount());
        Assertions.assertEquals("vyc", model.snapshotRestoreParameters().logPointInTimeForDBRecovery());
        Assertions.assertEquals("dclxgc", model.targetVirtualMachineId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-12T14:00:05Z"), model.pointInTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadSapHanaPointInTimeRestoreRequest model = new AzureWorkloadSapHanaPointInTimeRestoreRequest()
            .withResourceGuardOperationRequests(Arrays.asList("fnwmbtmvpdvj"))
            .withRecoveryType(RecoveryType.ALTERNATE_LOCATION)
            .withSourceResourceId("slhhxudbxv")
            .withPropertyBag(mapOf("ud", "tnsi", "mes", "z"))
            .withTargetInfo(new TargetRestoreInfo().withOverwriteOption(OverwriteOptions.OVERWRITE)
                .withContainerId("agzrcxfa")
                .withDatabaseName("cfxwmdbox")
                .withTargetDirectoryForFileRestore("gsftufqobrjlnacg"))
            .withRecoveryMode(RecoveryMode.INVALID)
            .withTargetResourceGroupName("nhxk")
            .withUserAssignedManagedIdentityDetails(new UserAssignedManagedIdentityDetails()
                .withIdentityArmId("ytnrzvuljraae")
                .withIdentityName("nok")
                .withUserAssignedIdentityProperties(new UserAssignedIdentityProperties().withClientId("kkjqnvbroylaxxu")
                    .withPrincipalId("disdosfjbjsvgj")))
            .withSnapshotRestoreParameters(
                new SnapshotRestoreParameters().withSkipAttachAndMount(false).withLogPointInTimeForDBRecovery("vyc"))
            .withTargetVirtualMachineId("dclxgc")
            .withPointInTime(OffsetDateTime.parse("2021-11-12T14:00:05Z"));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSapHanaPointInTimeRestoreRequest.class);
        Assertions.assertEquals("fnwmbtmvpdvj", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(RecoveryType.ALTERNATE_LOCATION, model.recoveryType());
        Assertions.assertEquals("slhhxudbxv", model.sourceResourceId());
        Assertions.assertEquals("tnsi", model.propertyBag().get("ud"));
        Assertions.assertEquals(OverwriteOptions.OVERWRITE, model.targetInfo().overwriteOption());
        Assertions.assertEquals("agzrcxfa", model.targetInfo().containerId());
        Assertions.assertEquals("cfxwmdbox", model.targetInfo().databaseName());
        Assertions.assertEquals("gsftufqobrjlnacg", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.INVALID, model.recoveryMode());
        Assertions.assertEquals("nhxk", model.targetResourceGroupName());
        Assertions.assertEquals("ytnrzvuljraae", model.userAssignedManagedIdentityDetails().identityArmId());
        Assertions.assertEquals("nok", model.userAssignedManagedIdentityDetails().identityName());
        Assertions.assertEquals("kkjqnvbroylaxxu",
            model.userAssignedManagedIdentityDetails().userAssignedIdentityProperties().clientId());
        Assertions.assertEquals("disdosfjbjsvgj",
            model.userAssignedManagedIdentityDetails().userAssignedIdentityProperties().principalId());
        Assertions.assertEquals(false, model.snapshotRestoreParameters().skipAttachAndMount());
        Assertions.assertEquals("vyc", model.snapshotRestoreParameters().logPointInTimeForDBRecovery());
        Assertions.assertEquals("dclxgc", model.targetVirtualMachineId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-12T14:00:05Z"), model.pointInTime());
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
