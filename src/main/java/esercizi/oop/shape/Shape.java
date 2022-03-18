package esercizi.oop.shape;

public abstract class Shape {
    String color;
    boolean filled;

    public Shape(){
        color = "";
        filled = false;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled(){
        if (filled){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
