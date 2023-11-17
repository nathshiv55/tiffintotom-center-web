package TiffintomTest.src.tiffintomPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUp {
	  @Test
		public static void testSignup() throws Exception {
			// TODO Auto-generated method stub
			 WebDriver driver = new ChromeDriver();                  
	         
		      driver.manage().window().maximize();         
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		      driver.get("https://www.tiffintom.net/");
	
		      driver.findElement(By.linkText("Sign Up / Login")).click();
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		      Thread.sleep(1000);
		      driver.findElement(By.xpath("//*[@id=\"login\"]/form/a/span")).click();
		      driver.findElement(By.name("first_name")).sendKeys("Shiv");
		      driver.findElement(By.name("last_name")).sendKeys("Nath");
		      driver.findElement(By.name("email")).sendKeys("test.shiv2002@yopmail.com");
		      driver.findElement(By.name("phone_number")).sendKeys("0700000000");
		      driver.findElement(By.id("CustomerPassword")).sendKeys("123456");
		      driver.findElement(By.id("UserConfirPassword")).sendKeys("123456");
		      Thread.sleep(30000);
		      driver.findElement(By.xpath("//*[@id=\"login\"]/div/button")).click();   
		      
		      Thread.sleep(5000);
		    //Logout
				driver.findElement(By.xpath("//*[@id=\"topsco\"]/ul[2]/li[3]/a")).click();		      
	  }
	
}
