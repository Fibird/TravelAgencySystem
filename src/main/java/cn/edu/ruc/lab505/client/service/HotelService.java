package cn.edu.ruc.lab505.client.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.ruc.lab505.client.model.Hotel;
import cn.edu.ruc.lab505.client.repository.HotelRepository;

@Service("hotelService")
public class HotelService {
	HotelRepository hotelRepository;
	
	public HotelService(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}
	
	@Autowired
	public List<Hotel> findAll(){
		return hotelRepository.findAll();
	}
	
	public Hotel saveHotel(Hotel hotel) {
		return hotelRepository.save(hotel);
	}
}
