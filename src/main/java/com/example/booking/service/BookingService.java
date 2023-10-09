package com.example.booking.service;

import com.example.booking.persist.BookingRepository;
import com.example.booking.persist.entity.BookingEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingService {

    private final BookingRepository bookingRepository;

    public List<BookingEntity> showBookings() {
        return this.bookingRepository.findAll();
    }

    public void updateBookingStatus(Long id, BookingEntity bookingEntity) {
        BookingEntity booking = bookingRepository.findById(id).get();
        booking.setArrivedStatus(bookingEntity.isArrivedStatus());
        booking.setModifiedAt(LocalDateTime.now());
        this.bookingRepository.save(booking);
    }

    public BookingEntity addBooking(BookingEntity store) {
        return this.bookingRepository.save(store);
    }

    public void deleteBooking(Long id){
        this.bookingRepository.deleteById(id);
    }
}
