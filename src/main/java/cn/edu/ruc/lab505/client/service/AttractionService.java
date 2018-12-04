package cn.edu.ruc.lab505.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.ruc.lab505.client.model.Attraction;
import cn.edu.ruc.lab505.client.repository.AttractionRepository;

@Service("attractionService")
public class AttractionService {
	AttractionRepository attractionRepository;
	
	public AttractionService(AttractionRepository attractionRepository) {
		// TODO Auto-generated constructor stub
		this.attractionRepository = attractionRepository;
	}
	
	@Autowired
	public List<Attraction> findall() {
		return attractionRepository.findAll();
	}
	
	public void saveAttraction(Attraction attraction) {
		attractionRepository.save(attraction);
	}
}
