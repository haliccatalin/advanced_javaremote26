package com.sda.enums;

public enum LengthUnit {
    METER(1.0),
    CENTIMETER(0.01),
    FOOT(0.3),
    INCH(0.025),
    MILIMETRU(0.001);

    private double value;

    LengthUnit(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }
}
