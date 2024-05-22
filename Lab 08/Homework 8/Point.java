/**
 * 1211EC / Homework nr 8
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Point extends Form {
    int x, y;
    int a, b;

    public Point() {
        // default constructor
    }

    public Point(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setPoint(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double computeArea() {
        // return area of point (0 for 2D shapes)
        return 0;
    }

    @Override
    public double computeVolume() {
        // return volume of point (0 for 2D shapes)
        return 0;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
