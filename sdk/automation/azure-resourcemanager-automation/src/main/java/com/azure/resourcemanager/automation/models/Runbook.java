// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.RunbookDraftInner;
import com.azure.resourcemanager.automation.fluent.models.RunbookInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of Runbook.
 */
public interface Runbook {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the etag property: Gets or sets the etag of the resource.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the runbookType property: Gets or sets the type of the runbook.
     * 
     * @return the runbookType value.
     */
    RunbookTypeEnum runbookType();

    /**
     * Gets the publishContentLink property: Gets or sets the published runbook content link.
     * 
     * @return the publishContentLink value.
     */
    ContentLink publishContentLink();

    /**
     * Gets the state property: Gets or sets the state of the runbook.
     * 
     * @return the state value.
     */
    RunbookState state();

    /**
     * Gets the logVerbose property: Gets or sets verbose log option.
     * 
     * @return the logVerbose value.
     */
    Boolean logVerbose();

    /**
     * Gets the logProgress property: Gets or sets progress log option.
     * 
     * @return the logProgress value.
     */
    Boolean logProgress();

    /**
     * Gets the logActivityTrace property: Gets or sets the option to log activity trace of the runbook.
     * 
     * @return the logActivityTrace value.
     */
    Integer logActivityTrace();

    /**
     * Gets the jobCount property: Gets or sets the job count of the runbook.
     * 
     * @return the jobCount value.
     */
    Integer jobCount();

    /**
     * Gets the parameters property: Gets or sets the runbook parameters.
     * 
     * @return the parameters value.
     */
    Map<String, RunbookParameter> parameters();

    /**
     * Gets the outputTypes property: Gets or sets the runbook output types.
     * 
     * @return the outputTypes value.
     */
    List<String> outputTypes();

    /**
     * Gets the draft property: Gets or sets the draft runbook properties.
     * 
     * @return the draft value.
     */
    RunbookDraft draft();

    /**
     * Gets the provisioningState property: Gets or sets the provisioning state of the runbook.
     * 
     * @return the provisioningState value.
     */
    RunbookProvisioningState provisioningState();

    /**
     * Gets the lastModifiedBy property: Gets or sets the last modified by.
     * 
     * @return the lastModifiedBy value.
     */
    String lastModifiedBy();

    /**
     * Gets the creationTime property: Gets or sets the creation time.
     * 
     * @return the creationTime value.
     */
    OffsetDateTime creationTime();

    /**
     * Gets the lastModifiedTime property: Gets or sets the last modified time.
     * 
     * @return the lastModifiedTime value.
     */
    OffsetDateTime lastModifiedTime();

    /**
     * Gets the description property: Gets or sets the description.
     * 
     * @return the description value.
     */
    String description();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.automation.fluent.models.RunbookInner object.
     * 
     * @return the inner object.
     */
    RunbookInner innerModel();

