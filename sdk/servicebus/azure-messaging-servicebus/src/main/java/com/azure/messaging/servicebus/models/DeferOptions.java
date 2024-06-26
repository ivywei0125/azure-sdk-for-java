// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.models;

import com.azure.messaging.servicebus.ServiceBusReceivedMessage;
import com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient;
import com.azure.messaging.servicebus.ServiceBusReceiverClient;
import com.azure.messaging.servicebus.ServiceBusSenderAsyncClient;
import com.azure.messaging.servicebus.ServiceBusSenderClient;
import com.azure.messaging.servicebus.ServiceBusTransactionContext;

import java.util.Map;

/**
 * Options to specify when deferring a {@link ServiceBusReceivedMessage message} received via
 * {@link ServiceBusReceiveMode#PEEK_LOCK}.
 *
 * @see ServiceBusReceiverAsyncClient#defer(ServiceBusReceivedMessage, DeferOptions)
 * @see ServiceBusReceiverClient#defer(ServiceBusReceivedMessage, DeferOptions)
 * @see <a href="https://learn.microsoft.com/azure/service-bus-messaging/message-transfers-locks-settlement#peeklock">
 *     Settling messages</a>
 */
public final class DeferOptions extends SettlementOptions {
    private Map<String, Object> propertiesToModify;

    /**
     * Creates a new instance of options to specify when deferring messages.
     */
    public DeferOptions() {
    }

    /**
     * Sets the message properties to modify while deferring the message.
     *
     * @param propertiesToModify Message properties to modify.
     *
     * @return The updated {@link DeferOptions} object.
     */
    public DeferOptions setPropertiesToModify(Map<String, Object> propertiesToModify) {
        this.propertiesToModify = propertiesToModify;
        return this;
    }

    /**
     * Gets the message properties to modify while deferring the message.
     *
     * @return The message properties to modify while deferring the message.
     */
    public Map<String, Object> getPropertiesToModify() {
        return propertiesToModify;
    }

    /**
     * Sets the {@link ServiceBusTransactionContext} to the options.
     *
     * @param transactionContext The {@link ServiceBusTransactionContext} that will be used to defer a message.
     *
     * @return The updated {@link DeferOptions} object.
     *
     * @see ServiceBusSenderClient#createTransaction()
     * @see ServiceBusSenderAsyncClient#createTransaction()
     * @see ServiceBusReceiverClient#createTransaction()
     * @see ServiceBusReceiverAsyncClient#createTransaction()
     */
    @Override
    public DeferOptions setTransactionContext(ServiceBusTransactionContext transactionContext) {
        super.setTransactionContext(transactionContext);
        return this;
    }
}
