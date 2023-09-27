// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.CredentialReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ScriptAction;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** HDInsight ondemand linked service properties. */
@Fluent
public final class HDInsightOnDemandLinkedServiceTypeProperties {
    /*
     * Number of worker/data nodes in the cluster. Suggestion value: 4. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "clusterSize", required = true)
    private Object clusterSize;

    /*
     * The allowed idle time for the on-demand HDInsight cluster. Specifies how long the on-demand HDInsight cluster
     * stays alive after completion of an activity run if there are no other active jobs in the cluster. The minimum
     * value is 5 mins. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "timeToLive", required = true)
    private Object timeToLive;

    /*
     * Version of the HDInsight cluster.  Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "version", required = true)
    private Object version;

    /*
     * Azure Storage linked service to be used by the on-demand cluster for storing and processing data.
     */
    @JsonProperty(value = "linkedServiceName", required = true)
    private LinkedServiceReference linkedServiceName;

    /*
     * The customer’s subscription to host the cluster. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "hostSubscriptionId", required = true)
    private Object hostSubscriptionId;

    /*
     * The service principal id for the hostSubscriptionId. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The key for the service principal id.
     */
    @JsonProperty(value = "servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /*
     * The Tenant id/name to which the service principal belongs. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "tenant", required = true)
    private Object tenant;

    /*
     * The resource group where the cluster belongs. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "clusterResourceGroup", required = true)
    private Object clusterResourceGroup;

    /*
     * The prefix of cluster name, postfix will be distinct with timestamp. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "clusterNamePrefix")
    private Object clusterNamePrefix;

    /*
     * The username to access the cluster. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "clusterUserName")
    private Object clusterUsername;

    /*
     * The password to access the cluster.
     */
    @JsonProperty(value = "clusterPassword")
    private SecretBase clusterPassword;

    /*
     * The username to SSH remotely connect to cluster’s node (for Linux). Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "clusterSshUserName")
    private Object clusterSshUsername;

    /*
     * The password to SSH remotely connect cluster’s node (for Linux).
     */
    @JsonProperty(value = "clusterSshPassword")
    private SecretBase clusterSshPassword;

    /*
     * Specifies additional storage accounts for the HDInsight linked service so that the Data Factory service can
     * register them on your behalf.
     */
    @JsonProperty(value = "additionalLinkedServiceNames")
    private List<LinkedServiceReference> additionalLinkedServiceNames;

    /*
     * The name of Azure SQL linked service that point to the HCatalog database. The on-demand HDInsight cluster is
     * created by using the Azure SQL database as the metastore.
     */
    @JsonProperty(value = "hcatalogLinkedServiceName")
    private LinkedServiceReference hcatalogLinkedServiceName;

    /*
     * The cluster type. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "clusterType")
    private Object clusterType;

    /*
     * The version of spark if the cluster type is 'spark'. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "sparkVersion")
    private Object sparkVersion;

    /*
     * Specifies the core configuration parameters (as in core-site.xml) for the HDInsight cluster to be created.
     */
    @JsonProperty(value = "coreConfiguration")
    private Object coreConfiguration;

    /*
     * Specifies the HBase configuration parameters (hbase-site.xml) for the HDInsight cluster.
     */
    @JsonProperty(value = "hBaseConfiguration")
    private Object hBaseConfiguration;

    /*
     * Specifies the HDFS configuration parameters (hdfs-site.xml) for the HDInsight cluster.
     */
    @JsonProperty(value = "hdfsConfiguration")
    private Object hdfsConfiguration;

    /*
     * Specifies the hive configuration parameters (hive-site.xml) for the HDInsight cluster.
     */
    @JsonProperty(value = "hiveConfiguration")
    private Object hiveConfiguration;

    /*
     * Specifies the MapReduce configuration parameters (mapred-site.xml) for the HDInsight cluster.
     */
    @JsonProperty(value = "mapReduceConfiguration")
    private Object mapReduceConfiguration;

    /*
     * Specifies the Oozie configuration parameters (oozie-site.xml) for the HDInsight cluster.
     */
    @JsonProperty(value = "oozieConfiguration")
    private Object oozieConfiguration;

    /*
     * Specifies the Storm configuration parameters (storm-site.xml) for the HDInsight cluster.
     */
    @JsonProperty(value = "stormConfiguration")
    private Object stormConfiguration;

