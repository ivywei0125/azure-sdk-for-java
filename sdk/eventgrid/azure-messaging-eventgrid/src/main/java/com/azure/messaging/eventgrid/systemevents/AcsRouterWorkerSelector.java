// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;

/** Router Job Worker Selector. */
@Fluent
public final class AcsRouterWorkerSelector {

    /*
     * Router Job Worker Selector Key
     */
    @JsonProperty(value = "key")
    private String key;

    /*
     * Router Job Worker Selector Label Operator
     */
    @JsonProperty(value = "labelOperator")
    private AcsRouterLabelOperator labelOperator;

    /*
     * Router Job Worker Selector Value
     */
    @JsonProperty(value = "labelValue")
    private Object labelValue;

    /*
     * Router Job Worker Selector Time to Live in Seconds
     */
    @JsonProperty(value = "ttlSeconds")
    private Float ttlSeconds;

    /*
     * Router Job Worker Selector State
     */
    @JsonProperty(value = "state")
    private AcsRouterWorkerSelectorState state;

    /*
     * Router Job Worker Selector Expiration Time
     */
    @JsonProperty(value = "expirationTime")
    private OffsetDateTime expirationTime;

    /** Creates an instance of AcsRouterWorkerSelector class. */
    public AcsRouterWorkerSelector() {}

    /**
     * Get the key property: Router Job Worker Selector Key.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: Router Job Worker Selector Key.
     *
     * @param key the key value to set.
     * @return the AcsRouterWorkerSelector object itself.
     */
    public AcsRouterWorkerSelector setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the labelOperator property: Router Job Worker Selector Label Operator.
     *
     * @return the labelOperator value.
     */
    public AcsRouterLabelOperator getLabelOperator() {
        return this.labelOperator;
    }

    /**
     * Set the labelOperator property: Router Job Worker Selector Label Operator.
     *
     * @param labelOperator the labelOperator value to set.
     * @return the AcsRouterWorkerSelector object itself.
     */
    public AcsRouterWorkerSelector setLabelOperator(AcsRouterLabelOperator labelOperator) {
        this.labelOperator = labelOperator;
        return this;
    }

    /**
     * Get the labelValue property: Router Job Worker Selector Value.
     *
     * @return the labelValue value.
     */
    public Object getLabelValue() {
        return this.labelValue;
    }

    /**
     * Set the labelValue property: Router Job Worker Selector Value.
     *
     * @param labelValue the labelValue value to set.
     * @return the AcsRouterWorkerSelector object itself.
     */
    public AcsRouterWorkerSelector setLabelValue(Object labelValue) {
        this.labelValue = labelValue;
        return this;
    }

    /**
     * Get the ttlSeconds property: Router Job Worker Selector Time to Live in Seconds.
     *
     * @return the ttlSeconds value.
     */
    public Duration getTimeToLive() {
        return ttlSeconds == null ? null : Duration.ofSeconds(ttlSeconds.longValue());
    }

    /**
     * Set the timeToLive property: Router Job Worker Selector Time to Live in Seconds.
     *
     * @param timeToLive the timeToLive value to set.
     * @return the AcsRouterWorkerSelector object itself.
     */
    public AcsRouterWorkerSelector setTimeToLive(Duration timeToLive) {
        if (timeToLive != null) {
            this.ttlSeconds = (float) timeToLive.getSeconds();
        }
        return this;
    }

    /**
     * Get the state property: Router Job Worker Selector State.
     *
     * @return the state value.
     */
    public AcsRouterWorkerSelectorState getState() {
        return this.state;
    }

    /**
     * Set the state property: Router Job Worker Selector State.
     *
     * @param state the state value to set.
     * @return the AcsRouterWorkerSelector object itself.
     */
    public AcsRouterWorkerSelector setState(AcsRouterWorkerSelectorState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the expirationTime property: Router Job Worker Selector Expiration Time.
     *
     * @return the expirationTime value.
     */
    public OffsetDateTime getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * Set the expirationTime property: Router Job Worker Selector Expiration Time.
     *
     * @param expirationTime the expirationTime value to set.
     * @return the AcsRouterWorkerSelector object itself.
     */
    public AcsRouterWorkerSelector setExpirationTime(OffsetDateTime expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
}
