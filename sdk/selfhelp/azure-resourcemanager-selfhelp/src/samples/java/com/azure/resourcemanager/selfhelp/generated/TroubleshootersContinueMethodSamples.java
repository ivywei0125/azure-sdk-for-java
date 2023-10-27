// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

import com.azure.resourcemanager.selfhelp.models.ContinueRequestBody;
import com.azure.resourcemanager.selfhelp.models.QuestionType;
import com.azure.resourcemanager.selfhelp.models.TroubleshooterResponse;
import java.util.Arrays;

/** Samples for Troubleshooters ContinueMethod. */
public final class TroubleshootersContinueMethodSamples {
    /*
     * x-ms-original-file: specification/help/resource-manager/Microsoft.Help/preview/2023-09-01-preview/examples/Troubleshooter_Continue.json
     */
    /**
     * Sample code: Troubleshooter_Continue.
     *
     * @param manager Entry point to SelfHelpManager.
     */
    public static void troubleshooterContinue(com.azure.resourcemanager.selfhelp.SelfHelpManager manager) {
        manager
            .troubleshooters()
            .continueMethodWithResponse(
                "subscriptions/mySubscription/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-rp",
                "abf168ed-1b54-454a-86f6-e4b62253d3b1",
                new ContinueRequestBody()
                    .withStepId("SampleStepId")
                    .withResponses(
                        Arrays
                            .asList(
                                new TroubleshooterResponse()
                                    .withQuestionId("SampleQuestionId")
                                    .withQuestionType(QuestionType.fromString("Text"))
                                    .withResponse("Connection exception"))),
                com.azure.core.util.Context.NONE);
    }
}
