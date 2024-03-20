package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjectModel.LoginPageObjects;

public class BaseClass {

	public static WebDriver driver;

	public void driverInitialize() throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Pradeep\\eclipse-workspace\\OrangeHRM\\src\\main\\java\\resources\\data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			LoginPageObjects lpo = new LoginPageObjects(driver);
			lpo.enterUserName().sendKeys("Admin");
			lpo.enterPassword().sendKeys("admin123");
			lpo.clickOnLoginButton().click();

		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		else {
			System.out.println("Please check that you have a correct browser");
		}

	}
}
