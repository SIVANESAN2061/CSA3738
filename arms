package selenium_prg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;
////import org.testng.Assert;
////import org.testng.annotations.Test;


public class armsChrome {

	public static void main(String[] args) {
		
		
		System.out.println("hai");
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
						
		driver.get("https://arms.sse.saveetha.com/");
		WebElement username=driver.findElement(By.id("txtusername"));
		
		System.out.println(username);
	
		WebElement password=driver.findElement(By.id("txtpassword"));
		System.out.println(password);
		WebElement login=driver.findElement(By.name("btnlogin"));
		
		System.out.println(login);
		username.sendKeys("");
		
		
		password.sendKeys("");
		login.click();

	}
}
