package com.computer;

public class Main {

    public static void main(String[] args) {
//        Mouse mouse = new Mouse("Logitech mouse");
        Laptop laptop = new Laptop("myLaptop");
        laptop.turnOn();

        Desktop desktop = new Desktop("myDesktop");
        desktop.turnOn();
    }
}
