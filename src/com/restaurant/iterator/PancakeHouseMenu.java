/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurant.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author SMART_CLOUD
 */
public class PancakeHouseMenu implements Menu {

    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("Pancake Breakfast",
                "Pancakes with eggs and toast",
                8.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                9.49);

        addItem("Waffles",
                "Waffles with maple syrup",
                7.99);
    }

    public void addItem(String name, String description, double price) {
        MenuItem item = new MenuItem(name, description, price);
        menuItems.add(item);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
