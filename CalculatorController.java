package org.example.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    // Basic Arithmetic Operations
    @GetMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b) {
        return calculatorService.add(a, b);
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        return calculatorService.subtract(a, b);
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b) {
        return calculatorService.multiply(a, b);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b) {
        return calculatorService.divide(a, b);
    }

    // Advanced Mathematical Functions
    @GetMapping("/sqrt")
    public double sqrt(@RequestParam double a) {
        return calculatorService.sqrt(a);
    }

    @GetMapping("/ln")
    public double ln(@RequestParam double a) {
        return calculatorService.ln(a);
    }

    @GetMapping("/log")
    public double log(@RequestParam double a, @RequestParam double base) {
        return calculatorService.log(a, base);
    }

    @GetMapping("/sin")
    public double sin(@RequestParam double a) {
        return calculatorService.sin(a);
    }

    @GetMapping("/cos")
    public double cos(@RequestParam double a) {
        return calculatorService.cos(a);
    }

    @GetMapping("/tan")
    public double tan(@RequestParam double a) {
        return calculatorService.tan(a);
    }

    @GetMapping("/factorial")
    public double factorial(@RequestParam double a) {
        return calculatorService.factorial(a);
    }

    // Scientific Calculations
    @GetMapping("/exp")
    public double exp(@RequestParam double a) {
        return calculatorService.exp(a);
    }

    @GetMapping("/sinh")
    public double sinh(@RequestParam double a) {
        return calculatorService.sinh(a);
    }

    @GetMapping("/cosh")
    public double cosh(@RequestParam double a) {
        return calculatorService.cosh(a);
    }

    @GetMapping("/tanh")
    public double tanh(@RequestParam double a) {
        return calculatorService.tanh(a);
    }

    @GetMapping("/complexAdd")
    public double complexAdd(@RequestParam double real1, @RequestParam double imag1, @RequestParam double real2, @RequestParam double imag2) {
        return calculatorService.complexAdd(real1, imag1, real2, imag2);
    }

    @GetMapping("/complexSubtract")
    public double complexSubtract(@RequestParam double real1, @RequestParam double imag1, @RequestParam double real2, @RequestParam double imag2) {
        return calculatorService.complexSubtract(real1, imag1, real2, imag2);
    }

    @GetMapping("/complexMultiply")
    public double complexMultiply(@RequestParam double real1, @RequestParam double imag1, @RequestParam double real2, @RequestParam double imag2) {
        return calculatorService.complexMultiply(real1, imag1, real2, imag2);
    }

    @GetMapping("/complexDivide")
    public double complexDivide(@RequestParam double real1, @RequestParam double imag1, @RequestParam double real2, @RequestParam double imag2) {
        return calculatorService.complexDivide(real1, imag1, real2, imag2);
    }
}
