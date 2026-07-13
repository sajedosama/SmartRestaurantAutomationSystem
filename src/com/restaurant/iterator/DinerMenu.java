/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurant.iterator;

import java.util.Iterator;

/**
 *
 * @author SMART_CLOUD
 */
public class DinerMenu implements Menu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "Bacon with lettuce & tomato on whole wheat",
                9.49);

        addItem("BLT",
                "Bacon with lettuce & tomato on white bread",
                8.99);

        addItem("Soup of the Day",
                "Soup served with potato salad",
                7.99);
    }

    public void addItem(String name, String description, double price) {

        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Menu is full!");
            return;
        }

        menuItems[numberOfItems]
                = new MenuItem(name, description, price);

        numberOfItems++;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
