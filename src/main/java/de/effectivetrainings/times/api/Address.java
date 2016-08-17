package de.effectivetrainings.times.api;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Address {

    @NonNull
    private String street;
    @NonNull
    private String houseNumber;
    @NonNull
    private String zip;
    @NonNull
    private String city;
}
