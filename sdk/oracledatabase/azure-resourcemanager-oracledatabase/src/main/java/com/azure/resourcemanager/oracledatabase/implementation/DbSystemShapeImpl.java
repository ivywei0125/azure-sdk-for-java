// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.oracledatabase.fluent.models.DbSystemShapeInner;
import com.azure.resourcemanager.oracledatabase.models.DbSystemShape;
import com.azure.resourcemanager.oracledatabase.models.DbSystemShapeProperties;

public final class DbSystemShapeImpl implements DbSystemShape {
    private DbSystemShapeInner innerObject;

    private final com.azure.resourcemanager.oracledatabase.OracleDatabaseManager serviceManager;

    DbSystemShapeImpl(DbSystemShapeInner innerObject,
        com.azure.resourcemanager.oracledatabase.OracleDatabaseManager serviceManager) {
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

    public DbSystemShapeProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public DbSystemShapeInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager() {
        return this.serviceManager;
    }
}
