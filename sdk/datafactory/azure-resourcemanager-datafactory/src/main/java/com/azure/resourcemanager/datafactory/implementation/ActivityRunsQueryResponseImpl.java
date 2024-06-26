// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.resourcemanager.datafactory.fluent.models.ActivityRunsQueryResponseInner;
import com.azure.resourcemanager.datafactory.models.ActivityRun;
import com.azure.resourcemanager.datafactory.models.ActivityRunsQueryResponse;
import java.util.Collections;
import java.util.List;

public final class ActivityRunsQueryResponseImpl implements ActivityRunsQueryResponse {
    private ActivityRunsQueryResponseInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    ActivityRunsQueryResponseImpl(ActivityRunsQueryResponseInner innerObject,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ActivityRun> value() {
        List<ActivityRun> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String continuationToken() {
        return this.innerModel().continuationToken();
    }

    public ActivityRunsQueryResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }
}
