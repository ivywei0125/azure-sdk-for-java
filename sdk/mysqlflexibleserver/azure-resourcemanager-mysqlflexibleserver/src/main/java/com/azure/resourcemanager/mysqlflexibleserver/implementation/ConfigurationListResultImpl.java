// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.implementation;

import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ConfigurationInner;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ConfigurationListResultInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.Configuration;
import com.azure.resourcemanager.mysqlflexibleserver.models.ConfigurationListResult;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ConfigurationListResultImpl implements ConfigurationListResult {
    private ConfigurationListResultInner innerObject;

    private final com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager;

    ConfigurationListResultImpl(ConfigurationListResultInner innerObject,
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<Configuration> value() {
        List<ConfigurationInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new ConfigurationImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public ConfigurationListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager() {
        return this.serviceManager;
    }
}
