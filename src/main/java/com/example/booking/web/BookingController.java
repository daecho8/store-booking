package com.example.booking.web;

import com.example.booking.persist.entity.BookingEntity;
import com.example.booking.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/bookings")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    /*
    * 예약 리스트 조회
    *
    * */
    @GetMapping
    public ResponseEntity<?> searchBookings() {
        List<BookingEntity> bookingEntities = this.bookingService.showBookings();
        return ResponseEntity.ok(bookingEntities);
    }

    /*
     * 예약 등록
     *
     * */
    @PostMapping
    public ResponseEntity<?> addBooking(@RequestBody BookingEntity store) {
        this.bookingService.addBooking(store);
        return ResponseEntity.ok(store);
    }

    /*
     * 도착 등록
     * change arrived status
     *
     * */
    @PutMapping("/{id}")
    public String updateStatus(@PathVariable Long id, @RequestBody BookingEntity bookingEntity) {
        bookingService.updateBookingStatus(id, bookingEntity);
        return "STATUS CHANGED";
    }

    /*
     * 예약 취소 ; 삭제
     *
     * */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBooking(@PathVariable Long id) {
        bookingService.deleteBooking(id);
        return ResponseEntity.ok("No." + id + " booking is canceled");
    }
}
