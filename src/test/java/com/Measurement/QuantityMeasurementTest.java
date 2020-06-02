package com.Measurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    @Test
    public void givenLengthInFeet_whenConverted_shouldReturnLengthInInches() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double feet=1, inchesPerFeet=12;
        double calculateInchesPerFeet=quantityMeasurement.checkQuantity(feet);
        Assert.assertEquals(inchesPerFeet,calculateInchesPerFeet,1);
    }
}
