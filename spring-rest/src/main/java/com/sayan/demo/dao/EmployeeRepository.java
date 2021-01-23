package com.sayan.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.sayan.demo.entity.EmployeeEntity;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer>{

}
