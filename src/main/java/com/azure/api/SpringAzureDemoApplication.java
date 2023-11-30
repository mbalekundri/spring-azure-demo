package com.azure.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.azure.api.model.Employee;
import com.azure.api.repository.EmployeeRepository;

@SpringBootApplication
public class SpringAzureDemoApplication implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		employeeRepository.save(Employee.builder()
				.firstName("Rohit")
				.lastName("Balekundri")
				.age(40)
				.email("abc@g.com")
				.phone("123333333").build());
		employeeRepository.save(Employee.builder()
				.firstName("Rashmika")
				.lastName("Balekundri")
				.age(4)
				.email("abc@g.com")
				.phone("234444444").build());
	}

}
