package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Signup_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoBlazeSignup_Stepdef {

	public WebDriver driver;

	public Signup_Page signup;

	@Given("User Launches Chrome Browser")
	public void user_launches_chrome_browser() {

		driver = new ChromeDriver();
		signup = new Signup_Page(driver);

	}

	@When("User enters URL {string}")
	public void user_enters_url(String url) {

		driver.get(url);
	}

	@When("Clicks on SignUp link")
	public void clicks_on_sign_up_link() {

		signup.clickOnsignuplink();
	
	}
	@When("Signup with new username as {string} and password as {string}")
	public void signup_with_new_username_as_and_password_as(String un, String pwd) {
		signup.enterSignupusername(un);
		
		signup.enterSignuppassword(pwd);
		
	}

	@When("Clicks on SignUp button")
	public void clicks_on_sign_up_button() throws InterruptedException {

		signup.clickonSignupButton();
		
		Thread.sleep(Duration.ofSeconds(4));
	}

	@Then("Clicks on Ok JS alert pop up")
	public void clicks_on_ok_js_alert_pop_up() {
		signup.acceptAlert();
	}

	@And("Close the browser")
	public void close_the_browser() {

		driver.quit();
	}

}
