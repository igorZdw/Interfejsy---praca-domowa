package com.company;

public class Traingle implements Figure {

    private double a;
    private double b;
    private double c;

    public Traingle(double a, double b) {
        this.a = a;
        this.b = b;
        this.c = Math.sqrt(a*a+b*b);
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public double getArea() {
        return a*b/2;
    }


}
