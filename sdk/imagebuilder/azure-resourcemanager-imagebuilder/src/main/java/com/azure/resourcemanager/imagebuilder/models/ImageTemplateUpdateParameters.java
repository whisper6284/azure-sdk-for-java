// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Parameters for updating an image template. */
@Fluent
public final class ImageTemplateUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImageTemplateUpdateParameters.class);

    /*
     * The identity of the image template, if configured.
     */
    @JsonProperty(value = "identity")
    private ImageTemplateIdentity identity;

    /*
     * The user-specified tags associated with the image template.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the identity property: The identity of the image template, if configured.
     *
     * @return the identity value.
     */
    public ImageTemplateIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the image template, if configured.
     *
     * @param identity the identity value to set.
     * @return the ImageTemplateUpdateParameters object itself.
     */
    public ImageTemplateUpdateParameters withIdentity(ImageTemplateIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the tags property: The user-specified tags associated with the image template.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The user-specified tags associated with the image template.
     *
     * @param tags the tags value to set.
     * @return the ImageTemplateUpdateParameters object itself.
     */
    public ImageTemplateUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
    }
}