/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.restaurant.state;

/**
 *
 * @author SMART_CLOUD
 */
public interface State {

    // states
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
