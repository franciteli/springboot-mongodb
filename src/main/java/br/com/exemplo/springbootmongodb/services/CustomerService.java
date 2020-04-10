package br.com.exemplo.springbootmongodb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.exemplo.springbootmongodb.domains.Customer;
import br.com.exemplo.springbootmongodb.repositories.CustomerRepository;

@Service
public class CustomerService {

    @Autowired CustomerRepository customerRepository;
    
    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

}