package com.Measurement;

public class QuantityMeasurement {
    public boolean compare(MeasurementComparator measurementComparator1,MeasurementComparator measurementComparator2) throws QuantityMeasurementException {
        if (measurementComparator1 == null || measurementComparator2 == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, "Null Object");
        return measurementComparator1.equals(measurementComparator2);
    }

    public double addition(MeasurementComparator measurementComparator1, MeasurementComparator measurementComparator2) {
        return measurementComparator1.getValue()+measurementComparator2.getValue();
    }
}
