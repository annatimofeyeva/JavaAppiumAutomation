import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber() {
        int actual = getLocalNumber();
        int expected = 14;
        Assert.assertEquals("getLocalNumber() doesn't return " + expected, actual, expected);
    }

    @Test
    public void testGetClassNumber() {
        int actual_int = MainClass.getClassNumber();
        int expected_min = 45;
        Assert.assertTrue("getClassNumber() returns number <= " + expected_min, actual_int > expected_min);
    }

    @Test
    public void testGetClassString() {
        String str = getClassString();
        Assert.assertTrue("String doesn't contain Hello or hello", str.contains("hello") || str.contains("Hello"));
    }
}
