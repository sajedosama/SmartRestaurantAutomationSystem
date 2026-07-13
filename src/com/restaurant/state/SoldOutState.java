/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurant.state;

/**
 *
 * @author SMART_CLOUD
 */
public class SoldOutState implements State {

    private RestaurantKiosk kiosk;

    public SoldOutState(RestaurantKiosk kiosk) {
        this.kiosk = kiosk;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Machine is sold out.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarter inserted.");
    }

    @Override
    public void turnCrank() {
        System.out.println("No items available.");
    }

    @Override
    public void dispense() {
        System.out.println("Nothing to dispense.");
    }
}
