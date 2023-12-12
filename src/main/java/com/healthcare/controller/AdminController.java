package com.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.entity.DiagnosticCenter;
import com.healthcare.entity.Test;
import com.healthcare.service.DiagnosticCenterService;
import com.healthcare.service.TestService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	
	@Autowired
	private DiagnosticCenterService diCenterService;
	
	@Autowired
	private TestService testService;
	
	@PostMapping("/addCenter")
	public ResponseEntity<Boolean> addCenter(@RequestBody DiagnosticCenter diagnosticCenter){
		return new ResponseEntity<>(diCenterService.addCenter(diagnosticCenter), HttpStatus.OK);
	}
	
	@GetMapping("/allCenters")
	public ResponseEntity<List<DiagnosticCenter>> getAllCenters(){
		return ResponseEntity.status(HttpStatus.OK).body(diCenterService.getAllCenters());
	}
	
	@PostMapping("/addTest")
	public ResponseEntity<String> addTest(@RequestBody Test test){
		System.out.println(test);
		return ResponseEntity.status(HttpStatus.CREATED).body(testService.addTest(test));
	}
	
	
	
	
	
	
	
	
}
