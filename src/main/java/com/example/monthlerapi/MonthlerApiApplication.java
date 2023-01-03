package com.example.monthlerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing	//jpa Auddit 적용
public class MonthlerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonthlerApiApplication.class, args);
	}

}
