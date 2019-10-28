package com.cega.miniclonpastebin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MicrositioEmpleadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrositioEmpleadosApplication.class, args);
	}

}
