package org.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    // Advanced Mathematical Functions
    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    public double ln(double a) {
        return Math.log(a);
    }

    public double log(double a, double base) {
        return Math.log(a) / Math.log(base);
    }

    public double sin(double a) {
        return Math.sin(a);
    }

    public double cos(double a) {
        return Math.cos(a);
    }

    public double tan(double a) {
        return Math.tan(a);
    }

    public double factorial(double a) {
        double result = 1;
        for (int i = 2; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    // Scientific Calculations
    public double exp(double a) {
        return Math.exp(a);
    }

    public double sinh(double a) {
        return Math.sinh(a);
    }

    public double cosh(double a) {
        return Math.cosh(a);
    }

    public double tanh(double a) {
        return Math.tanh(a);
    }

    public double complexAdd(double real1, double imag1, double real2, double imag2) {
        return real1 + real2 + (imag1 + imag2) * Math.sqrt(-1);
    }

    public double complexSubtract(double real1, double imag1, double real2, double imag2) {
        return real1 - real2 + (imag1 - imag2) * Math.sqrt(-1);
    }

    public double complexMultiply(double real1, double imag1, double real2, double imag2) {
        return (real1 * real2 - imag1 * imag2) + (real1 * imag2 + imag1 * real2) * Math.sqrt(-1);
    }

    public double complexDivide(double real1, double imag1, double real2, double imag2) {
        double denominator = real2 * real2 + imag2 * imag2;
        return ((real1 * real2 + imag1 * imag2) / denominator) + ((imag1 * real2 - real1 * imag2) / denominator) * Math.sqrt(-1);
    }
}
