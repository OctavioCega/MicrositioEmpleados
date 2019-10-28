package com.cega.miniclonpastebin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cega.miniclonpastebin.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

	
}
