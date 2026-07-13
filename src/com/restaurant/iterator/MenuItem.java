/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurant.iterator;

/**
 *
 * @author SMART_CLOUD
 */
public class MenuItem {

    private String name;
    private String description;
    private double price;

    // constructor
    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // getter methods
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name: " + name
                + "\nDescription: " + description
                + "\nPrice: $" + price;
    }
}
