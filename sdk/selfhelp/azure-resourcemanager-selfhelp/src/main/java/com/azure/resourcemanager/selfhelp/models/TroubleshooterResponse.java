// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** User Response for Troubleshooter continue request. */
@Fluent
public final class TroubleshooterResponse {
    /*
     * id of the question.
     */
    @JsonProperty(value = "questionId")
    private String questionId;

    /*
     * Text Input. Will be a single line input.
     */
    @JsonProperty(value = "questionType")
    private QuestionType questionType;

    /*
     * Response key for SingleInput. For Multi-line test/open ended question it is free form text
     */
    @JsonProperty(value = "response")
    private String response;

    /** Creates an instance of TroubleshooterResponse class. */
    public TroubleshooterResponse() {
    }

    /**
     * Get the questionId property: id of the question.
     *
     * @return the questionId value.
     */
    public String questionId() {
        return this.questionId;
    }

    /**
     * Set the questionId property: id of the question.
     *
     * @param questionId the questionId value to set.
     * @return the TroubleshooterResponse object itself.
     */
    public TroubleshooterResponse withQuestionId(String questionId) {
        this.questionId = questionId;
        return this;
    }

    /**
     * Get the questionType property: Text Input. Will be a single line input.
     *
     * @return the questionType value.
     */
    public QuestionType questionType() {
        return this.questionType;
    }

    /**
     * Set the questionType property: Text Input. Will be a single line input.
     *
     * @param questionType the questionType value to set.
     * @return the TroubleshooterResponse object itself.
     */
    public TroubleshooterResponse withQuestionType(QuestionType questionType) {
        this.questionType = questionType;
        return this;
    }

    /**
     * Get the response property: Response key for SingleInput. For Multi-line test/open ended question it is free form
     * text.
     *
     * @return the response value.
     */
    public String response() {
        return this.response;
    }

    /**
     * Set the response property: Response key for SingleInput. For Multi-line test/open ended question it is free form
     * text.
     *
     * @param response the response value to set.
     * @return the TroubleshooterResponse object itself.
     */
    public TroubleshooterResponse withResponse(String response) {
        this.response = response;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
