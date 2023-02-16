# Abstract Factory

- Is one of the Creational patterns.

## Project Steps

1. Create packages `model` and `abstractfactory`
2. In `model` package:
   a. create abstract class Food
   b. create concrete class Salad that extends Food
   c. create concrete class Meat that extends Food
3. In `abstractfactory` package:
   a. create interface `FoodAbstractFactory`
    - Note that `createFood()` method returns an instance of super class `Food`
   b. Implement interfaces:
    - `SaladFactory`
    - `MeatFactory`
   c. create a consumer class that will provide the entry point for the client classes to create subclasses
    - `FoodFactory`
    - note that it is a simple class and `getFood()` method accepts `FoodAbstractFactory` argument and returns `Food`
4. Write `TestDesignPatters` 
    - to see how to use abstract factory to get instance of subclasses
 
