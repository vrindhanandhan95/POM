package testCase;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjectModel.LoginPageObject;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/login");

		LoginPageObject.userName(driver).sendKeys("vrindhanandhan139@gmailcom");
		LoginPageObject.passWord(driver).sendKeys("vrindha");
		
		
		//Explicit wait
		//		WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeClickable(LoginPageObject.loginButton(driver)));
		
		//Fluent wait
		
		Wait<WebDriver> wait =  new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(20))
				.ignoring(NoSuchElementException.class);
		
		WebElement oject= wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
			}
			
		});
		
		LoginPageObject.loginButton(driver).click();
		
		driver.quit();

	}

}
