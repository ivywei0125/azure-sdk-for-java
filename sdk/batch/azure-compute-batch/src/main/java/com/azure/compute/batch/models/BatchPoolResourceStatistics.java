// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Statistics related to resource consumption by Compute Nodes in a Pool.
 */
@Immutable
public final class BatchPoolResourceStatistics implements JsonSerializable<BatchPoolResourceStatistics> {

    /*
     * The start time of the time range covered by the statistics.
     */
    @Generated
    private final OffsetDateTime startTime;

    /*
     * The time at which the statistics were last updated. All statistics are limited to the range between startTime and
     * lastUpdateTime.
     */
    @Generated
    private final OffsetDateTime lastUpdateTime;

    /*
     * The average CPU usage across all Compute Nodes in the Pool (percentage per node).
     */
    @Generated
    private final double avgCpuPercentage;

    /*
     * The average memory usage in GiB across all Compute Nodes in the Pool.
     */
    @Generated
    private final double avgMemoryGiB;

    /*
     * The peak memory usage in GiB across all Compute Nodes in the Pool.
     */
    @Generated
    private final double peakMemoryGiB;

    /*
     * The average used disk space in GiB across all Compute Nodes in the Pool.
     */
    @Generated
    private final double avgDiskGiB;

    /*
     * The peak used disk space in GiB across all Compute Nodes in the Pool.
     */
    @Generated
    private final double peakDiskGiB;

    /*
     * The total number of disk read operations across all Compute Nodes in the Pool.
     */
    @Generated
    private final long diskReadIOps;

    /*
     * The total number of disk write operations across all Compute Nodes in the Pool.
     */
    @Generated
    private final long diskWriteIOps;

    /*
     * The total amount of data in GiB of disk reads across all Compute Nodes in the Pool.
     */
    @Generated
    private final double diskReadGiB;

    /*
     * The total amount of data in GiB of disk writes across all Compute Nodes in the Pool.
     */
    @Generated
    private final double diskWriteGiB;

    /*
     * The total amount of data in GiB of network reads across all Compute Nodes in the Pool.
     */
    @Generated
    private final double networkReadGiB;

    /*
     * The total amount of data in GiB of network writes across all Compute Nodes in the Pool.
     */
    @Generated
    private final double networkWriteGiB;

    /**
     * Get the startTime property: The start time of the time range covered by the statistics.
     *
     * @return the startTime value.
     */
    @Generated
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Get the lastUpdateTime property: The time at which the statistics were last updated. All statistics are limited
     * to the range between startTime and lastUpdateTime.
     *
     * @return the lastUpdateTime value.
     */
    @Generated
    public OffsetDateTime getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * Get the avgCpuPercentage property: The average CPU usage across all Compute Nodes in the Pool (percentage per
     * node).
     *
     * @return the avgCpuPercentage value.
     */
    @Generated
    public double getAvgCpuPercentage() {
        return this.avgCpuPercentage;
    }

    /**
     * Get the avgMemoryGiB property: The average memory usage in GiB across all Compute Nodes in the Pool.
     *
     * @return the avgMemoryGiB value.
     */
    @Generated
    public double getAvgMemoryGiB() {
        return this.avgMemoryGiB;
    }

    /**
     * Get the peakMemoryGiB property: The peak memory usage in GiB across all Compute Nodes in the Pool.
     *
     * @return the peakMemoryGiB value.
     */
    @Generated
    public double getPeakMemoryGiB() {
        return this.peakMemoryGiB;
    }

    /**
     * Get the avgDiskGiB property: The average used disk space in GiB across all Compute Nodes in the Pool.
     *
     * @return the avgDiskGiB value.
     */
    @Generated
    public double getAvgDiskGiB() {
        return this.avgDiskGiB;
    }

    /**
     * Get the peakDiskGiB property: The peak used disk space in GiB across all Compute Nodes in the Pool.
     *
     * @return the peakDiskGiB value.
     */
    @Generated
    public double getPeakDiskGiB() {
        return this.peakDiskGiB;
    }

    /**
     * Get the diskReadIOps property: The total number of disk read operations across all Compute Nodes in the Pool.
     *
     * @return the diskReadIOps value.
     */
    @Generated
    public long getDiskReadIOps() {
        return this.diskReadIOps;
    }

