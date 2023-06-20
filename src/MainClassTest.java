import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void testGetLocalNumber() {
        int actual = getLocalNumber();
        int expected = 14;
        Assert.assertEquals("getLocalNumber() doesn't return 14", actual, expected);
    }
    @Test
    public void testGetClassNumber() {
        int actual_int = getClassNumber();
        System.out.println(actual_int);
        if(actual_int > 45) {
            Assert.fail("getClassNumber() returns number > 45");
        }
    }
}
