/*
 * // Copyright (c) Microsoft Corporation. All rights reserved.
 * // Licensed under the MIT License.
 */

package com.azure.spring.cloud.feature.management.filters.recurrence;

import com.azure.spring.cloud.feature.management.implementation.timewindow.TimeWindowFilterSettings;
import com.azure.spring.cloud.feature.management.implementation.timewindow.recurrence.Recurrence;
import com.azure.spring.cloud.feature.management.implementation.timewindow.recurrence.RecurrenceEvaluator;
import com.azure.spring.cloud.feature.management.implementation.timewindow.recurrence.RecurrencePattern;
import com.azure.spring.cloud.feature.management.implementation.timewindow.recurrence.RecurrenceRange;
import com.azure.spring.cloud.feature.management.models.FilterParameters;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StartParameterNotMatchTest {
    @Test
    public void weeklyPatternNotMatchTest() {
        final ZonedDateTime startTime = ZonedDateTime.parse("2023-09-01T00:00:00+08:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        final ZonedDateTime endTime = startTime.plusHours(2);

        final TimeWindowFilterSettings settings = new TimeWindowFilterSettings();
        settings.setStart(startTime.format(DateTimeFormatter.RFC_1123_DATE_TIME));
        settings.setEnd(endTime.format(DateTimeFormatter.RFC_1123_DATE_TIME));
        final RecurrenceRange range = new RecurrenceRange();
        range.setType("NoEnd");
        final Recurrence recurrence = new Recurrence();
        recurrence.setRange(range);
        settings.setRecurrence(recurrence);

        // start time need to match the first recurrence
        final RecurrencePattern pattern1 = new RecurrencePattern();
        pattern1.setType("Weekly");
        pattern1.setDaysOfWeek(List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Saturday", "Sunday"));
        recurrence.setPattern(pattern1);
        consumeValidationTestData(settings);

        // start time need to match the first recurrence
        final RecurrencePattern pattern2 = new RecurrencePattern();
        pattern2.setType("Weekly");
        pattern2.setDaysOfWeek(List.of("Friday"));
        range.setRecurrenceTimeZone("UTC+07:00");
        recurrence.setPattern(pattern2);
        consumeValidationTestData(settings);
    }

    @Test
    public void absoluteMonthlyPatternNotMatchTest() {
        final ZonedDateTime startTime = ZonedDateTime.parse("2023-09-01T00:00:00+08:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        final ZonedDateTime endTime = startTime.plusHours(2);

        final TimeWindowFilterSettings settings = new TimeWindowFilterSettings();
        settings.setStart(startTime.format(DateTimeFormatter.RFC_1123_DATE_TIME));
        settings.setEnd(endTime.format(DateTimeFormatter.RFC_1123_DATE_TIME));
        final RecurrenceRange range = new RecurrenceRange();
        range.setType("NoEnd");
        final Recurrence recurrence = new Recurrence();
        recurrence.setRange(range);
        settings.setRecurrence(recurrence);

        // start time need to match the first recurrence
        final RecurrencePattern pattern = new RecurrencePattern();
        pattern.setType("AbsoluteMonthly");
        pattern.setDayOfMonth(2);
        recurrence.setPattern(pattern);
        consumeValidationTestData(settings);
    }

    @Test
    public void relativeMonthlyPatternNotMatchTest() {
        final ZonedDateTime startTime = ZonedDateTime.parse("2023-09-01T00:00:00+08:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        final ZonedDateTime endTime = startTime.plusHours(2);

        final TimeWindowFilterSettings settings = new TimeWindowFilterSettings();
        settings.setStart(startTime.format(DateTimeFormatter.RFC_1123_DATE_TIME));
        settings.setEnd(endTime.format(DateTimeFormatter.RFC_1123_DATE_TIME));
        final RecurrenceRange range = new RecurrenceRange();
        range.setType("NoEnd");
        final Recurrence recurrence = new Recurrence();
        recurrence.setRange(range);
        settings.setRecurrence(recurrence);

        // start time need to match the first recurrence
        final RecurrencePattern pattern = new RecurrencePattern();
        pattern.setType("RelativeMonthly");
        pattern.setDaysOfWeek(List.of("Friday"));
        pattern.setIndex("Second");
        recurrence.setPattern(pattern);
        consumeValidationTestData(settings);
    }

    @Test
    public void absoluteYearlyPatternNotMatchTest() {
        final ZonedDateTime startTime = ZonedDateTime.parse("2023-09-01T00:00:00+08:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        final ZonedDateTime endTime = startTime.plusHours(2);

        final TimeWindowFilterSettings settings = new TimeWindowFilterSettings();
        settings.setStart(startTime.format(DateTimeFormatter.RFC_1123_DATE_TIME));
        settings.setEnd(endTime.format(DateTimeFormatter.RFC_1123_DATE_TIME));
        final RecurrenceRange range = new RecurrenceRange();
        range.setType("NoEnd");
        final Recurrence recurrence = new Recurrence();
        recurrence.setRange(range);
        settings.setRecurrence(recurrence);

        // start time need to match the first recurrence
        final RecurrencePattern pattern = new RecurrencePattern();
        pattern.setType("AbsoluteYearly");
        pattern.setMonth(8);
        pattern.setDayOfMonth(1);
        recurrence.setPattern(pattern);
        consumeValidationTestData(settings);
    }

    @Test
    public void relativeYearlyPatternNotMatchTest() {
        final ZonedDateTime startTime = ZonedDateTime.parse("2023-09-01T00:00:00+08:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        final ZonedDateTime endTime = startTime.plusHours(2);

        final TimeWindowFilterSettings settings = new TimeWindowFilterSettings();
        settings.setStart(startTime.format(DateTimeFormatter.RFC_1123_DATE_TIME));
        settings.setEnd(endTime.format(DateTimeFormatter.RFC_1123_DATE_TIME));
        final RecurrenceRange range = new RecurrenceRange();
        range.setType("NoEnd");
        final Recurrence recurrence = new Recurrence();
        recurrence.setRange(range);
        settings.setRecurrence(recurrence);

        // start time need to match the first recurrence
        final RecurrencePattern pattern1 = new RecurrencePattern();
        pattern1.setType("RelativeYearly");
        pattern1.setDaysOfWeek(List.of("Friday"));
        pattern1.setMonth(8);
        recurrence.setPattern(pattern1);
        consumeValidationTestData(settings);

        // start time need to match the first recurrence
        final RecurrencePattern pattern2 = new RecurrencePattern();
        pattern2.setType("RelativeYearly");
        pattern2.setDaysOfWeek(List.of("Friday"));
        pattern2.setMonth(9);
        pattern2.setIndex("Second");
        recurrence.setPattern(pattern2);
        consumeValidationTestData(settings);
    }

    private void consumeValidationTestData(TimeWindowFilterSettings settings) {
        final ZonedDateTime now = ZonedDateTime.now();
        final String errorMessage = String.format(RecurrenceEvaluator.NOT_MATCHED, FilterParameters.TIME_WINDOW_FILTER_SETTING_START);

        try {
            RecurrenceEvaluator.matchRecurrence(now, settings);
        } catch (final Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
            assertEquals(e.getMessage(), errorMessage);
        }
    }

}
