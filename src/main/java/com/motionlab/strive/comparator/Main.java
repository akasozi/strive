package com.motionlab.strive.comparator;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
import java.util.ArrayList;

// TODO: Sort by Color
public class Main {

    public static void main(String args[]) {
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Kiwi","green",40));
        fruits.add(new Fruit("Banana","yellow",100));
        fruits.add(new Fruit("Apple","mixed green,red",120));
        fruits.add(new Fruit("Cherry","red",10));
        // Sort by Name!
        fruits.sort((Fruit f1,Fruit f2) -> f1.compareTo(f2));

        System.out.println("Using a Comparable Fruit class (sort by name): " + fruits);
    }

    private static class Fruit implements Comparable<Fruit> {
        private String name;
        private String color;
        private int quantity;

        public Fruit(String name, String color, int quantity) {
            this.name = name;
            this.color = color;
            this.quantity = quantity;
        }

        public String getName() {return name; }
        public String getColor() {return color; }
        public int getQuantity() {return quantity;}

        @Override
        public final int compareTo(Fruit f) {
            return this.name.compareTo(f.name);
        }

        @Override
        public String toString() {
            return this.name + ": " + this.color;
        }
    }
}
