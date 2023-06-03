package br.com.javaevan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"br.com.javaevan"})
@ComponentScan(basePackages = "br.com.*")
@EntityScan("br.com.javaevan.entities")
public class JavaevanApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaevanApplication.class, args);
	}

}
