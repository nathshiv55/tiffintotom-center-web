package TiffintomTest.src.tiffintomPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTiffintom {
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
	     
	     
	     
	     
	      driver.findElement(By.xpath("//*[@id=\"location_id\"]")).sendKeys("WS1");
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//div[1]/form[1]/div[1]/div[2]/button[1]/b[1]")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("//div[1]/a[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
	      driver.findElement(By.xpath("//div[2]/div[1]/div[2]/div[2]/div[2]/a[1]/img[1]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[1]/div[4]/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div[2]/a[1]/img[1]")).click();
		    //*[@id="tttsss"]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/a/img
		      driver.findElement(By.xpath("//*[@id=\"tttsss\"]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/a/img")).click();
	      
	      Thread.sleep(4000);
	      //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      driver.findElement(By.xpath("//div[@id='cartDetails']/div[@id='cartydetails2']/div[@id='deliveryTotal']/button[@id='submitBtn']")).click();
	      Thread.sleep(2000);
	     
	     ///driver.findElement(By.xpath("//*[@id=\"dddelivery1\"]/button")).click();
	      
	      //driver.findElement(By.id("title")).sendKeys("Office");
	      //driver.findElement(By.id("flatno")).sendKeys("A/96");
	      //driver.findElement(By.id("zipcode")).sendKeys("WS1");
	      //driver.findElement(By.id("getZipcode")).click();
	      //Thread.sleep(2000);
	      //driver.findElement(By.xpath("//*[@id=\"add_address_modal\"]/div/div/div[2]/div[9]/div/button")).click();
	      //Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id='addressaddPopup']/div[1]/div[1]/div[3]/button[1]")).click();
	      Thread.sleep(9000);
	      //driver.findElement(By.xpath("//*[@id=\"paymentInfo\"]/div/label[3]/span")).click();
	      driver.findElement(By.xpath("//*[@id='payment_content']/div[2]/span[1]/button[1]\r\n"
	      		+ "")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[@id='card-element']/div[@class='__PrivateStripeElement']/iframe")).sendKeys("4242 4242 4242 4242 02/32 897");
	      driver.findElement(By.xpath("//*[@id=\"payment-form\"]/button")).click();
	      Thread.sleep(8000);
	      driver.findElement(By.id("totalOrderAmts")).click();
	      Thread.sleep(7000);
	      //driver.close();
	     
	      driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
	      Thread.sleep(2000);
	      
	      
	      
	      
	      
	      driver.findElement(By.xpath("//*[@id=\"location_id\"]")).sendKeys("WS1");
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//div[1]/form[1]/div[1]/div[2]/button[1]/b[1]")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("//div[1]/a[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
	      driver.findElement(By.xpath("//div[2]/div[1]/div[2]/div[2]/div[2]/a[1]/img[1]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[1]/div[4]/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div[2]/a[1]/img[1]")).click();
		    //*[@id="tttsss"]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/a/img
		      driver.findElement(By.xpath("//*[@id=\"tttsss\"]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/a/img")).click();
	      Thread.sleep(3000);
	      //driver.findElement(By.id("spantt")).click();
	      driver.findElement(By.xpath("//div[@id='cartDetails']/div[@id='cartydetails2']/div[@id='deliveryTotal']/button[@id='submitBtn']")).click();
	      Thread.sleep(2000);
	     
	     ///driver.findElement(By.xpath("//*[@id=\"dddelivery1\"]/button")).click();
	      
	      //driver.findElement(By.id("title")).sendKeys("Office");
	      //driver.findElement(By.id("flatno")).sendKeys("A/96");
	      //driver.findElement(By.id("zipcode")).sendKeys("WS1");
	      //driver.findElement(By.id("getZipcode")).click();
	      //Thread.sleep(2000);
	      //driver.findElement(By.xpath("//*[@id=\"add_address_modal\"]/div/div/div[2]/div[9]/div/button")).click();
	      //Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id='addressaddPopup']/div[1]/div[1]/div[3]/button[1]")).click();
	      Thread.sleep(9000);
	      //driver.findElement(By.xpath("//*[@id=\"paymentInfo\"]/div/label[3]/span")).click();
	      driver.findElement(By.xpath("//*[@id='payment_content']/div[2]/span[1]/button[1]\r\n"
	      		+ "")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[@id='card-element']/div[@class='__PrivateStripeElement']/iframe")).sendKeys("4000 0000 0000 3220 08/33 566");
	      driver.findElement(By.xpath("//*[@id=\"payment-form\"]/button")).click();
	      Thread.sleep(8000);
	      driver.findElement(By.id("totalOrderAmts")).click();
	     Thread.sleep(7000);
	      //driver.findElement(By.xpath("//html/body/div[3]/div[2]/form[2]/button")).click();
	      
	      Thread.sleep(15000);
	      //driver.close();
	     
	      driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
	     
	      
	      
	      
	      driver.findElement(By.xpath("//*[@id=\"location_id\"]")).sendKeys("WS1");
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//div[1]/form[1]/div[1]/div[2]/button[1]/b[1]")).click();
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("//div[1]/a[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
	      driver.findElement(By.xpath("//div[2]/div[1]/div[2]/div[2]/div[2]/a[1]/img[1]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[1]/div[4]/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div[2]/a[1]/img[1]")).click();
		    //*[@id="tttsss"]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/a/img
		      driver.findElement(By.xpath("//*[@id=\"tttsss\"]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/a/img")).click();
	      Thread.sleep(3000);
	      //driver.findElement(By.id("spantt")).click();
	      driver.findElement(By.xpath("//div[@id='cartDetails']/div[@id='cartydetails2']/div[@id='deliveryTotal']/button[@id='submitBtn']")).click();
	      Thread.sleep(2000);
	     
	     ///driver.findElement(By.xpath("//*[@id=\"dddelivery1\"]/button")).click();
	      
	      //driver.findElement(By.id("title")).sendKeys("Office");
	      //driver.findElement(By.id("flatno")).sendKeys("A/96");
	      //driver.findElement(By.id("zipcode")).sendKeys("WS1");
	      //driver.findElement(By.id("getZipcode")).click();
	      //Thread.sleep(2000);
	      //driver.findElement(By.xpath("//*[@id=\"add_address_modal\"]/div/div/div[2]/div[9]/div/button")).click();
	      //Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id='addressaddPopup']/div[1]/div[1]/div[3]/button[1]")).click();
	      Thread.sleep(9000);
	      //driver.findElement(By.xpath("//*[@id=\"paymentInfo\"]/div/label[3]/span")).click();
	      driver.findElement(By.xpath("//*[@id='payment_content']/div[2]/span[1]/button[1]\r\n"
	      		+ "")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[@id='card-element']/div[@class='__PrivateStripeElement']/iframe")).sendKeys("4000 0000 0000 3063 05/34 345");
	      driver.findElement(By.xpath("//*[@id=\"payment-form\"]/button")).click();
	      Thread.sleep(8000);
	      driver.findElement(By.id("totalOrderAmts")).click();
	      Thread.sleep(18000);
	      
	      
	      driver.close();
	      
	      
	     
	     }

}
