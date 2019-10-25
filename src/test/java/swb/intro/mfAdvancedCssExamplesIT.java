package swb.intro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mfAdvancedCssExamplesIT {

    WebDriver driver;
	String exePath = "C:\\Server\\chromedriver.exe";
	
    @Before
    public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.html");
	}
	
	@After
    public void tearDown() throws Exception {
        driver.quit();
	}
	
    @Test
	public void singleAttribute() throws Exception {
		WebElement InputEmail = driver.findElement(By.cssSelector("input[name='email']"));
		System.out.println("INPUT_EMAIL - " + InputEmail.getText());
	}
	
	@Test
	public void multipleAttributes() throws Exception {
		driver.findElement(By.cssSelector("input[type='text'][name='email']"));
	}
	
	@Test
	public void attributePrefix() throws Exception {
		driver.findElement(By.cssSelector("input[name^='pass']"));
	}
	
	@Test
	public void attributeSuffix() throws Exception {
		driver.findElement(By.cssSelector("input[name$='word']"));
	}
	
	@Test
	public void attributeInfix() throws Exception {
		driver.findElement(By.cssSelector("input[name*='sswo']"));
	}
	
	@Ignore("page chaneged layout")
	@Test
	public void sibling() throws Exception {
		driver.findElement(By.cssSelector("input[name='password'] + input[type='submit']"));
	}
	
	@Ignore("page changed layout")
    @Test
    public void looseSibling() throws Exception {
        driver.findElement(By.cssSelector("input[name='email'] ~ input[type='submit']"));
    }
	
	@Test
    public void directDescendant() throws Exception {
        driver.findElement(By.cssSelector("div > input[name='email']"));
    }

    @Test
    public void anyDescendant() throws Exception {
        driver.findElement(By.cssSelector("form input[name='email']"));
    }
}