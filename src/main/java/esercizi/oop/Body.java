package esercizi.oop;
/**
 * Implement a Body class representing a two-dimensional body (x, y) capable of moving with a certain speed (vx, vy).
 *
 * The class implements three constructors:
 * Body() - Setting x = y = vy = vy = 0
 * Body(x, y) Setting x, y as specified and vx = vy = 0
 * Body(x, y, vx, vy) Setting x, y, vx, vy as specified
 *
 * The class have also to implement the following methods:
 * getters and setters for x, y, vx, vy
 * progress(t) updating x, y considering a constant movement at velocity vx, vy for t seconds
 * toString() printing x, y, vx, vy
 *
 * @author Nicola Bicocchi
 */
public class Body {
    double x;
    double y;
    double vx;
    double vy;

    public Body(){
        x = 0;
        y = 0;
        vx = 0;
        vy = 0;
    }

    public Body(double x, double y){
        this.x = x;
        this.y = y;
        vx = 0;
        vy = 0;
    }

    public Body(double x, double y, double vx, double vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getVx() {
        return vx;
    }

    public void setVx(double vx) {
        this.vx = vx;
    }

    public double getVy() {
        return vy;
    }

    public void setVy(double vy) {
        this.vy = vy;
    }

    public void progress(double t){
        setX(getVx() * t);
        setY(getVy() * t);
    }

    public void setSpeed(double vx, double vy) {
       setVx(vx);
       setVy(vy);
    }

    @Override
    public String toString() {
        return "Body{" +
                "x=" + x +
                ", y=" + y +
                ", vx=" + vx +
                ", vy=" + vy +
                '}';
    }
}
