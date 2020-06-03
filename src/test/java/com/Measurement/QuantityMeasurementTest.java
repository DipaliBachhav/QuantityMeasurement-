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
    public void givenInchAndInch_WhenSameType_ThenTrue(){
        try {
            Double inch1 = 12.0;
            Double inch2 = 12.0;
            MeasurementComparator measurementComparator1 = new MeasurementComparator(inch1, Length.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(inch2, Length.INCH);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenFeetAndInch_whenWithZeroValue_ThenReturnTrue(){
        try {
            double feet = 0.0, inch = 0.0;
            MeasurementComparator measurementComparator1 = new MeasurementComparator(feet, Length.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(inch, Length.INCH);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }
    @Test
    public void givenFeetAndInch_WhenNotEqualTo1_ThenReturnFalse() {
        try {
            double feet = 1.0, inch = 1.0;
            MeasurementComparator measurementComparator1 = new MeasurementComparator(feet, Length.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(inch, Length.INCH);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
        Assert.assertEquals(false,result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenInchAndFeet_WhenNotEqualTo1_ThenReturnFalse() {
        try {
            double inch = 1.0, feet = 1.0;
            MeasurementComparator measurementComparator1 = new MeasurementComparator(inch, Length.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(feet, Length.FEET);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(false,result);
        } catch (QuantityMeasurementException e) {
        }
    }
    @Test
    public void given1FeetAnd12Inch_WhenEquals_ThenReturnTrue() {
        try {
            double feet = 1.0, inch = 12.0;
            MeasurementComparator measurementComparator1 = new MeasurementComparator(feet, Length.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(inch, Length.INCH);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true,result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void given12InchAnd1Feet_WhenEquals_ThenReturnTrue() {
        try {
            double inch = 12.0,feet = 1.0;
            MeasurementComparator measurementComparator1 = new MeasurementComparator(inch, Length.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(feet, Length.FEET);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true,result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenFeetAndYard_When3FeetEqualsTo1Yard_ThenReturnTrue(){
        try{
            double feet = 3,yard = 1;
            MeasurementComparator measurementComparator1 = new MeasurementComparator(feet, Length.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(yard, Length.YARD);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true,result);
        } catch (QuantityMeasurementException e) {
        }
    }
}
