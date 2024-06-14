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
import java.util.List;
import java.util.Map;

/**
 * Base class for all execution activities.
 */
@Fluent
public class ExecutionActivity extends Activity {
    /*
     * Type of activity.
     */
    private String type = "Execution";

    /*
     * Linked service reference.
     */
    private LinkedServiceReference linkedServiceName;

    /*
     * Activity policy.
     */
    private ActivityPolicy policy;

    /**
     * Creates an instance of ExecutionActivity class.
     */
    public ExecutionActivity() {
    }

    /**
     * Get the type property: Type of activity.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the linkedServiceName property: Linked service reference.
     * 
     * @return the linkedServiceName value.
     */
    public LinkedServiceReference getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set the linkedServiceName property: Linked service reference.
     * 
     * @param linkedServiceName the linkedServiceName value to set.
     * @return the ExecutionActivity object itself.
     */
    public ExecutionActivity setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get the policy property: Activity policy.
     * 
     * @return the policy value.
     */
    public ActivityPolicy getPolicy() {
        return this.policy;
    }

    /**
     * Set the policy property: Activity policy.
     * 
     * @param policy the policy value to set.
     * @return the ExecutionActivity object itself.
     */
    public ExecutionActivity setPolicy(ActivityPolicy policy) {
        this.policy = policy;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecutionActivity setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecutionActivity setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecutionActivity setState(ActivityState state) {
        super.setState(state);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecutionActivity setOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.setOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecutionActivity setDependsOn(List<ActivityDependency> dependsOn) {
        super.setDependsOn(dependsOn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecutionActivity setUserProperties(List<UserProperty> userProperties) {
        super.setUserProperties(userProperties);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeStringField("state", getState() == null ? null : getState().toString());
        jsonWriter.writeStringField("onInactiveMarkAs",
            getOnInactiveMarkAs() == null ? null : getOnInactiveMarkAs().toString());
        jsonWriter.writeArrayField("dependsOn", getDependsOn(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("userProperties", getUserProperties(),
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("linkedServiceName", this.linkedServiceName);
        jsonWriter.writeJsonField("policy", this.policy);
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExecutionActivity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExecutionActivity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExecutionActivity.
     */
    public static ExecutionActivity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("Copy".equals(discriminatorValue)) {
                    return CopyActivity.fromJson(readerToUse.reset());
                } else if ("HDInsightHive".equals(discriminatorValue)) {
                    return HDInsightHiveActivity.fromJson(readerToUse.reset());
                } else if ("HDInsightPig".equals(discriminatorValue)) {
                    return HDInsightPigActivity.fromJson(readerToUse.reset());
                } else if ("HDInsightMapReduce".equals(discriminatorValue)) {
                    return HDInsightMapReduceActivity.fromJson(readerToUse.reset());
                } else if ("HDInsightStreaming".equals(discriminatorValue)) {
                    return HDInsightStreamingActivity.fromJson(readerToUse.reset());
                } else if ("HDInsightSpark".equals(discriminatorValue)) {
                    return HDInsightSparkActivity.fromJson(readerToUse.reset());
                } else if ("ExecuteSSISPackage".equals(discriminatorValue)) {
                    return ExecuteSsisPackageActivity.fromJson(readerToUse.reset());
                } else if ("Custom".equals(discriminatorValue)) {
                    return CustomActivity.fromJson(readerToUse.reset());
                } else if ("SqlServerStoredProcedure".equals(discriminatorValue)) {
                    return SqlServerStoredProcedureActivity.fromJson(readerToUse.reset());
                } else if ("Delete".equals(discriminatorValue)) {
                    return DeleteActivity.fromJson(readerToUse.reset());
                } else if ("AzureDataExplorerCommand".equals(discriminatorValue)) {
                    return AzureDataExplorerCommandActivity.fromJson(readerToUse.reset());
                } else if ("Lookup".equals(discriminatorValue)) {
                    return LookupActivity.fromJson(readerToUse.reset());
                } else if ("WebActivity".equals(discriminatorValue)) {
                    return WebActivity.fromJson(readerToUse.reset());
                } else if ("GetMetadata".equals(discriminatorValue)) {
                    return GetMetadataActivity.fromJson(readerToUse.reset());
                } else if ("AzureMLBatchExecution".equals(discriminatorValue)) {
                    return AzureMLBatchExecutionActivity.fromJson(readerToUse.reset());
                } else if ("AzureMLUpdateResource".equals(discriminatorValue)) {
                    return AzureMLUpdateResourceActivity.fromJson(readerToUse.reset());
                } else if ("AzureMLExecutePipeline".equals(discriminatorValue)) {
                    return AzureMLExecutePipelineActivity.fromJson(readerToUse.reset());
                } else if ("DataLakeAnalyticsU-SQL".equals(discriminatorValue)) {
                    return DataLakeAnalyticsUsqlActivity.fromJson(readerToUse.reset());
                } else if ("DatabricksNotebook".equals(discriminatorValue)) {
                    return DatabricksNotebookActivity.fromJson(readerToUse.reset());
                } else if ("DatabricksSparkJar".equals(discriminatorValue)) {
                    return DatabricksSparkJarActivity.fromJson(readerToUse.reset());
                } else if ("DatabricksSparkPython".equals(discriminatorValue)) {
                    return DatabricksSparkPythonActivity.fromJson(readerToUse.reset());
                } else if ("AzureFunctionActivity".equals(discriminatorValue)) {
                    return AzureFunctionActivity.fromJson(readerToUse.reset());
                } else if ("ExecuteDataFlow".equals(discriminatorValue)) {
                    return ExecuteDataFlowActivity.fromJson(readerToUse.reset());
                } else if ("Script".equals(discriminatorValue)) {
                    return ScriptActivity.fromJson(readerToUse.reset());
                } else if ("SynapseNotebook".equals(discriminatorValue)) {
                    return SynapseNotebookActivity.fromJson(readerToUse.reset());
                } else if ("SparkJob".equals(discriminatorValue)) {
                    return SynapseSparkJobDefinitionActivity.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static ExecutionActivity fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExecutionActivity deserializedExecutionActivity = new ExecutionActivity();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedExecutionActivity.setName(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedExecutionActivity.setDescription(reader.getString());
                } else if ("state".equals(fieldName)) {
                    deserializedExecutionActivity.setState(ActivityState.fromString(reader.getString()));
                } else if ("onInactiveMarkAs".equals(fieldName)) {
                    deserializedExecutionActivity
                        .setOnInactiveMarkAs(ActivityOnInactiveMarkAs.fromString(reader.getString()));
                } else if ("dependsOn".equals(fieldName)) {
                    List<ActivityDependency> dependsOn
                        = reader.readArray(reader1 -> ActivityDependency.fromJson(reader1));
                    deserializedExecutionActivity.setDependsOn(dependsOn);
                } else if ("userProperties".equals(fieldName)) {
                    List<UserProperty> userProperties = reader.readArray(reader1 -> UserProperty.fromJson(reader1));
                    deserializedExecutionActivity.setUserProperties(userProperties);
                } else if ("type".equals(fieldName)) {
                    deserializedExecutionActivity.type = reader.getString();
                } else if ("linkedServiceName".equals(fieldName)) {
                    deserializedExecutionActivity.linkedServiceName = LinkedServiceReference.fromJson(reader);
                } else if ("policy".equals(fieldName)) {
                    deserializedExecutionActivity.policy = ActivityPolicy.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedExecutionActivity.setAdditionalProperties(additionalProperties);

            return deserializedExecutionActivity;
        });
    }
}
