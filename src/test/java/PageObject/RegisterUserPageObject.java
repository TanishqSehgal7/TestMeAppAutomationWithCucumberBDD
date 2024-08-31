package PageObject;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import junit.framework.Assert;

public class RegisterUserPageObject {
	
	
	WebDriver driver;
	
	@FindBy(how = How.LINK_TEXT, using="SignUp")
	WebElement signupLinkBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"userName\"]")
	WebElement userNameInput;

	@FindBy(how = How.XPATH, using = "//*[@id=\"firstName\"]")
	WebElement firstNameInput;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"lastName\"]")
	WebElement lastNameInput;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement passwordInput;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"pass_confirmation\"]")
	WebElement confirmPasswordInput;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"gender\"]")
	WebElement genderInput;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"emailAddress\"]")
	WebElement emailInput;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"mobileNumber\"]")
	WebElement mobileInput;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"dob\"]")
	WebElement dobInput;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement addressInput;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"securityQuestion\"]")
	WebElement securityQuesInput;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"answer\"]")
	WebElement securityAnsInput;
	
	@FindBy(how = How.XPATH, using = "/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")
	WebElement registerBtn;
	
	public RegisterUserPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void navigateToLoginPage() throws InterruptedException {
		Assert.assertEquals(driver.getTitle(), "Login");
		Thread.sleep(2000);
	}
	
	public void navigateToSignUpPage() {
		signupLinkBtn.click();
	}
	
	public void enterUserName(String username) {
		userNameInput.sendKeys(username);
	}
	
	public void enterFirstNameInRegisterPage(String firstName) {
		firstNameInput.sendKeys(firstName);
		
	}
	
	public void enterLastNameInRegisterPage(String lastName) {
		lastNameInput.sendKeys(lastName);
	}
	
	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}
	
	public void enterConfirmPassword(String confirmPassword) {
		confirmPasswordInput.sendKeys(confirmPassword);
	}
	
	public void enterGender(String gender) {
		genderInput.sendKeys(gender);
	}
	
	public void enterEmail(String email) {
		emailInput.sendKeys(email);
	}
	
	public void enterMobileNumber(String mobileNo) {
		mobileInput.sendKeys(mobileNo);
	}
	
	public void enterDOB(String dob) {
		dobInput.sendKeys(dob);
	}
	
	public void enterAddress(String address) {
		addressInput.sendKeys(address);
	}
	
	public void enterSecurityQues(String ques) {
		securityQuesInput.sendKeys(ques);
	}
	
	public void enterSecurityAns(String ans) {
		securityAnsInput.sendKeys(ans);
	}
	
	public void clickRegisterBtnAfterFillingDetails() {
		registerBtn.click();
	}
	
}
