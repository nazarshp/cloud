package com.ua.lviv.iot.lab5_back_end.repository;

import com.ua.lviv.iot.lab5_back_end.domain.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
