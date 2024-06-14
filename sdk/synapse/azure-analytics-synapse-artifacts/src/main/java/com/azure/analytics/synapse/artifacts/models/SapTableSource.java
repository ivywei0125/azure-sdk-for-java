// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A copy activity source for SAP Table source.
 */
@Fluent
public final class SapTableSource extends TabularSource {
    /*
     * Copy source type.
     */
    private String type = "SapTableSource";

    /*
     * The number of rows to be retrieved. Type: integer(or Expression with resultType integer).
     */
    private Object rowCount;

    /*
     * The number of rows that will be skipped. Type: integer (or Expression with resultType integer).
     */
    private Object rowSkips;

    /*
     * The fields of the SAP table that will be retrieved. For example, column0, column1. Type: string (or Expression with resultType string).
     */
    private Object rfcTableFields;

    /*
     * The options for the filtering of the SAP Table. For example, COLUMN0 EQ SOME VALUE. Type: string (or Expression with resultType string).
     */
    private Object rfcTableOptions;

    /*
     * Specifies the maximum number of rows that will be retrieved at a time when retrieving data from SAP Table. Type: integer (or Expression with resultType integer).
     */
    private Object batchSize;

    /*
     * Specifies the custom RFC function module that will be used to read data from SAP Table. Type: string (or Expression with resultType string).
     */
    private Object customRfcReadTableFunctionModule;

    /*
     * The single character that will be used as delimiter passed to SAP RFC as well as splitting the output data retrieved. Type: string (or Expression with resultType string).
     */
    private Object sapDataColumnDelimiter;

    /*
     * The partition mechanism that will be used for SAP table read in parallel. Possible values include: "None", "PartitionOnInt", "PartitionOnCalendarYear", "PartitionOnCalendarMonth", "PartitionOnCalendarDate", "PartitionOnTime".
     */
    private Object partitionOption;

    /*
     * The settings that will be leveraged for SAP table source partitioning.
     */
    private SapTablePartitionSettings partitionSettings;

    /**
     * Creates an instance of SapTableSource class.
     */
    public SapTableSource() {
    }

    /**
     * Get the type property: Copy source type.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the rowCount property: The number of rows to be retrieved. Type: integer(or Expression with resultType
     * integer).
     * 
     * @return the rowCount value.
     */
    public Object getRowCount() {
        return this.rowCount;
    }

    /**
     * Set the rowCount property: The number of rows to be retrieved. Type: integer(or Expression with resultType
     * integer).
     * 
     * @param rowCount the rowCount value to set.
     * @return the SapTableSource object itself.
     */
    public SapTableSource setRowCount(Object rowCount) {
        this.rowCount = rowCount;
        return this;
    }

    /**
     * Get the rowSkips property: The number of rows that will be skipped. Type: integer (or Expression with resultType
     * integer).
     * 
     * @return the rowSkips value.
     */
    public Object getRowSkips() {
        return this.rowSkips;
    }

    /**
     * Set the rowSkips property: The number of rows that will be skipped. Type: integer (or Expression with resultType
     * integer).
     * 
     * @param rowSkips the rowSkips value to set.
     * @return the SapTableSource object itself.
     */
    public SapTableSource setRowSkips(Object rowSkips) {
        this.rowSkips = rowSkips;
        return this;
    }

    /**
     * Get the rfcTableFields property: The fields of the SAP table that will be retrieved. For example, column0,
     * column1. Type: string (or Expression with resultType string).
     * 
     * @return the rfcTableFields value.
     */
    public Object getRfcTableFields() {
        return this.rfcTableFields;
    }

    /**
     * Set the rfcTableFields property: The fields of the SAP table that will be retrieved. For example, column0,
     * column1. Type: string (or Expression with resultType string).
     * 
     * @param rfcTableFields the rfcTableFields value to set.
     * @return the SapTableSource object itself.
     */
    public SapTableSource setRfcTableFields(Object rfcTableFields) {
        this.rfcTableFields = rfcTableFields;
        return this;
    }

