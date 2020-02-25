package com.testing.junit.Junittestcasespringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testing.junit.Junittestcasespringboot.model.Cadet;

@Repository
public interface CadetRepository extends JpaRepository<Cadet, Integer>{

	// List<Cadet> findAll();
}
