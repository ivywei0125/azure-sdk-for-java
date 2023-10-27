// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.selfhelp.models.ContinueRequestBody;
import com.azure.resourcemanager.selfhelp.models.QuestionType;
import com.azure.resourcemanager.selfhelp.models.TroubleshooterResponse;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ContinueRequestBodyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContinueRequestBody model =
            BinaryData
                .fromString(
                    "{\"stepId\":\"ofyyvoqacpi\",\"responses\":[{\"questionId\":\"tg\",\"questionType\":\"TextInput\",\"response\":\"oenwashr\"}]}")
                .toObject(ContinueRequestBody.class);
        Assertions.assertEquals("ofyyvoqacpi", model.stepId());
        Assertions.assertEquals("tg", model.responses().get(0).questionId());
        Assertions.assertEquals(QuestionType.TEXT_INPUT, model.responses().get(0).questionType());
        Assertions.assertEquals("oenwashr", model.responses().get(0).response());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContinueRequestBody model =
            new ContinueRequestBody()
                .withStepId("ofyyvoqacpi")
                .withResponses(
                    Arrays
                        .asList(
                            new TroubleshooterResponse()
                                .withQuestionId("tg")
                                .withQuestionType(QuestionType.TEXT_INPUT)
                                .withResponse("oenwashr")));
        model = BinaryData.fromObject(model).toObject(ContinueRequestBody.class);
        Assertions.assertEquals("ofyyvoqacpi", model.stepId());
        Assertions.assertEquals("tg", model.responses().get(0).questionId());
        Assertions.assertEquals(QuestionType.TEXT_INPUT, model.responses().get(0).questionType());
        Assertions.assertEquals("oenwashr", model.responses().get(0).response());
    }
}
