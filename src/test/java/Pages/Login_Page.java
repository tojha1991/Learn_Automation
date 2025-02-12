//package Pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class Login_Page {
//
//	WebDriver driver;
//
//	public Login_Page(WebDriver pdriver) {
//		driver=pdriver;
//		PageFactory.initElements(pdriver, this);
//	}
//	
//	@FindBy(id = "login2")
//	WebElement SignIn_link;
//	
//	@FindBy(id = "loginusername")
//	WebElement enter_username;
//	
//	@FindBy(id = "loginpassword")
//	WebElement enter_password;
//	
//	
//	@FindBy(xpath = "//button[normalize-space()='Log in']")
//	WebElement login_button;
//	
//	@FindBy(id = "nameofuser")
//	WebElement loggedin_user;
//	
//	@FindBy(id = "logout2")
//	WebElement loggedout_user;
//	
//	public void clickonSignInLink() {
//		SignIn_link.click();
//	}
//	
//	public void enterUserName() {
//		enter_username.click();
//	}
//	
//	public void enterPassword() {
//		enter_password.click();
//	}
//	
//	public void click_login_button() {
//		login_button.click();
//	}
//	
//	public void check_loggedin_username() {
//		loggedin_user.isDisplayed();
//	}
//	
//
//	public void click_On_Logout() {
//		loggedout_user.click();
//	}
//}
