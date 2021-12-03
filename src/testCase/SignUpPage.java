package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjectModel.SignUpPageObject;

public class SignUpPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		
		SignUpPageObject.signUp(driver).click();
		
		SignUpPageObject.firstName(driver).sendKeys("Vrindha Nandhan");
		SignUpPageObject.lastName(driver).sendKeys("Anandhakumar");
		SignUpPageObject.phoneNumber(driver).sendKeys("7010151710");
		SignUpPageObject.email(driver).sendKeys("vrindhanandhan139@gmail.com");
		SignUpPageObject.password(driver).sendKeys("Deepan");
		
		Select select = new Select((WebElement) SignUpPageObject.accountType(driver));
		select.selectByIndex(1);


}
}
