package com.example.modulelogin;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
    Customer findCustomerByFirstName(String firstName);

    Customer findCustomerByLastName(String lastName);

    Customer findCustomerById(Integer id);

    Customer findCustomerByNr(Integer nr);

}

