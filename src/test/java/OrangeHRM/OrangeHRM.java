package OrangeHRM;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class OrangeHRM {
	 WebDriver driver = new ChromeDriver();
	 @Test
	 public void firstpage() throws InterruptedException {
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
		    Thread.sleep(3000);
		    String ExpectedReasult="Login";
			String ActualReasult=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5")).getText();
		    assertEquals( ActualReasult, ExpectedReasult);
		    System.out.println("Login page is visible");
	 }
	@AfterTest
	public void Login() throws InterruptedException {
		WebElement UserName= driver.findElement(By.cssSelector("input[placeholder='Username']"));
		UserName.sendKeys("Admin");
		WebElement Password= driver.findElement(By.cssSelector("input[name='password']"));
		Password.sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
		String expectedReasult= "Dashboard";
	    String actualReasult= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	  assertEquals(expectedReasult, actualReasult);
	    System.out.println("Dashboard is visible");
	}
	@AfterTest
	public void myInfo() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")).click();
//		String ExpectedReasult="PIM";
//		String actualReasult=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
//		assertEquals(ExpectedReasult, actualReasult);
//		System.out.println("PIM is visible");
		Thread.sleep(3000);
		}
//	@AfterTest
//	public void Qualification() {
//		driver.findElement(By.xpath("(//a[@class='orangehrm-tabs-item'])[8]")).click();
//		
//	
//	}
	
	

}
