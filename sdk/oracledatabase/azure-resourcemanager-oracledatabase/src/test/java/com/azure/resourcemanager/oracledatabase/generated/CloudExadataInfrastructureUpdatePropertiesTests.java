// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.models.CloudExadataInfrastructureUpdateProperties;
import com.azure.resourcemanager.oracledatabase.models.CustomerContact;
import com.azure.resourcemanager.oracledatabase.models.DayOfWeek;
import com.azure.resourcemanager.oracledatabase.models.DayOfWeekName;
import com.azure.resourcemanager.oracledatabase.models.MaintenanceWindow;
import com.azure.resourcemanager.oracledatabase.models.Month;
import com.azure.resourcemanager.oracledatabase.models.MonthName;
import com.azure.resourcemanager.oracledatabase.models.PatchingMode;
import com.azure.resourcemanager.oracledatabase.models.Preference;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CloudExadataInfrastructureUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudExadataInfrastructureUpdateProperties model = BinaryData.fromString(
            "{\"computeCount\":175295404,\"storageCount\":1945766703,\"maintenanceWindow\":{\"preference\":\"NoPreference\",\"months\":[{\"name\":\"September\"},{\"name\":\"February\"},{\"name\":\"September\"}],\"weeksOfMonth\":[573023383,2052668715],\"daysOfWeek\":[{\"name\":\"Monday\"}],\"hoursOfDay\":[295057712,310195791],\"leadTimeInWeeks\":612947091,\"patchingMode\":\"NonRolling\",\"customActionTimeoutInMins\":88090872,\"isCustomActionTimeoutEnabled\":true,\"isMonthlyPatchingEnabled\":false},\"customerContacts\":[{\"email\":\"rudsg\"},{\"email\":\"a\"}],\"displayName\":\"kycgrauwj\"}")
            .toObject(CloudExadataInfrastructureUpdateProperties.class);
        Assertions.assertEquals(175295404, model.computeCount());
        Assertions.assertEquals(1945766703, model.storageCount());
        Assertions.assertEquals(Preference.NO_PREFERENCE, model.maintenanceWindow().preference());
        Assertions.assertEquals(MonthName.SEPTEMBER, model.maintenanceWindow().months().get(0).name());
        Assertions.assertEquals(573023383, model.maintenanceWindow().weeksOfMonth().get(0));
        Assertions.assertEquals(DayOfWeekName.MONDAY, model.maintenanceWindow().daysOfWeek().get(0).name());
        Assertions.assertEquals(295057712, model.maintenanceWindow().hoursOfDay().get(0));
        Assertions.assertEquals(612947091, model.maintenanceWindow().leadTimeInWeeks());
        Assertions.assertEquals(PatchingMode.NON_ROLLING, model.maintenanceWindow().patchingMode());
        Assertions.assertEquals(88090872, model.maintenanceWindow().customActionTimeoutInMins());
        Assertions.assertEquals(true, model.maintenanceWindow().isCustomActionTimeoutEnabled());
        Assertions.assertEquals(false, model.maintenanceWindow().isMonthlyPatchingEnabled());
        Assertions.assertEquals("rudsg", model.customerContacts().get(0).email());
        Assertions.assertEquals("kycgrauwj", model.displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudExadataInfrastructureUpdateProperties model
            = new CloudExadataInfrastructureUpdateProperties().withComputeCount(175295404)
                .withStorageCount(1945766703)
                .withMaintenanceWindow(new MaintenanceWindow().withPreference(Preference.NO_PREFERENCE)
                    .withMonths(Arrays.asList(new Month().withName(MonthName.SEPTEMBER),
                        new Month().withName(MonthName.FEBRUARY), new Month().withName(MonthName.SEPTEMBER)))
                    .withWeeksOfMonth(Arrays.asList(573023383, 2052668715))
                    .withDaysOfWeek(Arrays.asList(new DayOfWeek().withName(DayOfWeekName.MONDAY)))
                    .withHoursOfDay(Arrays.asList(295057712, 310195791))
                    .withLeadTimeInWeeks(612947091)
                    .withPatchingMode(PatchingMode.NON_ROLLING)
                    .withCustomActionTimeoutInMins(88090872)
                    .withIsCustomActionTimeoutEnabled(true)
                    .withIsMonthlyPatchingEnabled(false))
                .withCustomerContacts(
                    Arrays.asList(new CustomerContact().withEmail("rudsg"), new CustomerContact().withEmail("a")))
                .withDisplayName("kycgrauwj");
        model = BinaryData.fromObject(model).toObject(CloudExadataInfrastructureUpdateProperties.class);
        Assertions.assertEquals(175295404, model.computeCount());
        Assertions.assertEquals(1945766703, model.storageCount());
        Assertions.assertEquals(Preference.NO_PREFERENCE, model.maintenanceWindow().preference());
        Assertions.assertEquals(MonthName.SEPTEMBER, model.maintenanceWindow().months().get(0).name());
        Assertions.assertEquals(573023383, model.maintenanceWindow().weeksOfMonth().get(0));
        Assertions.assertEquals(DayOfWeekName.MONDAY, model.maintenanceWindow().daysOfWeek().get(0).name());
        Assertions.assertEquals(295057712, model.maintenanceWindow().hoursOfDay().get(0));
        Assertions.assertEquals(612947091, model.maintenanceWindow().leadTimeInWeeks());
        Assertions.assertEquals(PatchingMode.NON_ROLLING, model.maintenanceWindow().patchingMode());
        Assertions.assertEquals(88090872, model.maintenanceWindow().customActionTimeoutInMins());
        Assertions.assertEquals(true, model.maintenanceWindow().isCustomActionTimeoutEnabled());
        Assertions.assertEquals(false, model.maintenanceWindow().isMonthlyPatchingEnabled());
        Assertions.assertEquals("rudsg", model.customerContacts().get(0).email());
        Assertions.assertEquals("kycgrauwj", model.displayName());
    }
}
