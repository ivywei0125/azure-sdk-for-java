// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines the names of all text analyzers supported by the search engine.
 */
public final class LexicalAnalyzerName extends ExpandableStringEnum<LexicalAnalyzerName> {
    /**
     * Microsoft analyzer for Arabic.
     */
    public static final LexicalAnalyzerName AR_MICROSOFT = fromString("ar.microsoft");

    /**
     * Lucene analyzer for Arabic.
     */
    public static final LexicalAnalyzerName AR_LUCENE = fromString("ar.lucene");

    /**
     * Lucene analyzer for Armenian.
     */
    public static final LexicalAnalyzerName HY_LUCENE = fromString("hy.lucene");

    /**
     * Microsoft analyzer for Bangla.
     */
    public static final LexicalAnalyzerName BN_MICROSOFT = fromString("bn.microsoft");

    /**
     * Lucene analyzer for Basque.
     */
    public static final LexicalAnalyzerName EU_LUCENE = fromString("eu.lucene");

    /**
     * Microsoft analyzer for Bulgarian.
     */
    public static final LexicalAnalyzerName BG_MICROSOFT = fromString("bg.microsoft");

    /**
     * Lucene analyzer for Bulgarian.
     */
    public static final LexicalAnalyzerName BG_LUCENE = fromString("bg.lucene");

    /**
     * Microsoft analyzer for Catalan.
     */
    public static final LexicalAnalyzerName CA_MICROSOFT = fromString("ca.microsoft");

    /**
     * Lucene analyzer for Catalan.
     */
    public static final LexicalAnalyzerName CA_LUCENE = fromString("ca.lucene");

    /**
     * Microsoft analyzer for Chinese (Simplified).
     */
    public static final LexicalAnalyzerName ZH_HANS_MICROSOFT = fromString("zh-Hans.microsoft");

    /**
     * Lucene analyzer for Chinese (Simplified).
     */
    public static final LexicalAnalyzerName ZH_HANS_LUCENE = fromString("zh-Hans.lucene");

    /**
     * Microsoft analyzer for Chinese (Traditional).
     */
    public static final LexicalAnalyzerName ZH_HANT_MICROSOFT = fromString("zh-Hant.microsoft");

    /**
     * Lucene analyzer for Chinese (Traditional).
     */
    public static final LexicalAnalyzerName ZH_HANT_LUCENE = fromString("zh-Hant.lucene");

    /**
     * Microsoft analyzer for Croatian.
     */
    public static final LexicalAnalyzerName HR_MICROSOFT = fromString("hr.microsoft");

    /**
     * Microsoft analyzer for Czech.
     */
    public static final LexicalAnalyzerName CS_MICROSOFT = fromString("cs.microsoft");

    /**
     * Lucene analyzer for Czech.
     */
    public static final LexicalAnalyzerName CS_LUCENE = fromString("cs.lucene");

    /**
     * Microsoft analyzer for Danish.
     */
    public static final LexicalAnalyzerName DA_MICROSOFT = fromString("da.microsoft");

    /**
     * Lucene analyzer for Danish.
     */
    public static final LexicalAnalyzerName DA_LUCENE = fromString("da.lucene");

    /**
     * Microsoft analyzer for Dutch.
     */
    public static final LexicalAnalyzerName NL_MICROSOFT = fromString("nl.microsoft");

    /**
     * Lucene analyzer for Dutch.
     */
    public static final LexicalAnalyzerName NL_LUCENE = fromString("nl.lucene");

    /**
     * Microsoft analyzer for English.
     */
    public static final LexicalAnalyzerName EN_MICROSOFT = fromString("en.microsoft");

    /**
     * Lucene analyzer for English.
     */
    public static final LexicalAnalyzerName EN_LUCENE = fromString("en.lucene");

    /**
     * Microsoft analyzer for Estonian.
     */
    public static final LexicalAnalyzerName ET_MICROSOFT = fromString("et.microsoft");

    /**
     * Microsoft analyzer for Finnish.
     */
    public static final LexicalAnalyzerName FI_MICROSOFT = fromString("fi.microsoft");

