package com.distance.calculator.models;

import com.distance.calculator.service.UnitConverter;

public class Distance {

    private double value;
    private UnitConverter.UNIT unit;

    public Distance(Double value, UnitConverter.UNIT unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public UnitConverter.UNIT getUnit() {
        return unit;
    }

    public void setUnit(UnitConverter.UNIT unit) {
        this.unit = unit;
    }

}


