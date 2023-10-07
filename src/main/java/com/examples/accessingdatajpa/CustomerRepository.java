package com.examples.accessingdatajpa;

import java.util.List;

import com.examples.accessingdatajpa.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}