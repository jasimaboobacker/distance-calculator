package com.distance.calculator.models;

import com.distance.calculator.service.UnitConverter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

//Request structure for Adding distances

public class AddRequest {

    @Valid @NotNull (message = "Atleast one distance required")
    private Distance[] distances;

    @Valid @NotNull (message = "Unit type for result cannot be empty")
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
