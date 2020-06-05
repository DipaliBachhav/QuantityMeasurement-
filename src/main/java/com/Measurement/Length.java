package com.Measurement;

public enum Length {
    FEET(12), INCH(1 ),YARD(36);

    public final double value;

    Length(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

}
