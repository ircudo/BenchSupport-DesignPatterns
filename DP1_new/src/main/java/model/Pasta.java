package model;

public class Pasta extends Food {
    public Pasta(String name, String type) {
        super(name, type);
    }

    @Override
    public void cook() {
        System.out.println("Cooking " + name + " pasta.");
    }
}
