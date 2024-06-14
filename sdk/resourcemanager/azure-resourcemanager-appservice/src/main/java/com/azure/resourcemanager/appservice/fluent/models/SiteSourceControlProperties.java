// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.GitHubActionConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SiteSourceControl resource specific properties.
 */
@Fluent
public final class SiteSourceControlProperties {
    /*
     * Repository or source control URL.
     */
    @JsonProperty(value = "repoUrl")
    private String repoUrl;

    /*
     * Name of branch to use for deployment.
     */
    @JsonProperty(value = "branch")
    private String branch;

    /*
     * <code>true</code> to limit to manual integration; <code>false</code> to enable continuous integration (which configures webhooks into online repos like GitHub).
     */
    @JsonProperty(value = "isManualIntegration")
    private Boolean isManualIntegration;

    /*
     * <code>true</code> if this is deployed via GitHub action.
     */
    @JsonProperty(value = "isGitHubAction")
    private Boolean isGitHubAction;

    /*
     * <code>true</code> to enable deployment rollback; otherwise, <code>false</code>.
     */
    @JsonProperty(value = "deploymentRollbackEnabled")
    private Boolean deploymentRollbackEnabled;

    /*
     * <code>true</code> for a Mercurial repository; <code>false</code> for a Git repository.
     */
    @JsonProperty(value = "isMercurial")
    private Boolean isMercurial;

    /*
     * If GitHub Action is selected, than the associated configuration.
     */
    @JsonProperty(value = "gitHubActionConfiguration")
    private GitHubActionConfiguration gitHubActionConfiguration;

    /**
     * Creates an instance of SiteSourceControlProperties class.
     */
    public SiteSourceControlProperties() {
    }

    /**
     * Get the repoUrl property: Repository or source control URL.
     * 
     * @return the repoUrl value.
     */
    public String repoUrl() {
        return this.repoUrl;
    }

    /**
     * Set the repoUrl property: Repository or source control URL.
     * 
     * @param repoUrl the repoUrl value to set.
     * @return the SiteSourceControlProperties object itself.
     */
    public SiteSourceControlProperties withRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }

    /**
     * Get the branch property: Name of branch to use for deployment.
     * 
     * @return the branch value.
     */
    public String branch() {
        return this.branch;
    }

    /**
     * Set the branch property: Name of branch to use for deployment.
     * 
     * @param branch the branch value to set.
     * @return the SiteSourceControlProperties object itself.
     */
    public SiteSourceControlProperties withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get the isManualIntegration property: &lt;code&gt;true&lt;/code&gt; to limit to manual integration;
     * &lt;code&gt;false&lt;/code&gt; to enable continuous integration (which configures webhooks into online repos like
     * GitHub).
     * 
     * @return the isManualIntegration value.
     */
    public Boolean isManualIntegration() {
        return this.isManualIntegration;
    }

    /**
     * Set the isManualIntegration property: &lt;code&gt;true&lt;/code&gt; to limit to manual integration;
     * &lt;code&gt;false&lt;/code&gt; to enable continuous integration (which configures webhooks into online repos like
     * GitHub).
     * 
     * @param isManualIntegration the isManualIntegration value to set.
     * @return the SiteSourceControlProperties object itself.
     */
    public SiteSourceControlProperties withIsManualIntegration(Boolean isManualIntegration) {
        this.isManualIntegration = isManualIntegration;
        return this;
    }

    /**
     * Get the isGitHubAction property: &lt;code&gt;true&lt;/code&gt; if this is deployed via GitHub action.
     * 
     * @return the isGitHubAction value.
     */
    public Boolean isGitHubAction() {
        return this.isGitHubAction;
    }

    /**
     * Set the isGitHubAction property: &lt;code&gt;true&lt;/code&gt; if this is deployed via GitHub action.
     * 
     * @param isGitHubAction the isGitHubAction value to set.
     * @return the SiteSourceControlProperties object itself.
     */
    public SiteSourceControlProperties withIsGitHubAction(Boolean isGitHubAction) {
        this.isGitHubAction = isGitHubAction;
        return this;
    }

    /**
     * Get the deploymentRollbackEnabled property: &lt;code&gt;true&lt;/code&gt; to enable deployment rollback;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the deploymentRollbackEnabled value.
     */
    public Boolean deploymentRollbackEnabled() {
        return this.deploymentRollbackEnabled;
    }

    /**
     * Set the deploymentRollbackEnabled property: &lt;code&gt;true&lt;/code&gt; to enable deployment rollback;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param deploymentRollbackEnabled the deploymentRollbackEnabled value to set.
     * @return the SiteSourceControlProperties object itself.
     */
    public SiteSourceControlProperties withDeploymentRollbackEnabled(Boolean deploymentRollbackEnabled) {
        this.deploymentRollbackEnabled = deploymentRollbackEnabled;
        return this;
    }

    /**
     * Get the isMercurial property: &lt;code&gt;true&lt;/code&gt; for a Mercurial repository;
     * &lt;code&gt;false&lt;/code&gt; for a Git repository.
     * 
     * @return the isMercurial value.
     */
    public Boolean isMercurial() {
        return this.isMercurial;
    }

    /**
     * Set the isMercurial property: &lt;code&gt;true&lt;/code&gt; for a Mercurial repository;
     * &lt;code&gt;false&lt;/code&gt; for a Git repository.
     * 
     * @param isMercurial the isMercurial value to set.
     * @return the SiteSourceControlProperties object itself.
     */
    public SiteSourceControlProperties withIsMercurial(Boolean isMercurial) {
        this.isMercurial = isMercurial;
        return this;
    }

    /**
     * Get the gitHubActionConfiguration property: If GitHub Action is selected, than the associated configuration.
     * 
     * @return the gitHubActionConfiguration value.
     */
    public GitHubActionConfiguration gitHubActionConfiguration() {
        return this.gitHubActionConfiguration;
    }

    /**
     * Set the gitHubActionConfiguration property: If GitHub Action is selected, than the associated configuration.
     * 
     * @param gitHubActionConfiguration the gitHubActionConfiguration value to set.
     * @return the SiteSourceControlProperties object itself.
     */
    public SiteSourceControlProperties
        withGitHubActionConfiguration(GitHubActionConfiguration gitHubActionConfiguration) {
        this.gitHubActionConfiguration = gitHubActionConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (gitHubActionConfiguration() != null) {
            gitHubActionConfiguration().validate();
        }
    }
}