    /**
     * Lucene analyzer for Finnish.
     */
    public static final LexicalAnalyzerName FI_LUCENE = fromString("fi.lucene");

    /**
     * Microsoft analyzer for French.
     */
    public static final LexicalAnalyzerName FR_MICROSOFT = fromString("fr.microsoft");

    /**
     * Lucene analyzer for French.
     */
    public static final LexicalAnalyzerName FR_LUCENE = fromString("fr.lucene");

    /**
     * Lucene analyzer for Galician.
     */
    public static final LexicalAnalyzerName GL_LUCENE = fromString("gl.lucene");

    /**
     * Microsoft analyzer for German.
     */
    public static final LexicalAnalyzerName DE_MICROSOFT = fromString("de.microsoft");

    /**
     * Lucene analyzer for German.
     */
    public static final LexicalAnalyzerName DE_LUCENE = fromString("de.lucene");

    /**
     * Microsoft analyzer for Greek.
     */
    public static final LexicalAnalyzerName EL_MICROSOFT = fromString("el.microsoft");

    /**
     * Lucene analyzer for Greek.
     */
    public static final LexicalAnalyzerName EL_LUCENE = fromString("el.lucene");

    /**
     * Microsoft analyzer for Gujarati.
     */
    public static final LexicalAnalyzerName GU_MICROSOFT = fromString("gu.microsoft");

    /**
     * Microsoft analyzer for Hebrew.
     */
    public static final LexicalAnalyzerName HE_MICROSOFT = fromString("he.microsoft");

    /**
     * Microsoft analyzer for Hindi.
     */
    public static final LexicalAnalyzerName HI_MICROSOFT = fromString("hi.microsoft");

    /**
     * Lucene analyzer for Hindi.
     */
    public static final LexicalAnalyzerName HI_LUCENE = fromString("hi.lucene");

    /**
     * Microsoft analyzer for Hungarian.
     */
    public static final LexicalAnalyzerName HU_MICROSOFT = fromString("hu.microsoft");

    /**
     * Lucene analyzer for Hungarian.
     */
    public static final LexicalAnalyzerName HU_LUCENE = fromString("hu.lucene");

    /**
     * Microsoft analyzer for Icelandic.
     */
    public static final LexicalAnalyzerName IS_MICROSOFT = fromString("is.microsoft");

    /**
     * Microsoft analyzer for Indonesian (Bahasa).
     */
    public static final LexicalAnalyzerName ID_MICROSOFT = fromString("id.microsoft");

    /**
     * Lucene analyzer for Indonesian.
     */
    public static final LexicalAnalyzerName ID_LUCENE = fromString("id.lucene");

    /**
     * Lucene analyzer for Irish.
     */
    public static final LexicalAnalyzerName GA_LUCENE = fromString("ga.lucene");

    /**
     * Microsoft analyzer for Italian.
     */
    public static final LexicalAnalyzerName IT_MICROSOFT = fromString("it.microsoft");

    /**
     * Lucene analyzer for Italian.
     */
    public static final LexicalAnalyzerName IT_LUCENE = fromString("it.lucene");

    /**
     * Microsoft analyzer for Japanese.
     */
    public static final LexicalAnalyzerName JA_MICROSOFT = fromString("ja.microsoft");

    /**
     * Lucene analyzer for Japanese.
     */
    public static final LexicalAnalyzerName JA_LUCENE = fromString("ja.lucene");

    /**
     * Microsoft analyzer for Kannada.
     */
    public static final LexicalAnalyzerName KN_MICROSOFT = fromString("kn.microsoft");

    /**
     * Microsoft analyzer for Korean.
     */
    public static final LexicalAnalyzerName KO_MICROSOFT = fromString("ko.microsoft");

    /**
     * Lucene analyzer for Korean.
     */
    public static final LexicalAnalyzerName KO_LUCENE = fromString("ko.lucene");

    /**
     * Microsoft analyzer for Latvian.
     */
    public static final LexicalAnalyzerName LV_MICROSOFT = fromString("lv.microsoft");

