// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SparkJobReferenceType;
import com.azure.resourcemanager.datafactory.models.SynapseSparkJobReference;
import org.junit.jupiter.api.Assertions;

public final class SynapseSparkJobReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SynapseSparkJobReference model =
            BinaryData
                .fromString("{\"type\":\"SparkJobDefinitionReference\",\"referenceName\":\"datacnvrbhqxewdc\"}")
                .toObject(SynapseSparkJobReference.class);
        Assertions.assertEquals(SparkJobReferenceType.SPARK_JOB_DEFINITION_REFERENCE, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SynapseSparkJobReference model =
            new SynapseSparkJobReference()
                .withType(SparkJobReferenceType.SPARK_JOB_DEFINITION_REFERENCE)
                .withReferenceName("datacnvrbhqxewdc");
        model = BinaryData.fromObject(model).toObject(SynapseSparkJobReference.class);
        Assertions.assertEquals(SparkJobReferenceType.SPARK_JOB_DEFINITION_REFERENCE, model.type());
    }
}
