// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.pineconevectordb.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.pineconevectordb.PineconeVectorDbManager;
import com.azure.resourcemanager.pineconevectordb.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.pineconevectordb.models.OrganizationResource;
import com.azure.resourcemanager.pineconevectordb.models.SingleSignOnStates;
import com.azure.resourcemanager.pineconevectordb.models.SingleSignOnType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class OrganizationsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"marketplace\":{\"subscriptionId\":\"uofqwe\",\"subscriptionStatus\":\"Unsubscribed\",\"offerDetails\":{\"publisherId\":\"menevfyexfwh\",\"offerId\":\"bcibvyvdcsitynn\",\"planId\":\"amdecte\",\"planName\":\"iqscjeypv\",\"termUnit\":\"zrkgqhcjrefovg\",\"termId\":\"qsl\"}},\"user\":{\"firstName\":\"yyvxyqjpkcattpn\",\"lastName\":\"jcrcczsqpjhvmda\",\"emailAddress\":\"v\",\"upn\":\"sounqecanoaeu\",\"phoneNumber\":\"hy\"},\"provisioningState\":\"Succeeded\",\"partnerProperties\":{\"displayName\":\"pmopjmc\"},\"singleSignOnProperties\":{\"type\":\"Saml\",\"state\":\"Enable\",\"enterpriseAppId\":\"thfuiuaodsfcpkvx\",\"url\":\"puozmyzydag\",\"aadDomains\":[\"xbezyiuokktwh\",\"dxwzywqsmbsurexi\",\"o\"]}},\"identity\":{\"principalId\":\"cfsf\",\"tenantId\":\"ymddys\",\"type\":\"SystemAssigned,UserAssigned\",\"userAssignedIdentities\":{\"vkd\":{\"principalId\":\"xhqyudxorrqnb\",\"clientId\":\"czvyifq\"},\"ulexxbczwtr\":{\"principalId\":\"sllr\",\"clientId\":\"vdfwatkpn\"},\"zdobpxjmflbvvnch\":{\"principalId\":\"iqzbq\",\"clientId\":\"sovmyokacspkwl\"}}},\"location\":\"cciw\",\"tags\":{\"foskghsauuimj\":\"uqkhrsajiwku\"},\"id\":\"vxieduugidyj\",\"name\":\"rfbyaosvexcso\",\"type\":\"pclhocohslk\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PineconeVectorDbManager manager = PineconeVectorDbManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<OrganizationResource> response
            = manager.organizations().listByResourceGroup("yggdtjixh", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("cciw", response.iterator().next().location());
        Assertions.assertEquals("uqkhrsajiwku", response.iterator().next().tags().get("foskghsauuimj"));
        Assertions.assertEquals("uofqwe", response.iterator().next().properties().marketplace().subscriptionId());
        Assertions.assertEquals("menevfyexfwh",
            response.iterator().next().properties().marketplace().offerDetails().publisherId());
        Assertions.assertEquals("bcibvyvdcsitynn",
            response.iterator().next().properties().marketplace().offerDetails().offerId());
        Assertions.assertEquals("amdecte",
            response.iterator().next().properties().marketplace().offerDetails().planId());
        Assertions.assertEquals("iqscjeypv",
            response.iterator().next().properties().marketplace().offerDetails().planName());
        Assertions.assertEquals("zrkgqhcjrefovg",
            response.iterator().next().properties().marketplace().offerDetails().termUnit());
        Assertions.assertEquals("qsl", response.iterator().next().properties().marketplace().offerDetails().termId());
        Assertions.assertEquals("yyvxyqjpkcattpn", response.iterator().next().properties().user().firstName());
        Assertions.assertEquals("jcrcczsqpjhvmda", response.iterator().next().properties().user().lastName());
        Assertions.assertEquals("v", response.iterator().next().properties().user().emailAddress());
        Assertions.assertEquals("sounqecanoaeu", response.iterator().next().properties().user().upn());
        Assertions.assertEquals("hy", response.iterator().next().properties().user().phoneNumber());
        Assertions.assertEquals("pmopjmc", response.iterator().next().properties().partnerProperties().displayName());
        Assertions.assertEquals(SingleSignOnType.SAML,
            response.iterator().next().properties().singleSignOnProperties().type());
        Assertions.assertEquals(SingleSignOnStates.ENABLE,
            response.iterator().next().properties().singleSignOnProperties().state());
        Assertions.assertEquals("thfuiuaodsfcpkvx",
            response.iterator().next().properties().singleSignOnProperties().enterpriseAppId());
        Assertions.assertEquals("puozmyzydag", response.iterator().next().properties().singleSignOnProperties().url());
        Assertions.assertEquals("xbezyiuokktwh",
            response.iterator().next().properties().singleSignOnProperties().aadDomains().get(0));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED,
            response.iterator().next().identity().type());
    }
}
