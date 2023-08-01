// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The authentication type to be used to connect to the HTTP server. */
public final class HttpAuthenticationType extends ExpandableStringEnum<HttpAuthenticationType> {
    /** Static value Basic for HttpAuthenticationType. */
    public static final HttpAuthenticationType BASIC = fromString("Basic");

    /** Static value Anonymous for HttpAuthenticationType. */
    public static final HttpAuthenticationType ANONYMOUS = fromString("Anonymous");

    /** Static value Digest for HttpAuthenticationType. */
    public static final HttpAuthenticationType DIGEST = fromString("Digest");

    /** Static value Windows for HttpAuthenticationType. */
    public static final HttpAuthenticationType WINDOWS = fromString("Windows");

    /** Static value ClientCertificate for HttpAuthenticationType. */
    public static final HttpAuthenticationType CLIENT_CERTIFICATE = fromString("ClientCertificate");

    /**
     * Creates a new instance of HttpAuthenticationType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public HttpAuthenticationType() {}

    /**
     * Creates or finds a HttpAuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HttpAuthenticationType.
     */
    @JsonCreator
    public static HttpAuthenticationType fromString(String name) {
        return fromString(name, HttpAuthenticationType.class);
    }

    /**
     * Gets known HttpAuthenticationType values.
     *
     * @return known HttpAuthenticationType values.
     */
    public static Collection<HttpAuthenticationType> values() {
        return values(HttpAuthenticationType.class);
    }
}
