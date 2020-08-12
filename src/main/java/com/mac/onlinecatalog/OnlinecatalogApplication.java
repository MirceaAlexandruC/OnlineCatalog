package com.mac.onlinecatalog;

import com.mac.onlinecatalog.model.Student;
import com.mac.onlinecatalog.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlinecatalogApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;


	public static void main(String[] args) {
		SpringApplication.run(OnlinecatalogApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student student= new Student();
//		student.setFirstName("John");
//		student.setLastName("Joe");
//
//		Student student2= new Student();
//		student2.setFirstName("vasile");
//		student2.setLastName("artistul");
//
//		studentRepository.save(student);
//		studentRepository.save(student2);
//
//		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
//		for (Student s:
//			studentRepository.findAll() ) {
//			System.out.println(s.getStudentId() + ""+ s.getFirstName() + " " + s.getLastName());
//		}
	}
}
