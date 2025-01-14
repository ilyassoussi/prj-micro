package org.MrDigital.invontery_config;

import org.MrDigital.invontery_config.dao.ProductDAO;
import org.MrDigital.invontery_config.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class InvonteryConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvonteryConfigApplication.class, args);
	}

//	@Bean
//	CommandLineRunner start(ProductDAO productDAO){
//		return args -> {
//			productDAO.saveAll(
//				List.of(
//						Product.builder().qte(2).price(1500).name("phone").build(),
//						Product.builder().qte(30).price(15006666).name("art").build(),
//						Product.builder().qte(5555).price(15008).name("test").build()
//				));
//			productDAO.findAll().forEach(System.out::println);
//		};
//	}

}
