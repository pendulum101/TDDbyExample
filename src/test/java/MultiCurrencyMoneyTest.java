package test.java;

import main.java.Dollar;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiCurrencyMoneyTest {

    @Test
    public void multiply_5_and_2_output_10 (){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
