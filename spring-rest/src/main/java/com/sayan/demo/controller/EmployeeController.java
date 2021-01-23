package com.sayan.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sayan.demo.entity.EmployeeEntity;
import com.sayan.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/addEmployees", method=RequestMethod.POST)
	public void addEmployees(@RequestBody List<EmployeeEntity> employeeEntities) {
		employeeService.addEmployees(employeeEntities);
	}
}
