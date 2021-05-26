package com.fpt.soft.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fpt.soft.model.Booking;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Integer>{
	
}
