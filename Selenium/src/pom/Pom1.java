package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
@FindBy(id="email")
private WebElement username;
@FindBy(xpath="//input[@type='password']")
private WebElement password;
@FindBy(xpath="//button[@name='login']")
private WebElement login;
public Pom1(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void setUsername(String un)
{
	username.sendKeys(un);
}
public void setPassword(String pwd)
{
	password.sendKeys(pwd);
}
public void ClickLogin()
{
login.click();	
}


}
