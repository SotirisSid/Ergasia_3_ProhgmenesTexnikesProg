package gr.upatras.rest.messenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
@SpringBootApplication 
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
