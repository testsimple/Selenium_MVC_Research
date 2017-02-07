package toolsqa.com.tests;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public abstract class AbstractTest extends AbstractTestNGSpringContextTests {

    @Autowired
    protected WebDriver webDriver;

}
