package de.effectivetrainings.times.adapter.db.project;

import de.effectivetrainings.times.adapter.db.customer.CustomerData;
import lombok.*;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@RequiredArgsConstructor
//JPA
@Table(name = "PROJECTS")
@Entity
public class ProjectData {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @NonNull
    @NaturalId
    @Column(name = "NAME")
    private String name;
    @NonNull
    @Column(name = "START")
    @Temporal(TemporalType.DATE)
    private Date start;
    @NonNull
    @Column(name = "END")
    @Temporal(TemporalType.DATE)
    private Date end;

    @NonNull
    @ManyToOne
    @JoinColumn(referencedColumnName = "ID")
    private CustomerData customer;

    @NonNull
    @Column(name = "HOUR_RATE")
    private BigDecimal hourRate;
}
