// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Office365Source;
import org.junit.jupiter.api.Test;

public final class Office365SourceTests {
    @Test
    public void testDeserialize() {
        Office365Source model =
            BinaryData.fromString("{\"type\":\"Office365Source\",\"\":{}}").toObject(Office365Source.class);
    }

    @Test
    public void testSerialize() {
        Office365Source model = new Office365Source();
        model = BinaryData.fromObject(model).toObject(Office365Source.class);
    }
}
