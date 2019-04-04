package com.company.v6.operation;

public class SubOperation implements Operation {
    private final double a;
    private final double b;

    public SubOperation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double perform() {

        return a-b;
    }
}
