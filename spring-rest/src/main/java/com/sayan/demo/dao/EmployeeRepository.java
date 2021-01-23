package com.sayan.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.sayan.demo.entity.EmployeeEntity;

@Transactional
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer>{

	@Query("select emp from EmployeeEntity emp where emp.department=?1")
	List<EmployeeEntity> findAllByDepartment(String dept);
	
	@Modifying
	@Query("delete EmployeeEntity emp where emp.name=?1")
	void deleteEmployeeByName(String name);
	

}
