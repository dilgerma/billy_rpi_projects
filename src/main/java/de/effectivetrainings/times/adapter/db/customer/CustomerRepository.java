package de.effectivetrainings.times.adapter.db.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<CustomerData, Long> {

    List<CustomerData> findByName(String name);
}
