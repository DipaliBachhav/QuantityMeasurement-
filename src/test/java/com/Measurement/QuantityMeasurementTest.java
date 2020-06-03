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

    @Test
    public void givenFeetAndFeetReference_shouldEqualThen_ReturnTrue()  {
        try {
            Double feet = 2.0;
            Double value = feet;
            MeasurementComparator measurementComparator1 = new MeasurementComparator(value, Length.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(value, Length.FEET);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenFeetType_whenEqualThen_ReturnTrue() {
        try {
            double feet1 = 2, feet2 = 2;
            MeasurementComparator measurementComparator1 = new MeasurementComparator(feet1, Length.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(feet2, Length.FEET);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    public void givenFeetType_whenWithSameValueThen_ReturnTrue() {
        try {
            double feet1 = 2, feet2 = 2;
            MeasurementComparator measurementComparator1 = new MeasurementComparator(feet1, Length.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(feet2, Length.FEET);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenInchValue_whenNull_throwsException() {
        MeasurementComparator convertInch = new MeasurementComparator(0, Length.INCH);
        try {
            boolean result = quantityMeasurement.compare(convertInch, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, e.type);
        }
    }
}
