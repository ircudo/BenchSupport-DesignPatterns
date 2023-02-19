package model;

public class Pizza extends Food {
    public Pizza(String name, String type) {
        super(name, type);
    }

    @Override
    public void cook() {
        System.out.println("Cooking " + name + " pizza.");
    }
}
