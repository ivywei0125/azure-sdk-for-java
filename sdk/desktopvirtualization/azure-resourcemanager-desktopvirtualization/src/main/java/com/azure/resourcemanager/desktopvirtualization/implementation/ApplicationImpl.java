// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ApplicationInner;
import com.azure.resourcemanager.desktopvirtualization.models.Application;
import com.azure.resourcemanager.desktopvirtualization.models.ApplicationPatch;
import com.azure.resourcemanager.desktopvirtualization.models.CommandLineSetting;
import com.azure.resourcemanager.desktopvirtualization.models.RemoteApplicationType;
import java.util.Map;

public final class ApplicationImpl implements Application, Application.Definition, Application.Update {
    private ApplicationInner innerObject;

    private final com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String objectId() {
        return this.innerModel().objectId();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String friendlyName() {
        return this.innerModel().friendlyName();
    }

    public String filePath() {
        return this.innerModel().filePath();
    }

    public String msixPackageFamilyName() {
        return this.innerModel().msixPackageFamilyName();
    }

    public String msixPackageApplicationId() {
        return this.innerModel().msixPackageApplicationId();
    }

    public RemoteApplicationType applicationType() {
        return this.innerModel().applicationType();
    }

    public CommandLineSetting commandLineSetting() {
        return this.innerModel().commandLineSetting();
    }

    public String commandLineArguments() {
        return this.innerModel().commandLineArguments();
    }

    public Boolean showInPortal() {
        return this.innerModel().showInPortal();
    }

    public String iconPath() {
        return this.innerModel().iconPath();
    }

    public Integer iconIndex() {
        return this.innerModel().iconIndex();
    }

    public String iconHash() {
        return this.innerModel().iconHash();
    }

    public byte[] iconContent() {
        return this.innerModel().iconContent();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ApplicationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String applicationGroupName;

    private String applicationName;

    private ApplicationPatch updateApplication;

    public ApplicationImpl withExistingApplicationGroup(String resourceGroupName, String applicationGroupName) {
        this.resourceGroupName = resourceGroupName;
        this.applicationGroupName = applicationGroupName;
        return this;
    }

    public Application create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .createOrUpdateWithResponse(
                    resourceGroupName, applicationGroupName, applicationName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Application create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .createOrUpdateWithResponse(
                    resourceGroupName, applicationGroupName, applicationName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ApplicationImpl(
        String name, com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager) {
        this.innerObject = new ApplicationInner();
        this.serviceManager = serviceManager;
        this.applicationName = name;
    }

    public ApplicationImpl update() {
        this.updateApplication = new ApplicationPatch();
        return this;
    }

    public Application apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .updateWithResponse(
                    resourceGroupName, applicationGroupName, applicationName, updateApplication, Context.NONE)
                .getValue();
        return this;
    }

    public Application apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .updateWithResponse(
                    resourceGroupName, applicationGroupName, applicationName, updateApplication, context)
                .getValue();
        return this;
    }

    ApplicationImpl(
        ApplicationInner innerObject,
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.applicationGroupName = Utils.getValueFromIdByName(innerObject.id(), "applicationGroups");
        this.applicationName = Utils.getValueFromIdByName(innerObject.id(), "applications");
    }

    public Application refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .getWithResponse(resourceGroupName, applicationGroupName, applicationName, Context.NONE)
                .getValue();
        return this;
    }

    public Application refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .getWithResponse(resourceGroupName, applicationGroupName, applicationName, context)
                .getValue();
        return this;
    }

    public ApplicationImpl withCommandLineSetting(CommandLineSetting commandLineSetting) {
        if (isInCreateMode()) {
            this.innerModel().withCommandLineSetting(commandLineSetting);
            return this;
        } else {
            this.updateApplication.withCommandLineSetting(commandLineSetting);
            return this;
        }
    }

    public ApplicationImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.innerModel().withDescription(description);
            return this;
        } else {
            this.updateApplication.withDescription(description);
            return this;
        }
    }

    public ApplicationImpl withFriendlyName(String friendlyName) {
        if (isInCreateMode()) {
            this.innerModel().withFriendlyName(friendlyName);
            return this;
        } else {
            this.updateApplication.withFriendlyName(friendlyName);
            return this;
        }
    }

    public ApplicationImpl withFilePath(String filePath) {
        if (isInCreateMode()) {
            this.innerModel().withFilePath(filePath);
            return this;
        } else {
            this.updateApplication.withFilePath(filePath);
            return this;
        }
    }

    public ApplicationImpl withMsixPackageFamilyName(String msixPackageFamilyName) {
        if (isInCreateMode()) {
            this.innerModel().withMsixPackageFamilyName(msixPackageFamilyName);
            return this;
        } else {
            this.updateApplication.withMsixPackageFamilyName(msixPackageFamilyName);
            return this;
        }
    }

    public ApplicationImpl withMsixPackageApplicationId(String msixPackageApplicationId) {
        if (isInCreateMode()) {
            this.innerModel().withMsixPackageApplicationId(msixPackageApplicationId);
            return this;
        } else {
            this.updateApplication.withMsixPackageApplicationId(msixPackageApplicationId);
            return this;
        }
    }

    public ApplicationImpl withApplicationType(RemoteApplicationType applicationType) {
        if (isInCreateMode()) {
            this.innerModel().withApplicationType(applicationType);
            return this;
        } else {
            this.updateApplication.withApplicationType(applicationType);
            return this;
        }
    }

    public ApplicationImpl withCommandLineArguments(String commandLineArguments) {
        if (isInCreateMode()) {
            this.innerModel().withCommandLineArguments(commandLineArguments);
            return this;
        } else {
            this.updateApplication.withCommandLineArguments(commandLineArguments);
            return this;
        }
    }

    public ApplicationImpl withShowInPortal(Boolean showInPortal) {
        if (isInCreateMode()) {
            this.innerModel().withShowInPortal(showInPortal);
            return this;
        } else {
            this.updateApplication.withShowInPortal(showInPortal);
            return this;
        }
    }

    public ApplicationImpl withIconPath(String iconPath) {
        if (isInCreateMode()) {
            this.innerModel().withIconPath(iconPath);
            return this;
        } else {
            this.updateApplication.withIconPath(iconPath);
            return this;
        }
    }

    public ApplicationImpl withIconIndex(Integer iconIndex) {
        if (isInCreateMode()) {
            this.innerModel().withIconIndex(iconIndex);
            return this;
        } else {
            this.updateApplication.withIconIndex(iconIndex);
            return this;
        }
    }

    public ApplicationImpl withTags(Map<String, String> tags) {
        this.updateApplication.withTags(tags);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
