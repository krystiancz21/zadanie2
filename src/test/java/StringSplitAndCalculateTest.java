import org.example.StringSplitAndCalculate;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringSplitAndCalculateTest {
    @Test
    public void AdditionCalculateTest() throws Exception {
        assertEquals(169.0, StringSplitAndCalculate.splitAndCalculate("12,34.56;67+"), 0.0001);
    }

    @Test
    public void SubtractionCalculateTest() throws Exception {
        assertEquals(-145.0, StringSplitAndCalculate.splitAndCalculate("12,34.56;67-"), 0.0001);
    }

    @Test
    public void MultiplicationCalculateTest() throws Exception {
        assertEquals(336.0, StringSplitAndCalculate.splitAndCalculate("2,4.6;7*"), 0.0001);
    }

    @Test
    public void DivisionCalculateTest() throws Exception {
        assertEquals(2.0, StringSplitAndCalculate.splitAndCalculate("512,2.64;2/"), 0.0001);
    }

    @Test
    public void DivisionByZeroTest() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            StringSplitAndCalculate.splitAndCalculate("12,2.0/");
        });
        assertTrue(exception.getMessage().contains("Nie wolno dzielić przez zero!"));
    }

    @Test
    public void EmptyInputTest() {
        Exception exception = assertThrows(Exception.class, () -> {
            StringSplitAndCalculate.splitAndCalculate("");
        });
        assertTrue(exception.getMessage().contains("Ciąg wejściowy jest pusty."));
    }
}
