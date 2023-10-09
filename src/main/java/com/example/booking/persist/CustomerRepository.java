package com.example.booking.persist;

import com.example.booking.persist.entity.CustomerEntity;
import com.example.booking.persist.entity.OwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
