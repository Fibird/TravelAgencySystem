package cn.edu.ruc.lab505.client.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.edu.ruc.lab505.client.model.*;

@Repository("carRentalRepository")
public interface CarRentalRepository extends JpaRepository<CarRental, Long> {

	public List<CarRental> findByRentalLocAndReturnLocOrderByCarPriceAsc(String rentalLoc,String returnLoc);
}
