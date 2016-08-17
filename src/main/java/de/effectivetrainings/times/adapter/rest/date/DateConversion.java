package de.effectivetrainings.times.adapter.rest.date;

import com.google.common.base.Preconditions;

import java.time.*;
import java.util.Date;

public class DateConversion {

    public static LocalDate toLocalDate(Date date) {
        Preconditions.checkNotNull(date);
        Instant instant = Instant.ofEpochMilli(date.getTime());
        return LocalDateTime
                           .ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
    }

    public static Period toPeriod(Date start, Date end) {
        Preconditions.checkNotNull(start);
        Preconditions.checkNotNull(end);
        return Period.between(toLocalDate(start), toLocalDate(end));
    }

    public static Date toDate(LocalDate localDate) {
        Instant instant = localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }

}
