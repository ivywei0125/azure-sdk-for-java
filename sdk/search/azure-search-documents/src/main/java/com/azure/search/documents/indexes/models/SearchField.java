// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Represents a field in an index definition, which describes the name, data type, and search behavior of a field. */
@Fluent
public final class SearchField implements JsonSerializable<SearchField> {
    /*
     * The name of the field, which must be unique within the fields collection of the index or parent field.
     */
    private final String name;

    /*
     * The data type of the field.
     */
    private final SearchFieldDataType type;

    /*
     * A value indicating whether the field uniquely identifies documents in the index. Exactly one top-level field in
     * each index must be chosen as the key field and it must be of type Edm.String. Key fields can be used to look up
     * documents directly and update or delete specific documents. Default is false for simple fields and null for
     * complex fields.
     */
    private Boolean key;

    /*
     * A value indicating whether the field will be returned in a search result. This property must be false for key
     * fields, and must be null for complex fields. You can hide a field from search results if you want to use it only
     * as a filter, for sorting, or for scoring. This property can also be changed on existing fields and enabling it
     * does not cause an increase in index storage requirements.
     */
    private Boolean hidden;

    /*
     * A value indicating whether the field is full-text searchable. This means it will undergo analysis such as
     * word-breaking during indexing. If you set a searchable field to a value like "sunny day", internally it will be
     * split into the individual tokens "sunny" and "day". This enables full-text searches for these terms. Fields of
     * type Edm.String or Collection(Edm.String) are searchable by default. This property must be false for simple
     * fields of other non-string data types, and it must be null for complex fields. Note: searchable fields consume
     * extra space in your index since Azure Cognitive Search will store an additional tokenized version of the field
     * value for full-text searches. If you want to save space in your index and you don't need a field to be included
     * in searches, set searchable to false.
     */
    private Boolean searchable;

    /*
     * A value indicating whether to enable the field to be referenced in $filter queries. filterable differs from
     * searchable in how strings are handled. Fields of type Edm.String or Collection(Edm.String) that are filterable
     * do not undergo word-breaking, so comparisons are for exact matches only. For example, if you set such a field f
     * to "sunny day", $filter=f eq 'sunny' will find no matches, but $filter=f eq 'sunny day' will. This property must
     * be null for complex fields. Default is true for simple fields and null for complex fields.
     */
    private Boolean filterable;

    /*
     * A value indicating whether to enable the field to be referenced in $orderby expressions. By default Azure
     * Cognitive Search sorts results by score, but in many experiences users will want to sort by fields in the
     * documents. A simple field can be sortable only if it is single-valued (it has a single value in the scope of the
     * parent document). Simple collection fields cannot be sortable, since they are multi-valued. Simple sub-fields of
     * complex collections are also multi-valued, and therefore cannot be sortable. This is true whether it's an
     * immediate parent field, or an ancestor field, that's the complex collection. Complex fields cannot be sortable
     * and the sortable property must be null for such fields. The default for sortable is true for single-valued
     * simple fields, false for multi-valued simple fields, and null for complex fields.
     */
    private Boolean sortable;

    /*
     * A value indicating whether to enable the field to be referenced in facet queries. Typically used in a
     * presentation of search results that includes hit count by category (for example, search for digital cameras and
     * see hits by brand, by megapixels, by price, and so on). This property must be null for complex fields. Fields of
     * type Edm.GeographyPoint or Collection(Edm.GeographyPoint) cannot be facetable. Default is true for all other
     * simple fields.
     */
    private Boolean facetable;

    /*
     * The name of the analyzer to use for the field. This option can be used only with searchable fields and it can't
     * be set together with either searchAnalyzer or indexAnalyzer. Once the analyzer is chosen, it cannot be changed
     * for the field. Must be null for complex fields.
     */
    private LexicalAnalyzerName analyzerName;

