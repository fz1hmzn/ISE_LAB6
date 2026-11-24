import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class HouseCalcTestJUNIT {
    @Test
    public void testRoomVolume()
    {
        assertEquals("Valid", 60.0, HouseCalc.roomVolume(3, 4, 5), 0.00001);
        assertEquals("h<3", 0.0, HouseCalc.roomVolume(3, 4, 1), 0.00001);
        assertEquals("l<2.5", 0.0, HouseCalc.roomVolume(3, 1, 5), 0.00001);
        assertEquals("l<2.5, h<3", 0.0, HouseCalc.roomVolume(3, 1, 1), 0.00001);
        assertEquals("w<2", 0.0, HouseCalc.roomVolume(1, 4, 5), 0.00001);
        assertEquals("w<2, h<3", 0.0, HouseCalc.roomVolume(1, 4, 1), 0.00001);
        assertEquals("w<2, l<2.5", 0.0, HouseCalc.roomVolume(1, 1, 5), 0.00001);
        assertEquals("w<2, l<2.5, h<3", 0.0, HouseCalc.roomVolume(1, 1, 1), 0.00001);
    }

    // Example of an array-and-for-loop approach in JUnit:
    @Test
    public void testRoomVolumeCompact()
    {
        int[] w = {3, 3, 3, 3, 1, 1, 1, 1};
        int[] l = {4, 4, 1, 1, 4, 4, 1, 1};
        int[] h = {5, 1, 5, 1, 5, 1, 5, 1};
        double[] expected = {60.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        String[] message = {"Valid", "h<3", "l<2.5", "l<2.5, h<3", "w<2",  "w<2, h<3", "w<2, l<2.5", "w<2, l<2.5, h<3"};
        for(int i = 0; i < w.length; i++)
        {
            assertEquals(message[i], expected[i], HouseCalc.roomVolume(w[i], l[i], h[i]), 0.00001);
        }
    }
}