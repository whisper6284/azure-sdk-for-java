// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapAvailabilityZonePair;
import org.junit.jupiter.api.Assertions;

public final class SapAvailabilityZonePairTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapAvailabilityZonePair model
            = BinaryData.fromString("{\"zoneA\":7560134099351640834,\"zoneB\":6203658775874976787}")
                .toObject(SapAvailabilityZonePair.class);
        Assertions.assertEquals(7560134099351640834L, model.zoneA());
        Assertions.assertEquals(6203658775874976787L, model.zoneB());
    }
}
