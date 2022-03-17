package esercizi;

import java.awt.*;

/**
 * Write a Java class representing a Circle (Point center, int radius) capable of moving on a 2D plane
 * Methods:
 * double getArea()
 * double getPerimeter()
 * double moveUp()
 * double moveDown()
 * double moveLeft()
 * double moveRight()
 * boolean contains(Point point)
 *
 * @author Nicola Bicocchi
 */

public class Circle {

    Point center;
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * (getRadius() * getRadius());
    }

    public double getPerimeter(){
        return (2 * Math.PI) * getRadius();
    }

    public void moveUp(){
        center.setLocation(center.getX(), center.getY() + 1);
    }
    public void moveDown(){
        center.setLocation(center.getX(), center.getY() - 1);
    }
    public void moveLeft(){
        center.setLocation(center.getX() - 1, center.getY());
    }
    public void moveRight(){
        center.setLocation(center.getX() + 1, center.getY());
    }

    public boolean contains(Point p){
        if (center.distance(p)  < getRadius()){
           return true;
        }
        return false;
    }
}