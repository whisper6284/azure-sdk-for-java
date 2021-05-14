// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Alexa channel definition. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "channelName")
@JsonTypeName("AlexaChannel")
@Fluent
public final class AlexaChannel extends Channel {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AlexaChannel.class);

    /*
     * The set of properties specific to Alexa channel resource
     */
    @JsonProperty(value = "properties")
    private AlexaChannelProperties properties;

    /**
     * Get the properties property: The set of properties specific to Alexa channel resource.
     *
     * @return the properties value.
     */
    public AlexaChannelProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The set of properties specific to Alexa channel resource.
     *
     * @param properties the properties value to set.
     * @return the AlexaChannel object itself.
     */
    public AlexaChannel withProperties(AlexaChannelProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (properties() != null) {
            properties().validate();
        }
    }
}