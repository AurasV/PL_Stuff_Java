/**
 * 1211EC / Lab7
 * @author Frimu Aurel-Viorel
 * @version 16.1.2022
 */
public class Complex
{
    private double re;
    private double im;

    public Complex()
    {
        this.re = 0;
        this.im = 0;
    }

    public Complex(double re, double im)
    {
        this.re = re;
        this.im = im;
    }
    public Complex add(Complex a, Complex b)
    {
        Complex c = new Complex();
        c.re = a.re + b.re;
        c.im = a.im + b.im;
        return c;
    }
    public Complex sub(Complex a, Complex b)
    {
        Complex c = new Complex();
        c.re = a.re - b.re;
        c.im = a.im - b.im;
        return c;
    }
    public Complex mul(Complex a, Complex b)
    {
        Complex c = new Complex();
        c.re = a.re * b.re - a.im * b.im;
        c.im = a.re * b.im + a.im * b.re;
        return c;
    }
    public Complex div(Complex a, Complex b)
    {
        Complex c = new Complex();
        c.re = (a.re * b.re + a.im * b.im) / (b.re * b.re + b.im * b.im);
        c.im = (a.im * b.re - a.re * b.im) / (b.re * b.re + b.im * b.im);
        return c;
    }
    public void tupleFormat()
    {
        System.out.println("(" + this.re + ", " + this.im + "*i)");
    }

    public double getRe()
    {
        return re;
    }
    public void setRe(double re)
    {
        this.re = re;
    }
    public double getIm()
    {
        return im;
    }
    public void setIm(double im)
    {
        this.im = im;
    }
}
