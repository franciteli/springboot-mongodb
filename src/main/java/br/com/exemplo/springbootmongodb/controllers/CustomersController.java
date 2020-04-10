package br.com.exemplo.springbootmongodb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.exemplo.springbootmongodb.domains.Customer;
import br.com.exemplo.springbootmongodb.services.CustomerService;

@CrossOrigin
@RestController
@RequestMapping("/v1")
public class CustomersController {

    @Autowired CustomerService customerService;

    @PostMapping(value= "/customer")
    public ResponseEntity<?> create(@RequestBody Customer customer) {
        Customer entity = this.customerService.create(customer);
        return ResponseEntity.ok().body(entity);
    }

}