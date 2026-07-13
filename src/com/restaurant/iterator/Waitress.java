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

    public class Waitress {

    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {

        System.out.println("PANCAKE MENU");
        printMenu(pancakeHouseMenu.createIterator());

        System.out.println("\nDINER MENU");
        printMenu(dinerMenu.createIterator());
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();

            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice());
            System.out.println("----------------");
        }
    }
}