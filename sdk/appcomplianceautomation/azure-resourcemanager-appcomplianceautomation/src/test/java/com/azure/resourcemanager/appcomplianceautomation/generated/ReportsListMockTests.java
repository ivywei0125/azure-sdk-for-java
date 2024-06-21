// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager;
import com.azure.resourcemanager.appcomplianceautomation.models.ReportResource;
import com.azure.resourcemanager.appcomplianceautomation.models.ResourceOrigin;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ReportsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"triggerTime\":\"2021-12-03T21:08:29Z\",\"timeZone\":\"loazuruocbgoo\",\"resources\":[{\"resourceId\":\"te\",\"resourceType\":\"bfhjxakvvjgsl\",\"resourceKind\":\"dilmyww\",\"resourceOrigin\":\"AWS\",\"accountId\":\"xnyed\"},{\"resourceId\":\"b\",\"resourceType\":\"vudtjuewbcihx\",\"resourceKind\":\"whcjyxcc\",\"resourceOrigin\":\"AWS\",\"accountId\":\"ayakkudzpx\"}],\"status\":\"Reviewing\",\"errors\":[\"mag\"],\"tenantId\":\"cyohpfkyrkdbd\",\"offerGuid\":\"ogsjkmnwqjno\",\"nextTriggerTime\":\"2021-01-19T13:37:50Z\",\"lastTriggerTime\":\"2021-12-10T12:55:18Z\",\"subscriptions\":[\"viacegfnmntfpmv\"],\"complianceStatus\":{\"m365\":{\"passedCount\":1649759602,\"failedCount\":325051200,\"manualCount\":880683863,\"notApplicableCount\":97692731,\"pendingCount\":91820955}},\"storageInfo\":{\"subscriptionId\":\"lllchpodb\",\"resourceGroup\":\"vwrdnhfukuvsj\",\"accountName\":\"wsmystuluqypf\",\"location\":\"lerchpq\"},\"certRecords\":[{\"offerGuid\":\"jbabwidf\",\"certificationStatus\":\"sspuunnoxyhkx\",\"ingestionStatus\":\"ddrihpf\",\"controls\":[{},{},{},{}]}],\"provisioningState\":\"Fixing\"},\"id\":\"ewda\",\"name\":\"mdjvlpj\",\"type\":\"xkzb\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AppComplianceAutomationManager manager = AppComplianceAutomationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ReportResource> response = manager.reports()
            .list("zivj", 1398349003, "rqttbajlkatnw", "yiopi", "kqqfk", "vscx", "dmligovibrxk",
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals(OffsetDateTime.parse("2021-12-03T21:08:29Z"),
            response.iterator().next().properties().triggerTime());
        Assertions.assertEquals("loazuruocbgoo", response.iterator().next().properties().timeZone());
        Assertions.assertEquals("te", response.iterator().next().properties().resources().get(0).resourceId());
        Assertions.assertEquals("bfhjxakvvjgsl",
            response.iterator().next().properties().resources().get(0).resourceType());
        Assertions.assertEquals("dilmyww", response.iterator().next().properties().resources().get(0).resourceKind());
        Assertions.assertEquals(ResourceOrigin.AWS,
            response.iterator().next().properties().resources().get(0).resourceOrigin());
        Assertions.assertEquals("xnyed", response.iterator().next().properties().resources().get(0).accountId());
        Assertions.assertEquals("ogsjkmnwqjno", response.iterator().next().properties().offerGuid());
        Assertions.assertEquals("lllchpodb", response.iterator().next().properties().storageInfo().subscriptionId());
        Assertions.assertEquals("vwrdnhfukuvsj", response.iterator().next().properties().storageInfo().resourceGroup());
        Assertions.assertEquals("wsmystuluqypf", response.iterator().next().properties().storageInfo().accountName());
        Assertions.assertEquals("lerchpq", response.iterator().next().properties().storageInfo().location());
    }
}
