package cn.edu.ruc.lab505.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.ruc.lab505.client.model.CarRental;
import cn.edu.ruc.lab505.client.model.T_user;
import cn.edu.ruc.lab505.client.repository.CarRentalRepository;

@Service("carRentalService")
public class CarRentalService {
	CarRentalRepository carRentalRepository;
	
	public CarRentalService(CarRentalRepository carRentalRepository) {
		// TODO Auto-generated constructor stub
		this.carRentalRepository = carRentalRepository;
	}
	
	@Autowired
	public List<CarRental> findAll(){
		return carRentalRepository.findAll();
	}
}
