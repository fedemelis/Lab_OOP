package esercizi.oop.shape;

import java.awt.Rectangle;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Circle extends Shape {
    Point center;
    double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    double getArea() {
        return (radius*radius)*Math.PI;
    }

    @Override
    double getPerimeter() {
        return (Math.PI*2)*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
