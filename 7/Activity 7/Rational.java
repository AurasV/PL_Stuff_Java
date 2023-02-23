/**
 * 1211EC / Lab7
 * @author Frimu Aurel-Viorel
 * @version 16.1.2022
 */
public class Rational {
    private int num;
    private int den;
    public Rational() {
        num = 0;
        den = 1;
    }
    public Rational(int num, int den) {
        this.num = num / cmmdc(num, den);
        this.den = den / cmmdc(num, den);
    }
    public static int cmmdc(int num, int den) {
        int r;
        while (den != 0) {
            r = num % den;
            num = den;
            den = r;
        }
        return num;
    }
    public Rational add(Rational a, Rational b) {
        Rational c = new Rational();
        c.num = a.num * b.den + b.num * a.den;
        c.den = a.den * b.den;
        return c;
    }
    public Rational sub(Rational a, Rational b) {
        Rational c = new Rational();
        c.num = a.num * b.den - b.num * a.den;
        c.den = a.den * b.den;
        return c;
    }
    public Rational mult(Rational a, Rational b) {
        Rational c = new Rational();
        c.num = a.num * b.num;
        c.den = a.den * b.den;
        return c;
    }
    public Rational div(Rational a, Rational b) {
        Rational c = new Rational();
        c.num = a.num * b.den;
        c.den = a.den * b.num;
        return c;
    }
    public void intFormat()
    {
        System.out.println(num + "/" + den);
    }
    public void realFormat()
    {
        System.out.println((double)num / den);
    }
    public int getNumerator()
    {
        return num;
    }
    public void setNumerator(int numerator)
    {
        this.num = numerator;
    }
    public int getDenominator()
    {
        return den;
    }
    public void setDenominator(int denominator)
    {
        this.den = denominator;
    }
}
