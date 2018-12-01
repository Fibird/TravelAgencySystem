package cn.edu.ruc.lab505.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.edu.ruc.lab505.client.model.*;

@Repository("attractionRepository")
public interface AttractionRepository extends JpaRepository<Attraction, Long> {

}
