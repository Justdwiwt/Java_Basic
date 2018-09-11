package test_05_25;

public class Day06Test {
}

class Complex {
    private double real;
    private double im;

    public Complex(double real, double im) {
        this.real = real;
        this.im = im;
    }

    public Complex() {
        this.im = 0;
        this.real = 0;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public Complex add(Complex c) {
        this.real = this.real + c.real;
        this.im = this.im + c.im;
        return this;
    }

    @Override
    public String toString() {
        return this.real + "+" + this.im + "i";
    }

    public Complex add(double real) {

        return this;
    }
}