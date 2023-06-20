import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest extends CoreTestCase
{
    @Before
    public void startTest() {
        System.out.println("Start test");
    }
    @After
    public void finishTest() {
        System.out.println("Finish test");
    }
    @Test
    public void myFirstTest() {
        System.out.println("First test");
        //this.assertFail();
        int expected = 25;
        int actual = 5 * 5;
/*        if (actual != expected) {
            Assert.fail("5 * 5 != 25)");
        }*/
        Assert.assertTrue("5 * 5 != 25)", actual == expected);
    }
}


