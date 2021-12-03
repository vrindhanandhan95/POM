package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageFactory {
	
	@FindBy(name="email")
	public static WebElement userName;
	
	@FindBy(name="password")
	public static WebElement passWord;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")
	public static WebElement loginButton;
	
	

}
