package tp.cloudServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigServer

public class CloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudServerApplication.class, args);
	}

}
