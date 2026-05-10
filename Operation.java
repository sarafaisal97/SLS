public class Operations {
    // Sara's Methods
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }

    // Leen's Methods
    public int multiply(int a, int b) {
        return a * b;
    }
    public double divide(int a, int b) {
        if (b == 0) return 0;
        return (double) a / b;
    }

    // Shahad's Methods
    public int findMax(int a, int b) {
        return (a > b) ? a : b;
    }
    public int findMin(int a, int b) {
        return (a < b) ? a : b;
    }
}