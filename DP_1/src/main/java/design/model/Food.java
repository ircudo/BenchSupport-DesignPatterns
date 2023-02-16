package design.model;

public abstract class Food {

    public abstract float getWeight();
    public abstract int getCalories();

    @Override
    public String toString() {
        return "Weight = " + getWeight() + ", calories = " + getCalories();
    }
}