    /*
     * Specifies the Yarn configuration parameters (yarn-site.xml) for the HDInsight cluster.
     */
    @JsonProperty(value = "yarnConfiguration")
    private Object yarnConfiguration;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /*
     * Specifies the size of the head node for the HDInsight cluster.
     */
    @JsonProperty(value = "headNodeSize")
    private Object headNodeSize;

    /*
     * Specifies the size of the data node for the HDInsight cluster.
     */
    @JsonProperty(value = "dataNodeSize")
    private Object dataNodeSize;

    /*
     * Specifies the size of the Zoo Keeper node for the HDInsight cluster.
     */
    @JsonProperty(value = "zookeeperNodeSize")
    private Object zookeeperNodeSize;

    /*
     * Custom script actions to run on HDI ondemand cluster once it's up. Please refer to
     * https://docs.microsoft.com/en-us/azure/hdinsight/hdinsight-hadoop-customize-cluster-linux?toc=%2Fen-us%2Fazure%2Fhdinsight%2Fr-server%2FTOC.json&bc=%2Fen-us%2Fazure%2Fbread%2Ftoc.json#understanding-script-actions.
     */
    @JsonProperty(value = "scriptActions")
    private List<ScriptAction> scriptActions;

    /*
     * The ARM resource ID for the vNet to which the cluster should be joined after creation. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "virtualNetworkId")
    private Object virtualNetworkId;

    /*
     * The ARM resource ID for the subnet in the vNet. If virtualNetworkId was specified, then this property is
     * required. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "subnetName")
    private Object subnetName;

    /*
     * The credential reference containing authentication information.
     */
    @JsonProperty(value = "credential")
    private CredentialReference credential;

    /** Creates an instance of HDInsightOnDemandLinkedServiceTypeProperties class. */
    public HDInsightOnDemandLinkedServiceTypeProperties() {
    }

    /**
     * Get the clusterSize property: Number of worker/data nodes in the cluster. Suggestion value: 4. Type: string (or
     * Expression with resultType string).
     *
     * @return the clusterSize value.
     */
    public Object clusterSize() {
        return this.clusterSize;
    }

    /**
     * Set the clusterSize property: Number of worker/data nodes in the cluster. Suggestion value: 4. Type: string (or
     * Expression with resultType string).
     *
     * @param clusterSize the clusterSize value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withClusterSize(Object clusterSize) {
        this.clusterSize = clusterSize;
        return this;
    }

    /**
     * Get the timeToLive property: The allowed idle time for the on-demand HDInsight cluster. Specifies how long the
     * on-demand HDInsight cluster stays alive after completion of an activity run if there are no other active jobs in
     * the cluster. The minimum value is 5 mins. Type: string (or Expression with resultType string).
     *
     * @return the timeToLive value.
     */
    public Object timeToLive() {
        return this.timeToLive;
    }

    /**
     * Set the timeToLive property: The allowed idle time for the on-demand HDInsight cluster. Specifies how long the
     * on-demand HDInsight cluster stays alive after completion of an activity run if there are no other active jobs in
     * the cluster. The minimum value is 5 mins. Type: string (or Expression with resultType string).
     *
     * @param timeToLive the timeToLive value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withTimeToLive(Object timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }

    /**
     * Get the version property: Version of the HDInsight cluster.  Type: string (or Expression with resultType string).
     *
     * @return the version value.
     */
    public Object version() {
        return this.version;
    }

