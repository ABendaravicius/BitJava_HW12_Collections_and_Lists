package com.arnas.app;

import java.util.*;

class Product {
    private String name;
    private String color;
    private double price;

    public Product(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return color + " " + name + " : " + price + " €";
    }

    @Override
    public int hashCode() {
        int hash = name.hashCode() + color.hashCode();
        int priceInt = (int) this.price * 100;
        hash = hash * 31 + priceInt;
        return hash;
    }

    public boolean equals(Object p) {
        if (this == p) return true;
        if (p == null) return false;
        if (this.getClass() != p.getClass()) return false;
        Product product = (Product) p;
        return this.name.equals(product.name) && this.color.equals(product.color) && this.price == product.price;
    }
}

public class Collections {
    public static void main(String[] args) {
        ArrayList<Product> shoppingList = new ArrayList<>();
        shoppingList.add(new Product("apple", "red", 0.15));
        shoppingList.add(new Product("apple", "green", 0.19));
        shoppingList.add(new Product("apple", "green", 0.19));
        shoppingList.add(new Product("milk", "white", 0.90));
        shoppingList.add(new Product("sugar", "white", 0.80));
        shoppingList.add(new Product("bread", "dark", 1.10));
        shoppingList.add(new Product("bread", "dark", 1.10));
        shoppingList.add(new Product("joghurt", "pink", 1.30));
        System.out.println("Shopping list before filtering: " + shoppingList.toString());

        // Unique item filtering using HashSet
        HashSet<Product> hs = new HashSet<Product>(shoppingList);
        System.out.println("Shopping list after Hash Set filtering: " + hs);

        // Unique item filtering using enhanced for loop
        ArrayList<Product> filteredList = new ArrayList<>();
        for (Product item : shoppingList) {
            if (!filteredList.contains(item)) {
                filteredList.add(item);
            }
        }
        System.out.println("Shopping list after enhanced for loop filtering: " + filteredList.toString());

        System.out.println("-------------------------");
        System.out.println("");
        System.out.println("Priority Queue");

        Queue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add(7);
        pQueue.add(17);
        pQueue.add(47);
        pQueue.add(27);
        pQueue.add(67);
        pQueue.add(37);
        System.out.println(pQueue);

        for (Integer i : pQueue) {
            System.out.println(i);
        }
    }
}
