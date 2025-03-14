// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.administration.generated;

import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class CollectionsDeleteCollectionTests extends PurviewAccountClientTestBase {
    @Test
    @Disabled
    public void testCollectionsDeleteCollectionTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response = collectionsClient.deleteCollectionWithResponse("myCollection1", requestOptions);
        Assertions.assertEquals(204, response.getStatusCode());
        Assertions.assertEquals("Wed, 13 Sep 2017 18:04:32 GMT",
            response.getHeaders().get(HttpHeaderName.fromString("Date")).getValue());
        Assertions.assertEquals("nosniff",
            response.getHeaders().get(HttpHeaderName.fromString("X-Content-Type-Options")).getValue());
        Assertions.assertEquals("d5496da4-9c52-402f-b067-83cc9ddea888",
            response.getHeaders().get(HttpHeaderName.fromString("x-ms-request-id")).getValue());
        Assertions.assertEquals("25c78f97-0b0a-4fe9-ad39-883a482265cd",
            response.getHeaders().get(HttpHeaderName.fromString("x-ms-correlation-request-id")).getValue());
    }
}
