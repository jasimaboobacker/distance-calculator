package com.distance.calculator.models;

import com.distance.calculator.service.UnitConverter;

//Request structure for Adding distances

public class AddRequest {

    private Distance[] distances;
    private UnitConverter.UNIT resultUnit;

    public Distance[] getDistances() {
        return distances;
    }

    public void setDistances(Distance[] distances) {
        this.distances = distances;
    }

    public UnitConverter.UNIT getResultUnit() {
        return resultUnit;
    }

    public void setResultUnit(UnitConverter.UNIT resultUnit) {
        this.resultUnit = resultUnit;
    }
}
