package de.effectivetrainings.times.api;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder
@Data
public class Customer {

    @NonNull
    private String name;
    @NonNull
    private Address address;
}
