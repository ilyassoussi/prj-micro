package org.MrDigital.order_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
@EnableConfigurationProperties
public class OrderConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderConfigApplication.class, args);
	}


//	@Bean
//	CommandLineRunner start(OrderDAO orderDAO){
//		return args -> {
//			orderDAO.saveAll(
//					List.of(
//							Order.builder().reference("X123456").produit(2).build(),
//							Order.builder().reference("X123").produit(5).build(),
//							Order.builder().reference("ad456").produit(2).build(),
//							Order.builder().reference("Xsaas3456").produit(2).build()
//					));
//				orderDAO.findAll().forEach(System.out::println);
//		};
//	}
}
