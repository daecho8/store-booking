package com.example.booking.service;

import com.example.booking.persist.OwnerRepository;
import com.example.booking.persist.entity.OwnerEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class OwnerService {

    private final OwnerRepository ownerRepository;

    public List<OwnerEntity> showOwners() {
        return this.ownerRepository.findAll();
    }

    public OwnerEntity saveOwner(OwnerEntity owner) {
        return this.ownerRepository.save(owner);
    }
}
