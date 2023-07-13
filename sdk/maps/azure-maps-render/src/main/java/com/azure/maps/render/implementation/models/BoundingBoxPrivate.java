// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Parameter group. */
@Fluent
public final class BoundingBoxPrivate {
    /*
     * Minimum coordinates (south-west point) of bounding box in latitude
     * longitude coordinate system. E.g. 52.41064,4.84228
     */
    @JsonProperty(value = "southWest", required = true)
    private List<Double> southWest;

    /*
     * Maximum coordinates (north-east point) of bounding box in latitude
     * longitude coordinate system. E.g. 52.41064,4.84228
     */
    @JsonProperty(value = "northEast", required = true)
    private List<Double> northEast;

    /**
     * Get the southWest property: Minimum coordinates (south-west point) of bounding box in latitude longitude
     * coordinate system. E.g. 52.41064,4.84228.
     *
     * @return the southWest value.
     */
    public List<Double> getSouthWest() {
        return this.southWest;
    }

    /**
     * Set the southWest property: Minimum coordinates (south-west point) of bounding box in latitude longitude
     * coordinate system. E.g. 52.41064,4.84228.
     *
     * @param southWest the southWest value to set.
     * @return the BoundingBoxPrivate object itself.
     */
    public BoundingBoxPrivate setSouthWest(List<Double> southWest) {
        this.southWest = southWest;
        return this;
    }

    /**
     * Get the northEast property: Maximum coordinates (north-east point) of bounding box in latitude longitude
     * coordinate system. E.g. 52.41064,4.84228.
     *
     * @return the northEast value.
     */
    public List<Double> getNorthEast() {
        return this.northEast;
    }

    /**
     * Set the northEast property: Maximum coordinates (north-east point) of bounding box in latitude longitude
     * coordinate system. E.g. 52.41064,4.84228.
     *
     * @param northEast the northEast value to set.
     * @return the BoundingBoxPrivate object itself.
     */
    public BoundingBoxPrivate setNorthEast(List<Double> northEast) {
        this.northEast = northEast;
        return this;
    }
}
