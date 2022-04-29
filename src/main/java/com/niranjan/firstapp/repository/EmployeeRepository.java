package com.niranjan.firstapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.niranjan.firstapp.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}
