// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation.models.events;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CallTransferFailed model. */
@Immutable
public final class CallTransferFailed extends CallAutomationEventBase {
    /*
     * Contains the resulting SIP code/sub-code and message from NGC services.
     */
    @JsonProperty(value = "resultInformation")
    private final ResultInformation resultInformation;

    private CallTransferFailed() {
        this.resultInformation = null;
    }

    /**
     * Get the resultInformation property: Contains the resulting SIP code/sub-code and message from NGC services.
     *
     * @return the resultInformation value.
     */
    public ResultInformation getResultInformation() {
        return this.resultInformation;
    }
}
