// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.anomalydetector;

import com.azure.ai.anomalydetector.implementation.UnivariatesImpl;
import com.azure.ai.anomalydetector.models.UnivariateChangePointDetectionOptions;
import com.azure.ai.anomalydetector.models.UnivariateChangePointDetectionResult;
import com.azure.ai.anomalydetector.models.UnivariateDetectionOptions;
import com.azure.ai.anomalydetector.models.UnivariateLastDetectionResult;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.ai.anomalydetector.models.UnivariateEntireDetectionResult;

/**
 * Initializes a new instance of the synchronous AnomalyDetectorClient type.
 */
@ServiceClient(builder = AnomalyDetectorClientBuilder.class)
public final class UnivariateClient {

    @Generated
    private final UnivariatesImpl serviceClient;

    /**
     * Initializes an instance of UnivariateClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    UnivariateClient(UnivariatesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Detect anomalies for the entire series in batch.
     *
     * This operation generates a model with an entire series. Each point is detected
     * with the same model. With this method, points before and after a certain point
     * are used to determine whether it's an anomaly. The entire detection can give the
     * user an overall status of the time series.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     series (Required): [
     *          (Required){
     *             timestamp: OffsetDateTime (Optional)
     *             value: double (Required)
     *         }
     *     ]
     *     granularity: String(yearly/monthly/weekly/daily/hourly/minutely/secondly/microsecond/none) (Optional)
     *     customInterval: Integer (Optional)
     *     period: Integer (Optional)
     *     maxAnomalyRatio: Double (Optional)
     *     sensitivity: Integer (Optional)
     *     imputeMode: String(auto/previous/linear/fixed/zero/notFill) (Optional)
     *     imputeFixedValue: Double (Optional)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     period: int (Required)
     *     expectedValues (Required): [
     *         double (Required)
     *     ]
     *     upperMargins (Required): [
     *         double (Required)
     *     ]
     *     lowerMargins (Required): [
     *         double (Required)
     *     ]
     *     isAnomaly (Required): [
     *         boolean (Required)
     *     ]
     *     isNegativeAnomaly (Required): [
     *         boolean (Required)
     *     ]
     *     isPositiveAnomaly (Required): [
     *         boolean (Required)
     *     ]
     *     severity (Optional): [
     *         double (Optional)
     *     ]
     * }
     * }</pre>
     *
     * @param options Method of univariate anomaly detection.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return response of the entire anomaly detection along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> detectUnivariateEntireSeriesWithResponse(BinaryData options,
        RequestOptions requestOptions) {
        return this.serviceClient.detectUnivariateEntireSeriesWithResponse(options, requestOptions);
    }

    /**
     * Detect anomaly status of the latest point in time series.
     *
     * This operation generates a model by using the points that you sent in to the API
     * and based on all data to determine whether the last point is anomalous.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     series (Required): [
     *          (Required){
     *             timestamp: OffsetDateTime (Optional)
     *             value: double (Required)
     *         }
     *     ]
     *     granularity: String(yearly/monthly/weekly/daily/hourly/minutely/secondly/microsecond/none) (Optional)
     *     customInterval: Integer (Optional)
     *     period: Integer (Optional)
     *     maxAnomalyRatio: Double (Optional)
     *     sensitivity: Integer (Optional)
     *     imputeMode: String(auto/previous/linear/fixed/zero/notFill) (Optional)
     *     imputeFixedValue: Double (Optional)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     period: int (Required)
     *     suggestedWindow: int (Required)
     *     expectedValue: double (Required)
     *     upperMargin: double (Required)
     *     lowerMargin: double (Required)
     *     isAnomaly: boolean (Required)
     *     isNegativeAnomaly: boolean (Required)
     *     isPositiveAnomaly: boolean (Required)
     *     severity: Double (Optional)
     * }
     * }</pre>
     *
     * @param options Method of univariate anomaly detection.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return response of the last anomaly detection along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> detectUnivariateLastPointWithResponse(BinaryData options,
        RequestOptions requestOptions) {
        return this.serviceClient.detectUnivariateLastPointWithResponse(options, requestOptions);
    }

    /**
     * Detect change point for the entire series
     *
     * Evaluate the change point score of every series point.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     series (Required): [
     *          (Required){
     *             timestamp: OffsetDateTime (Optional)
     *             value: double (Required)
     *         }
     *     ]
     *     granularity: String(yearly/monthly/weekly/daily/hourly/minutely/secondly/microsecond/none) (Required)
     *     customInterval: Integer (Optional)
     *     period: Integer (Optional)
     *     stableTrendWindow: Integer (Optional)
     *     threshold: Double (Optional)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     period: Integer (Optional)
     *     isChangePoint (Optional): [
     *         boolean (Optional)
     *     ]
     *     confidenceScores (Optional): [
     *         double (Optional)
     *     ]
     * }
     * }</pre>
     *
     * @param options Method of univariate anomaly detection.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return response of change point detection along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> detectUnivariateChangePointWithResponse(BinaryData options,
        RequestOptions requestOptions) {
        return this.serviceClient.detectUnivariateChangePointWithResponse(options, requestOptions);
    }

    /**
     * Detect anomalies for the entire series in batch.
     *
     * This operation generates a model with an entire series. Each point is detected
     * with the same model. With this method, points before and after a certain point
     * are used to determine whether it's an anomaly. The entire detection can give the
     * user an overall status of the time series.
     *
     * @param options Method of univariate anomaly detection.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return response of the entire anomaly detection along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public UnivariateEntireDetectionResult detectUnivariateEntireSeries(UnivariateDetectionOptions options) {
        return detectUnivariateEntireSeriesWithResponse(BinaryData.fromObject(options), new RequestOptions()).getValue()
            .toObject(UnivariateEntireDetectionResult.class);
    }

    /**
     * Detect anomaly status of the latest point in time series.
     *
     * This operation generates a model by using the points that you sent in to the API
     * and based on all data to determine whether the last point is anomalous.
     *
     * @param options Method of univariate anomaly detection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of the last anomaly detection.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public UnivariateLastDetectionResult detectUnivariateLastPoint(UnivariateDetectionOptions options) {
        // Generated convenience method for detectUnivariateLastPointWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return detectUnivariateLastPointWithResponse(BinaryData.fromObject(options), requestOptions).getValue()
            .toObject(UnivariateLastDetectionResult.class);
    }

    /**
     * Detect change point for the entire series
     *
     * Evaluate the change point score of every series point.
     *
     * @param options Method of univariate anomaly detection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of change point detection.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public UnivariateChangePointDetectionResult
        detectUnivariateChangePoint(UnivariateChangePointDetectionOptions options) {
        // Generated convenience method for detectUnivariateChangePointWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return detectUnivariateChangePointWithResponse(BinaryData.fromObject(options), requestOptions).getValue()
            .toObject(UnivariateChangePointDetectionResult.class);
    }
}
