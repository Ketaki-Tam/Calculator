import org.example.Services;
import java.util.Optional;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class CalculatorTest {

    private Services services;

    @Before
    public void setup(){
        services = new Services();
    }

    @Test
    public void test_PositiveFactorial() {
        assertEquals(720.0, services.factorial(6), 0.0001);
    }

    @Test
    public void test_NegativeFactorial() {
        assertEquals(Optional.ofNullable(services.factorial(-720)), Optional.of(-1));
    }

    @Test
    public void test_PositivePower() {
        assertEquals(81.0, services.power(3.0, 4.0), 0.0001);
    }

    @Test
    public void test_ExponentZero() {
        assertEquals(1.0, services.power(2.0, 0.0), 0.0001);
    }

    @Test
    public void test_PositiveLog() {
        assertEquals(Math.log(10), services.logarithm(10.0), 0.0001);
    }

    @Test
    public void test_NonPositiveLog() {
        assertTrue(Double.isNaN(services.logarithm(0.0)));
    }

    @Test
    public void test_Positivesqrt() {
        assertEquals(4.0, services.sqrt(16.0), 0.0001);
    }

    @Test
    public void test_Negativesqrt() {
        assertTrue(Double.isNaN(services.sqrt(-100.0)));
    }
}
