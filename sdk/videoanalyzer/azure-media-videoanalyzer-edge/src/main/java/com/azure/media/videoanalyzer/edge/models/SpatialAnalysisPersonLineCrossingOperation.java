// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Defines a Spatial Analysis person line crossing operation. This requires the Azure Cognitive Services Spatial
 * analysis module to be deployed alongside the Video Analyzer module, please see https://aka.ms/ava-spatial-analysis
 * for more information.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonTypeName("#Microsoft.VideoAnalyzer.SpatialAnalysisPersonLineCrossingOperation")
@Fluent
public final class SpatialAnalysisPersonLineCrossingOperation extends SpatialAnalysisTypedOperationBase {
    /*
     * The list of lines with optional events.
     */
    @JsonProperty(value = "lines", required = true)
    private List<SpatialAnalysisPersonLineCrossingLineEvents> lines;

    /**
     * Creates an instance of SpatialAnalysisPersonLineCrossingOperation class.
     *
     * @param lines the lines value to set.
     */
    @JsonCreator
    public SpatialAnalysisPersonLineCrossingOperation(
            @JsonProperty(value = "lines", required = true) List<SpatialAnalysisPersonLineCrossingLineEvents> lines) {
        this.lines = lines;
    }

    /**
     * Get the lines property: The list of lines with optional events.
     *
     * @return the lines value.
     */
    public List<SpatialAnalysisPersonLineCrossingLineEvents> getLines() {
        return this.lines;
    }

    /** {@inheritDoc} */
    @Override
    public SpatialAnalysisPersonLineCrossingOperation setDebug(String debug) {
        super.setDebug(debug);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SpatialAnalysisPersonLineCrossingOperation setCameraConfiguration(String cameraConfiguration) {
        super.setCameraConfiguration(cameraConfiguration);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SpatialAnalysisPersonLineCrossingOperation setDetectorNodeConfiguration(String detectorNodeConfiguration) {
        super.setDetectorNodeConfiguration(detectorNodeConfiguration);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SpatialAnalysisPersonLineCrossingOperation setEnableFaceMaskClassifier(String enableFaceMaskClassifier) {
        super.setEnableFaceMaskClassifier(enableFaceMaskClassifier);
        return this;
    }
}