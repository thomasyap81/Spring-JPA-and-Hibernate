package com.thomas.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.thomas.springboot.learnjpaandhibernate.course.Course;
import com.thomas.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.thomas.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJdbcRepository repository;
	
	@Autowired
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "learn AWS jpa!", "in28minutes"));
		repository.insert(new Course(2, "learn Azure jpa!", "in28minutes"));
		repository.insert(new Course(3, "learn DevOps jpa!", "in28minutes"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
		
	}
	
	

}
