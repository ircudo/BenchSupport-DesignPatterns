package model;

public interface Human {
    String getName();
    void addChild(Human child);
    void addParent(Human parent);
    void print();
}
