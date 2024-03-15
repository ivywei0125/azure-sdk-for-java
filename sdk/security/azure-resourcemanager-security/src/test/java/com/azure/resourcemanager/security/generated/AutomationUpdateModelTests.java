// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AutomationAction;
import com.azure.resourcemanager.security.models.AutomationRuleSet;
import com.azure.resourcemanager.security.models.AutomationScope;
import com.azure.resourcemanager.security.models.AutomationSource;
import com.azure.resourcemanager.security.models.AutomationTriggeringRule;
import com.azure.resourcemanager.security.models.AutomationUpdateModel;
import com.azure.resourcemanager.security.models.EventSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AutomationUpdateModelTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutomationUpdateModel model = BinaryData.fromString(
            "{\"properties\":{\"description\":\"fthnzdn\",\"isEnabled\":false,\"scopes\":[{\"description\":\"yq\",\"scopePath\":\"ynduha\"},{\"description\":\"qlkth\",\"scopePath\":\"aqolbgycduiertg\"}],\"sources\":[{\"eventSource\":\"AttackPathsSnapshot\",\"ruleSets\":[{\"rules\":[{},{},{}]},{\"rules\":[{},{},{}]},{\"rules\":[{},{},{}]}]}],\"actions\":[{\"actionType\":\"AutomationAction\"},{\"actionType\":\"AutomationAction\"}]},\"tags\":{\"iydmcwyhzdxs\":\"dnbbglzps\",\"od\":\"adbzmnvdfznud\",\"cblylpstdbhhxsr\":\"xzb\",\"erscdntne\":\"dzu\"}}")
            .toObject(AutomationUpdateModel.class);
        Assertions.assertEquals("dnbbglzps", model.tags().get("iydmcwyhzdxs"));
        Assertions.assertEquals("fthnzdn", model.description());
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals("yq", model.scopes().get(0).description());
        Assertions.assertEquals("ynduha", model.scopes().get(0).scopePath());
        Assertions.assertEquals(EventSource.ATTACK_PATHS_SNAPSHOT, model.sources().get(0).eventSource());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutomationUpdateModel model = new AutomationUpdateModel()
            .withTags(
                mapOf("iydmcwyhzdxs", "dnbbglzps", "od", "adbzmnvdfznud", "cblylpstdbhhxsr", "xzb", "erscdntne", "dzu"))
            .withDescription("fthnzdn").withIsEnabled(false)
            .withScopes(Arrays.asList(new AutomationScope().withDescription("yq").withScopePath("ynduha"),
                new AutomationScope().withDescription("qlkth").withScopePath("aqolbgycduiertg")))
            .withSources(Arrays.asList(new AutomationSource().withEventSource(EventSource.ATTACK_PATHS_SNAPSHOT)
                .withRuleSets(Arrays.asList(
                    new AutomationRuleSet().withRules(Arrays.asList(new AutomationTriggeringRule(),
                        new AutomationTriggeringRule(), new AutomationTriggeringRule())),
                    new AutomationRuleSet().withRules(Arrays.asList(new AutomationTriggeringRule(),
                        new AutomationTriggeringRule(), new AutomationTriggeringRule())),
                    new AutomationRuleSet().withRules(Arrays.asList(new AutomationTriggeringRule(),
                        new AutomationTriggeringRule(), new AutomationTriggeringRule()))))))
            .withActions(Arrays.asList(new AutomationAction(), new AutomationAction()));
        model = BinaryData.fromObject(model).toObject(AutomationUpdateModel.class);
        Assertions.assertEquals("dnbbglzps", model.tags().get("iydmcwyhzdxs"));
        Assertions.assertEquals("fthnzdn", model.description());
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals("yq", model.scopes().get(0).description());
        Assertions.assertEquals("ynduha", model.scopes().get(0).scopePath());
        Assertions.assertEquals(EventSource.ATTACK_PATHS_SNAPSHOT, model.sources().get(0).eventSource());
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
