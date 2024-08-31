package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import PageObject.LoginPageObject;
import PageObject.RegisterUserPageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginScenarioStepDefinition {

	
	WebDriver driver;
	LoginPageObject login;
	
	@Given("User Navigates to Login page")
	public void user_enters_to_login_page() {
		
		System.setProperty("webdriver.chrome.driver", 
			    "C://Users//Tanishq Sehgal//eclipse-workspace-new//CucumberTestMeAppImplementation//src//test//java//WebDrivers");
			    
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		login = new LoginPageObject(driver);
		Assert.assertEquals(driver.getTitle(), "SignIn");
	}
	
	
	@When("user enters user valid id as {string} and valid password as {string}")
	public void user_enters_user_valid_id_as_and_valid_password_as(String string, String string2) {
		login.enterUserNameAndPassword(string,string2);
	}
	
	@When("Clicks on the Login button")
	public void clicks_on_the_login_button() {
		//login.clickLoginButton();
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}
	
	@Then("User is logged in and navigated to Home page")
	public void user_is_logged_in_and_navigated_to_home_page() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Home");
	}

	@When("user enters user id as invalid {string} and invalid password as {string}")
	public void user_enters_user_id_as_invalid_and_invalid_password_as(String string, String string2) {
		login.enterUserNameAndPassword(string,string2);

//		driver.findElement(By.xpath("//*[@id=\\\"userName\\\"]")).sendKeys(string);
//		driver.findElement(By.xpath("//*[@id=\\\"password\\\"]")).sendKeys(string2);
	}
	
	@Then("Appropriate error message shows up on the screen stating that credentials are invalid.")
	public void appropriate_error_message_shows_up_on_the_screen_stating_that_credentials_are_invalid() {
		login.errorMsgOnInvalidCredentials();
	}
}
