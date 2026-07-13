/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurant.facade;

/**
 *
 * @author SMART_CLOUD
 */
public class RestaurantFacade {

    private Amplifier amplifier;
    private Projector projector;
    private Screen screen;
    private TheaterLights lights;
    private PopcornPopper popcornPopper;

    public RestaurantFacade(Amplifier amplifier,
                            Projector projector,
                            Screen screen,
                            TheaterLights lights,
                            PopcornPopper popcornPopper) {

        this.amplifier = amplifier;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie() {

        System.out.println("\nPreparing movie mode...\n");

        popcornPopper.on();
        popcornPopper.pop();

        lights.dim(20);

        screen.down();

        projector.on();
        projector.wideScreenMode();

        amplifier.on();
        amplifier.setVolume(8);

        System.out.println("\nMovie mode is ready!\n");
    }

    public void endMovie() {

        System.out.println("\nShutting down movie mode...\n");

        popcornPopper.off();

        lights.on();

        screen.up();

        projector.off();

        amplifier.off();

        System.out.println("\nMovie mode ended.\n");
    }
}

