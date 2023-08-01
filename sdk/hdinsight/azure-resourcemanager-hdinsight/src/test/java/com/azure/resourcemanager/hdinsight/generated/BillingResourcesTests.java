// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.BillingMeters;
import com.azure.resourcemanager.hdinsight.models.BillingResources;
import com.azure.resourcemanager.hdinsight.models.DiskBillingMeters;
import com.azure.resourcemanager.hdinsight.models.Tier;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class BillingResourcesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BillingResources model =
            BinaryData
                .fromString(
                    "{\"region\":\"fcluyov\",\"billingMeters\":[{\"meterParameter\":\"kfezzxscyhwz\",\"meter\":\"irujbz\",\"unit\":\"mvzzbtdcqvp\"},{\"meterParameter\":\"yujviylwdshfssn\",\"meter\":\"gy\",\"unit\":\"rymsgaojfmw\"},{\"meterParameter\":\"otmrfhir\",\"meter\":\"ymoxoftpipiwyczu\",\"unit\":\"a\"}],\"diskBillingMeters\":[{\"diskRpMeter\":\"lihhyuspskasdvlm\",\"sku\":\"dgzxulucvpamrsr\",\"tier\":\"Premium\"},{\"diskRpMeter\":\"xurisjnhnyt\",\"sku\":\"fq\",\"tier\":\"Premium\"},{\"diskRpMeter\":\"mrhublwpc\",\"sku\":\"utr\",\"tier\":\"Standard\"},{\"diskRpMeter\":\"auutpwoqhihe\",\"sku\":\"g\",\"tier\":\"Premium\"}]}")
                .toObject(BillingResources.class);
        Assertions.assertEquals("fcluyov", model.region());
        Assertions.assertEquals("kfezzxscyhwz", model.billingMeters().get(0).meterParameter());
        Assertions.assertEquals("irujbz", model.billingMeters().get(0).meter());
        Assertions.assertEquals("mvzzbtdcqvp", model.billingMeters().get(0).unit());
        Assertions.assertEquals("lihhyuspskasdvlm", model.diskBillingMeters().get(0).diskRpMeter());
        Assertions.assertEquals("dgzxulucvpamrsr", model.diskBillingMeters().get(0).sku());
        Assertions.assertEquals(Tier.PREMIUM, model.diskBillingMeters().get(0).tier());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BillingResources model =
            new BillingResources()
                .withRegion("fcluyov")
                .withBillingMeters(
                    Arrays
                        .asList(
                            new BillingMeters()
                                .withMeterParameter("kfezzxscyhwz")
                                .withMeter("irujbz")
                                .withUnit("mvzzbtdcqvp"),
                            new BillingMeters()
                                .withMeterParameter("yujviylwdshfssn")
                                .withMeter("gy")
                                .withUnit("rymsgaojfmw"),
                            new BillingMeters()
                                .withMeterParameter("otmrfhir")
                                .withMeter("ymoxoftpipiwyczu")
                                .withUnit("a")))
                .withDiskBillingMeters(
                    Arrays
                        .asList(
                            new DiskBillingMeters()
                                .withDiskRpMeter("lihhyuspskasdvlm")
                                .withSku("dgzxulucvpamrsr")
                                .withTier(Tier.PREMIUM),
                            new DiskBillingMeters().withDiskRpMeter("xurisjnhnyt").withSku("fq").withTier(Tier.PREMIUM),
                            new DiskBillingMeters().withDiskRpMeter("mrhublwpc").withSku("utr").withTier(Tier.STANDARD),
                            new DiskBillingMeters()
                                .withDiskRpMeter("auutpwoqhihe")
                                .withSku("g")
                                .withTier(Tier.PREMIUM)));
        model = BinaryData.fromObject(model).toObject(BillingResources.class);
        Assertions.assertEquals("fcluyov", model.region());
        Assertions.assertEquals("kfezzxscyhwz", model.billingMeters().get(0).meterParameter());
        Assertions.assertEquals("irujbz", model.billingMeters().get(0).meter());
        Assertions.assertEquals("mvzzbtdcqvp", model.billingMeters().get(0).unit());
        Assertions.assertEquals("lihhyuspskasdvlm", model.diskBillingMeters().get(0).diskRpMeter());
        Assertions.assertEquals("dgzxulucvpamrsr", model.diskBillingMeters().get(0).sku());
        Assertions.assertEquals(Tier.PREMIUM, model.diskBillingMeters().get(0).tier());
    }
}
