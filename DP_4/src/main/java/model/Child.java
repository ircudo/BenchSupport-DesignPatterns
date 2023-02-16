package model;

import java.util.*;

public class Child implements Human {

    String name;

    private List<Human> parents = new ArrayList<>();

    public Child(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addChild(Human child) {

    }

    @Override
    public void addParent(Human parent) {
        parents.add(parent);
    }

    @Override
    public void print() {
        System.out.println("==============================");
        System.out.println("Name : " + getName());
        System.out.println("Parents :");
        for (Human parent : parents) {
            System.out.println("  - Name : " + parent.getName());
        }
        System.out.println("==============================");
    }
}
