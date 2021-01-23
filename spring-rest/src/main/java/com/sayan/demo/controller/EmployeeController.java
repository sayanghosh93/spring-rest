package com.sayan.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sayan.demo.entity.EmployeeEntity;
import com.sayan.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/addEmployees", method = RequestMethod.POST)
	public void addEmployees(@RequestBody List<EmployeeEntity> employeeEntities) {
		employeeService.addEmployees(employeeEntities);
	}

	@RequestMapping(value = "/getEmployees")
	public List<EmployeeEntity> getEmployees() {
		return employeeService.getEmployees();
	}

	@RequestMapping(value = "/getEmployeesByDepartment{dept}")
	public List<EmployeeEntity> getEmployeesByDepartment(@RequestParam(name = "dept") String dept) {
		return employeeService.getEmployeesByDepartment(dept);
	}

	@RequestMapping(value = "/updateEmployees",method = RequestMethod.POST)
	public void updateEmployees(@RequestBody EmployeeEntity employeeEntity) {
		employeeService.updateEmployees(employeeEntity);
	}

	@RequestMapping(value = "/deleteEmployeeByName{name}", method=RequestMethod.DELETE)
	public void deleteEmployeeByNamename(@RequestParam(name="name") String name) {
		employeeService.deleteEmployeeByName(name);
	}
}
