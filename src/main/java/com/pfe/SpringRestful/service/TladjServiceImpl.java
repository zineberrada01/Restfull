package com.pfe.SpringRestful.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.SpringRestful.dao.TladjRepository;
import com.pfe.SpringRestful.model.TlAdjClass;

@Service
public class TladjServiceImpl implements TladjService {

	@Autowired
	private TladjRepository tladjRepo;
	
	public TladjServiceImpl() {
		super();
	}
	
	@Autowired
	public TladjServiceImpl(TladjRepository tladjRepo) {
		super();
		this.tladjRepo=tladjRepo;
	}
	
	@Override
	public List<TlAdjClass> getAll() {
		
		return tladjRepo.findAll();
	}

}
