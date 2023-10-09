package com.example.booking.persist;

import com.example.booking.persist.entity.BookingEntity;
import com.example.booking.persist.entity.StoreInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Long> {
}

