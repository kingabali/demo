package com.example.demo.service;

import java.util.Map;

public interface EmployeeService {
	public Map<String, Long> getEmployeeViaJPA();

	public Map<String, Long> getEmployeeViaNative();
}
