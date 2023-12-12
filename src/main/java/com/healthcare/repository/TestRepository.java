package com.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.entity.Test;

public interface TestRepository extends JpaRepository<Test, Integer>{

}