    /**
     * The entirety of the Runbook definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithParentResource,
        DefinitionStages.WithRunbookType, DefinitionStages.WithCreate {
    }

    /**
     * The Runbook definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Runbook definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the Runbook definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, automationAccountName.
             * 
             * @param resourceGroupName Name of an Azure Resource group.
             * @param automationAccountName The name of the automation account.
             * @return the next definition stage.
             */
            WithRunbookType withExistingAutomationAccount(String resourceGroupName, String automationAccountName);
        }

        /**
         * The stage of the Runbook definition allowing to specify runbookType.
         */
        interface WithRunbookType {
            /**
             * Specifies the runbookType property: Gets or sets the type of the runbook..
             * 
             * @param runbookType Gets or sets the type of the runbook.
             * @return the next definition stage.
             */
            WithCreate withRunbookType(RunbookTypeEnum runbookType);
        }

        /**
         * The stage of the Runbook definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithLocation, DefinitionStages.WithTags,
            DefinitionStages.WithName, DefinitionStages.WithLogVerbose, DefinitionStages.WithLogProgress,
            DefinitionStages.WithDraft, DefinitionStages.WithPublishContentLink, DefinitionStages.WithDescription,
            DefinitionStages.WithLogActivityTrace {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Runbook create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Runbook create(Context context);
        }

        /**
         * The stage of the Runbook definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location Gets or sets the location of the resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location Gets or sets the location of the resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }

        /**
         * The stage of the Runbook definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Gets or sets the tags attached to the resource..
             * 
             * @param tags Gets or sets the tags attached to the resource.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the Runbook definition allowing to specify name.
         */
        interface WithName {
            /**
             * Specifies the name property: Gets or sets the name of the resource..
             * 
             * @param name Gets or sets the name of the resource.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the Runbook definition allowing to specify logVerbose.
         */
        interface WithLogVerbose {
            /**
             * Specifies the logVerbose property: Gets or sets verbose log option..
             * 
             * @param logVerbose Gets or sets verbose log option.
             * @return the next definition stage.
             */
            WithCreate withLogVerbose(Boolean logVerbose);
        }

        /**
         * The stage of the Runbook definition allowing to specify logProgress.
         */
        interface WithLogProgress {
            /**
             * Specifies the logProgress property: Gets or sets progress log option..
             * 
             * @param logProgress Gets or sets progress log option.
             * @return the next definition stage.
             */
            WithCreate withLogProgress(Boolean logProgress);
        }

        /**
         * The stage of the Runbook definition allowing to specify draft.
         */
        interface WithDraft {
            /**
             * Specifies the draft property: Gets or sets the draft runbook properties..
             * 
             * @param draft Gets or sets the draft runbook properties.
             * @return the next definition stage.
             */
            WithCreate withDraft(RunbookDraftInner draft);
        }

        /**
         * The stage of the Runbook definition allowing to specify publishContentLink.
         */
        interface WithPublishContentLink {
            /**
             * Specifies the publishContentLink property: Gets or sets the published runbook content link..
             * 
             * @param publishContentLink Gets or sets the published runbook content link.
             * @return the next definition stage.
             */
            WithCreate withPublishContentLink(ContentLink publishContentLink);
        }

        /**
         * The stage of the Runbook definition allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: Gets or sets the description of the runbook..
             * 
             * @param description Gets or sets the description of the runbook.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the Runbook definition allowing to specify logActivityTrace.
         */
        interface WithLogActivityTrace {
            /**
             * Specifies the logActivityTrace property: Gets or sets the activity-level tracing options of the runbook..
             * 
             * @param logActivityTrace Gets or sets the activity-level tracing options of the runbook.
             * @return the next definition stage.
             */
            WithCreate withLogActivityTrace(Integer logActivityTrace);
        }
    }

    /**
     * Begins update for the Runbook resource.
     * 
     * @return the stage of resource update.
     */
    Runbook.Update update();

    /**
     * The template for Runbook update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithName, UpdateStages.WithDescription,
        UpdateStages.WithLogVerbose, UpdateStages.WithLogProgress, UpdateStages.WithLogActivityTrace {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Runbook apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Runbook apply(Context context);
    }

    /**
     * The Runbook update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Runbook update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Gets or sets the tags attached to the resource..
             * 
             * @param tags Gets or sets the tags attached to the resource.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the Runbook update allowing to specify name.
         */
        interface WithName {
            /**
             * Specifies the name property: Gets or sets the name of the resource..
             * 
             * @param name Gets or sets the name of the resource.
             * @return the next definition stage.
             */
            Update withName(String name);
        }

        /**
         * The stage of the Runbook update allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: Gets or sets the description of the runbook..
             * 
             * @param description Gets or sets the description of the runbook.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the Runbook update allowing to specify logVerbose.
         */
        interface WithLogVerbose {
            /**
             * Specifies the logVerbose property: Gets or sets verbose log option..
             * 
             * @param logVerbose Gets or sets verbose log option.
             * @return the next definition stage.
             */
            Update withLogVerbose(Boolean logVerbose);
        }

        /**
         * The stage of the Runbook update allowing to specify logProgress.
         */
        interface WithLogProgress {
            /**
             * Specifies the logProgress property: Gets or sets progress log option..
             * 
             * @param logProgress Gets or sets progress log option.
             * @return the next definition stage.
             */
            Update withLogProgress(Boolean logProgress);
        }

        /**
         * The stage of the Runbook update allowing to specify logActivityTrace.
         */
        interface WithLogActivityTrace {
            /**
             * Specifies the logActivityTrace property: Gets or sets the activity-level tracing options of the runbook..
             * 
             * @param logActivityTrace Gets or sets the activity-level tracing options of the runbook.
             * @return the next definition stage.
             */
            Update withLogActivityTrace(Integer logActivityTrace);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Runbook refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Runbook refresh(Context context);

    /**
     * Publish runbook draft.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void publish();

    /**
     * Publish runbook draft.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void publish(Context context);
}
