package de.effectivetrainings.times.api;

import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;

@Data
public class HourRate {
    @NonNull
    private BigDecimal rate;

    public static final HourRate of(BigDecimal rate) {
        return new HourRate(rate);
    }
}
