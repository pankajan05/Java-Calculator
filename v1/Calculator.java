package com.company.v1;

public class Calculator {

    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void add(){
        System.out.println(a+b);
    }
    public void sub(){
        System.out.println(a-b);
    }
    public void mul(){
        System.out.println(a*b);
    }
    public void div(){
        System.out.println(a/b);
    }





}
