package com.distance.calculator;

import com.distance.calculator.models.AddRequest;
import com.distance.calculator.models.Distance;
import com.distance.calculator.service.UnitConverter;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
@Validated
@RequestMapping("/api/distance-calculator")
public class CalculatorController {

    @PostMapping("/add")
    public Distance add(@Valid @RequestBody AddRequest request){

        Double totalDistance = 0.0;
        Distance[] distances = request.getDistances();

        for(Distance distance: distances){
            totalDistance += UnitConverter.convert(distance.getValue(),distance.getUnit(),request.getResultUnit());
        }

        Distance result = new Distance(Math.round(totalDistance*100.0)/100.0, request.getResultUnit());
        return result;
    }

}
