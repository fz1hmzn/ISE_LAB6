import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class UniAdminTestJUNIT
{
    // Using the basic equivalence partitioning approach
    @Test
    public void testCalcGrade()
    {
        assertEquals("<0", "", UniAdmin.calcGrade(-5));
        assertEquals("0-49", "F", UniAdmin.calcGrade(25));
        assertEquals("50-59", "5", UniAdmin.calcGrade(55));
        assertEquals("60-69", "6", UniAdmin.calcGrade(65));
        assertEquals("70-79", "7", UniAdmin.calcGrade(75));
        assertEquals("80-89", "8", UniAdmin.calcGrade(85));
        assertEquals("90-99", "9", UniAdmin.calcGrade(95));
        assertEquals("=100", "10", UniAdmin.calcGrade(100));
        assertEquals(">100", "", UniAdmin.calcGrade(105));
    }

    // Using boundary value analysis
    @Test
    public void testCalcGradeBva()
    {
        assertEquals("Invalid/F:-1", "", UniAdmin.calcGrade(-1));
        assertEquals("Invalid/F: 0", "F", UniAdmin.calcGrade(0));
        assertEquals("F/5: 49", "F", UniAdmin.calcGrade(49));
        assertEquals("F/5: 50", "5", UniAdmin.calcGrade(50));
        assertEquals("5/6: 59", "5", UniAdmin.calcGrade(59));
        assertEquals("5/6: 60", "6", UniAdmin.calcGrade(60));
        assertEquals("6/7: 69", "6", UniAdmin.calcGrade(69));
        assertEquals("6/7: 70", "7", UniAdmin.calcGrade(70));
        assertEquals("7/8: 79", "7", UniAdmin.calcGrade(79));
        assertEquals("7/8: 80", "8", UniAdmin.calcGrade(80));
        assertEquals("8/9: 89", "8", UniAdmin.calcGrade(89));
        assertEquals("8/9: 90", "9", UniAdmin.calcGrade(90));
        assertEquals("9/10: 99", "9", UniAdmin.calcGrade(99));
        assertEquals("9/10: 100",  "10", UniAdmin.calcGrade(100));
        assertEquals("10/Invalid: 101", "", UniAdmin.calcGrade(101));
    }
}