/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurant.state;

/**
 *
 * @author SMART_CLOUD
 */
public class SoldState implements State {

    private RestaurantKiosk kiosk;

    public SoldState(RestaurantKiosk kiosk) {
        this.kiosk = kiosk;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, your order is being prepared.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, order already in progress.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You already turned the crank.");
    }

    @Override
    public void dispense() {

        kiosk.releaseItem();

        if (kiosk.getCount() == 0) {

            System.out.println("Sorry, the kiosk is sold out.");
            kiosk.setState(kiosk.getSoldOutState());

        } else {

            int random = (int) (Math.random() * 10);

            if (random == 0 && kiosk.getCount() > 1) {

                kiosk.setState(kiosk.getWinnerState());

            } else {

                kiosk.setState(kiosk.getNoQuarterState());
            }
        }
    }
}
