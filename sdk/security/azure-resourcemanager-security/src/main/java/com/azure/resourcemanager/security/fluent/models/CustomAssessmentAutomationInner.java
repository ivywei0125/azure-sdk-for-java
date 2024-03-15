// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.security.models.SeverityEnum;
import com.azure.resourcemanager.security.models.SupportedCloudEnum;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Custom Assessment Automation.
 */
@Fluent
public final class CustomAssessmentAutomationInner extends ProxyResource {
    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * describes Custom Assessment Automation properties.
     */
    @JsonProperty(value = "properties")
    private CustomAssessmentAutomationProperties innerProperties;

    /**
     * Creates an instance of CustomAssessmentAutomationInner class.
     */
    public CustomAssessmentAutomationInner() {
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the innerProperties property: describes Custom Assessment Automation properties.
     * 
     * @return the innerProperties value.
     */
    private CustomAssessmentAutomationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the compressedQuery property: GZip encoded KQL query representing the assessment automation results
     * required.
     * 
     * @return the compressedQuery value.
     */
    public String compressedQuery() {
        return this.innerProperties() == null ? null : this.innerProperties().compressedQuery();
    }

    /**
     * Set the compressedQuery property: GZip encoded KQL query representing the assessment automation results
     * required.
     * 
     * @param compressedQuery the compressedQuery value to set.
     * @return the CustomAssessmentAutomationInner object itself.
     */
    public CustomAssessmentAutomationInner withCompressedQuery(String compressedQuery) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomAssessmentAutomationProperties();
        }
        this.innerProperties().withCompressedQuery(compressedQuery);
        return this;
    }

    /**
     * Get the supportedCloud property: Relevant cloud for the custom assessment automation.
     * 
     * @return the supportedCloud value.
     */
    public SupportedCloudEnum supportedCloud() {
        return this.innerProperties() == null ? null : this.innerProperties().supportedCloud();
    }

    /**
     * Set the supportedCloud property: Relevant cloud for the custom assessment automation.
     * 
     * @param supportedCloud the supportedCloud value to set.
     * @return the CustomAssessmentAutomationInner object itself.
     */
    public CustomAssessmentAutomationInner withSupportedCloud(SupportedCloudEnum supportedCloud) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomAssessmentAutomationProperties();
        }
        this.innerProperties().withSupportedCloud(supportedCloud);
        return this;
    }

    /**
     * Get the severity property: The severity to relate to the assessments generated by this assessment automation.
     * 
     * @return the severity value.
     */
    public SeverityEnum severity() {
        return this.innerProperties() == null ? null : this.innerProperties().severity();
    }

    /**
     * Set the severity property: The severity to relate to the assessments generated by this assessment automation.
     * 
     * @param severity the severity value to set.
     * @return the CustomAssessmentAutomationInner object itself.
     */
    public CustomAssessmentAutomationInner withSeverity(SeverityEnum severity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomAssessmentAutomationProperties();
        }
        this.innerProperties().withSeverity(severity);
        return this;
    }

    /**
     * Get the displayName property: The display name of the assessments generated by this assessment automation.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name of the assessments generated by this assessment automation.
     * 
     * @param displayName the displayName value to set.
     * @return the CustomAssessmentAutomationInner object itself.
     */
    public CustomAssessmentAutomationInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomAssessmentAutomationProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the description property: The description to relate to the assessments generated by this assessment
     * automation.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description to relate to the assessments generated by this assessment
     * automation.
     * 
     * @param description the description value to set.
     * @return the CustomAssessmentAutomationInner object itself.
     */
    public CustomAssessmentAutomationInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomAssessmentAutomationProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the remediationDescription property: The remediation description to relate to the assessments generated by
     * this assessment automation.
     * 
     * @return the remediationDescription value.
     */
    public String remediationDescription() {
        return this.innerProperties() == null ? null : this.innerProperties().remediationDescription();
    }

    /**
     * Set the remediationDescription property: The remediation description to relate to the assessments generated by
     * this assessment automation.
     * 
     * @param remediationDescription the remediationDescription value to set.
     * @return the CustomAssessmentAutomationInner object itself.
     */
    public CustomAssessmentAutomationInner withRemediationDescription(String remediationDescription) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomAssessmentAutomationProperties();
        }
        this.innerProperties().withRemediationDescription(remediationDescription);
        return this;
    }

    /**
     * Get the assessmentKey property: The assessment metadata key used when an assessment is generated for this
     * assessment automation.
     * 
     * @return the assessmentKey value.
     */
    public String assessmentKey() {
        return this.innerProperties() == null ? null : this.innerProperties().assessmentKey();
    }

    /**
     * Set the assessmentKey property: The assessment metadata key used when an assessment is generated for this
     * assessment automation.
     * 
     * @param assessmentKey the assessmentKey value to set.
     * @return the CustomAssessmentAutomationInner object itself.
     */
    public CustomAssessmentAutomationInner withAssessmentKey(String assessmentKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomAssessmentAutomationProperties();
        }
        this.innerProperties().withAssessmentKey(assessmentKey);
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
