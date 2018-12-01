package cn.edu.ruc.lab505.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.edu.ruc.lab505.client.model.*;

@Repository("guideRepository")
public interface GuideRepository extends JpaRepository<Guide, Long> {

}
