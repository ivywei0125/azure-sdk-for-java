// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The response payload for removing participants of the call. */
@Fluent
public final class RemoveParticipantsResponseInternal {
    /*
     * The operation context provided by client.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /**
     * Get the operationContext property: The operation context provided by client.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: The operation context provided by client.
     *
     * @param operationContext the operationContext value to set.
     * @return the RemoveParticipantsResponseInternal object itself.
     */
    public RemoveParticipantsResponseInternal setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }
}