    /**
     * Get the diskWriteIOps property: The total number of disk write operations across all Compute Nodes in the Pool.
     *
     * @return the diskWriteIOps value.
     */
    @Generated
    public long getDiskWriteIOps() {
        return this.diskWriteIOps;
    }

    /**
     * Get the diskReadGiB property: The total amount of data in GiB of disk reads across all Compute Nodes in the Pool.
     *
     * @return the diskReadGiB value.
     */
    @Generated
    public double getDiskReadGiB() {
        return this.diskReadGiB;
    }

    /**
     * Get the diskWriteGiB property: The total amount of data in GiB of disk writes across all Compute Nodes in the
     * Pool.
     *
     * @return the diskWriteGiB value.
     */
    @Generated
    public double getDiskWriteGiB() {
        return this.diskWriteGiB;
    }

    /**
     * Get the networkReadGiB property: The total amount of data in GiB of network reads across all Compute Nodes in the
     * Pool.
     *
     * @return the networkReadGiB value.
     */
    @Generated
    public double getNetworkReadGiB() {
        return this.networkReadGiB;
    }

    /**
     * Get the networkWriteGiB property: The total amount of data in GiB of network writes across all Compute Nodes in
     * the Pool.
     *
     * @return the networkWriteGiB value.
     */
    @Generated
    public double getNetworkWriteGiB() {
        return this.networkWriteGiB;
    }

