package de.effectivetrainings.times;

import de.effectivetrainings.times.adapter.rest.customers.CustomerResource;
import de.effectivetrainings.times.adapter.rest.projects.ProjectsResource;
import de.effectivetrainings.times.adapter.db.customer.CustomerRepository;
import de.effectivetrainings.times.adapter.db.project.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestAdapterConfig {

    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @Bean
    public CustomerResource customerResource() {
        return new CustomerResource(customerRepository);
    }

    @Bean
    public ProjectsResource projectsResource() {
        return new ProjectsResource(projectRepository);
    }
}
