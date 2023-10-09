package com.example.booking.service;

import com.example.booking.persist.OwnerRepository;
import com.example.booking.persist.StoreInfoRepository;
import com.example.booking.persist.entity.OwnerEntity;
import com.example.booking.persist.entity.StoreInfoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreInfoService {

    private final StoreInfoRepository storeInfoRepository;

    public List<StoreInfoEntity> showStoreInfoList() {
        return this.storeInfoRepository.findAll();
    }

    public StoreInfoEntity registerStoreInfo(StoreInfoEntity store) {
        return this.storeInfoRepository.save(store);
    }
}
