package controller;

import model.ComplexNumber;
import service.CalculatorService;

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public ComplexNumber executeCalculation(String operation, ComplexNumber a, ComplexNumber b) {
        return calculatorService.calculate(operation, a, b);
    }
}
