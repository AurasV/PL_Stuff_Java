/**
 * 1211EC / Homework nr 8
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Circle extends Point {
    int radius;

    public Circle() {
        // default constructor
    }

    public Circle(int r, int a, int b) {
        super(a, b);
        this.radius = r;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    @Override
    public double computeArea() {
        // return area of circle
        return Math.PI * radius * radius;
    }

    @Override
    public double computeVolume() {
        // return volume of circle (0 for 2D shapes)
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
