// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for DotNetComponents Delete.
 */
public final class DotNetComponentsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/preview/2024-08-02-preview/examples/DotNetComponents_Delete.json
     */
    /**
     * Sample code: Delete .NET Component.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void deleteNETComponent(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.dotNetComponents()
            .delete("examplerg", "myenvironment", "mydotnetcomponent", com.azure.core.util.Context.NONE);
    }
}
