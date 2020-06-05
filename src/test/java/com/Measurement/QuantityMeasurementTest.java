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
        MeasurementComparator convertInch = new MeasurementComparator(0, Length.FEET);
        quantityMeasurement = new QuantityMeasurement();
        try {
            boolean result = quantityMeasurement.compare(convertInch, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, e.type);
        }
    }

    @Test
    public void givenFeetAndFeetReference_shouldEqualThen_ReturnTrue() {
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
            MeasurementComparator measurementComparator1 = new MeasurementComparator(2, Length.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(2, Length.FEET);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    public void givenFeetType_whenWithSameValueThen_ReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(2, Length.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(2, Length.FEET);
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

    @Test
    public void givenInchReference_shouldEqualThen_ReturnTrue() {
        try {
            Double inch = 12.0;
            Double value = inch;
            MeasurementComparator measurementComparator1 = new MeasurementComparator(inch, Length.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(value, Length.INCH);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenInchAndInch_WhenSameType_ThenTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(12.0, Length.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(12.0, Length.INCH);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenFeetAndInch_whenWithZeroValue_ThenReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(0.0, Length.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(0.0, Length.INCH);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenFeetAndInch_WhenNotEqualTo1_ThenReturnFalse() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(1.0, Length.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(1.0, Length.INCH);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(false, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenInchAndFeet_WhenNotEqualTo1_ThenReturnFalse() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(1.0, Length.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(1.0, Length.FEET);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(false, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void given1FeetAnd12Inch_WhenEquals_ThenReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(1.0, Length.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(12.0, Length.INCH);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void given12InchAnd1Feet_WhenEquals_ThenReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(12.0, Length.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(1.0, Length.FEET);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenFeetAndYard_When3FeetEqualsTo1Yard_ThenReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(3, Length.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(1, Length.YARD);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenFeetAndYard_When1FeetNotEqualsTo1Yard_ThenReturnFalse() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(1, Length.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(1, Length.YARD);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(false, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenInchAndYard_When1InchIsNotEqualsTo1Yard_ThenReturnFalse() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(1, Length.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(1, Length.YARD);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(false, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenInchAndYard_When36InchEqualsTo1Yard_ThenReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(36, Length.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(1, Length.YARD);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenFeetAndYard_When1YardEqualsTo3Feet_ThenReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(3, Length.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(1, Length.YARD);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenInchAndCentimeter_When2InchEqualsTo5Centimeter_ThenReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(2, Length.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(5, Length.CENTIMETER);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }
}
