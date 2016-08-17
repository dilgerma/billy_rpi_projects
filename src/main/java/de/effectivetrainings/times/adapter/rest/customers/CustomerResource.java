package de.effectivetrainings.times.adapter.rest.customers;

import de.effectivetrainings.times.api.Customer;
import de.effectivetrainings.times.adapter.db.customer.CustomerRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CustomerResource {

    public static final String CUSTOMER_URI = "/customers";
    public static final String CUSTOMER_NAME_URI = "/customers/{name}";


    private CustomerRepository customerRepository;
    private CustomerApiMapper customerApiMapper = new CustomerApiMapper();

    public CustomerResource(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @RequestMapping(CUSTOMER_URI)
    public List<Customer> customers() {
        return customerRepository
                .findAll()
                .stream()
                .map(customerApiMapper::from)
                .collect(Collectors.toList());
    }

    @RequestMapping(CUSTOMER_NAME_URI)
      public List<Customer> customerByName(@PathVariable("name") String name) {
          return customerRepository
                  .findByName(name)
                  .stream()
                  .map(customerApiMapper::from)
                  .collect(Collectors.toList());
      }
}
