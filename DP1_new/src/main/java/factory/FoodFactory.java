package factory;

import model.*;

public interface FoodFactory {
    public Food createFood(String name, String type);
}
