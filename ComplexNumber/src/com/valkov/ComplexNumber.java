package com.valkov;

public class ComplexNumber {
    private double real;
    private double imaginary;
    public ComplexNumber(double real, double imaginary){
        this.real=real;
        this.imaginary=imaginary;//constructor that initializes the two fields
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    public void add(double real, double imaginary){
        this.real+=real;
        this.imaginary+=imaginary;

    }
    public void add(ComplexNumber complexNumber){
        add(complexNumber.getReal(),complexNumber.getImaginary());//calling the add method in order to do the addition
    }
    public void subtract(double real, double imaginary){
        this.real-=real;
        this.imaginary-=imaginary;
    }
    public void subtract(ComplexNumber complexNumber){
        subtract(complexNumber.getReal(),complexNumber.getImaginary());//calling the subtract method in order to do the subtraction
    }
}
