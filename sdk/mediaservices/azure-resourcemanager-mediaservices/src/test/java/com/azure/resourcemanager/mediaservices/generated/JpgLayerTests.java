// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.JpgLayer;
import org.junit.jupiter.api.Assertions;

public final class JpgLayerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JpgLayer model = BinaryData
            .fromString("{\"quality\":1042320973,\"width\":\"dclxgc\",\"height\":\"nfnw\",\"label\":\"tmvpdvjdhtt\"}")
            .toObject(JpgLayer.class);
        Assertions.assertEquals("dclxgc", model.width());
        Assertions.assertEquals("nfnw", model.height());
        Assertions.assertEquals("tmvpdvjdhtt", model.label());
        Assertions.assertEquals(1042320973, model.quality());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JpgLayer model
            = new JpgLayer().withWidth("dclxgc").withHeight("nfnw").withLabel("tmvpdvjdhtt").withQuality(1042320973);
        model = BinaryData.fromObject(model).toObject(JpgLayer.class);
        Assertions.assertEquals("dclxgc", model.width());
        Assertions.assertEquals("nfnw", model.height());
        Assertions.assertEquals("tmvpdvjdhtt", model.label());
        Assertions.assertEquals(1042320973, model.quality());
    }
}
