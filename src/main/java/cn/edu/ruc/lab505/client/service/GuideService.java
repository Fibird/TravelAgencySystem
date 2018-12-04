package cn.edu.ruc.lab505.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.ruc.lab505.client.model.Guide;
import cn.edu.ruc.lab505.client.repository.GuideRepository;

@Service("guideService")
public class GuideService {

	GuideRepository guideRepository;
	
	public GuideService(GuideRepository guideRepository) {
		// TODO Auto-generated constructor stub
		this.guideRepository = guideRepository;
	}
	
	@Autowired
	public List<Guide> findAll() {
		return guideRepository.findAll();
	}
	
	public Guide saveGuide(Guide guide) {
		return guideRepository.save(guide);
	}
	
	@Autowired
	public Guide findGuideByAttractionId(int attractionId) {
		List<Guide> guidelist = guideRepository.findByAttractionIdOderByCommentDesc(attractionId);
		return guidelist.get(0);
	}
}
