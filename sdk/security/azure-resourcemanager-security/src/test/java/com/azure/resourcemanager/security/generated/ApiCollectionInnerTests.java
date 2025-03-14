// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.ApiCollectionInner;

public final class ApiCollectionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiCollectionInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"displayName\":\"uporqzdfu\",\"discoveredVia\":\"zvkfv\",\"baseUrl\":\"nq\",\"numberOfApiEndpoints\":8747604723179169845,\"numberOfInactiveApiEndpoints\":3069133497157477777,\"numberOfUnauthenticatedApiEndpoints\":8706926326017174525,\"numberOfExternalApiEndpoints\":1866158858475312478,\"numberOfApiEndpointsWithSensitiveDataExposed\":5449936747239088069,\"sensitivityLabel\":\"bemzqkzszuwi\"},\"id\":\"tglxx\",\"name\":\"ljfp\",\"type\":\"picrmnzhrgmqgjsx\"}")
            .toObject(ApiCollectionInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiCollectionInner model = new ApiCollectionInner();
        model = BinaryData.fromObject(model).toObject(ApiCollectionInner.class);
    }
}
