// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of the network rule.
 */
@Fluent
public final class AzureFirewallNetworkRule {
    /*
     * Name of the network rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Description of the rule.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Array of AzureFirewallNetworkRuleProtocols.
     */
    @JsonProperty(value = "protocols")
    private List<AzureFirewallNetworkRuleProtocol> protocols;

    /*
     * List of source IP addresses for this rule.
     */
    @JsonProperty(value = "sourceAddresses")
    private List<String> sourceAddresses;

    /*
     * List of destination IP addresses.
     */
    @JsonProperty(value = "destinationAddresses")
    private List<String> destinationAddresses;

    /*
     * List of destination ports.
     */
    @JsonProperty(value = "destinationPorts")
    private List<String> destinationPorts;

    /*
     * List of destination FQDNs.
     */
    @JsonProperty(value = "destinationFqdns")
    private List<String> destinationFqdns;

    /*
     * List of source IpGroups for this rule.
     */
    @JsonProperty(value = "sourceIpGroups")
    private List<String> sourceIpGroups;

    /*
     * List of destination IpGroups for this rule.
     */
    @JsonProperty(value = "destinationIpGroups")
    private List<String> destinationIpGroups;

    /**
     * Creates an instance of AzureFirewallNetworkRule class.
     */
    public AzureFirewallNetworkRule() {
    }

    /**
     * Get the name property: Name of the network rule.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the network rule.
     * 
     * @param name the name value to set.
     * @return the AzureFirewallNetworkRule object itself.
     */
    public AzureFirewallNetworkRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: Description of the rule.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the rule.
     * 
     * @param description the description value to set.
     * @return the AzureFirewallNetworkRule object itself.
     */
    public AzureFirewallNetworkRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the protocols property: Array of AzureFirewallNetworkRuleProtocols.
     * 
     * @return the protocols value.
     */
    public List<AzureFirewallNetworkRuleProtocol> protocols() {
        return this.protocols;
    }

    /**
     * Set the protocols property: Array of AzureFirewallNetworkRuleProtocols.
     * 
     * @param protocols the protocols value to set.
     * @return the AzureFirewallNetworkRule object itself.
     */
    public AzureFirewallNetworkRule withProtocols(List<AzureFirewallNetworkRuleProtocol> protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * Get the sourceAddresses property: List of source IP addresses for this rule.
     * 
     * @return the sourceAddresses value.
     */
    public List<String> sourceAddresses() {
        return this.sourceAddresses;
    }

    /**
     * Set the sourceAddresses property: List of source IP addresses for this rule.
     * 
     * @param sourceAddresses the sourceAddresses value to set.
     * @return the AzureFirewallNetworkRule object itself.
     */
    public AzureFirewallNetworkRule withSourceAddresses(List<String> sourceAddresses) {
        this.sourceAddresses = sourceAddresses;
        return this;
    }

    /**
     * Get the destinationAddresses property: List of destination IP addresses.
     * 
     * @return the destinationAddresses value.
     */
    public List<String> destinationAddresses() {
        return this.destinationAddresses;
    }

    /**
     * Set the destinationAddresses property: List of destination IP addresses.
     * 
     * @param destinationAddresses the destinationAddresses value to set.
     * @return the AzureFirewallNetworkRule object itself.
     */
    public AzureFirewallNetworkRule withDestinationAddresses(List<String> destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
        return this;
    }

    /**
     * Get the destinationPorts property: List of destination ports.
     * 
     * @return the destinationPorts value.
     */
    public List<String> destinationPorts() {
        return this.destinationPorts;
    }

    /**
     * Set the destinationPorts property: List of destination ports.
     * 
     * @param destinationPorts the destinationPorts value to set.
     * @return the AzureFirewallNetworkRule object itself.
     */
    public AzureFirewallNetworkRule withDestinationPorts(List<String> destinationPorts) {
        this.destinationPorts = destinationPorts;
        return this;
    }

    /**
     * Get the destinationFqdns property: List of destination FQDNs.
     * 
     * @return the destinationFqdns value.
     */
    public List<String> destinationFqdns() {
        return this.destinationFqdns;
    }

    /**
     * Set the destinationFqdns property: List of destination FQDNs.
     * 
     * @param destinationFqdns the destinationFqdns value to set.
     * @return the AzureFirewallNetworkRule object itself.
     */
    public AzureFirewallNetworkRule withDestinationFqdns(List<String> destinationFqdns) {
        this.destinationFqdns = destinationFqdns;
        return this;
    }

    /**
     * Get the sourceIpGroups property: List of source IpGroups for this rule.
     * 
     * @return the sourceIpGroups value.
     */
    public List<String> sourceIpGroups() {
        return this.sourceIpGroups;
    }

    /**
     * Set the sourceIpGroups property: List of source IpGroups for this rule.
     * 
     * @param sourceIpGroups the sourceIpGroups value to set.
     * @return the AzureFirewallNetworkRule object itself.
     */
    public AzureFirewallNetworkRule withSourceIpGroups(List<String> sourceIpGroups) {
        this.sourceIpGroups = sourceIpGroups;
        return this;
    }

    /**
     * Get the destinationIpGroups property: List of destination IpGroups for this rule.
     * 
     * @return the destinationIpGroups value.
     */
    public List<String> destinationIpGroups() {
        return this.destinationIpGroups;
    }

    /**
     * Set the destinationIpGroups property: List of destination IpGroups for this rule.
     * 
     * @param destinationIpGroups the destinationIpGroups value to set.
     * @return the AzureFirewallNetworkRule object itself.
     */
    public AzureFirewallNetworkRule withDestinationIpGroups(List<String> destinationIpGroups) {
        this.destinationIpGroups = destinationIpGroups;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
