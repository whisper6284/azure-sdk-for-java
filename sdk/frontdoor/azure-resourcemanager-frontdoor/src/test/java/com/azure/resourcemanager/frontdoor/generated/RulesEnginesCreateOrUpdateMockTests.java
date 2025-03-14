// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.frontdoor.FrontDoorManager;
import com.azure.resourcemanager.frontdoor.models.HeaderAction;
import com.azure.resourcemanager.frontdoor.models.HeaderActionType;
import com.azure.resourcemanager.frontdoor.models.MatchProcessingBehavior;
import com.azure.resourcemanager.frontdoor.models.RouteConfiguration;
import com.azure.resourcemanager.frontdoor.models.RulesEngine;
import com.azure.resourcemanager.frontdoor.models.RulesEngineAction;
import com.azure.resourcemanager.frontdoor.models.RulesEngineMatchCondition;
import com.azure.resourcemanager.frontdoor.models.RulesEngineMatchVariable;
import com.azure.resourcemanager.frontdoor.models.RulesEngineOperator;
import com.azure.resourcemanager.frontdoor.models.RulesEngineRule;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class RulesEnginesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"resourceState\":\"Disabled\",\"rules\":[{\"name\":\"leseyqrhvyeldo\",\"priority\":353685526,\"action\":{\"requestHeaderActions\":[{\"headerActionType\":\"Delete\",\"headerName\":\"wiswskukjtasbvw\"},{\"headerActionType\":\"Delete\",\"headerName\":\"pkxkdtxfk\"}],\"responseHeaderActions\":[{\"headerActionType\":\"Overwrite\",\"headerName\":\"vtwknvgmmbugt\"}],\"routeConfigurationOverride\":{\"@odata.type\":\"RouteConfiguration\"}},\"matchConditions\":[{\"rulesEngineMatchVariable\":\"RequestUri\",\"rulesEngineOperator\":\"Contains\",\"rulesEngineMatchValue\":[]}],\"matchProcessingBehavior\":\"Stop\"},{\"name\":\"kueatgroeshoy\",\"priority\":1486961645,\"action\":{\"requestHeaderActions\":[{\"headerActionType\":\"Append\",\"headerName\":\"fqxkfaoyteh\"},{\"headerActionType\":\"Delete\",\"headerName\":\"uvjmv\"},{\"headerActionType\":\"Append\",\"headerName\":\"tdwckygr\"}],\"responseHeaderActions\":[{\"headerActionType\":\"Append\",\"headerName\":\"ndljdjuskbr\"}],\"routeConfigurationOverride\":{\"@odata.type\":\"RouteConfiguration\"}},\"matchConditions\":[{\"rulesEngineMatchVariable\":\"RequestPath\",\"rulesEngineOperator\":\"GeoMatch\",\"rulesEngineMatchValue\":[]},{\"rulesEngineMatchVariable\":\"RequestBody\",\"rulesEngineOperator\":\"BeginsWith\",\"rulesEngineMatchValue\":[]},{\"rulesEngineMatchVariable\":\"RequestPath\",\"rulesEngineOperator\":\"LessThanOrEqual\",\"rulesEngineMatchValue\":[]},{\"rulesEngineMatchVariable\":\"RequestBody\",\"rulesEngineOperator\":\"Any\",\"rulesEngineMatchValue\":[]}],\"matchProcessingBehavior\":\"Continue\"},{\"name\":\"gplwr\",\"priority\":614396820,\"action\":{\"requestHeaderActions\":[{\"headerActionType\":\"Overwrite\",\"headerName\":\"d\"}],\"responseHeaderActions\":[{\"headerActionType\":\"Overwrite\",\"headerName\":\"gkqu\"},{\"headerActionType\":\"Append\",\"headerName\":\"bwptdacarvvlf\"}],\"routeConfigurationOverride\":{\"@odata.type\":\"RouteConfiguration\"}},\"matchConditions\":[{\"rulesEngineMatchVariable\":\"IsMobile\",\"rulesEngineOperator\":\"EndsWith\",\"rulesEngineMatchValue\":[]}],\"matchProcessingBehavior\":\"Stop\"}]},\"id\":\"wenaz\",\"name\":\"r\",\"type\":\"hzr\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        FrontDoorManager manager = FrontDoorManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        RulesEngine response = manager.rulesEngines()
            .define("liuhqawmoaiancz")
            .withExistingFrontDoor("ewj", "s")
            .withRules(Arrays.asList(
                new RulesEngineRule().withName("slblxydkxrxvvb")
                    .withPriority(611172975)
                    .withAction(new RulesEngineAction()
                        .withRequestHeaderActions(Arrays.asList(
                            new HeaderAction().withHeaderActionType(HeaderActionType.APPEND)
                                .withHeaderName("fbqljnqkh"),
                            new HeaderAction().withHeaderActionType(HeaderActionType.DELETE).withHeaderName("h"),
                            new HeaderAction().withHeaderActionType(HeaderActionType.DELETE)
                                .withHeaderName("okulehurqlrqf")))
                        .withResponseHeaderActions(Arrays.asList(
                            new HeaderAction().withHeaderActionType(HeaderActionType.APPEND).withHeaderName("yur"),
                            new HeaderAction().withHeaderActionType(HeaderActionType.OVERWRITE).withHeaderName("hy"),
                            new HeaderAction().withHeaderActionType(HeaderActionType.DELETE).withHeaderName("xra")))
                        .withRouteConfigurationOverride(new RouteConfiguration()))
                    .withMatchConditions(Arrays.asList(
                        new RulesEngineMatchCondition().withRulesEngineMatchVariable(RulesEngineMatchVariable.POST_ARGS)
                            .withRulesEngineOperator(RulesEngineOperator.ANY)
                            .withRulesEngineMatchValue(Arrays.asList()),
                        new RulesEngineMatchCondition()
                            .withRulesEngineMatchVariable(RulesEngineMatchVariable.REQUEST_SCHEME)
                            .withRulesEngineOperator(RulesEngineOperator.BEGINS_WITH)
                            .withRulesEngineMatchValue(Arrays.asList()),
                        new RulesEngineMatchCondition()
                            .withRulesEngineMatchVariable(RulesEngineMatchVariable.REMOTE_ADDR)
                            .withRulesEngineOperator(RulesEngineOperator.LESS_THAN_OR_EQUAL)
                            .withRulesEngineMatchValue(Arrays.asList())))
                    .withMatchProcessingBehavior(MatchProcessingBehavior.STOP),
                new RulesEngineRule().withName("hbapxkiyf")
                    .withPriority(73723123)
                    .withAction(new RulesEngineAction()
                        .withRequestHeaderActions(Arrays.asList(
                            new HeaderAction().withHeaderActionType(HeaderActionType.DELETE).withHeaderName("jbuscg"),
                            new HeaderAction().withHeaderActionType(HeaderActionType.APPEND).withHeaderName("u"),
                            new HeaderAction().withHeaderActionType(HeaderActionType.APPEND)
                                .withHeaderName("oycblevpmc"),
                            new HeaderAction().withHeaderActionType(HeaderActionType.APPEND).withHeaderName("jy")))
                        .withResponseHeaderActions(Arrays.asList(
                            new HeaderAction().withHeaderActionType(HeaderActionType.OVERWRITE)
                                .withHeaderName("lzgsjgkzzlt"),
                            new HeaderAction().withHeaderActionType(HeaderActionType.APPEND)
                                .withHeaderName("hbzffovwmbjlzqs")))
                        .withRouteConfigurationOverride(new RouteConfiguration()))
                    .withMatchConditions(Arrays.asList(
                        new RulesEngineMatchCondition().withRulesEngineMatchVariable(RulesEngineMatchVariable.IS_MOBILE)
                            .withRulesEngineOperator(RulesEngineOperator.EQUAL)
                            .withRulesEngineMatchValue(Arrays.asList()),
                        new RulesEngineMatchCondition()
                            .withRulesEngineMatchVariable(RulesEngineMatchVariable.REQUEST_HEADER)
                            .withRulesEngineOperator(RulesEngineOperator.CONTAINS)
                            .withRulesEngineMatchValue(Arrays.asList())))
                    .withMatchProcessingBehavior(MatchProcessingBehavior.STOP)))
            .create();

        Assertions.assertEquals("leseyqrhvyeldo", response.rules().get(0).name());
        Assertions.assertEquals(353685526, response.rules().get(0).priority());
        Assertions.assertEquals(HeaderActionType.DELETE,
            response.rules().get(0).action().requestHeaderActions().get(0).headerActionType());
        Assertions.assertEquals("wiswskukjtasbvw",
            response.rules().get(0).action().requestHeaderActions().get(0).headerName());
        Assertions.assertEquals(HeaderActionType.OVERWRITE,
            response.rules().get(0).action().responseHeaderActions().get(0).headerActionType());
        Assertions.assertEquals("vtwknvgmmbugt",
            response.rules().get(0).action().responseHeaderActions().get(0).headerName());
        Assertions.assertEquals(RulesEngineMatchVariable.REQUEST_URI,
            response.rules().get(0).matchConditions().get(0).rulesEngineMatchVariable());
        Assertions.assertEquals(RulesEngineOperator.CONTAINS,
            response.rules().get(0).matchConditions().get(0).rulesEngineOperator());
        Assertions.assertEquals(MatchProcessingBehavior.STOP, response.rules().get(0).matchProcessingBehavior());
    }
}
