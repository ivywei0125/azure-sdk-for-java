// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupEnginesClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupJobsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupOperationResultsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupOperationStatusesClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupPoliciesClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupProtectableItemsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupProtectedItemsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupProtectionContainersClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupProtectionIntentsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupResourceEncryptionConfigsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupResourceStorageConfigsNonCrrsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupResourceVaultConfigsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupStatusClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupUsageSummariesClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupWorkloadItemsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BmsPrepareDataMoveOperationResultsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.DeletedProtectionContainersClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ExportJobsOperationResultsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.FeatureSupportsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ItemLevelRecoveryConnectionsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.JobCancellationsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.JobDetailsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.JobOperationResultsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.JobsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.OperationOperationsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.OperationsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.PrivateEndpointsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectableContainersClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectedItemOperationResultsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectedItemOperationStatusesClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectedItemsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectionContainerOperationResultsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectionContainerRefreshOperationResultsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectionContainersClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectionIntentsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectionPoliciesClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectionPolicyOperationResultsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectionPolicyOperationStatusesClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.RecoveryPointsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.RecoveryPointsRecommendedForMovesClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.RecoveryServicesBackupClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ResourceGuardProxiesClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ResourceGuardProxyOperationsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.RestoresClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.SecurityPINsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ValidateOperationResultsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ValidateOperationStatusesClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ValidateOperationsClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the RecoveryServicesBackupClientImpl type. */
@ServiceClient(builder = RecoveryServicesBackupClientBuilder.class)
public final class RecoveryServicesBackupClientImpl implements RecoveryServicesBackupClient {
    /** The subscription Id. */
    private final String subscriptionId;

    /**
     * Gets The subscription Id.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The BackupResourceStorageConfigsNonCrrsClient object to access its operations. */
    private final BackupResourceStorageConfigsNonCrrsClient backupResourceStorageConfigsNonCrrs;

    /**
     * Gets the BackupResourceStorageConfigsNonCrrsClient object to access its operations.
     *
     * @return the BackupResourceStorageConfigsNonCrrsClient object.
     */
    public BackupResourceStorageConfigsNonCrrsClient getBackupResourceStorageConfigsNonCrrs() {
        return this.backupResourceStorageConfigsNonCrrs;
    }

    /** The ProtectionIntentsClient object to access its operations. */
    private final ProtectionIntentsClient protectionIntents;

    /**
     * Gets the ProtectionIntentsClient object to access its operations.
     *
     * @return the ProtectionIntentsClient object.
     */
    public ProtectionIntentsClient getProtectionIntents() {
        return this.protectionIntents;
    }

    /** The BackupStatusClient object to access its operations. */
    private final BackupStatusClient backupStatus;

    /**
     * Gets the BackupStatusClient object to access its operations.
     *
     * @return the BackupStatusClient object.
     */
    public BackupStatusClient getBackupStatus() {
        return this.backupStatus;
    }

    /** The FeatureSupportsClient object to access its operations. */
    private final FeatureSupportsClient featureSupports;

    /**
     * Gets the FeatureSupportsClient object to access its operations.
     *
     * @return the FeatureSupportsClient object.
     */
    public FeatureSupportsClient getFeatureSupports() {
        return this.featureSupports;
    }

    /** The BackupProtectionIntentsClient object to access its operations. */
    private final BackupProtectionIntentsClient backupProtectionIntents;

    /**
     * Gets the BackupProtectionIntentsClient object to access its operations.
     *
     * @return the BackupProtectionIntentsClient object.
     */
    public BackupProtectionIntentsClient getBackupProtectionIntents() {
        return this.backupProtectionIntents;
    }

    /** The BackupUsageSummariesClient object to access its operations. */
    private final BackupUsageSummariesClient backupUsageSummaries;

