// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.fluent.models.DatasetResourceInner;

/** An immutable client-side representation of DatasetResource. */
public interface DatasetResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the properties property: Dataset properties.
     *
     * @return the properties value.
     */
    Dataset properties();

    /**
     * Gets the name property: The resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the etag property: Etag identifies change in the resource.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.datafactory.fluent.models.DatasetResourceInner object.
     *
     * @return the inner object.
     */
    DatasetResourceInner innerModel();

    /** The entirety of the DatasetResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithProperties,
            DefinitionStages.WithCreate {
    }

    /** The DatasetResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the DatasetResource definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the DatasetResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, factoryName.
             *
             * @param resourceGroupName The resource group name.
             * @param factoryName The factory name.
             * @return the next definition stage.
             */
            WithProperties withExistingFactory(String resourceGroupName, String factoryName);
        }

        /** The stage of the DatasetResource definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Dataset properties..
             *
             * @param properties Dataset properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(Dataset properties);
        }

        /**
         * The stage of the DatasetResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DatasetResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DatasetResource create(Context context);
        }

        /** The stage of the DatasetResource definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the dataset entity. Should only be specified for update, for
             * which it should match existing entity or can be * for unconditional update..
             *
             * @param ifMatch ETag of the dataset entity. Should only be specified for update, for which it should match
             *     existing entity or can be * for unconditional update.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }

    /**
     * Begins update for the DatasetResource resource.
     *
     * @return the stage of resource update.
     */
    DatasetResource.Update update();

    /** The template for DatasetResource update. */
    interface Update extends UpdateStages.WithProperties, UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DatasetResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DatasetResource apply(Context context);
    }

    /** The DatasetResource update stages. */
    interface UpdateStages {
        /** The stage of the DatasetResource update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Dataset properties..
             *
             * @param properties Dataset properties.
             * @return the next definition stage.
             */
            Update withProperties(Dataset properties);
        }

        /** The stage of the DatasetResource update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the dataset entity. Should only be specified for update, for
             * which it should match existing entity or can be * for unconditional update..
             *
             * @param ifMatch ETag of the dataset entity. Should only be specified for update, for which it should match
             *     existing entity or can be * for unconditional update.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    DatasetResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DatasetResource refresh(Context context);
}
