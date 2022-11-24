package lekcijaSesi.majasDarbs;

public class Calculator {
    int result;

    //Method for addition, 1.tests
    public int add(int num1, int num2) {
        result = num1 + num2;
        return result;
    }

    //Method for subtraction, 2. tests
    public int substract(int num1, int num2) {
        result = num1 - num2;
        return result;
    }

    //Method for multiplication, 3.tests
    public int multiply(int num1, int num2) {
        result = num1 * num2;
        return result;
    }

    //Method for division, 4.tests
    public float divide(int num1, int num2) {
        result = num1 / num2;
        return result;
    }
}