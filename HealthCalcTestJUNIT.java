import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class HealthCalcTestJUNIT {
    
    @Test
    public void testUvRating()
    {
        assertEquals("INVALID/low", "-", HealthCalc.uvRating(-0.00001));
        assertEquals("invalid/LOW", "low", HealthCalc.uvRating(0.0));
        assertEquals("LOW/medium", "low", HealthCalc.uvRating(2.99999));
        assertEquals("low/MEDIUM", "medium", HealthCalc.uvRating(3.0));
        assertEquals("MEDIUM/high", "medium", HealthCalc.uvRating(5.99999));
        assertEquals("medium/HIGH", "high", HealthCalc.uvRating(6.0));
        assertEquals("HIGH/very high", "high", HealthCalc.uvRating(7.99999));
        assertEquals("high/VERY HIGH", "very high", HealthCalc.uvRating(8.0));
        assertEquals("VERY HIGH/extreme", "very high", HealthCalc.uvRating(10.99999));
        assertEquals("very high/EXTREME", "extreme", HealthCalc.uvRating(11.0));
    }
}
