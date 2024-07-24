// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.implementation.storage.queue;

import com.azure.spring.cloud.autoconfigure.implementation.condition.ConditionalOnAnyProperty;
<<<<<<<< HEAD:sdk/spring/spring-cloud-azure-autoconfigure/src/main/java/com/azure/spring/cloud/autoconfigure/implementation/storage/queue/AzureStorageQueueAutoConfiguration.java
import com.azure.spring.cloud.autoconfigure.implementation.properties.utils.AzureServicePropertiesUtils;
import com.azure.spring.cloud.autoconfigure.implementation.storage.AzureStorageConfiguration;
========
>>>>>>>> origin/main:sdk/spring/spring-cloud-azure-autoconfigure/src/main/java/com/azure/spring/cloud/autoconfigure/implementation/storage/queue/QueueClientConfiguration.java
import com.azure.spring.cloud.autoconfigure.implementation.storage.common.AzureStorageProperties;
import com.azure.spring.cloud.autoconfigure.implementation.storage.queue.properties.AzureStorageQueueProperties;
import com.azure.spring.cloud.core.customizer.AzureServiceClientBuilderCustomizer;
import com.azure.spring.cloud.core.implementation.util.AzureSpringIdentifier;
import com.azure.spring.cloud.core.provider.connectionstring.ServiceConnectionStringProvider;
import com.azure.spring.cloud.core.provider.connectionstring.StaticConnectionStringProvider;
import com.azure.spring.cloud.core.service.AzureServiceType;
import com.azure.spring.cloud.service.implementation.storage.queue.QueueServiceClientBuilderFactory;
import com.azure.storage.queue.QueueAsyncClient;
import com.azure.storage.queue.QueueClient;
import com.azure.storage.queue.QueueServiceAsyncClient;
import com.azure.storage.queue.QueueServiceClient;
import com.azure.storage.queue.QueueServiceClientBuilder;
import org.springframework.beans.factory.ObjectProvider;
<<<<<<<< HEAD:sdk/spring/spring-cloud-azure-autoconfigure/src/main/java/com/azure/spring/cloud/autoconfigure/implementation/storage/queue/AzureStorageQueueAutoConfiguration.java
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
========
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
>>>>>>>> origin/main:sdk/spring/spring-cloud-azure-autoconfigure/src/main/java/com/azure/spring/cloud/autoconfigure/implementation/storage/queue/QueueClientConfiguration.java
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@ConditionalOnBean(AzureStorageQueueProperties.class)
class QueueClientConfiguration {

    @Bean
<<<<<<<< HEAD:sdk/spring/spring-cloud-azure-autoconfigure/src/main/java/com/azure/spring/cloud/autoconfigure/implementation/storage/queue/AzureStorageQueueAutoConfiguration.java
    @ConfigurationProperties(AzureStorageQueueProperties.PREFIX)
    AzureStorageQueueProperties azureStorageQueueProperties(@Qualifier("azureStorageProperties") AzureStorageProperties azureStorageProperties) {
        return AzureServicePropertiesUtils.loadServiceCommonProperties(azureStorageProperties, new AzureStorageQueueProperties());
    }

    @Bean
========
>>>>>>>> origin/main:sdk/spring/spring-cloud-azure-autoconfigure/src/main/java/com/azure/spring/cloud/autoconfigure/implementation/storage/queue/QueueClientConfiguration.java
    @ConditionalOnMissingBean
    QueueServiceClient queueServiceClient(QueueServiceClientBuilder builder) {
        return builder.buildClient();
    }

    @Bean
    @ConditionalOnMissingBean
    QueueServiceAsyncClient queueServiceAsyncClient(QueueServiceClientBuilder builder) {
        return builder.buildAsyncClient();
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = AzureStorageQueueProperties.PREFIX, name = "queue-name")
    QueueClient queueClient(QueueServiceClient queueServiceClient, AzureStorageQueueProperties properties) {
        return queueServiceClient.getQueueClient(properties.getQueueName());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = AzureStorageQueueProperties.PREFIX, name = "queue-name")
    QueueAsyncClient queueAsyncClient(QueueServiceAsyncClient queueServiceAsyncClient,
                                      AzureStorageQueueProperties properties) {
        return queueServiceAsyncClient.getQueueAsyncClient(properties.getQueueName());
    }

    @Bean
    @ConditionalOnMissingBean
    QueueServiceClientBuilderFactory queueServiceClientBuilderFactory(
        AzureStorageQueueProperties properties,
        ObjectProvider<ServiceConnectionStringProvider<AzureServiceType.StorageQueue>> connectionStringProviders,
        ObjectProvider<AzureServiceClientBuilderCustomizer<QueueServiceClientBuilder>> customizers) {
        final QueueServiceClientBuilderFactory factory = new QueueServiceClientBuilderFactory(properties);

        factory.setSpringIdentifier(AzureSpringIdentifier.AZURE_SPRING_STORAGE_QUEUE);
        connectionStringProviders.orderedStream().findFirst().ifPresent(factory::setConnectionStringProvider);
        customizers.orderedStream().forEach(factory::addBuilderCustomizer);
        return factory;
    }

    @Bean
    @ConditionalOnMissingBean
    QueueServiceClientBuilder queueServiceClientBuilder(QueueServiceClientBuilderFactory factory) {
        return factory.build();
    }

    @Bean
    @ConditionalOnAnyProperty(prefixes = {AzureStorageQueueProperties.PREFIX, AzureStorageProperties.PREFIX}, name = {"connection-string"})
    StaticConnectionStringProvider<AzureServiceType.StorageQueue> staticStorageQueueConnectionStringProvider(
        AzureStorageQueueProperties properties) {

        return new StaticConnectionStringProvider<>(AzureServiceType.STORAGE_QUEUE, properties.getConnectionString());
    }
}
