package design.model;

public class Meat extends Food {

    private float weight;
    private int calories;

    public Meat(float weight, int calories) {
        this.weight = weight;
        this.calories = calories;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public int getCalories() {
        return calories;
    }
}
