package com.distance.calculator.models;

import com.distance.calculator.service.UnitConverter;

import javax.validation.constraints.NotNull;

public class Distance {

    @NotNull(message = "Distance value cannot be empty")
    private double value;
    @NotNull(message = "Unit type cannot be empty")
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


