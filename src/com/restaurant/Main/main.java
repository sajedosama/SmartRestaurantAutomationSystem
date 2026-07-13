package com.restaurant.Main;

import com.restaurant.iterator.*;
//import com.restaurant.iterator.DinerMenu;
//import com.restaurant.iterator.PancakeHouseMenu;
//import com.restaurant.iterator.Waitress;
import com.restaurant.templatemethod.*;
//import com.restaurant.templatemethod.Coffee;
//import com.restaurant.templatemethod.Tea;
//import com.restaurant.templatemethod.CaffeineBeverage;
import com.restaurant.facade.*;
//import com.restaurant.facade.Amplifier;
//import com.restaurant.facade.PopcornPopper;
//import com.restaurant.facade.Projector;
//import com.restaurant.facade.RestaurantFacade;
//import com.restaurant.facade.Screen;
//import com.restaurant.facade.TheaterLights;
import com.restaurant.state.RestaurantKiosk;
import com.restaurant.adapter.*;

/**
 *
 * @author SMART_CLOUD
 */
public class main {

    public static void main(String[] args) {
        // Iterator testing block of code
        /*
                {
        
        System.err.println("Iterator testing block of code");
        PancakeHouseMenu pancakeMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeMenu, dinerMenu);

        waitress.printMenu();
    }*/
                
                /*
        // Template method testing block of code
        {
        System.err.println("Template method testing block of code");
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        System.out.println("===== Coffee =====");
        coffee.prepareRecipe();

        System.out.println();

        System.out.println("===== Tea =====");
        tea.prepareRecipe();
    }
        */
    /*
        //Facade testing block of code
        {
        System.err.println("Facade testing block of code");
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popcorn = new PopcornPopper();

        RestaurantFacade restaurant = new RestaurantFacade(
                amplifier,
                projector,
                screen,
                lights,
                popcorn
        );

        restaurant.watchMovie();

        restaurant.endMovie();
    }
                */
    
        // state testing block of code
        
        {
        System.err.println("state testing block of code");

        RestaurantKiosk kiosk = new RestaurantKiosk(2);

        kiosk.insertQuarter();
        kiosk.turnCrank();

        System.out.println();

        kiosk.insertQuarter();
        kiosk.turnCrank();

        System.out.println();

        kiosk.insertQuarter();
        }
        

        // adapter testing block of code
        {
        System.err.println("adapter testing block of code");

        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        
        System.out.println("Duck:");

        duck.quack();
        
        duck.fly();

        System.out.println("Turkey through Adapter:");

        turkeyAdapter.quack();
        
        turkeyAdapter.fly();
        }
        

        
        /*
        /// complete senario 
        System.err.println("A complete scenario for a customer's visit to the restaurant");
        System.out.println("==========================================");
        System.out.println(" SMART RESTAURANT AUTOMATION SYSTEM");
        System.out.println("==========================================");

        // ===================================================
        // Iterator Pattern
        // ===================================================
        System.out.println("\nCustomer enters the restaurant.");

        PancakeHouseMenu pancakeMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeMenu, dinerMenu);

        System.out.println("\nAvailable Menus:");
        waitress.printMenu();

        // ===================================================
        // Template Method Pattern
        // ===================================================
        System.out.println("\nCustomer orders a coffee.");

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        // ===================================================
        // State Pattern
        // ===================================================
        System.out.println("\nCustomer pays using the self-service kiosk.");

        RestaurantKiosk kiosk = new RestaurantKiosk(3);

        kiosk.insertQuarter();
        kiosk.turnCrank();

        // ===================================================
        // Adapter Pattern
        // ===================================================
        System.out.println("\nRestaurant communicates with an external supplier.");

        Turkey turkey = new WildTurkey();

        Duck adapter = new TurkeyAdapter(turkey);

        adapter.quack();
        adapter.fly();

        // ===================================================
        // Facade Pattern
        // ===================================================
        System.out.println("\nPreparing the smart dining room...");

        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popcorn = new PopcornPopper();

        RestaurantFacade facade = new RestaurantFacade(
                amplifier,
                projector,
                screen,
                lights,
                popcorn);

        facade.watchMovie();

        System.out.println("\nCustomer enjoys the experience.");

        facade.endMovie();

        System.out.println("\n==========================================");
        System.out.println(" THANK YOU FOR VISITING OUR RESTAURANT");
        System.out.println("==========================================");
*/
    }

}
