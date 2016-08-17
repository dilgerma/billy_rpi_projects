package de.effectivetrainings.times.adapter.rest.customers;

import de.effectivetrainings.times.adapter.rest.Mapper;
import de.effectivetrainings.times.api.Customer;
import de.effectivetrainings.times.adapter.db.customer.CustomerData;

public class CustomerApiMapper implements Mapper<Customer, CustomerData> {

    private CustomerAddressMapper customerAddressMapper = new CustomerAddressMapper();

    @Override
    public Customer from(CustomerData customerData) {
        return Customer
                .builder()
                .name(customerData.getName())
                .address(customerAddressMapper.from(customerData.getAddresses()))
                .build();
    }

    @Override
    public CustomerData to(Customer customer) {
        return new CustomerData(customer.getName(), customerAddressMapper.to(customer.getAddress()));
    }
}
