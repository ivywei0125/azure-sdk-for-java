// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Operation;
import org.junit.jupiter.api.Assertions;

public final class OperationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Operation model =
            BinaryData
                .fromString(
                    "{\"name\":\"tdwkqbrq\",\"display\":{\"provider\":\"axhexiilivp\",\"resource\":\"iirqtd\",\"operation\":\"axoruzfgsquy\",\"description\":\"rxxle\"},\"isDataAction\":true,\"origin\":\"user\",\"properties\":{\"wnwxuqlcvyd\":\"dataezw\",\"ebwnujhe\":\"datapatdooaojkniodko\"}}")
                .toObject(Operation.class);
        Assertions.assertEquals(true, model.isDataAction());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Operation model = new Operation().withIsDataAction(true);
        model = BinaryData.fromObject(model).toObject(Operation.class);
        Assertions.assertEquals(true, model.isDataAction());
    }
}
