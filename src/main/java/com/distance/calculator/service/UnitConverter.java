package com.distance.calculator.service;

import com.distance.calculator.models.Unit;

//Helper class to convert a value to different units

public class UnitConverter {

    public enum UNIT {
        METER(new Unit("METER",1.0)),
        YARD(new Unit("YARD",0.914)),
        FEET(new Unit("FEET",.3048));

        private  Unit UNIT ;

        UNIT(Unit unit) {
            this.UNIT = unit;
        }
    }

    public static double convert(double val, UNIT fromUnit, UNIT toUnit){
        double result = toBase(val,fromUnit);
        result = Math.round(fromBase(result,toUnit)*100.0)/100.0;
        return  result;
    }

    static double toBase(double val, UNIT unit){
        return val*unit.UNIT.getFactor();

    }

    static double fromBase(double val, UNIT unit){
        return val/unit.UNIT.getFactor();
    }
}
