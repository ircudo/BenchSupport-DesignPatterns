package factory;

import model.*;

public class ItalianFoodFactory implements FoodFactory {

    @Override
    public Food createFood(String name, String type) {
        if (type.equals("pasta")) {
            return new Pasta(name, "Italian");
        } else if (type.equals("pizza")) {
            return new Pizza(name, "Italian");
        } else {
            return null;
        }
    }
}
