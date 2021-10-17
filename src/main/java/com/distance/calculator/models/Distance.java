package com.distance.calculator.models;

public class Distance {

    private double value;
    private Units unit;

    public Distance(Double value, Units unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Units getUnit() {
        return unit;
    }

    public void setUnit(Units unit) {
        this.unit = unit;
    }

}


