import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class CharacterUtilsTestJUNIT
{
    @Test
    public void testCharCase()
    {
        assertTrue("checkUpper, uppercase", CharacterUtils.charCase(true, 'A'));
        assertFalse("checkUpper, lowercase", CharacterUtils.charCase(true, 'a'));
        assertFalse("checkUpper, non-letter", CharacterUtils.charCase(true, '5'));
        assertFalse("!checkUpper, uppercase ", CharacterUtils.charCase(false, 'A'));
        assertTrue("!checkUpper, lowercase", CharacterUtils.charCase(false, 'a'));
        assertFalse("!checkUpper, non-letter", CharacterUtils.charCase(false, '5'));
    }
    
    @Test
    public void testSubstr()
    {
        assertEquals("disjoint", "", CharacterUtils.substr("abc", "xyz"));
        assertEquals("str1 in str2", "science", CharacterUtils.substr("science", "conscience"));
        assertEquals("str2 in str1", "science", CharacterUtils.substr("conscience","science"));
        assertEquals("str1 = str2", "conscience", CharacterUtils.substr("conscience", "conscience"));
    }
}