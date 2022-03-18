package esercizi.oop.geometricobject;

import java.awt.*;

public class Rectangle implements Resizable, GeometricObject, Movable{
    Point bottomR;
    Point upperL;

    public Rectangle(Point bottomR, Point upperL) {
        this.bottomR = bottomR;
        this.upperL = upperL;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "bottomR=" + bottomR +
                ", upperL=" + upperL +
                '}';
    }

    @Override
    public double getArea() {
        double base = Math.abs(bottomR.x) - Math.abs(upperL.x);
        double altezza = Math.abs(upperL.y) - Math.abs(bottomR.y);
        return base * altezza;
    }

    @Override
    public double getPerimeter() {
        double base = Math.abs(bottomR.x) - Math.abs(upperL.x);
        double altezza = Math.abs(upperL.y) - Math.abs(bottomR.y);
        return (base + altezza) * 2;
    }

    @Override
    public void move(Point p) {
        bottomR.x += p.x;
        bottomR.y += p.y;
        upperL.x += p.x;
        upperL.y += p.y;
    }

    @Override
    public void resize(double d) {
        bottomR.x += d;
        bottomR.y += d;
    }
}
