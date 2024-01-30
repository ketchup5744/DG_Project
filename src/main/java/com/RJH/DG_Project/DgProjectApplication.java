package com.RJH.DG_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DgProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DgProjectApplication.class, args);
	}

}
