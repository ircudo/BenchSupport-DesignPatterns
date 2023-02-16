package model;

import java.util.*;

public class GrandParent implements Human {

    String name;

    private List<Human> children = new ArrayList<>();

    public GrandParent(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addChild(Human child) {
        children.add(child);
    }

    @Override
    public void addParent(Human parent) {

    }

    @Override
    public void print() {
        System.out.println("==============================");
        System.out.println("Name : " + getName());
        System.out.println("Children :");
        for (Human child: children) {
            System.out.println("  - Name : " + child.getName());
        }
        System.out.println("==============================");
    }
}
