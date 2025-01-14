package com.healthsphere.health.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.healthsphere.health.entity.Patients;

public interface PatientRepository extends JpaRepository<Patients, Integer> {
	Patients findByName(String name);
	Patients findByUsername(String username);
}
