// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.translation.text.models;

import com.azure.core.annotation.Fluent;
import java.util.ArrayList;
import java.util.List;

/**
 * Options that may be passed when translating a text.
 */
@Fluent
public final class TranslateOptions {
    private String sourceLanguage = null;
    private List<String> targetLanguages = new ArrayList<String>();
    private String clientTraceId = null;
    private TextType textType = TextType.PLAIN;
    private String category = null;
    private ProfanityAction profanityAction = ProfanityAction.NO_ACTION;
    private ProfanityMarker profanityMarker = ProfanityMarker.ASTERISK;
    private Boolean includeAlignment = false;
    private Boolean includeSentenceLength = false;
    private String suggestedSourceLanguage = null;
    private String sourceLanguageScript = null;
    private String targetLanguageScript = null;
    private Boolean allowFallback = false;

    /**
     * Creates a new instance of the TranslateOptions class.
     */
    public TranslateOptions() {

    }

    /**
     * Returns the list of target languages.
     * @return the list of target languages.
     */
    public List<String> getTargetLanguages() {
        return targetLanguages;
    }

    /**
     * Sets the list of target languages.
     * @param targetLanguages the list of target languages.
     * @return The updated options.
     */
    public TranslateOptions setTargetLanguages(List<String> targetLanguages) {
        this.targetLanguages = targetLanguages;
        return this;
    }

    /**
     * Adds a language to the list of target languages.
     *
     * @param targetLanguage language to add to the list of target languages.
     * @return The updated options.
     */
    public TranslateOptions addTargetLanguage(String targetLanguage) {
        if (targetLanguages == null) {
            targetLanguages = new ArrayList<String>();
        }
        targetLanguages.add(targetLanguage);
        return this;
    }

    /**
     * Returns the source language.
     *
     * @return Specifies the language of the input text.
     */
    public String getSourceLanguage() {
        return sourceLanguage;
    }

    /**
     * Sets the source language.
     *
     * @param sourceLanguage Specifies the language of the input text.
     * @return The updated options.
     */
    public TranslateOptions setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }

    /**
     * Returns the client-generated GUID to uniquely identify the request.
     *
     * @return client-generated GUID to uniquely identify the request.
     */
    public String getClientTraceId() {
        return clientTraceId;
    }

    /**
     * Sets the client-generated GUID to uniquely identify the request.
     * @param clientTraceId client-generated GUID to uniquely identify the request.
     * @return The updated options.
     */
    public TranslateOptions setClientTraceId(String clientTraceId) {
        this.clientTraceId = clientTraceId;
        return this;
    }

    /**
     * Returns whether the text being translated is plain text or HTML text.
     * @return specifies whether the text being translated is plain text or HTML text.
     */
    public TextType getTextType() {
        return textType;
    }

    /**
     * Sets whether the text being translated is plain text or HTML text.
     *
     * @param textType specifies whether the text being translated is plain text or HTML text.
     * @return The updated options.
     */
    public TranslateOptions setTextType(TextType textType) {
        this.textType = textType;
        return this;
    }

    /**
     * Returns the category (domain) of the translation.
     * @return specifying the category (domain) of the translation.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category (domain) of the translation.
     *
     * @param category specifying the category (domain) of the translation.
     * @return The updated options.
     */
    public TranslateOptions setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Returns how profanities should be treated in translations.
     * @return specifies how profanities should be treated in translations.
     */
    public ProfanityAction getProfanityAction() {
        return profanityAction;
    }

    /**
     * Sets how profanities should be treated in translations.
     * @param profanityAction specifies how profanities should be treated in translations.
     * @return The updated options.
     */
    public TranslateOptions setProfanityAction(ProfanityAction profanityAction) {
        this.profanityAction = profanityAction;
        return this;
    }

    /**
     * Returns how profanities should be marked in translations.
     * @return specifies how profanities should be marked in translations.
     */
    public ProfanityMarker getProfanityMarker() {
        return profanityMarker;
    }

    /**
     * Sets how profanities should be marked in translations.
     * @param profanityMarker specifies how profanities should be marked in translations.
     * @return The updated options.
     */
    public TranslateOptions setProfanityMarker(ProfanityMarker profanityMarker) {
        this.profanityMarker = profanityMarker;
        return this;
    }

    /**
     * Returns whether to include alignment projection from source text to translated text.
     * @return Whether to include alignment projection from source text to translated text.
     */
    public Boolean isIncludeAlignment() {
        return includeAlignment;
    }

    /**
     * Sets whether to include alignment projection from source text to translated text.
     * @param includeAlignment Whether to include alignment projection from source text to translated text.
     * @return The updated options.
     */
    public TranslateOptions setIncludeAlignment(Boolean includeAlignment) {
        this.includeAlignment = includeAlignment;
        return this;
    }

    /**
     * Returns whether to include sentence boundaries for the input text and the translated text.
     * @return Whether to include sentence boundaries for the input text and the translated text.
     */
    public Boolean isIncludeSentenceLength() {
        return includeSentenceLength;
    }

    /**
     * Sets whether to include sentence boundaries for the input text and the translated text.
     * @param includeSentenceLength Whether to include sentence boundaries for the input text and the translated text.
     * @return The updated options.
     */
    public TranslateOptions setIncludeSentenceLength(Boolean includeSentenceLength) {
        this.includeSentenceLength = includeSentenceLength;
        return this;
    }

    /**
     * Returns the fallback language if the language of the input text can't be identified.
     * @return fallback language if the language of the input text can't be identified.
     */
    public String getSuggestedSourceLanguage() {
        return suggestedSourceLanguage;
    }

    /**
     * Sets the fallback language if the language of the input text can't be identified.
     * @param suggestedSourceLanguage fallback language if the language of the input text can't be identified.
     * @return The updated options.
     */
    public TranslateOptions setSuggestedSourceLanguage(String suggestedSourceLanguage) {
        this.suggestedSourceLanguage = suggestedSourceLanguage;
        return this;
    }

    /**
     * Returns the script of the input text.
     * @return the script of the input text.
     */
    public String getSourceLanguageScript() {
        return sourceLanguageScript;
    }

    /**
     * Sets the script of the input text.
     * @param sourceLanguageScript the script of the input text.
     * @return The updated options.
     */
    public TranslateOptions setSourceLanguageScript(String sourceLanguageScript) {
        this.sourceLanguageScript = sourceLanguageScript;
        return this;
    }

    /**
     * Returns the script of the translated text.
     * @return the script of the translated text.
     */
    public String getTargetLanguageScript() {
        return targetLanguageScript;
    }

    /**
     * Sets the script of the translated text.
     * @param targetLanguageScript the script of the translated text.
     * @return The updated options.
     */
    public TranslateOptions setTargetLanguageScript(String targetLanguageScript) {
        this.targetLanguageScript = targetLanguageScript;
        return this;
    }

    /**
     * Returns whether the service allows fallback for Custom Translator requests.
     * @return Whether the service allows fallback for Custom Translator requests.
     */
    public Boolean isAllowFallback() {
        return allowFallback;
    }

    /**
     * Sets whether the service allows fallback for Custom Translator requests.
     * @param allowFallback Whether the service allows fallback for Custom Translator requests.
     * @return The updated options.
     */
    public TranslateOptions setAllowFallback(Boolean allowFallback) {
        this.allowFallback = allowFallback;
        return this;
    }
}
