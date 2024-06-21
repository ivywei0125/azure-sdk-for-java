// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.BlobEventsTrigger;
import com.azure.resourcemanager.datafactory.models.BlobEventTypes;
import com.azure.resourcemanager.datafactory.models.PipelineReference;
import com.azure.resourcemanager.datafactory.models.TriggerPipelineReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BlobEventsTriggerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BlobEventsTrigger model = BinaryData.fromString(
            "{\"type\":\"BlobEventsTrigger\",\"typeProperties\":{\"blobPathBeginsWith\":\"zckgbpysgzgiv\",\"blobPathEndsWith\":\"hektw\",\"ignoreEmptyBlobs\":true,\"events\":[\"Microsoft.Storage.BlobCreated\"],\"scope\":\"comjxxja\"},\"pipelines\":[{\"pipelineReference\":{\"referenceName\":\"dhrkhfyaxi\",\"name\":\"nzsimbgvrksjjq\"},\"parameters\":{\"p\":\"datarbogzwwyub\"}},{\"pipelineReference\":{\"referenceName\":\"cjy\",\"name\":\"emgbkjxuxm\"},\"parameters\":{\"ekpgllezvrvjws\":\"databyjfeanbnw\",\"jbsvk\":\"datafkzlv\"}}],\"description\":\"ynvguhqugnqs\",\"runtimeState\":\"Disabled\",\"annotations\":[\"datauwhmncewcfins\",\"dataimxxsy\",\"datatpqgxzogclu\"],\"\":{\"tcer\":\"datanckdxflgji\",\"errpal\":\"datal\"}}")
            .toObject(BlobEventsTrigger.class);
        Assertions.assertEquals("ynvguhqugnqs", model.description());
        Assertions.assertEquals("dhrkhfyaxi", model.pipelines().get(0).pipelineReference().referenceName());
        Assertions.assertEquals("nzsimbgvrksjjq", model.pipelines().get(0).pipelineReference().name());
        Assertions.assertEquals("zckgbpysgzgiv", model.blobPathBeginsWith());
        Assertions.assertEquals("hektw", model.blobPathEndsWith());
        Assertions.assertEquals(true, model.ignoreEmptyBlobs());
        Assertions.assertEquals(BlobEventTypes.MICROSOFT_STORAGE_BLOB_CREATED, model.events().get(0));
        Assertions.assertEquals("comjxxja", model.scope());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BlobEventsTrigger model = new BlobEventsTrigger().withDescription("ynvguhqugnqs")
            .withAnnotations(Arrays.asList("datauwhmncewcfins", "dataimxxsy", "datatpqgxzogclu"))
            .withPipelines(Arrays.asList(
                new TriggerPipelineReference()
                    .withPipelineReference(
                        new PipelineReference().withReferenceName("dhrkhfyaxi").withName("nzsimbgvrksjjq"))
                    .withParameters(mapOf("p", "datarbogzwwyub")),
                new TriggerPipelineReference()
                    .withPipelineReference(new PipelineReference().withReferenceName("cjy").withName("emgbkjxuxm"))
                    .withParameters(mapOf("ekpgllezvrvjws", "databyjfeanbnw", "jbsvk", "datafkzlv"))))
            .withBlobPathBeginsWith("zckgbpysgzgiv")
            .withBlobPathEndsWith("hektw")
            .withIgnoreEmptyBlobs(true)
            .withEvents(Arrays.asList(BlobEventTypes.MICROSOFT_STORAGE_BLOB_CREATED))
            .withScope("comjxxja");
        model = BinaryData.fromObject(model).toObject(BlobEventsTrigger.class);
        Assertions.assertEquals("ynvguhqugnqs", model.description());
        Assertions.assertEquals("dhrkhfyaxi", model.pipelines().get(0).pipelineReference().referenceName());
        Assertions.assertEquals("nzsimbgvrksjjq", model.pipelines().get(0).pipelineReference().name());
        Assertions.assertEquals("zckgbpysgzgiv", model.blobPathBeginsWith());
        Assertions.assertEquals("hektw", model.blobPathEndsWith());
        Assertions.assertEquals(true, model.ignoreEmptyBlobs());
        Assertions.assertEquals(BlobEventTypes.MICROSOFT_STORAGE_BLOB_CREATED, model.events().get(0));
        Assertions.assertEquals("comjxxja", model.scope());
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
