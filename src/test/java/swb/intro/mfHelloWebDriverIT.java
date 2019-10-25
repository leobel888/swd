package swb.intro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class mfHelloWebDriverIT {

    WebDriver driver;
	String exePath = "C:\\Server\\chromedriver.exe";
	

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void helloWebDriver() throws Exception {

        driver.get("http://localhost:8080/hello-webdriver.html");

        WebElement pageHeading = driver.findElement(By.tagName("h1"));

        assertEquals("Hello WebDriver!", pageHeading.getText());
    }
}