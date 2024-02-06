package demoProject1.demoProject1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {

	public static ChromeDriver driver;

	@BeforeMethod
	public void launchDriver() {
		// System.setProperty("webdriver.chrome.driver", "");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@Test
	public void Test1() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("TEST1 Title is : " + driver.getTitle());
	}

	@Test
	public void Test2() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("TEST2 Title is : " + driver.getTitle());
	}

	@Test
	public void Test3() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("TEST3 Title is : " + driver.getTitle());
	}

}
