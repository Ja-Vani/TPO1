package task1;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SinFunctionTest {
    double eps = 0.1;

    @ParameterizedTest
    @ValueSource(doubles = {0.0, 0.001, -0.001})
    public void zeroCheck(double value) {
        Assertions.assertEquals(Math.sin(value), SinFunction.sin(value), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-0.01, -0.1})
    public void negativeZeroCloseCheck(double value) {
        Assertions.assertEquals(Math.sin(value), SinFunction.sin(value), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.01, 0.1})
    public void positiveZeroCloseCheck(double value) {
        Assertions.assertEquals(Math.sin(value), SinFunction.sin(value), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1.1, -10.0})
    public void negativeCheck(double value) {
        Assertions.assertEquals(Math.sin(value), SinFunction.sin(value), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.1, 10.0})
    public void positiveCheck(double value) {
        Assertions.assertEquals(Math.sin(value), SinFunction.sin(value), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {Math.PI, Math.PI + 0.001, Math.PI - 0.001})
    public void plusPICheck(double value) {
        Assertions.assertEquals(Math.sin(value), SinFunction.sin(value), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI, -Math.PI - 0.001, -Math.PI + 0.001})
    public void minusPICheck(double value) {
        Assertions.assertEquals(Math.sin(value), SinFunction.sin(value), eps * 5);
    }

    @ParameterizedTest
    @ValueSource(doubles = {2 * Math.PI, 2 * Math.PI + 0.001, 2 * Math.PI - 0.001})
    public void plus2PICheck(double value) {
        Assertions.assertEquals(Math.sin(value), SinFunction.sin(value), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-2 * Math.PI, -2 * Math.PI - 0.001, -2 * Math.PI + 0.001})
    public void minus2PICheck(double value) {
        Assertions.assertEquals(Math.sin(value), SinFunction.sin(value), eps * 5);
    }

}
