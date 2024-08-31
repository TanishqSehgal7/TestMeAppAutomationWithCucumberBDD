package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import PageObject.RegisterUserPageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterUserStepDefinition {
	
	WebDriver driver;
	RegisterUserPageObject registerUser;
	
	@Given("Alex Opens TestMeApp Register page")
	public void alex_opens_test_me_app_register_page() {
	    System.setProperty("webdriver.chrome.driver", 
	    "C://Users//Tanishq Sehgal//eclipse-workspace-new//CucumberTestMeAppImplementation//src//test//java//WebDrivers");
	    
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	    driver.findElement(By.linkText("SignUp")).click();
	    registerUser = new RegisterUserPageObject(driver);
	    Assert.assertEquals(driver.getTitle(), "Sign Up");
	}

	@When("Alex Enters username as {string}")
	public void alex_enters_username_as(String string) {
		registerUser.enterUserName(string);
	}

	@When("Enters firstname as {string}")
	public void enters_firstname_as(String string) {
		registerUser.enterFirstNameInRegisterPage(string);
	}

	@When("Enters lastname as {string}")
	public void enters_lastname_as(String string) {
		registerUser.enterLastNameInRegisterPage(string);
	}

	@When("Enters password as {string}")
	public void enters_password_as(String string) {
		registerUser.enterPassword(string);
	}

	@When("Enters confirm password as {string}")
	public void enters_confirm_password_as(String string) {
		registerUser.enterConfirmPassword(string);
	}

	@When("Enters the Gender as {string}")
	public void enters_the_gender_as(String string) {
		registerUser.enterGender(string);
	}

	@When("Enters email address as {string}")
	public void enters_email_address_as(String string) {
		registerUser.enterEmail(string);
	}

	@When("Enters mobile number as {string}")
	public void enters_mobile_number_as(String string) {
		registerUser.enterMobileNumber(string);
	}

	@When("Enters date of birth as {string}")
	public void enters_date_of_birth_as(String string) {
		registerUser.enterDOB(string);
	}

	@When("Enters address as {string}")
	public void enters_address_as(String string) {
		registerUser.enterAddress(string);
	}

	@When("Selects the security question as {string}")
	public void selects_the_security_question_as(String string) {
		registerUser.enterSecurityQues(string);
	}

	@When("Enters the answer as {string}")
	public void enters_the_answer_as(String string) {
		registerUser.enterSecurityAns(string);
	}

	@When("Clicks on Register button")
	public void clicks_on_register_button() throws InterruptedException {
		registerUser.clickRegisterBtnAfterFillingDetails();
		Thread.sleep(2000);
	}

	@Then("Alex is successfully registered")
	public void alex_is_successfully_registered() {
		Assert.assertEquals(driver.getTitle(),"Login");
	}
}
