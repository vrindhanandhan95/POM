package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {
	
	public static WebElement signUp(WebDriver driver)
	{
		return driver.findElement(By.linkText("Signup"));
	}
	
	public static WebElement firstName(WebDriver driver) 
	{
		return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input"));
	}
	public static WebElement lastName(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[2]/div/input"));
	}
	public static WebElement phoneNumber(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/div/input"));
	}
	public static WebElement email(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[4]/div/input"));
	}
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[5]/div/input"));
	}
	public static WebElement accountType(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='account_type']"));
		///html/body/span/span/span[2]
	}
}
