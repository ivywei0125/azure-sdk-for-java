// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.resourcemanager.cognitiveservices.models.AccountProperties;
import com.azure.resourcemanager.cognitiveservices.models.Encryption;
import com.azure.resourcemanager.cognitiveservices.models.Identity;
import com.azure.resourcemanager.cognitiveservices.models.KeySource;
import com.azure.resourcemanager.cognitiveservices.models.KeyVaultProperties;
import com.azure.resourcemanager.cognitiveservices.models.ResourceIdentityType;
import com.azure.resourcemanager.cognitiveservices.models.Sku;
import com.azure.resourcemanager.cognitiveservices.models.UserOwnedStorage;
import java.util.Arrays;

/** Samples for Accounts Create. */
public final class AccountsCreateSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/stable/2023-05-01/examples/CreateAccountMin.json
     */
    /**
     * Sample code: Create Account Min.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void createAccountMin(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .accounts()
            .define("testCreate1")
            .withExistingResourceGroup("myResourceGroup")
            .withRegion("West US")
            .withKind("CognitiveServices")
            .withSku(new Sku().withName("S0"))
            .withIdentity(new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
            .withProperties(new AccountProperties())
            .create();
    }

    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/stable/2023-05-01/examples/CreateAccount.json
     */
    /**
     * Sample code: Create Account.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void createAccount(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .accounts()
            .define("testCreate1")
            .withExistingResourceGroup("myResourceGroup")
            .withRegion("West US")
            .withKind("Emotion")
            .withSku(new Sku().withName("S0"))
            .withIdentity(new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
            .withProperties(
                new AccountProperties()
                    .withEncryption(
                        new Encryption()
                            .withKeyVaultProperties(
                                new KeyVaultProperties()
                                    .withKeyName("fakeTokenPlaceholder")
                                    .withKeyVersion("fakeTokenPlaceholder")
                                    .withKeyVaultUri("fakeTokenPlaceholder"))
                            .withKeySource(KeySource.MICROSOFT_KEY_VAULT))
                    .withUserOwnedStorage(
                        Arrays
                            .asList(
                                new UserOwnedStorage()
                                    .withResourceId(
                                        "/subscriptions/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/resourceGroups/myResourceGroup/providers/Microsoft.Storage/storageAccounts/myStorageAccount"))))
            .create();
    }
}
