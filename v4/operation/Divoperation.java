package com.company.v4.operation;

public class Divoperation implements Operation{
    private final double a;
    private final double b;

    public Divoperation(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double perform() {

        return a/b;
    }
}
