import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest{
    @Test
    public void test() throws Exception {
        driver.get("https://www.bstackdemo.com");
        Assert.assertTrue(driver.getTitle().contains("Sample"));
    }
}
