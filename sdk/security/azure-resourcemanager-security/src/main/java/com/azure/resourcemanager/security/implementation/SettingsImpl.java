// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.SettingsClient;
import com.azure.resourcemanager.security.fluent.models.SettingInner;
import com.azure.resourcemanager.security.models.Setting;
import com.azure.resourcemanager.security.models.SettingNameAutoGenerated;
import com.azure.resourcemanager.security.models.Settings;

public final class SettingsImpl implements Settings {
    private static final ClientLogger LOGGER = new ClientLogger(SettingsImpl.class);

    private final SettingsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public SettingsImpl(SettingsClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Setting> list() {
        PagedIterable<SettingInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SettingImpl(inner1, this.manager()));
    }

    public PagedIterable<Setting> list(Context context) {
        PagedIterable<SettingInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SettingImpl(inner1, this.manager()));
    }

    public Response<Setting> getWithResponse(SettingNameAutoGenerated settingName, Context context) {
        Response<SettingInner> inner = this.serviceClient().getWithResponse(settingName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SettingImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Setting get(SettingNameAutoGenerated settingName) {
        SettingInner inner = this.serviceClient().get(settingName);
        if (inner != null) {
            return new SettingImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Setting> updateWithResponse(SettingNameAutoGenerated settingName, SettingInner setting,
        Context context) {
        Response<SettingInner> inner = this.serviceClient().updateWithResponse(settingName, setting, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SettingImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Setting update(SettingNameAutoGenerated settingName, SettingInner setting) {
        SettingInner inner = this.serviceClient().update(settingName, setting);
        if (inner != null) {
            return new SettingImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private SettingsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
