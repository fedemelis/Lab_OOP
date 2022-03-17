package esercizi.oop;

import java.awt.*;

/**
 * Write a class named Polygon representing an irregular polygon.
 * Internally, the class represents an irregular polygon as an array of 2d points (vertices).
 *
 * Supported methods:
 * int getVerticesNumber() - returns the number of vertices
 * Point[] getVertices() - returns the array of vertices
 * void move(Point movement) - moves the polygon as specified by movement (treated as a vector)
 * double getArea() - returns the area of the polygon, computed using the formula that cna be found here
 * (https://arachnoid.com/area_irregular_polygon/index.html)
 *
 * @author Nicola Bicocchi
 */
public class Polygon {

    Point vertices[];

    public Polygon(Point[] vertici) {
        this.vertices = vertici;
    }

    public Point[] getVertices() {
        return vertices;
    }

    public void setVertices(Point[] p) {
        this.vertices = vertices;
    }

    public int getVerticesNumber(){
        return vertices.length;
    }

    public void move(Point movement){
        for(Point p : vertices){
            p.setLocation(p.getX() + movement.getX(), p.getY() + movement.getY());
        }
    }

    public double getArea(){
        double sum = 0;
        for (int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % vertices.length;
            sum += (vertices[i].x * vertices[next].y) - (vertices[i].y * vertices[next].x);
        }
        return sum / 2.0;
    }


}
