// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storageactions.models.IfCondition;
import com.azure.resourcemanager.storageactions.models.OnFailure;
import com.azure.resourcemanager.storageactions.models.OnSuccess;
import com.azure.resourcemanager.storageactions.models.StorageTaskOperation;
import com.azure.resourcemanager.storageactions.models.StorageTaskOperationName;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IfConditionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IfCondition model = BinaryData.fromString(
            "{\"condition\":\"nteiwaopv\",\"operations\":[{\"name\":\"UndeleteBlob\",\"parameters\":{\"uf\":\"mmxdcu\"},\"onSuccess\":\"continue\",\"onFailure\":\"break\"},{\"name\":\"SetBlobTier\",\"parameters\":{\"xtbzsgfyccsne\":\"nsez\",\"flnrosfqpteehzz\":\"mdwzjeiachboo\",\"swjdkirso\":\"ypyqrimzinp\"},\"onSuccess\":\"continue\",\"onFailure\":\"break\"},{\"name\":\"UndeleteBlob\",\"parameters\":{\"kwh\":\"nohjt\"},\"onSuccess\":\"continue\",\"onFailure\":\"break\"},{\"name\":\"DeleteBlob\",\"parameters\":{\"jxvsnbyxqabn\":\"pjxsqwpgrjbznor\"},\"onSuccess\":\"continue\",\"onFailure\":\"break\"}]}")
            .toObject(IfCondition.class);
        Assertions.assertEquals("nteiwaopv", model.condition());
        Assertions.assertEquals(StorageTaskOperationName.UNDELETE_BLOB, model.operations().get(0).name());
        Assertions.assertEquals("mmxdcu", model.operations().get(0).parameters().get("uf"));
        Assertions.assertEquals(OnSuccess.CONTINUE, model.operations().get(0).onSuccess());
        Assertions.assertEquals(OnFailure.BREAK, model.operations().get(0).onFailure());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IfCondition model = new IfCondition().withCondition("nteiwaopv")
            .withOperations(Arrays.asList(new StorageTaskOperation().withName(StorageTaskOperationName.UNDELETE_BLOB)
                .withParameters(mapOf("uf", "mmxdcu")).withOnSuccess(OnSuccess.CONTINUE).withOnFailure(OnFailure.BREAK),
                new StorageTaskOperation().withName(StorageTaskOperationName.SET_BLOB_TIER)
                    .withParameters(
                        mapOf("xtbzsgfyccsne", "nsez", "flnrosfqpteehzz", "mdwzjeiachboo", "swjdkirso", "ypyqrimzinp"))
                    .withOnSuccess(OnSuccess.CONTINUE).withOnFailure(OnFailure.BREAK),
                new StorageTaskOperation().withName(StorageTaskOperationName.UNDELETE_BLOB)
                    .withParameters(mapOf("kwh", "nohjt")).withOnSuccess(OnSuccess.CONTINUE)
                    .withOnFailure(OnFailure.BREAK),
                new StorageTaskOperation().withName(StorageTaskOperationName.DELETE_BLOB)
                    .withParameters(mapOf("jxvsnbyxqabn", "pjxsqwpgrjbznor")).withOnSuccess(OnSuccess.CONTINUE)
                    .withOnFailure(OnFailure.BREAK)));
        model = BinaryData.fromObject(model).toObject(IfCondition.class);
        Assertions.assertEquals("nteiwaopv", model.condition());
        Assertions.assertEquals(StorageTaskOperationName.UNDELETE_BLOB, model.operations().get(0).name());
        Assertions.assertEquals("mmxdcu", model.operations().get(0).parameters().get("uf"));
        Assertions.assertEquals(OnSuccess.CONTINUE, model.operations().get(0).onSuccess());
        Assertions.assertEquals(OnFailure.BREAK, model.operations().get(0).onFailure());
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
