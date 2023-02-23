/**
 * 1211EC / Lab7
 * @author Frimu Aurel-Viorel
 * @version 16.1.2022
 */
public class TestComplex
{
    public static void main(String[] args)
    {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(4, 5);
        Complex c = new Complex();
        c = c.add(a, b);
        c.tupleFormat();
        c = c.sub(a, b);
        c.tupleFormat();
        c = c.mul(a, b);
        c.tupleFormat();
        c = c.div(a, b);
        c.tupleFormat();
    }
}