package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{
	@Query(value = "SELECT te_dept, count(*) FROM test_employee GROUP BY te_dept", nativeQuery = true)
	List<Object[]> getEmployeeViaNative();
}
