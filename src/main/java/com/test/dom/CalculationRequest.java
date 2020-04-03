package com.test.dom;

public class CalculationRequest {
    private double num_1;
    private double num_2;

    public CalculationRequest(double num_1, double num_2) {
        this.num_1 = num_1;
        this.num_2 = num_2;
    }

    public double getNum_1() {
        return num_1;
    }

    public double getNum_2() {
        return num_2;
    }
}
