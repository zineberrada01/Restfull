package com.pfe.SpringRestful.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.SpringRestful.dao.CiomcRepository;
import com.pfe.SpringRestful.model.Ciomc;

@Service
public class CiomcServiceImpl implements CiomcService {
	
	
	@Autowired 
	 private CiomcRepository ciomcRepo;
	
	 public CiomcServiceImpl() {
		 super();
	 }
	 
	 @Autowired
	 public CiomcServiceImpl(CiomcRepository ciomcRepo) {
		 super();
		 this.ciomcRepo=ciomcRepo;
	 }
	 
	 @Override
	 public List<Ciomc> listAll(String keyword){
		 if(keyword !=null) {
		 return ciomcRepo.findAll(keyword);
		 }
		 return ciomcRepo.findAll(keyword);
	 }

	@Override
	public List<Ciomc> getAll() {
		
		return ciomcRepo.findAll();
	
	}

}
