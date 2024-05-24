// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The configuration for Compute Nodes in a Pool based on the Azure Virtual
 * Machines infrastructure.
 */
@Fluent
public final class VirtualMachineConfiguration implements JsonSerializable<VirtualMachineConfiguration> {

    /*
     * A reference to the Azure Virtual Machines Marketplace Image or the custom Virtual Machine Image to use.
     */
    @Generated
    private final ImageReference imageReference;

    /*
     * The SKU of the Batch Compute Node agent to be provisioned on Compute Nodes in the Pool. The Batch Compute Node
     * agent is a program that runs on each Compute Node in the Pool, and provides the command-and-control interface
     * between the Compute Node and the Batch service. There are different implementations of the Compute Node agent,
     * known as SKUs, for different operating systems. You must specify a Compute Node agent SKU which matches the
     * selected Image reference. To get the list of supported Compute Node agent SKUs along with their list of verified
     * Image references, see the 'List supported Compute Node agent SKUs' operation.
     */
    @Generated
    private final String nodeAgentSkuId;

    /*
     * Windows operating system settings on the virtual machine. This property must not be specified if the
     * imageReference property specifies a Linux OS Image.
     */
    @Generated
    private WindowsConfiguration windowsConfiguration;

    /*
     * The configuration for data disks attached to the Compute Nodes in the Pool. This property must be specified if
     * the Compute Nodes in the Pool need to have empty data disks attached to them. This cannot be updated. Each
     * Compute Node gets its own disk (the disk is not a file share). Existing disks cannot be attached, each attached
     * disk is empty. When the Compute Node is removed from the Pool, the disk and all data associated with it is also
     * deleted. The disk is not formatted after being attached, it must be formatted before use - for more information
     * see
     * https://docs.microsoft.com/en-us/azure/virtual-machines/linux/classic/attach-disk#initialize-a-new-data-disk-in-
     * linux and
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/attach-disk-ps#add-an-empty-data-disk-to-a-
     * virtual-machine.
     */
    @Generated
    private List<DataDisk> dataDisks;

    /*
     * This only applies to Images that contain the Windows operating system, and
     * should only be used when you hold valid on-premises licenses for the Compute
     * Nodes which will be deployed. If omitted, no on-premises licensing discount is
     * applied. Values are:
     * 
     * Windows_Server - The on-premises license is for Windows
     * Server.
     * Windows_Client - The on-premises license is for Windows Client.
     */
    @Generated
    private String licenseType;

    /*
     * The container configuration for the Pool. If specified, setup is performed on each Compute Node in the Pool to
     * allow Tasks to run in containers. All regular Tasks and Job manager Tasks run on this Pool must specify the
     * containerSettings property, and all other Tasks may specify it.
     */
    @Generated
    private ContainerConfiguration containerConfiguration;

    /*
     * The disk encryption configuration for the pool. If specified, encryption is performed on each node in the pool
     * during node provisioning.
     */
    @Generated
    private DiskEncryptionConfiguration diskEncryptionConfiguration;

    /*
     * The node placement configuration for the pool. This configuration will specify rules on how nodes in the pool
     * will be physically allocated.
     */
    @Generated
    private BatchNodePlacementConfiguration nodePlacementConfiguration;

    /*
     * The virtual machine extension for the pool. If specified, the extensions mentioned in this configuration will be
     * installed on each node.
     */
    @Generated
    private List<VMExtension> extensions;

    /*
     * Settings for the operating system disk of the Virtual Machine.
     */
    @Generated
    private OSDisk osDisk;

    /**
     * Creates an instance of VirtualMachineConfiguration class.
     *
     * @param imageReference the imageReference value to set.
     * @param nodeAgentSkuId the nodeAgentSkuId value to set.
     */
    @Generated
    public VirtualMachineConfiguration(ImageReference imageReference, String nodeAgentSkuId) {
        this.imageReference = imageReference;
        this.nodeAgentSkuId = nodeAgentSkuId;
    }

    /**
     * Get the imageReference property: A reference to the Azure Virtual Machines Marketplace Image or the custom
     * Virtual Machine Image to use.
     *
     * @return the imageReference value.
     */
    @Generated
    public ImageReference getImageReference() {
        return this.imageReference;
    }

    /**
     * Get the nodeAgentSkuId property: The SKU of the Batch Compute Node agent to be provisioned on Compute Nodes in
     * the Pool. The Batch Compute Node agent is a program that runs on each Compute Node in the Pool, and provides the
     * command-and-control interface between the Compute Node and the Batch service. There are different implementations
     * of the Compute Node agent, known as SKUs, for different operating systems. You must specify a Compute Node agent
     * SKU which matches the selected Image reference. To get the list of supported Compute Node agent SKUs along with
     * their list of verified Image references, see the 'List supported Compute Node agent SKUs' operation.
     *
     * @return the nodeAgentSkuId value.
     */
    @Generated
    public String getNodeAgentSkuId() {
        return this.nodeAgentSkuId;
    }

