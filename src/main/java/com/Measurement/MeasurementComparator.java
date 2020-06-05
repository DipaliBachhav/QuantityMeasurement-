package com.Measurement;

public class MeasurementComparator {
    private double value;

    public MeasurementComparator(double value, Length length) {
        this.value = compare(value,length);
    }
    public double compare(double value,Length length){
        return value * length.getValue();
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeasurementComparator that = (MeasurementComparator) o;
        return Double.compare(that.value, value) == 0;
    }

}
