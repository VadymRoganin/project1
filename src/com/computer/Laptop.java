package com.computer;

public class Laptop extends Computer {

    Mouse mouse;

    public Laptop(Mouse mouse, String name) {
        this.cpu = new CPU("Laptop CPU");
        this.mouse = mouse;
        this.name = name;
    }

    public Laptop(String name) {
        cpu = new CPU("Laptop CPU");

        this.name = name;
    }

    public void turnOn() {
        startCPU();
        System.out.println("Computer turned on with name: " + name);
    }
}


