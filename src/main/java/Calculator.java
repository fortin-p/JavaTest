public class Calculator {
    public int Sum(int a, int b) {
        return a + b;
    }

    public int Sub(int a, int b) {
        return a - b;
    }

    public int Divide(int a, int b) {
        b = b == 0 ? 1: b;
        return a / b;
    }

    public int Multiply(int a, int b) {
        return a * b;
    }
}
