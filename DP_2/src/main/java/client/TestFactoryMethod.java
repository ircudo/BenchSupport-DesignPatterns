package client;

import factory.*;
import model.*;

public class TestFactoryMethod {
    public static void main(String[] args) {
        testFactoryMethod();
    }
    private static void testFactoryMethod() {
        // create instance of factory
        MotorVehicleFactory factory = new MotorVehicleFactory();

        // create vehicle Car using factory, build it
       MotorVehicle vehicle1 =  factory.create("Car");
       MotorVehicle vehicle2 =  factory.create("Motorcycle");

        // create vehicle Motorcycle using factory, build it
        vehicle1.build();
        vehicle2.build();

    }
}
