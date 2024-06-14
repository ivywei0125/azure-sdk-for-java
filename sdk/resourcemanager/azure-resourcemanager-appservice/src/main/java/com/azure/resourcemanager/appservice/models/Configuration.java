// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Non versioned Container App configuration properties that define the mutable settings of a Container app.
 */
@Fluent
public final class Configuration {
    /*
     * Collection of secrets used by a Container app
     */
    @JsonProperty(value = "secrets")
    private List<Secret> secrets;

    /*
     * ActiveRevisionsMode controls how active revisions are handled for the Container app:
     * <list><item>Multiple: multiple revisions can be active. If no value if provided, this is the default</item><item>Single: Only one revision can be active at a time. Revision weights can not be used in this mode</item></list>
     */
    @JsonProperty(value = "activeRevisionsMode")
    private ActiveRevisionsMode activeRevisionsMode;

    /*
     * Ingress configurations.
     */
    @JsonProperty(value = "ingress")
    private Ingress ingress;

    /*
     * Collection of private container registry credentials for containers used by the Container app
     */
    @JsonProperty(value = "registries")
    private List<RegistryCredentials> registries;

    /**
     * Creates an instance of Configuration class.
     */
    public Configuration() {
    }

    /**
     * Get the secrets property: Collection of secrets used by a Container app.
     *
     * @return the secrets value.
     */
    public List<Secret> secrets() {
        return this.secrets;
    }

    /**
     * Set the secrets property: Collection of secrets used by a Container app.
     *
     * @param secrets the secrets value to set.
     * @return the Configuration object itself.
     */
    public Configuration withSecrets(List<Secret> secrets) {
        this.secrets = secrets;
        return this;
    }

    /**
     * Get the activeRevisionsMode property: ActiveRevisionsMode controls how active revisions are handled for the
     * Container app:
     * &lt;list&gt;&lt;item&gt;Multiple: multiple revisions can be active. If no value if provided, this is the
     * default&lt;/item&gt;&lt;item&gt;Single: Only one revision can be active at a time. Revision weights can not be
     * used in this mode&lt;/item&gt;&lt;/list&gt;.
     *
     * @return the activeRevisionsMode value.
     */
    public ActiveRevisionsMode activeRevisionsMode() {
        return this.activeRevisionsMode;
    }

    /**
     * Set the activeRevisionsMode property: ActiveRevisionsMode controls how active revisions are handled for the
     * Container app:
     * &lt;list&gt;&lt;item&gt;Multiple: multiple revisions can be active. If no value if provided, this is the
     * default&lt;/item&gt;&lt;item&gt;Single: Only one revision can be active at a time. Revision weights can not be
     * used in this mode&lt;/item&gt;&lt;/list&gt;.
     *
     * @param activeRevisionsMode the activeRevisionsMode value to set.
     * @return the Configuration object itself.
     */
    public Configuration withActiveRevisionsMode(ActiveRevisionsMode activeRevisionsMode) {
        this.activeRevisionsMode = activeRevisionsMode;
        return this;
    }

    /**
     * Get the ingress property: Ingress configurations.
     *
     * @return the ingress value.
     */
    public Ingress ingress() {
        return this.ingress;
    }

    /**
     * Set the ingress property: Ingress configurations.
     *
     * @param ingress the ingress value to set.
     * @return the Configuration object itself.
     */
    public Configuration withIngress(Ingress ingress) {
        this.ingress = ingress;
        return this;
    }

    /**
     * Get the registries property: Collection of private container registry credentials for containers used by the
     * Container app.
     *
     * @return the registries value.
     */
    public List<RegistryCredentials> registries() {
        return this.registries;
    }

    /**
     * Set the registries property: Collection of private container registry credentials for containers used by the
     * Container app.
     *
     * @param registries the registries value to set.
     * @return the Configuration object itself.
     */
    public Configuration withRegistries(List<RegistryCredentials> registries) {
        this.registries = registries;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (secrets() != null) {
            secrets().forEach(e -> e.validate());
        }
        if (ingress() != null) {
            ingress().validate();
        }
        if (registries() != null) {
            registries().forEach(e -> e.validate());
        }
    }
}
