// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.resourcemanager.signalr.models.KeyType;
import com.azure.resourcemanager.signalr.models.RegenerateKeyParameters;

/** Samples for SignalR RegenerateKey. */
public final class SignalRRegenerateKeySamples {
    /*
     * x-ms-original-file: specification/signalr/resource-manager/Microsoft.SignalRService/preview/2023-08-01-preview/examples/SignalR_RegenerateKey.json
     */
    /**
     * Sample code: SignalR_RegenerateKey.
     *
     * @param manager Entry point to SignalRManager.
     */
    public static void signalRRegenerateKey(com.azure.resourcemanager.signalr.SignalRManager manager) {
        manager
            .signalRs()
            .regenerateKey(
                "myResourceGroup",
                "mySignalRService",
                new RegenerateKeyParameters().withKeyType(KeyType.PRIMARY),
                com.azure.core.util.Context.NONE);
    }
}
