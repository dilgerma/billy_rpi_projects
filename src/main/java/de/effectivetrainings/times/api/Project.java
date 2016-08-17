package de.effectivetrainings.times.api;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.Date;

@Builder
@Data
public class Project {

    @NonNull
    private String name;
    @NonNull
    private Date start;
    @NonNull
    private Date end;
    @NonNull
    private String customerName;
    @NonNull
    private HourRate hourRate;
}
