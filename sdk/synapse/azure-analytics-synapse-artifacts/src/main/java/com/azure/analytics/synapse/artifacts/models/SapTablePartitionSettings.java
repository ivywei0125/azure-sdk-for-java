// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The settings that will be leveraged for SAP table source partitioning.
 */
@Fluent
public final class SapTablePartitionSettings {
    /*
     * The name of the column that will be used for proceeding range partitioning. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "partitionColumnName")
    private Object partitionColumnName;

    /*
     * The maximum value of column specified in partitionColumnName that will be used for proceeding range
     * partitioning. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "partitionUpperBound")
    private Object partitionUpperBound;

    /*
     * The minimum value of column specified in partitionColumnName that will be used for proceeding range
     * partitioning. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "partitionLowerBound")
    private Object partitionLowerBound;

    /*
     * The maximum value of partitions the table will be split into. Type: integer (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "maxPartitionsNumber")
    private Object maxPartitionsNumber;

    /**
     * Creates an instance of SapTablePartitionSettings class.
     */
    public SapTablePartitionSettings() {
    }

    /**
     * Get the partitionColumnName property: The name of the column that will be used for proceeding range
     * partitioning. Type: string (or Expression with resultType string).
     * 
     * @return the partitionColumnName value.
     */
    public Object getPartitionColumnName() {
        return this.partitionColumnName;
    }

    /**
     * Set the partitionColumnName property: The name of the column that will be used for proceeding range
     * partitioning. Type: string (or Expression with resultType string).
     * 
     * @param partitionColumnName the partitionColumnName value to set.
     * @return the SapTablePartitionSettings object itself.
     */
    public SapTablePartitionSettings setPartitionColumnName(Object partitionColumnName) {
        this.partitionColumnName = partitionColumnName;
        return this;
    }

    /**
     * Get the partitionUpperBound property: The maximum value of column specified in partitionColumnName that will be
     * used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     * @return the partitionUpperBound value.
     */
    public Object getPartitionUpperBound() {
        return this.partitionUpperBound;
    }

    /**
     * Set the partitionUpperBound property: The maximum value of column specified in partitionColumnName that will be
     * used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     * @param partitionUpperBound the partitionUpperBound value to set.
     * @return the SapTablePartitionSettings object itself.
     */
    public SapTablePartitionSettings setPartitionUpperBound(Object partitionUpperBound) {
        this.partitionUpperBound = partitionUpperBound;
        return this;
    }

    /**
     * Get the partitionLowerBound property: The minimum value of column specified in partitionColumnName that will be
     * used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     * @return the partitionLowerBound value.
     */
    public Object getPartitionLowerBound() {
        return this.partitionLowerBound;
    }

    /**
     * Set the partitionLowerBound property: The minimum value of column specified in partitionColumnName that will be
     * used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     * @param partitionLowerBound the partitionLowerBound value to set.
     * @return the SapTablePartitionSettings object itself.
     */
    public SapTablePartitionSettings setPartitionLowerBound(Object partitionLowerBound) {
        this.partitionLowerBound = partitionLowerBound;
        return this;
    }

    /**
     * Get the maxPartitionsNumber property: The maximum value of partitions the table will be split into. Type:
     * integer (or Expression with resultType string).
     * 
     * @return the maxPartitionsNumber value.
     */
    public Object getMaxPartitionsNumber() {
        return this.maxPartitionsNumber;
    }

    /**
     * Set the maxPartitionsNumber property: The maximum value of partitions the table will be split into. Type:
     * integer (or Expression with resultType string).
     * 
     * @param maxPartitionsNumber the maxPartitionsNumber value to set.
     * @return the SapTablePartitionSettings object itself.
     */
    public SapTablePartitionSettings setMaxPartitionsNumber(Object maxPartitionsNumber) {
        this.maxPartitionsNumber = maxPartitionsNumber;
        return this;
    }
}
