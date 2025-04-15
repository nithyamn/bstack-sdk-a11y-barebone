import org.testng.annotations.Test;

public class SampleTest extends BaseTest{
    @Test
    public void test() throws Exception {
        driver.get("https://www.zeiss.com");
    }
}
