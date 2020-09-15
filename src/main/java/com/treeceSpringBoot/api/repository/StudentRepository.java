package com.treeceSpringBoot.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.treeceSpringBoot.api.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{
	
	List<Student> findByName (String name);
}
