// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.support.fluent.models.FileDetailsInner;
import com.azure.resourcemanager.support.models.UploadFile;

/** An instance of this class provides access to all the operations defined in FilesClient. */
public interface FilesClient {
    /**
     * Lists all the Files information under a workspace for an Azure subscription.
     *
     * @param fileWorkspaceName File Workspace Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents a collection of File resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FileDetailsInner> list(String fileWorkspaceName);

    /**
     * Lists all the Files information under a workspace for an Azure subscription.
     *
     * @param fileWorkspaceName File Workspace Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents a collection of File resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FileDetailsInner> list(String fileWorkspaceName, Context context);

    /**
     * Returns details of a specific file in a work space.
     *
     * @param fileWorkspaceName File Workspace Name.
     * @param fileName File Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents File Details resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FileDetailsInner> getWithResponse(String fileWorkspaceName, String fileName, Context context);

    /**
     * Returns details of a specific file in a work space.
     *
     * @param fileWorkspaceName File Workspace Name.
     * @param fileName File Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents File Details resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FileDetailsInner get(String fileWorkspaceName, String fileName);

    /**
     * Creates a new file under a workspace for the specified subscription.
     *
     * @param fileWorkspaceName File workspace name.
     * @param fileName File name.
     * @param createFileParameters Create file object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents File Details resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FileDetailsInner> createWithResponse(
        String fileWorkspaceName, String fileName, FileDetailsInner createFileParameters, Context context);

    /**
     * Creates a new file under a workspace for the specified subscription.
     *
     * @param fileWorkspaceName File workspace name.
     * @param fileName File name.
     * @param createFileParameters Create file object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents File Details resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FileDetailsInner create(String fileWorkspaceName, String fileName, FileDetailsInner createFileParameters);

    /**
     * This API allows you to upload content to a file.
     *
     * @param fileWorkspaceName File WorkspaceName.
     * @param fileName File Name.
     * @param uploadFile UploadFile object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> uploadWithResponse(
        String fileWorkspaceName, String fileName, UploadFile uploadFile, Context context);

    /**
     * This API allows you to upload content to a file.
     *
     * @param fileWorkspaceName File WorkspaceName.
     * @param fileName File Name.
     * @param uploadFile UploadFile object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void upload(String fileWorkspaceName, String fileName, UploadFile uploadFile);
}
