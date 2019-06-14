package com.furkanuyanik.springdemo.controller;

import com.furkanuyanik.springdemo.model.Customer;
import com.furkanuyanik.springdemo.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/customer")
public class CustomerController {

  private final CustomerRepository repository;

  public CustomerController(CustomerRepository repository){
    this.repository = repository;
  }

  @GetMapping("/{id}")
  public Optional<Customer> findById(@PathVariable Long id) {
    return repository.findById(id);
  }

  @GetMapping
  public Iterable<Customer> findAll() {
    return repository.findAll();
  }

  @PostMapping
  public void create(@RequestBody Customer customer) {
    repository.save(customer);
  }

  @PutMapping
  public void update(@RequestBody Customer customer) {
    repository.save(customer);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    repository.deleteById(id);
  }
}
