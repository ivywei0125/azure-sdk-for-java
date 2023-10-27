// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

import com.azure.resourcemanager.cdn.models.CheckHostnameAvailabilityInput;

/** Samples for AfdProfiles CheckHostnameAvailability. */
public final class AfdProfilesCheckHostnameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/AFDProfiles_CheckHostNameAvailability.json
     */
    /**
     * Sample code: AFDProfiles_CheckHostNameAvailability.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void aFDProfilesCheckHostNameAvailability(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getAfdProfiles()
            .checkHostnameAvailabilityWithResponse(
                "RG",
                "profile1",
                new CheckHostnameAvailabilityInput().withHostname("www.someDomain.net"),
                com.azure.core.util.Context.NONE);
    }
}
