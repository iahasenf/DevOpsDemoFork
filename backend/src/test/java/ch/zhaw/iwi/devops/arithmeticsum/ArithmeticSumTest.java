package ch.zhaw.iwi.devops.arithmeticsum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticSumTest {
    
    @Test
    public void arithmeticSumCalculator1() {

        ArithmeticSum as = new ArithmeticSum();
        Assertions.assertEquals(1, as.calculate(1));

    }
}
