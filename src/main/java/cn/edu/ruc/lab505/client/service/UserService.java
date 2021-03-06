package cn.edu.ruc.lab505.client.service;

import cn.edu.ruc.lab505.client.model.*;
import cn.edu.ruc.lab505.client.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

@Service("userService")
public class UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserService(UserRepository userRepository,
                       RoleRepository roleRepository,
                       BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        if (user.getUserType().equals("admin")) {
        	Role userRole = roleRepository.findByRole("ROOT");
            user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        }
        else {
        	Role userRole = roleRepository.findByRole("USER");
            user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        }
        
        return userRepository.save(user);
    }

	public java.util.List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}