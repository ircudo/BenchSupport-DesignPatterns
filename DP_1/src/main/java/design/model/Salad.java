package design.model;

public class Salad extends Food {

    private float weight;
    private int calories;

    public Salad(float weight, int calories) {
        this.weight = weight;
        this.calories = calories;
    }

    @Override
    public float getWeight() {
        return this.weight;
    }

    @Override
    public int getCalories() {
        return this.calories;
    }
}
