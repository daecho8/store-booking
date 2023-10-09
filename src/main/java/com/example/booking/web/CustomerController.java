package com.example.booking.web;

import com.example.booking.persist.entity.CustomerEntity;
import com.example.booking.persist.entity.OwnerEntity;
import com.example.booking.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    /*
    * 고객 회원가입 리스트 조회
    *
    * */
    @GetMapping
    public ResponseEntity<?> showCustomers() {
        List<CustomerEntity> customers = this.customerService.showCustomers();
        return ResponseEntity.ok(customers);
    }

    /*
     * 고객 앱 회원가입
     *
     * */
    @PostMapping
    public ResponseEntity<?> addCustomer(@RequestBody CustomerEntity customer) {
        this.customerService.saveCustomer(customer);
        return ResponseEntity.ok(customer);
    }
}
