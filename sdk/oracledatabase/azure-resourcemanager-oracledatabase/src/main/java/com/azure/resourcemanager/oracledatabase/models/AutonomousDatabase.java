// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.oracledatabase.fluent.models.AutonomousDatabaseInner;
import java.util.Map;

/**
 * An immutable client-side representation of AutonomousDatabase.
 */
public interface AutonomousDatabase {
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
     * Gets the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    AutonomousDatabaseBaseProperties properties();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

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
     * Gets the inner com.azure.resourcemanager.oracledatabase.fluent.models.AutonomousDatabaseInner object.
     * 
     * @return the inner object.
     */
    AutonomousDatabaseInner innerModel();

    /**
     * The entirety of the AutonomousDatabase definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The AutonomousDatabase definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the AutonomousDatabase definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the AutonomousDatabase definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the AutonomousDatabase definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the AutonomousDatabase definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            AutonomousDatabase create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AutonomousDatabase create(Context context);
        }

        /**
         * The stage of the AutonomousDatabase definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the AutonomousDatabase definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The resource-specific properties for this resource..
             * 
             * @param properties The resource-specific properties for this resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(AutonomousDatabaseBaseProperties properties);
        }
    }

    /**
     * Begins update for the AutonomousDatabase resource.
     * 
     * @return the stage of resource update.
     */
    AutonomousDatabase.Update update();

    /**
     * The template for AutonomousDatabase update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        AutonomousDatabase apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AutonomousDatabase apply(Context context);
    }

    /**
     * The AutonomousDatabase update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the AutonomousDatabase update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the AutonomousDatabase update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The updatable properties of the AutonomousDatabase..
             * 
             * @param properties The updatable properties of the AutonomousDatabase.
             * @return the next definition stage.
             */
            Update withProperties(AutonomousDatabaseUpdateProperties properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    AutonomousDatabase refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AutonomousDatabase refresh(Context context);

    /**
     * Perform failover action on Autonomous Database.
     * 
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    AutonomousDatabase failover(PeerDbDetails body);

    /**
     * Perform failover action on Autonomous Database.
     * 
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    AutonomousDatabase failover(PeerDbDetails body, Context context);

    /**
     * Generate wallet action on Autonomous Database.
     * 
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database Wallet File resource model along with {@link Response}.
     */
    Response<AutonomousDatabaseWalletFile> generateWalletWithResponse(GenerateAutonomousDatabaseWalletDetails body,
        Context context);

    /**
     * Generate wallet action on Autonomous Database.
     * 
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database Wallet File resource model.
     */
    AutonomousDatabaseWalletFile generateWallet(GenerateAutonomousDatabaseWalletDetails body);

    /**
     * Perform switchover action on Autonomous Database.
     * 
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    AutonomousDatabase switchover(PeerDbDetails body);

    /**
     * Perform switchover action on Autonomous Database.
     * 
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    AutonomousDatabase switchover(PeerDbDetails body, Context context);
}
