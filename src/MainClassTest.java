import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void testGetLocalNumber() {
        int actual = getLocalNumber();
        int expected = 14;
        Assert.assertEquals("getLocalNumber() doesn't return 14", actual, expected);
    }
}
