package cn.edu.ruc.lab505.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.edu.ruc.lab505.client.model.*;

@Repository("arilineRepository")
public interface AirlineRepository extends JpaRepository<Airline, Long> {
	void deleteById(long id);
	Airline findFirstByOrderByAirlinePriceAsc();
}