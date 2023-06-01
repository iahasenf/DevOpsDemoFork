package ch.zhaw.iwi.devops.arithmeticsum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticSumTest {
    
    @Test
    public void arithmeticSumCalculator1() {

        ArithmeticSum as = new ArithmeticSum();
        Assertions.assertEquals(1, as.calculate(1));

    }

    @Test
    public void arithmeticSumCalculator2() {

        ArithmeticSum as = new ArithmeticSum();
        Assertions.assertEquals(3, as.calculate(2));

    }
    @Test
    public void arithmeticSumCalculator3() {

        ArithmeticSum as = new ArithmeticSum();
        Assertions.assertEquals(6, as.calculate(3));

    }
    @Test
    public void arithmeticSumCalculator4() {

        ArithmeticSum as = new ArithmeticSum();
        Assertions.assertEquals(10, as.calculate(4));

    }
    @Test
    public void arithmeticSumCalculator5() {

        ArithmeticSum as = new ArithmeticSum();
        Assertions.assertEquals(15, as.calculate(5));

    }
    @Test
    public void arithmeticSumCalculator6() {

        ArithmeticSum as = new ArithmeticSum();
        Assertions.assertEquals(21, as.calculate(6));

    }
    @Test
    public void arithmeticSumCalculator7() {

        ArithmeticSum as = new ArithmeticSum();
        Assertions.assertEquals(28, as.calculate(7));

    }
    @Test
    public void arithmeticSumCalculator8() {

        ArithmeticSum as = new ArithmeticSum();
        Assertions.assertEquals(36, as.calculate(8));

    }
    @Test
    public void arithmeticSumCalculator9() {

        ArithmeticSum as = new ArithmeticSum();
        Assertions.assertEquals(45, as.calculate(9));

    }
    @Test
    public void arithmeticSumCalculator10() {

        ArithmeticSum as = new ArithmeticSum();
        Assertions.assertEquals(55, as.calculate(10));

    }
}
