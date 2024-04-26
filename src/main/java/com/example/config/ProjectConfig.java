package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
	Spring @Configuration annotation is part of the spring core framework.
	Spring Configuration annotation indicates that the class has @Bean definition
	methods. So Spring container can process the class and generate Spring Beans
	to be used in the application.
*/

@Configuration
public class ProjectConfig {

    /*
     * @Bean annotation, which lets Spring know that it needs to call this method
     * when it initializes its context and adds the returned value to the context.
     */

    // Default Bean annotation
    @Bean
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    // Different ways of naming a Bean
    @Bean(name = "audiVehicle")
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean(value = "porscheVehicle")
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Porsche");
        return veh;
    }

    @Bean("ferrariVehicle")
    Vehicle vehicle4() {
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

    // Primary annotation
    @Primary
    @Bean("corollaVehicle")
    Vehicle vehicle5() {
        var veh = new Vehicle();
        veh.setName("Toyota Corolla");
        return veh;
    }
    /*
     * The method names usually follow verbs notation.But for methods which we will
     * use to create beans, can use nouns as names. This will be a good practise as
     * the method names will become bean names as well in the context.
     */
}