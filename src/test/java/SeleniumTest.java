import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class SeleniumTest {

    @Test(groups = {"selenium", "allTests"})
    public void SeleniumTest1(){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("headless");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://google.com");
        assertThat("", driver.getTitle(), equalTo("Google"));
        driver.quit();

    }
}
