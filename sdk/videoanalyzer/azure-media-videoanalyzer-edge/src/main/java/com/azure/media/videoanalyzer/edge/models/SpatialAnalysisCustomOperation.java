// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines a Spatial Analysis custom operation. This requires the Azure Cognitive Services Spatial analysis module to be
 * deployed alongside the Video Analyzer module, please see https://aka.ms/ava-spatial-analysis for more information.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonTypeName("#Microsoft.VideoAnalyzer.SpatialAnalysisCustomOperation")
@Fluent
public final class SpatialAnalysisCustomOperation extends SpatialAnalysisOperationBase {
    /*
     * Custom configuration to pass to the Azure Cognitive Services Spatial
     * Analysis module.
     */
    @JsonProperty(value = "extensionConfiguration", required = true)
    private String extensionConfiguration;

    /**
     * Creates an instance of SpatialAnalysisCustomOperation class.
     *
     * @param extensionConfiguration the extensionConfiguration value to set.
     */
    @JsonCreator
    public SpatialAnalysisCustomOperation(
            @JsonProperty(value = "extensionConfiguration", required = true) String extensionConfiguration) {
        this.extensionConfiguration = extensionConfiguration;
    }

    /**
     * Get the extensionConfiguration property: Custom configuration to pass to the Azure Cognitive Services Spatial
     * Analysis module.
     *
     * @return the extensionConfiguration value.
     */
    public String getExtensionConfiguration() {
        return this.extensionConfiguration;
    }
}