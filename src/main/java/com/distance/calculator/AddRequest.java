package com.distance.calculator;

import com.distance.calculator.models.Distance;
import com.distance.calculator.models.Units;

//Request structure for Adding distances

public class AddRequest {

    private Distance[] distances;
    private Units resultUnit;

    public Distance[] getDistances() {
        return distances;
    }

    public void setDistances(Distance[] distances) {
        this.distances = distances;
    }

    public Units getResultUnit() {
        return resultUnit;
    }

    public void setResultUnit(Units resultUnit) {
        this.resultUnit = resultUnit;
    }
}
