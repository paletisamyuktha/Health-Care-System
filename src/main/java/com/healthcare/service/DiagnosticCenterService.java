package com.healthcare.service;

import java.util.List;

import com.healthcare.entity.DiagnosticCenter;

public interface DiagnosticCenterService {
	
	boolean addCenter(DiagnosticCenter diagnosticCenter);
	
	List<DiagnosticCenter> getAllCenters();
	
}
