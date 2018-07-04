package emailSend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class checkmail {
	WebDriver driver;
	
	@BeforeClass (description="Hit the URL")
	public void Hit_url() {
		System.setProperty(" webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com");
	}
	
	@Test (description="Login with valid email")
	public void Login_with_valid_email() {
			driver.findElement(By.className("whsOnd zHQkBf")).click();
			driver.findElement(By.id("txtUserName")).sendKeys("akshatrai@qainfotech.com");
			driver.findElement(By.className("RveJvd snByac")).click();
		
}
	@Test (description="Login with valid password")
	public void Login_with_valid_password() {
			driver.findElement(By.className("whsOnd zHQkBf")).click();
			driver.findElement(By.id("txtUserName")).sendKeys("57snake45");
			driver.findElement(By.className("CwaK9")).click();
		
}
}
