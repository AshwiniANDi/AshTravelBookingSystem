package com.ash.travelbooking.service;

import com.ash.travelbooking.mapper.BookingMapper;
import com.ash.travelbooking.model.BookingDto;
import com.ash.travelbooking.repository.BookingRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookingService {

    @Autowired
    private final BookingRepository bookingRepository;

    @Autowired
    private final BookingMapper bookingMapper;

    public BookingDto saveBooking(BookingDto bookingDto) {
        return bookingMapper.toDTO(bookingRepository.save(bookingMapper.toEntity(bookingDto)));
    }

    public Optional<BookingDto> findBookingById(Long id) {
        return Optional.ofNullable(bookingMapper.toDTO(bookingRepository.findById(id).get()));
    }

    public List<BookingDto> findAllBookings() {
        return bookingMapper.toDTOList(bookingRepository.findAll());
    }
}