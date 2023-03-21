package com.pjhanes.reactandspringdatarestbasic.payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.pjhanes.reactandspringdatarestbasic.payroll"})
@EntityScan(basePackages = {"com.pjhanes.reactandspringdatarestbasic.payroll"})    
public class ReactAndSpringDataRestBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactAndSpringDataRestBasicApplication.class, args);
	}

}
