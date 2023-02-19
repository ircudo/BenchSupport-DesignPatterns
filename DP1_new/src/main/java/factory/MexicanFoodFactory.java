package factory;

import model.*;

public class MexicanFoodFactory implements FoodFactory {
    @Override
    public Food createFood(String name, String type) {
        if (type.equals("pasta")) {
            return null;
        } else if (type.equals("pizza")) {
            return new Pizza(name, "Mexican");
        } else {
            return null;
        }
    }
}
