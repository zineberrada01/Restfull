package com.pfe.SpringRestful.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pfe.SpringRestful.model.*;

@Repository
public interface TladjRepository extends JpaRepository<TlAdjClass,Integer> {
     
  
	
}