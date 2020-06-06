package com.Measurement;

public class QuantityMeasurementException extends Exception{
    public enum ExceptionType {
        NULL_POINTER_EXCEPTION,WRONG_UNIT_COMPARISON;
    }

    public ExceptionType type;

    public QuantityMeasurementException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }
}