    /**
     * Get the windowsConfiguration property: Windows operating system settings on the virtual machine. This property
     * must not be specified if the imageReference property specifies a Linux OS Image.
     *
     * @return the windowsConfiguration value.
     */
    @Generated
    public WindowsConfiguration getWindowsConfiguration() {
        return this.windowsConfiguration;
    }

    /**
     * Set the windowsConfiguration property: Windows operating system settings on the virtual machine. This property
     * must not be specified if the imageReference property specifies a Linux OS Image.
     *
     * @param windowsConfiguration the windowsConfiguration value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    @Generated
    public VirtualMachineConfiguration setWindowsConfiguration(WindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
        return this;
    }

    /**
     * Get the dataDisks property: The configuration for data disks attached to the Compute Nodes in the Pool. This
     * property must be specified if the Compute Nodes in the Pool need to have empty data disks attached to them. This
     * cannot be updated. Each Compute Node gets its own disk (the disk is not a file share). Existing disks cannot be
     * attached, each attached disk is empty. When the Compute Node is removed from the Pool, the disk and all data
     * associated with it is also deleted. The disk is not formatted after being attached, it must be formatted before
     * use - for more information see
     * https://docs.microsoft.com/en-us/azure/virtual-machines/linux/classic/attach-disk#initialize-a-new-data-disk-in-linux
     * and
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/attach-disk-ps#add-an-empty-data-disk-to-a-virtual-machine.
     *
     * @return the dataDisks value.
     */
    @Generated
    public List<DataDisk> getDataDisks() {
        return this.dataDisks;
    }

    /**
     * Set the dataDisks property: The configuration for data disks attached to the Compute Nodes in the Pool. This
     * property must be specified if the Compute Nodes in the Pool need to have empty data disks attached to them. This
     * cannot be updated. Each Compute Node gets its own disk (the disk is not a file share). Existing disks cannot be
     * attached, each attached disk is empty. When the Compute Node is removed from the Pool, the disk and all data
     * associated with it is also deleted. The disk is not formatted after being attached, it must be formatted before
     * use - for more information see
     * https://docs.microsoft.com/en-us/azure/virtual-machines/linux/classic/attach-disk#initialize-a-new-data-disk-in-linux
     * and
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/attach-disk-ps#add-an-empty-data-disk-to-a-virtual-machine.
     *
     * @param dataDisks the dataDisks value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    @Generated
    public VirtualMachineConfiguration setDataDisks(List<DataDisk> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * Get the licenseType property: This only applies to Images that contain the Windows operating system, and
     * should only be used when you hold valid on-premises licenses for the Compute
     * Nodes which will be deployed. If omitted, no on-premises licensing discount is
     * applied. Values are:
     *
     * Windows_Server - The on-premises license is for Windows
     * Server.
     * Windows_Client - The on-premises license is for Windows Client.
     *
     * @return the licenseType value.
     */
    @Generated
    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: This only applies to Images that contain the Windows operating system, and
     * should only be used when you hold valid on-premises licenses for the Compute
     * Nodes which will be deployed. If omitted, no on-premises licensing discount is
     * applied. Values are:
     *
     * Windows_Server - The on-premises license is for Windows
     * Server.
     * Windows_Client - The on-premises license is for Windows Client.
     *
     * @param licenseType the licenseType value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    @Generated
    public VirtualMachineConfiguration setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the containerConfiguration property: The container configuration for the Pool. If specified, setup is
     * performed on each Compute Node in the Pool to allow Tasks to run in containers. All regular Tasks and Job manager
     * Tasks run on this Pool must specify the containerSettings property, and all other Tasks may specify it.
     *
     * @return the containerConfiguration value.
     */
    @Generated
    public ContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    /**
     * Set the containerConfiguration property: The container configuration for the Pool. If specified, setup is
     * performed on each Compute Node in the Pool to allow Tasks to run in containers. All regular Tasks and Job manager
     * Tasks run on this Pool must specify the containerSettings property, and all other Tasks may specify it.
     *
     * @param containerConfiguration the containerConfiguration value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    @Generated
    public VirtualMachineConfiguration setContainerConfiguration(ContainerConfiguration containerConfiguration) {
        this.containerConfiguration = containerConfiguration;
        return this;
    }

    /**
     * Get the diskEncryptionConfiguration property: The disk encryption configuration for the pool. If specified,
     * encryption is performed on each node in the pool during node provisioning.
     *
     * @return the diskEncryptionConfiguration value.
     */
    @Generated
    public DiskEncryptionConfiguration getDiskEncryptionConfiguration() {
        return this.diskEncryptionConfiguration;
    }

