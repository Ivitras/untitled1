package lekcijaSesiTest.majasDarbs;

import lekcijaSesi.majasDarbs.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test

    //1.tests
    public void testCalculatorAdd() {
//        int expectedValue = 9;
//        int actualValue = calculator.add(5, 4);
//        Assert.assertEquals(actualValue, expectedValue);
        Assert.assertEquals(calculator.add(3,3),6);
        Assert.assertEquals(calculator.add(4,3),7);
        Assert.assertEquals(calculator.add(8,20),28);
        Assert.assertEquals(calculator.add(1,20),21);

    }

    //2.tests
    @Test
    public void testCalculatorSubstract() {
//        int expectedValue = 7;
//        int actualValue = calculator.substract(13, 6);
//        Assert.assertEquals(actualValue, expectedValue);
        Assert.assertEquals(calculator.substract(13,3),10);
        Assert.assertEquals(calculator.substract(8,9),-1);
        Assert.assertEquals(calculator.substract(30,30),0);
        Assert.assertEquals(calculator.substract(99,40),59);

    }

    //3.tests
    @Test
    public void testCalculatorMultiply() {
//        int expectedValue = 9;
//        int actualValue = calculator.multiply(3,3);
//        Assert.assertEquals(actualValue, expectedValue);
        Assert.assertEquals(calculator.multiply(9,9),81);
        Assert.assertEquals(calculator.multiply(10,101),1010);
        Assert.assertEquals(calculator.multiply(7,3),21);
        Assert.assertEquals(calculator.multiply(1,0),0);

    }

    //4.tests
    @Test
    public void testCalculatorDivide() {
//        float expectedValue = 3;
//        float actualValue = calculator.divide(18, 6);
//        Assert.assertEquals(actualValue, expectedValue);
        Assert.assertEquals(calculator.divide(18,2),9);
        Assert.assertEquals(calculator.divide(99,2),49,5);
        Assert.assertEquals(calculator.divide(50,1),50);
        Assert.assertEquals(calculator.divide(2,2),1);

    }
}