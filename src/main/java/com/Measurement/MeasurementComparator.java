package com.Measurement;

public class MeasurementComparator {

    private double value;
    Unit unit;

    public MeasurementComparator(double value, Unit unit) {
        this.unit=unit;
        this.value = compare(value,unit);
    }
    public double compare(double value, Unit unit){
        return value * unit.getValue();
    }

    public double getAdd() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeasurementComparator that = (MeasurementComparator) o;
        return Double.compare(that.value, value) == 0 &&
                unit == that.unit;
    }
}
