

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login
{
	WebDriver driver;
	By email=By.id("email");
	By pass=By.id("pass");
	By Login=By.id("send2");
	public Login(WebDriver driver) {
	this.driver = driver;
	}
public void typeEmail(String username) 
{
	driver.findElement(email).sendKeys(username);
}	
public void typepwd(String pwd) 
{
	driver.findElement(pass).sendKeys(pwd);
}
public void ClickOnLogin() 
{
driver.findElement(Login).click();

}

}
