package com.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.entity.DiagnosticCenter;
import com.healthcare.entity.Test;
import com.healthcare.repository.DiagnosticCenterRepository;
import com.healthcare.service.DiagnosticCenterService;

@Service
public class DiagnosticCenterServiceImpl implements DiagnosticCenterService{
	
	@Autowired
	private DiagnosticCenterRepository repository;

	@Override
	public boolean addCenter(DiagnosticCenter diagnosticCenter) {
		diagnosticCenter.setTestList(getDefaultTests(diagnosticCenter));
//		System.out.println(diagnosticCenter.getTestList());
//		DiagnosticCenter dia = repository.save(diagnosticCenter);
//		return dia != null;
		repository.save(diagnosticCenter);
		return true;
	}

	private List<Test> getDefaultTests(DiagnosticCenter diagnosticCenter) {
		Test bloodGroupTest=new Test();
		bloodGroupTest.setTestName("Blood Group");
		bloodGroupTest.setDiagnosticCenter(diagnosticCenter);
		
		Test bloodSugarTest=new Test();
		bloodSugarTest.setTestName("Blood Sugar");
		bloodSugarTest.setDiagnosticCenter(diagnosticCenter);
		
		Test bloodPressureTest=new Test();
		bloodPressureTest.setTestName("Blood Pressure");
		bloodPressureTest.setDiagnosticCenter(diagnosticCenter);
		
		return List.of(bloodGroupTest,bloodSugarTest,bloodPressureTest);
		
		
		
	}

	@Override
	public List<DiagnosticCenter> getAllCenters() {
		return repository.findAll();
	}
	

}
