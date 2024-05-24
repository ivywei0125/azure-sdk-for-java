// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.JobsSummary;
import org.junit.jupiter.api.Assertions;

public final class JobsSummaryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobsSummary model = BinaryData
            .fromString("{\"failedJobs\":2127551556,\"suspendedJobs\":2032289729,\"inProgressJobs\":1093088045}")
            .toObject(JobsSummary.class);
        Assertions.assertEquals(2127551556, model.failedJobs());
        Assertions.assertEquals(2032289729, model.suspendedJobs());
        Assertions.assertEquals(1093088045, model.inProgressJobs());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobsSummary model
            = new JobsSummary().withFailedJobs(2127551556).withSuspendedJobs(2032289729).withInProgressJobs(1093088045);
        model = BinaryData.fromObject(model).toObject(JobsSummary.class);
        Assertions.assertEquals(2127551556, model.failedJobs());
        Assertions.assertEquals(2032289729, model.suspendedJobs());
        Assertions.assertEquals(1093088045, model.inProgressJobs());
    }
}
