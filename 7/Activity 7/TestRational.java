/**
 * 1211EC / Lab7
 * @author Frimu Aurel-Viorel
 * @version 16.1.2022
 */
public class TestRational
{
    public static void main(String[] args)
    {
        Rational a = new Rational(2,4);
        Rational b = new Rational(4,6);
        Rational c = new Rational();
        c = c.add(a,b);
        c.intFormat();
        c.realFormat();
        c = c.sub(a,b);
        c.intFormat();
        c.realFormat();
        c = c.mult(a,b);
        c.intFormat();
        c.realFormat();
        c = c.div(a,b);
        c.intFormat();
        c.realFormat();
    }
}
