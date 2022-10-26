// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DayOfWeek;
import com.azure.resourcemanager.datafactory.models.DaysOfWeek;
import com.azure.resourcemanager.datafactory.models.RecurrenceFrequency;
import com.azure.resourcemanager.datafactory.models.RecurrenceSchedule;
import com.azure.resourcemanager.datafactory.models.RecurrenceScheduleOccurrence;
import com.azure.resourcemanager.datafactory.models.ScheduleTriggerRecurrence;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ScheduleTriggerRecurrenceTests {
    @Test
    public void testDeserialize() {
        ScheduleTriggerRecurrence model =
            BinaryData
                .fromString(
                    "{\"frequency\":\"Week\",\"interval\":317159393,\"startTime\":\"2021-01-18T02:03:23Z\",\"endTime\":\"2021-05-19T21:11:58Z\",\"timeZone\":\"h\",\"schedule\":{\"minutes\":[264857512,1556130137,1920328829,251815165],\"hours\":[1406380830,1553771036],\"weekDays\":[\"Tuesday\",\"Thursday\",\"Friday\",\"Monday\"],\"monthDays\":[1844465000,366177355],\"monthlyOccurrences\":[{\"day\":\"Friday\",\"occurrence\":757118391,\"\":{}},{\"day\":\"Sunday\",\"occurrence\":1573565356,\"\":{}},{\"day\":\"Sunday\",\"occurrence\":656596398,\"\":{}},{\"day\":\"Wednesday\",\"occurrence\":371248668,\"\":{}}],\"\":{}},\"\":{}}")
                .toObject(ScheduleTriggerRecurrence.class);
        Assertions.assertEquals(RecurrenceFrequency.WEEK, model.frequency());
        Assertions.assertEquals(317159393, model.interval());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-18T02:03:23Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-19T21:11:58Z"), model.endTime());
        Assertions.assertEquals("h", model.timeZone());
        Assertions.assertEquals(264857512, model.schedule().minutes().get(0));
        Assertions.assertEquals(1406380830, model.schedule().hours().get(0));
        Assertions.assertEquals(DaysOfWeek.TUESDAY, model.schedule().weekDays().get(0));
        Assertions.assertEquals(1844465000, model.schedule().monthDays().get(0));
        Assertions.assertEquals(DayOfWeek.FRIDAY, model.schedule().monthlyOccurrences().get(0).day());
        Assertions.assertEquals(757118391, model.schedule().monthlyOccurrences().get(0).occurrence());
    }

    @Test
    public void testSerialize() {
        ScheduleTriggerRecurrence model =
            new ScheduleTriggerRecurrence()
                .withFrequency(RecurrenceFrequency.WEEK)
                .withInterval(317159393)
                .withStartTime(OffsetDateTime.parse("2021-01-18T02:03:23Z"))
                .withEndTime(OffsetDateTime.parse("2021-05-19T21:11:58Z"))
                .withTimeZone("h")
                .withSchedule(
                    new RecurrenceSchedule()
                        .withMinutes(Arrays.asList(264857512, 1556130137, 1920328829, 251815165))
                        .withHours(Arrays.asList(1406380830, 1553771036))
                        .withWeekDays(
                            Arrays
                                .asList(DaysOfWeek.TUESDAY, DaysOfWeek.THURSDAY, DaysOfWeek.FRIDAY, DaysOfWeek.MONDAY))
                        .withMonthDays(Arrays.asList(1844465000, 366177355))
                        .withMonthlyOccurrences(
                            Arrays
                                .asList(
                                    new RecurrenceScheduleOccurrence()
                                        .withDay(DayOfWeek.FRIDAY)
                                        .withOccurrence(757118391)
                                        .withAdditionalProperties(mapOf()),
                                    new RecurrenceScheduleOccurrence()
                                        .withDay(DayOfWeek.SUNDAY)
                                        .withOccurrence(1573565356)
                                        .withAdditionalProperties(mapOf()),
                                    new RecurrenceScheduleOccurrence()
                                        .withDay(DayOfWeek.SUNDAY)
                                        .withOccurrence(656596398)
                                        .withAdditionalProperties(mapOf()),
                                    new RecurrenceScheduleOccurrence()
                                        .withDay(DayOfWeek.WEDNESDAY)
                                        .withOccurrence(371248668)
                                        .withAdditionalProperties(mapOf())))
                        .withAdditionalProperties(mapOf()))
                .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(ScheduleTriggerRecurrence.class);
        Assertions.assertEquals(RecurrenceFrequency.WEEK, model.frequency());
        Assertions.assertEquals(317159393, model.interval());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-18T02:03:23Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-19T21:11:58Z"), model.endTime());
        Assertions.assertEquals("h", model.timeZone());
        Assertions.assertEquals(264857512, model.schedule().minutes().get(0));
        Assertions.assertEquals(1406380830, model.schedule().hours().get(0));
        Assertions.assertEquals(DaysOfWeek.TUESDAY, model.schedule().weekDays().get(0));
        Assertions.assertEquals(1844465000, model.schedule().monthDays().get(0));
        Assertions.assertEquals(DayOfWeek.FRIDAY, model.schedule().monthlyOccurrences().get(0).day());
        Assertions.assertEquals(757118391, model.schedule().monthlyOccurrences().get(0).occurrence());
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
