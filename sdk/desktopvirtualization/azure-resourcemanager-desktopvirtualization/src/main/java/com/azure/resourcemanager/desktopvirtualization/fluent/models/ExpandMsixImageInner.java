// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackageApplications;
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackageDependencies;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Represents the definition of contents retrieved after expanding the MSIX Image. */
@Fluent
public final class ExpandMsixImageInner extends ProxyResource {
    /*
     * Detailed properties for ExpandMsixImage
     */
    @JsonProperty(value = "properties")
    private ExpandMsixImageProperties innerProperties;

    /**
     * Get the innerProperties property: Detailed properties for ExpandMsixImage.
     *
     * @return the innerProperties value.
     */
    private ExpandMsixImageProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the packageAlias property: Alias of MSIX Package.
     *
     * @return the packageAlias value.
     */
    public String packageAlias() {
        return this.innerProperties() == null ? null : this.innerProperties().packageAlias();
    }

    /**
     * Set the packageAlias property: Alias of MSIX Package.
     *
     * @param packageAlias the packageAlias value to set.
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withPackageAlias(String packageAlias) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpandMsixImageProperties();
        }
        this.innerProperties().withPackageAlias(packageAlias);
        return this;
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
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withImagePath(String imagePath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpandMsixImageProperties();
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
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withPackageName(String packageName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpandMsixImageProperties();
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
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withPackageFamilyName(String packageFamilyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpandMsixImageProperties();
        }
        this.innerProperties().withPackageFamilyName(packageFamilyName);
        return this;
    }

    /**
     * Get the packageFullName property: Package Full Name from appxmanifest.xml.
     *
     * @return the packageFullName value.
     */
    public String packageFullName() {
        return this.innerProperties() == null ? null : this.innerProperties().packageFullName();
    }

    /**
     * Set the packageFullName property: Package Full Name from appxmanifest.xml.
     *
     * @param packageFullName the packageFullName value to set.
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withPackageFullName(String packageFullName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpandMsixImageProperties();
        }
        this.innerProperties().withPackageFullName(packageFullName);
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
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpandMsixImageProperties();
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
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withPackageRelativePath(String packageRelativePath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpandMsixImageProperties();
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
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withIsRegularRegistration(Boolean isRegularRegistration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpandMsixImageProperties();
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
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withIsActive(Boolean isActive) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpandMsixImageProperties();
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
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withPackageDependencies(List<MsixPackageDependencies> packageDependencies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpandMsixImageProperties();
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
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withVersion(String version) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpandMsixImageProperties();
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
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withLastUpdated(OffsetDateTime lastUpdated) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpandMsixImageProperties();
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
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withPackageApplications(List<MsixPackageApplications> packageApplications) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpandMsixImageProperties();
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
