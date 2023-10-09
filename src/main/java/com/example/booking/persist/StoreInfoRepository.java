package com.example.booking.persist;

import com.example.booking.persist.entity.OwnerEntity;
import com.example.booking.persist.entity.StoreInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreInfoRepository extends JpaRepository<StoreInfoEntity, Long> {
}

