// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * A resource with narrative, extensions, and contained resources
 * Based on [FHIR DomainResource](https://www.hl7.org/fhir/domainresource.html).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "resourceType",
    defaultImpl = FhirR4DomainResource.class,
    visible = true)
@JsonTypeName("Fhir_R4_DomainResource")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Condition", value = FhirR4Condition.class),
    @JsonSubTypes.Type(name = "ResearchStudy", value = FhirR4ResearchStudy.class),
    @JsonSubTypes.Type(name = "Observation", value = FhirR4Observation.class) })
@Immutable
public class FhirR4DomainResource extends FhirR4Resource {

    /*
     * The resourceType property.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "resourceType")
    private String resourceType = "Fhir_R4_DomainResource";

    /*
     * Text summary of the resource, for human interpretation
     */
    @Generated
    @JsonProperty(value = "text")
    private FhirR4Narrative text;

    /*
     * Contained, inline Resources
     */
    @Generated
    @JsonProperty(value = "contained")
    private List<FhirR4Resource> contained;

    /*
     * Additional Content defined by implementations
     */
    @Generated
    @JsonProperty(value = "extension")
    private List<FhirR4Extension> extension;

    /*
     * Extensions that cannot be ignored
     */
    @Generated
    @JsonProperty(value = "modifierExtension")
    private List<FhirR4Extension> modifierExtension;

    /**
     * Creates an instance of FhirR4DomainResource class.
     *
     * @param resourceType the resourceType value to set.
     */
    @Generated
    @JsonCreator
    protected FhirR4DomainResource(@JsonProperty(value = "resourceType") String resourceType) {
        super(resourceType);
    }

    /**
     * Get the resourceType property: The resourceType property.
     *
     * @return the resourceType value.
     */
    @Generated
    @Override
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * Get the text property: Text summary of the resource, for human interpretation.
     *
     * @return the text value.
     */
    @Generated
    public FhirR4Narrative getText() {
        return this.text;
    }

    /**
     * Get the contained property: Contained, inline Resources.
     *
     * @return the contained value.
     */
    @Generated
    public List<FhirR4Resource> getContained() {
        return this.contained;
    }

    /**
     * Get the extension property: Additional Content defined by implementations.
     *
     * @return the extension value.
     */
    @Generated
    public List<FhirR4Extension> getExtension() {
        return this.extension;
    }

    /**
     * Get the modifierExtension property: Extensions that cannot be ignored.
     *
     * @return the modifierExtension value.
     */
    @Generated
    public List<FhirR4Extension> getModifierExtension() {
        return this.modifierExtension;
    }
}
