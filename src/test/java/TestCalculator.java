import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class TestCalculator {

    private final Calculator calculator = new Calculator();

    @Test
    public void TestSum() {
        Assertions.assertEquals(2, calculator.Sum(1, 1));
    }

    @Test
    public void TestSub() {
        Assertions.assertEquals(0, calculator.Sub(1, 1));
    }

    @Test
    public void TestDivide() {
        Assertions.assertEquals(2, calculator.Divide(4, 2));
    }

    @Test
    public void TestMultiply() {
        Assertions.assertEquals(4, calculator.Multiply(2, 2));
    }

    @Test
    public void TestDivide_Bis() {
        Assertions.assertEquals(4, calculator.Divide(4, 0));
    }
}
