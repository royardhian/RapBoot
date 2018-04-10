package com.projectx.rap.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.projectx.rap.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}