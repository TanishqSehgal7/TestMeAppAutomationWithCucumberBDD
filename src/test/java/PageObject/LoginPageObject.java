package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class LoginPageObject {

	
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"userName\"]")
	WebElement userIdInput;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"password\"]")
	WebElement passwordInput;
	
	@FindBy(how=How.XPATH, using="/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")
	WebElement loginBtn;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"errormsg\"]")
	WebElement errorMsgForInvalidCredentials;
	
	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUserNameAndPassword(String userName, String password) {
		userIdInput.sendKeys(userName);
		passwordInput.sendKeys(password);
	}
	
//	public void enterPassword(String password) {
//		passwordInput.sendKeys(password);
//	}
	
	public void clickLoginButton() {
		loginBtn.click();
	}
	
	public void errorMsgOnInvalidCredentials() {
		if (errorMsgForInvalidCredentials.isDisplayed()) {
			System.out.println("Error Message for Invalid Credentials is displayed successfully!");
		}
	}
	
}
