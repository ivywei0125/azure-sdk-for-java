// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storageactions.fluent.models.StorageTaskInner;
import com.azure.resourcemanager.storageactions.models.ElseCondition;
import com.azure.resourcemanager.storageactions.models.IfCondition;
import com.azure.resourcemanager.storageactions.models.ManagedServiceIdentity;
import com.azure.resourcemanager.storageactions.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.storageactions.models.OnFailure;
import com.azure.resourcemanager.storageactions.models.OnSuccess;
import com.azure.resourcemanager.storageactions.models.StorageTaskAction;
import com.azure.resourcemanager.storageactions.models.StorageTaskOperation;
import com.azure.resourcemanager.storageactions.models.StorageTaskOperationName;
import com.azure.resourcemanager.storageactions.models.StorageTaskProperties;
import com.azure.resourcemanager.storageactions.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class StorageTaskInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageTaskInner model = BinaryData.fromString(
            "{\"identity\":{\"principalId\":\"83e808b7-a5bb-4ef8-a32b-f52fe6ced0ed\",\"tenantId\":\"c81a3be9-9282-4f3a-aa0c-95ae338b9393\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"hab\":{\"principalId\":\"ad933690-5ed8-40f7-b652-331cf3feabe7\",\"clientId\":\"5cb20f5d-ec49-4423-be2d-2f29f4987496\"}}},\"properties\":{\"taskVersion\":4747702920878176636,\"enabled\":true,\"description\":\"wczbys\",\"action\":{\"if\":{\"condition\":\"npqxuh\",\"operations\":[{\"name\":\"UndeleteBlob\",\"parameters\":{\"tfwvukxgaudc\":\"iwbybrkxvdumjg\"},\"onSuccess\":\"continue\",\"onFailure\":\"break\"}]},\"else\":{\"operations\":[{\"name\":\"SetBlobTags\",\"parameters\":{\"kryhtnapczwlokj\":\"j\",\"jnchgej\":\"emkkvnipjox\"},\"onSuccess\":\"continue\",\"onFailure\":\"break\"},{\"name\":\"SetBlobTier\",\"parameters\":{\"o\":\"zyde\",\"wixjsprozvcp\":\"wyahuxinpmqnja\",\"atscmd\":\"tegjvwmf\",\"zkrwfn\":\"pjhulsuuvmkj\"},\"onSuccess\":\"continue\",\"onFailure\":\"break\"},{\"name\":\"DeleteBlob\",\"parameters\":{\"jdpvwryo\":\"w\",\"hbcryffdfdosyge\":\"psoacctazakljl\"},\"onSuccess\":\"continue\",\"onFailure\":\"break\"},{\"name\":\"SetBlobTags\",\"parameters\":{\"vdphlxaolthqtr\":\"msbzjhcrz\",\"gvfcj\":\"qjbpfzfsin\",\"xjtfelluwfzit\":\"wzo\",\"qfpjk\":\"np\"},\"onSuccess\":\"continue\",\"onFailure\":\"break\"}]}},\"provisioningState\":\"ValidateSubscriptionQuotaEnd\",\"creationTimeInUtc\":\"2021-11-04T07:17:51Z\"},\"location\":\"fxxypininmayhuy\",\"tags\":{\"inuvamiheogn\":\"podepoo\",\"usivye\":\"rxzxtheo\"},\"id\":\"cciqihnhungbwjz\",\"name\":\"nfygxgispemvtz\",\"type\":\"kufubljo\"}")
            .toObject(StorageTaskInner.class);
        Assertions.assertEquals("fxxypininmayhuy", model.location());
        Assertions.assertEquals("podepoo", model.tags().get("inuvamiheogn"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals(true, model.properties().enabled());
        Assertions.assertEquals("wczbys", model.properties().description());
        Assertions.assertEquals("npqxuh", model.properties().action().ifProperty().condition());
        Assertions.assertEquals(StorageTaskOperationName.UNDELETE_BLOB,
            model.properties().action().ifProperty().operations().get(0).name());
        Assertions.assertEquals("iwbybrkxvdumjg",
            model.properties().action().ifProperty().operations().get(0).parameters().get("tfwvukxgaudc"));
        Assertions.assertEquals(OnSuccess.CONTINUE,
            model.properties().action().ifProperty().operations().get(0).onSuccess());
        Assertions.assertEquals(OnFailure.BREAK,
            model.properties().action().ifProperty().operations().get(0).onFailure());
        Assertions.assertEquals(StorageTaskOperationName.SET_BLOB_TAGS,
            model.properties().action().elseProperty().operations().get(0).name());
        Assertions.assertEquals("j",
            model.properties().action().elseProperty().operations().get(0).parameters().get("kryhtnapczwlokj"));
        Assertions.assertEquals(OnSuccess.CONTINUE,
            model.properties().action().elseProperty().operations().get(0).onSuccess());
        Assertions.assertEquals(OnFailure.BREAK,
            model.properties().action().elseProperty().operations().get(0).onFailure());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageTaskInner model
            = new StorageTaskInner().withLocation("fxxypininmayhuy")
                .withTags(
                    mapOf("inuvamiheogn", "podepoo", "usivye", "rxzxtheo"))
                .withIdentity(
                    new ManagedServiceIdentity()
                        .withType(ManagedServiceIdentityType.USER_ASSIGNED).withUserAssignedIdentities(
                            mapOf("hab", new UserAssignedIdentity())))
                .withProperties(new StorageTaskProperties().withEnabled(true).withDescription("wczbys")
                    .withAction(new StorageTaskAction()
                        .withIfProperty(new IfCondition().withCondition("npqxuh").withOperations(
                            Arrays.asList(new StorageTaskOperation().withName(StorageTaskOperationName.UNDELETE_BLOB)
                                .withParameters(mapOf("tfwvukxgaudc", "iwbybrkxvdumjg"))
                                .withOnSuccess(OnSuccess.CONTINUE).withOnFailure(OnFailure.BREAK))))
                        .withElseProperty(new ElseCondition().withOperations(Arrays.asList(
                            new StorageTaskOperation().withName(StorageTaskOperationName.SET_BLOB_TAGS)
                                .withParameters(mapOf("kryhtnapczwlokj", "j", "jnchgej", "emkkvnipjox"))
                                .withOnSuccess(OnSuccess.CONTINUE).withOnFailure(OnFailure.BREAK),
                            new StorageTaskOperation().withName(StorageTaskOperationName.SET_BLOB_TIER)
                                .withParameters(mapOf("o", "zyde", "wixjsprozvcp", "wyahuxinpmqnja", "atscmd",
                                    "tegjvwmf", "zkrwfn", "pjhulsuuvmkj"))
                                .withOnSuccess(OnSuccess.CONTINUE).withOnFailure(OnFailure.BREAK),
                            new StorageTaskOperation().withName(StorageTaskOperationName.DELETE_BLOB)
                                .withParameters(mapOf("jdpvwryo", "w", "hbcryffdfdosyge", "psoacctazakljl"))
                                .withOnSuccess(OnSuccess.CONTINUE).withOnFailure(OnFailure.BREAK),
                            new StorageTaskOperation().withName(StorageTaskOperationName.SET_BLOB_TAGS)
                                .withParameters(mapOf("vdphlxaolthqtr", "msbzjhcrz", "gvfcj", "qjbpfzfsin",
                                    "xjtfelluwfzit", "wzo", "qfpjk", "np"))
                                .withOnSuccess(OnSuccess.CONTINUE).withOnFailure(OnFailure.BREAK))))));
        model = BinaryData.fromObject(model).toObject(StorageTaskInner.class);
        Assertions.assertEquals("fxxypininmayhuy", model.location());
        Assertions.assertEquals("podepoo", model.tags().get("inuvamiheogn"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals(true, model.properties().enabled());
        Assertions.assertEquals("wczbys", model.properties().description());
        Assertions.assertEquals("npqxuh", model.properties().action().ifProperty().condition());
        Assertions.assertEquals(StorageTaskOperationName.UNDELETE_BLOB,
            model.properties().action().ifProperty().operations().get(0).name());
        Assertions.assertEquals("iwbybrkxvdumjg",
            model.properties().action().ifProperty().operations().get(0).parameters().get("tfwvukxgaudc"));
        Assertions.assertEquals(OnSuccess.CONTINUE,
            model.properties().action().ifProperty().operations().get(0).onSuccess());
        Assertions.assertEquals(OnFailure.BREAK,
            model.properties().action().ifProperty().operations().get(0).onFailure());
        Assertions.assertEquals(StorageTaskOperationName.SET_BLOB_TAGS,
            model.properties().action().elseProperty().operations().get(0).name());
        Assertions.assertEquals("j",
            model.properties().action().elseProperty().operations().get(0).parameters().get("kryhtnapczwlokj"));
        Assertions.assertEquals(OnSuccess.CONTINUE,
            model.properties().action().elseProperty().operations().get(0).onSuccess());
        Assertions.assertEquals(OnFailure.BREAK,
            model.properties().action().elseProperty().operations().get(0).onFailure());
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
