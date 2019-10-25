package swb.intro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mfLocatorExamplesIT {
	
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
	public void byLinkText() throws Exception {
		WebElement TextLink = driver.findElement(By.linkText("Forgotten Password"));
		System.out.println("!!!linkText!!! - " + TextLink.getText());

	}
	
	@Test
	public void byPartialLinkText() throws Exception {
		driver.findElement(By.partialLinkText("Forgotten Password"));
		driver.findElement(By.partialLinkText("Forgotten"));
		driver.findElement(By.partialLinkText("en Passwo"));
	}
	
	@Test
	public void byId() throws Exception {
		driver.findElement(By.id("change-password"));
	}
	
	@Test
	public void byXpath() throws Exception {
		WebElement TextXpath = driver.findElement(By.xpath("//a[@id='change-password']"));
		System.out.println("!!!TextXpath!!! - " + TextXpath);
	}
	
	@Test
	public void byExample() throws Exception {
		
		
	}
}

/*

  
    @Test
    public void byClassName() throws Exception {
        driver.findElement(By.className("btn"));
    }

    @Test
    public void byName() throws Exception {
        driver.findElement(By.name("email"));
    }

    @Test
    public void byTagName() throws Exception {
        driver.findElement(By.tagName("a"));
    }
}*/
