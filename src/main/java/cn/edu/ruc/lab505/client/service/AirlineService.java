package cn.edu.ruc.lab505.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.ruc.lab505.client.model.Airline;
import cn.edu.ruc.lab505.client.repository.*;

@Service("airlineService")
public class AirlineService {
	private AirlineRepository airlineRepository;
	
	@Autowired
	public AirlineService(AirlineRepository airlineReporsitory) {
		this.airlineRepository = airlineReporsitory;
	}

	public Airline saveAirline(Airline airline) {
		return airlineRepository.save(airline);
	}
	
	public void delete(Long id) {
		airlineRepository.deleteById(id);
	}
	
	@Autowired
	public Airline getMinPriceAirline(String departureTime,String departure,String destination) {
		List<Airline> airlinesList =  airlineRepository.findByDepartureTimeAndDepartureAndDestinationOrderByAirlinePriceAsc(departureTime,departure,destination);
		return airlinesList.get(0);
	}
	
	public void update(Airline airline) {
		airline.setStatus(1);
		airlineRepository.save(airline);
	}
	
	public List<Airline> findAll() {
		return airlineRepository.findAll();
	}
	
	public AirlineService() {
		// TODO Auto-generated constructor stub
	}
	
	 
}
