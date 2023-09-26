// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterJobInner;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterJob;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterJobProperties;

public final class ClusterJobImpl implements ClusterJob {
    private ClusterJobInner innerObject;

    private final com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager serviceManager;

    ClusterJobImpl(
        ClusterJobInner innerObject,
        com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public ClusterJobProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ClusterJobInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager manager() {
        return this.serviceManager;
    }
}
