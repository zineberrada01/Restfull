package com.pfe.SpringRestful.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.SpringRestful.dao.CiomcRepository;
import com.pfe.SpringRestful.model.Ciomc;
import com.pfe.SpringRestful.model.TlAdjClass;

@Service
public interface CiomcService {
	
	 List<Ciomc> getAll();
	 List<Ciomc> listAll(String keyword);
     
}