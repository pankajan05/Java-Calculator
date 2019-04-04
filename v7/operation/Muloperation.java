package com.company.v7.operation;

public class Muloperation implements Operation {
    private final double a;
    private final double b;

    public Muloperation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double perform() {

        return a*b;
    }
}
