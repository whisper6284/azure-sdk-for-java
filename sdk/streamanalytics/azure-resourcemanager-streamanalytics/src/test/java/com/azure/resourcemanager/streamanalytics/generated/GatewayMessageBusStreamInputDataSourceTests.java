// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.models.GatewayMessageBusStreamInputDataSource;
import org.junit.jupiter.api.Assertions;

public final class GatewayMessageBusStreamInputDataSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GatewayMessageBusStreamInputDataSource model
            = BinaryData.fromString("{\"type\":\"GatewayMessageBus\",\"properties\":{\"topic\":\"eoellwptfdygp\"}}")
                .toObject(GatewayMessageBusStreamInputDataSource.class);
        Assertions.assertEquals("eoellwptfdygp", model.topic());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GatewayMessageBusStreamInputDataSource model
            = new GatewayMessageBusStreamInputDataSource().withTopic("eoellwptfdygp");
        model = BinaryData.fromObject(model).toObject(GatewayMessageBusStreamInputDataSource.class);
        Assertions.assertEquals("eoellwptfdygp", model.topic());
    }
}
