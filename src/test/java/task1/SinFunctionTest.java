package task1;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SinFunctionTest {
    double eps = 0.1;

    @ParameterizedTest
    @ValueSource(doubles = {0.0, 0.001, -0.001})
    public void zeroCheck(final double value) {
        Assertions.assertEquals(Math.sin(value), SinFunction.sin(value), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-0.01, -0.1})
    public void negativeZeroCloseCheck(final double value) {
        Assertions.assertEquals(Math.sin(value), SinFunction.sin(value), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.01, 0.1})
    public void positiveZeroCloseCheck(final double value) {
        Assertions.assertEquals(Math.sin(value), SinFunction.sin(value), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1.1, -10.0})
    public void negativeCheck(final double value) {
        Assertions.assertEquals(Math.sin(value), SinFunction.sin(value), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.1, 10.0})
    public void positiveCheck(final double value) {
        Assertions.assertEquals(Math.sin(value), SinFunction.sin(value), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {Math.PI, Math.PI + 0.001, Math.PI - 0.001})
    public void plusPICheck(final double value) {
        Assertions.assertEquals(Math.sin(value), SinFunction.sin(value), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI, -Math.PI - 0.001, -Math.PI + 0.001})
    public void minusPICheck(final double value) {
        Assertions.assertEquals(Math.sin(value), SinFunction.sin(value), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {Math.PI/2.0,  Math.PI/2.0 + 0.001, Math.PI/2.0 - 0.001})
    public void plus2PICheck(final double value) {
        Assertions.assertEquals(Math.sin(value), SinFunction.sin(value), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI/2.0, -Math.PI/2.0 - 0.001, -Math.PI/2.0 + 0.001})
    public void minus2PICheck(final double value) {
        Assertions.assertEquals(Math.sin(value), SinFunction.sin(value), eps);
    }

}
