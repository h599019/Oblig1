package Oppg1.b;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class beregn {
    public static int beregn(int a, int b, BinaryOperator<Integer> operator) {
        return operator.apply(a, b);
    }
}
