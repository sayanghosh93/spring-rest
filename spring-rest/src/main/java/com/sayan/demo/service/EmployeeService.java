package com.sayan.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sayan.demo.dao.EmployeeRepository;
import com.sayan.demo.entity.EmployeeEntity;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void addEmployees(List<EmployeeEntity> employeeEntities) {
		employeeRepository.saveAll(employeeEntities);
	}
	
	public List<EmployeeEntity> getEmployees() {
		return (List<EmployeeEntity>) employeeRepository.findAll();
	}
	
	public List<EmployeeEntity> getEmployeesByDepartment(String dept) {
		return (List<EmployeeEntity>) employeeRepository.findAllByDepartment(dept);
	}
	
	public void updateEmployees(EmployeeEntity entity) {
		Optional<EmployeeEntity> employeeEntity = employeeRepository.findById(entity.getId());
		employeeEntity.get().setName(entity.getName());
		employeeEntity.get().setAddress(entity.getAddress());
		employeeEntity.get().setDepartment(entity.getDepartment());
		employeeEntity.get().setSalary(entity.getSalary());
		employeeRepository.save(employeeEntity.get());
	}
	
	public void deleteEmployeeByName(String name) {
		employeeRepository.deleteEmployeeByName(name);
	}
}
