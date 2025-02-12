package view;

import controller.CalculatorController;
import model.ComplexNumber;

import java.util.Scanner;

public class ConsoleView {
    private final CalculatorController controller;
    private final Scanner scanner = new Scanner(System.in);

    public ConsoleView(CalculatorController controller) {
        this.controller = controller;
    }

    public void run() {
        System.out.println("Введите первое комплексное число (действительная и мнимая часть):");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        ComplexNumber num1 = new ComplexNumber(real1, imag1);

        System.out.println("Введите второе комплексное число (действительная и мнимая часть):");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();
        ComplexNumber num2 = new ComplexNumber(real2, imag2);

        System.out.println("Выберите операцию (add/multiply/divide):");
        String operation = scanner.next();

        ComplexNumber result = controller.executeCalculation(operation, num1, num2);
        System.out.println("Результат: " + result);
    }
}
