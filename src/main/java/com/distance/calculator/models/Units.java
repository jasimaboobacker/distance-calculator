package com.distance.calculator.models;

//Enum for defining all the units and the factoring that needs to be done with respect to Meter

public enum Units {
    METER(new Unit("METER",1.0)),
    YARD(new Unit("YARD",0.914)),
    FEET(new Unit("FEET",.3048));

    private  Unit UNIT ;

    Units(Unit unit) {
        this.UNIT = unit;
    }
}