package com.example.booking.web;

import com.example.booking.persist.entity.OwnerEntity;
import com.example.booking.persist.entity.StoreInfoEntity;
import com.example.booking.service.OwnerService;
import com.example.booking.service.StoreInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/stores")
@RequiredArgsConstructor
public class StoreInfoController {

    private final StoreInfoService storeInfoService;

    /*
    * 매장 리스트 조회
    *
    * */
    @GetMapping
    public ResponseEntity<?> searchStoreInfoList() {
        List<StoreInfoEntity> storeInfoList = this.storeInfoService.showStoreInfoList();
        return ResponseEntity.ok(storeInfoList);
    }

    /*
     * 매장 등록
     *
     * */
    @PostMapping
    public ResponseEntity<?> registerStore(@RequestBody StoreInfoEntity store) {
        this.storeInfoService.registerStoreInfo(store);
        return ResponseEntity.ok(store);
    }
}
