// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Global RAN Node ID.
 */
@Fluent
public final class GlobalRanNodeId {
    /*
     * PLMN Identifier
     */
    @JsonProperty(value = "plmnId", required = true)
    private PlmnId plmnId;

    /*
     * gNodeB identifier
     */
    @JsonProperty(value = "gNbId")
    private GNbId gNbId;

    /*
     * NG-eNodeB identifier
     */
    @JsonProperty(value = "ngeNbId")
    private String ngeNbId;

    /*
     * eNodeB identifier
     */
    @JsonProperty(value = "eNbId")
    private String eNbId;

    /*
     * N3 IWF identifier
     */
    @JsonProperty(value = "n3IwfId")
    private String n3IwfId;

    /*
     * W-AGF identifier
     */
    @JsonProperty(value = "wagfId")
    private String wagfId;

    /*
     * TNGF identifier
     */
    @JsonProperty(value = "tngfId")
    private String tngfId;

    /*
     * Network identifier
     */
    @JsonProperty(value = "nid")
    private String nid;

    /**
     * Creates an instance of GlobalRanNodeId class.
     */
    public GlobalRanNodeId() {
    }

    /**
     * Get the plmnId property: PLMN Identifier.
     * 
     * @return the plmnId value.
     */
    public PlmnId plmnId() {
        return this.plmnId;
    }

    /**
     * Set the plmnId property: PLMN Identifier.
     * 
     * @param plmnId the plmnId value to set.
     * @return the GlobalRanNodeId object itself.
     */
    public GlobalRanNodeId withPlmnId(PlmnId plmnId) {
        this.plmnId = plmnId;
        return this;
    }

    /**
     * Get the gNbId property: gNodeB identifier.
     * 
     * @return the gNbId value.
     */
    public GNbId gNbId() {
        return this.gNbId;
    }

    /**
     * Set the gNbId property: gNodeB identifier.
     * 
     * @param gNbId the gNbId value to set.
     * @return the GlobalRanNodeId object itself.
     */
    public GlobalRanNodeId withGNbId(GNbId gNbId) {
        this.gNbId = gNbId;
        return this;
    }

    /**
     * Get the ngeNbId property: NG-eNodeB identifier.
     * 
     * @return the ngeNbId value.
     */
    public String ngeNbId() {
        return this.ngeNbId;
    }

    /**
     * Set the ngeNbId property: NG-eNodeB identifier.
     * 
     * @param ngeNbId the ngeNbId value to set.
     * @return the GlobalRanNodeId object itself.
     */
    public GlobalRanNodeId withNgeNbId(String ngeNbId) {
        this.ngeNbId = ngeNbId;
        return this;
    }

    /**
     * Get the eNbId property: eNodeB identifier.
     * 
     * @return the eNbId value.
     */
    public String eNbId() {
        return this.eNbId;
    }

    /**
     * Set the eNbId property: eNodeB identifier.
     * 
     * @param eNbId the eNbId value to set.
     * @return the GlobalRanNodeId object itself.
     */
    public GlobalRanNodeId withENbId(String eNbId) {
        this.eNbId = eNbId;
        return this;
    }

    /**
     * Get the n3IwfId property: N3 IWF identifier.
     * 
     * @return the n3IwfId value.
     */
    public String n3IwfId() {
        return this.n3IwfId;
    }

    /**
     * Set the n3IwfId property: N3 IWF identifier.
     * 
     * @param n3IwfId the n3IwfId value to set.
     * @return the GlobalRanNodeId object itself.
     */
    public GlobalRanNodeId withN3IwfId(String n3IwfId) {
        this.n3IwfId = n3IwfId;
        return this;
    }

    /**
     * Get the wagfId property: W-AGF identifier.
     * 
     * @return the wagfId value.
     */
    public String wagfId() {
        return this.wagfId;
    }

    /**
     * Set the wagfId property: W-AGF identifier.
     * 
     * @param wagfId the wagfId value to set.
     * @return the GlobalRanNodeId object itself.
     */
    public GlobalRanNodeId withWagfId(String wagfId) {
        this.wagfId = wagfId;
        return this;
    }

    /**
     * Get the tngfId property: TNGF identifier.
     * 
     * @return the tngfId value.
     */
    public String tngfId() {
        return this.tngfId;
    }

    /**
     * Set the tngfId property: TNGF identifier.
     * 
     * @param tngfId the tngfId value to set.
     * @return the GlobalRanNodeId object itself.
     */
    public GlobalRanNodeId withTngfId(String tngfId) {
        this.tngfId = tngfId;
        return this;
    }

    /**
     * Get the nid property: Network identifier.
     * 
     * @return the nid value.
     */
    public String nid() {
        return this.nid;
    }

    /**
     * Set the nid property: Network identifier.
     * 
     * @param nid the nid value to set.
     * @return the GlobalRanNodeId object itself.
     */
    public GlobalRanNodeId withNid(String nid) {
        this.nid = nid;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (plmnId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property plmnId in model GlobalRanNodeId"));
        } else {
            plmnId().validate();
        }
        if (gNbId() != null) {
            gNbId().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GlobalRanNodeId.class);
}
