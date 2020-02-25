package com.testing.junit.Junittestcasespringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.junit.Junittestcasespringboot.model.Cadet;
import com.testing.junit.Junittestcasespringboot.repository.CadetRepository;

@RestController
public class CadetResource {

	@Autowired
	private CadetRepository cadetRepository;
	
	@GetMapping("/getall")
	public ResponseEntity<List<Cadet>> getAllCadets() {
		return new ResponseEntity<List<Cadet>>(cadetRepository.findAll(), HttpStatus.OK);
	}
}
