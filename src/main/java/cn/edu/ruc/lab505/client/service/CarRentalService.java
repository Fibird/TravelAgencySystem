package cn.edu.ruc.lab505.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.ruc.lab505.client.model.*;
import cn.edu.ruc.lab505.client.repository.CarRentalRepository;

@Service("carRentalService")
public class CarRentalService {
	CarRentalRepository carRentalRepository;
	
	public CarRentalService(CarRentalRepository carRentalRepository) {
		// TODO Auto-generated constructor stub
		this.carRentalRepository = carRentalRepository;
	}
	
	public void saveCarRental(CarRental carRental) {
		carRentalRepository.save(carRental);
	}
	@Autowired
	public List<CarRental> findAll(){
		return carRentalRepository.findAll();
	}
	
	public CarRental findCarByCity(String rentalLoc,String returnLoc) {
		List<CarRental> carlist = carRentalRepository.findByRentalLocAndReturnLocOrderByCarPriceAsc(rentalLoc,returnLoc);
		if(carlist.size()==0)
			return null;
		else
			return carlist.get(0);
	}
}
