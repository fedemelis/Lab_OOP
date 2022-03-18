package oop;

import org.junit.jupiter.api.Test;
import java.awt.*;
import esercizi.oop.Polygon;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolygonTest {

    @Test
    public void getVerticesNumber() {
        Point[] vertices = {new Point(0,0), new Point(10, 0), new Point(10, 10)};
        Polygon p = new Polygon(vertices);
        assertEquals(3, p.getVerticesNumber());
    }

    @Test
    public void getVertices() {
        Point[] vertices = {new Point(0,0), new Point(10, 0), new Point(10, 10)};
        Polygon p = new Polygon(vertices);
        assertEquals(new Point(0, 0), p.getVertices()[0]);
        assertEquals(new Point(10, 0), p.getVertices()[1]);
        assertEquals(new Point(10, 10), p.getVertices()[2]);
    }

    @Test
    public void move() {
        Point[] vertices = {new Point(0,0), new Point(10, 0), new Point(10, 10)};
        Polygon p = new Polygon(vertices);
        p.move(new Point(-5, -5));
        assertEquals(new Point(-5, -5), p.getVertices()[0]);
        assertEquals(new Point(5, -5), p.getVertices()[1]);
        assertEquals(new Point(5, 5), p.getVertices()[2]);
    }

    @Test
    public void getArea() {
        Point[] vertices = {new Point(0,0), new Point(10, 0), new Point(10, 10)};
        Polygon p = new Polygon(vertices);
        assertEquals(50.0, p.getArea(), 0.01);
    }
}