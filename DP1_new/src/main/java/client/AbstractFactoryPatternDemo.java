package client;

import factory.*;
import model.*;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        testAbstractFactoryPattern();
    }

    private static void testAbstractFactoryPattern() {
        FoodFactory italianFactory = new ItalianFoodFactory();
        FoodFactory mexicanFactory = new MexicanFoodFactory();

        Food spaghetti = italianFactory.createFood("spaghetti", "pasta");
        Food margherita = italianFactory.createFood("margherita", "pizza");
        Food chickenFajita = mexicanFactory.createFood("chicken fajita", "pizza");

        spaghetti.cook();
        margherita.cook();
        chickenFajita.cook();
    }
}
