// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.hybridconnectivity.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager;
import com.azure.resourcemanager.hybridconnectivity.models.SolutionTypeResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SolutionTypesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"solutionType\":\"ysjkixqtnqttez\",\"description\":\"fffiak\",\"supportedAzureRegions\":[\"qqmtedltmmji\",\"yeozphvwauyqncy\"],\"solutionSettings\":[{\"name\":\"kvi\",\"displayName\":\"mdscwxqupev\",\"type\":\"hfstotxhojujbyp\",\"description\":\"lmcuvhixb\",\"allowedValues\":[\"yfwnylr\",\"ool\",\"ttpkiwkkbnujrywv\"],\"defaultValue\":\"y\"}]},\"id\":\"fpncurdo\",\"name\":\"wiithtywub\",\"type\":\"cbihwqk\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HybridConnectivityManager manager = HybridConnectivityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<SolutionTypeResource> response = manager.solutionTypes().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ysjkixqtnqttez", response.iterator().next().properties().solutionType());
        Assertions.assertEquals("fffiak", response.iterator().next().properties().description());
        Assertions.assertEquals("qqmtedltmmji", response.iterator().next().properties().supportedAzureRegions().get(0));
        Assertions.assertEquals("kvi", response.iterator().next().properties().solutionSettings().get(0).name());
        Assertions.assertEquals("mdscwxqupev",
            response.iterator().next().properties().solutionSettings().get(0).displayName());
        Assertions.assertEquals("hfstotxhojujbyp",
            response.iterator().next().properties().solutionSettings().get(0).type());
        Assertions.assertEquals("lmcuvhixb",
            response.iterator().next().properties().solutionSettings().get(0).description());
        Assertions.assertEquals("yfwnylr",
            response.iterator().next().properties().solutionSettings().get(0).allowedValues().get(0));
        Assertions.assertEquals("y", response.iterator().next().properties().solutionSettings().get(0).defaultValue());
    }
}
