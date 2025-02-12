//package stepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class loginSteps {
//
//	WebDriver driver = null;
//
//	@Given("user is on login page")
//	public void user_is_on_login_page() throws InterruptedException {
//
//		driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		Thread.sleep(2000);
//
//	}
//
//	@When("user enters correct username {string} and correct password {string}")
//	public void user_enters_correct_username_and_correct_password(String username, String password)
//			throws InterruptedException {
//		driver.findElement(By.name("user-name")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//		Thread.sleep(2000);
//	}
//
//	@And("user clicks on submit button")
//	public void user_clicks_on_submit_button() throws InterruptedException {
//		driver.findElement(By.name("login-button")).click();
//		Thread.sleep(2000);
//
//		
//	}
//
//	@Then("user should be on homepage and quits the browser")
//	public void user_should_be_on_homepage_and_quits_the_browser() throws InterruptedException {
//		String curr_url = driver.getCurrentUrl();
//		String actl_url = "https://www.saucedemo.com/inventory.html";
//
//		if (actl_url.equals(curr_url)) {
//			System.out.println("Meeting as expected");
//		}
//
//		else {
//
//			System.out.println("Not meeting as exxpected");
//		}
//		Thread.sleep(2000);
//
//		driver.quit();
//	}
//
//}
