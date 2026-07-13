/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurant.state;

/**
 *
 * @author SMART_CLOUD
 */
public class WinnerState implements State {

    private RestaurantKiosk kiosk;

    public WinnerState(RestaurantKiosk kiosk) {
        this.kiosk = kiosk;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we are already preparing your order.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already ordered.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning again won't get another prize.");
    }

    @Override
    public void dispense() {

        System.out.println("Congratulations! You won a free extra meal!");

        kiosk.releaseItem();

        if (kiosk.getCount() == 0) {
            kiosk.setState(kiosk.getSoldOutState());
            return;
        }

        kiosk.releaseItem();

        if (kiosk.getCount() > 0) {
            kiosk.setState(kiosk.getNoQuarterState());
        } else {
            kiosk.setState(kiosk.getSoldOutState());
        }
    }
}
