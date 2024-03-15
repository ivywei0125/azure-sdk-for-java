// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.BinarySink;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import com.azure.resourcemanager.datafactory.models.StoreWriteSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class BinarySinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BinarySink model = BinaryData.fromString(
            "{\"type\":\"BinarySink\",\"storeSettings\":{\"type\":\"StoreWriteSettings\",\"maxConcurrentConnections\":\"dataoogijiqwxw\",\"disableMetricsCollection\":\"databdhqnprb\",\"copyBehavior\":\"datauhdjzivl\",\"metadata\":[{\"name\":\"datamq\",\"value\":\"datambfpt\"}],\"\":{\"zulmqxficinwij\":\"datamksxxbdtjvvngnvk\",\"er\":\"dataeyxt\",\"ytten\":\"datattobosjxb\",\"lyimhspj\":\"datauditumyycvtya\"}},\"writeBatchSize\":\"dataivxblqvwhjgt\",\"writeBatchTimeout\":\"datareoutqohp\",\"sinkRetryCount\":\"dataqi\",\"sinkRetryWait\":\"databougcwzgdfdrdx\",\"maxConcurrentConnections\":\"datatkgezul\",\"disableMetricsCollection\":\"datatp\",\"\":{\"eoy\":\"dataejxjhlxoljbp\",\"havwhrivvzrc\":\"datayk\",\"eearbbxaneviqk\":\"datayfrxlsypwu\"}}")
            .toObject(BinarySink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BinarySink model = new BinarySink().withWriteBatchSize("dataivxblqvwhjgt")
            .withWriteBatchTimeout("datareoutqohp").withSinkRetryCount("dataqi").withSinkRetryWait("databougcwzgdfdrdx")
            .withMaxConcurrentConnections("datatkgezul").withDisableMetricsCollection("datatp")
            .withStoreSettings(new StoreWriteSettings().withMaxConcurrentConnections("dataoogijiqwxw")
                .withDisableMetricsCollection("databdhqnprb").withCopyBehavior("datauhdjzivl")
                .withMetadata(Arrays.asList(new MetadataItem().withName("datamq").withValue("datambfpt")))
                .withAdditionalProperties(mapOf("type", "StoreWriteSettings")));
        model = BinaryData.fromObject(model).toObject(BinarySink.class);
    }

    // Use "Map.of" if available
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