    /**
     * Set the diskEncryptionConfiguration property: The disk encryption configuration for the pool. If specified,
     * encryption is performed on each node in the pool during node provisioning.
     *
     * @param diskEncryptionConfiguration the diskEncryptionConfiguration value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    @Generated
    public VirtualMachineConfiguration
        setDiskEncryptionConfiguration(DiskEncryptionConfiguration diskEncryptionConfiguration) {
        this.diskEncryptionConfiguration = diskEncryptionConfiguration;
        return this;
    }

    /**
     * Get the nodePlacementConfiguration property: The node placement configuration for the pool. This configuration
     * will specify rules on how nodes in the pool will be physically allocated.
     *
     * @return the nodePlacementConfiguration value.
     */
    @Generated
    public BatchNodePlacementConfiguration getNodePlacementConfiguration() {
        return this.nodePlacementConfiguration;
    }

    /**
     * Set the nodePlacementConfiguration property: The node placement configuration for the pool. This configuration
     * will specify rules on how nodes in the pool will be physically allocated.
     *
     * @param nodePlacementConfiguration the nodePlacementConfiguration value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    @Generated
    public VirtualMachineConfiguration
        setNodePlacementConfiguration(BatchNodePlacementConfiguration nodePlacementConfiguration) {
        this.nodePlacementConfiguration = nodePlacementConfiguration;
        return this;
    }

    /**
     * Get the extensions property: The virtual machine extension for the pool. If specified, the extensions mentioned
     * in this configuration will be installed on each node.
     *
     * @return the extensions value.
     */
    @Generated
    public List<VMExtension> getExtensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: The virtual machine extension for the pool. If specified, the extensions mentioned
     * in this configuration will be installed on each node.
     *
     * @param extensions the extensions value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    @Generated
    public VirtualMachineConfiguration setExtensions(List<VMExtension> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Get the osDisk property: Settings for the operating system disk of the Virtual Machine.
     *
     * @return the osDisk value.
     */
    @Generated
    public OSDisk getOsDisk() {
        return this.osDisk;
    }

    /**
     * Set the osDisk property: Settings for the operating system disk of the Virtual Machine.
     *
     * @param osDisk the osDisk value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    @Generated
    public VirtualMachineConfiguration setOsDisk(OSDisk osDisk) {
        this.osDisk = osDisk;
        return this;
    }

    /*
     * Specifies the security profile settings for the virtual machine or virtual machine scale set.
     */
    @Generated
    private SecurityProfile securityProfile;

    /*
     * Specifies the service artifact reference id used to set same image version for all virtual machines in the scale
     * set when using 'latest' image version. The service artifact reference id in the form of
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/galleries/{galleryName
     * }/serviceArtifacts/{serviceArtifactName}/vmArtifactsProfiles/{vmArtifactsProfilesName}
     */
    @Generated
    private ServiceArtifactReference serviceArtifactReference;

    /**
     * Get the securityProfile property: Specifies the security profile settings for the virtual machine or virtual
     * machine scale set.
     *
     * @return the securityProfile value.
     */
    @Generated
    public SecurityProfile getSecurityProfile() {
        return this.securityProfile;
    }

    /**
     * Set the securityProfile property: Specifies the security profile settings for the virtual machine or virtual
     * machine scale set.
     *
     * @param securityProfile the securityProfile value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    @Generated
    public VirtualMachineConfiguration setSecurityProfile(SecurityProfile securityProfile) {
        this.securityProfile = securityProfile;
        return this;
    }

    /**
     * Get the serviceArtifactReference property: Specifies the service artifact reference id used to set same image
     * version for all virtual machines in the scale set when using 'latest' image version. The service artifact
     * reference id in the form of
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/galleries/{galleryName}/serviceArtifacts/{serviceArtifactName}/vmArtifactsProfiles/{vmArtifactsProfilesName}.
     *
     * @return the serviceArtifactReference value.
     */
    @Generated
    public ServiceArtifactReference getServiceArtifactReference() {
        return this.serviceArtifactReference;
    }

    /**
     * Set the serviceArtifactReference property: Specifies the service artifact reference id used to set same image
     * version for all virtual machines in the scale set when using 'latest' image version. The service artifact
     * reference id in the form of
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/galleries/{galleryName}/serviceArtifacts/{serviceArtifactName}/vmArtifactsProfiles/{vmArtifactsProfilesName}.
     *
     * @param serviceArtifactReference the serviceArtifactReference value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    @Generated
    public VirtualMachineConfiguration setServiceArtifactReference(ServiceArtifactReference serviceArtifactReference) {
        this.serviceArtifactReference = serviceArtifactReference;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("imageReference", this.imageReference);
        jsonWriter.writeStringField("nodeAgentSKUId", this.nodeAgentSkuId);
        jsonWriter.writeJsonField("windowsConfiguration", this.windowsConfiguration);
        jsonWriter.writeArrayField("dataDisks", this.dataDisks, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("licenseType", this.licenseType);
        jsonWriter.writeJsonField("containerConfiguration", this.containerConfiguration);
        jsonWriter.writeJsonField("diskEncryptionConfiguration", this.diskEncryptionConfiguration);
        jsonWriter.writeJsonField("nodePlacementConfiguration", this.nodePlacementConfiguration);
        jsonWriter.writeArrayField("extensions", this.extensions, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("osDisk", this.osDisk);
        jsonWriter.writeJsonField("securityProfile", this.securityProfile);
        jsonWriter.writeJsonField("serviceArtifactReference", this.serviceArtifactReference);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineConfiguration from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineConfiguration if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VirtualMachineConfiguration.
     */
    @Generated
    public static VirtualMachineConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ImageReference imageReference = null;
            String nodeAgentSkuId = null;
            WindowsConfiguration windowsConfiguration = null;
            List<DataDisk> dataDisks = null;
            String licenseType = null;
            ContainerConfiguration containerConfiguration = null;
            DiskEncryptionConfiguration diskEncryptionConfiguration = null;
            BatchNodePlacementConfiguration nodePlacementConfiguration = null;
            List<VMExtension> extensions = null;
            OSDisk osDisk = null;
            SecurityProfile securityProfile = null;
            ServiceArtifactReference serviceArtifactReference = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("imageReference".equals(fieldName)) {
                    imageReference = ImageReference.fromJson(reader);
                } else if ("nodeAgentSKUId".equals(fieldName)) {
                    nodeAgentSkuId = reader.getString();
                } else if ("windowsConfiguration".equals(fieldName)) {
                    windowsConfiguration = WindowsConfiguration.fromJson(reader);
                } else if ("dataDisks".equals(fieldName)) {
                    dataDisks = reader.readArray(reader1 -> DataDisk.fromJson(reader1));
                } else if ("licenseType".equals(fieldName)) {
                    licenseType = reader.getString();
                } else if ("containerConfiguration".equals(fieldName)) {
                    containerConfiguration = ContainerConfiguration.fromJson(reader);
                } else if ("diskEncryptionConfiguration".equals(fieldName)) {
                    diskEncryptionConfiguration = DiskEncryptionConfiguration.fromJson(reader);
                } else if ("nodePlacementConfiguration".equals(fieldName)) {
                    nodePlacementConfiguration = BatchNodePlacementConfiguration.fromJson(reader);
                } else if ("extensions".equals(fieldName)) {
                    extensions = reader.readArray(reader1 -> VMExtension.fromJson(reader1));
                } else if ("osDisk".equals(fieldName)) {
                    osDisk = OSDisk.fromJson(reader);
                } else if ("securityProfile".equals(fieldName)) {
                    securityProfile = SecurityProfile.fromJson(reader);
                } else if ("serviceArtifactReference".equals(fieldName)) {
                    serviceArtifactReference = ServiceArtifactReference.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            VirtualMachineConfiguration deserializedVirtualMachineConfiguration
                = new VirtualMachineConfiguration(imageReference, nodeAgentSkuId);
            deserializedVirtualMachineConfiguration.windowsConfiguration = windowsConfiguration;
            deserializedVirtualMachineConfiguration.dataDisks = dataDisks;
            deserializedVirtualMachineConfiguration.licenseType = licenseType;
            deserializedVirtualMachineConfiguration.containerConfiguration = containerConfiguration;
            deserializedVirtualMachineConfiguration.diskEncryptionConfiguration = diskEncryptionConfiguration;
            deserializedVirtualMachineConfiguration.nodePlacementConfiguration = nodePlacementConfiguration;
            deserializedVirtualMachineConfiguration.extensions = extensions;
            deserializedVirtualMachineConfiguration.osDisk = osDisk;
            deserializedVirtualMachineConfiguration.securityProfile = securityProfile;
            deserializedVirtualMachineConfiguration.serviceArtifactReference = serviceArtifactReference;
            return deserializedVirtualMachineConfiguration;
        });
    }
}
