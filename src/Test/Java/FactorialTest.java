package Test.Java;

import Algorithms.Factorial.FactorialEvenSimpler;
import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void factorial_testIfReturnsCorrectValue(){
        FactorialEvenSimpler fas = new FactorialEvenSimpler();
        int expectedValue4 = 24;
        int expectedValue5 = 120;
        int expectedValue10 = 3628800;

        Assert.assertEquals(fas.factorial(10), expectedValue10);
    }

}
