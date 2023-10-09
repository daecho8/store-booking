package com.example.booking.web;

import com.example.booking.persist.entity.OwnerEntity;
import com.example.booking.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/owner")
@RequiredArgsConstructor
public class OwnerController {

    private final OwnerService ownerService;

    /*
    * 파트너 회원가입 리스트 조회
    *
    * */
    @GetMapping
    public ResponseEntity<?> searchOwner() {
        List<OwnerEntity> owners = this.ownerService.showOwners();
        return ResponseEntity.ok(owners);
    }

    /*
     * 상점주인 파트너 회원가입
     *
     * */
    @PostMapping
    public ResponseEntity<?> addOwner(@RequestBody OwnerEntity owner) {
        this.ownerService.saveOwner(owner);
        return ResponseEntity.ok(owner);
    }
}
