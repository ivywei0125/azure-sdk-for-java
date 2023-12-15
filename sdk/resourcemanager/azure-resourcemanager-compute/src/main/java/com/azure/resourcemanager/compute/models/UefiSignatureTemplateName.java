// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The name of the signature template that contains default UEFI keys.
 */
public final class UefiSignatureTemplateName extends ExpandableStringEnum<UefiSignatureTemplateName> {
    /**
     * Static value NoSignatureTemplate for UefiSignatureTemplateName.
     */
    public static final UefiSignatureTemplateName NO_SIGNATURE_TEMPLATE = fromString("NoSignatureTemplate");

    /**
     * Static value MicrosoftUefiCertificateAuthorityTemplate for UefiSignatureTemplateName.
     */
    public static final UefiSignatureTemplateName MICROSOFT_UEFI_CERTIFICATE_AUTHORITY_TEMPLATE
        = fromString("MicrosoftUefiCertificateAuthorityTemplate");

    /**
     * Static value MicrosoftWindowsTemplate for UefiSignatureTemplateName.
     */
    public static final UefiSignatureTemplateName MICROSOFT_WINDOWS_TEMPLATE = fromString("MicrosoftWindowsTemplate");

    /**
     * Creates a new instance of UefiSignatureTemplateName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UefiSignatureTemplateName() {
    }

    /**
     * Creates or finds a UefiSignatureTemplateName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding UefiSignatureTemplateName.
     */
    @JsonCreator
    public static UefiSignatureTemplateName fromString(String name) {
        return fromString(name, UefiSignatureTemplateName.class);
    }

    /**
     * Gets known UefiSignatureTemplateName values.
     * 
     * @return known UefiSignatureTemplateName values.
     */
    public static Collection<UefiSignatureTemplateName> values() {
        return values(UefiSignatureTemplateName.class);
    }
}
