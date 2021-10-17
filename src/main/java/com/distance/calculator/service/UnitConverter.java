package com.distance.calculator.service;

import com.distance.calculator.models.Unit;

//Helper class to convert a value to different units

public class UnitConverter {

    public static double convert(double val, Unit fromUnit, Unit toUnit){
        double result = toBase(val,fromUnit);
        result = Math.round(fromBase(result,toUnit)*100.0)/100.0;
        return  result;
    }

    static double toBase(double val, Unit unit){
        return val*unit.getFactor();

    }

    static double fromBase(double val, Unit unit){
        return val/unit.getFactor();
    }
}
