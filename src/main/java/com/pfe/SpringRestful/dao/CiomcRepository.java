package com.pfe.SpringRestful.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pfe.SpringRestful.model.Ciomc;

@Repository
public interface CiomcRepository extends JpaRepository<Ciomc,Integer> {

	@Query(value="SELECT * FROM ciomc c WHERE c.date_nego LIKE %?1%",nativeQuery=true)
	public List<Ciomc> findAll(String keyword);
	
}
