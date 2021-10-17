package com.distance.calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitConverterTest {

    @Test
    void convert() {
        double result = UnitConverter.convert(1, UnitConverter.UNIT.METER, UnitConverter.UNIT.FEET);
        assertEquals(3.28,result);
        result = UnitConverter.convert(1, UnitConverter.UNIT.METER, UnitConverter.UNIT.METER);
        assertEquals(1,1);
    }
}