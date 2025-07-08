package com.ash.travelbooking.mapper;

import com.ash.travelbooking.entity.Booking;
import com.ash.travelbooking.model.BookingDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    @Mapping(target = "id")
    @Mapping(target = "flightDetails")
    @Mapping(target = "taxiDetails")
    @Mapping(source = "customerInfo", target = "customerInfo")
    Booking toEntity(BookingDto bookingDto);

    @Mapping(target = "id")
    @Mapping(target = "flightDetails")
    @Mapping(target = "taxiDetails")
    @Mapping(source = "customerInfo", target = "customerInfo")
    BookingDto toDTO(Booking bookingEntity);

    List<BookingDto> toDTOList(List<Booking> bookingEntities);
}
