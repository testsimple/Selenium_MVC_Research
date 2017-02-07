package toolsqa.com.tests;

import org.testng.annotations.*;


public class HomePageTest extends AbstractTest {

    @BeforeClass
    public void initTest() {
        webDriver.get("http://toolsqa.com/");
    }

    @AfterClass
    public void cleanTest() {
        // TODO
    }

    @BeforeMethod
    public void beforeTestCase() {
        // TODO
    }

    @AfterMethod
    public void afterTestCase() {
        // TODO
    }

    @Test
    public void testFlow1() {
        System.out.println("This is a test case of test flow #1");
    }

}
