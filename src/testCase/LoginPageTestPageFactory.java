package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjectModel.LoginPageFactory;

public class LoginPageTestPageFactory {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		Thread.sleep(2000);
		PageFactory.initElements(driver, LoginPageFactory.class);
		LoginPageFactory.userName.sendKeys("vrindhanandhan139@gmail.com");
		LoginPageFactory.passWord.sendKeys("deepan@21");
		LoginPageFactory.loginButton.click();
		
		System.out.println("success");

	}

}
