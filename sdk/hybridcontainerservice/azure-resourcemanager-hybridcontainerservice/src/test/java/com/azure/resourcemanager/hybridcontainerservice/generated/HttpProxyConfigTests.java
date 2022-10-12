// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.HttpProxyConfig;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class HttpProxyConfigTests {
    @Test
    public void testDeserialize() {
        HttpProxyConfig model =
            BinaryData
                .fromString(
                    "{\"password\":\"clha\",\"httpProxy\":\"dbabp\",\"httpsProxy\":\"wrqlfktsthsuco\",\"noProxy\":[\"yyazttbt\",\"wrqpue\",\"ckzywbiexzfeyue\",\"xibxujwbhqwalm\"],\"trustedCa\":\"yoxa\",\"username\":\"dkzjancuxrh\"}")
                .toObject(HttpProxyConfig.class);
        Assertions.assertEquals("dbabp", model.httpProxy());
        Assertions.assertEquals("wrqlfktsthsuco", model.httpsProxy());
        Assertions.assertEquals("yyazttbt", model.noProxy().get(0));
        Assertions.assertEquals("yoxa", model.trustedCa());
        Assertions.assertEquals("dkzjancuxrh", model.username());
        Assertions.assertEquals("clha", model.password());
    }

    @Test
    public void testSerialize() {
        HttpProxyConfig model =
            new HttpProxyConfig()
                .withHttpProxy("dbabp")
                .withHttpsProxy("wrqlfktsthsuco")
                .withNoProxy(Arrays.asList("yyazttbt", "wrqpue", "ckzywbiexzfeyue", "xibxujwbhqwalm"))
                .withTrustedCa("yoxa")
                .withUsername("dkzjancuxrh")
                .withPassword("clha");
        model = BinaryData.fromObject(model).toObject(HttpProxyConfig.class);
        Assertions.assertEquals("dbabp", model.httpProxy());
        Assertions.assertEquals("wrqlfktsthsuco", model.httpsProxy());
        Assertions.assertEquals("yyazttbt", model.noProxy().get(0));
        Assertions.assertEquals("yoxa", model.trustedCa());
        Assertions.assertEquals("dkzjancuxrh", model.username());
        Assertions.assertEquals("clha", model.password());
    }
}
