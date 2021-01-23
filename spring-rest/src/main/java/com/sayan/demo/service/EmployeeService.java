package com.sayan.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sayan.demo.dao.EmployeeRepository;
import com.sayan.demo.entity.EmployeeEntity;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void addEmployees(List<EmployeeEntity> employeeEntities) {
		for (EmployeeEntity employeeEntity : employeeEntities) {
			employeeRepository.save(employeeEntity);
		}
	}
}
