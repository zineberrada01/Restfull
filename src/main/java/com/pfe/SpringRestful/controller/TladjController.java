package com.pfe.SpringRestful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.SpringRestful.model.*;
import com.pfe.SpringRestful.service.TladjService;

import java.util.List;

@CrossOrigin(origins ="${test.url}", maxAge=3600)
@RestController
@RequestMapping("/tladj/*")
public class TladjController {

	@Autowired
	private TladjService tladjServ;
	
	@GetMapping(value="/tladjs")
	public ResponseEntity<List<TlAdjClass>> getAll(){
		List<TlAdjClass> tladj = tladjServ.getAll();
		return new ResponseEntity<List<TlAdjClass>>(tladj,HttpStatus.FOUND);
		
	}
}
