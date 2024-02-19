package com.java.cis;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bmirest")
public class BMIRestController {

    @PostMapping
    public String calculateBMI(@RequestParam double height, @RequestParam double weight) {
        // Assuming height is in meters and weight is in kilograms
        double bmi = calculateBMIValue(height, weight);
        String result = String.format("Your BMI is: %.2f", bmi);
        return result;
    }

    private double calculateBMIValue(double height, double weight) {
        // BMI formula: weight (kg) / (height (m) * height (m))
        return weight / (height * height);
    }
}
