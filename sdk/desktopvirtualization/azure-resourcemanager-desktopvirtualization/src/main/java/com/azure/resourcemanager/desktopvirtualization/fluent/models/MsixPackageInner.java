// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackageApplications;
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackageDependencies;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Schema for MSIX Package properties. */
@Fluent
public final class MsixPackageInner extends ProxyResource {
    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Detailed properties for MSIX Package
     */
    @JsonProperty(value = "properties", required = true)
    private MsixPackageProperties innerProperties = new MsixPackageProperties();

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the innerProperties property: Detailed properties for MSIX Package.
     *
     * @return the innerProperties value.
     */
    private MsixPackageProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the imagePath property: VHD/CIM image path on Network Share.
     *
     * @return the imagePath value.
     */
    public String imagePath() {
        return this.innerProperties() == null ? null : this.innerProperties().imagePath();
    }

    /**
     * Set the imagePath property: VHD/CIM image path on Network Share.
     *
     * @param imagePath the imagePath value to set.
     * @return the MsixPackageInner object itself.
     */
    public MsixPackageInner withImagePath(String imagePath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MsixPackageProperties();
        }
        this.innerProperties().withImagePath(imagePath);
        return this;
    }

    /**
     * Get the packageName property: Package Name from appxmanifest.xml.
     *
     * @return the packageName value.
     */
    public String packageName() {
        return this.innerProperties() == null ? null : this.innerProperties().packageName();
    }

    /**
     * Set the packageName property: Package Name from appxmanifest.xml.
     *
     * @param packageName the packageName value to set.
     * @return the MsixPackageInner object itself.
     */
    public MsixPackageInner withPackageName(String packageName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MsixPackageProperties();
        }
        this.innerProperties().withPackageName(packageName);
        return this;
    }

    /**
     * Get the packageFamilyName property: Package Family Name from appxmanifest.xml. Contains Package Name and
     * Publisher name.
     *
     * @return the packageFamilyName value.
     */
    public String packageFamilyName() {
        return this.innerProperties() == null ? null : this.innerProperties().packageFamilyName();
    }

    /**
     * Set the packageFamilyName property: Package Family Name from appxmanifest.xml. Contains Package Name and
     * Publisher name.
     *
     * @param packageFamilyName the packageFamilyName value to set.
     * @return the MsixPackageInner object itself.
     */
    public MsixPackageInner withPackageFamilyName(String packageFamilyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MsixPackageProperties();
        }
        this.innerProperties().withPackageFamilyName(packageFamilyName);
        return this;
    }

    /**
     * Get the displayName property: User friendly Name to be displayed in the portal.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: User friendly Name to be displayed in the portal.
     *
     * @param displayName the displayName value to set.
     * @return the MsixPackageInner object itself.
     */
    public MsixPackageInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MsixPackageProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the packageRelativePath property: Relative Path to the package inside the image.
     *
     * @return the packageRelativePath value.
     */
    public String packageRelativePath() {
        return this.innerProperties() == null ? null : this.innerProperties().packageRelativePath();
    }

    /**
     * Set the packageRelativePath property: Relative Path to the package inside the image.
     *
     * @param packageRelativePath the packageRelativePath value to set.
     * @return the MsixPackageInner object itself.
     */
    public MsixPackageInner withPackageRelativePath(String packageRelativePath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MsixPackageProperties();
        }
        this.innerProperties().withPackageRelativePath(packageRelativePath);
        return this;
    }

    /**
     * Get the isRegularRegistration property: Specifies how to register Package in feed.
     *
     * @return the isRegularRegistration value.
     */
    public Boolean isRegularRegistration() {
        return this.innerProperties() == null ? null : this.innerProperties().isRegularRegistration();
    }

    /**
     * Set the isRegularRegistration property: Specifies how to register Package in feed.
     *
     * @param isRegularRegistration the isRegularRegistration value to set.
     * @return the MsixPackageInner object itself.
     */
    public MsixPackageInner withIsRegularRegistration(Boolean isRegularRegistration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MsixPackageProperties();
        }
        this.innerProperties().withIsRegularRegistration(isRegularRegistration);
        return this;
    }

    /**
     * Get the isActive property: Make this version of the package the active one across the hostpool.
     *
     * @return the isActive value.
     */
    public Boolean isActive() {
        return this.innerProperties() == null ? null : this.innerProperties().isActive();
    }

    /**
     * Set the isActive property: Make this version of the package the active one across the hostpool.
     *
     * @param isActive the isActive value to set.
     * @return the MsixPackageInner object itself.
     */
    public MsixPackageInner withIsActive(Boolean isActive) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MsixPackageProperties();
        }
        this.innerProperties().withIsActive(isActive);
        return this;
    }

    /**
     * Get the packageDependencies property: List of package dependencies.
     *
     * @return the packageDependencies value.
     */
    public List<MsixPackageDependencies> packageDependencies() {
        return this.innerProperties() == null ? null : this.innerProperties().packageDependencies();
    }

    /**
     * Set the packageDependencies property: List of package dependencies.
     *
     * @param packageDependencies the packageDependencies value to set.
     * @return the MsixPackageInner object itself.
     */
    public MsixPackageInner withPackageDependencies(List<MsixPackageDependencies> packageDependencies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MsixPackageProperties();
        }
        this.innerProperties().withPackageDependencies(packageDependencies);
        return this;
    }

    /**
     * Get the version property: Package Version found in the appxmanifest.xml.
     *
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Set the version property: Package Version found in the appxmanifest.xml.
     *
     * @param version the version value to set.
     * @return the MsixPackageInner object itself.
     */
    public MsixPackageInner withVersion(String version) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MsixPackageProperties();
        }
        this.innerProperties().withVersion(version);
        return this;
    }

    /**
     * Get the lastUpdated property: Date Package was last updated, found in the appxmanifest.xml.
     *
     * @return the lastUpdated value.
     */
    public OffsetDateTime lastUpdated() {
        return this.innerProperties() == null ? null : this.innerProperties().lastUpdated();
    }

    /**
     * Set the lastUpdated property: Date Package was last updated, found in the appxmanifest.xml.
     *
     * @param lastUpdated the lastUpdated value to set.
     * @return the MsixPackageInner object itself.
     */
    public MsixPackageInner withLastUpdated(OffsetDateTime lastUpdated) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MsixPackageProperties();
        }
        this.innerProperties().withLastUpdated(lastUpdated);
        return this;
    }

    /**
     * Get the packageApplications property: List of package applications.
     *
     * @return the packageApplications value.
     */
    public List<MsixPackageApplications> packageApplications() {
        return this.innerProperties() == null ? null : this.innerProperties().packageApplications();
    }

    /**
     * Set the packageApplications property: List of package applications.
     *
     * @param packageApplications the packageApplications value to set.
     * @return the MsixPackageInner object itself.
     */
    public MsixPackageInner withPackageApplications(List<MsixPackageApplications> packageApplications) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MsixPackageProperties();
        }
        this.innerProperties().withPackageApplications(packageApplications);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model MsixPackageInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MsixPackageInner.class);
}
