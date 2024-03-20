package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver;

	private By username = By.name("username");
	private By password = By.name("password");
	private By loginbutton = By.xpath("//button[@type='submit']");
	private By my_info = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a");
	private By Qualification = By.xpath("(//a[@class='orangehrm-tabs-item'])[8]");

	public LoginPageObjects(WebDriver driver2) {

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

}
