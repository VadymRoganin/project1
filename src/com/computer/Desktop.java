package com.computer;

public class Desktop extends Computer {

    Mouse mouse;
    Display display;

    public Desktop(Mouse mouse, Display display, String name) {
        cpu = new CPU("Desktop CPU");
        this.mouse = mouse;
        this.display = display;
        this.name = name;
    }

    public Desktop(String name) {
        cpu = new CPU("Desktop CPU");
        this.name = name;
    }

    public void turnOn() {
        startCPU();
        System.out.println("Computer turned on with name: " + name);
    }
}
