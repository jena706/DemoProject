package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QualificationsPageObjects {

	public WebDriver driver;

	private By username = By.name("username");
	private By password = By.name("password");
	private By loginbutton = By.xpath("//button[@type='submit']");
	private By my_info = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a");
	private By Qualification = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[9]/a");
	private By Experince = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/button");
	private By comapny = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input");
	private By job_title = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input");
	private By calendar1 = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/div/div/input");
	private By save = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[4]/button[2]");
	public QualificationsPageObjects(WebDriver driver2) {
    
		this.driver = driver2;
	}

	public WebElement enterUserName() {
		return driver.findElement(username);
	}

	public WebElement enterPassword() {
		return driver.findElement(password);
	}

	public WebElement clickOnLoginButton() {
		return driver.findElement(loginbutton);
	}

	public WebElement clickOnMyInfobutton() {
		return driver.findElement(my_info);

	}

	public WebElement ClickOnQulificationButton() {
		return driver.findElement(Qualification);

	}

	public WebElement AddExperince() {
		return driver.findElement(Experince);

	}

	public WebElement ClickCompany() {
		return driver.findElement(comapny);
	}

	public WebElement JobTitle() {
		return driver.findElement(job_title);
	}

	public WebElement Calendar1() {
		return driver.findElement(calendar1);
		
	}
	public WebElement Save () {
		return driver.findElement(save);
	}

  	
}
