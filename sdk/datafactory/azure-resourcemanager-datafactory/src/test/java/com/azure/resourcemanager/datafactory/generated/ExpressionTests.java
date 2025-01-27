// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Expression;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ExpressionTests {
    @Test
    public void testDeserialize() {
        Expression model = BinaryData.fromString("{\"value\":\"sivfomilo\"}").toObject(Expression.class);
        Assertions.assertEquals("sivfomilo", model.value());
    }

    @Test
    public void testSerialize() {
        Expression model = new Expression().withValue("sivfomilo");
        model = BinaryData.fromObject(model).toObject(Expression.class);
        Assertions.assertEquals("sivfomilo", model.value());
    }
}
