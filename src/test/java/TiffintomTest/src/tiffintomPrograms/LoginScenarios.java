package TiffintomTest.src.tiffintomPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginScenarios {
	@Test
	public static void testLoginTiffintom() throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();                  

		driver.manage().window().maximize();         
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.tiffintom.net/");

		driver.findElement(By.linkText("Sign Up / Login")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("test.shiv90@yopmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.id("spantt")).click();
		  //Logout
		driver.findElement(By.xpath("//*[@id=\"topsco\"]/ul[2]/li[4]/a")).click();		 
		
		
	}
}