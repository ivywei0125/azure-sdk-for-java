// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

/**
 * Specifies which side of the input an n-gram should be generated from.
 */
public enum EdgeNGramTokenFilterSide {
    /**
     * Specifies that the n-gram should be generated from the front of the input.
     */
    FRONT("front"),

    /**
     * Specifies that the n-gram should be generated from the back of the input.
     */
    BACK("back");

    /**
     * The actual serialized value for a EdgeNGramTokenFilterSide instance.
     */
    private final String value;

    EdgeNGramTokenFilterSide(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a EdgeNGramTokenFilterSide instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed EdgeNGramTokenFilterSide object, or null if unable to parse.
     */
    public static EdgeNGramTokenFilterSide fromString(String value) {
        if (value == null) {
            return null;
        }
        EdgeNGramTokenFilterSide[] items = EdgeNGramTokenFilterSide.values();
        for (EdgeNGramTokenFilterSide item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
