package esercizi.oop;

/**
 * Write a class representing a Triangle
 * Methods:
 * double getArea()
 * double getPerimeter()
 *
 * @author Nicola Bicocchi
 */
public class Triangle {
    double width;
    double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return (getHeight() * getWidth())/2;
    }

    public double getPerimeter(){
        return getWidth() + Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getWidth() / 2, 2)) * 2;
    }
}
