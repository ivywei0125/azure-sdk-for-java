// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** giphyRatingType. */
public final class MicrosoftGraphGiphyRatingType extends ExpandableStringEnum<MicrosoftGraphGiphyRatingType> {
    /** Static value strict for MicrosoftGraphGiphyRatingType. */
    public static final MicrosoftGraphGiphyRatingType STRICT = fromString("strict");

    /** Static value moderate for MicrosoftGraphGiphyRatingType. */
    public static final MicrosoftGraphGiphyRatingType MODERATE = fromString("moderate");

    /** Static value unknownFutureValue for MicrosoftGraphGiphyRatingType. */
    public static final MicrosoftGraphGiphyRatingType UNKNOWN_FUTURE_VALUE = fromString("unknownFutureValue");

    /**
     * Creates a new instance of MicrosoftGraphGiphyRatingType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MicrosoftGraphGiphyRatingType() {
    }

    /**
     * Creates or finds a MicrosoftGraphGiphyRatingType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphGiphyRatingType.
     */
    @JsonCreator
    public static MicrosoftGraphGiphyRatingType fromString(String name) {
        return fromString(name, MicrosoftGraphGiphyRatingType.class);
    }

    /**
     * Gets known MicrosoftGraphGiphyRatingType values.
     *
     * @return known MicrosoftGraphGiphyRatingType values.
     */
    public static Collection<MicrosoftGraphGiphyRatingType> values() {
        return values(MicrosoftGraphGiphyRatingType.class);
    }
}
