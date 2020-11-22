package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StetpsDef {

	WebDriver driver;
	String expectedto;
	String actualTo;

	@Given("^user is  on homepage$")
	public void user_is_on_homepage() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Fitaomr3\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {
		driver.get("https://www.redbus.in/");
	}

	@When("^user enters username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_enters_username_and_Password(String username, String pwd) throws Throwable {
		
		System.out.println("username" +username+ "password" +pwd);
		expectedto = "tO";

		actualTo = driver.findElement(By.xpath("//label[contains(text(),'TO')]")).getText();
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		if (expectedto.equalsIgnoreCase(actualTo)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		driver.close();
	}

}
