package com.furkanuyanik.springdemo.repository;

import com.furkanuyanik.springdemo.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
