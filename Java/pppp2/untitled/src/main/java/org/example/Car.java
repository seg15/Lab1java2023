package org.example;

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private String model;
    private String transmission;
    private String color;

    public Car(String brand, String model, String transmission, String color) {
        this.brand = brand;
        this.model = model;
        this.transmission = transmission;
        this.color = color;
    }

    // Getters and setters (optional, depending on your needs)

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", transmission='" + transmission + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}