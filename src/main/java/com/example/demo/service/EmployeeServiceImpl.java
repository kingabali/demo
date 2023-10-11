package com.example.demo.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements  EmployeeService{
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Map<String, Long> getEmployeeViaJPA() {
		List<Employee> empList = employeeRepo.findAll();
		return empList.stream()
	            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
	}

	@Override
	public Map<String, Long> getEmployeeViaNative() {
		return employeeRepo.getEmployeeViaNative().stream()
                .collect(Collectors.toMap(row -> (String) row[0],row -> (Long) row[1]));
	}
	
	
}
