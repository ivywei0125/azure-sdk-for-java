// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.ScriptCmdletInner;
import com.azure.resourcemanager.avs.models.ScriptCmdletsList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScriptCmdletsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScriptCmdletsList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\",\"description\":\"ikdowwquuvx\",\"timeout\":\"clvit\",\"audience\":\"Any\",\"parameters\":[{\"type\":\"Float\",\"name\":\"ggbhcohfwds\",\"description\":\"ka\",\"visibility\":\"Hidden\",\"optional\":\"Required\"}]},\"id\":\"swacffgdkzz\",\"name\":\"wkfvhqcrailvp\",\"type\":\"ppfufl\"},{\"properties\":{\"provisioningState\":\"Canceled\",\"description\":\"dlxyjrxs\",\"timeout\":\"afcnih\",\"audience\":\"Any\",\"parameters\":[{\"type\":\"Int\",\"name\":\"gfbcvkcv\",\"description\":\"pkeqdcvdrhvoo\",\"visibility\":\"Hidden\",\"optional\":\"Required\"},{\"type\":\"Bool\",\"name\":\"dopcjwvnh\",\"description\":\"d\",\"visibility\":\"Visible\",\"optional\":\"Required\"}]},\"id\":\"rslpmutwuoeg\",\"name\":\"pkhjwni\",\"type\":\"qsluicp\"},{\"properties\":{\"provisioningState\":\"Succeeded\",\"description\":\"zl\",\"timeout\":\"bmpaxmodfvu\",\"audience\":\"Automation\",\"parameters\":[{\"type\":\"Float\",\"name\":\"vmwy\",\"description\":\"fouyf\",\"visibility\":\"Visible\",\"optional\":\"Optional\"},{\"type\":\"SecureString\",\"name\":\"yzvqt\",\"description\":\"ubex\",\"visibility\":\"Visible\",\"optional\":\"Optional\"},{\"type\":\"Credential\",\"name\":\"djmq\",\"description\":\"vypomgkopkwho\",\"visibility\":\"Hidden\",\"optional\":\"Optional\"}]},\"id\":\"gxysmocmbqfqvm\",\"name\":\"cxozapvhelxp\",\"type\":\"glyatddckcbcuej\"}],\"nextLink\":\"xgc\"}")
            .toObject(ScriptCmdletsList.class);
        Assertions.assertEquals("xgc", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScriptCmdletsList model = new ScriptCmdletsList()
            .withValue(Arrays.asList(new ScriptCmdletInner(), new ScriptCmdletInner(), new ScriptCmdletInner()))
            .withNextLink("xgc");
        model = BinaryData.fromObject(model).toObject(ScriptCmdletsList.class);
        Assertions.assertEquals("xgc", model.nextLink());
    }
}
