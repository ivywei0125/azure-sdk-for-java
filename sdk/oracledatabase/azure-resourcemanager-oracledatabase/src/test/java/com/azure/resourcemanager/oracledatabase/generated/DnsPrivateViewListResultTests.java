// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.models.DnsPrivateViewListResult;
import org.junit.jupiter.api.Assertions;

public final class DnsPrivateViewListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DnsPrivateViewListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"ocid\":\"ulppggdtpnapnyir\",\"displayName\":\"uhpigvp\",\"isProtected\":false,\"lifecycleState\":\"Deleted\",\"self\":\"itxmedjvcslynqww\",\"timeCreated\":\"2021-09-17T17:00:46Z\",\"timeUpdated\":\"2021-06-21T03:07:03Z\",\"provisioningState\":\"Failed\"},\"id\":\"ktrmgucnapkt\",\"name\":\"oellwp\",\"type\":\"fdygpfqbuaceopz\"},{\"properties\":{\"ocid\":\"hhuao\",\"displayName\":\"pcqeqx\",\"isProtected\":false,\"lifecycleState\":\"Deleting\",\"self\":\"zxctobgb\",\"timeCreated\":\"2021-08-02T23:16:03Z\",\"timeUpdated\":\"2021-01-09T02:06:20Z\",\"provisioningState\":\"Succeeded\"},\"id\":\"stmgrcfbunrmfqjh\",\"name\":\"kxbpvj\",\"type\":\"mjh\"},{\"properties\":{\"ocid\":\"yngudivk\",\"displayName\":\"swbxqz\",\"isProtected\":false,\"lifecycleState\":\"Deleting\",\"self\":\"uvjfdxxive\",\"timeCreated\":\"2021-08-28T01:45:57Z\",\"timeUpdated\":\"2021-02-03T22:58:32Z\",\"provisioningState\":\"Failed\"},\"id\":\"doqmcbxvwvxys\",\"name\":\"qbhsfxobl\",\"type\":\"tkblmpewww\"},{\"properties\":{\"ocid\":\"rvrnsvshqjohxc\",\"displayName\":\"bfovasrruvwbhsq\",\"isProtected\":true,\"lifecycleState\":\"Deleting\",\"self\":\"jbi\",\"timeCreated\":\"2021-07-08T11:15:33Z\",\"timeUpdated\":\"2021-09-14T01:07:05Z\",\"provisioningState\":\"Succeeded\"},\"id\":\"fbjfdtwssotftpvj\",\"name\":\"bexilzznfqqnv\",\"type\":\"pmqtaru\"}],\"nextLink\":\"jmkcjhwqytj\"}")
            .toObject(DnsPrivateViewListResult.class);
        Assertions.assertEquals("jmkcjhwqytj", model.nextLink());
    }
}
