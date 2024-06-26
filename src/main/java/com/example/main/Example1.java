package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context is: " + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Vehicles
        Vehicle veh1 = context.getBean("vehicle1", Vehicle.class);
        System.out.println("Vehicle1 name from Spring Context is: " + veh1.getName());

        Vehicle veh2 = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Vehicle2 name from Spring Context is: " + veh2.getName());

        Vehicle veh3 = context.getBean("porscheVehicle", Vehicle.class);
        System.out.println("Vehicle3 name from Spring Context is: " + veh3.getName());

        Vehicle veh4 = context.getBean("ferrariVehicle", Vehicle.class);
        System.out.println("Vehicle3 name from Spring Context is: " + veh4.getName());

        Vehicle veh5 = context.getBean(Vehicle.class);
        System.out.println("Primary Vehicle name from Spring Context is: " + veh5.getName());

        /*
         * We don’t need to do any explicit casting while fetching a bean from context.
         * Spring is smart enough to look for a bean of the type you requested in its
         * context. If such a bean doesn’t exist,Spring will throw an exception.
         */
    }
}