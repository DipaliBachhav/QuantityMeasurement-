package com.Measurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void givenFeetAndLengthIsZero_shouldCompareThen_ReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(0, Length.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(0, Length.FEET);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenFeetValueIsNull_shouldThrowsException() {
        MeasurementComparator converteInch = new MeasurementComparator(0, Length.FEET);
        quantityMeasurement = new QuantityMeasurement();
        try {
            boolean result = quantityMeasurement.compare(converteInch, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, e.type);
        }
    }
}
