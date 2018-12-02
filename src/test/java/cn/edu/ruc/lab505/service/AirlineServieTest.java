package cn.edu.ruc.lab505.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

import java.sql.Timestamp;
import java.util.Date;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.Assert;
//import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.util.Assert;
import org.springframework.test.web.servlet.MockMvc;

import cn.edu.ruc.lab505.client.model.Airline;
import cn.edu.ruc.lab505.client.model.User;
import cn.edu.ruc.lab505.client.repository.AirlineRepository;
import cn.edu.ruc.lab505.client.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
//@AutoConfigureMockMvc
@DataJpaTest
public class AirlineServieTest {
	@Autowired
	private AirlineRepository airlineRepository;
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private TestEntityManager entityManager;

	@Autowired
//	private MockMvc mvc;
	@Test
	public void contextLoads() {
	}
	
	public Airline generateAirline() {
		Airline airline = new Airline();
		airline.setAirlinePrice(1000);
//		airline.setArrivalTime(new Timestamp(new Date().getTime()));
//		airline.setDepartureTime(new Timestamp(new Date().getTime()));
		airline.setDestination("Beijing");
		airline.setDeparture("Shanghai");
		airline.setDuration((float) 2.5);
		airline.setRemainNum(20);
		airline.setStatus(1);
		return airline;
	}
	
	@Test
	public void testInsertAirline() {
		User usr = new User();
		usr.setActive(1);
		usr.setEmail("cy@163.com");
		usr.setName("ss");
		userRepository.save(usr);
		for (int i = 0; i < 10; i++) {
			Airline a = generateAirline();
			System.out.println("generate id: " + a.toString());
			Airline ta = airlineRepository.save(a);
//			Assert.notNull(ta, "The object is null");
			Assert.assertEquals("Insert data failed!", ta.getId(), a.getId());
		}
		
	}
//	
//	@Test
//	public void testGetMinPrice() {
//		airlineRepository.findAll();
//	}
}
