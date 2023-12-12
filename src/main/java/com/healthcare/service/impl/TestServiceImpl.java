package com.healthcare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.entity.Test;
import com.healthcare.repository.TestRepository;
import com.healthcare.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestRepository testRepository;

	@Override
	public String addTest(Test test) {
		testRepository.save(test);
		return "Test added successfully";
	}
	
}
