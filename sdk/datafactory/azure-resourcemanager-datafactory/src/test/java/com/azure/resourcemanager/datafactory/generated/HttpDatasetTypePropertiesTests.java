// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.HttpDatasetTypeProperties;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetStorageFormat;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public final class HttpDatasetTypePropertiesTests {
    @Test
    public void testDeserialize() {
        HttpDatasetTypeProperties model =
            BinaryData
                .fromString("{\"format\":{\"type\":\"DatasetStorageFormat\",\"\":{}},\"compression\":{\"\":{}}}")
                .toObject(HttpDatasetTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        HttpDatasetTypeProperties model =
            new HttpDatasetTypeProperties()
                .withFormat(new DatasetStorageFormat().withAdditionalProperties(mapOf("type", "DatasetStorageFormat")))
                .withCompression(new DatasetCompression().withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(HttpDatasetTypeProperties.class);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
