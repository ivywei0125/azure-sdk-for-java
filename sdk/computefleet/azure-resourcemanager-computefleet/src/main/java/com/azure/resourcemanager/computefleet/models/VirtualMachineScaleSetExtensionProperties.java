// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Describes the properties of a Virtual Machine Scale Set Extension.
 */
@Fluent
public final class VirtualMachineScaleSetExtensionProperties
    implements JsonSerializable<VirtualMachineScaleSetExtensionProperties> {
    /*
     * If a value is provided and is different from the previous value, the extension
     * handler will be forced to update even if the extension configuration has not
     * changed.
     */
    private String forceUpdateTag;

    /*
     * The name of the extension handler publisher.
     */
    private String publisher;

    /*
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     */
    private String type;

    /*
     * Specifies the version of the script handler.
     */
    private String typeHandlerVersion;

    /*
     * Indicates whether the extension should use a newer minor version if one is
     * available at deployment time. Once deployed, however, the extension will not
     * upgrade minor versions unless redeployed, even with this property set to true.
     */
    private Boolean autoUpgradeMinorVersion;

    /*
     * Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version of the extension available.
     */
    private Boolean enableAutomaticUpgrade;

    /*
     * Json formatted public settings for the extension.
     */
    private Map<String, Object> settings;

    /*
     * The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     */
    private Map<String, Object> protectedSettings;

    /*
     * The provisioning state, which only appears in the response.
     */
    private String provisioningState;

    /*
     * Collection of extension names after which this extension needs to be
     * provisioned.
     */
    private List<String> provisionAfterExtensions;

    /*
     * Indicates whether failures stemming from the extension will be suppressed
     * (Operational failures such as not connecting to the VM will not be suppressed
     * regardless of this value). The default is false.
     */
    private Boolean suppressFailures;

    /*
     * The extensions protected settings that are passed by reference, and consumed
     * from key vault
     */
    private KeyVaultSecretReference protectedSettingsFromKeyVault;

    /**
     * Creates an instance of VirtualMachineScaleSetExtensionProperties class.
     */
    public VirtualMachineScaleSetExtensionProperties() {
    }

    /**
     * Get the forceUpdateTag property: If a value is provided and is different from the previous value, the extension
     * handler will be forced to update even if the extension configuration has not
     * changed.
     * 
     * @return the forceUpdateTag value.
     */
    public String forceUpdateTag() {
        return this.forceUpdateTag;
    }

    /**
     * Set the forceUpdateTag property: If a value is provided and is different from the previous value, the extension
     * handler will be forced to update even if the extension configuration has not
     * changed.
     * 
     * @param forceUpdateTag the forceUpdateTag value to set.
     * @return the VirtualMachineScaleSetExtensionProperties object itself.
     */
    public VirtualMachineScaleSetExtensionProperties withForceUpdateTag(String forceUpdateTag) {
        this.forceUpdateTag = forceUpdateTag;
        return this;
    }

    /**
     * Get the publisher property: The name of the extension handler publisher.
     * 
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The name of the extension handler publisher.
     * 
     * @param publisher the publisher value to set.
     * @return the VirtualMachineScaleSetExtensionProperties object itself.
     */
    public VirtualMachineScaleSetExtensionProperties withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     * @param type the type value to set.
     * @return the VirtualMachineScaleSetExtensionProperties object itself.
     */
    public VirtualMachineScaleSetExtensionProperties withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the typeHandlerVersion property: Specifies the version of the script handler.
     * 
     * @return the typeHandlerVersion value.
     */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set the typeHandlerVersion property: Specifies the version of the script handler.
     * 
     * @param typeHandlerVersion the typeHandlerVersion value to set.
     * @return the VirtualMachineScaleSetExtensionProperties object itself.
     */
    public VirtualMachineScaleSetExtensionProperties withTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
        return this;
    }

    /**
     * Get the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is
     * available at deployment time. Once deployed, however, the extension will not
     * upgrade minor versions unless redeployed, even with this property set to true.
     * 
     * @return the autoUpgradeMinorVersion value.
     */
    public Boolean autoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * Set the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is
     * available at deployment time. Once deployed, however, the extension will not
     * upgrade minor versions unless redeployed, even with this property set to true.
     * 
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set.
     * @return the VirtualMachineScaleSetExtensionProperties object itself.
     */
    public VirtualMachineScaleSetExtensionProperties withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }

    /**
     * Get the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version of the extension available.
     * 
     * @return the enableAutomaticUpgrade value.
     */
    public Boolean enableAutomaticUpgrade() {
        return this.enableAutomaticUpgrade;
    }

    /**
     * Set the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version of the extension available.
     * 
     * @param enableAutomaticUpgrade the enableAutomaticUpgrade value to set.
     * @return the VirtualMachineScaleSetExtensionProperties object itself.
     */
    public VirtualMachineScaleSetExtensionProperties withEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade) {
        this.enableAutomaticUpgrade = enableAutomaticUpgrade;
        return this;
    }

    /**
     * Get the settings property: Json formatted public settings for the extension.
     * 
     * @return the settings value.
     */
    public Map<String, Object> settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Json formatted public settings for the extension.
     * 
     * @param settings the settings value to set.
     * @return the VirtualMachineScaleSetExtensionProperties object itself.
     */
    public VirtualMachineScaleSetExtensionProperties withSettings(Map<String, Object> settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     * 
     * @return the protectedSettings value.
     */
    public Map<String, Object> protectedSettings() {
        return this.protectedSettings;
    }

    /**
     * Set the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     * 
     * @param protectedSettings the protectedSettings value to set.
     * @return the VirtualMachineScaleSetExtensionProperties object itself.
     */
    public VirtualMachineScaleSetExtensionProperties withProtectedSettings(Map<String, Object> protectedSettings) {
        this.protectedSettings = protectedSettings;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the provisionAfterExtensions property: Collection of extension names after which this extension needs to be
     * provisioned.
     * 
     * @return the provisionAfterExtensions value.
     */
    public List<String> provisionAfterExtensions() {
        return this.provisionAfterExtensions;
    }

    /**
     * Set the provisionAfterExtensions property: Collection of extension names after which this extension needs to be
     * provisioned.
     * 
     * @param provisionAfterExtensions the provisionAfterExtensions value to set.
     * @return the VirtualMachineScaleSetExtensionProperties object itself.
     */
    public VirtualMachineScaleSetExtensionProperties
        withProvisionAfterExtensions(List<String> provisionAfterExtensions) {
        this.provisionAfterExtensions = provisionAfterExtensions;
        return this;
    }

    /**
     * Get the suppressFailures property: Indicates whether failures stemming from the extension will be suppressed
     * (Operational failures such as not connecting to the VM will not be suppressed
     * regardless of this value). The default is false.
     * 
     * @return the suppressFailures value.
     */
    public Boolean suppressFailures() {
        return this.suppressFailures;
    }

    /**
     * Set the suppressFailures property: Indicates whether failures stemming from the extension will be suppressed
     * (Operational failures such as not connecting to the VM will not be suppressed
     * regardless of this value). The default is false.
     * 
     * @param suppressFailures the suppressFailures value to set.
     * @return the VirtualMachineScaleSetExtensionProperties object itself.
     */
    public VirtualMachineScaleSetExtensionProperties withSuppressFailures(Boolean suppressFailures) {
        this.suppressFailures = suppressFailures;
        return this;
    }

    /**
     * Get the protectedSettingsFromKeyVault property: The extensions protected settings that are passed by reference,
     * and consumed
     * from key vault.
     * 
     * @return the protectedSettingsFromKeyVault value.
     */
    public KeyVaultSecretReference protectedSettingsFromKeyVault() {
        return this.protectedSettingsFromKeyVault;
    }

    /**
     * Set the protectedSettingsFromKeyVault property: The extensions protected settings that are passed by reference,
     * and consumed
     * from key vault.
     * 
     * @param protectedSettingsFromKeyVault the protectedSettingsFromKeyVault value to set.
     * @return the VirtualMachineScaleSetExtensionProperties object itself.
     */
    public VirtualMachineScaleSetExtensionProperties
        withProtectedSettingsFromKeyVault(KeyVaultSecretReference protectedSettingsFromKeyVault) {
        this.protectedSettingsFromKeyVault = protectedSettingsFromKeyVault;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (protectedSettingsFromKeyVault() != null) {
            protectedSettingsFromKeyVault().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("forceUpdateTag", this.forceUpdateTag);
        jsonWriter.writeStringField("publisher", this.publisher);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("typeHandlerVersion", this.typeHandlerVersion);
        jsonWriter.writeBooleanField("autoUpgradeMinorVersion", this.autoUpgradeMinorVersion);
        jsonWriter.writeBooleanField("enableAutomaticUpgrade", this.enableAutomaticUpgrade);
        jsonWriter.writeMapField("settings", this.settings, (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeMapField("protectedSettings", this.protectedSettings,
            (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeArrayField("provisionAfterExtensions", this.provisionAfterExtensions,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("suppressFailures", this.suppressFailures);
        jsonWriter.writeJsonField("protectedSettingsFromKeyVault", this.protectedSettingsFromKeyVault);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineScaleSetExtensionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineScaleSetExtensionProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachineScaleSetExtensionProperties.
     */
    public static VirtualMachineScaleSetExtensionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineScaleSetExtensionProperties deserializedVirtualMachineScaleSetExtensionProperties
                = new VirtualMachineScaleSetExtensionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("forceUpdateTag".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetExtensionProperties.forceUpdateTag = reader.getString();
                } else if ("publisher".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetExtensionProperties.publisher = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetExtensionProperties.type = reader.getString();
                } else if ("typeHandlerVersion".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetExtensionProperties.typeHandlerVersion = reader.getString();
                } else if ("autoUpgradeMinorVersion".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetExtensionProperties.autoUpgradeMinorVersion
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("enableAutomaticUpgrade".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetExtensionProperties.enableAutomaticUpgrade
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("settings".equals(fieldName)) {
                    Map<String, Object> settings = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedVirtualMachineScaleSetExtensionProperties.settings = settings;
                } else if ("protectedSettings".equals(fieldName)) {
                    Map<String, Object> protectedSettings = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedVirtualMachineScaleSetExtensionProperties.protectedSettings = protectedSettings;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetExtensionProperties.provisioningState = reader.getString();
                } else if ("provisionAfterExtensions".equals(fieldName)) {
                    List<String> provisionAfterExtensions = reader.readArray(reader1 -> reader1.getString());
                    deserializedVirtualMachineScaleSetExtensionProperties.provisionAfterExtensions
                        = provisionAfterExtensions;
                } else if ("suppressFailures".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetExtensionProperties.suppressFailures
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("protectedSettingsFromKeyVault".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetExtensionProperties.protectedSettingsFromKeyVault
                        = KeyVaultSecretReference.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineScaleSetExtensionProperties;
        });
    }
}
