// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.resourcemanager.automation.models.AgentRegistrationKeyName;
import com.azure.resourcemanager.automation.models.AgentRegistrationRegenerateKeyParameter;

/**
 * Samples for AgentRegistrationInformation RegenerateKey.
 */
public final class AgentRegistrationInformationRegenerateKeySamples {
    /*
     * x-ms-original-file:
     * specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/
     * regenerateAgentRegistrationKey.json
     */
    /**
     * Sample code: Regenerate registration key.
     * 
     * @param manager Entry point to AutomationManager.
     */
    public static void regenerateRegistrationKey(com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.agentRegistrationInformations()
            .regenerateKeyWithResponse("rg", "myAutomationAccount18",
                new AgentRegistrationRegenerateKeyParameter().withKeyName(AgentRegistrationKeyName.PRIMARY),
                com.azure.core.util.Context.NONE);
    }
}
