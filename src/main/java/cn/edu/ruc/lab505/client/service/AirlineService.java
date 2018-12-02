package cn.edu.ruc.lab505.client.service;

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
	
	public Airline getMinPriceAirline() {
		return airlineRepository.findFirstByOrderByAirlinePriceAsc();
	}
	
	public void update(Airline airline) {
		airlineRepository.save(airline);
	}
	
	public AirlineService() {
		// TODO Auto-generated constructor stub
	}
	
	 
}
