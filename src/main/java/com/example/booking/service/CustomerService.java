package com.example.booking.service;

import com.example.booking.persist.CustomerRepository;
import com.example.booking.persist.OwnerRepository;
import com.example.booking.persist.entity.CustomerEntity;
import com.example.booking.persist.entity.OwnerEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<CustomerEntity> showCustomers() {
        return this.customerRepository.findAll();
    }

    public CustomerEntity saveCustomer(CustomerEntity customer) {
        return this.customerRepository.save(customer);
    }
}
