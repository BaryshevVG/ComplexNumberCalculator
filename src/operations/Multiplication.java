package operations;

import model.ComplexNumber;

public class Multiplication implements Operation {
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imag = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new ComplexNumber(real, imag);
    }
}
