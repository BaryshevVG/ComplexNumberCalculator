package app;

import controller.CalculatorController;
import service.CalculatorService;
import view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        CalculatorService service = new CalculatorService();
        CalculatorController controller = new CalculatorController(service);
        ConsoleView view = new ConsoleView(controller);

        view.run();
    }
}
