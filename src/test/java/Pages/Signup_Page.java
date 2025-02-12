package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup_Page {

	WebDriver driver;

	public Signup_Page(WebDriver ldriver) {

		driver = ldriver;

		PageFactory.initElements(ldriver, this);
	}

	@FindBy(id = "signin2")
	WebElement signup_link;

	@FindBy(id = "sign-username")
	WebElement signup_username;

	@FindBy(id = "sign-password")
	WebElement signup_password;

	@FindBy(xpath = "//button[normalize-space()='Sign up']")
	WebElement signup_button;
	

	public void clickOnsignuplink() {

		signup_link.click();
	}

	public void enterSignupusername(String username) {

		signup_username.sendKeys(username);
	}

	public void enterSignuppassword(String password) {
		signup_password.sendKeys(password);
	}

	public void clickonSignupButton() {
		signup_button.click();
	}
	
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}


}