    /**
     * Get the rfcTableOptions property: The options for the filtering of the SAP Table. For example, COLUMN0 EQ SOME
     * VALUE. Type: string (or Expression with resultType string).
     * 
     * @return the rfcTableOptions value.
     */
    public Object getRfcTableOptions() {
        return this.rfcTableOptions;
    }

    /**
     * Set the rfcTableOptions property: The options for the filtering of the SAP Table. For example, COLUMN0 EQ SOME
     * VALUE. Type: string (or Expression with resultType string).
     * 
     * @param rfcTableOptions the rfcTableOptions value to set.
     * @return the SapTableSource object itself.
     */
    public SapTableSource setRfcTableOptions(Object rfcTableOptions) {
        this.rfcTableOptions = rfcTableOptions;
        return this;
    }

    /**
     * Get the batchSize property: Specifies the maximum number of rows that will be retrieved at a time when retrieving
     * data from SAP Table. Type: integer (or Expression with resultType integer).
     * 
     * @return the batchSize value.
     */
    public Object getBatchSize() {
        return this.batchSize;
    }

    /**
     * Set the batchSize property: Specifies the maximum number of rows that will be retrieved at a time when retrieving
     * data from SAP Table. Type: integer (or Expression with resultType integer).
     * 
     * @param batchSize the batchSize value to set.
     * @return the SapTableSource object itself.
     */
    public SapTableSource setBatchSize(Object batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * Get the customRfcReadTableFunctionModule property: Specifies the custom RFC function module that will be used to
     * read data from SAP Table. Type: string (or Expression with resultType string).
     * 
     * @return the customRfcReadTableFunctionModule value.
     */
    public Object getCustomRfcReadTableFunctionModule() {
        return this.customRfcReadTableFunctionModule;
    }

    /**
     * Set the customRfcReadTableFunctionModule property: Specifies the custom RFC function module that will be used to
     * read data from SAP Table. Type: string (or Expression with resultType string).
     * 
     * @param customRfcReadTableFunctionModule the customRfcReadTableFunctionModule value to set.
     * @return the SapTableSource object itself.
     */
    public SapTableSource setCustomRfcReadTableFunctionModule(Object customRfcReadTableFunctionModule) {
        this.customRfcReadTableFunctionModule = customRfcReadTableFunctionModule;
        return this;
    }

    /**
     * Get the sapDataColumnDelimiter property: The single character that will be used as delimiter passed to SAP RFC as
     * well as splitting the output data retrieved. Type: string (or Expression with resultType string).
     * 
     * @return the sapDataColumnDelimiter value.
     */
    public Object getSapDataColumnDelimiter() {
        return this.sapDataColumnDelimiter;
    }

    /**
     * Set the sapDataColumnDelimiter property: The single character that will be used as delimiter passed to SAP RFC as
     * well as splitting the output data retrieved. Type: string (or Expression with resultType string).
     * 
     * @param sapDataColumnDelimiter the sapDataColumnDelimiter value to set.
     * @return the SapTableSource object itself.
     */
    public SapTableSource setSapDataColumnDelimiter(Object sapDataColumnDelimiter) {
        this.sapDataColumnDelimiter = sapDataColumnDelimiter;
        return this;
    }

    /**
     * Get the partitionOption property: The partition mechanism that will be used for SAP table read in parallel.
     * Possible values include: "None", "PartitionOnInt", "PartitionOnCalendarYear", "PartitionOnCalendarMonth",
     * "PartitionOnCalendarDate", "PartitionOnTime".
     * 
     * @return the partitionOption value.
     */
    public Object getPartitionOption() {
        return this.partitionOption;
    }

    /**
     * Set the partitionOption property: The partition mechanism that will be used for SAP table read in parallel.
     * Possible values include: "None", "PartitionOnInt", "PartitionOnCalendarYear", "PartitionOnCalendarMonth",
     * "PartitionOnCalendarDate", "PartitionOnTime".
     * 
     * @param partitionOption the partitionOption value to set.
     * @return the SapTableSource object itself.
     */
    public SapTableSource setPartitionOption(Object partitionOption) {
        this.partitionOption = partitionOption;
        return this;
    }

    /**
     * Get the partitionSettings property: The settings that will be leveraged for SAP table source partitioning.
     * 
     * @return the partitionSettings value.
     */
    public SapTablePartitionSettings getPartitionSettings() {
        return this.partitionSettings;
    }

    /**
     * Set the partitionSettings property: The settings that will be leveraged for SAP table source partitioning.
     * 
     * @param partitionSettings the partitionSettings value to set.
     * @return the SapTableSource object itself.
     */
    public SapTableSource setPartitionSettings(SapTablePartitionSettings partitionSettings) {
        this.partitionSettings = partitionSettings;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapTableSource setQueryTimeout(Object queryTimeout) {
        super.setQueryTimeout(queryTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapTableSource setAdditionalColumns(Object additionalColumns) {
        super.setAdditionalColumns(additionalColumns);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapTableSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapTableSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapTableSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("sourceRetryCount", getSourceRetryCount());
        jsonWriter.writeUntypedField("sourceRetryWait", getSourceRetryWait());
        jsonWriter.writeUntypedField("maxConcurrentConnections", getMaxConcurrentConnections());
        jsonWriter.writeUntypedField("queryTimeout", getQueryTimeout());
        jsonWriter.writeUntypedField("additionalColumns", getAdditionalColumns());
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeUntypedField("rowCount", this.rowCount);
        jsonWriter.writeUntypedField("rowSkips", this.rowSkips);
        jsonWriter.writeUntypedField("rfcTableFields", this.rfcTableFields);
        jsonWriter.writeUntypedField("rfcTableOptions", this.rfcTableOptions);
        jsonWriter.writeUntypedField("batchSize", this.batchSize);
        jsonWriter.writeUntypedField("customRfcReadTableFunctionModule", this.customRfcReadTableFunctionModule);
        jsonWriter.writeUntypedField("sapDataColumnDelimiter", this.sapDataColumnDelimiter);
        jsonWriter.writeUntypedField("partitionOption", this.partitionOption);
        jsonWriter.writeJsonField("partitionSettings", this.partitionSettings);
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SapTableSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SapTableSource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SapTableSource.
     */
    public static SapTableSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SapTableSource deserializedSapTableSource = new SapTableSource();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceRetryCount".equals(fieldName)) {
                    deserializedSapTableSource.setSourceRetryCount(reader.readUntyped());
                } else if ("sourceRetryWait".equals(fieldName)) {
                    deserializedSapTableSource.setSourceRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedSapTableSource.setMaxConcurrentConnections(reader.readUntyped());
                } else if ("queryTimeout".equals(fieldName)) {
                    deserializedSapTableSource.setQueryTimeout(reader.readUntyped());
                } else if ("additionalColumns".equals(fieldName)) {
                    deserializedSapTableSource.setAdditionalColumns(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedSapTableSource.type = reader.getString();
                } else if ("rowCount".equals(fieldName)) {
                    deserializedSapTableSource.rowCount = reader.readUntyped();
                } else if ("rowSkips".equals(fieldName)) {
                    deserializedSapTableSource.rowSkips = reader.readUntyped();
                } else if ("rfcTableFields".equals(fieldName)) {
                    deserializedSapTableSource.rfcTableFields = reader.readUntyped();
                } else if ("rfcTableOptions".equals(fieldName)) {
                    deserializedSapTableSource.rfcTableOptions = reader.readUntyped();
                } else if ("batchSize".equals(fieldName)) {
                    deserializedSapTableSource.batchSize = reader.readUntyped();
                } else if ("customRfcReadTableFunctionModule".equals(fieldName)) {
                    deserializedSapTableSource.customRfcReadTableFunctionModule = reader.readUntyped();
                } else if ("sapDataColumnDelimiter".equals(fieldName)) {
                    deserializedSapTableSource.sapDataColumnDelimiter = reader.readUntyped();
                } else if ("partitionOption".equals(fieldName)) {
                    deserializedSapTableSource.partitionOption = reader.readUntyped();
                } else if ("partitionSettings".equals(fieldName)) {
                    deserializedSapTableSource.partitionSettings = SapTablePartitionSettings.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedSapTableSource.setAdditionalProperties(additionalProperties);

            return deserializedSapTableSource;
        });
    }
}
