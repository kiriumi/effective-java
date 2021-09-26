package jp.example.enum_annotation.enum_extends;

import java.util.function.DoubleBinaryOperator;

enum ExtendedOperation implements Operation {

    TIMES((x, y) -> x * y), DEVIDE((x, y) -> x / y);

    private DoubleBinaryOperator operator;

    ExtendedOperation(DoubleBinaryOperator operator) {
        this.operator = operator;
    }

    @Override
    public double apply(double x, double y) {
        return operator.applyAsDouble(x, y);
    }

}
