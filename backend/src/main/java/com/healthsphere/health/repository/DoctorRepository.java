package com.healthsphere.health.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthsphere.health.entity.Doctors;

public interface DoctorRepository extends JpaRepository<Doctors, Integer> {
	Doctors findByName(String name);
	Doctors findByUsername(String username);
}
