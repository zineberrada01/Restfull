package com.pfe.SpringRestful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.SpringRestful.service.CiomcService;
import com.pfe.SpringRestful.model.*;

@CrossOrigin(origins ="${test.url}", maxAge=3600)
@RestController
@RequestMapping("/Ciomc/*")
public class CiomcController {

	@Autowired
	private CiomcService ciomcServ;
	
	@GetMapping(value="/ciomcs")
	public ResponseEntity<List<Ciomc>> getAll(){
		List<Ciomc> ciomc = ciomcServ.getAll();
		return new ResponseEntity<List<Ciomc>>(ciomc,HttpStatus.FOUND);
	}
	
	@RequestMapping(value="/getdataRechercher")
	public ResponseEntity<List<Ciomc>> getByDate(@Param("keyword") String keyword ) {
		
		List<Ciomc> listCiomc = ciomcServ.listAll(keyword);
		 
		return new ResponseEntity<List<Ciomc>>(listCiomc,HttpStatus.FOUND);
	}
}
