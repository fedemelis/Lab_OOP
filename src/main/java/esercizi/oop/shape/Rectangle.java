package esercizi.oop.shape;

import java.awt.*;

public class Rectangle extends Shape {
    Point upperLeft;
    Point bottomRight;

    public Rectangle(Point upperLeft, Point bottomRight) {
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }


    @Override
    double getArea() {
        double base = Math.abs(bottomRight.x) - Math.abs(upperLeft.x);
        double altezza = Math.abs(upperLeft.y) - Math.abs(bottomRight.y);
        return Math.abs(base * altezza);
    }

    @Override
    double getPerimeter() {
        double base = Math.abs(bottomRight.x) - Math.abs(upperLeft.x);
        double altezza = Math.abs(upperLeft.y) - Math.abs(bottomRight.y);
        return Math.abs((Math.abs(base) + Math.abs(altezza))*2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "upperLeft=" + upperLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
