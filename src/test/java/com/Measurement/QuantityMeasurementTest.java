package com.Measurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void givenFeetAndLengthIsZero_shouldCompareThen_ReturnTrue() {
        int feet1 = 0;
        int feet2 = 0;
        boolean result = quantityMeasurement.checkFeetQuantity(feet1, feet2);
        Assert.assertEquals(true, result);
    }
}
