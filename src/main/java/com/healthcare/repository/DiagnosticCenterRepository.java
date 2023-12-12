package com.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.entity.DiagnosticCenter;

public interface DiagnosticCenterRepository extends JpaRepository<DiagnosticCenter, Integer>{

}
