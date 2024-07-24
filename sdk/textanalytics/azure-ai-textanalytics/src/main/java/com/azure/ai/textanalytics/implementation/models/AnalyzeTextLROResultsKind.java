// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Enumeration of supported Text Analysis long-running operation task results.
 */
public final class AnalyzeTextLROResultsKind extends ExpandableStringEnum<AnalyzeTextLROResultsKind> {
    /**
     * Static value SentimentAnalysisLROResults for AnalyzeTextLROResultsKind.
     */
    public static final AnalyzeTextLROResultsKind SENTIMENT_ANALYSIS_LRORESULTS
        = fromString("SentimentAnalysisLROResults");

    /**
     * Static value EntityRecognitionLROResults for AnalyzeTextLROResultsKind.
     */
    public static final AnalyzeTextLROResultsKind ENTITY_RECOGNITION_LRORESULTS
        = fromString("EntityRecognitionLROResults");

    /**
     * Static value PiiEntityRecognitionLROResults for AnalyzeTextLROResultsKind.
     */
    public static final AnalyzeTextLROResultsKind PII_ENTITY_RECOGNITION_LRORESULTS
        = fromString("PiiEntityRecognitionLROResults");

    /**
     * Static value KeyPhraseExtractionLROResults for AnalyzeTextLROResultsKind.
     */
    public static final AnalyzeTextLROResultsKind KEY_PHRASE_EXTRACTION_LRORESULTS
        = fromString("KeyPhraseExtractionLROResults");

    /**
     * Static value EntityLinkingLROResults for AnalyzeTextLROResultsKind.
     */
    public static final AnalyzeTextLROResultsKind ENTITY_LINKING_LRORESULTS = fromString("EntityLinkingLROResults");

    /**
     * Static value HealthcareLROResults for AnalyzeTextLROResultsKind.
     */
    public static final AnalyzeTextLROResultsKind HEALTHCARE_LRORESULTS = fromString("HealthcareLROResults");

    /**
     * Static value ExtractiveSummarizationLROResults for AnalyzeTextLROResultsKind.
     */
    public static final AnalyzeTextLROResultsKind EXTRACTIVE_SUMMARIZATION_LRORESULTS
        = fromString("ExtractiveSummarizationLROResults");

    /**
     * Static value CustomEntityRecognitionLROResults for AnalyzeTextLROResultsKind.
     */
    public static final AnalyzeTextLROResultsKind CUSTOM_ENTITY_RECOGNITION_LRORESULTS
        = fromString("CustomEntityRecognitionLROResults");

    /**
     * Static value CustomSingleLabelClassificationLROResults for AnalyzeTextLROResultsKind.
     */
    public static final AnalyzeTextLROResultsKind CUSTOM_SINGLE_LABEL_CLASSIFICATION_LRORESULTS
        = fromString("CustomSingleLabelClassificationLROResults");

    /**
     * Static value CustomMultiLabelClassificationLROResults for AnalyzeTextLROResultsKind.
     */
    public static final AnalyzeTextLROResultsKind CUSTOM_MULTI_LABEL_CLASSIFICATION_LRORESULTS
        = fromString("CustomMultiLabelClassificationLROResults");

    /**
     * Static value AbstractiveSummarizationLROResults for AnalyzeTextLROResultsKind.
     */
    public static final AnalyzeTextLROResultsKind ABSTRACTIVE_SUMMARIZATION_LRORESULTS
        = fromString("AbstractiveSummarizationLROResults");

    /**
     * Creates a new instance of AnalyzeTextLROResultsKind value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AnalyzeTextLROResultsKind() {
    }

    /**
     * Creates or finds a AnalyzeTextLROResultsKind from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AnalyzeTextLROResultsKind.
     */
    public static AnalyzeTextLROResultsKind fromString(String name) {
        return fromString(name, AnalyzeTextLROResultsKind.class);
    }

    /**
     * Gets known AnalyzeTextLROResultsKind values.
     * 
     * @return known AnalyzeTextLROResultsKind values.
     */
    public static Collection<AnalyzeTextLROResultsKind> values() {
        return values(AnalyzeTextLROResultsKind.class);
    }
}
