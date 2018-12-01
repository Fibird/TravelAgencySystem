package cn.edu.ruc.lab505.client.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.edu.ruc.lab505.client.model.T_user;

@Repository("tuserRepository")

public interface TuserRepository extends JpaRepository<T_user, Integer> {

    List<T_user> findAll();
    
    T_user findByNameAndPassword(String username,String password);
    
    

}