    /**
     * Lucene analyzer for Latvian.
     */
    public static final LexicalAnalyzerName LV_LUCENE = fromString("lv.lucene");

    /**
     * Microsoft analyzer for Lithuanian.
     */
    public static final LexicalAnalyzerName LT_MICROSOFT = fromString("lt.microsoft");

    /**
     * Microsoft analyzer for Malayalam.
     */
    public static final LexicalAnalyzerName ML_MICROSOFT = fromString("ml.microsoft");

    /**
     * Microsoft analyzer for Malay (Latin).
     */
    public static final LexicalAnalyzerName MS_MICROSOFT = fromString("ms.microsoft");

    /**
     * Microsoft analyzer for Marathi.
     */
    public static final LexicalAnalyzerName MR_MICROSOFT = fromString("mr.microsoft");

    /**
     * Microsoft analyzer for Norwegian (Bokmål).
     */
    public static final LexicalAnalyzerName NB_MICROSOFT = fromString("nb.microsoft");

    /**
     * Lucene analyzer for Norwegian.
     */
    public static final LexicalAnalyzerName NO_LUCENE = fromString("no.lucene");

    /**
     * Lucene analyzer for Persian.
     */
    public static final LexicalAnalyzerName FA_LUCENE = fromString("fa.lucene");

    /**
     * Microsoft analyzer for Polish.
     */
    public static final LexicalAnalyzerName PL_MICROSOFT = fromString("pl.microsoft");

    /**
     * Lucene analyzer for Polish.
     */
    public static final LexicalAnalyzerName PL_LUCENE = fromString("pl.lucene");

    /**
     * Microsoft analyzer for Portuguese (Brazil).
     */
    public static final LexicalAnalyzerName PT_BR_MICROSOFT = fromString("pt-BR.microsoft");

    /**
     * Lucene analyzer for Portuguese (Brazil).
     */
    public static final LexicalAnalyzerName PT_BR_LUCENE = fromString("pt-BR.lucene");

    /**
     * Microsoft analyzer for Portuguese (Portugal).
     */
    public static final LexicalAnalyzerName PT_PT_MICROSOFT = fromString("pt-PT.microsoft");

    /**
     * Lucene analyzer for Portuguese (Portugal).
     */
    public static final LexicalAnalyzerName PT_PT_LUCENE = fromString("pt-PT.lucene");

    /**
     * Microsoft analyzer for Punjabi.
     */
    public static final LexicalAnalyzerName PA_MICROSOFT = fromString("pa.microsoft");

    /**
     * Microsoft analyzer for Romanian.
     */
    public static final LexicalAnalyzerName RO_MICROSOFT = fromString("ro.microsoft");

    /**
     * Lucene analyzer for Romanian.
     */
    public static final LexicalAnalyzerName RO_LUCENE = fromString("ro.lucene");

    /**
     * Microsoft analyzer for Russian.
     */
    public static final LexicalAnalyzerName RU_MICROSOFT = fromString("ru.microsoft");

    /**
     * Lucene analyzer for Russian.
     */
    public static final LexicalAnalyzerName RU_LUCENE = fromString("ru.lucene");

    /**
     * Microsoft analyzer for Serbian (Cyrillic).
     */
    public static final LexicalAnalyzerName SR_CYRILLIC_MICROSOFT = fromString("sr-cyrillic.microsoft");

    /**
     * Microsoft analyzer for Serbian (Latin).
     */
    public static final LexicalAnalyzerName SR_LATIN_MICROSOFT = fromString("sr-latin.microsoft");

    /**
     * Microsoft analyzer for Slovak.
     */
    public static final LexicalAnalyzerName SK_MICROSOFT = fromString("sk.microsoft");

    /**
     * Microsoft analyzer for Slovenian.
     */
    public static final LexicalAnalyzerName SL_MICROSOFT = fromString("sl.microsoft");

    /**
     * Microsoft analyzer for Spanish.
     */
    public static final LexicalAnalyzerName ES_MICROSOFT = fromString("es.microsoft");