    /*
     * The name of the analyzer used at search time for the field. This option can be used only with searchable fields.
     * It must be set together with indexAnalyzer and it cannot be set together with the analyzer option. This property
     * cannot be set to the name of a language analyzer; use the analyzer property instead if you need a language
     * analyzer. This analyzer can be updated on an existing field. Must be null for complex fields.
     */
    private LexicalAnalyzerName searchAnalyzerName;

    /*
     * The name of the analyzer used at indexing time for the field. This option can be used only with searchable
     * fields. It must be set together with searchAnalyzer and it cannot be set together with the analyzer option.
     * This property cannot be set to the name of a language analyzer; use the analyzer property instead if you need a
     * language analyzer. Once the analyzer is chosen, it cannot be changed for the field. Must be null for complex
     * fields.
     */
    private LexicalAnalyzerName indexAnalyzerName;

    /*
     * The name of the normalizer to use for the field. This option can be used only with fields with filterable,
     * sortable, or facetable enabled. Once the normalizer is chosen, it cannot be changed for the field. Must be null
     * for complex fields.
     */
    private LexicalNormalizerName normalizerName;

    /*
     * The dimensionality of the vector field.
     */
    private Integer vectorSearchDimensions;

    /*
     * The name of the vector search profile that specifies the algorithm and vectorizer to use when searching the
     * vector field.
     */
    private String vectorSearchProfile;

    /*
     * A list of the names of synonym maps to associate with this field. This option can be used only with searchable
     * fields. Currently only one synonym map per field is supported. Assigning a synonym map to a field ensures that
     * query terms targeting that field are expanded at query-time using the rules in the synonym map. This attribute
     * can be changed on existing fields. Must be null or an empty collection for complex fields.
     */
    private List<String> synonymMapNames;

    /*
     * A list of sub-fields if this is a field of type Edm.ComplexType or Collection(Edm.ComplexType). Must be null or
     * empty for simple fields.
     */
    private List<SearchField> fields;

