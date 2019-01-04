package com.citi.gce.gls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EntityScan(value="com.citi.gce.gls.entities")

public class LiquiditySharingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiquiditySharingApplication.class, args);
	}
	
	

}

