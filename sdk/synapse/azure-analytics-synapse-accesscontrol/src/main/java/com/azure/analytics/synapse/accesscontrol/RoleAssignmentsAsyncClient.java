// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.accesscontrol;

import com.azure.analytics.synapse.accesscontrol.implementation.RoleAssignmentsImpl;
import com.azure.analytics.synapse.accesscontrol.models.CheckPrincipalAccessResponse;
import com.azure.analytics.synapse.accesscontrol.models.ErrorContractException;
import com.azure.analytics.synapse.accesscontrol.models.RequiredAction;
import com.azure.analytics.synapse.accesscontrol.models.RoleAssignmentDetails;
import com.azure.analytics.synapse.accesscontrol.models.RoleAssignmentDetailsList;
import com.azure.analytics.synapse.accesscontrol.models.RoleAssignmentsListRoleAssignmentsHeaders;
import com.azure.analytics.synapse.accesscontrol.models.SubjectInfo;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.ResponseBase;
import java.util.List;
import java.util.UUID;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the asynchronous AccessControlClient type.
 */
@ServiceClient(builder = AccessControlClientBuilder.class, isAsync = true)
public final class RoleAssignmentsAsyncClient {
    @Generated
    private final RoleAssignmentsImpl serviceClient;

    /**
     * Initializes an instance of RoleAssignmentsAsyncClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    RoleAssignmentsAsyncClient(RoleAssignmentsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Check if the given principalId has access to perform list of actions at a given scope.
     * 
     * @param subject Subject details.
     * @param actions List of actions.
     * @param scope Scope at which the check access is done.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check access response details along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CheckPrincipalAccessResponse>> checkPrincipalAccessWithResponse(SubjectInfo subject,
        List<RequiredAction> actions, String scope) {
        return this.serviceClient.checkPrincipalAccessWithResponseAsync(subject, actions, scope);
    }

    /**
     * Check if the given principalId has access to perform list of actions at a given scope.
     * 
     * @param subject Subject details.
     * @param actions List of actions.
     * @param scope Scope at which the check access is done.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check access response details on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CheckPrincipalAccessResponse> checkPrincipalAccess(SubjectInfo subject, List<RequiredAction> actions,
        String scope) {
        return this.serviceClient.checkPrincipalAccessAsync(subject, actions, scope);
    }

    /**
     * List role assignments.
     * 
     * @param roleId Synapse Built-In Role Id.
     * @param principalId Object ID of the AAD principal or security-group.
     * @param scope Scope of the Synapse Built-in Role.
     * @param continuationToken Continuation token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment response details along with {@link ResponseBase} on successful completion of
     * {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResponseBase<RoleAssignmentsListRoleAssignmentsHeaders, RoleAssignmentDetailsList>>
        listRoleAssignmentsWithResponse(String roleId, String principalId, String scope, String continuationToken) {
        return this.serviceClient.listRoleAssignmentsWithResponseAsync(roleId, principalId, scope, continuationToken);
    }

    /**
     * List role assignments.
     * 
     * @param roleId Synapse Built-In Role Id.
     * @param principalId Object ID of the AAD principal or security-group.
     * @param scope Scope of the Synapse Built-in Role.
     * @param continuationToken Continuation token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment response details on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RoleAssignmentDetailsList> listRoleAssignments(String roleId, String principalId, String scope,
        String continuationToken) {
        return this.serviceClient.listRoleAssignmentsAsync(roleId, principalId, scope, continuationToken);
    }

    /**
     * List role assignments.
     * 
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment response details on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RoleAssignmentDetailsList> listRoleAssignments() {
        return this.serviceClient.listRoleAssignmentsAsync();
    }

    /**
     * List role assignments.
     * 
     * @param roleId Synapse Built-In Role Id.
     * @param principalId Object ID of the AAD principal or security-group.
     * @param scope Scope of the Synapse Built-in Role.
     * @param continuationToken Continuation token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment response details along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RoleAssignmentDetailsList>> listRoleAssignmentsNoCustomHeadersWithResponse(String roleId,
        String principalId, String scope, String continuationToken) {
        return this.serviceClient.listRoleAssignmentsNoCustomHeadersWithResponseAsync(roleId, principalId, scope,
            continuationToken);
    }

    /**
     * Create role assignment.
     * 
     * @param roleAssignmentId The ID of the role assignment.
     * @param roleId Role ID of the Synapse Built-In Role.
     * @param principalId Object ID of the AAD principal or security-group.
     * @param scope Scope at which the role assignment is created.
     * @param principalType Type of the principal Id: User, Group or ServicePrincipal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment response details along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RoleAssignmentDetails>> createRoleAssignmentWithResponse(String roleAssignmentId, UUID roleId,
        UUID principalId, String scope, String principalType) {
        return this.serviceClient.createRoleAssignmentWithResponseAsync(roleAssignmentId, roleId, principalId, scope,
            principalType);
    }

    /**
     * Create role assignment.
     * 
     * @param roleAssignmentId The ID of the role assignment.
     * @param roleId Role ID of the Synapse Built-In Role.
     * @param principalId Object ID of the AAD principal or security-group.
     * @param scope Scope at which the role assignment is created.
     * @param principalType Type of the principal Id: User, Group or ServicePrincipal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment response details on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RoleAssignmentDetails> createRoleAssignment(String roleAssignmentId, UUID roleId, UUID principalId,
        String scope, String principalType) {
        return this.serviceClient.createRoleAssignmentAsync(roleAssignmentId, roleId, principalId, scope,
            principalType);
    }

    /**
     * Create role assignment.
     * 
     * @param roleAssignmentId The ID of the role assignment.
     * @param roleId Role ID of the Synapse Built-In Role.
     * @param principalId Object ID of the AAD principal or security-group.
     * @param scope Scope at which the role assignment is created.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment response details on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RoleAssignmentDetails> createRoleAssignment(String roleAssignmentId, UUID roleId, UUID principalId,
        String scope) {
        return this.serviceClient.createRoleAssignmentAsync(roleAssignmentId, roleId, principalId, scope);
    }

    /**
     * Get role assignment by role assignment Id.
     * 
     * @param roleAssignmentId The ID of the role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment by role assignment Id along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RoleAssignmentDetails>> getRoleAssignmentByIdWithResponse(String roleAssignmentId) {
        return this.serviceClient.getRoleAssignmentByIdWithResponseAsync(roleAssignmentId);
    }

    /**
     * Get role assignment by role assignment Id.
     * 
     * @param roleAssignmentId The ID of the role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment by role assignment Id on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RoleAssignmentDetails> getRoleAssignmentById(String roleAssignmentId) {
        return this.serviceClient.getRoleAssignmentByIdAsync(roleAssignmentId);
    }

    /**
     * Delete role assignment by role assignment Id.
     * 
     * @param roleAssignmentId The ID of the role assignment.
     * @param scope Scope of the Synapse Built-in Role.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteRoleAssignmentByIdWithResponse(String roleAssignmentId, String scope) {
        return this.serviceClient.deleteRoleAssignmentByIdWithResponseAsync(roleAssignmentId, scope);
    }

    /**
     * Delete role assignment by role assignment Id.
     * 
     * @param roleAssignmentId The ID of the role assignment.
     * @param scope Scope of the Synapse Built-in Role.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteRoleAssignmentById(String roleAssignmentId, String scope) {
        return this.serviceClient.deleteRoleAssignmentByIdAsync(roleAssignmentId, scope);
    }

    /**
     * Delete role assignment by role assignment Id.
     * 
     * @param roleAssignmentId The ID of the role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteRoleAssignmentById(String roleAssignmentId) {
        return this.serviceClient.deleteRoleAssignmentByIdAsync(roleAssignmentId);
    }
}
