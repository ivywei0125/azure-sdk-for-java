// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.ClusterInner;
import com.azure.resourcemanager.avs.models.ClusterList;
import com.azure.resourcemanager.avs.models.Sku;
import com.azure.resourcemanager.avs.models.SkuTier;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ClusterListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"clusterSize\":409786419,\"provisioningState\":\"Failed\",\"clusterId\":86962705,\"hosts\":[\"qwoochcbon\"],\"vsanDatastoreName\":\"pkvlrxn\"},\"sku\":{\"name\":\"ea\",\"tier\":\"Premium\",\"size\":\"heoflokeyyienjbd\",\"family\":\"tgrhpdjpjumas\",\"capacity\":271162944},\"id\":\"pqyegualhbxxh\",\"name\":\"jj\",\"type\":\"zvdudgwdslfhotwm\"}],\"nextLink\":\"npwlbjnpg\"}")
            .toObject(ClusterList.class);
        Assertions.assertEquals("ea", model.value().get(0).sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, model.value().get(0).sku().tier());
        Assertions.assertEquals("heoflokeyyienjbd", model.value().get(0).sku().size());
        Assertions.assertEquals("tgrhpdjpjumas", model.value().get(0).sku().family());
        Assertions.assertEquals(271162944, model.value().get(0).sku().capacity());
        Assertions.assertEquals(409786419, model.value().get(0).clusterSize());
        Assertions.assertEquals("qwoochcbon", model.value().get(0).hosts().get(0));
        Assertions.assertEquals("pkvlrxn", model.value().get(0).vsanDatastoreName());
        Assertions.assertEquals("npwlbjnpg", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterList model = new ClusterList().withValue(Arrays.asList(new ClusterInner()
            .withSku(new Sku().withName("ea")
                .withTier(SkuTier.PREMIUM)
                .withSize("heoflokeyyienjbd")
                .withFamily("tgrhpdjpjumas")
                .withCapacity(271162944))
            .withClusterSize(409786419)
            .withHosts(Arrays.asList("qwoochcbon"))
            .withVsanDatastoreName("pkvlrxn"))).withNextLink("npwlbjnpg");
        model = BinaryData.fromObject(model).toObject(ClusterList.class);
        Assertions.assertEquals("ea", model.value().get(0).sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, model.value().get(0).sku().tier());
        Assertions.assertEquals("heoflokeyyienjbd", model.value().get(0).sku().size());
        Assertions.assertEquals("tgrhpdjpjumas", model.value().get(0).sku().family());
        Assertions.assertEquals(271162944, model.value().get(0).sku().capacity());
        Assertions.assertEquals(409786419, model.value().get(0).clusterSize());
        Assertions.assertEquals("qwoochcbon", model.value().get(0).hosts().get(0));
        Assertions.assertEquals("pkvlrxn", model.value().get(0).vsanDatastoreName());
        Assertions.assertEquals("npwlbjnpg", model.nextLink());
    }
}
