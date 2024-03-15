// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.resourcemanager.security.models.ActionableRemediation;
import com.azure.resourcemanager.security.models.ActionableRemediationState;
import com.azure.resourcemanager.security.models.AzureDevOpsOrg;
import com.azure.resourcemanager.security.models.AzureDevOpsOrgProperties;
import com.azure.resourcemanager.security.models.OnboardingState;

/**
 * Samples for AzureDevOpsOrgs Update.
 */
public final class AzureDevOpsOrgsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2023-09-01-preview/examples/
     * SecurityConnectorsDevOps/UpdateAzureDevOpsOrgs_example.json
     */
    /**
     * Sample code: Update_AzureDevOpsOrgs.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void updateAzureDevOpsOrgs(com.azure.resourcemanager.security.SecurityManager manager) {
        AzureDevOpsOrg resource = manager.azureDevOpsOrgs()
            .getWithResponse("myRg", "mySecurityConnectorName", "myAzDevOpsOrg", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new AzureDevOpsOrgProperties().withOnboardingState(OnboardingState.NOT_APPLICABLE)
                .withActionableRemediation(new ActionableRemediation().withState(ActionableRemediationState.ENABLED)))
            .apply();
    }
}