    /**
     * Gets the BackupUsageSummariesClient object to access its operations.
     *
     * @return the BackupUsageSummariesClient object.
     */
    public BackupUsageSummariesClient getBackupUsageSummaries() {
        return this.backupUsageSummaries;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The BackupResourceVaultConfigsClient object to access its operations. */
    private final BackupResourceVaultConfigsClient backupResourceVaultConfigs;

    /**
     * Gets the BackupResourceVaultConfigsClient object to access its operations.
     *
     * @return the BackupResourceVaultConfigsClient object.
     */
    public BackupResourceVaultConfigsClient getBackupResourceVaultConfigs() {
        return this.backupResourceVaultConfigs;
    }

    /** The BackupResourceEncryptionConfigsClient object to access its operations. */
    private final BackupResourceEncryptionConfigsClient backupResourceEncryptionConfigs;

    /**
     * Gets the BackupResourceEncryptionConfigsClient object to access its operations.
     *
     * @return the BackupResourceEncryptionConfigsClient object.
     */
    public BackupResourceEncryptionConfigsClient getBackupResourceEncryptionConfigs() {
        return this.backupResourceEncryptionConfigs;
    }

    /** The PrivateEndpointConnectionsClient object to access its operations. */
    private final PrivateEndpointConnectionsClient privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    public PrivateEndpointConnectionsClient getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /** The PrivateEndpointsClient object to access its operations. */
    private final PrivateEndpointsClient privateEndpoints;

    /**
     * Gets the PrivateEndpointsClient object to access its operations.
     *
     * @return the PrivateEndpointsClient object.
     */
    public PrivateEndpointsClient getPrivateEndpoints() {
        return this.privateEndpoints;
    }

    /** The ResourceProvidersClient object to access its operations. */
    private final ResourceProvidersClient resourceProviders;

    /**
     * Gets the ResourceProvidersClient object to access its operations.
     *
     * @return the ResourceProvidersClient object.
     */
    public ResourceProvidersClient getResourceProviders() {
        return this.resourceProviders;
    }

    /** The BmsPrepareDataMoveOperationResultsClient object to access its operations. */
    private final BmsPrepareDataMoveOperationResultsClient bmsPrepareDataMoveOperationResults;

    /**
     * Gets the BmsPrepareDataMoveOperationResultsClient object to access its operations.
     *
     * @return the BmsPrepareDataMoveOperationResultsClient object.
     */
    public BmsPrepareDataMoveOperationResultsClient getBmsPrepareDataMoveOperationResults() {
        return this.bmsPrepareDataMoveOperationResults;
    }

    /** The ProtectedItemsClient object to access its operations. */
    private final ProtectedItemsClient protectedItems;

    /**
     * Gets the ProtectedItemsClient object to access its operations.
     *
     * @return the ProtectedItemsClient object.
     */
    public ProtectedItemsClient getProtectedItems() {
        return this.protectedItems;
    }

    /** The ProtectedItemOperationResultsClient object to access its operations. */
    private final ProtectedItemOperationResultsClient protectedItemOperationResults;

    /**
     * Gets the ProtectedItemOperationResultsClient object to access its operations.
     *
     * @return the ProtectedItemOperationResultsClient object.
     */
    public ProtectedItemOperationResultsClient getProtectedItemOperationResults() {
        return this.protectedItemOperationResults;
    }

    /** The RecoveryPointsClient object to access its operations. */
    private final RecoveryPointsClient recoveryPoints;

    /**
     * Gets the RecoveryPointsClient object to access its operations.
     *
     * @return the RecoveryPointsClient object.
     */
    public RecoveryPointsClient getRecoveryPoints() {
        return this.recoveryPoints;
    }

    /** The RestoresClient object to access its operations. */
    private final RestoresClient restores;

    /**
     * Gets the RestoresClient object to access its operations.
     *
     * @return the RestoresClient object.
     */
    public RestoresClient getRestores() {
        return this.restores;
    }

    /** The BackupPoliciesClient object to access its operations. */
    private final BackupPoliciesClient backupPolicies;

    /**
     * Gets the BackupPoliciesClient object to access its operations.
     *
     * @return the BackupPoliciesClient object.
     */
    public BackupPoliciesClient getBackupPolicies() {
        return this.backupPolicies;
    }

    /** The ProtectionPoliciesClient object to access its operations. */
    private final ProtectionPoliciesClient protectionPolicies;

    /**
     * Gets the ProtectionPoliciesClient object to access its operations.
     *
     * @return the ProtectionPoliciesClient object.
     */
    public ProtectionPoliciesClient getProtectionPolicies() {
        return this.protectionPolicies;
    }

    /** The ProtectionPolicyOperationResultsClient object to access its operations. */
    private final ProtectionPolicyOperationResultsClient protectionPolicyOperationResults;

    /**
     * Gets the ProtectionPolicyOperationResultsClient object to access its operations.
     *
     * @return the ProtectionPolicyOperationResultsClient object.
     */
    public ProtectionPolicyOperationResultsClient getProtectionPolicyOperationResults() {
        return this.protectionPolicyOperationResults;
    }

    /** The BackupJobsClient object to access its operations. */
    private final BackupJobsClient backupJobs;

    /**
     * Gets the BackupJobsClient object to access its operations.
     *
     * @return the BackupJobsClient object.
     */
    public BackupJobsClient getBackupJobs() {
        return this.backupJobs;
    }

    /** The JobDetailsClient object to access its operations. */
    private final JobDetailsClient jobDetails;

    /**
     * Gets the JobDetailsClient object to access its operations.
     *
     * @return the JobDetailsClient object.
     */
    public JobDetailsClient getJobDetails() {
        return this.jobDetails;
    }

    /** The JobCancellationsClient object to access its operations. */
    private final JobCancellationsClient jobCancellations;

    /**
     * Gets the JobCancellationsClient object to access its operations.
     *
     * @return the JobCancellationsClient object.
     */
    public JobCancellationsClient getJobCancellations() {
        return this.jobCancellations;
    }

    /** The JobOperationResultsClient object to access its operations. */
    private final JobOperationResultsClient jobOperationResults;

    /**
     * Gets the JobOperationResultsClient object to access its operations.
     *
     * @return the JobOperationResultsClient object.
     */
    public JobOperationResultsClient getJobOperationResults() {
        return this.jobOperationResults;
    }

    /** The ExportJobsOperationResultsClient object to access its operations. */
    private final ExportJobsOperationResultsClient exportJobsOperationResults;

    /**
     * Gets the ExportJobsOperationResultsClient object to access its operations.
     *
     * @return the ExportJobsOperationResultsClient object.
     */
    public ExportJobsOperationResultsClient getExportJobsOperationResults() {
        return this.exportJobsOperationResults;
    }

    /** The JobsClient object to access its operations. */
    private final JobsClient jobs;

    /**
     * Gets the JobsClient object to access its operations.
     *
     * @return the JobsClient object.
     */
    public JobsClient getJobs() {
        return this.jobs;
    }

    /** The BackupProtectedItemsClient object to access its operations. */
    private final BackupProtectedItemsClient backupProtectedItems;

    /**
     * Gets the BackupProtectedItemsClient object to access its operations.
     *
     * @return the BackupProtectedItemsClient object.
     */
    public BackupProtectedItemsClient getBackupProtectedItems() {
        return this.backupProtectedItems;
    }

    /** The OperationOperationsClient object to access its operations. */
    private final OperationOperationsClient operationOperations;

    /**
     * Gets the OperationOperationsClient object to access its operations.
     *
     * @return the OperationOperationsClient object.
     */
    public OperationOperationsClient getOperationOperations() {
        return this.operationOperations;
    }

    /** The ValidateOperationsClient object to access its operations. */
    private final ValidateOperationsClient validateOperations;

    /**
     * Gets the ValidateOperationsClient object to access its operations.
     *
     * @return the ValidateOperationsClient object.
     */
    public ValidateOperationsClient getValidateOperations() {
        return this.validateOperations;
    }

    /** The ValidateOperationResultsClient object to access its operations. */
    private final ValidateOperationResultsClient validateOperationResults;

    /**
     * Gets the ValidateOperationResultsClient object to access its operations.
     *
     * @return the ValidateOperationResultsClient object.
     */
    public ValidateOperationResultsClient getValidateOperationResults() {
        return this.validateOperationResults;
    }

    /** The ValidateOperationStatusesClient object to access its operations. */
    private final ValidateOperationStatusesClient validateOperationStatuses;

    /**
     * Gets the ValidateOperationStatusesClient object to access its operations.
     *
     * @return the ValidateOperationStatusesClient object.
     */
    public ValidateOperationStatusesClient getValidateOperationStatuses() {
        return this.validateOperationStatuses;
    }

    /** The BackupEnginesClient object to access its operations. */
    private final BackupEnginesClient backupEngines;

    /**
     * Gets the BackupEnginesClient object to access its operations.
     *
     * @return the BackupEnginesClient object.
     */
    public BackupEnginesClient getBackupEngines() {
        return this.backupEngines;
    }

    /** The ProtectionContainerRefreshOperationResultsClient object to access its operations. */
    private final ProtectionContainerRefreshOperationResultsClient protectionContainerRefreshOperationResults;

    /**
     * Gets the ProtectionContainerRefreshOperationResultsClient object to access its operations.
     *
     * @return the ProtectionContainerRefreshOperationResultsClient object.
     */
    public ProtectionContainerRefreshOperationResultsClient getProtectionContainerRefreshOperationResults() {
        return this.protectionContainerRefreshOperationResults;
    }

    /** The ProtectableContainersClient object to access its operations. */
    private final ProtectableContainersClient protectableContainers;

    /**
     * Gets the ProtectableContainersClient object to access its operations.
     *
     * @return the ProtectableContainersClient object.
     */
    public ProtectableContainersClient getProtectableContainers() {
        return this.protectableContainers;
    }

    /** The ProtectionContainersClient object to access its operations. */
    private final ProtectionContainersClient protectionContainers;

    /**
     * Gets the ProtectionContainersClient object to access its operations.
     *
     * @return the ProtectionContainersClient object.
     */
    public ProtectionContainersClient getProtectionContainers() {
        return this.protectionContainers;
    }

    /** The BackupWorkloadItemsClient object to access its operations. */
    private final BackupWorkloadItemsClient backupWorkloadItems;

    /**
     * Gets the BackupWorkloadItemsClient object to access its operations.
     *
     * @return the BackupWorkloadItemsClient object.
     */
    public BackupWorkloadItemsClient getBackupWorkloadItems() {
        return this.backupWorkloadItems;
    }

    /** The ProtectionContainerOperationResultsClient object to access its operations. */
    private final ProtectionContainerOperationResultsClient protectionContainerOperationResults;

    /**
     * Gets the ProtectionContainerOperationResultsClient object to access its operations.
     *
     * @return the ProtectionContainerOperationResultsClient object.
     */
    public ProtectionContainerOperationResultsClient getProtectionContainerOperationResults() {
        return this.protectionContainerOperationResults;
    }

    /** The BackupsClient object to access its operations. */
    private final BackupsClient backups;

    /**
     * Gets the BackupsClient object to access its operations.
     *
     * @return the BackupsClient object.
     */
    public BackupsClient getBackups() {
        return this.backups;
    }

    /** The ProtectedItemOperationStatusesClient object to access its operations. */
    private final ProtectedItemOperationStatusesClient protectedItemOperationStatuses;

    /**
     * Gets the ProtectedItemOperationStatusesClient object to access its operations.
     *
     * @return the ProtectedItemOperationStatusesClient object.
     */
    public ProtectedItemOperationStatusesClient getProtectedItemOperationStatuses() {
        return this.protectedItemOperationStatuses;
    }

    /** The ItemLevelRecoveryConnectionsClient object to access its operations. */
    private final ItemLevelRecoveryConnectionsClient itemLevelRecoveryConnections;

    /**
     * Gets the ItemLevelRecoveryConnectionsClient object to access its operations.
     *
     * @return the ItemLevelRecoveryConnectionsClient object.
     */
    public ItemLevelRecoveryConnectionsClient getItemLevelRecoveryConnections() {
        return this.itemLevelRecoveryConnections;
    }

    /** The BackupOperationResultsClient object to access its operations. */
    private final BackupOperationResultsClient backupOperationResults;

    /**
     * Gets the BackupOperationResultsClient object to access its operations.
     *
     * @return the BackupOperationResultsClient object.
     */
    public BackupOperationResultsClient getBackupOperationResults() {
        return this.backupOperationResults;
    }

    /** The BackupOperationStatusesClient object to access its operations. */
    private final BackupOperationStatusesClient backupOperationStatuses;

    /**
     * Gets the BackupOperationStatusesClient object to access its operations.
     *
     * @return the BackupOperationStatusesClient object.
     */
    public BackupOperationStatusesClient getBackupOperationStatuses() {
        return this.backupOperationStatuses;
    }

    /** The ProtectionPolicyOperationStatusesClient object to access its operations. */
    private final ProtectionPolicyOperationStatusesClient protectionPolicyOperationStatuses;

    /**
     * Gets the ProtectionPolicyOperationStatusesClient object to access its operations.
     *
     * @return the ProtectionPolicyOperationStatusesClient object.
     */
    public ProtectionPolicyOperationStatusesClient getProtectionPolicyOperationStatuses() {
        return this.protectionPolicyOperationStatuses;
    }

    /** The BackupProtectableItemsClient object to access its operations. */
    private final BackupProtectableItemsClient backupProtectableItems;

    /**
     * Gets the BackupProtectableItemsClient object to access its operations.
     *
     * @return the BackupProtectableItemsClient object.
     */
    public BackupProtectableItemsClient getBackupProtectableItems() {
        return this.backupProtectableItems;
    }

    /** The BackupProtectionContainersClient object to access its operations. */
    private final BackupProtectionContainersClient backupProtectionContainers;

    /**
     * Gets the BackupProtectionContainersClient object to access its operations.
     *
     * @return the BackupProtectionContainersClient object.
     */
    public BackupProtectionContainersClient getBackupProtectionContainers() {
        return this.backupProtectionContainers;
    }

    /** The DeletedProtectionContainersClient object to access its operations. */
    private final DeletedProtectionContainersClient deletedProtectionContainers;

    /**
     * Gets the DeletedProtectionContainersClient object to access its operations.
     *
     * @return the DeletedProtectionContainersClient object.
     */
    public DeletedProtectionContainersClient getDeletedProtectionContainers() {
        return this.deletedProtectionContainers;
    }

    /** The SecurityPINsClient object to access its operations. */
    private final SecurityPINsClient securityPINs;

    /**
     * Gets the SecurityPINsClient object to access its operations.
     *
     * @return the SecurityPINsClient object.
     */
    public SecurityPINsClient getSecurityPINs() {
        return this.securityPINs;
    }

    /** The RecoveryPointsRecommendedForMovesClient object to access its operations. */
    private final RecoveryPointsRecommendedForMovesClient recoveryPointsRecommendedForMoves;

    /**
     * Gets the RecoveryPointsRecommendedForMovesClient object to access its operations.
     *
     * @return the RecoveryPointsRecommendedForMovesClient object.
     */
    public RecoveryPointsRecommendedForMovesClient getRecoveryPointsRecommendedForMoves() {
        return this.recoveryPointsRecommendedForMoves;
    }

    /** The ResourceGuardProxiesClient object to access its operations. */
    private final ResourceGuardProxiesClient resourceGuardProxies;

    /**
     * Gets the ResourceGuardProxiesClient object to access its operations.
     *
     * @return the ResourceGuardProxiesClient object.
     */
    public ResourceGuardProxiesClient getResourceGuardProxies() {
        return this.resourceGuardProxies;
    }

    /** The ResourceGuardProxyOperationsClient object to access its operations. */
    private final ResourceGuardProxyOperationsClient resourceGuardProxyOperations;

    /**
     * Gets the ResourceGuardProxyOperationsClient object to access its operations.
     *
     * @return the ResourceGuardProxyOperationsClient object.
     */
    public ResourceGuardProxyOperationsClient getResourceGuardProxyOperations() {
        return this.resourceGuardProxyOperations;
    }

    /**
     * Initializes an instance of RecoveryServicesBackupClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The subscription Id.
     * @param endpoint server parameter.
     */
    RecoveryServicesBackupClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2023-04-01";
        this.backupResourceStorageConfigsNonCrrs = new BackupResourceStorageConfigsNonCrrsClientImpl(this);
        this.protectionIntents = new ProtectionIntentsClientImpl(this);
        this.backupStatus = new BackupStatusClientImpl(this);
        this.featureSupports = new FeatureSupportsClientImpl(this);
        this.backupProtectionIntents = new BackupProtectionIntentsClientImpl(this);
        this.backupUsageSummaries = new BackupUsageSummariesClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.backupResourceVaultConfigs = new BackupResourceVaultConfigsClientImpl(this);
        this.backupResourceEncryptionConfigs = new BackupResourceEncryptionConfigsClientImpl(this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsClientImpl(this);
        this.privateEndpoints = new PrivateEndpointsClientImpl(this);
        this.resourceProviders = new ResourceProvidersClientImpl(this);
        this.bmsPrepareDataMoveOperationResults = new BmsPrepareDataMoveOperationResultsClientImpl(this);
        this.protectedItems = new ProtectedItemsClientImpl(this);
        this.protectedItemOperationResults = new ProtectedItemOperationResultsClientImpl(this);
        this.recoveryPoints = new RecoveryPointsClientImpl(this);
        this.restores = new RestoresClientImpl(this);
        this.backupPolicies = new BackupPoliciesClientImpl(this);
        this.protectionPolicies = new ProtectionPoliciesClientImpl(this);
        this.protectionPolicyOperationResults = new ProtectionPolicyOperationResultsClientImpl(this);
        this.backupJobs = new BackupJobsClientImpl(this);
        this.jobDetails = new JobDetailsClientImpl(this);
        this.jobCancellations = new JobCancellationsClientImpl(this);
        this.jobOperationResults = new JobOperationResultsClientImpl(this);
        this.exportJobsOperationResults = new ExportJobsOperationResultsClientImpl(this);
        this.jobs = new JobsClientImpl(this);
        this.backupProtectedItems = new BackupProtectedItemsClientImpl(this);
        this.operationOperations = new OperationOperationsClientImpl(this);
        this.validateOperations = new ValidateOperationsClientImpl(this);
        this.validateOperationResults = new ValidateOperationResultsClientImpl(this);
        this.validateOperationStatuses = new ValidateOperationStatusesClientImpl(this);
        this.backupEngines = new BackupEnginesClientImpl(this);
        this.protectionContainerRefreshOperationResults =
            new ProtectionContainerRefreshOperationResultsClientImpl(this);
        this.protectableContainers = new ProtectableContainersClientImpl(this);
        this.protectionContainers = new ProtectionContainersClientImpl(this);
        this.backupWorkloadItems = new BackupWorkloadItemsClientImpl(this);
        this.protectionContainerOperationResults = new ProtectionContainerOperationResultsClientImpl(this);
        this.backups = new BackupsClientImpl(this);
        this.protectedItemOperationStatuses = new ProtectedItemOperationStatusesClientImpl(this);
        this.itemLevelRecoveryConnections = new ItemLevelRecoveryConnectionsClientImpl(this);
        this.backupOperationResults = new BackupOperationResultsClientImpl(this);
        this.backupOperationStatuses = new BackupOperationStatusesClientImpl(this);
        this.protectionPolicyOperationStatuses = new ProtectionPolicyOperationStatusesClientImpl(this);
        this.backupProtectableItems = new BackupProtectableItemsClientImpl(this);
        this.backupProtectionContainers = new BackupProtectionContainersClientImpl(this);
        this.deletedProtectionContainers = new DeletedProtectionContainersClientImpl(this);
        this.securityPINs = new SecurityPINsClientImpl(this);
        this.recoveryPointsRecommendedForMoves = new RecoveryPointsRecommendedForMovesClientImpl(this);
        this.resourceGuardProxies = new ResourceGuardProxiesClientImpl(this);
        this.resourceGuardProxyOperations = new ResourceGuardProxyOperationsClientImpl(this);
    }

    /**
     * Gets default client context.
     *
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     *
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        return CoreUtils.mergeContexts(this.getContext(), context);
    }

    /**
     * Gets long running operation result.
     *
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(
        Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline,
        Type pollResultType,
        Type finalResultType,
        Context context) {
        return PollerFactory
            .create(
                serializerAdapter,
                httpPipeline,
                pollResultType,
                finalResultType,
                defaultPollInterval,
                activationResponse,
                context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     *
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse =
                    new HttpResponseImpl(
                        lroError.getResponseStatusCode(), lroError.getResponseHeaders(), lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError =
                            this
                                .getSerializerAdapter()
                                .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        LOGGER.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(s);
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RecoveryServicesBackupClientImpl.class);
}