    /**
     * Creates an instance of SearchField class.
     *
     * @param name the name value to set.
     * @param type the type value to set.
     */
    public SearchField(String name, SearchFieldDataType type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Get the name property: The name of the field, which must be unique within the fields collection of the index or
     * parent field.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the type property: The data type of the field.
     *
     * @return the type value.
     */
    public SearchFieldDataType getType() {
        return this.type;
    }

    /**
     * Get the key property: A value indicating whether the field uniquely identifies documents in the index. Exactly
     * one top-level field in each index must be chosen as the key field and it must be of type Edm.String. Key fields
     * can be used to look up documents directly and update or delete specific documents. Default is false for simple
     * fields and null for complex fields.
     *
     * @return the key value.
     */
    public Boolean isKey() {
        return this.key;
    }

    /**
     * Set the key property: A value indicating whether the field uniquely identifies documents in the index. Exactly
     * one top-level field in each index must be chosen as the key field and it must be of type Edm.String. Key fields
     * can be used to look up documents directly and update or delete specific documents. Default is false for simple
     * fields and null for complex fields.
     *
     * @param key the key value to set.
     * @return the SearchField object itself.
     */
    public SearchField setKey(Boolean key) {
        this.key = key;
        return this;
    }

    /**
     * Get the hidden property: A value indicating whether the field will be returned in a search result. This property
     * must be false for key fields, and must be null for complex fields. You can hide a field from search results if
     * you want to use it only as a filter, for sorting, or for scoring. This property can also be changed on existing
     * fields and enabling it does not cause an increase in index storage requirements.
     *
     * @return the hidden value.
     */
    public Boolean isHidden() {
        return (this.hidden == null) ? null : !this.hidden;
    }

    /**
     * Set the hidden property: A value indicating whether the field will be returned in a search result. This property
     * must be false for key fields, and must be null for complex fields. You can hide a field from search results if
     * you want to use it only as a filter, for sorting, or for scoring. This property can also be changed on existing
     * fields and enabling it does not cause an increase in index storage requirements.
     *
     * @param hidden the hidden value to set.
     * @return the SearchField object itself.
     */
    public SearchField setHidden(Boolean hidden) {
        this.hidden = (hidden == null) ? null : !hidden;
        return this;
    }

    /**
     * Get the searchable property: A value indicating whether the field is full-text searchable. This means it will
     * undergo analysis such as word-breaking during indexing. If you set a searchable field to a value like "sunny
     * day", internally it will be split into the individual tokens "sunny" and "day". This enables full-text searches
     * for these terms. Fields of type Edm.String or Collection(Edm.String) are searchable by default. This property
     * must be false for simple fields of other non-string data types, and it must be null for complex fields. Note:
     * searchable fields consume extra space in your index since Azure Cognitive Search will store an additional
     * tokenized version of the field value for full-text searches. If you want to save space in your index and you
     * don't need a field to be included in searches, set searchable to false.
     *
     * @return the searchable value.
     */
    public Boolean isSearchable() {
        return this.searchable;
    }

    /**
     * Set the searchable property: A value indicating whether the field is full-text searchable. This means it will
     * undergo analysis such as word-breaking during indexing. If you set a searchable field to a value like "sunny
     * day", internally it will be split into the individual tokens "sunny" and "day". This enables full-text searches
     * for these terms. Fields of type Edm.String or Collection(Edm.String) are searchable by default. This property
     * must be false for simple fields of other non-string data types, and it must be null for complex fields. Note:
     * searchable fields consume extra space in your index since Azure Cognitive Search will store an additional
     * tokenized version of the field value for full-text searches. If you want to save space in your index and you
     * don't need a field to be included in searches, set searchable to false.
     *
     * @param searchable the searchable value to set.
     * @return the SearchField object itself.
     */
    public SearchField setSearchable(Boolean searchable) {
        this.searchable = searchable;
        return this;
    }

    /**
     * Get the filterable property: A value indicating whether to enable the field to be referenced in $filter queries.
     * filterable differs from searchable in how strings are handled. Fields of type Edm.String or
     * Collection(Edm.String) that are filterable do not undergo word-breaking, so comparisons are for exact matches
     * only. For example, if you set such a field f to "sunny day", $filter=f eq 'sunny' will find no matches, but
     * $filter=f eq 'sunny day' will. This property must be null for complex fields. Default is true for simple fields
     * and null for complex fields.
     *
     * @return the filterable value.
     */
    public Boolean isFilterable() {
        return this.filterable;
    }

    /**
     * Set the filterable property: A value indicating whether to enable the field to be referenced in $filter queries.
     * filterable differs from searchable in how strings are handled. Fields of type Edm.String or
     * Collection(Edm.String) that are filterable do not undergo word-breaking, so comparisons are for exact matches
     * only. For example, if you set such a field f to "sunny day", $filter=f eq 'sunny' will find no matches, but
     * $filter=f eq 'sunny day' will. This property must be null for complex fields. Default is true for simple fields
     * and null for complex fields.
     *
     * @param filterable the filterable value to set.
     * @return the SearchField object itself.
     */
    public SearchField setFilterable(Boolean filterable) {
        this.filterable = filterable;
        return this;
    }

    /**
     * Get the sortable property: A value indicating whether to enable the field to be referenced in $orderby
     * expressions. By default Azure Cognitive Search sorts results by score, but in many experiences users will want to
     * sort by fields in the documents. A simple field can be sortable only if it is single-valued (it has a single
     * value in the scope of the parent document). Simple collection fields cannot be sortable, since they are
     * multi-valued. Simple sub-fields of complex collections are also multi-valued, and therefore cannot be sortable.
     * This is true whether it's an immediate parent field, or an ancestor field, that's the complex collection. Complex
     * fields cannot be sortable and the sortable property must be null for such fields. The default for sortable is
     * true for single-valued simple fields, false for multi-valued simple fields, and null for complex fields.
     *
     * @return the sortable value.
     */
    public Boolean isSortable() {
        return this.sortable;
    }

    /**
     * Set the sortable property: A value indicating whether to enable the field to be referenced in $orderby
     * expressions. By default Azure Cognitive Search sorts results by score, but in many experiences users will want to
     * sort by fields in the documents. A simple field can be sortable only if it is single-valued (it has a single
     * value in the scope of the parent document). Simple collection fields cannot be sortable, since they are
     * multi-valued. Simple sub-fields of complex collections are also multi-valued, and therefore cannot be sortable.
     * This is true whether it's an immediate parent field, or an ancestor field, that's the complex collection. Complex
     * fields cannot be sortable and the sortable property must be null for such fields. The default for sortable is
     * true for single-valued simple fields, false for multi-valued simple fields, and null for complex fields.
     *
     * @param sortable the sortable value to set.
     * @return the SearchField object itself.
     */
    public SearchField setSortable(Boolean sortable) {
        this.sortable = sortable;
        return this;
    }

    /**
     * Get the facetable property: A value indicating whether to enable the field to be referenced in facet queries.
     * Typically used in a presentation of search results that includes hit count by category (for example, search for
     * digital cameras and see hits by brand, by megapixels, by price, and so on). This property must be null for
     * complex fields. Fields of type Edm.GeographyPoint or Collection(Edm.GeographyPoint) cannot be facetable. Default
     * is true for all other simple fields.
     *
     * @return the facetable value.
     */
    public Boolean isFacetable() {
        return this.facetable;
    }

    /**
     * Set the facetable property: A value indicating whether to enable the field to be referenced in facet queries.
     * Typically used in a presentation of search results that includes hit count by category (for example, search for
     * digital cameras and see hits by brand, by megapixels, by price, and so on). This property must be null for
     * complex fields. Fields of type Edm.GeographyPoint or Collection(Edm.GeographyPoint) cannot be facetable. Default
     * is true for all other simple fields.
     *
     * @param facetable the facetable value to set.
     * @return the SearchField object itself.
     */
    public SearchField setFacetable(Boolean facetable) {
        this.facetable = facetable;
        return this;
    }

    /**
     * Get the analyzerName property: The name of the analyzer to use for the field. This option can be used only with
     * searchable fields and it can't be set together with either searchAnalyzer or indexAnalyzer. Once the analyzer is
     * chosen, it cannot be changed for the field. Must be null for complex fields.
     *
     * @return the analyzerName value.
     */
    public LexicalAnalyzerName getAnalyzerName() {
        return this.analyzerName;
    }

    /**
     * Set the analyzerName property: The name of the analyzer to use for the field. This option can be used only with
     * searchable fields and it can't be set together with either searchAnalyzer or indexAnalyzer. Once the analyzer is
     * chosen, it cannot be changed for the field. Must be null for complex fields.
     *
     * @param analyzerName the analyzerName value to set.
     * @return the SearchField object itself.
     */
    public SearchField setAnalyzerName(LexicalAnalyzerName analyzerName) {
        this.analyzerName = analyzerName;
        return this;
    }

    /**
     * Get the searchAnalyzerName property: The name of the analyzer used at search time for the field. This option can
     * be used only with searchable fields. It must be set together with indexAnalyzer and it cannot be set together
     * with the analyzer option. This property cannot be set to the name of a language analyzer; use the analyzer
     * property instead if you need a language analyzer. This analyzer can be updated on an existing field. Must be null
     * for complex fields.
     *
     * @return the searchAnalyzerName value.
     */
    public LexicalAnalyzerName getSearchAnalyzerName() {
        return this.searchAnalyzerName;
    }

    /**
     * Set the searchAnalyzerName property: The name of the analyzer used at search time for the field. This option can
     * be used only with searchable fields. It must be set together with indexAnalyzer and it cannot be set together
     * with the analyzer option. This property cannot be set to the name of a language analyzer; use the analyzer
     * property instead if you need a language analyzer. This analyzer can be updated on an existing field. Must be null
     * for complex fields.
     *
     * @param searchAnalyzerName the searchAnalyzerName value to set.
     * @return the SearchField object itself.
     */
    public SearchField setSearchAnalyzerName(LexicalAnalyzerName searchAnalyzerName) {
        this.searchAnalyzerName = searchAnalyzerName;
        return this;
    }

    /**
     * Get the indexAnalyzerName property: The name of the analyzer used at indexing time for the field. This option can
     * be used only with searchable fields. It must be set together with searchAnalyzer and it cannot be set together
     * with the analyzer option. This property cannot be set to the name of a language analyzer; use the analyzer
     * property instead if you need a language analyzer. Once the analyzer is chosen, it cannot be changed for the
     * field. Must be null for complex fields.
     *
     * @return the indexAnalyzerName value.
     */
    public LexicalAnalyzerName getIndexAnalyzerName() {
        return this.indexAnalyzerName;
    }

    /**
     * Set the indexAnalyzerName property: The name of the analyzer used at indexing time for the field. This option can
     * be used only with searchable fields. It must be set together with searchAnalyzer and it cannot be set together
     * with the analyzer option. This property cannot be set to the name of a language analyzer; use the analyzer
     * property instead if you need a language analyzer. Once the analyzer is chosen, it cannot be changed for the
     * field. Must be null for complex fields.
     *
     * @param indexAnalyzerName the indexAnalyzerName value to set.
     * @return the SearchField object itself.
     */
    public SearchField setIndexAnalyzerName(LexicalAnalyzerName indexAnalyzerName) {
        this.indexAnalyzerName = indexAnalyzerName;
        return this;
    }

    /**
     * Get the normalizerName property: The name of the normalizer to use for the field. This option can be used only
     * with fields with filterable, sortable, or facetable enabled. Once the normalizer is chosen, it cannot be changed
     * for the field. Must be null for complex fields.
     *
     * @return the normalizerName value.
     */
    public LexicalNormalizerName getNormalizerName() {
        return this.normalizerName;
    }

    /**
     * Set the normalizerName property: The name of the normalizer to use for the field. This option can be used only
     * with fields with filterable, sortable, or facetable enabled. Once the normalizer is chosen, it cannot be changed
     * for the field. Must be null for complex fields.
     *
     * @param normalizerName the normalizerName value to set.
     * @return the SearchField object itself.
     */
    public SearchField setNormalizerName(LexicalNormalizerName normalizerName) {
        this.normalizerName = normalizerName;
        return this;
    }

    /**
     * Get the vectorSearchDimensions property: The dimensionality of the vector field.
     *
     * @return the vectorSearchDimensions value.
     */
    public Integer getVectorSearchDimensions() {
        return this.vectorSearchDimensions;
    }

    /**
     * Set the vectorSearchDimensions property: The dimensionality of the vector field.
     *
     * @param vectorSearchDimensions the vectorSearchDimensions value to set.
     * @return the SearchField object itself.
     */
    public SearchField setVectorSearchDimensions(Integer vectorSearchDimensions) {
        this.vectorSearchDimensions = vectorSearchDimensions;
        return this;
    }

    /**
     * Get the vectorSearchProfile property: The name of the vector search profile that specifies the algorithm and
     * vectorizer to use when searching the vector field.
     *
     * @return the vectorSearchProfile value.
     */
    public String getVectorSearchProfile() {
        return this.vectorSearchProfile;
    }

    /**
     * Set the vectorSearchProfile property: The name of the vector search profile that specifies the algorithm and
     * vectorizer to use when searching the vector field.
     *
     * @param vectorSearchProfile the vectorSearchProfile value to set.
     * @return the SearchField object itself.
     */
    public SearchField setVectorSearchProfile(String vectorSearchProfile) {
        this.vectorSearchProfile = vectorSearchProfile;
        return this;
    }

    /**
     * Get the synonymMapNames property: A list of the names of synonym maps to associate with this field. This option
     * can be used only with searchable fields. Currently only one synonym map per field is supported. Assigning a
     * synonym map to a field ensures that query terms targeting that field are expanded at query-time using the rules
     * in the synonym map. This attribute can be changed on existing fields. Must be null or an empty collection for
     * complex fields.
     *
     * @return the synonymMapNames value.
     */
    public List<String> getSynonymMapNames() {
        return this.synonymMapNames;
    }

    /**
     * Set the synonymMapNames property: A list of the names of synonym maps to associate with this field. This option
     * can be used only with searchable fields. Currently only one synonym map per field is supported. Assigning a
     * synonym map to a field ensures that query terms targeting that field are expanded at query-time using the rules
     * in the synonym map. This attribute can be changed on existing fields. Must be null or an empty collection for
     * complex fields.
     *
     * @param synonymMapNames the synonymMapNames value to set.
     * @return the SearchField object itself.
     */
    public SearchField setSynonymMapNames(List<String> synonymMapNames) {
        this.synonymMapNames = synonymMapNames;
        return this;
    }

    /**
     * Get the fields property: A list of sub-fields if this is a field of type Edm.ComplexType or
     * Collection(Edm.ComplexType). Must be null or empty for simple fields.
     *
     * @return the fields value.
     */
    public List<SearchField> getFields() {
        return this.fields;
    }

    /**
     * Set the fields property: A list of sub-fields if this is a field of type Edm.ComplexType or
     * Collection(Edm.ComplexType). Must be null or empty for simple fields.
     *
     * @param fields the fields value to set.
     * @return the SearchField object itself.
     */
    public SearchField setFields(List<SearchField> fields) {
        this.fields = fields;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", Objects.toString(this.type, null));
        jsonWriter.writeBooleanField("key", this.key);
        jsonWriter.writeBooleanField("retrievable", this.hidden);
        jsonWriter.writeBooleanField("searchable", this.searchable);
        jsonWriter.writeBooleanField("filterable", this.filterable);
        jsonWriter.writeBooleanField("sortable", this.sortable);
        jsonWriter.writeBooleanField("facetable", this.facetable);
        jsonWriter.writeStringField("analyzer", Objects.toString(this.analyzerName, null));
        jsonWriter.writeStringField("searchAnalyzer", Objects.toString(this.searchAnalyzerName, null));
        jsonWriter.writeStringField("indexAnalyzer", Objects.toString(this.indexAnalyzerName, null));
        jsonWriter.writeStringField("normalizer", Objects.toString(this.normalizerName, null));
        jsonWriter.writeNumberField("dimensions", this.vectorSearchDimensions);
        jsonWriter.writeStringField("vectorSearchProfile", this.vectorSearchProfile);
        jsonWriter.writeArrayField(
                "synonymMaps", this.synonymMapNames, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("fields", this.fields, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchField from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchField if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SearchField.
     */
    public static SearchField fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    boolean typeFound = false;
                    SearchFieldDataType type = null;
                    Boolean key = null;
                    Boolean hidden = null;
                    Boolean searchable = null;
                    Boolean filterable = null;
                    Boolean sortable = null;
                    Boolean facetable = null;
                    LexicalAnalyzerName analyzerName = null;
                    LexicalAnalyzerName searchAnalyzerName = null;
                    LexicalAnalyzerName indexAnalyzerName = null;
                    LexicalNormalizerName normalizerName = null;
                    Integer vectorSearchDimensions = null;
                    String vectorSearchProfile = null;
                    List<String> synonymMapNames = null;
                    List<SearchField> fields = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("name".equals(fieldName)) {
                            name = reader.getString();
                            nameFound = true;
                        } else if ("type".equals(fieldName)) {
                            type = SearchFieldDataType.fromString(reader.getString());
                            typeFound = true;
                        } else if ("key".equals(fieldName)) {
                            key = reader.getNullable(JsonReader::getBoolean);
                        } else if ("retrievable".equals(fieldName)) {
                            hidden = reader.getNullable(JsonReader::getBoolean);
                        } else if ("searchable".equals(fieldName)) {
                            searchable = reader.getNullable(JsonReader::getBoolean);
                        } else if ("filterable".equals(fieldName)) {
                            filterable = reader.getNullable(JsonReader::getBoolean);
                        } else if ("sortable".equals(fieldName)) {
                            sortable = reader.getNullable(JsonReader::getBoolean);
                        } else if ("facetable".equals(fieldName)) {
                            facetable = reader.getNullable(JsonReader::getBoolean);
                        } else if ("analyzer".equals(fieldName)) {
                            analyzerName = LexicalAnalyzerName.fromString(reader.getString());
                        } else if ("searchAnalyzer".equals(fieldName)) {
                            searchAnalyzerName = LexicalAnalyzerName.fromString(reader.getString());
                        } else if ("indexAnalyzer".equals(fieldName)) {
                            indexAnalyzerName = LexicalAnalyzerName.fromString(reader.getString());
                        } else if ("normalizer".equals(fieldName)) {
                            normalizerName = LexicalNormalizerName.fromString(reader.getString());
                        } else if ("dimensions".equals(fieldName)) {
                            vectorSearchDimensions = reader.getNullable(JsonReader::getInt);
                        } else if ("vectorSearchProfile".equals(fieldName)) {
                            vectorSearchProfile = reader.getString();
                        } else if ("synonymMaps".equals(fieldName)) {
                            synonymMapNames = reader.readArray(reader1 -> reader1.getString());
                        } else if ("fields".equals(fieldName)) {
                            fields = reader.readArray(reader1 -> SearchField.fromJson(reader1));
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (nameFound && typeFound) {
                        SearchField deserializedSearchField = new SearchField(name, type);
                        deserializedSearchField.key = key;
                        deserializedSearchField.hidden = hidden;
                        deserializedSearchField.searchable = searchable;
                        deserializedSearchField.filterable = filterable;
                        deserializedSearchField.sortable = sortable;
                        deserializedSearchField.facetable = facetable;
                        deserializedSearchField.analyzerName = analyzerName;
                        deserializedSearchField.searchAnalyzerName = searchAnalyzerName;
                        deserializedSearchField.indexAnalyzerName = indexAnalyzerName;
                        deserializedSearchField.normalizerName = normalizerName;
                        deserializedSearchField.vectorSearchDimensions = vectorSearchDimensions;
                        deserializedSearchField.vectorSearchProfile = vectorSearchProfile;
                        deserializedSearchField.synonymMapNames = synonymMapNames;
                        deserializedSearchField.fields = fields;

                        return deserializedSearchField;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }
                    if (!typeFound) {
                        missingProperties.add("type");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }

    /**
     * Set the fields property: A list of sub-fields if this is a field of type Edm.ComplexType or
     * Collection(Edm.ComplexType). Must be null or empty for simple fields.
     *
     * @param fields the fields value to set.
     * @return the SearchField object itself.
     */
    public SearchField setFields(SearchField... fields) {
        this.fields = (fields == null) ? null : java.util.Arrays.asList(fields);
        return this;
    }

    /**
     * Set the synonymMapNames property: A list of the names of synonym maps to associate with this field. This option
     * can be used only with searchable fields. Currently only one synonym map per field is supported. Assigning a
     * synonym map to a field ensures that query terms targeting that field are expanded at query-time using the rules
     * in the synonym map. This attribute can be changed on existing fields. Must be null or an empty collection for
     * complex fields.
     *
     * @param synonymMapNames the synonymMapNames value to set.
     * @return the SearchField object itself.
     */
    public SearchField setSynonymMapNames(String... synonymMapNames) {
        this.synonymMapNames = (synonymMapNames == null) ? null : java.util.Arrays.asList(synonymMapNames);
        return this;
    }
}
