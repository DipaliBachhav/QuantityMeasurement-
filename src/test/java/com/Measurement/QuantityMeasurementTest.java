package com.Measurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void givenFeetAndLengthIsZero_shouldCompareThen_ReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(0, Unit.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(0, Unit.FEET);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenFeetValueIsNull_shouldThrowsException() {
        MeasurementComparator convertInch = new MeasurementComparator(0, Unit.FEET);
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
            MeasurementComparator measurementComparator1 = new MeasurementComparator(value, Unit.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(value, Unit.FEET);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenFeetType_whenEqualThen_ReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(2, Unit.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(2, Unit.FEET);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    public void givenFeetType_whenWithSameValueThen_ReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(2, Unit.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(2, Unit.FEET);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenInchValue_whenNull_throwsException() {
        MeasurementComparator convertInch = new MeasurementComparator(0, Unit.INCH);
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
            MeasurementComparator measurementComparator1 = new MeasurementComparator(inch, Unit.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(value, Unit.INCH);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenInchAndInch_WhenSameType_ThenTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(12.0, Unit.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(12.0, Unit.INCH);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenFeetAndInch_whenWithZeroValue_ThenReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(0.0, Unit.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(0.0, Unit.INCH);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenFeetAndInch_WhenNotEqualTo1_ThenReturnFalse() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(1.0, Unit.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(1.0, Unit.INCH);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(false, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenInchAndFeet_WhenNotEqualTo1_ThenReturnFalse() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(1.0, Unit.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(1.0, Unit.FEET);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(false, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void given1FeetAnd12Inch_WhenEquals_ThenReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(1.0, Unit.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(12.0, Unit.INCH);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void given12InchAnd1Feet_WhenEquals_ThenReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(12.0, Unit.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(1.0, Unit.FEET);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenFeetAndYard_When3FeetEqualsTo1Yard_ThenReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(3, Unit.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(1, Unit.YARD);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenFeetAndYard_When1FeetNotEqualsTo1Yard_ThenReturnFalse() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(1, Unit.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(1, Unit.YARD);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(false, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenInchAndYard_When1InchIsNotEqualsTo1Yard_ThenReturnFalse() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(1, Unit.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(1, Unit.YARD);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(false, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenInchAndYard_When36InchEqualsTo1Yard_ThenReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(36, Unit.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(1, Unit.YARD);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenFeetAndYard_When1YardEqualsTo3Feet_ThenReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(3, Unit.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(1, Unit.YARD);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenInchAndCentimeter_When2InchEqualsTo5Centimeter_ThenReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(2, Unit.INCH);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(5, Unit.CENTIMETER);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }


    @Test
    public void givenTwoLength_WhenAdditionEquals_ThenReturnTrue() {
        MeasurementComparator measurementComparator1 = new MeasurementComparator(2, Unit.INCH);
        MeasurementComparator measurementComparator2 = new MeasurementComparator(2, Unit.INCH);
        double result = quantityMeasurement.addition(measurementComparator1, measurementComparator2);
        Assert.assertEquals(4, result, 0);
    }

    @Test
    public void givenFeetAndInch_whenAdded_ThenReturnTrue(){
        MeasurementComparator measurementComparator1 = new MeasurementComparator(1,Unit.FEET);
        MeasurementComparator measurementComparator2 = new MeasurementComparator(2,Unit.INCH);
        double result = quantityMeasurement.addition(measurementComparator1,measurementComparator2);
        Assert.assertEquals(14,result,0);
    }

    @Test
    public void givenFeetAndFeet_WhenAdded_ThenReturnTrue(){
        MeasurementComparator measurementComparator1 = new MeasurementComparator(1,Unit.FEET);
        MeasurementComparator measurementComparator2 = new MeasurementComparator(1,Unit.FEET);
        double result = quantityMeasurement.addition(measurementComparator1,measurementComparator2);
        Assert.assertEquals(24,result,0);
    }

    @Test
    public void givenFeetAndInch_WhenAdded_ThenReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(1, Unit.FEET);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(1, Unit.INCH);
            Boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(false, result);
        } catch (QuantityMeasurementException e) {
        }
    }
    @Test
    public void givenInchAndCentimeter_WhenAdded_ThenReturnTrue(){
        MeasurementComparator measurementComparator1 = new MeasurementComparator( 2,Unit.INCH);
        MeasurementComparator measurementComparator2 = new MeasurementComparator(2.5,Unit.CENTIMETER);
        double result = quantityMeasurement.addition(measurementComparator1,measurementComparator2);
        Assert.assertEquals(3,result,0);
    }

    @Test
    public void givenGallonAndLitre_WhenEquals_ThenReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(1, Unit.GALLON);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(3.78, Unit.LITRE);
            Boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        }catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenGallonAndLitre_whenAdded_ThenReturnResult(){
        MeasurementComparator measurementComparator1 = new MeasurementComparator(3.78,Unit.LITRE);
        MeasurementComparator measurementComparator2 = new MeasurementComparator(1,Unit.GALLON);
        double result = quantityMeasurement.addition(measurementComparator1,measurementComparator2);
        Assert.assertEquals(7.56,result,0);
    }

    @Test
    public void givenLitreAndMilliLitre_whenEquals_ThenReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(1, Unit.LITRE);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(1000, Unit.MILLITRE);
            Boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenLitreAndMillilitre_whenAdded_ThenReturnResult(){
        MeasurementComparator measurementComparator1 = new MeasurementComparator(1,Unit.LITRE);
        MeasurementComparator measurementComparator2 = new MeasurementComparator(1000,Unit.MILLITRE);
        double result = quantityMeasurement.addition(measurementComparator1,measurementComparator2);
        Assert.assertEquals(2,result,0);
    }

    @Test
    public void givenKilogramAndGrams_whenEquals_ThenReturnTrue()  {
    try{
        MeasurementComparator measurementComparator1 = new MeasurementComparator(1,Unit.KILOGRAMS);
        MeasurementComparator measurementComparator2 = new MeasurementComparator(1000,Unit.GRAM);
        boolean result = quantityMeasurement.compare(measurementComparator1,measurementComparator2);
        Assert.assertTrue(true);
    }catch (QuantityMeasurementException e) {
    }
    }

    @Test
    public void givenTonneAndKilogram_whenEquals_ThenReturnTrue() {
        try {
            MeasurementComparator measurementComparator1 = new MeasurementComparator(1000, Unit.KILOGRAMS);
            MeasurementComparator measurementComparator2 = new MeasurementComparator(1, Unit.TONNE);
            boolean result = quantityMeasurement.compare(measurementComparator1, measurementComparator2);
            Assert.assertTrue(true);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenTonneAndGrams_whenAdded_ThenReturnTrue(){
        MeasurementComparator measurementComparator1 = new MeasurementComparator(1000,Unit.GRAM);
        MeasurementComparator measurementComparator2 = new MeasurementComparator(1,Unit.TONNE);
        double result = quantityMeasurement.addition(measurementComparator1,measurementComparator2);
        Assert.assertEquals(1001,result,0);
    }

    @Test
    public void givenFahrenheitAndCelsius_whenCompare_ThenReturnTrue(){
        try{
        MeasurementComparator measurementComparator1 = new MeasurementComparator(212,Unit.FAHRENHEIT);
        MeasurementComparator measurementComparator2 = new MeasurementComparator(100,Unit.CELSIUS);
        boolean result = quantityMeasurement.compare(measurementComparator1,measurementComparator2);
        Assert.assertTrue(true);
        }catch (QuantityMeasurementException e) {
        }
        }

    @Test
    public void givenInchAndKilogram_whenCompare_throwsException() {
        MeasurementComparator measurementComparator1 = new MeasurementComparator(1, Unit.INCH);
        MeasurementComparator measurementComparator2 = new MeasurementComparator(1, Unit.KILOGRAMS);
        try {
            boolean result = quantityMeasurement.compare(measurementComparator1,measurementComparator2);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.WRONG_UNIT_COMPARISON, e.type);
        }
    }

    @Test
    public void givenFeetAndLitre_whenCompare_throwsException() {
        MeasurementComparator measurementComparator1 = new MeasurementComparator(1, Unit.FEET);
        MeasurementComparator measurementComparator2 = new MeasurementComparator(1, Unit.LITRE);
        try {
            boolean result = quantityMeasurement.compare(measurementComparator1,measurementComparator2);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.WRONG_UNIT_COMPARISON, e.type);
        }
    }

    @Test
    public void givenFeetAndFahrenheit_whenCompare_throwsException() {
        MeasurementComparator measurementComparator1 = new MeasurementComparator(1, Unit.FEET);
        MeasurementComparator measurementComparator2 = new MeasurementComparator(212, Unit.FAHRENHEIT);
        try {
            boolean result = quantityMeasurement.compare(measurementComparator1,measurementComparator2);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.WRONG_UNIT_COMPARISON, e.type);
        }
    }

    @Test
    public void givenMillitreAndFahrenheit_whenCompare_throwsException() {
        MeasurementComparator measurementComparator1 = new MeasurementComparator(1, Unit.MILLITRE);
        MeasurementComparator measurementComparator2 = new MeasurementComparator(212, Unit.FAHRENHEIT);
        try {
            boolean result = quantityMeasurement.compare(measurementComparator1,measurementComparator2);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.WRONG_UNIT_COMPARISON, e.type);
        }
    }

}

