package test;

public class Car {

    String color;
    String brand;
    boolean isOn;

    public Car(String color, String brand, boolean isOn) {
        this.color = color;
        this.brand = brand;
        this.isOn = isOn;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    void turnOn(){
        isOn = true;
    }

    void turnOff(){
        isOn = false;
    }
}
