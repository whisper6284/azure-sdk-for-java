// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.implementation;

import com.azure.resourcemanager.botservice.fluent.models.HostSettingsResponseInner;
import com.azure.resourcemanager.botservice.models.HostSettingsResponse;

public final class HostSettingsResponseImpl implements HostSettingsResponse {
    private HostSettingsResponseInner innerObject;

    private final com.azure.resourcemanager.botservice.BotServiceManager serviceManager;

    HostSettingsResponseImpl(
        HostSettingsResponseInner innerObject, com.azure.resourcemanager.botservice.BotServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String oAuthUrl() {
        return this.innerModel().oAuthUrl();
    }

    public String toBotFromChannelOpenIdMetadataUrl() {
        return this.innerModel().toBotFromChannelOpenIdMetadataUrl();
    }

    public String toBotFromChannelTokenIssuer() {
        return this.innerModel().toBotFromChannelTokenIssuer();
    }

    public String toBotFromEmulatorOpenIdMetadataUrl() {
        return this.innerModel().toBotFromEmulatorOpenIdMetadataUrl();
    }

    public String toChannelFromBotLoginUrl() {
        return this.innerModel().toChannelFromBotLoginUrl();
    }

    public String toChannelFromBotOAuthScope() {
        return this.innerModel().toChannelFromBotOAuthScope();
    }

    public Boolean validateAuthority() {
        return this.innerModel().validateAuthority();
    }

    public String botOpenIdMetadata() {
        return this.innerModel().botOpenIdMetadata();
    }

    public HostSettingsResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.botservice.BotServiceManager manager() {
        return this.serviceManager;
    }
}