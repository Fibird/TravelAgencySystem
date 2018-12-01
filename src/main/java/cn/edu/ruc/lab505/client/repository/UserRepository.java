package cn.edu.ruc.lab505.client.repository;



import cn.edu.ruc.lab505.client.model.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



@Repository("userRepository")

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
    
    List<User> findAll();

}