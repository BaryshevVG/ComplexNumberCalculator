package service;

import factory.OperationFactory;
import logger.Logger;
import model.ComplexNumber;
import operations.Operation;

public class CalculatorService {
    private final Logger logger = Logger.getInstance();

    public ComplexNumber calculate(String operation, ComplexNumber a, ComplexNumber b) {
        Operation op = OperationFactory.getOperation(operation);
        ComplexNumber result = op.execute(a, b);
        logger.log(a + " " + operation + " " + b + " = " + result);
        return result;
    }
}