    /**
     * Lucene analyzer for Spanish.
     */
    public static final LexicalAnalyzerName ES_LUCENE = fromString("es.lucene");

    /**
     * Microsoft analyzer for Swedish.
     */
    public static final LexicalAnalyzerName SV_MICROSOFT = fromString("sv.microsoft");

    /**
     * Lucene analyzer for Swedish.
     */
    public static final LexicalAnalyzerName SV_LUCENE = fromString("sv.lucene");

    /**
     * Microsoft analyzer for Tamil.
     */
    public static final LexicalAnalyzerName TA_MICROSOFT = fromString("ta.microsoft");

    /**
     * Microsoft analyzer for Telugu.
     */
    public static final LexicalAnalyzerName TE_MICROSOFT = fromString("te.microsoft");

    /**
     * Microsoft analyzer for Thai.
     */
    public static final LexicalAnalyzerName TH_MICROSOFT = fromString("th.microsoft");

    /**
     * Lucene analyzer for Thai.
     */
    public static final LexicalAnalyzerName TH_LUCENE = fromString("th.lucene");

    /**
     * Microsoft analyzer for Turkish.
     */
    public static final LexicalAnalyzerName TR_MICROSOFT = fromString("tr.microsoft");

    /**
     * Lucene analyzer for Turkish.
     */
    public static final LexicalAnalyzerName TR_LUCENE = fromString("tr.lucene");

    /**
     * Microsoft analyzer for Ukrainian.
     */
    public static final LexicalAnalyzerName UK_MICROSOFT = fromString("uk.microsoft");

    /**
     * Microsoft analyzer for Urdu.
     */
    public static final LexicalAnalyzerName UR_MICROSOFT = fromString("ur.microsoft");

    /**
     * Microsoft analyzer for Vietnamese.
     */
    public static final LexicalAnalyzerName VI_MICROSOFT = fromString("vi.microsoft");

    /**
     * Standard Lucene analyzer.
     */
    public static final LexicalAnalyzerName STANDARD_LUCENE = fromString("standard.lucene");

    /**
     * Standard ASCII Folding Lucene analyzer. See
     * https://learn.microsoft.com/rest/api/searchservice/Custom-analyzers-in-Azure-Search#Analyzers.
     */
    public static final LexicalAnalyzerName STANDARD_ASCII_FOLDING_LUCENE = fromString("standardasciifolding.lucene");

    /**
     * Treats the entire content of a field as a single token. This is useful for data like zip codes, ids, and some
     * product names. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/core/KeywordAnalyzer.html.
     */
    public static final LexicalAnalyzerName KEYWORD = fromString("keyword");

    /**
     * Flexibly separates text into terms via a regular expression pattern. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/miscellaneous/PatternAnalyzer.html.
     */
    public static final LexicalAnalyzerName PATTERN = fromString("pattern");

    /**
     * Divides text at non-letters and converts them to lower case. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/core/SimpleAnalyzer.html.
     */
    public static final LexicalAnalyzerName SIMPLE = fromString("simple");

    /**
     * Divides text at non-letters; Applies the lowercase and stopword token filters. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/core/StopAnalyzer.html.
     */
    public static final LexicalAnalyzerName STOP = fromString("stop");

    /**
     * An analyzer that uses the whitespace tokenizer. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/core/WhitespaceAnalyzer.html.
     */
    public static final LexicalAnalyzerName WHITESPACE = fromString("whitespace");

    /**
     * Creates a new instance of LexicalAnalyzerName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LexicalAnalyzerName() {
    }

    /**
     * Creates or finds a LexicalAnalyzerName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LexicalAnalyzerName.
     */
    public static LexicalAnalyzerName fromString(String name) {
        return fromString(name, LexicalAnalyzerName.class);
    }

    /**
     * Gets known LexicalAnalyzerName values.
     * 
     * @return known LexicalAnalyzerName values.
     */
    public static Collection<LexicalAnalyzerName> values() {
        return values(LexicalAnalyzerName.class);
    }
}