    /**
     * Set the version property: Version of the HDInsight cluster.  Type: string (or Expression with resultType string).
     *
     * @param version the version value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withVersion(Object version) {
        this.version = version;
        return this;
    }

    /**
     * Get the linkedServiceName property: Azure Storage linked service to be used by the on-demand cluster for storing
     * and processing data.
     *
     * @return the linkedServiceName value.
     */
    public LinkedServiceReference linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set the linkedServiceName property: Azure Storage linked service to be used by the on-demand cluster for storing
     * and processing data.
     *
     * @param linkedServiceName the linkedServiceName value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withLinkedServiceName(
        LinkedServiceReference linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get the hostSubscriptionId property: The customer’s subscription to host the cluster. Type: string (or Expression
     * with resultType string).
     *
     * @return the hostSubscriptionId value.
     */
    public Object hostSubscriptionId() {
        return this.hostSubscriptionId;
    }

    /**
     * Set the hostSubscriptionId property: The customer’s subscription to host the cluster. Type: string (or Expression
     * with resultType string).
     *
     * @param hostSubscriptionId the hostSubscriptionId value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withHostSubscriptionId(Object hostSubscriptionId) {
        this.hostSubscriptionId = hostSubscriptionId;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The service principal id for the hostSubscriptionId. Type: string (or
     * Expression with resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The service principal id for the hostSubscriptionId. Type: string (or
     * Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The key for the service principal id.
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The key for the service principal id.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant property: The Tenant id/name to which the service principal belongs. Type: string (or Expression
     * with resultType string).
     *
     * @return the tenant value.
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The Tenant id/name to which the service principal belongs. Type: string (or Expression
     * with resultType string).
     *
     * @param tenant the tenant value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the clusterResourceGroup property: The resource group where the cluster belongs. Type: string (or Expression
     * with resultType string).
     *
     * @return the clusterResourceGroup value.
     */
    public Object clusterResourceGroup() {
        return this.clusterResourceGroup;
    }

    /**
     * Set the clusterResourceGroup property: The resource group where the cluster belongs. Type: string (or Expression
     * with resultType string).
     *
     * @param clusterResourceGroup the clusterResourceGroup value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withClusterResourceGroup(Object clusterResourceGroup) {
        this.clusterResourceGroup = clusterResourceGroup;
        return this;
    }

    /**
     * Get the clusterNamePrefix property: The prefix of cluster name, postfix will be distinct with timestamp. Type:
     * string (or Expression with resultType string).
     *
     * @return the clusterNamePrefix value.
     */
    public Object clusterNamePrefix() {
        return this.clusterNamePrefix;
    }

    /**
     * Set the clusterNamePrefix property: The prefix of cluster name, postfix will be distinct with timestamp. Type:
     * string (or Expression with resultType string).
     *
     * @param clusterNamePrefix the clusterNamePrefix value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withClusterNamePrefix(Object clusterNamePrefix) {
        this.clusterNamePrefix = clusterNamePrefix;
        return this;
    }

    /**
     * Get the clusterUsername property: The username to access the cluster. Type: string (or Expression with resultType
     * string).
     *
     * @return the clusterUsername value.
     */
    public Object clusterUsername() {
        return this.clusterUsername;
    }

    /**
     * Set the clusterUsername property: The username to access the cluster. Type: string (or Expression with resultType
     * string).
     *
     * @param clusterUsername the clusterUsername value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withClusterUsername(Object clusterUsername) {
        this.clusterUsername = clusterUsername;
        return this;
    }

    /**
     * Get the clusterPassword property: The password to access the cluster.
     *
     * @return the clusterPassword value.
     */
    public SecretBase clusterPassword() {
        return this.clusterPassword;
    }

    /**
     * Set the clusterPassword property: The password to access the cluster.
     *
     * @param clusterPassword the clusterPassword value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withClusterPassword(SecretBase clusterPassword) {
        this.clusterPassword = clusterPassword;
        return this;
    }

    /**
     * Get the clusterSshUsername property: The username to SSH remotely connect to cluster’s node (for Linux). Type:
     * string (or Expression with resultType string).
     *
     * @return the clusterSshUsername value.
     */
    public Object clusterSshUsername() {
        return this.clusterSshUsername;
    }

    /**
     * Set the clusterSshUsername property: The username to SSH remotely connect to cluster’s node (for Linux). Type:
     * string (or Expression with resultType string).
     *
     * @param clusterSshUsername the clusterSshUsername value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withClusterSshUsername(Object clusterSshUsername) {
        this.clusterSshUsername = clusterSshUsername;
        return this;
    }

    /**
     * Get the clusterSshPassword property: The password to SSH remotely connect cluster’s node (for Linux).
     *
     * @return the clusterSshPassword value.
     */
    public SecretBase clusterSshPassword() {
        return this.clusterSshPassword;
    }

    /**
     * Set the clusterSshPassword property: The password to SSH remotely connect cluster’s node (for Linux).
     *
     * @param clusterSshPassword the clusterSshPassword value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withClusterSshPassword(SecretBase clusterSshPassword) {
        this.clusterSshPassword = clusterSshPassword;
        return this;
    }

    /**
     * Get the additionalLinkedServiceNames property: Specifies additional storage accounts for the HDInsight linked
     * service so that the Data Factory service can register them on your behalf.
     *
     * @return the additionalLinkedServiceNames value.
     */
    public List<LinkedServiceReference> additionalLinkedServiceNames() {
        return this.additionalLinkedServiceNames;
    }

    /**
     * Set the additionalLinkedServiceNames property: Specifies additional storage accounts for the HDInsight linked
     * service so that the Data Factory service can register them on your behalf.
     *
     * @param additionalLinkedServiceNames the additionalLinkedServiceNames value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withAdditionalLinkedServiceNames(
        List<LinkedServiceReference> additionalLinkedServiceNames) {
        this.additionalLinkedServiceNames = additionalLinkedServiceNames;
        return this;
    }

    /**
     * Get the hcatalogLinkedServiceName property: The name of Azure SQL linked service that point to the HCatalog
     * database. The on-demand HDInsight cluster is created by using the Azure SQL database as the metastore.
     *
     * @return the hcatalogLinkedServiceName value.
     */
    public LinkedServiceReference hcatalogLinkedServiceName() {
        return this.hcatalogLinkedServiceName;
    }

    /**
     * Set the hcatalogLinkedServiceName property: The name of Azure SQL linked service that point to the HCatalog
     * database. The on-demand HDInsight cluster is created by using the Azure SQL database as the metastore.
     *
     * @param hcatalogLinkedServiceName the hcatalogLinkedServiceName value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withHcatalogLinkedServiceName(
        LinkedServiceReference hcatalogLinkedServiceName) {
        this.hcatalogLinkedServiceName = hcatalogLinkedServiceName;
        return this;
    }

    /**
     * Get the clusterType property: The cluster type. Type: string (or Expression with resultType string).
     *
     * @return the clusterType value.
     */
    public Object clusterType() {
        return this.clusterType;
    }

    /**
     * Set the clusterType property: The cluster type. Type: string (or Expression with resultType string).
     *
     * @param clusterType the clusterType value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withClusterType(Object clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * Get the sparkVersion property: The version of spark if the cluster type is 'spark'. Type: string (or Expression
     * with resultType string).
     *
     * @return the sparkVersion value.
     */
    public Object sparkVersion() {
        return this.sparkVersion;
    }

    /**
     * Set the sparkVersion property: The version of spark if the cluster type is 'spark'. Type: string (or Expression
     * with resultType string).
     *
     * @param sparkVersion the sparkVersion value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withSparkVersion(Object sparkVersion) {
        this.sparkVersion = sparkVersion;
        return this;
    }

    /**
     * Get the coreConfiguration property: Specifies the core configuration parameters (as in core-site.xml) for the
     * HDInsight cluster to be created.
     *
     * @return the coreConfiguration value.
     */
    public Object coreConfiguration() {
        return this.coreConfiguration;
    }

    /**
     * Set the coreConfiguration property: Specifies the core configuration parameters (as in core-site.xml) for the
     * HDInsight cluster to be created.
     *
     * @param coreConfiguration the coreConfiguration value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withCoreConfiguration(Object coreConfiguration) {
        this.coreConfiguration = coreConfiguration;
        return this;
    }

    /**
     * Get the hBaseConfiguration property: Specifies the HBase configuration parameters (hbase-site.xml) for the
     * HDInsight cluster.
     *
     * @return the hBaseConfiguration value.
     */
    public Object hBaseConfiguration() {
        return this.hBaseConfiguration;
    }

    /**
     * Set the hBaseConfiguration property: Specifies the HBase configuration parameters (hbase-site.xml) for the
     * HDInsight cluster.
     *
     * @param hBaseConfiguration the hBaseConfiguration value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withHBaseConfiguration(Object hBaseConfiguration) {
        this.hBaseConfiguration = hBaseConfiguration;
        return this;
    }

    /**
     * Get the hdfsConfiguration property: Specifies the HDFS configuration parameters (hdfs-site.xml) for the HDInsight
     * cluster.
     *
     * @return the hdfsConfiguration value.
     */
    public Object hdfsConfiguration() {
        return this.hdfsConfiguration;
    }

    /**
     * Set the hdfsConfiguration property: Specifies the HDFS configuration parameters (hdfs-site.xml) for the HDInsight
     * cluster.
     *
     * @param hdfsConfiguration the hdfsConfiguration value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withHdfsConfiguration(Object hdfsConfiguration) {
        this.hdfsConfiguration = hdfsConfiguration;
        return this;
    }

    /**
     * Get the hiveConfiguration property: Specifies the hive configuration parameters (hive-site.xml) for the HDInsight
     * cluster.
     *
     * @return the hiveConfiguration value.
     */
    public Object hiveConfiguration() {
        return this.hiveConfiguration;
    }

    /**
     * Set the hiveConfiguration property: Specifies the hive configuration parameters (hive-site.xml) for the HDInsight
     * cluster.
     *
     * @param hiveConfiguration the hiveConfiguration value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withHiveConfiguration(Object hiveConfiguration) {
        this.hiveConfiguration = hiveConfiguration;
        return this;
    }

    /**
     * Get the mapReduceConfiguration property: Specifies the MapReduce configuration parameters (mapred-site.xml) for
     * the HDInsight cluster.
     *
     * @return the mapReduceConfiguration value.
     */
    public Object mapReduceConfiguration() {
        return this.mapReduceConfiguration;
    }

    /**
     * Set the mapReduceConfiguration property: Specifies the MapReduce configuration parameters (mapred-site.xml) for
     * the HDInsight cluster.
     *
     * @param mapReduceConfiguration the mapReduceConfiguration value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withMapReduceConfiguration(Object mapReduceConfiguration) {
        this.mapReduceConfiguration = mapReduceConfiguration;
        return this;
    }

    /**
     * Get the oozieConfiguration property: Specifies the Oozie configuration parameters (oozie-site.xml) for the
     * HDInsight cluster.
     *
     * @return the oozieConfiguration value.
     */
    public Object oozieConfiguration() {
        return this.oozieConfiguration;
    }

    /**
     * Set the oozieConfiguration property: Specifies the Oozie configuration parameters (oozie-site.xml) for the
     * HDInsight cluster.
     *
     * @param oozieConfiguration the oozieConfiguration value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withOozieConfiguration(Object oozieConfiguration) {
        this.oozieConfiguration = oozieConfiguration;
        return this;
    }

    /**
     * Get the stormConfiguration property: Specifies the Storm configuration parameters (storm-site.xml) for the
     * HDInsight cluster.
     *
     * @return the stormConfiguration value.
     */
    public Object stormConfiguration() {
        return this.stormConfiguration;
    }

    /**
     * Set the stormConfiguration property: Specifies the Storm configuration parameters (storm-site.xml) for the
     * HDInsight cluster.
     *
     * @param stormConfiguration the stormConfiguration value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withStormConfiguration(Object stormConfiguration) {
        this.stormConfiguration = stormConfiguration;
        return this;
    }

    /**
     * Get the yarnConfiguration property: Specifies the Yarn configuration parameters (yarn-site.xml) for the HDInsight
     * cluster.
     *
     * @return the yarnConfiguration value.
     */
    public Object yarnConfiguration() {
        return this.yarnConfiguration;
    }

    /**
     * Set the yarnConfiguration property: Specifies the Yarn configuration parameters (yarn-site.xml) for the HDInsight
     * cluster.
     *
     * @param yarnConfiguration the yarnConfiguration value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withYarnConfiguration(Object yarnConfiguration) {
        this.yarnConfiguration = yarnConfiguration;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     *
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the headNodeSize property: Specifies the size of the head node for the HDInsight cluster.
     *
     * @return the headNodeSize value.
     */
    public Object headNodeSize() {
        return this.headNodeSize;
    }

    /**
     * Set the headNodeSize property: Specifies the size of the head node for the HDInsight cluster.
     *
     * @param headNodeSize the headNodeSize value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withHeadNodeSize(Object headNodeSize) {
        this.headNodeSize = headNodeSize;
        return this;
    }

    /**
     * Get the dataNodeSize property: Specifies the size of the data node for the HDInsight cluster.
     *
     * @return the dataNodeSize value.
     */
    public Object dataNodeSize() {
        return this.dataNodeSize;
    }

    /**
     * Set the dataNodeSize property: Specifies the size of the data node for the HDInsight cluster.
     *
     * @param dataNodeSize the dataNodeSize value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withDataNodeSize(Object dataNodeSize) {
        this.dataNodeSize = dataNodeSize;
        return this;
    }

    /**
     * Get the zookeeperNodeSize property: Specifies the size of the Zoo Keeper node for the HDInsight cluster.
     *
     * @return the zookeeperNodeSize value.
     */
    public Object zookeeperNodeSize() {
        return this.zookeeperNodeSize;
    }

    /**
     * Set the zookeeperNodeSize property: Specifies the size of the Zoo Keeper node for the HDInsight cluster.
     *
     * @param zookeeperNodeSize the zookeeperNodeSize value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withZookeeperNodeSize(Object zookeeperNodeSize) {
        this.zookeeperNodeSize = zookeeperNodeSize;
        return this;
    }

    /**
     * Get the scriptActions property: Custom script actions to run on HDI ondemand cluster once it's up. Please refer
     * to
     * https://docs.microsoft.com/en-us/azure/hdinsight/hdinsight-hadoop-customize-cluster-linux?toc=%2Fen-us%2Fazure%2Fhdinsight%2Fr-server%2FTOC.json&amp;bc=%2Fen-us%2Fazure%2Fbread%2Ftoc.json#understanding-script-actions.
     *
     * @return the scriptActions value.
     */
    public List<ScriptAction> scriptActions() {
        return this.scriptActions;
    }

    /**
     * Set the scriptActions property: Custom script actions to run on HDI ondemand cluster once it's up. Please refer
     * to
     * https://docs.microsoft.com/en-us/azure/hdinsight/hdinsight-hadoop-customize-cluster-linux?toc=%2Fen-us%2Fazure%2Fhdinsight%2Fr-server%2FTOC.json&amp;bc=%2Fen-us%2Fazure%2Fbread%2Ftoc.json#understanding-script-actions.
     *
     * @param scriptActions the scriptActions value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withScriptActions(List<ScriptAction> scriptActions) {
        this.scriptActions = scriptActions;
        return this;
    }

    /**
     * Get the virtualNetworkId property: The ARM resource ID for the vNet to which the cluster should be joined after
     * creation. Type: string (or Expression with resultType string).
     *
     * @return the virtualNetworkId value.
     */
    public Object virtualNetworkId() {
        return this.virtualNetworkId;
    }

    /**
     * Set the virtualNetworkId property: The ARM resource ID for the vNet to which the cluster should be joined after
     * creation. Type: string (or Expression with resultType string).
     *
     * @param virtualNetworkId the virtualNetworkId value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withVirtualNetworkId(Object virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
        return this;
    }

    /**
     * Get the subnetName property: The ARM resource ID for the subnet in the vNet. If virtualNetworkId was specified,
     * then this property is required. Type: string (or Expression with resultType string).
     *
     * @return the subnetName value.
     */
    public Object subnetName() {
        return this.subnetName;
    }

    /**
     * Set the subnetName property: The ARM resource ID for the subnet in the vNet. If virtualNetworkId was specified,
     * then this property is required. Type: string (or Expression with resultType string).
     *
     * @param subnetName the subnetName value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withSubnetName(Object subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     *
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.credential;
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     *
     * @param credential the credential value to set.
     * @return the HDInsightOnDemandLinkedServiceTypeProperties object itself.
     */
    public HDInsightOnDemandLinkedServiceTypeProperties withCredential(CredentialReference credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clusterSize() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property clusterSize in model HDInsightOnDemandLinkedServiceTypeProperties"));
        }
        if (timeToLive() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property timeToLive in model HDInsightOnDemandLinkedServiceTypeProperties"));
        }
        if (version() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property version in model HDInsightOnDemandLinkedServiceTypeProperties"));
        }
        if (linkedServiceName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property linkedServiceName in model"
                            + " HDInsightOnDemandLinkedServiceTypeProperties"));
        } else {
            linkedServiceName().validate();
        }
        if (hostSubscriptionId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property hostSubscriptionId in model"
                            + " HDInsightOnDemandLinkedServiceTypeProperties"));
        }
        if (servicePrincipalKey() != null) {
            servicePrincipalKey().validate();
        }
        if (tenant() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property tenant in model HDInsightOnDemandLinkedServiceTypeProperties"));
        }
        if (clusterResourceGroup() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property clusterResourceGroup in model"
                            + " HDInsightOnDemandLinkedServiceTypeProperties"));
        }
        if (clusterPassword() != null) {
            clusterPassword().validate();
        }
        if (clusterSshPassword() != null) {
            clusterSshPassword().validate();
        }
        if (additionalLinkedServiceNames() != null) {
            additionalLinkedServiceNames().forEach(e -> e.validate());
        }
        if (hcatalogLinkedServiceName() != null) {
            hcatalogLinkedServiceName().validate();
        }
        if (scriptActions() != null) {
            scriptActions().forEach(e -> e.validate());
        }
        if (credential() != null) {
            credential().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HDInsightOnDemandLinkedServiceTypeProperties.class);
}
