package com.computer;

public class CPU {
    String model;

    public CPU(String model) {
        this.model = model;
    }

    public void start() {
        System.out.println("CPU started, model: " + model);
    }
}