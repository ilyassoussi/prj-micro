package org.MrDigital.customer_config;

import org.MrDigital.customer_config.dao.CustomerDAO;
import org.MrDigital.customer_config.model.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(CustomerConfigApplication.class, args);
	}
//	@Bean
//	CommandLineRunner start(CustomerDAO customerDAO){
//		return args -> {
//			customerDAO.saveAll(
//					List.of(
//							Customer.builder().mail("test.area@gmail.com").phone("06666666").name("test tester").password("524242").build(),
//							Customer.builder().mail("test.a@gmail.com").phone("066669666").name("test78 tester").password("passw575ord").build(),
//							Customer.builder().mail("test.c@gmail.com").phone("066668666").name("test 87tester").password("passwor575d").build(),
//							Customer.builder().mail("test.v@gmail.com").phone("067666666").name("tes86t tester").password("passsdword").build()
//					));
//			customerDAO.findAll().forEach(System.out::println);
//		};
//	}
}
