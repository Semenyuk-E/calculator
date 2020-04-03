package com.test.controller;

import com.test.dom.CalculationRequest;
import com.test.dom.CalculationResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculateController {

    @PostMapping("/calculate")
    @ResponseBody
    public CalculationResult sum(@RequestBody CalculationRequest calculationRequest){
        return new CalculationResult(calculationRequest.getNum_1() + calculationRequest.getNum_2());
    }
}
