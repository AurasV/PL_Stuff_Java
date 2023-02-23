/**
 * 1211EC / Homework nr 5
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Lab5HwEx1Circle {

    private int x;
    private int y;
    private double radius;

    public Lab5HwEx1Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    // calculate and return the circumference of the circle
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Lab5HwEx1Circle circle = new Lab5HwEx1Circle(0, 0, 5);

        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}