    /**
     * Creates an instance of BatchPoolResourceStatistics class.
     *
     * @param startTime the startTime value to set.
     * @param lastUpdateTime the lastUpdateTime value to set.
     * @param avgCpuPercentage the avgCpuPercentage value to set.
     * @param avgMemoryGiB the avgMemoryGiB value to set.
     * @param peakMemoryGiB the peakMemoryGiB value to set.
     * @param avgDiskGiB the avgDiskGiB value to set.
     * @param peakDiskGiB the peakDiskGiB value to set.
     * @param diskReadIOps the diskReadIOps value to set.
     * @param diskWriteIOps the diskWriteIOps value to set.
     * @param diskReadGiB the diskReadGiB value to set.
     * @param diskWriteGiB the diskWriteGiB value to set.
     * @param networkReadGiB the networkReadGiB value to set.
     * @param networkWriteGiB the networkWriteGiB value to set.
     */
    @Generated
    private BatchPoolResourceStatistics(OffsetDateTime startTime, OffsetDateTime lastUpdateTime,
        double avgCpuPercentage, double avgMemoryGiB, double peakMemoryGiB, double avgDiskGiB, double peakDiskGiB,
        long diskReadIOps, long diskWriteIOps, double diskReadGiB, double diskWriteGiB, double networkReadGiB,
        double networkWriteGiB) {
        this.startTime = startTime;
        this.lastUpdateTime = lastUpdateTime;
        this.avgCpuPercentage = avgCpuPercentage;
        this.avgMemoryGiB = avgMemoryGiB;
        this.peakMemoryGiB = peakMemoryGiB;
        this.avgDiskGiB = avgDiskGiB;
        this.peakDiskGiB = peakDiskGiB;
        this.diskReadIOps = diskReadIOps;
        this.diskWriteIOps = diskWriteIOps;
        this.diskReadGiB = diskReadGiB;
        this.diskWriteGiB = diskWriteGiB;
        this.networkReadGiB = networkReadGiB;
        this.networkWriteGiB = networkWriteGiB;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("startTime",
            this.startTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startTime));
        jsonWriter.writeStringField("lastUpdateTime",
            this.lastUpdateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastUpdateTime));
        jsonWriter.writeDoubleField("avgCPUPercentage", this.avgCpuPercentage);
        jsonWriter.writeDoubleField("avgMemoryGiB", this.avgMemoryGiB);
        jsonWriter.writeDoubleField("peakMemoryGiB", this.peakMemoryGiB);
        jsonWriter.writeDoubleField("avgDiskGiB", this.avgDiskGiB);
        jsonWriter.writeDoubleField("peakDiskGiB", this.peakDiskGiB);
        jsonWriter.writeLongField("diskReadIOps", this.diskReadIOps);
        jsonWriter.writeLongField("diskWriteIOps", this.diskWriteIOps);
        jsonWriter.writeDoubleField("diskReadGiB", this.diskReadGiB);
        jsonWriter.writeDoubleField("diskWriteGiB", this.diskWriteGiB);
        jsonWriter.writeDoubleField("networkReadGiB", this.networkReadGiB);
        jsonWriter.writeDoubleField("networkWriteGiB", this.networkWriteGiB);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchPoolResourceStatistics from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchPoolResourceStatistics if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BatchPoolResourceStatistics.
     */
    public static BatchPoolResourceStatistics fromJson(JsonReader jsonReader) throws IOException {
        // TODO: Re-add @Generated tag here and re-generate SDK once the 2024-05-01 Batch Service API is released
        return jsonReader.readObject(reader -> {
            OffsetDateTime startTime = null;
            OffsetDateTime lastUpdateTime = null;
            double avgCpuPercentage = 0.0;
            double avgMemoryGiB = 0.0;
            double peakMemoryGiB = 0.0;
            double avgDiskGiB = 0.0;
            double peakDiskGiB = 0.0;
            long diskReadIOps = 0L;
            long diskWriteIOps = 0L;
            double diskReadGiB = 0.0;
            double diskWriteGiB = 0.0;
            double networkReadGiB = 0.0;
            double networkWriteGiB = 0.0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("startTime".equals(fieldName)) {
                    startTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastUpdateTime".equals(fieldName)) {
                    lastUpdateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("avgCPUPercentage".equals(fieldName)) {
                    avgCpuPercentage = reader.getDouble();
                } else if ("avgMemoryGiB".equals(fieldName)) {
                    avgMemoryGiB = reader.getDouble();
                } else if ("peakMemoryGiB".equals(fieldName)) {
                    peakMemoryGiB = reader.getDouble();
                } else if ("avgDiskGiB".equals(fieldName)) {
                    avgDiskGiB = reader.getDouble();
                } else if ("peakDiskGiB".equals(fieldName)) {
                    peakDiskGiB = reader.getDouble();
                } else if ("diskReadIOps".equals(fieldName)) {
                    if (reader.currentToken() == JsonToken.STRING) {
                        String diskReadIOpsStr = reader.getString();
                        try {
                            diskReadIOps = Long.parseLong(diskReadIOpsStr);
                        } catch (NumberFormatException e) {
                            throw new IOException("Expected numeric diskReadIOps, but found: " + diskReadIOpsStr, e);
                        }
                    } else if (reader.currentToken() == JsonToken.NUMBER) {
                        diskReadIOps = reader.getLong();
                    } else {
                        throw new IOException("Expected diskReadIOps to be a number or string, but found other type");
                    }
                } else if ("diskWriteIOps".equals(fieldName)) {
                    if (reader.currentToken() == JsonToken.STRING) {
                        String diskWriteIOpsStr = reader.getString();
                        try {
                            diskWriteIOps = Long.parseLong(diskWriteIOpsStr);
                        } catch (NumberFormatException e) {
                            throw new IOException("Expected numeric diskWriteIOps, but found: " + diskWriteIOpsStr, e);
                        }
                    } else if (reader.currentToken() == JsonToken.NUMBER) {
                        diskWriteIOps = reader.getLong();
                    } else {
                        throw new IOException("Expected diskWriteIOps to be a number or string, but found other type");
                    }
                } else if ("diskReadGiB".equals(fieldName)) {
                    diskReadGiB = reader.getDouble();
                } else if ("diskWriteGiB".equals(fieldName)) {
                    diskWriteGiB = reader.getDouble();
                } else if ("networkReadGiB".equals(fieldName)) {
                    networkReadGiB = reader.getDouble();
                } else if ("networkWriteGiB".equals(fieldName)) {
                    networkWriteGiB = reader.getDouble();
                } else {
                    reader.skipChildren();
                }
            }
            return new BatchPoolResourceStatistics(startTime, lastUpdateTime, avgCpuPercentage, avgMemoryGiB,
                peakMemoryGiB, avgDiskGiB, peakDiskGiB, diskReadIOps, diskWriteIOps, diskReadGiB, diskWriteGiB,
                networkReadGiB, networkWriteGiB);
        });
    }
}
