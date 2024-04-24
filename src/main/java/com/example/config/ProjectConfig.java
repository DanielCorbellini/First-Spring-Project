package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.beans.Vehicle;

@Configuration
public class ProjectConfig {

	@Bean
	Vehicle vehicle() {
		var veh = new Vehicle();
		veh.setName("Audi 8");
		return veh;
	}

}
