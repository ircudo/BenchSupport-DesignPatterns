package factory;

import model.*;

public class MotorVehicleFactory {
    public MotorVehicle create(String type) {
        if (type.isBlank()) {
            return null;
        }
        switch (type) {
            case "Car":
                return new Car();
            case "Motorcycle":
                return new Motorcycle();
            default:
                throw new IllegalArgumentException("Unknown type");
        }
    }
}
