import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StingsTest {


    @Test
    public void concatStrings() throws Exception {
        assertEquals("abcdef", "ab"+"cd"+"ef");
    }

    @Test
    public void olikaStringMetoder() throws Exception {
        String string = "abcdef";

        assertEquals(6,string.length());
        assertTrue(string.contains("bcd"));
        assertTrue(string.compareToIgnoreCase("ABCDEF")==0);
        assertTrue(string.startsWith("ab"));
        assertTrue(string.endsWith("ef"));
        assertEquals("def",string.substring(3));

        String matchning = "\\w{6}";
        assertTrue(string.matches(matchning));

        String newString = string.replace("def"," ghi");

        assertEquals("abc ghi",newString);

        assertEquals("ABCDEF", string.toUpperCase());
    }
}
