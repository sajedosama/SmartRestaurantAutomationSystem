/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurant.state;

/**
 *
 * @author SMART_CLOUD
 */
public class HasQuarterState implements State {

    private RestaurantKiosk kiosk;

    public HasQuarterState(RestaurantKiosk kiosk) {
        this.kiosk = kiosk;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter already inserted.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned.");
        kiosk.setState(kiosk.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Processing your order...");
        kiosk.setState(kiosk.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("Please wait...");
    }
}
