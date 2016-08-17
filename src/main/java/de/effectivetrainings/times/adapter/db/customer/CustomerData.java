package de.effectivetrainings.times.adapter.db.customer;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@RequiredArgsConstructor
//JPA
@Table(name = "CUSTOMER")
@Entity
public class CustomerData {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @NonNull
    @Column(name = "name")
    private String name;

    @NonNull
    @Embedded
    private AddressData addresses;

}
