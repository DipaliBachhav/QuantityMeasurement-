package com.Measurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void givenFeetAndLengthIsZero_shouldCompareThen_ReturnTrue() {
        MeasurementComparator measurementComparator1 = new MeasurementComparator(0,Length.FEET);
        MeasurementComparator measurementComparator2 = new MeasurementComparator(0,Length.FEET);
        boolean result = quantityMeasurement.compare(measurementComparator1,measurementComparator2);
        Assert.assertEquals(true,result);
    }
}
