package test;

import test.Car;

public class SDcar extends Car {

    boolean isSD;

    public SDcar(String color, String brand, boolean isOn, boolean isSD) {
        super(color, brand, isOn);
        this.isSD = isSD;
    }
}
