package com.distance.calculator.models;


public class Unit {
    private  String unitName;
    private  Double factor;

    public Unit( String unitName, Double factor) {
        this.unitName = unitName;
        this.factor = factor;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Double getFactor() {
        return factor;
    }

    public void setFactor(Double factor) {
        this.factor = factor;
    }
}

