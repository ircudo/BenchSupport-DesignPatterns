package client;

import model.*;

public class Main {
    public static void main(String[] args) {
        testHierarchy();
    }
    private static void testHierarchy() {
        // create child
        Child charlie = new Child("Charlie");
        // create parent (father)
        Parent bob = new Parent("Bob");
        // create parent (mother)
        Parent karen = new Parent("Karen");

        // add both parents to child
        charlie.addParent(bob);
        charlie.addParent(karen);

        // add child to both parents
        bob.addChild(charlie);
        karen.addChild(charlie);

        // create grandparent
        GrandParent todd = new GrandParent("Todd");
        // add child to grandparent
        todd.addChild(bob);
        // add parent to grandparent's child
        bob.addParent(todd);

        // print grandparent
        todd.print();
        // print parent
        bob.print();
        // print child
        charlie.print();
    }
}
