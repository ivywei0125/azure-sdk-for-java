// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerservicefleet.fluent.models.FleetUpdateStrategyInner;

/** An immutable client-side representation of FleetUpdateStrategy. */
public interface FleetUpdateStrategy {
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
     * Gets the etag property: If eTag is provided in the response body, it may also be provided as a header per the
     * normal etag convention. Entity tags are used for comparing two or more entities from the same requested resource.
     * HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26),
     * and If-Range (section 14.27) header fields.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The provisioning state of the UpdateStrategy resource.
     *
     * @return the provisioningState value.
     */
    FleetUpdateStrategyProvisioningState provisioningState();

    /**
     * Gets the strategy property: Defines the update sequence of the clusters.
     *
     * @return the strategy value.
     */
    UpdateRunStrategy strategy();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.containerservicefleet.fluent.models.FleetUpdateStrategyInner object.
     *
     * @return the inner object.
     */
    FleetUpdateStrategyInner innerModel();

    /** The entirety of the FleetUpdateStrategy definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The FleetUpdateStrategy definition stages. */
    interface DefinitionStages {
        /** The first stage of the FleetUpdateStrategy definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the FleetUpdateStrategy definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, fleetName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param fleetName The name of the Fleet resource.
             * @return the next definition stage.
             */
            WithCreate withExistingFleet(String resourceGroupName, String fleetName);
        }

        /**
         * The stage of the FleetUpdateStrategy definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithStrategy, DefinitionStages.WithIfMatch, DefinitionStages.WithIfNoneMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            FleetUpdateStrategy create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            FleetUpdateStrategy create(Context context);
        }

        /** The stage of the FleetUpdateStrategy definition allowing to specify strategy. */
        interface WithStrategy {
            /**
             * Specifies the strategy property: Defines the update sequence of the clusters..
             *
             * @param strategy Defines the update sequence of the clusters.
             * @return the next definition stage.
             */
            WithCreate withStrategy(UpdateRunStrategy strategy);
        }

        /** The stage of the FleetUpdateStrategy definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The request should only proceed if an entity matches this string..
             *
             * @param ifMatch The request should only proceed if an entity matches this string.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }

        /** The stage of the FleetUpdateStrategy definition allowing to specify ifNoneMatch. */
        interface WithIfNoneMatch {
            /**
             * Specifies the ifNoneMatch property: The request should only proceed if no entity matches this string..
             *
             * @param ifNoneMatch The request should only proceed if no entity matches this string.
             * @return the next definition stage.
             */
            WithCreate withIfNoneMatch(String ifNoneMatch);
        }
    }

    /**
     * Begins update for the FleetUpdateStrategy resource.
     *
     * @return the stage of resource update.
     */
    FleetUpdateStrategy.Update update();

    /** The template for FleetUpdateStrategy update. */
    interface Update extends UpdateStages.WithStrategy, UpdateStages.WithIfMatch, UpdateStages.WithIfNoneMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        FleetUpdateStrategy apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        FleetUpdateStrategy apply(Context context);
    }

    /** The FleetUpdateStrategy update stages. */
    interface UpdateStages {
        /** The stage of the FleetUpdateStrategy update allowing to specify strategy. */
        interface WithStrategy {
            /**
             * Specifies the strategy property: Defines the update sequence of the clusters..
             *
             * @param strategy Defines the update sequence of the clusters.
             * @return the next definition stage.
             */
            Update withStrategy(UpdateRunStrategy strategy);
        }

        /** The stage of the FleetUpdateStrategy update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The request should only proceed if an entity matches this string..
             *
             * @param ifMatch The request should only proceed if an entity matches this string.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }

        /** The stage of the FleetUpdateStrategy update allowing to specify ifNoneMatch. */
        interface WithIfNoneMatch {
            /**
             * Specifies the ifNoneMatch property: The request should only proceed if no entity matches this string..
             *
             * @param ifNoneMatch The request should only proceed if no entity matches this string.
             * @return the next definition stage.
             */
            Update withIfNoneMatch(String ifNoneMatch);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    FleetUpdateStrategy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    FleetUpdateStrategy refresh(Context context);
}
