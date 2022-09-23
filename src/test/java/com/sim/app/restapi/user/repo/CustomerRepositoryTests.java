package com.sim.app.restapi.user.repo;

import com.sim.app.restapi.user.dto.Customer;
import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


@SpringBootTest
public class CustomerRepositoryTests {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void testCustomerRepository(){
        Customer customer = Customer.builder().name("크리스").phone("010-1224-1225").build();
        customerRepository.save(customer);

        List<Customer> customerList = customerRepository.findAll();

        Customer chris = customerList.get(0);

        assertThat(chris.getName(), is("크리스"));
        assertThat(chris.getPhone(), is("010-1224-1225"));

    }

}
