package com.distance.calculator;

import com.distance.calculator.models.Distance;
import com.distance.calculator.models.Units;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/distance-calculator")
public class CalculatorController {

    @PostMapping("/add")
    public Distance add(@RequestBody AddRequest request){
        Distance result = new Distance(3.0, Units.METER);
        return result;
    }

}
