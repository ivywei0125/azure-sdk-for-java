// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.models;

import com.azure.resourcemanager.nginx.fluent.models.AnalysisResultInner;

/**
 * An immutable client-side representation of AnalysisResult.
 */
public interface AnalysisResult {
    /**
     * Gets the status property: The status of the analysis.
     * 
     * @return the status value.
     */
    String status();

    /**
     * Gets the data property: The data property.
     * 
     * @return the data value.
     */
    AnalysisResultData data();

    /**
     * Gets the inner com.azure.resourcemanager.nginx.fluent.models.AnalysisResultInner object.
     * 
     * @return the inner object.
     */
    AnalysisResultInner innerModel();
}
