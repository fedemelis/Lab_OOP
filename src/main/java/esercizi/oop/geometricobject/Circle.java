package esercizi.oop.geometricobject;

import java.awt.*;

public class Circle implements GeometricObject, Movable, Resizable{
    Point center;
    double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return (radius*radius)*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return (Math.PI*2)*radius;
    }

    @Override
    public void move(Point p) {
        center.x = p.x;
        center.y = p.y;
    }

    @Override
    public void resize(double d) {
        radius += d;
    }
}
