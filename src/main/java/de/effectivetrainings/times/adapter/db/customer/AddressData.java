package de.effectivetrainings.times.adapter.db.customer;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Table;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@RequiredArgsConstructor
//JPA
@Embeddable
@Table(name = "ADDRESS_DATA")
public class AddressData {

    @NonNull
    private String street;
    @NonNull
    private String houseNumber;
    @NonNull
    private String zip;
    @NonNull
    private String city;
}
