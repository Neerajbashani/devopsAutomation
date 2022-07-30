package com.epam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.entity.Department;
import com.epam.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository dept_repo;

	public Department saveDepartment(Department dept) {

		return dept_repo.save(dept);
	}
//	@SuppressWarnings("deprecation")
	public Department getdepartmentById(Integer id) {
		
		Department dept= dept_repo.findById(id).get();
		return dept;
	}
	
	
}
