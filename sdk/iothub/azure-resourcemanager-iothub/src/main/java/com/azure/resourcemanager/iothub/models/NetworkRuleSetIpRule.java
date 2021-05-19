// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IP Rule to be applied as part of Network Rule Set. */
@Fluent
public final class NetworkRuleSetIpRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkRuleSetIpRule.class);

    /*
     * Name of the IP filter rule.
     */
    @JsonProperty(value = "filterName", required = true)
    private String filterName;

    /*
     * IP Filter Action
     */
    @JsonProperty(value = "action")
    private NetworkRuleIpAction action;

    /*
     * A string that contains the IP address range in CIDR notation for the
     * rule.
     */
    @JsonProperty(value = "ipMask", required = true)
    private String ipMask;

    /**
     * Get the filterName property: Name of the IP filter rule.
     *
     * @return the filterName value.
     */
    public String filterName() {
        return this.filterName;
    }

    /**
     * Set the filterName property: Name of the IP filter rule.
     *
     * @param filterName the filterName value to set.
     * @return the NetworkRuleSetIpRule object itself.
     */
    public NetworkRuleSetIpRule withFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }

    /**
     * Get the action property: IP Filter Action.
     *
     * @return the action value.
     */
    public NetworkRuleIpAction action() {
        return this.action;
    }

    /**
     * Set the action property: IP Filter Action.
     *
     * @param action the action value to set.
     * @return the NetworkRuleSetIpRule object itself.
     */
    public NetworkRuleSetIpRule withAction(NetworkRuleIpAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the ipMask property: A string that contains the IP address range in CIDR notation for the rule.
     *
     * @return the ipMask value.
     */
    public String ipMask() {
        return this.ipMask;
    }

    /**
     * Set the ipMask property: A string that contains the IP address range in CIDR notation for the rule.
     *
     * @param ipMask the ipMask value to set.
     * @return the NetworkRuleSetIpRule object itself.
     */
    public NetworkRuleSetIpRule withIpMask(String ipMask) {
        this.ipMask = ipMask;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (filterName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property filterName in model NetworkRuleSetIpRule"));
        }
        if (ipMask() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property ipMask in model NetworkRuleSetIpRule"));
        }
    }
}