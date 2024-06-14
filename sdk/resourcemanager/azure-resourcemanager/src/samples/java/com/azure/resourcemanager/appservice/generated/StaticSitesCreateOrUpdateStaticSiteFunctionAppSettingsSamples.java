// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.fluent.models.StringDictionaryInner;

import java.util.HashMap;
import java.util.Map;

/**
 * Samples for StaticSites CreateOrUpdateStaticSiteFunctionAppSettings.
 */
public final class StaticSitesCreateOrUpdateStaticSiteFunctionAppSettingsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/CreateOrUpdateStaticSiteFunctionAppSettings.json
     */
    /**
     * Sample code: Creates or updates the function app settings of a static site.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        createsOrUpdatesTheFunctionAppSettingsOfAStaticSite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .createOrUpdateStaticSiteFunctionAppSettingsWithResponse("rg", "testStaticSite0",
                new StringDictionaryInner().withProperties(mapOf("setting1", "someval", "setting2", "someval2")),
                com.azure.core.util.Context.NONE);
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
