// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.contentsafety.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The request of adding blockItems to text blocklist. */
@Immutable
public final class AddBlockItemsOptions {
    /*
     * Array of blockItemInfo to add.
     */
    @Generated
    @JsonProperty(value = "blockItems")
    private List<TextBlockItemInfo> blockItems;

    /**
     * Creates an instance of AddBlockItemsOptions class.
     *
     * @param blockItems the blockItems value to set.
     */
    @Generated
    @JsonCreator
    public AddBlockItemsOptions(@JsonProperty(value = "blockItems") List<TextBlockItemInfo> blockItems) {
        this.blockItems = blockItems;
    }

    /**
     * Get the blockItems property: Array of blockItemInfo to add.
     *
     * @return the blockItems value.
     */
    @Generated
    public List<TextBlockItemInfo> getBlockItems() {
        return this.blockItems;
    }
}
