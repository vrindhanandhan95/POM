package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public static WebElement userName(WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input"));
		
	}
	
	public static WebElement  passWord(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input"));
	}
	public static WebElement loginButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
	}
//	public static WebElement signUpButton(WebDriver driver)
//	{
//		//return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/div/div/a"));
//		return driver.findElement(By.linkText("Signup"));
//		
//		
//	}
	public static WebElement signUpButton(WebDriver driver)
	{
		return driver.findElement(By.linkText("Signup"));
	
	}

}
