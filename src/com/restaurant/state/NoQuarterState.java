/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurant.state;

/**
 *
 * @author SMART_CLOUD
 */
public class NoQuarterState implements State {

    private RestaurantKiosk kiosk;

    public NoQuarterState(RestaurantKiosk kiosk) {
        this.kiosk = kiosk;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter inserted.");
        kiosk.setState(kiosk.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarter to eject.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Insert a quarter first.");
    }

    @Override
    public void dispense() {
        System.out.println("Payment required.");
    }
}
