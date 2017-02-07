package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    /*
     * Return a browser instance based on parameters
     */
    public static WebDriver getInstance(String inBrowserType) {
        String browserDriverPath = String.format("%s\\browsers\\", System.getProperty("user.dir"));
        WebDriver driver = null;

        switch (inBrowserType) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", browserDriverPath + "\\chromedriver.exe");
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;
        }
        if (driver != null) driver.manage().window().maximize();

        return driver;
    }

}
