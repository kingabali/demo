package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EmployeeService;


@RestController
@RequestMapping("/Test")
public class TestControler {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("getEmployeeViaJPA")
	public ResponseEntity<Map<String, Long>> getEmployeeViaJPA() {
		return ResponseEntity.ok(employeeService.getEmployeeViaJPA());
	}

	@GetMapping("getEmployeeViaNative")
	public ResponseEntity<Map<String, Long>> getEmployeeViaNative() {
		return ResponseEntity.ok(employeeService.getEmployeeViaNative());
	}

}
