package com.sayan.first;

import com.sayan.first.dao.StudentDAO;
import com.sayan.first.entity.student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}


	@Bean
	public CommandLineRunner CommandLineRunner(StudentDAO studentDAO){
		return runner ->{
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {

		//Create The Student Object
		System.out.println("Creating new Student Object");
		student tempStudent =new student("Sayan","Das","Sayandas721137@gmail.com");

		//Save The Student Object
		System.out.println("Saving the Student........");
		studentDAO.save(tempStudent);

		//Display id Of The Save Student

		System.out.println("saved Student. Generated id: " + tempStudent.getId());

	}

}
