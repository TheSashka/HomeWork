/**
 * Created by alexandrgribkov on 07.07.16.
 */
public class Complex
{
    public static void main(String []args)
    {
        Complex complex1 = new Complex(1.5, 1.3);
        Complex complex2 = new Complex(1.3, 2);
        Complex sum = complex1.sum(complex2);
        Complex sub = complex1.sub(complex2);
        Complex mul = complex1.mul(complex2);
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
    }


    private double real;
    private double imaginary;
    Complex()
    {

    }
    Complex(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }
    Complex(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setReal(int real)
    {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public void setImaginary(int imaginary)
    {
        this.imaginary = imaginary;
    }
    public Complex sum(Complex complex)
    {
        Complex temp = new Complex(0,0);
        temp.setReal(this.getReal() + complex.getReal());
        temp.setImaginary(this.getImaginary() + complex.getImaginary());
        return temp;
    }
    public Complex sub(Complex complex)
    {
        Complex temp = new Complex(0,0);
        temp.setReal(this.getReal() - complex.getReal());
        temp.setImaginary(this.getImaginary() - complex.getImaginary());
        return temp;
    }
    public Complex mul(Complex complex)
    {
        Complex temp = new Complex(0,0);
        temp.setReal(this.getReal() * complex.getReal() - this.getImaginary() * complex.getImaginary());
        temp.setImaginary(this.getImaginary() * complex.getReal() + this.getReal() * complex.getImaginary());
        return temp;
    }

    @Override
    public String toString()
    {
        if(imaginary > 0)
        {
            return real + "+" + imaginary + "i";
        }
        else
        {
            return real + "" + imaginary + "i";
        }
    }
}
