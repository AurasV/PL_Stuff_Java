/**
 * 1211EC / Homework nr 8
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
import java.util.Arrays;

public class FormTest {
    public static void main(String[] args) {
        Form[] forms = new Form[3];
        forms[0] = new Point(0, 0);
        forms[1] = new Circle(10, 0, 0);
        forms[2] = new Cylinder(10, 5, 0, 0);

        for (Form form : forms) {
            System.out.println("Area: " + form.computeArea());
            System.out.println("Volume: " + form.computeVolume());
            System.out.println(form);
        }
    }
}
