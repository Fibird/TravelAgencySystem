package cn.edu.ruc.lab505.client.service;


import cn.edu.ruc.lab505.client.model.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.ruc.lab505.client.repository.TuserRepository;

@Service("tuserService")
public class TuserService {

	private TuserRepository tuserRepository;
	
	public TuserService(TuserRepository tuserRepository) {
		this.tuserRepository = tuserRepository;
	}
	
	@Autowired
	public List<T_user> findAll(){
		return tuserRepository.findAll();
	}
	
	public T_user findTuserByNameAndPassword(String name,String password) {
		return tuserRepository.findByNameAndPassword(name, password);
	}
	
	
	public void save(T_user tuser) {
		tuserRepository.save(tuser);
	}
}
